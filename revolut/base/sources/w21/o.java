package w21;

import com.google.gson.reflect.TypeToken;
import com.revolut.data.database.models.openbanking.ExternalInstitutionsDao;
import com.revolut.data.database.models.openbanking.ExternalInstitutionsWithBranches;
import com.revolut.data.database.models.openbanking.mapper.ExternalInstitutionEntityMapperKt;
import com.revolut.data.network.models.openbanking.ExternalInstitutionDto;
import com.revolut.data.network.models.openbanking.ExternalInstitutionStatusDto;
import com.revolut.data.network.services.ExternalInstitutionsService;
import com.revolut.feature.core.model.domain.wallet.openbanking.ExternalInstitution;
import com.youTransactor.uCube.rpc.Constants;
import efm.d0;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.reflect.KTypeProjection;
import kotlin.text.a0;
import org.bouncycastle.asn1.BERTags;
import org.jetbrains.annotations.NotNull;
import zhm.w;

/* JADX INFO: loaded from: classes20.dex */
public final class o implements r71.a {

    @NotNull
    public static final f Companion = new f();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final Type f293929l = new TypeToken<p21.a>() { // from class: com.revolut.data.repositories.openbanking.ExternalInstitutionsRepositoryImpl$Companion$EXTERNAL_INSTITUTION_IBAN_STATUS_TYPE$1
    }.getType();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final Type f293930m = new TypeToken<List<? extends x21.a>>() { // from class: com.revolut.data.repositories.openbanking.ExternalInstitutionsRepositoryImpl$Companion$EXTERNAL_INSTITUTIONS_CONSENTS_TYPE$1
    }.getType();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ExternalInstitutionsService f293931a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ExternalInstitutionsDao f293932b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ue0.c f293933c;
    public final go3.b d;
    public final p21.b e;
    public final ne0.d f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public volatile List f293934g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public volatile List f293935h;
    public final w4l.f i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final w4l.f f293936j;
    public final w4l.f k;

    public o(ExternalInstitutionsService externalInstitutionsService, ExternalInstitutionsDao dao, ue0.c storage, go3.b walletMapper, p21.b openBankingMapper, q instructionsMapper, ne0.d memoryCache) {
        Intrinsics.checkNotNullParameter(externalInstitutionsService, "externalInstitutionsService");
        Intrinsics.checkNotNullParameter(dao, "dao");
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(walletMapper, "walletMapper");
        Intrinsics.checkNotNullParameter(openBankingMapper, "openBankingMapper");
        Intrinsics.checkNotNullParameter(instructionsMapper, "instructionsMapper");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        this.f293931a = externalInstitutionsService;
        this.f293932b = dao;
        this.f293933c = storage;
        this.d = walletMapper;
        this.e = openBankingMapper;
        this.f = memoryCache;
        final int i = 0;
        Function2 function2 = new Function2(this) { // from class: w21.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ o f293924b;

            {
                this.f293924b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i) {
                    case 0:
                        o oVar = this.f293924b;
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        d0<List<ExternalInstitutionDto>> institutions = oVar.f293931a.getInstitutions();
                        vz4.c cVar = new vz4.c(new w2.c(23), 13);
                        institutions.getClass();
                        ufm.i iVar = new ufm.i(institutions, cVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        break;
                    case 1:
                        o oVar2 = this.f293924b;
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        List bankLicenseCountries = (List) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(bankLicenseCountries, "bankLicenseCountries");
                        ExternalInstitutionsService externalInstitutionsService2 = oVar2.f293931a;
                        List list = bankLicenseCountries;
                        ArrayList arrayList = new ArrayList(w.t(list, 10));
                        Iterator it9 = list.iterator();
                        while (it9.hasNext()) {
                            arrayList.add(((wi0.b) it9.next()).f297794a);
                        }
                        d0<List<ExternalInstitutionDto>> pennyInstitutions = externalInstitutionsService2.getPennyInstitutions(arrayList);
                        vz4.c cVar2 = new vz4.c(new w2.c(25), 19);
                        pennyInstitutions.getClass();
                        ufm.i iVar2 = new ufm.i(pennyInstitutions, cVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        break;
                    case 2:
                        o oVar3 = this.f293924b;
                        List bankLicenseCountries2 = (List) obj2;
                        List institutions2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(bankLicenseCountries2, "bankLicenseCountries");
                        Intrinsics.checkNotNullParameter(institutions2, "institutions");
                        oVar3.f.f(zhm.d0.k0(bankLicenseCountries2, null, null, null, 0, new h0() { // from class: w21.l
                            @Override // kotlin.jvm.internal.h0, wim.p
                            public final Object get(Object obj4) {
                                return ((wi0.b) obj4).f297794a;
                            }
                        }, 31), institutions2);
                        break;
                    case 3:
                        o oVar4 = this.f293924b;
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        Pair pair = (Pair) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(pair, "<destruct>");
                        String str = (String) pair.f186385a;
                        d0<ro3.e> externalAccount = oVar4.f293931a.getExternalAccount((String) pair.f186386b, true);
                        vz4.c cVar3 = new vz4.c(new b(oVar4, str, 1), 18);
                        externalAccount.getClass();
                        ufm.i iVar3 = new ufm.i(externalAccount, cVar3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        break;
                    case 4:
                        o oVar5 = this.f293924b;
                        List institutions3 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(institutions3, "institutions");
                        oVar5.f293934g = institutions3;
                        break;
                    case 5:
                        o oVar6 = this.f293924b;
                        List institutions4 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(institutions4, "institutions");
                        ExternalInstitutionsDao externalInstitutionsDao = oVar6.f293932b;
                        List list2 = institutions4;
                        ArrayList arrayList2 = new ArrayList(w.t(list2, 10));
                        Iterator it10 = list2.iterator();
                        while (it10.hasNext()) {
                            arrayList2.add(ExternalInstitutionEntityMapperKt.toEntity((ExternalInstitution) it10.next()));
                        }
                        externalInstitutionsDao.updateAll(arrayList2);
                        break;
                    case 6:
                        o oVar7 = this.f293924b;
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        Unit it11 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it11, "it");
                        d0<List<ExternalInstitutionStatusDto>> institutionsStatuses = oVar7.f293931a.getInstitutionsStatuses();
                        vz4.c cVar4 = new vz4.c(new w2.c(26), 20);
                        institutionsStatuses.getClass();
                        ufm.i iVar4 = new ufm.i(institutionsStatuses, cVar4, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar4, "map(...)");
                        break;
                    case 7:
                        o oVar8 = this.f293924b;
                        List consents = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(consents, "consents");
                        oVar8.f293935h = consents;
                        break;
                    default:
                        o oVar9 = this.f293924b;
                        List domain = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(domain, "domain");
                        ue0.c cVar5 = oVar9.f293933c;
                        Intrinsics.checkNotNullParameter(domain, "<this>");
                        List<ho3.b> list3 = domain;
                        ArrayList arrayList3 = new ArrayList(w.t(list3, 10));
                        for (ho3.b bVar : list3) {
                            arrayList3.add(new x21.a(bVar.f154220a, bVar.f154221b.name()));
                        }
                        cVar5.G(arrayList3, "EXTERNAL_INSTITUTIONS_CONSENTS_KEY", kii.e.o(x21.a.class, KTypeProjection.INSTANCE, List.class));
                        break;
                }
                return Unit.f186387a;
            }
        };
        final int i2 = 1;
        Function1 function1 = new Function1(this) { // from class: w21.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ o f293926b;

            {
                this.f293926b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                ho3.d dVar;
                switch (i2) {
                    case 0:
                        o oVar = this.f293926b;
                        List bankLicenseCountries = (List) obj2;
                        Intrinsics.checkNotNullParameter(bankLicenseCountries, "bankLicenseCountries");
                        return (List) oVar.f.get(zhm.d0.k0(bankLicenseCountries, null, null, null, 0, new h0() { // from class: w21.k
                            @Override // kotlin.jvm.internal.h0, wim.p
                            public final Object get(Object obj3) {
                                return ((wi0.b) obj3).f297794a;
                            }
                        }, 31));
                    case 1:
                        o oVar2 = this.f293926b;
                        Unit it8 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return oVar2.f293934g;
                    case 2:
                        o oVar3 = this.f293926b;
                        Unit it9 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it9, "it");
                        List<ExternalInstitutionsWithBranches> all2 = oVar3.f293932b.getAll();
                        ArrayList arrayList = new ArrayList(w.t(all2, 10));
                        Iterator<T> it10 = all2.iterator();
                        while (it10.hasNext()) {
                            arrayList.add(ExternalInstitutionEntityMapperKt.toDomain((ExternalInstitutionsWithBranches) it10.next()));
                        }
                        return c6d.b.N(arrayList);
                    case 3:
                        o oVar4 = this.f293926b;
                        Unit it11 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it11, "it");
                        return oVar4.f293935h;
                    default:
                        o oVar5 = this.f293926b;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        ue0.c cVar = oVar5.f293933c;
                        Type EXTERNAL_INSTITUTIONS_CONSENTS_TYPE = o.f293930m;
                        Intrinsics.checkNotNullExpressionValue(EXTERNAL_INSTITUTIONS_CONSENTS_TYPE, "EXTERNAL_INSTITUTIONS_CONSENTS_TYPE");
                        List list = (List) cVar.T2("EXTERNAL_INSTITUTIONS_CONSENTS_KEY", EXTERNAL_INSTITUTIONS_CONSENTS_TYPE);
                        if (list == null) {
                            return null;
                        }
                        Intrinsics.checkNotNullParameter(list, "<this>");
                        List<x21.a> list2 = list;
                        ArrayList arrayList2 = new ArrayList(w.t(list2, 10));
                        for (x21.a aVar : list2) {
                            String id10 = aVar.getId();
                            String status = aVar.getStatus();
                            ho3.d[] dVarArrValues = ho3.d.values();
                            int length = dVarArrValues.length;
                            int i3 = 0;
                            while (true) {
                                if (i3 < length) {
                                    dVar = dVarArrValues[i3];
                                    if (!a0.z(dVar.name(), status, true)) {
                                        i3++;
                                    }
                                } else {
                                    dVar = null;
                                }
                            }
                            if (dVar == null) {
                                dVar = ho3.d.REVOKED;
                            }
                            arrayList2.add(new ho3.b(id10, dVar));
                        }
                        return arrayList2;
                }
            }
        };
        final int i3 = 4;
        Function2 function22 = new Function2(this) { // from class: w21.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ o f293924b;

            {
                this.f293924b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i3) {
                    case 0:
                        o oVar = this.f293924b;
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        d0<List<ExternalInstitutionDto>> institutions = oVar.f293931a.getInstitutions();
                        vz4.c cVar = new vz4.c(new w2.c(23), 13);
                        institutions.getClass();
                        ufm.i iVar = new ufm.i(institutions, cVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        break;
                    case 1:
                        o oVar2 = this.f293924b;
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        List bankLicenseCountries = (List) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(bankLicenseCountries, "bankLicenseCountries");
                        ExternalInstitutionsService externalInstitutionsService2 = oVar2.f293931a;
                        List list = bankLicenseCountries;
                        ArrayList arrayList = new ArrayList(w.t(list, 10));
                        Iterator it9 = list.iterator();
                        while (it9.hasNext()) {
                            arrayList.add(((wi0.b) it9.next()).f297794a);
                        }
                        d0<List<ExternalInstitutionDto>> pennyInstitutions = externalInstitutionsService2.getPennyInstitutions(arrayList);
                        vz4.c cVar2 = new vz4.c(new w2.c(25), 19);
                        pennyInstitutions.getClass();
                        ufm.i iVar2 = new ufm.i(pennyInstitutions, cVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        break;
                    case 2:
                        o oVar3 = this.f293924b;
                        List bankLicenseCountries2 = (List) obj2;
                        List institutions2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(bankLicenseCountries2, "bankLicenseCountries");
                        Intrinsics.checkNotNullParameter(institutions2, "institutions");
                        oVar3.f.f(zhm.d0.k0(bankLicenseCountries2, null, null, null, 0, new h0() { // from class: w21.l
                            @Override // kotlin.jvm.internal.h0, wim.p
                            public final Object get(Object obj4) {
                                return ((wi0.b) obj4).f297794a;
                            }
                        }, 31), institutions2);
                        break;
                    case 3:
                        o oVar4 = this.f293924b;
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        Pair pair = (Pair) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(pair, "<destruct>");
                        String str = (String) pair.f186385a;
                        d0<ro3.e> externalAccount = oVar4.f293931a.getExternalAccount((String) pair.f186386b, true);
                        vz4.c cVar3 = new vz4.c(new b(oVar4, str, 1), 18);
                        externalAccount.getClass();
                        ufm.i iVar3 = new ufm.i(externalAccount, cVar3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        break;
                    case 4:
                        o oVar5 = this.f293924b;
                        List institutions3 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(institutions3, "institutions");
                        oVar5.f293934g = institutions3;
                        break;
                    case 5:
                        o oVar6 = this.f293924b;
                        List institutions4 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(institutions4, "institutions");
                        ExternalInstitutionsDao externalInstitutionsDao = oVar6.f293932b;
                        List list2 = institutions4;
                        ArrayList arrayList2 = new ArrayList(w.t(list2, 10));
                        Iterator it10 = list2.iterator();
                        while (it10.hasNext()) {
                            arrayList2.add(ExternalInstitutionEntityMapperKt.toEntity((ExternalInstitution) it10.next()));
                        }
                        externalInstitutionsDao.updateAll(arrayList2);
                        break;
                    case 6:
                        o oVar7 = this.f293924b;
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        Unit it11 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it11, "it");
                        d0<List<ExternalInstitutionStatusDto>> institutionsStatuses = oVar7.f293931a.getInstitutionsStatuses();
                        vz4.c cVar4 = new vz4.c(new w2.c(26), 20);
                        institutionsStatuses.getClass();
                        ufm.i iVar4 = new ufm.i(institutionsStatuses, cVar4, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar4, "map(...)");
                        break;
                    case 7:
                        o oVar8 = this.f293924b;
                        List consents = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(consents, "consents");
                        oVar8.f293935h = consents;
                        break;
                    default:
                        o oVar9 = this.f293924b;
                        List domain = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(domain, "domain");
                        ue0.c cVar5 = oVar9.f293933c;
                        Intrinsics.checkNotNullParameter(domain, "<this>");
                        List<ho3.b> list3 = domain;
                        ArrayList arrayList3 = new ArrayList(w.t(list3, 10));
                        for (ho3.b bVar : list3) {
                            arrayList3.add(new x21.a(bVar.f154220a, bVar.f154221b.name()));
                        }
                        cVar5.G(arrayList3, "EXTERNAL_INSTITUTIONS_CONSENTS_KEY", kii.e.o(x21.a.class, KTypeProjection.INSTANCE, List.class));
                        break;
                }
                return Unit.f186387a;
            }
        };
        final int i5 = 2;
        Function1 function12 = new Function1(this) { // from class: w21.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ o f293926b;

            {
                this.f293926b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                ho3.d dVar;
                switch (i5) {
                    case 0:
                        o oVar = this.f293926b;
                        List bankLicenseCountries = (List) obj2;
                        Intrinsics.checkNotNullParameter(bankLicenseCountries, "bankLicenseCountries");
                        return (List) oVar.f.get(zhm.d0.k0(bankLicenseCountries, null, null, null, 0, new h0() { // from class: w21.k
                            @Override // kotlin.jvm.internal.h0, wim.p
                            public final Object get(Object obj3) {
                                return ((wi0.b) obj3).f297794a;
                            }
                        }, 31));
                    case 1:
                        o oVar2 = this.f293926b;
                        Unit it8 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return oVar2.f293934g;
                    case 2:
                        o oVar3 = this.f293926b;
                        Unit it9 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it9, "it");
                        List<ExternalInstitutionsWithBranches> all2 = oVar3.f293932b.getAll();
                        ArrayList arrayList = new ArrayList(w.t(all2, 10));
                        Iterator<T> it10 = all2.iterator();
                        while (it10.hasNext()) {
                            arrayList.add(ExternalInstitutionEntityMapperKt.toDomain((ExternalInstitutionsWithBranches) it10.next()));
                        }
                        return c6d.b.N(arrayList);
                    case 3:
                        o oVar4 = this.f293926b;
                        Unit it11 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it11, "it");
                        return oVar4.f293935h;
                    default:
                        o oVar5 = this.f293926b;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        ue0.c cVar = oVar5.f293933c;
                        Type EXTERNAL_INSTITUTIONS_CONSENTS_TYPE = o.f293930m;
                        Intrinsics.checkNotNullExpressionValue(EXTERNAL_INSTITUTIONS_CONSENTS_TYPE, "EXTERNAL_INSTITUTIONS_CONSENTS_TYPE");
                        List list = (List) cVar.T2("EXTERNAL_INSTITUTIONS_CONSENTS_KEY", EXTERNAL_INSTITUTIONS_CONSENTS_TYPE);
                        if (list == null) {
                            return null;
                        }
                        Intrinsics.checkNotNullParameter(list, "<this>");
                        List<x21.a> list2 = list;
                        ArrayList arrayList2 = new ArrayList(w.t(list2, 10));
                        for (x21.a aVar : list2) {
                            String id10 = aVar.getId();
                            String status = aVar.getStatus();
                            ho3.d[] dVarArrValues = ho3.d.values();
                            int length = dVarArrValues.length;
                            int i32 = 0;
                            while (true) {
                                if (i32 < length) {
                                    dVar = dVarArrValues[i32];
                                    if (!a0.z(dVar.name(), status, true)) {
                                        i32++;
                                    }
                                } else {
                                    dVar = null;
                                }
                            }
                            if (dVar == null) {
                                dVar = ho3.d.REVOKED;
                            }
                            arrayList2.add(new ho3.b(id10, dVar));
                        }
                        return arrayList2;
                }
            }
        };
        final int i6 = 5;
        this.i = new w4l.f(function2, function1, function22, function12, new Function2(this) { // from class: w21.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ o f293924b;

            {
                this.f293924b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i6) {
                    case 0:
                        o oVar = this.f293924b;
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        d0<List<ExternalInstitutionDto>> institutions = oVar.f293931a.getInstitutions();
                        vz4.c cVar = new vz4.c(new w2.c(23), 13);
                        institutions.getClass();
                        ufm.i iVar = new ufm.i(institutions, cVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        break;
                    case 1:
                        o oVar2 = this.f293924b;
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        List bankLicenseCountries = (List) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(bankLicenseCountries, "bankLicenseCountries");
                        ExternalInstitutionsService externalInstitutionsService2 = oVar2.f293931a;
                        List list = bankLicenseCountries;
                        ArrayList arrayList = new ArrayList(w.t(list, 10));
                        Iterator it9 = list.iterator();
                        while (it9.hasNext()) {
                            arrayList.add(((wi0.b) it9.next()).f297794a);
                        }
                        d0<List<ExternalInstitutionDto>> pennyInstitutions = externalInstitutionsService2.getPennyInstitutions(arrayList);
                        vz4.c cVar2 = new vz4.c(new w2.c(25), 19);
                        pennyInstitutions.getClass();
                        ufm.i iVar2 = new ufm.i(pennyInstitutions, cVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        break;
                    case 2:
                        o oVar3 = this.f293924b;
                        List bankLicenseCountries2 = (List) obj2;
                        List institutions2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(bankLicenseCountries2, "bankLicenseCountries");
                        Intrinsics.checkNotNullParameter(institutions2, "institutions");
                        oVar3.f.f(zhm.d0.k0(bankLicenseCountries2, null, null, null, 0, new h0() { // from class: w21.l
                            @Override // kotlin.jvm.internal.h0, wim.p
                            public final Object get(Object obj4) {
                                return ((wi0.b) obj4).f297794a;
                            }
                        }, 31), institutions2);
                        break;
                    case 3:
                        o oVar4 = this.f293924b;
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        Pair pair = (Pair) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(pair, "<destruct>");
                        String str = (String) pair.f186385a;
                        d0<ro3.e> externalAccount = oVar4.f293931a.getExternalAccount((String) pair.f186386b, true);
                        vz4.c cVar3 = new vz4.c(new b(oVar4, str, 1), 18);
                        externalAccount.getClass();
                        ufm.i iVar3 = new ufm.i(externalAccount, cVar3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        break;
                    case 4:
                        o oVar5 = this.f293924b;
                        List institutions3 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(institutions3, "institutions");
                        oVar5.f293934g = institutions3;
                        break;
                    case 5:
                        o oVar6 = this.f293924b;
                        List institutions4 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(institutions4, "institutions");
                        ExternalInstitutionsDao externalInstitutionsDao = oVar6.f293932b;
                        List list2 = institutions4;
                        ArrayList arrayList2 = new ArrayList(w.t(list2, 10));
                        Iterator it10 = list2.iterator();
                        while (it10.hasNext()) {
                            arrayList2.add(ExternalInstitutionEntityMapperKt.toEntity((ExternalInstitution) it10.next()));
                        }
                        externalInstitutionsDao.updateAll(arrayList2);
                        break;
                    case 6:
                        o oVar7 = this.f293924b;
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        Unit it11 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it11, "it");
                        d0<List<ExternalInstitutionStatusDto>> institutionsStatuses = oVar7.f293931a.getInstitutionsStatuses();
                        vz4.c cVar4 = new vz4.c(new w2.c(26), 20);
                        institutionsStatuses.getClass();
                        ufm.i iVar4 = new ufm.i(institutionsStatuses, cVar4, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar4, "map(...)");
                        break;
                    case 7:
                        o oVar8 = this.f293924b;
                        List consents = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(consents, "consents");
                        oVar8.f293935h = consents;
                        break;
                    default:
                        o oVar9 = this.f293924b;
                        List domain = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(domain, "domain");
                        ue0.c cVar5 = oVar9.f293933c;
                        Intrinsics.checkNotNullParameter(domain, "<this>");
                        List<ho3.b> list3 = domain;
                        ArrayList arrayList3 = new ArrayList(w.t(list3, 10));
                        for (ho3.b bVar : list3) {
                            arrayList3.add(new x21.a(bVar.f154220a, bVar.f154221b.name()));
                        }
                        cVar5.G(arrayList3, "EXTERNAL_INSTITUTIONS_CONSENTS_KEY", kii.e.o(x21.a.class, KTypeProjection.INSTANCE, List.class));
                        break;
                }
                return Unit.f186387a;
            }
        }, null, null, null, BERTags.FLAGS);
        final int i21 = 6;
        Function2 function23 = new Function2(this) { // from class: w21.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ o f293924b;

            {
                this.f293924b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i21) {
                    case 0:
                        o oVar = this.f293924b;
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        d0<List<ExternalInstitutionDto>> institutions = oVar.f293931a.getInstitutions();
                        vz4.c cVar = new vz4.c(new w2.c(23), 13);
                        institutions.getClass();
                        ufm.i iVar = new ufm.i(institutions, cVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        break;
                    case 1:
                        o oVar2 = this.f293924b;
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        List bankLicenseCountries = (List) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(bankLicenseCountries, "bankLicenseCountries");
                        ExternalInstitutionsService externalInstitutionsService2 = oVar2.f293931a;
                        List list = bankLicenseCountries;
                        ArrayList arrayList = new ArrayList(w.t(list, 10));
                        Iterator it9 = list.iterator();
                        while (it9.hasNext()) {
                            arrayList.add(((wi0.b) it9.next()).f297794a);
                        }
                        d0<List<ExternalInstitutionDto>> pennyInstitutions = externalInstitutionsService2.getPennyInstitutions(arrayList);
                        vz4.c cVar2 = new vz4.c(new w2.c(25), 19);
                        pennyInstitutions.getClass();
                        ufm.i iVar2 = new ufm.i(pennyInstitutions, cVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        break;
                    case 2:
                        o oVar3 = this.f293924b;
                        List bankLicenseCountries2 = (List) obj2;
                        List institutions2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(bankLicenseCountries2, "bankLicenseCountries");
                        Intrinsics.checkNotNullParameter(institutions2, "institutions");
                        oVar3.f.f(zhm.d0.k0(bankLicenseCountries2, null, null, null, 0, new h0() { // from class: w21.l
                            @Override // kotlin.jvm.internal.h0, wim.p
                            public final Object get(Object obj4) {
                                return ((wi0.b) obj4).f297794a;
                            }
                        }, 31), institutions2);
                        break;
                    case 3:
                        o oVar4 = this.f293924b;
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        Pair pair = (Pair) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(pair, "<destruct>");
                        String str = (String) pair.f186385a;
                        d0<ro3.e> externalAccount = oVar4.f293931a.getExternalAccount((String) pair.f186386b, true);
                        vz4.c cVar3 = new vz4.c(new b(oVar4, str, 1), 18);
                        externalAccount.getClass();
                        ufm.i iVar3 = new ufm.i(externalAccount, cVar3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        break;
                    case 4:
                        o oVar5 = this.f293924b;
                        List institutions3 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(institutions3, "institutions");
                        oVar5.f293934g = institutions3;
                        break;
                    case 5:
                        o oVar6 = this.f293924b;
                        List institutions4 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(institutions4, "institutions");
                        ExternalInstitutionsDao externalInstitutionsDao = oVar6.f293932b;
                        List list2 = institutions4;
                        ArrayList arrayList2 = new ArrayList(w.t(list2, 10));
                        Iterator it10 = list2.iterator();
                        while (it10.hasNext()) {
                            arrayList2.add(ExternalInstitutionEntityMapperKt.toEntity((ExternalInstitution) it10.next()));
                        }
                        externalInstitutionsDao.updateAll(arrayList2);
                        break;
                    case 6:
                        o oVar7 = this.f293924b;
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        Unit it11 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it11, "it");
                        d0<List<ExternalInstitutionStatusDto>> institutionsStatuses = oVar7.f293931a.getInstitutionsStatuses();
                        vz4.c cVar4 = new vz4.c(new w2.c(26), 20);
                        institutionsStatuses.getClass();
                        ufm.i iVar4 = new ufm.i(institutionsStatuses, cVar4, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar4, "map(...)");
                        break;
                    case 7:
                        o oVar8 = this.f293924b;
                        List consents = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(consents, "consents");
                        oVar8.f293935h = consents;
                        break;
                    default:
                        o oVar9 = this.f293924b;
                        List domain = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(domain, "domain");
                        ue0.c cVar5 = oVar9.f293933c;
                        Intrinsics.checkNotNullParameter(domain, "<this>");
                        List<ho3.b> list3 = domain;
                        ArrayList arrayList3 = new ArrayList(w.t(list3, 10));
                        for (ho3.b bVar : list3) {
                            arrayList3.add(new x21.a(bVar.f154220a, bVar.f154221b.name()));
                        }
                        cVar5.G(arrayList3, "EXTERNAL_INSTITUTIONS_CONSENTS_KEY", kii.e.o(x21.a.class, KTypeProjection.INSTANCE, List.class));
                        break;
                }
                return Unit.f186387a;
            }
        };
        final int i22 = 3;
        Function1 function13 = new Function1(this) { // from class: w21.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ o f293926b;

            {
                this.f293926b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                ho3.d dVar;
                switch (i22) {
                    case 0:
                        o oVar = this.f293926b;
                        List bankLicenseCountries = (List) obj2;
                        Intrinsics.checkNotNullParameter(bankLicenseCountries, "bankLicenseCountries");
                        return (List) oVar.f.get(zhm.d0.k0(bankLicenseCountries, null, null, null, 0, new h0() { // from class: w21.k
                            @Override // kotlin.jvm.internal.h0, wim.p
                            public final Object get(Object obj3) {
                                return ((wi0.b) obj3).f297794a;
                            }
                        }, 31));
                    case 1:
                        o oVar2 = this.f293926b;
                        Unit it8 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return oVar2.f293934g;
                    case 2:
                        o oVar3 = this.f293926b;
                        Unit it9 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it9, "it");
                        List<ExternalInstitutionsWithBranches> all2 = oVar3.f293932b.getAll();
                        ArrayList arrayList = new ArrayList(w.t(all2, 10));
                        Iterator<T> it10 = all2.iterator();
                        while (it10.hasNext()) {
                            arrayList.add(ExternalInstitutionEntityMapperKt.toDomain((ExternalInstitutionsWithBranches) it10.next()));
                        }
                        return c6d.b.N(arrayList);
                    case 3:
                        o oVar4 = this.f293926b;
                        Unit it11 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it11, "it");
                        return oVar4.f293935h;
                    default:
                        o oVar5 = this.f293926b;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        ue0.c cVar = oVar5.f293933c;
                        Type EXTERNAL_INSTITUTIONS_CONSENTS_TYPE = o.f293930m;
                        Intrinsics.checkNotNullExpressionValue(EXTERNAL_INSTITUTIONS_CONSENTS_TYPE, "EXTERNAL_INSTITUTIONS_CONSENTS_TYPE");
                        List list = (List) cVar.T2("EXTERNAL_INSTITUTIONS_CONSENTS_KEY", EXTERNAL_INSTITUTIONS_CONSENTS_TYPE);
                        if (list == null) {
                            return null;
                        }
                        Intrinsics.checkNotNullParameter(list, "<this>");
                        List<x21.a> list2 = list;
                        ArrayList arrayList2 = new ArrayList(w.t(list2, 10));
                        for (x21.a aVar : list2) {
                            String id10 = aVar.getId();
                            String status = aVar.getStatus();
                            ho3.d[] dVarArrValues = ho3.d.values();
                            int length = dVarArrValues.length;
                            int i32 = 0;
                            while (true) {
                                if (i32 < length) {
                                    dVar = dVarArrValues[i32];
                                    if (!a0.z(dVar.name(), status, true)) {
                                        i32++;
                                    }
                                } else {
                                    dVar = null;
                                }
                            }
                            if (dVar == null) {
                                dVar = ho3.d.REVOKED;
                            }
                            arrayList2.add(new ho3.b(id10, dVar));
                        }
                        return arrayList2;
                }
            }
        };
        final int i32 = 7;
        Function2 function24 = new Function2(this) { // from class: w21.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ o f293924b;

            {
                this.f293924b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i32) {
                    case 0:
                        o oVar = this.f293924b;
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        d0<List<ExternalInstitutionDto>> institutions = oVar.f293931a.getInstitutions();
                        vz4.c cVar = new vz4.c(new w2.c(23), 13);
                        institutions.getClass();
                        ufm.i iVar = new ufm.i(institutions, cVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        break;
                    case 1:
                        o oVar2 = this.f293924b;
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        List bankLicenseCountries = (List) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(bankLicenseCountries, "bankLicenseCountries");
                        ExternalInstitutionsService externalInstitutionsService2 = oVar2.f293931a;
                        List list = bankLicenseCountries;
                        ArrayList arrayList = new ArrayList(w.t(list, 10));
                        Iterator it9 = list.iterator();
                        while (it9.hasNext()) {
                            arrayList.add(((wi0.b) it9.next()).f297794a);
                        }
                        d0<List<ExternalInstitutionDto>> pennyInstitutions = externalInstitutionsService2.getPennyInstitutions(arrayList);
                        vz4.c cVar2 = new vz4.c(new w2.c(25), 19);
                        pennyInstitutions.getClass();
                        ufm.i iVar2 = new ufm.i(pennyInstitutions, cVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        break;
                    case 2:
                        o oVar3 = this.f293924b;
                        List bankLicenseCountries2 = (List) obj2;
                        List institutions2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(bankLicenseCountries2, "bankLicenseCountries");
                        Intrinsics.checkNotNullParameter(institutions2, "institutions");
                        oVar3.f.f(zhm.d0.k0(bankLicenseCountries2, null, null, null, 0, new h0() { // from class: w21.l
                            @Override // kotlin.jvm.internal.h0, wim.p
                            public final Object get(Object obj4) {
                                return ((wi0.b) obj4).f297794a;
                            }
                        }, 31), institutions2);
                        break;
                    case 3:
                        o oVar4 = this.f293924b;
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        Pair pair = (Pair) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(pair, "<destruct>");
                        String str = (String) pair.f186385a;
                        d0<ro3.e> externalAccount = oVar4.f293931a.getExternalAccount((String) pair.f186386b, true);
                        vz4.c cVar3 = new vz4.c(new b(oVar4, str, 1), 18);
                        externalAccount.getClass();
                        ufm.i iVar3 = new ufm.i(externalAccount, cVar3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        break;
                    case 4:
                        o oVar5 = this.f293924b;
                        List institutions3 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(institutions3, "institutions");
                        oVar5.f293934g = institutions3;
                        break;
                    case 5:
                        o oVar6 = this.f293924b;
                        List institutions4 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(institutions4, "institutions");
                        ExternalInstitutionsDao externalInstitutionsDao = oVar6.f293932b;
                        List list2 = institutions4;
                        ArrayList arrayList2 = new ArrayList(w.t(list2, 10));
                        Iterator it10 = list2.iterator();
                        while (it10.hasNext()) {
                            arrayList2.add(ExternalInstitutionEntityMapperKt.toEntity((ExternalInstitution) it10.next()));
                        }
                        externalInstitutionsDao.updateAll(arrayList2);
                        break;
                    case 6:
                        o oVar7 = this.f293924b;
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        Unit it11 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it11, "it");
                        d0<List<ExternalInstitutionStatusDto>> institutionsStatuses = oVar7.f293931a.getInstitutionsStatuses();
                        vz4.c cVar4 = new vz4.c(new w2.c(26), 20);
                        institutionsStatuses.getClass();
                        ufm.i iVar4 = new ufm.i(institutionsStatuses, cVar4, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar4, "map(...)");
                        break;
                    case 7:
                        o oVar8 = this.f293924b;
                        List consents = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(consents, "consents");
                        oVar8.f293935h = consents;
                        break;
                    default:
                        o oVar9 = this.f293924b;
                        List domain = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(domain, "domain");
                        ue0.c cVar5 = oVar9.f293933c;
                        Intrinsics.checkNotNullParameter(domain, "<this>");
                        List<ho3.b> list3 = domain;
                        ArrayList arrayList3 = new ArrayList(w.t(list3, 10));
                        for (ho3.b bVar : list3) {
                            arrayList3.add(new x21.a(bVar.f154220a, bVar.f154221b.name()));
                        }
                        cVar5.G(arrayList3, "EXTERNAL_INSTITUTIONS_CONSENTS_KEY", kii.e.o(x21.a.class, KTypeProjection.INSTANCE, List.class));
                        break;
                }
                return Unit.f186387a;
            }
        };
        final int i33 = 4;
        Function1 function14 = new Function1(this) { // from class: w21.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ o f293926b;

            {
                this.f293926b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                ho3.d dVar;
                switch (i33) {
                    case 0:
                        o oVar = this.f293926b;
                        List bankLicenseCountries = (List) obj2;
                        Intrinsics.checkNotNullParameter(bankLicenseCountries, "bankLicenseCountries");
                        return (List) oVar.f.get(zhm.d0.k0(bankLicenseCountries, null, null, null, 0, new h0() { // from class: w21.k
                            @Override // kotlin.jvm.internal.h0, wim.p
                            public final Object get(Object obj3) {
                                return ((wi0.b) obj3).f297794a;
                            }
                        }, 31));
                    case 1:
                        o oVar2 = this.f293926b;
                        Unit it8 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return oVar2.f293934g;
                    case 2:
                        o oVar3 = this.f293926b;
                        Unit it9 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it9, "it");
                        List<ExternalInstitutionsWithBranches> all2 = oVar3.f293932b.getAll();
                        ArrayList arrayList = new ArrayList(w.t(all2, 10));
                        Iterator<T> it10 = all2.iterator();
                        while (it10.hasNext()) {
                            arrayList.add(ExternalInstitutionEntityMapperKt.toDomain((ExternalInstitutionsWithBranches) it10.next()));
                        }
                        return c6d.b.N(arrayList);
                    case 3:
                        o oVar4 = this.f293926b;
                        Unit it11 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it11, "it");
                        return oVar4.f293935h;
                    default:
                        o oVar5 = this.f293926b;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        ue0.c cVar = oVar5.f293933c;
                        Type EXTERNAL_INSTITUTIONS_CONSENTS_TYPE = o.f293930m;
                        Intrinsics.checkNotNullExpressionValue(EXTERNAL_INSTITUTIONS_CONSENTS_TYPE, "EXTERNAL_INSTITUTIONS_CONSENTS_TYPE");
                        List list = (List) cVar.T2("EXTERNAL_INSTITUTIONS_CONSENTS_KEY", EXTERNAL_INSTITUTIONS_CONSENTS_TYPE);
                        if (list == null) {
                            return null;
                        }
                        Intrinsics.checkNotNullParameter(list, "<this>");
                        List<x21.a> list2 = list;
                        ArrayList arrayList2 = new ArrayList(w.t(list2, 10));
                        for (x21.a aVar : list2) {
                            String id10 = aVar.getId();
                            String status = aVar.getStatus();
                            ho3.d[] dVarArrValues = ho3.d.values();
                            int length = dVarArrValues.length;
                            int i322 = 0;
                            while (true) {
                                if (i322 < length) {
                                    dVar = dVarArrValues[i322];
                                    if (!a0.z(dVar.name(), status, true)) {
                                        i322++;
                                    }
                                } else {
                                    dVar = null;
                                }
                            }
                            if (dVar == null) {
                                dVar = ho3.d.REVOKED;
                            }
                            arrayList2.add(new ho3.b(id10, dVar));
                        }
                        return arrayList2;
                }
            }
        };
        final int i43 = 8;
        this.f293936j = new w4l.f(function23, function13, function24, function14, new Function2(this) { // from class: w21.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ o f293924b;

            {
                this.f293924b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i43) {
                    case 0:
                        o oVar = this.f293924b;
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        d0<List<ExternalInstitutionDto>> institutions = oVar.f293931a.getInstitutions();
                        vz4.c cVar = new vz4.c(new w2.c(23), 13);
                        institutions.getClass();
                        ufm.i iVar = new ufm.i(institutions, cVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        break;
                    case 1:
                        o oVar2 = this.f293924b;
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        List bankLicenseCountries = (List) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(bankLicenseCountries, "bankLicenseCountries");
                        ExternalInstitutionsService externalInstitutionsService2 = oVar2.f293931a;
                        List list = bankLicenseCountries;
                        ArrayList arrayList = new ArrayList(w.t(list, 10));
                        Iterator it9 = list.iterator();
                        while (it9.hasNext()) {
                            arrayList.add(((wi0.b) it9.next()).f297794a);
                        }
                        d0<List<ExternalInstitutionDto>> pennyInstitutions = externalInstitutionsService2.getPennyInstitutions(arrayList);
                        vz4.c cVar2 = new vz4.c(new w2.c(25), 19);
                        pennyInstitutions.getClass();
                        ufm.i iVar2 = new ufm.i(pennyInstitutions, cVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        break;
                    case 2:
                        o oVar3 = this.f293924b;
                        List bankLicenseCountries2 = (List) obj2;
                        List institutions2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(bankLicenseCountries2, "bankLicenseCountries");
                        Intrinsics.checkNotNullParameter(institutions2, "institutions");
                        oVar3.f.f(zhm.d0.k0(bankLicenseCountries2, null, null, null, 0, new h0() { // from class: w21.l
                            @Override // kotlin.jvm.internal.h0, wim.p
                            public final Object get(Object obj4) {
                                return ((wi0.b) obj4).f297794a;
                            }
                        }, 31), institutions2);
                        break;
                    case 3:
                        o oVar4 = this.f293924b;
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        Pair pair = (Pair) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(pair, "<destruct>");
                        String str = (String) pair.f186385a;
                        d0<ro3.e> externalAccount = oVar4.f293931a.getExternalAccount((String) pair.f186386b, true);
                        vz4.c cVar3 = new vz4.c(new b(oVar4, str, 1), 18);
                        externalAccount.getClass();
                        ufm.i iVar3 = new ufm.i(externalAccount, cVar3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        break;
                    case 4:
                        o oVar5 = this.f293924b;
                        List institutions3 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(institutions3, "institutions");
                        oVar5.f293934g = institutions3;
                        break;
                    case 5:
                        o oVar6 = this.f293924b;
                        List institutions4 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(institutions4, "institutions");
                        ExternalInstitutionsDao externalInstitutionsDao = oVar6.f293932b;
                        List list2 = institutions4;
                        ArrayList arrayList2 = new ArrayList(w.t(list2, 10));
                        Iterator it10 = list2.iterator();
                        while (it10.hasNext()) {
                            arrayList2.add(ExternalInstitutionEntityMapperKt.toEntity((ExternalInstitution) it10.next()));
                        }
                        externalInstitutionsDao.updateAll(arrayList2);
                        break;
                    case 6:
                        o oVar7 = this.f293924b;
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        Unit it11 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it11, "it");
                        d0<List<ExternalInstitutionStatusDto>> institutionsStatuses = oVar7.f293931a.getInstitutionsStatuses();
                        vz4.c cVar4 = new vz4.c(new w2.c(26), 20);
                        institutionsStatuses.getClass();
                        ufm.i iVar4 = new ufm.i(institutionsStatuses, cVar4, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar4, "map(...)");
                        break;
                    case 7:
                        o oVar8 = this.f293924b;
                        List consents = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(consents, "consents");
                        oVar8.f293935h = consents;
                        break;
                    default:
                        o oVar9 = this.f293924b;
                        List domain = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(domain, "domain");
                        ue0.c cVar5 = oVar9.f293933c;
                        Intrinsics.checkNotNullParameter(domain, "<this>");
                        List<ho3.b> list3 = domain;
                        ArrayList arrayList3 = new ArrayList(w.t(list3, 10));
                        for (ho3.b bVar : list3) {
                            arrayList3.add(new x21.a(bVar.f154220a, bVar.f154221b.name()));
                        }
                        cVar5.G(arrayList3, "EXTERNAL_INSTITUTIONS_CONSENTS_KEY", kii.e.o(x21.a.class, KTypeProjection.INSTANCE, List.class));
                        break;
                }
                return Unit.f186387a;
            }
        }, null, null, null, BERTags.FLAGS);
        final int i59 = 1;
        Function2 function25 = new Function2(this) { // from class: w21.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ o f293924b;

            {
                this.f293924b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i59) {
                    case 0:
                        o oVar = this.f293924b;
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        d0<List<ExternalInstitutionDto>> institutions = oVar.f293931a.getInstitutions();
                        vz4.c cVar = new vz4.c(new w2.c(23), 13);
                        institutions.getClass();
                        ufm.i iVar = new ufm.i(institutions, cVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        break;
                    case 1:
                        o oVar2 = this.f293924b;
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        List bankLicenseCountries = (List) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(bankLicenseCountries, "bankLicenseCountries");
                        ExternalInstitutionsService externalInstitutionsService2 = oVar2.f293931a;
                        List list = bankLicenseCountries;
                        ArrayList arrayList = new ArrayList(w.t(list, 10));
                        Iterator it9 = list.iterator();
                        while (it9.hasNext()) {
                            arrayList.add(((wi0.b) it9.next()).f297794a);
                        }
                        d0<List<ExternalInstitutionDto>> pennyInstitutions = externalInstitutionsService2.getPennyInstitutions(arrayList);
                        vz4.c cVar2 = new vz4.c(new w2.c(25), 19);
                        pennyInstitutions.getClass();
                        ufm.i iVar2 = new ufm.i(pennyInstitutions, cVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        break;
                    case 2:
                        o oVar3 = this.f293924b;
                        List bankLicenseCountries2 = (List) obj2;
                        List institutions2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(bankLicenseCountries2, "bankLicenseCountries");
                        Intrinsics.checkNotNullParameter(institutions2, "institutions");
                        oVar3.f.f(zhm.d0.k0(bankLicenseCountries2, null, null, null, 0, new h0() { // from class: w21.l
                            @Override // kotlin.jvm.internal.h0, wim.p
                            public final Object get(Object obj4) {
                                return ((wi0.b) obj4).f297794a;
                            }
                        }, 31), institutions2);
                        break;
                    case 3:
                        o oVar4 = this.f293924b;
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        Pair pair = (Pair) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(pair, "<destruct>");
                        String str = (String) pair.f186385a;
                        d0<ro3.e> externalAccount = oVar4.f293931a.getExternalAccount((String) pair.f186386b, true);
                        vz4.c cVar3 = new vz4.c(new b(oVar4, str, 1), 18);
                        externalAccount.getClass();
                        ufm.i iVar3 = new ufm.i(externalAccount, cVar3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        break;
                    case 4:
                        o oVar5 = this.f293924b;
                        List institutions3 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(institutions3, "institutions");
                        oVar5.f293934g = institutions3;
                        break;
                    case 5:
                        o oVar6 = this.f293924b;
                        List institutions4 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(institutions4, "institutions");
                        ExternalInstitutionsDao externalInstitutionsDao = oVar6.f293932b;
                        List list2 = institutions4;
                        ArrayList arrayList2 = new ArrayList(w.t(list2, 10));
                        Iterator it10 = list2.iterator();
                        while (it10.hasNext()) {
                            arrayList2.add(ExternalInstitutionEntityMapperKt.toEntity((ExternalInstitution) it10.next()));
                        }
                        externalInstitutionsDao.updateAll(arrayList2);
                        break;
                    case 6:
                        o oVar7 = this.f293924b;
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        Unit it11 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it11, "it");
                        d0<List<ExternalInstitutionStatusDto>> institutionsStatuses = oVar7.f293931a.getInstitutionsStatuses();
                        vz4.c cVar4 = new vz4.c(new w2.c(26), 20);
                        institutionsStatuses.getClass();
                        ufm.i iVar4 = new ufm.i(institutionsStatuses, cVar4, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar4, "map(...)");
                        break;
                    case 7:
                        o oVar8 = this.f293924b;
                        List consents = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(consents, "consents");
                        oVar8.f293935h = consents;
                        break;
                    default:
                        o oVar9 = this.f293924b;
                        List domain = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(domain, "domain");
                        ue0.c cVar5 = oVar9.f293933c;
                        Intrinsics.checkNotNullParameter(domain, "<this>");
                        List<ho3.b> list3 = domain;
                        ArrayList arrayList3 = new ArrayList(w.t(list3, 10));
                        for (ho3.b bVar : list3) {
                            arrayList3.add(new x21.a(bVar.f154220a, bVar.f154221b.name()));
                        }
                        cVar5.G(arrayList3, "EXTERNAL_INSTITUTIONS_CONSENTS_KEY", kii.e.o(x21.a.class, KTypeProjection.INSTANCE, List.class));
                        break;
                }
                return Unit.f186387a;
            }
        };
        final int i66 = 0;
        Function1 function15 = new Function1(this) { // from class: w21.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ o f293926b;

            {
                this.f293926b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                ho3.d dVar;
                switch (i66) {
                    case 0:
                        o oVar = this.f293926b;
                        List bankLicenseCountries = (List) obj2;
                        Intrinsics.checkNotNullParameter(bankLicenseCountries, "bankLicenseCountries");
                        return (List) oVar.f.get(zhm.d0.k0(bankLicenseCountries, null, null, null, 0, new h0() { // from class: w21.k
                            @Override // kotlin.jvm.internal.h0, wim.p
                            public final Object get(Object obj3) {
                                return ((wi0.b) obj3).f297794a;
                            }
                        }, 31));
                    case 1:
                        o oVar2 = this.f293926b;
                        Unit it8 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return oVar2.f293934g;
                    case 2:
                        o oVar3 = this.f293926b;
                        Unit it9 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it9, "it");
                        List<ExternalInstitutionsWithBranches> all2 = oVar3.f293932b.getAll();
                        ArrayList arrayList = new ArrayList(w.t(all2, 10));
                        Iterator<T> it10 = all2.iterator();
                        while (it10.hasNext()) {
                            arrayList.add(ExternalInstitutionEntityMapperKt.toDomain((ExternalInstitutionsWithBranches) it10.next()));
                        }
                        return c6d.b.N(arrayList);
                    case 3:
                        o oVar4 = this.f293926b;
                        Unit it11 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it11, "it");
                        return oVar4.f293935h;
                    default:
                        o oVar5 = this.f293926b;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        ue0.c cVar = oVar5.f293933c;
                        Type EXTERNAL_INSTITUTIONS_CONSENTS_TYPE = o.f293930m;
                        Intrinsics.checkNotNullExpressionValue(EXTERNAL_INSTITUTIONS_CONSENTS_TYPE, "EXTERNAL_INSTITUTIONS_CONSENTS_TYPE");
                        List list = (List) cVar.T2("EXTERNAL_INSTITUTIONS_CONSENTS_KEY", EXTERNAL_INSTITUTIONS_CONSENTS_TYPE);
                        if (list == null) {
                            return null;
                        }
                        Intrinsics.checkNotNullParameter(list, "<this>");
                        List<x21.a> list2 = list;
                        ArrayList arrayList2 = new ArrayList(w.t(list2, 10));
                        for (x21.a aVar : list2) {
                            String id10 = aVar.getId();
                            String status = aVar.getStatus();
                            ho3.d[] dVarArrValues = ho3.d.values();
                            int length = dVarArrValues.length;
                            int i322 = 0;
                            while (true) {
                                if (i322 < length) {
                                    dVar = dVarArrValues[i322];
                                    if (!a0.z(dVar.name(), status, true)) {
                                        i322++;
                                    }
                                } else {
                                    dVar = null;
                                }
                            }
                            if (dVar == null) {
                                dVar = ho3.d.REVOKED;
                            }
                            arrayList2.add(new ho3.b(id10, dVar));
                        }
                        return arrayList2;
                }
            }
        };
        final int i74 = 2;
        this.k = new w4l.f(function25, function15, new Function2(this) { // from class: w21.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ o f293924b;

            {
                this.f293924b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i74) {
                    case 0:
                        o oVar = this.f293924b;
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        d0<List<ExternalInstitutionDto>> institutions = oVar.f293931a.getInstitutions();
                        vz4.c cVar = new vz4.c(new w2.c(23), 13);
                        institutions.getClass();
                        ufm.i iVar = new ufm.i(institutions, cVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        break;
                    case 1:
                        o oVar2 = this.f293924b;
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        List bankLicenseCountries = (List) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(bankLicenseCountries, "bankLicenseCountries");
                        ExternalInstitutionsService externalInstitutionsService2 = oVar2.f293931a;
                        List list = bankLicenseCountries;
                        ArrayList arrayList = new ArrayList(w.t(list, 10));
                        Iterator it9 = list.iterator();
                        while (it9.hasNext()) {
                            arrayList.add(((wi0.b) it9.next()).f297794a);
                        }
                        d0<List<ExternalInstitutionDto>> pennyInstitutions = externalInstitutionsService2.getPennyInstitutions(arrayList);
                        vz4.c cVar2 = new vz4.c(new w2.c(25), 19);
                        pennyInstitutions.getClass();
                        ufm.i iVar2 = new ufm.i(pennyInstitutions, cVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        break;
                    case 2:
                        o oVar3 = this.f293924b;
                        List bankLicenseCountries2 = (List) obj2;
                        List institutions2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(bankLicenseCountries2, "bankLicenseCountries");
                        Intrinsics.checkNotNullParameter(institutions2, "institutions");
                        oVar3.f.f(zhm.d0.k0(bankLicenseCountries2, null, null, null, 0, new h0() { // from class: w21.l
                            @Override // kotlin.jvm.internal.h0, wim.p
                            public final Object get(Object obj4) {
                                return ((wi0.b) obj4).f297794a;
                            }
                        }, 31), institutions2);
                        break;
                    case 3:
                        o oVar4 = this.f293924b;
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        Pair pair = (Pair) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(pair, "<destruct>");
                        String str = (String) pair.f186385a;
                        d0<ro3.e> externalAccount = oVar4.f293931a.getExternalAccount((String) pair.f186386b, true);
                        vz4.c cVar3 = new vz4.c(new b(oVar4, str, 1), 18);
                        externalAccount.getClass();
                        ufm.i iVar3 = new ufm.i(externalAccount, cVar3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        break;
                    case 4:
                        o oVar5 = this.f293924b;
                        List institutions3 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(institutions3, "institutions");
                        oVar5.f293934g = institutions3;
                        break;
                    case 5:
                        o oVar6 = this.f293924b;
                        List institutions4 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(institutions4, "institutions");
                        ExternalInstitutionsDao externalInstitutionsDao = oVar6.f293932b;
                        List list2 = institutions4;
                        ArrayList arrayList2 = new ArrayList(w.t(list2, 10));
                        Iterator it10 = list2.iterator();
                        while (it10.hasNext()) {
                            arrayList2.add(ExternalInstitutionEntityMapperKt.toEntity((ExternalInstitution) it10.next()));
                        }
                        externalInstitutionsDao.updateAll(arrayList2);
                        break;
                    case 6:
                        o oVar7 = this.f293924b;
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        Unit it11 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it11, "it");
                        d0<List<ExternalInstitutionStatusDto>> institutionsStatuses = oVar7.f293931a.getInstitutionsStatuses();
                        vz4.c cVar4 = new vz4.c(new w2.c(26), 20);
                        institutionsStatuses.getClass();
                        ufm.i iVar4 = new ufm.i(institutionsStatuses, cVar4, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar4, "map(...)");
                        break;
                    case 7:
                        o oVar8 = this.f293924b;
                        List consents = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(consents, "consents");
                        oVar8.f293935h = consents;
                        break;
                    default:
                        o oVar9 = this.f293924b;
                        List domain = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(domain, "domain");
                        ue0.c cVar5 = oVar9.f293933c;
                        Intrinsics.checkNotNullParameter(domain, "<this>");
                        List<ho3.b> list3 = domain;
                        ArrayList arrayList3 = new ArrayList(w.t(list3, 10));
                        for (ho3.b bVar : list3) {
                            arrayList3.add(new x21.a(bVar.f154220a, bVar.f154221b.name()));
                        }
                        cVar5.G(arrayList3, "EXTERNAL_INSTITUTIONS_CONSENTS_KEY", kii.e.o(x21.a.class, KTypeProjection.INSTANCE, List.class));
                        break;
                }
                return Unit.f186387a;
            }
        }, null, null, null, null, null, Constants.TAG_FULL_SVPP_IDENTIFICATION);
        final int i92 = 3;
        new w4l.f(new Function2(this) { // from class: w21.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ o f293924b;

            {
                this.f293924b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i92) {
                    case 0:
                        o oVar = this.f293924b;
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        d0<List<ExternalInstitutionDto>> institutions = oVar.f293931a.getInstitutions();
                        vz4.c cVar = new vz4.c(new w2.c(23), 13);
                        institutions.getClass();
                        ufm.i iVar = new ufm.i(institutions, cVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        break;
                    case 1:
                        o oVar2 = this.f293924b;
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        List bankLicenseCountries = (List) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(bankLicenseCountries, "bankLicenseCountries");
                        ExternalInstitutionsService externalInstitutionsService2 = oVar2.f293931a;
                        List list = bankLicenseCountries;
                        ArrayList arrayList = new ArrayList(w.t(list, 10));
                        Iterator it9 = list.iterator();
                        while (it9.hasNext()) {
                            arrayList.add(((wi0.b) it9.next()).f297794a);
                        }
                        d0<List<ExternalInstitutionDto>> pennyInstitutions = externalInstitutionsService2.getPennyInstitutions(arrayList);
                        vz4.c cVar2 = new vz4.c(new w2.c(25), 19);
                        pennyInstitutions.getClass();
                        ufm.i iVar2 = new ufm.i(pennyInstitutions, cVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        break;
                    case 2:
                        o oVar3 = this.f293924b;
                        List bankLicenseCountries2 = (List) obj2;
                        List institutions2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(bankLicenseCountries2, "bankLicenseCountries");
                        Intrinsics.checkNotNullParameter(institutions2, "institutions");
                        oVar3.f.f(zhm.d0.k0(bankLicenseCountries2, null, null, null, 0, new h0() { // from class: w21.l
                            @Override // kotlin.jvm.internal.h0, wim.p
                            public final Object get(Object obj4) {
                                return ((wi0.b) obj4).f297794a;
                            }
                        }, 31), institutions2);
                        break;
                    case 3:
                        o oVar4 = this.f293924b;
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        Pair pair = (Pair) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(pair, "<destruct>");
                        String str = (String) pair.f186385a;
                        d0<ro3.e> externalAccount = oVar4.f293931a.getExternalAccount((String) pair.f186386b, true);
                        vz4.c cVar3 = new vz4.c(new b(oVar4, str, 1), 18);
                        externalAccount.getClass();
                        ufm.i iVar3 = new ufm.i(externalAccount, cVar3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        break;
                    case 4:
                        o oVar5 = this.f293924b;
                        List institutions3 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(institutions3, "institutions");
                        oVar5.f293934g = institutions3;
                        break;
                    case 5:
                        o oVar6 = this.f293924b;
                        List institutions4 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(institutions4, "institutions");
                        ExternalInstitutionsDao externalInstitutionsDao = oVar6.f293932b;
                        List list2 = institutions4;
                        ArrayList arrayList2 = new ArrayList(w.t(list2, 10));
                        Iterator it10 = list2.iterator();
                        while (it10.hasNext()) {
                            arrayList2.add(ExternalInstitutionEntityMapperKt.toEntity((ExternalInstitution) it10.next()));
                        }
                        externalInstitutionsDao.updateAll(arrayList2);
                        break;
                    case 6:
                        o oVar7 = this.f293924b;
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        Unit it11 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it11, "it");
                        d0<List<ExternalInstitutionStatusDto>> institutionsStatuses = oVar7.f293931a.getInstitutionsStatuses();
                        vz4.c cVar4 = new vz4.c(new w2.c(26), 20);
                        institutionsStatuses.getClass();
                        ufm.i iVar4 = new ufm.i(institutionsStatuses, cVar4, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar4, "map(...)");
                        break;
                    case 7:
                        o oVar8 = this.f293924b;
                        List consents = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(consents, "consents");
                        oVar8.f293935h = consents;
                        break;
                    default:
                        o oVar9 = this.f293924b;
                        List domain = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(domain, "domain");
                        ue0.c cVar5 = oVar9.f293933c;
                        Intrinsics.checkNotNullParameter(domain, "<this>");
                        List<ho3.b> list3 = domain;
                        ArrayList arrayList3 = new ArrayList(w.t(list3, 10));
                        for (ho3.b bVar : list3) {
                            arrayList3.add(new x21.a(bVar.f154220a, bVar.f154221b.name()));
                        }
                        cVar5.G(arrayList3, "EXTERNAL_INSTITUTIONS_CONSENTS_KEY", kii.e.o(x21.a.class, KTypeProjection.INSTANCE, List.class));
                        break;
                }
                return Unit.f186387a;
            }
        }, null, null, null, null, null, null, null, 254);
    }

    public static String b(String str) {
        return a0.d.r(str, "_INSTITUTION_IBAN_STATUS_ID_KEY");
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0058, code lost:
    
        if (nim.a.a(r6, r0) == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r6, gim.c r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof w21.g
            if (r0 == 0) goto L13
            r0 = r7
            w21.g r0 = (w21.g) r0
            int r1 = r0.f293927w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f293927w = r1
            goto L18
        L13:
            w21.g r0 = new w21.g
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f293927w
            r3 = 1
            r4 = 2
            if (r2 == 0) goto L36
            if (r2 == r3) goto L32
            if (r2 != r4) goto L2a
            yhm.o.b(r7)
            goto L5b
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            yhm.o.b(r7)
            goto L49
        L36:
            yhm.o.b(r7)
            com.revolut.data.network.models.openbanking.AcknowledgeRequestDto r7 = new com.revolut.data.network.models.openbanking.AcknowledgeRequestDto
            r7.<init>(r6)
            r0.f293927w = r3
            com.revolut.data.network.services.ExternalInstitutionsService r6 = r5.f293931a
            java.lang.Object r6 = r6.acknowledgeInstitution(r7, r0)
            if (r6 != r1) goto L49
            goto L5a
        L49:
            kotlin.Unit r6 = kotlin.Unit.f186387a
            r7 = 0
            w4l.f r2 = r5.f293936j
            efm.b r6 = r2.g(r6, r7)
            r0.f293927w = r4
            java.lang.Object r6 = nim.a.a(r6, r0)
            if (r6 != r1) goto L5b
        L5a:
            return r1
        L5b:
            kotlin.Unit r6 = kotlin.Unit.f186387a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: w21.o.a(java.lang.String, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(java.lang.String r10, com.revolut.domain.models.openbanking.instructions.InstructionsDomain r11, gim.c r12) {
        /*
            Method dump skipped, instruction units count: 294
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: w21.o.c(java.lang.String, com.revolut.domain.models.openbanking.instructions.InstructionsDomain, gim.c):java.lang.Object");
    }

    public final void d(String str, String str2) {
        ue0.c cVar = this.f293933c;
        z9h.n.l(String.class, cVar, "ONE_OFF_TOP_UP_INSTITUTION_ID_KEY", str);
        if (str2 == null) {
            cVar.I0("ONE_OFF_TOP_UP_BRANCH_ID_KEY");
        } else {
            z9h.n.l(String.class, cVar, "ONE_OFF_TOP_UP_BRANCH_ID_KEY", str2);
        }
    }
}
