package hf6;

import com.revolut.data.database.models.openbanking.ConsentsDao;
import com.revolut.data.database.models.openbanking.mapper.ConsentEntityMapperKt;
import com.revolut.domain.models.openbanking.OpenBankingConsent;
import com.revolut.feature.external_accounts.impl.data.open_banking.OpenBankingService;
import efm.d0;
import hae.k;
import he4.r;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ne0.j;
import org.bouncycastle.asn1.BERTags;
import org.jetbrains.annotations.NotNull;
import zhm.w;

/* JADX INFO: loaded from: classes3.dex */
public final class i implements mg6.d {

    @NotNull
    public static final c Companion = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final OpenBankingService f151760a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConsentsDao f151761b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final tl0.a f151762c;
    public final j d;
    public final ue0.c e;
    public volatile List f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final w4l.f f151763g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final x4l.c f151764h;

    public i(OpenBankingService openBankingService, ConsentsDao dao, tl0.a base64Wrapper, j memoryCache, ue0.c auOpenBankingConsentsStorage) {
        Intrinsics.checkNotNullParameter(openBankingService, "openBankingService");
        Intrinsics.checkNotNullParameter(dao, "dao");
        Intrinsics.checkNotNullParameter(base64Wrapper, "base64Wrapper");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(auOpenBankingConsentsStorage, "auOpenBankingConsentsStorage");
        this.f151760a = openBankingService;
        this.f151761b = dao;
        this.f151762c = base64Wrapper;
        this.d = memoryCache;
        this.e = auOpenBankingConsentsStorage;
        final int i = 0;
        Function2 function2 = new Function2(this) { // from class: hf6.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ i f151754b;

            {
                this.f151754b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i) {
                    case 0:
                        i iVar = this.f151754b;
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        d0<List<if6.d>> consents = iVar.f151760a.getConsents();
                        k kVar = new k(new r(12), 17);
                        consents.getClass();
                        ufm.i iVar2 = new ufm.i(consents, kVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        break;
                    case 1:
                        i iVar3 = this.f151754b;
                        List consents2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(consents2, "consents");
                        iVar3.f = consents2;
                        break;
                    case 2:
                        i iVar4 = this.f151754b;
                        List consents3 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(consents3, "consents");
                        ConsentsDao consentsDao = iVar4.f151761b;
                        List list = consents3;
                        ArrayList arrayList = new ArrayList(w.t(list, 10));
                        Iterator it9 = list.iterator();
                        while (it9.hasNext()) {
                            arrayList.add(ConsentEntityMapperKt.toEntity$default((OpenBankingConsent.Default) it9.next(), false, 1, null));
                        }
                        consentsDao.updateAll(arrayList);
                        break;
                    default:
                        i iVar5 = this.f151754b;
                        List consents4 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(consents4, "consents");
                        iVar5.d.f("AU_CONSENTS_CACHE_KEY", consents4);
                        break;
                }
                return Unit.f186387a;
            }
        };
        b bVar = new b(this, i);
        final int i2 = 1;
        Function2 function22 = new Function2(this) { // from class: hf6.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ i f151754b;

            {
                this.f151754b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i2) {
                    case 0:
                        i iVar = this.f151754b;
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        d0<List<if6.d>> consents = iVar.f151760a.getConsents();
                        k kVar = new k(new r(12), 17);
                        consents.getClass();
                        ufm.i iVar2 = new ufm.i(consents, kVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        break;
                    case 1:
                        i iVar3 = this.f151754b;
                        List consents2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(consents2, "consents");
                        iVar3.f = consents2;
                        break;
                    case 2:
                        i iVar4 = this.f151754b;
                        List consents3 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(consents3, "consents");
                        ConsentsDao consentsDao = iVar4.f151761b;
                        List list = consents3;
                        ArrayList arrayList = new ArrayList(w.t(list, 10));
                        Iterator it9 = list.iterator();
                        while (it9.hasNext()) {
                            arrayList.add(ConsentEntityMapperKt.toEntity$default((OpenBankingConsent.Default) it9.next(), false, 1, null));
                        }
                        consentsDao.updateAll(arrayList);
                        break;
                    default:
                        i iVar5 = this.f151754b;
                        List consents4 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(consents4, "consents");
                        iVar5.d.f("AU_CONSENTS_CACHE_KEY", consents4);
                        break;
                }
                return Unit.f186387a;
            }
        };
        b bVar2 = new b(this, i2);
        final int i3 = 2;
        this.f151763g = new w4l.f(function2, bVar, function22, bVar2, new Function2(this) { // from class: hf6.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ i f151754b;

            {
                this.f151754b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i3) {
                    case 0:
                        i iVar = this.f151754b;
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        d0<List<if6.d>> consents = iVar.f151760a.getConsents();
                        k kVar = new k(new r(12), 17);
                        consents.getClass();
                        ufm.i iVar2 = new ufm.i(consents, kVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        break;
                    case 1:
                        i iVar3 = this.f151754b;
                        List consents2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(consents2, "consents");
                        iVar3.f = consents2;
                        break;
                    case 2:
                        i iVar4 = this.f151754b;
                        List consents3 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(consents3, "consents");
                        ConsentsDao consentsDao = iVar4.f151761b;
                        List list = consents3;
                        ArrayList arrayList = new ArrayList(w.t(list, 10));
                        Iterator it9 = list.iterator();
                        while (it9.hasNext()) {
                            arrayList.add(ConsentEntityMapperKt.toEntity$default((OpenBankingConsent.Default) it9.next(), false, 1, null));
                        }
                        consentsDao.updateAll(arrayList);
                        break;
                    default:
                        i iVar5 = this.f151754b;
                        List consents4 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(consents4, "consents");
                        iVar5.d.f("AU_CONSENTS_CACHE_KEY", consents4);
                        break;
                }
                return Unit.f186387a;
            }
        }, null, null, null, BERTags.FLAGS);
        final int i5 = 3;
        this.f151764h = new x4l.c(new d(this, null), new b(this, 2), new Function2(this) { // from class: hf6.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ i f151754b;

            {
                this.f151754b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i5) {
                    case 0:
                        i iVar = this.f151754b;
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        d0<List<if6.d>> consents = iVar.f151760a.getConsents();
                        k kVar = new k(new r(12), 17);
                        consents.getClass();
                        ufm.i iVar2 = new ufm.i(consents, kVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        break;
                    case 1:
                        i iVar3 = this.f151754b;
                        List consents2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(consents2, "consents");
                        iVar3.f = consents2;
                        break;
                    case 2:
                        i iVar4 = this.f151754b;
                        List consents3 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(consents3, "consents");
                        ConsentsDao consentsDao = iVar4.f151761b;
                        List list = consents3;
                        ArrayList arrayList = new ArrayList(w.t(list, 10));
                        Iterator it9 = list.iterator();
                        while (it9.hasNext()) {
                            arrayList.add(ConsentEntityMapperKt.toEntity$default((OpenBankingConsent.Default) it9.next(), false, 1, null));
                        }
                        consentsDao.updateAll(arrayList);
                        break;
                    default:
                        i iVar5 = this.f151754b;
                        List consents4 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(consents4, "consents");
                        iVar5.d.f("AU_CONSENTS_CACHE_KEY", consents4);
                        break;
                }
                return Unit.f186387a;
            }
        }, new e(this, null), new f(this, null));
    }
}
