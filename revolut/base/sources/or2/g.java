package or2;

import com.google.gson.reflect.TypeToken;
import com.revolut.feature.blocked_merchants.impl.data.network.BlockedMerchantsService;
import efm.d0;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KType;
import kotlin.reflect.KTypeProjection;
import ne0.j;
import ood.o0;
import org.bouncycastle.asn1.BERTags;
import org.jetbrains.annotations.NotNull;
import qe0.q;
import qr2.l;
import ufm.i;
import wim.z;
import zhm.w;

/* JADX INFO: loaded from: classes21.dex */
public final class g implements b {

    @NotNull
    public static final f Companion = new f();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Type f228047g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f228048a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ue0.c f228049b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final BlockedMerchantsService f228050c;
    public final a d;
    public final q e;
    public final w4l.f f;

    static {
        Type type = new TypeToken<List<? extends rr2.a>>() { // from class: com.revolut.feature.blocked_merchants.impl.data.BlockedMerchantsRepositoryImpl$Companion$blockagesListType$1
        }.getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        f228047g = type;
    }

    public g(j cache, ue0.c storage, BlockedMerchantsService service, a mapper, l80.e dateTimeProvider) {
        Intrinsics.checkNotNullParameter(cache, "cache");
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(dateTimeProvider, "dateTimeProvider");
        this.f228048a = cache;
        this.f228049b = storage;
        this.f228050c = service;
        this.d = mapper;
        final int i = 0;
        this.e = new q(new Function2(this) { // from class: or2.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f228044b;

            {
                this.f228044b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i) {
                    case 0:
                        String key = (String) obj2;
                        Long l2 = (Long) obj3;
                        l2.longValue();
                        Intrinsics.checkNotNullParameter(key, "key");
                        this.f228044b.f228048a.f(key, l2);
                        break;
                    case 1:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        g gVar = this.f228044b;
                        d0<List<l>> blockedMerchantsList = gVar.f228050c.getBlockedMerchantsList("MANAGE_YOUTH_BLOCKED_MERCHANT");
                        oq3.f fVar = new oq3.f(28, new o0(gVar, 28));
                        blockedMerchantsList.getClass();
                        ufm.f fVar2 = new ufm.f(new i(blockedMerchantsList, fVar, 1), new oq3.f(29, new c(gVar, 6)), 3);
                        Intrinsics.checkNotNullExpressionValue(fVar2, "doOnSuccess(...)");
                        break;
                    case 2:
                        List data = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(data, "data");
                        this.f228044b.f228048a.f("BLOCKED_MERCHANTS_LIST_CACHE_KEY", data);
                        break;
                    default:
                        List data2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(data2, "data");
                        List list = data2;
                        ArrayList arrayList = new ArrayList(w.t(list, 10));
                        Iterator it9 = list.iterator();
                        while (it9.hasNext()) {
                            arrayList.add(a.c((kr2.e) it9.next()));
                        }
                        this.f228044b.b(arrayList);
                        break;
                }
                return Unit.f186387a;
            }
        }, new c(this, 3), 60000L, dateTimeProvider);
        final int i2 = 1;
        final int i3 = 2;
        final int i5 = 3;
        this.f = new w4l.f(new Function2(this) { // from class: or2.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f228044b;

            {
                this.f228044b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i2) {
                    case 0:
                        String key = (String) obj2;
                        Long l2 = (Long) obj3;
                        l2.longValue();
                        Intrinsics.checkNotNullParameter(key, "key");
                        this.f228044b.f228048a.f(key, l2);
                        break;
                    case 1:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        g gVar = this.f228044b;
                        d0<List<l>> blockedMerchantsList = gVar.f228050c.getBlockedMerchantsList("MANAGE_YOUTH_BLOCKED_MERCHANT");
                        oq3.f fVar = new oq3.f(28, new o0(gVar, 28));
                        blockedMerchantsList.getClass();
                        ufm.f fVar2 = new ufm.f(new i(blockedMerchantsList, fVar, 1), new oq3.f(29, new c(gVar, 6)), 3);
                        Intrinsics.checkNotNullExpressionValue(fVar2, "doOnSuccess(...)");
                        break;
                    case 2:
                        List data = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(data, "data");
                        this.f228044b.f228048a.f("BLOCKED_MERCHANTS_LIST_CACHE_KEY", data);
                        break;
                    default:
                        List data2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(data2, "data");
                        List list = data2;
                        ArrayList arrayList = new ArrayList(w.t(list, 10));
                        Iterator it9 = list.iterator();
                        while (it9.hasNext()) {
                            arrayList.add(a.c((kr2.e) it9.next()));
                        }
                        this.f228044b.b(arrayList);
                        break;
                }
                return Unit.f186387a;
            }
        }, new c(this, 4), new Function2(this) { // from class: or2.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f228044b;

            {
                this.f228044b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i3) {
                    case 0:
                        String key = (String) obj2;
                        Long l2 = (Long) obj3;
                        l2.longValue();
                        Intrinsics.checkNotNullParameter(key, "key");
                        this.f228044b.f228048a.f(key, l2);
                        break;
                    case 1:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        g gVar = this.f228044b;
                        d0<List<l>> blockedMerchantsList = gVar.f228050c.getBlockedMerchantsList("MANAGE_YOUTH_BLOCKED_MERCHANT");
                        oq3.f fVar = new oq3.f(28, new o0(gVar, 28));
                        blockedMerchantsList.getClass();
                        ufm.f fVar2 = new ufm.f(new i(blockedMerchantsList, fVar, 1), new oq3.f(29, new c(gVar, 6)), 3);
                        Intrinsics.checkNotNullExpressionValue(fVar2, "doOnSuccess(...)");
                        break;
                    case 2:
                        List data = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(data, "data");
                        this.f228044b.f228048a.f("BLOCKED_MERCHANTS_LIST_CACHE_KEY", data);
                        break;
                    default:
                        List data2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(data2, "data");
                        List list = data2;
                        ArrayList arrayList = new ArrayList(w.t(list, 10));
                        Iterator it9 = list.iterator();
                        while (it9.hasNext()) {
                            arrayList.add(a.c((kr2.e) it9.next()));
                        }
                        this.f228044b.b(arrayList);
                        break;
                }
                return Unit.f186387a;
            }
        }, new c(this, 5), new Function2(this) { // from class: or2.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f228044b;

            {
                this.f228044b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i5) {
                    case 0:
                        String key = (String) obj2;
                        Long l2 = (Long) obj3;
                        l2.longValue();
                        Intrinsics.checkNotNullParameter(key, "key");
                        this.f228044b.f228048a.f(key, l2);
                        break;
                    case 1:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        g gVar = this.f228044b;
                        d0<List<l>> blockedMerchantsList = gVar.f228050c.getBlockedMerchantsList("MANAGE_YOUTH_BLOCKED_MERCHANT");
                        oq3.f fVar = new oq3.f(28, new o0(gVar, 28));
                        blockedMerchantsList.getClass();
                        ufm.f fVar2 = new ufm.f(new i(blockedMerchantsList, fVar, 1), new oq3.f(29, new c(gVar, 6)), 3);
                        Intrinsics.checkNotNullExpressionValue(fVar2, "doOnSuccess(...)");
                        break;
                    case 2:
                        List data = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(data, "data");
                        this.f228044b.f228048a.f("BLOCKED_MERCHANTS_LIST_CACHE_KEY", data);
                        break;
                    default:
                        List data2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(data2, "data");
                        List list = data2;
                        ArrayList arrayList = new ArrayList(w.t(list, 10));
                        Iterator it9 = list.iterator();
                        while (it9.hasNext()) {
                            arrayList.add(a.c((kr2.e) it9.next()));
                        }
                        this.f228044b.b(arrayList);
                        break;
                }
                return Unit.f186387a;
            }
        }, null, null, null, BERTags.FLAGS);
    }

    public final synchronized List a() {
        return (List) this.f228049b.T2("blocked_merchants_list", f228047g);
    }

    public final synchronized void b(ArrayList arrayList) {
        ue0.c cVar = this.f228049b;
        KTypeProjection.Companion companion = KTypeProjection.INSTANCE;
        KType kTypeB = kotlin.jvm.internal.o0.b(rr2.a.class);
        companion.getClass();
        cVar.G(arrayList, "blocked_merchants_list", z.d(kotlin.jvm.internal.o0.c(List.class, KTypeProjection.Companion.a(kTypeB))));
    }
}
