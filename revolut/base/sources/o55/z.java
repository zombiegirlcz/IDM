package o55;

import com.revolut.feature.credit.loan.api.models.rev10.LoanDocument;
import com.revolut.feature.credit.loan.api.models.rev10.LoanDocuments;
import com.revolut.feature.credit.loan.impl.network.LoanService;
import java.time.ZoneId;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.BERTags;

/* JADX INFO: loaded from: classes13.dex */
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LoanService f222381a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xx4.d f222382b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final xx4.e f222383c;
    public final ecm.q d;
    public final mp.r e;
    public final r10.f f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final w4l.f f222384g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final w4l.f f222385h;
    public final w4l.f i;

    public z(LoanService api2, xx4.d memoryCache, xx4.e storage, ecm.q agreementsDtoMapper, mp.r loanDocumentsMapper, r10.f networkUrlBuilder) {
        Intrinsics.checkNotNullParameter(api2, "api");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(agreementsDtoMapper, "agreementsDtoMapper");
        Intrinsics.checkNotNullParameter(loanDocumentsMapper, "loanDocumentsMapper");
        Intrinsics.checkNotNullParameter(networkUrlBuilder, "networkUrlBuilder");
        this.f222381a = api2;
        this.f222382b = memoryCache;
        this.f222383c = storage;
        this.d = agreementsDtoMapper;
        this.e = loanDocumentsMapper;
        this.f = networkUrlBuilder;
        final int i = 0;
        Function2 function2 = new Function2(this) { // from class: o55.x

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ z f222378b;

            {
                this.f222378b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        a key = (a) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(key, "key");
                        z zVar = this.f222378b;
                        efm.d0<rx4.b> loanAgreementsList = zVar.f222381a.getLoanAgreementsList(key.f222313a);
                        o4a.e eVar = new o4a.e(20, new o54.a(zVar, key, 3));
                        loanAgreementsList.getClass();
                        ufm.i iVar = new ufm.i(loanAgreementsList, eVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 1:
                        a key2 = (a) obj2;
                        ux4.b agreements = (ux4.b) obj3;
                        Intrinsics.checkNotNullParameter(key2, "key");
                        Intrinsics.checkNotNullParameter(agreements, "agreements");
                        this.f222378b.f222383c.b(key2, tx4.a.b(agreements));
                        return Unit.f186387a;
                    case 2:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        f key3 = (f) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(key3, "key");
                        z zVar2 = this.f222378b;
                        efm.d0<rx4.b> forbearanceAgreements = zVar2.f222381a.getForbearanceAgreements(key3.f222332a);
                        o4a.e eVar2 = new o4a.e(19, new o54.a(zVar2, key3, 2));
                        forbearanceAgreements.getClass();
                        ufm.i iVar2 = new ufm.i(forbearanceAgreements, eVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 3:
                        f key4 = (f) obj2;
                        ux4.b agreements2 = (ux4.b) obj3;
                        Intrinsics.checkNotNullParameter(key4, "key");
                        Intrinsics.checkNotNullParameter(agreements2, "agreements");
                        this.f222378b.f222383c.b(key4, tx4.a.b(agreements2));
                        return Unit.f186387a;
                    case 4:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        e key5 = (e) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(key5, "key");
                        z zVar3 = this.f222378b;
                        efm.d0<i55.k> loanDocuments = zVar3.f222381a.getLoanDocuments(key5.f222330a);
                        o4a.e eVar3 = new o4a.e(18, new o54.a(zVar3, key5, 1));
                        loanDocuments.getClass();
                        ufm.i iVar3 = new ufm.i(loanDocuments, eVar3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return iVar3;
                    default:
                        e key6 = (e) obj2;
                        LoanDocuments documentSections = (LoanDocuments) obj3;
                        Intrinsics.checkNotNullParameter(key6, "key");
                        Intrinsics.checkNotNullParameter(documentSections, "documentSections");
                        xx4.e eVar4 = this.f222378b.f222383c;
                        Intrinsics.checkNotNullParameter(documentSections, "<this>");
                        ArrayList<LoanDocument> arrayList = documentSections.f70157b;
                        ArrayList arrayList2 = new ArrayList(zhm.w.t(arrayList, 10));
                        for (LoanDocument loanDocument : arrayList) {
                            String str = loanDocument.f70153a;
                            String str2 = loanDocument.f70154b;
                            String str3 = loanDocument.f70155c;
                            long j2 = loanDocument.d;
                            ZoneId zoneIdSystemDefault = ZoneId.systemDefault();
                            Intrinsics.checkNotNullExpressionValue(zoneIdSystemDefault, "systemDefault(...)");
                            String string = pu7.a.M(j2, zoneIdSystemDefault).toString();
                            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                            arrayList2.add(new i55.j(str, str2, str3, string, loanDocument.e));
                        }
                        eVar4.b(key6, new i55.k(arrayList2));
                        return Unit.f186387a;
                }
            }
        };
        int i2 = 0;
        ald.o oVar = new ald.o(1, memoryCache, xx4.d.class, "get", "get(Lcom/revolut/feature/credit/core/storage/MemoryCacheKey;)Ljava/lang/Object;", i2, 13);
        jki.d dVar = new jki.d(2, memoryCache, xx4.d.class, "set", "set(Lcom/revolut/feature/credit/core/storage/MemoryCacheKey;Ljava/lang/Object;)V", i2, 7);
        final int i3 = 0;
        Function1 function1 = new Function1(this) { // from class: o55.y

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ z f222380b;

            {
                this.f222380b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i3) {
                    case 0:
                        a key = (a) obj2;
                        Intrinsics.checkNotNullParameter(key, "key");
                        z zVar = this.f222380b;
                        rx4.b bVar = (rx4.b) zVar.f222383c.a(key);
                        if (bVar != null) {
                            return zVar.d.m(bVar, key.a());
                        }
                        return null;
                    case 1:
                        f key2 = (f) obj2;
                        Intrinsics.checkNotNullParameter(key2, "key");
                        z zVar2 = this.f222380b;
                        rx4.b bVar2 = (rx4.b) zVar2.f222383c.a(key2);
                        if (bVar2 != null) {
                            return zVar2.d.m(bVar2, key2.a());
                        }
                        return null;
                    default:
                        e key3 = (e) obj2;
                        Intrinsics.checkNotNullParameter(key3, "key");
                        z zVar3 = this.f222380b;
                        i55.k kVar = (i55.k) zVar3.f222383c.a(key3);
                        if (kVar != null) {
                            return zVar3.e.r(kVar, key3.a());
                        }
                        return null;
                }
            }
        };
        final int i5 = 1;
        this.f222384g = new w4l.f(function2, oVar, dVar, function1, new Function2(this) { // from class: o55.x

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ z f222378b;

            {
                this.f222378b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i5) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        a key = (a) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(key, "key");
                        z zVar = this.f222378b;
                        efm.d0<rx4.b> loanAgreementsList = zVar.f222381a.getLoanAgreementsList(key.f222313a);
                        o4a.e eVar = new o4a.e(20, new o54.a(zVar, key, 3));
                        loanAgreementsList.getClass();
                        ufm.i iVar = new ufm.i(loanAgreementsList, eVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 1:
                        a key2 = (a) obj2;
                        ux4.b agreements = (ux4.b) obj3;
                        Intrinsics.checkNotNullParameter(key2, "key");
                        Intrinsics.checkNotNullParameter(agreements, "agreements");
                        this.f222378b.f222383c.b(key2, tx4.a.b(agreements));
                        return Unit.f186387a;
                    case 2:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        f key3 = (f) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(key3, "key");
                        z zVar2 = this.f222378b;
                        efm.d0<rx4.b> forbearanceAgreements = zVar2.f222381a.getForbearanceAgreements(key3.f222332a);
                        o4a.e eVar2 = new o4a.e(19, new o54.a(zVar2, key3, 2));
                        forbearanceAgreements.getClass();
                        ufm.i iVar2 = new ufm.i(forbearanceAgreements, eVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 3:
                        f key4 = (f) obj2;
                        ux4.b agreements2 = (ux4.b) obj3;
                        Intrinsics.checkNotNullParameter(key4, "key");
                        Intrinsics.checkNotNullParameter(agreements2, "agreements");
                        this.f222378b.f222383c.b(key4, tx4.a.b(agreements2));
                        return Unit.f186387a;
                    case 4:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        e key5 = (e) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(key5, "key");
                        z zVar3 = this.f222378b;
                        efm.d0<i55.k> loanDocuments = zVar3.f222381a.getLoanDocuments(key5.f222330a);
                        o4a.e eVar3 = new o4a.e(18, new o54.a(zVar3, key5, 1));
                        loanDocuments.getClass();
                        ufm.i iVar3 = new ufm.i(loanDocuments, eVar3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return iVar3;
                    default:
                        e key6 = (e) obj2;
                        LoanDocuments documentSections = (LoanDocuments) obj3;
                        Intrinsics.checkNotNullParameter(key6, "key");
                        Intrinsics.checkNotNullParameter(documentSections, "documentSections");
                        xx4.e eVar4 = this.f222378b.f222383c;
                        Intrinsics.checkNotNullParameter(documentSections, "<this>");
                        ArrayList<LoanDocument> arrayList = documentSections.f70157b;
                        ArrayList arrayList2 = new ArrayList(zhm.w.t(arrayList, 10));
                        for (LoanDocument loanDocument : arrayList) {
                            String str = loanDocument.f70153a;
                            String str2 = loanDocument.f70154b;
                            String str3 = loanDocument.f70155c;
                            long j2 = loanDocument.d;
                            ZoneId zoneIdSystemDefault = ZoneId.systemDefault();
                            Intrinsics.checkNotNullExpressionValue(zoneIdSystemDefault, "systemDefault(...)");
                            String string = pu7.a.M(j2, zoneIdSystemDefault).toString();
                            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                            arrayList2.add(new i55.j(str, str2, str3, string, loanDocument.e));
                        }
                        eVar4.b(key6, new i55.k(arrayList2));
                        return Unit.f186387a;
                }
            }
        }, null, null, null, BERTags.FLAGS);
        final int i6 = 2;
        final int i21 = 1;
        final int i22 = 3;
        this.f222385h = new w4l.f(new Function2(this) { // from class: o55.x

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ z f222378b;

            {
                this.f222378b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i6) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        a key = (a) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(key, "key");
                        z zVar = this.f222378b;
                        efm.d0<rx4.b> loanAgreementsList = zVar.f222381a.getLoanAgreementsList(key.f222313a);
                        o4a.e eVar = new o4a.e(20, new o54.a(zVar, key, 3));
                        loanAgreementsList.getClass();
                        ufm.i iVar = new ufm.i(loanAgreementsList, eVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 1:
                        a key2 = (a) obj2;
                        ux4.b agreements = (ux4.b) obj3;
                        Intrinsics.checkNotNullParameter(key2, "key");
                        Intrinsics.checkNotNullParameter(agreements, "agreements");
                        this.f222378b.f222383c.b(key2, tx4.a.b(agreements));
                        return Unit.f186387a;
                    case 2:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        f key3 = (f) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(key3, "key");
                        z zVar2 = this.f222378b;
                        efm.d0<rx4.b> forbearanceAgreements = zVar2.f222381a.getForbearanceAgreements(key3.f222332a);
                        o4a.e eVar2 = new o4a.e(19, new o54.a(zVar2, key3, 2));
                        forbearanceAgreements.getClass();
                        ufm.i iVar2 = new ufm.i(forbearanceAgreements, eVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 3:
                        f key4 = (f) obj2;
                        ux4.b agreements2 = (ux4.b) obj3;
                        Intrinsics.checkNotNullParameter(key4, "key");
                        Intrinsics.checkNotNullParameter(agreements2, "agreements");
                        this.f222378b.f222383c.b(key4, tx4.a.b(agreements2));
                        return Unit.f186387a;
                    case 4:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        e key5 = (e) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(key5, "key");
                        z zVar3 = this.f222378b;
                        efm.d0<i55.k> loanDocuments = zVar3.f222381a.getLoanDocuments(key5.f222330a);
                        o4a.e eVar3 = new o4a.e(18, new o54.a(zVar3, key5, 1));
                        loanDocuments.getClass();
                        ufm.i iVar3 = new ufm.i(loanDocuments, eVar3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return iVar3;
                    default:
                        e key6 = (e) obj2;
                        LoanDocuments documentSections = (LoanDocuments) obj3;
                        Intrinsics.checkNotNullParameter(key6, "key");
                        Intrinsics.checkNotNullParameter(documentSections, "documentSections");
                        xx4.e eVar4 = this.f222378b.f222383c;
                        Intrinsics.checkNotNullParameter(documentSections, "<this>");
                        ArrayList<LoanDocument> arrayList = documentSections.f70157b;
                        ArrayList arrayList2 = new ArrayList(zhm.w.t(arrayList, 10));
                        for (LoanDocument loanDocument : arrayList) {
                            String str = loanDocument.f70153a;
                            String str2 = loanDocument.f70154b;
                            String str3 = loanDocument.f70155c;
                            long j2 = loanDocument.d;
                            ZoneId zoneIdSystemDefault = ZoneId.systemDefault();
                            Intrinsics.checkNotNullExpressionValue(zoneIdSystemDefault, "systemDefault(...)");
                            String string = pu7.a.M(j2, zoneIdSystemDefault).toString();
                            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                            arrayList2.add(new i55.j(str, str2, str3, string, loanDocument.e));
                        }
                        eVar4.b(key6, new i55.k(arrayList2));
                        return Unit.f186387a;
                }
            }
        }, new ald.o(i5, memoryCache, xx4.d.class, "get", "get(Lcom/revolut/feature/credit/core/storage/MemoryCacheKey;)Ljava/lang/Object;", i2, 12), new jki.d(2, memoryCache, xx4.d.class, "set", "set(Lcom/revolut/feature/credit/core/storage/MemoryCacheKey;Ljava/lang/Object;)V", i2, 6), new Function1(this) { // from class: o55.y

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ z f222380b;

            {
                this.f222380b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i21) {
                    case 0:
                        a key = (a) obj2;
                        Intrinsics.checkNotNullParameter(key, "key");
                        z zVar = this.f222380b;
                        rx4.b bVar = (rx4.b) zVar.f222383c.a(key);
                        if (bVar != null) {
                            return zVar.d.m(bVar, key.a());
                        }
                        return null;
                    case 1:
                        f key2 = (f) obj2;
                        Intrinsics.checkNotNullParameter(key2, "key");
                        z zVar2 = this.f222380b;
                        rx4.b bVar2 = (rx4.b) zVar2.f222383c.a(key2);
                        if (bVar2 != null) {
                            return zVar2.d.m(bVar2, key2.a());
                        }
                        return null;
                    default:
                        e key3 = (e) obj2;
                        Intrinsics.checkNotNullParameter(key3, "key");
                        z zVar3 = this.f222380b;
                        i55.k kVar = (i55.k) zVar3.f222383c.a(key3);
                        if (kVar != null) {
                            return zVar3.e.r(kVar, key3.a());
                        }
                        return null;
                }
            }
        }, new Function2(this) { // from class: o55.x

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ z f222378b;

            {
                this.f222378b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i22) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        a key = (a) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(key, "key");
                        z zVar = this.f222378b;
                        efm.d0<rx4.b> loanAgreementsList = zVar.f222381a.getLoanAgreementsList(key.f222313a);
                        o4a.e eVar = new o4a.e(20, new o54.a(zVar, key, 3));
                        loanAgreementsList.getClass();
                        ufm.i iVar = new ufm.i(loanAgreementsList, eVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 1:
                        a key2 = (a) obj2;
                        ux4.b agreements = (ux4.b) obj3;
                        Intrinsics.checkNotNullParameter(key2, "key");
                        Intrinsics.checkNotNullParameter(agreements, "agreements");
                        this.f222378b.f222383c.b(key2, tx4.a.b(agreements));
                        return Unit.f186387a;
                    case 2:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        f key3 = (f) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(key3, "key");
                        z zVar2 = this.f222378b;
                        efm.d0<rx4.b> forbearanceAgreements = zVar2.f222381a.getForbearanceAgreements(key3.f222332a);
                        o4a.e eVar2 = new o4a.e(19, new o54.a(zVar2, key3, 2));
                        forbearanceAgreements.getClass();
                        ufm.i iVar2 = new ufm.i(forbearanceAgreements, eVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 3:
                        f key4 = (f) obj2;
                        ux4.b agreements2 = (ux4.b) obj3;
                        Intrinsics.checkNotNullParameter(key4, "key");
                        Intrinsics.checkNotNullParameter(agreements2, "agreements");
                        this.f222378b.f222383c.b(key4, tx4.a.b(agreements2));
                        return Unit.f186387a;
                    case 4:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        e key5 = (e) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(key5, "key");
                        z zVar3 = this.f222378b;
                        efm.d0<i55.k> loanDocuments = zVar3.f222381a.getLoanDocuments(key5.f222330a);
                        o4a.e eVar3 = new o4a.e(18, new o54.a(zVar3, key5, 1));
                        loanDocuments.getClass();
                        ufm.i iVar3 = new ufm.i(loanDocuments, eVar3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return iVar3;
                    default:
                        e key6 = (e) obj2;
                        LoanDocuments documentSections = (LoanDocuments) obj3;
                        Intrinsics.checkNotNullParameter(key6, "key");
                        Intrinsics.checkNotNullParameter(documentSections, "documentSections");
                        xx4.e eVar4 = this.f222378b.f222383c;
                        Intrinsics.checkNotNullParameter(documentSections, "<this>");
                        ArrayList<LoanDocument> arrayList = documentSections.f70157b;
                        ArrayList arrayList2 = new ArrayList(zhm.w.t(arrayList, 10));
                        for (LoanDocument loanDocument : arrayList) {
                            String str = loanDocument.f70153a;
                            String str2 = loanDocument.f70154b;
                            String str3 = loanDocument.f70155c;
                            long j2 = loanDocument.d;
                            ZoneId zoneIdSystemDefault = ZoneId.systemDefault();
                            Intrinsics.checkNotNullExpressionValue(zoneIdSystemDefault, "systemDefault(...)");
                            String string = pu7.a.M(j2, zoneIdSystemDefault).toString();
                            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                            arrayList2.add(new i55.j(str, str2, str3, string, loanDocument.e));
                        }
                        eVar4.b(key6, new i55.k(arrayList2));
                        return Unit.f186387a;
                }
            }
        }, null, null, null, BERTags.FLAGS);
        final int i32 = 4;
        Function2 function22 = new Function2(this) { // from class: o55.x

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ z f222378b;

            {
                this.f222378b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i32) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        a key = (a) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(key, "key");
                        z zVar = this.f222378b;
                        efm.d0<rx4.b> loanAgreementsList = zVar.f222381a.getLoanAgreementsList(key.f222313a);
                        o4a.e eVar = new o4a.e(20, new o54.a(zVar, key, 3));
                        loanAgreementsList.getClass();
                        ufm.i iVar = new ufm.i(loanAgreementsList, eVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 1:
                        a key2 = (a) obj2;
                        ux4.b agreements = (ux4.b) obj3;
                        Intrinsics.checkNotNullParameter(key2, "key");
                        Intrinsics.checkNotNullParameter(agreements, "agreements");
                        this.f222378b.f222383c.b(key2, tx4.a.b(agreements));
                        return Unit.f186387a;
                    case 2:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        f key3 = (f) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(key3, "key");
                        z zVar2 = this.f222378b;
                        efm.d0<rx4.b> forbearanceAgreements = zVar2.f222381a.getForbearanceAgreements(key3.f222332a);
                        o4a.e eVar2 = new o4a.e(19, new o54.a(zVar2, key3, 2));
                        forbearanceAgreements.getClass();
                        ufm.i iVar2 = new ufm.i(forbearanceAgreements, eVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 3:
                        f key4 = (f) obj2;
                        ux4.b agreements2 = (ux4.b) obj3;
                        Intrinsics.checkNotNullParameter(key4, "key");
                        Intrinsics.checkNotNullParameter(agreements2, "agreements");
                        this.f222378b.f222383c.b(key4, tx4.a.b(agreements2));
                        return Unit.f186387a;
                    case 4:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        e key5 = (e) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(key5, "key");
                        z zVar3 = this.f222378b;
                        efm.d0<i55.k> loanDocuments = zVar3.f222381a.getLoanDocuments(key5.f222330a);
                        o4a.e eVar3 = new o4a.e(18, new o54.a(zVar3, key5, 1));
                        loanDocuments.getClass();
                        ufm.i iVar3 = new ufm.i(loanDocuments, eVar3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return iVar3;
                    default:
                        e key6 = (e) obj2;
                        LoanDocuments documentSections = (LoanDocuments) obj3;
                        Intrinsics.checkNotNullParameter(key6, "key");
                        Intrinsics.checkNotNullParameter(documentSections, "documentSections");
                        xx4.e eVar4 = this.f222378b.f222383c;
                        Intrinsics.checkNotNullParameter(documentSections, "<this>");
                        ArrayList<LoanDocument> arrayList = documentSections.f70157b;
                        ArrayList arrayList2 = new ArrayList(zhm.w.t(arrayList, 10));
                        for (LoanDocument loanDocument : arrayList) {
                            String str = loanDocument.f70153a;
                            String str2 = loanDocument.f70154b;
                            String str3 = loanDocument.f70155c;
                            long j2 = loanDocument.d;
                            ZoneId zoneIdSystemDefault = ZoneId.systemDefault();
                            Intrinsics.checkNotNullExpressionValue(zoneIdSystemDefault, "systemDefault(...)");
                            String string = pu7.a.M(j2, zoneIdSystemDefault).toString();
                            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                            arrayList2.add(new i55.j(str, str2, str3, string, loanDocument.e));
                        }
                        eVar4.b(key6, new i55.k(arrayList2));
                        return Unit.f186387a;
                }
            }
        };
        ald.o oVar2 = new ald.o(1, memoryCache, xx4.d.class, "get", "get(Lcom/revolut/feature/credit/core/storage/MemoryCacheKey;)Ljava/lang/Object;", i2, 14);
        final int i33 = 2;
        jki.d dVar2 = new jki.d(i33, memoryCache, xx4.d.class, "set", "set(Lcom/revolut/feature/credit/core/storage/MemoryCacheKey;Ljava/lang/Object;)V", i2, 8);
        Function1 function12 = new Function1(this) { // from class: o55.y

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ z f222380b;

            {
                this.f222380b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i33) {
                    case 0:
                        a key = (a) obj2;
                        Intrinsics.checkNotNullParameter(key, "key");
                        z zVar = this.f222380b;
                        rx4.b bVar = (rx4.b) zVar.f222383c.a(key);
                        if (bVar != null) {
                            return zVar.d.m(bVar, key.a());
                        }
                        return null;
                    case 1:
                        f key2 = (f) obj2;
                        Intrinsics.checkNotNullParameter(key2, "key");
                        z zVar2 = this.f222380b;
                        rx4.b bVar2 = (rx4.b) zVar2.f222383c.a(key2);
                        if (bVar2 != null) {
                            return zVar2.d.m(bVar2, key2.a());
                        }
                        return null;
                    default:
                        e key3 = (e) obj2;
                        Intrinsics.checkNotNullParameter(key3, "key");
                        z zVar3 = this.f222380b;
                        i55.k kVar = (i55.k) zVar3.f222383c.a(key3);
                        if (kVar != null) {
                            return zVar3.e.r(kVar, key3.a());
                        }
                        return null;
                }
            }
        };
        final int i43 = 5;
        this.i = new w4l.f(function22, oVar2, dVar2, function12, new Function2(this) { // from class: o55.x

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ z f222378b;

            {
                this.f222378b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i43) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        a key = (a) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(key, "key");
                        z zVar = this.f222378b;
                        efm.d0<rx4.b> loanAgreementsList = zVar.f222381a.getLoanAgreementsList(key.f222313a);
                        o4a.e eVar = new o4a.e(20, new o54.a(zVar, key, 3));
                        loanAgreementsList.getClass();
                        ufm.i iVar = new ufm.i(loanAgreementsList, eVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 1:
                        a key2 = (a) obj2;
                        ux4.b agreements = (ux4.b) obj3;
                        Intrinsics.checkNotNullParameter(key2, "key");
                        Intrinsics.checkNotNullParameter(agreements, "agreements");
                        this.f222378b.f222383c.b(key2, tx4.a.b(agreements));
                        return Unit.f186387a;
                    case 2:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        f key3 = (f) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(key3, "key");
                        z zVar2 = this.f222378b;
                        efm.d0<rx4.b> forbearanceAgreements = zVar2.f222381a.getForbearanceAgreements(key3.f222332a);
                        o4a.e eVar2 = new o4a.e(19, new o54.a(zVar2, key3, 2));
                        forbearanceAgreements.getClass();
                        ufm.i iVar2 = new ufm.i(forbearanceAgreements, eVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 3:
                        f key4 = (f) obj2;
                        ux4.b agreements2 = (ux4.b) obj3;
                        Intrinsics.checkNotNullParameter(key4, "key");
                        Intrinsics.checkNotNullParameter(agreements2, "agreements");
                        this.f222378b.f222383c.b(key4, tx4.a.b(agreements2));
                        return Unit.f186387a;
                    case 4:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        e key5 = (e) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(key5, "key");
                        z zVar3 = this.f222378b;
                        efm.d0<i55.k> loanDocuments = zVar3.f222381a.getLoanDocuments(key5.f222330a);
                        o4a.e eVar3 = new o4a.e(18, new o54.a(zVar3, key5, 1));
                        loanDocuments.getClass();
                        ufm.i iVar3 = new ufm.i(loanDocuments, eVar3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return iVar3;
                    default:
                        e key6 = (e) obj2;
                        LoanDocuments documentSections = (LoanDocuments) obj3;
                        Intrinsics.checkNotNullParameter(key6, "key");
                        Intrinsics.checkNotNullParameter(documentSections, "documentSections");
                        xx4.e eVar4 = this.f222378b.f222383c;
                        Intrinsics.checkNotNullParameter(documentSections, "<this>");
                        ArrayList<LoanDocument> arrayList = documentSections.f70157b;
                        ArrayList arrayList2 = new ArrayList(zhm.w.t(arrayList, 10));
                        for (LoanDocument loanDocument : arrayList) {
                            String str = loanDocument.f70153a;
                            String str2 = loanDocument.f70154b;
                            String str3 = loanDocument.f70155c;
                            long j2 = loanDocument.d;
                            ZoneId zoneIdSystemDefault = ZoneId.systemDefault();
                            Intrinsics.checkNotNullExpressionValue(zoneIdSystemDefault, "systemDefault(...)");
                            String string = pu7.a.M(j2, zoneIdSystemDefault).toString();
                            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                            arrayList2.add(new i55.j(str, str2, str3, string, loanDocument.e));
                        }
                        eVar4.b(key6, new i55.k(arrayList2));
                        return Unit.f186387a;
                }
            }
        }, null, null, null, BERTags.FLAGS);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof z)) {
            return false;
        }
        z zVar = (z) obj2;
        return Intrinsics.f(this.f222381a, zVar.f222381a) && Intrinsics.f(this.f222382b, zVar.f222382b) && Intrinsics.f(this.f222383c, zVar.f222383c) && Intrinsics.f(this.d, zVar.d) && Intrinsics.f(this.e, zVar.e) && Intrinsics.f(this.f, zVar.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.f222383c.hashCode() + ((this.f222382b.hashCode() + (this.f222381a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31);
    }
}
