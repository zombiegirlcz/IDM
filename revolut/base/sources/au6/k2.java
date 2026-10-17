package au6;

import au6.g2;
import com.google.gson.reflect.TypeToken;
import com.revolut.feature.freelancer.common.models.FreelancerBanner;
import com.revolut.feature.freelancer.common.models.FreelancerInboundVolume;
import com.revolut.feature.freelancer.common.models.FreelancerOrder;
import com.revolut.feature.freelancer.common.models.FreelancerProfileSettings;
import com.revolut.feature.freelancer.impl.network.services.FreelancerService;
import com.youTransactor.uCube.rpc.Constants;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KTypeProjection;
import org.bouncycastle.asn1.BERTags;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class k2 implements b2 {

    @NotNull
    public static final f2 Companion = new f2();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Type f9552j;
    public static final Type k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FreelancerService f9553a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final is6.z f9554b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ne0.j f9555c;
    public final ue0.c d;
    public final ft6.u e;
    public final w4l.f f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final w4l.f f9556g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final w4l.f f9557h;
    public final w4l.f i;

    static {
        new TypeToken<List<? extends lr6.d>>() { // from class: com.revolut.feature.freelancer.impl.repositories.FreelancerRepositoryImpl$Companion$STORAGE_KEY_BANNERS_DISMISSED_TYPE_TOKEN$1
        }.getType();
        f9552j = new TypeToken<List<? extends du6.e>>() { // from class: com.revolut.feature.freelancer.impl.repositories.FreelancerRepositoryImpl$Companion$bannerListType$1
        }.getType();
        k = new TypeToken<List<? extends du6.f>>() { // from class: com.revolut.feature.freelancer.impl.repositories.FreelancerRepositoryImpl$Companion$inboundVolumeListType$1
        }.getType();
    }

    public k2(FreelancerService api2, is6.z ordersDao, ne0.j memoryCache, ue0.c storage, ft6.u orderMapper) {
        Intrinsics.checkNotNullParameter(api2, "api");
        Intrinsics.checkNotNullParameter(ordersDao, "ordersDao");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(orderMapper, "orderMapper");
        this.f9553a = api2;
        this.f9554b = ordersDao;
        this.f9555c = memoryCache;
        this.d = storage;
        this.e = orderMapper;
        final int i = 0;
        final int i2 = 9;
        final int i3 = 10;
        new w4l.f(new Function2(this) { // from class: au6.d2

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ k2 f9515b;

            {
                this.f9515b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                List list;
                int i5 = i;
                int i6 = 0;
                int i21 = 10;
                k2 k2Var = this.f9515b;
                switch (i5) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        efm.d0<List<com.revolut.feature.freelancer.impl.network.models.q>> banners = k2Var.f9553a.getBanners();
                        z0 z0Var = new z0(new e2(1), 14);
                        banners.getClass();
                        ufm.i iVar = new ufm.i(banners, z0Var, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 1:
                        FreelancerService freelancerService = k2Var.f9553a;
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        g2 param = (g2) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(param, "param");
                        if (param instanceof g2.a) {
                            efm.d0<List<com.revolut.feature.freelancer.impl.network.models.v>> orders = freelancerService.getOrders(null, null, null, null);
                            z0 z0Var2 = new z0(new c2(k2Var, i21), 15);
                            orders.getClass();
                            ufm.i iVar2 = new ufm.i(orders, z0Var2, 1);
                            Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                            return iVar2;
                        }
                        if (!(param instanceof h2)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        efm.d0<com.revolut.feature.freelancer.impl.network.models.v> order = freelancerService.getOrder(((h2) param).f9535a);
                        z0 z0Var3 = new z0(new c2(k2Var, i6), 9);
                        order.getClass();
                        ufm.i iVar3 = new ufm.i(order, z0Var3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return iVar3;
                    case 2:
                        g2 param2 = (g2) obj2;
                        List sales = (List) obj3;
                        Intrinsics.checkNotNullParameter(param2, "param");
                        Intrinsics.checkNotNullParameter(sales, "sales");
                        if (param2 instanceof g2.a) {
                            k2Var.f9555c.f("CACHE_KEY_SALES", sales);
                        } else {
                            if (!(param2 instanceof h2)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            FreelancerOrder freelancerOrder = (FreelancerOrder) zhm.d0.d0(sales);
                            if (freelancerOrder != null && (list = (List) k2Var.f9555c.get("CACHE_KEY_SALES")) != null) {
                                ne0.j jVar = k2Var.f9555c;
                                List list2 = list;
                                ArrayList arrayList = new ArrayList(zhm.w.t(list2, 10));
                                for (Object obj4 : list2) {
                                    if (Intrinsics.f(((FreelancerOrder) obj4).f73289a, freelancerOrder.f73289a)) {
                                        obj4 = freelancerOrder;
                                    }
                                    arrayList.add(obj4);
                                }
                                jVar.f("CACHE_KEY_SALES", arrayList);
                            }
                        }
                        return Unit.f186387a;
                    case 3:
                        List sales2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((g2) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(sales2, "sales");
                        is6.z zVar = k2Var.f9554b;
                        List list3 = sales2;
                        ArrayList arrayList2 = new ArrayList(zhm.w.t(list3, 10));
                        Iterator it9 = list3.iterator();
                        while (it9.hasNext()) {
                            arrayList2.add(ft6.u.d((FreelancerOrder) it9.next()));
                        }
                        zVar.getClass();
                        return Unit.f186387a;
                    case 4:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        Unit it10 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it10, "it");
                        efm.d0<com.revolut.feature.freelancer.impl.network.models.k0> processingSettings = k2Var.f9553a.getProcessingSettings();
                        z0 z0Var4 = new z0(new au0.j0(26), 11);
                        processingSettings.getClass();
                        ufm.i iVar4 = new ufm.i(processingSettings, z0Var4, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar4, "map(...)");
                        return iVar4;
                    case 5:
                        lr6.f0 settings = (lr6.f0) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(settings, "settings");
                        k2Var.f9555c.f("CACHE_KEY_PROCESSING_SETTINGS", settings);
                        return Unit.f186387a;
                    case 6:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter((Unit) obj3, "<unused var>");
                        efm.d0<com.revolut.feature.freelancer.impl.network.models.l0> profileSettings = k2Var.f9553a.getProfileSettings();
                        z0 z0Var5 = new z0(new au0.j0(29), 12);
                        profileSettings.getClass();
                        ufm.i iVar5 = new ufm.i(profileSettings, z0Var5, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar5, "map(...)");
                        return iVar5;
                    case 7:
                        FreelancerProfileSettings settings2 = (FreelancerProfileSettings) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(settings2, "settings");
                        k2Var.f9555c.f("CACHE_KEY_PROFILE_SETTINGS", settings2);
                        return Unit.f186387a;
                    case 8:
                        FreelancerProfileSettings settings3 = (FreelancerProfileSettings) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(settings3, "settings");
                        ue0.c cVar = k2Var.d;
                        Map map = ft6.k.f137948a;
                        Intrinsics.checkNotNullParameter(settings3, "<this>");
                        String str = settings3.f73324a;
                        String str2 = settings3.f73328h;
                        String str3 = settings3.f73325b;
                        String str4 = settings3.f73326c;
                        String str5 = settings3.d;
                        long j2 = settings3.e;
                        String str6 = settings3.f;
                        String str7 = settings3.f73327g;
                        cVar.G(new com.revolut.feature.freelancer.impl.network.models.l0(str, str3, str4, str5, j2, str6, (str7 == null && str2 == null) ? null : new com.revolut.feature.freelancer.impl.network.models.r(new com.revolut.feature.freelancer.impl.network.models.w(str7, str2))), "STORAGE_KEY_FREELANCER_PROFILE_SETTINGS", wim.z.d(kotlin.jvm.internal.o0.b(com.revolut.feature.freelancer.impl.network.models.l0.class)));
                        return Unit.f186387a;
                    case 9:
                        List banners2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(banners2, "banners");
                        k2Var.f9555c.f("CACHE_FREELANCER_BANNERS", banners2);
                        return Unit.f186387a;
                    case 10:
                        List banners3 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(banners3, "banners");
                        ue0.c cVar2 = k2Var.d;
                        List<FreelancerBanner> list4 = banners3;
                        ArrayList arrayList3 = new ArrayList(zhm.w.t(list4, 10));
                        for (FreelancerBanner freelancerBanner : list4) {
                            Map map2 = ft6.k.f137948a;
                            Intrinsics.checkNotNullParameter(freelancerBanner, "<this>");
                            arrayList3.add(new du6.e(freelancerBanner.f73275a.name()));
                        }
                        cVar2.G(arrayList3, "STORAGE_KEY_FREELANCE_BANNERS", kii.e.o(du6.e.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                    case 11:
                        w4l.f DataObservableDelegate5 = (w4l.f) obj2;
                        Unit it11 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate5, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it11, "it");
                        efm.d0<List<com.revolut.feature.freelancer.impl.network.models.s>> annualInboundVolumes = k2Var.f9553a.getAnnualInboundVolumes();
                        z0 z0Var6 = new z0(new e2(0), 13);
                        annualInboundVolumes.getClass();
                        ufm.i iVar6 = new ufm.i(annualInboundVolumes, z0Var6, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar6, "map(...)");
                        return iVar6;
                    case 12:
                        List banners4 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(banners4, "banners");
                        k2Var.f9555c.f("CACHE_FREELANCER_INBOUND_VOLUMES", banners4);
                        return Unit.f186387a;
                    default:
                        List banners5 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(banners5, "banners");
                        ue0.c cVar3 = k2Var.d;
                        List<FreelancerInboundVolume> list5 = banners5;
                        ArrayList arrayList4 = new ArrayList(zhm.w.t(list5, 10));
                        for (FreelancerInboundVolume freelancerInboundVolume : list5) {
                            Map map3 = ft6.k.f137948a;
                            Intrinsics.checkNotNullParameter(freelancerInboundVolume, "<this>");
                            arrayList4.add(new du6.f(freelancerInboundVolume.f73288c, freelancerInboundVolume.f73286a, freelancerInboundVolume.f73287b));
                        }
                        cVar3.G(arrayList4, "STORAGE_KEY_FREELANCER_INBOUND_VOLUMES", kii.e.o(du6.f.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                }
            }
        }, new c2(this, 5), new Function2(this) { // from class: au6.d2

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ k2 f9515b;

            {
                this.f9515b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                List list;
                int i5 = i2;
                int i6 = 0;
                int i21 = 10;
                k2 k2Var = this.f9515b;
                switch (i5) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        efm.d0<List<com.revolut.feature.freelancer.impl.network.models.q>> banners = k2Var.f9553a.getBanners();
                        z0 z0Var = new z0(new e2(1), 14);
                        banners.getClass();
                        ufm.i iVar = new ufm.i(banners, z0Var, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 1:
                        FreelancerService freelancerService = k2Var.f9553a;
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        g2 param = (g2) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(param, "param");
                        if (param instanceof g2.a) {
                            efm.d0<List<com.revolut.feature.freelancer.impl.network.models.v>> orders = freelancerService.getOrders(null, null, null, null);
                            z0 z0Var2 = new z0(new c2(k2Var, i21), 15);
                            orders.getClass();
                            ufm.i iVar2 = new ufm.i(orders, z0Var2, 1);
                            Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                            return iVar2;
                        }
                        if (!(param instanceof h2)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        efm.d0<com.revolut.feature.freelancer.impl.network.models.v> order = freelancerService.getOrder(((h2) param).f9535a);
                        z0 z0Var3 = new z0(new c2(k2Var, i6), 9);
                        order.getClass();
                        ufm.i iVar3 = new ufm.i(order, z0Var3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return iVar3;
                    case 2:
                        g2 param2 = (g2) obj2;
                        List sales = (List) obj3;
                        Intrinsics.checkNotNullParameter(param2, "param");
                        Intrinsics.checkNotNullParameter(sales, "sales");
                        if (param2 instanceof g2.a) {
                            k2Var.f9555c.f("CACHE_KEY_SALES", sales);
                        } else {
                            if (!(param2 instanceof h2)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            FreelancerOrder freelancerOrder = (FreelancerOrder) zhm.d0.d0(sales);
                            if (freelancerOrder != null && (list = (List) k2Var.f9555c.get("CACHE_KEY_SALES")) != null) {
                                ne0.j jVar = k2Var.f9555c;
                                List list2 = list;
                                ArrayList arrayList = new ArrayList(zhm.w.t(list2, 10));
                                for (Object obj4 : list2) {
                                    if (Intrinsics.f(((FreelancerOrder) obj4).f73289a, freelancerOrder.f73289a)) {
                                        obj4 = freelancerOrder;
                                    }
                                    arrayList.add(obj4);
                                }
                                jVar.f("CACHE_KEY_SALES", arrayList);
                            }
                        }
                        return Unit.f186387a;
                    case 3:
                        List sales2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((g2) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(sales2, "sales");
                        is6.z zVar = k2Var.f9554b;
                        List list3 = sales2;
                        ArrayList arrayList2 = new ArrayList(zhm.w.t(list3, 10));
                        Iterator it9 = list3.iterator();
                        while (it9.hasNext()) {
                            arrayList2.add(ft6.u.d((FreelancerOrder) it9.next()));
                        }
                        zVar.getClass();
                        return Unit.f186387a;
                    case 4:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        Unit it10 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it10, "it");
                        efm.d0<com.revolut.feature.freelancer.impl.network.models.k0> processingSettings = k2Var.f9553a.getProcessingSettings();
                        z0 z0Var4 = new z0(new au0.j0(26), 11);
                        processingSettings.getClass();
                        ufm.i iVar4 = new ufm.i(processingSettings, z0Var4, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar4, "map(...)");
                        return iVar4;
                    case 5:
                        lr6.f0 settings = (lr6.f0) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(settings, "settings");
                        k2Var.f9555c.f("CACHE_KEY_PROCESSING_SETTINGS", settings);
                        return Unit.f186387a;
                    case 6:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter((Unit) obj3, "<unused var>");
                        efm.d0<com.revolut.feature.freelancer.impl.network.models.l0> profileSettings = k2Var.f9553a.getProfileSettings();
                        z0 z0Var5 = new z0(new au0.j0(29), 12);
                        profileSettings.getClass();
                        ufm.i iVar5 = new ufm.i(profileSettings, z0Var5, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar5, "map(...)");
                        return iVar5;
                    case 7:
                        FreelancerProfileSettings settings2 = (FreelancerProfileSettings) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(settings2, "settings");
                        k2Var.f9555c.f("CACHE_KEY_PROFILE_SETTINGS", settings2);
                        return Unit.f186387a;
                    case 8:
                        FreelancerProfileSettings settings3 = (FreelancerProfileSettings) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(settings3, "settings");
                        ue0.c cVar = k2Var.d;
                        Map map = ft6.k.f137948a;
                        Intrinsics.checkNotNullParameter(settings3, "<this>");
                        String str = settings3.f73324a;
                        String str2 = settings3.f73328h;
                        String str3 = settings3.f73325b;
                        String str4 = settings3.f73326c;
                        String str5 = settings3.d;
                        long j2 = settings3.e;
                        String str6 = settings3.f;
                        String str7 = settings3.f73327g;
                        cVar.G(new com.revolut.feature.freelancer.impl.network.models.l0(str, str3, str4, str5, j2, str6, (str7 == null && str2 == null) ? null : new com.revolut.feature.freelancer.impl.network.models.r(new com.revolut.feature.freelancer.impl.network.models.w(str7, str2))), "STORAGE_KEY_FREELANCER_PROFILE_SETTINGS", wim.z.d(kotlin.jvm.internal.o0.b(com.revolut.feature.freelancer.impl.network.models.l0.class)));
                        return Unit.f186387a;
                    case 9:
                        List banners2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(banners2, "banners");
                        k2Var.f9555c.f("CACHE_FREELANCER_BANNERS", banners2);
                        return Unit.f186387a;
                    case 10:
                        List banners3 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(banners3, "banners");
                        ue0.c cVar2 = k2Var.d;
                        List<FreelancerBanner> list4 = banners3;
                        ArrayList arrayList3 = new ArrayList(zhm.w.t(list4, 10));
                        for (FreelancerBanner freelancerBanner : list4) {
                            Map map2 = ft6.k.f137948a;
                            Intrinsics.checkNotNullParameter(freelancerBanner, "<this>");
                            arrayList3.add(new du6.e(freelancerBanner.f73275a.name()));
                        }
                        cVar2.G(arrayList3, "STORAGE_KEY_FREELANCE_BANNERS", kii.e.o(du6.e.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                    case 11:
                        w4l.f DataObservableDelegate5 = (w4l.f) obj2;
                        Unit it11 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate5, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it11, "it");
                        efm.d0<List<com.revolut.feature.freelancer.impl.network.models.s>> annualInboundVolumes = k2Var.f9553a.getAnnualInboundVolumes();
                        z0 z0Var6 = new z0(new e2(0), 13);
                        annualInboundVolumes.getClass();
                        ufm.i iVar6 = new ufm.i(annualInboundVolumes, z0Var6, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar6, "map(...)");
                        return iVar6;
                    case 12:
                        List banners4 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(banners4, "banners");
                        k2Var.f9555c.f("CACHE_FREELANCER_INBOUND_VOLUMES", banners4);
                        return Unit.f186387a;
                    default:
                        List banners5 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(banners5, "banners");
                        ue0.c cVar3 = k2Var.d;
                        List<FreelancerInboundVolume> list5 = banners5;
                        ArrayList arrayList4 = new ArrayList(zhm.w.t(list5, 10));
                        for (FreelancerInboundVolume freelancerInboundVolume : list5) {
                            Map map3 = ft6.k.f137948a;
                            Intrinsics.checkNotNullParameter(freelancerInboundVolume, "<this>");
                            arrayList4.add(new du6.f(freelancerInboundVolume.f73288c, freelancerInboundVolume.f73286a, freelancerInboundVolume.f73287b));
                        }
                        cVar3.G(arrayList4, "STORAGE_KEY_FREELANCER_INBOUND_VOLUMES", kii.e.o(du6.f.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                }
            }
        }, new c2(this, 7), new Function2(this) { // from class: au6.d2

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ k2 f9515b;

            {
                this.f9515b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                List list;
                int i5 = i3;
                int i6 = 0;
                int i21 = 10;
                k2 k2Var = this.f9515b;
                switch (i5) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        efm.d0<List<com.revolut.feature.freelancer.impl.network.models.q>> banners = k2Var.f9553a.getBanners();
                        z0 z0Var = new z0(new e2(1), 14);
                        banners.getClass();
                        ufm.i iVar = new ufm.i(banners, z0Var, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 1:
                        FreelancerService freelancerService = k2Var.f9553a;
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        g2 param = (g2) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(param, "param");
                        if (param instanceof g2.a) {
                            efm.d0<List<com.revolut.feature.freelancer.impl.network.models.v>> orders = freelancerService.getOrders(null, null, null, null);
                            z0 z0Var2 = new z0(new c2(k2Var, i21), 15);
                            orders.getClass();
                            ufm.i iVar2 = new ufm.i(orders, z0Var2, 1);
                            Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                            return iVar2;
                        }
                        if (!(param instanceof h2)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        efm.d0<com.revolut.feature.freelancer.impl.network.models.v> order = freelancerService.getOrder(((h2) param).f9535a);
                        z0 z0Var3 = new z0(new c2(k2Var, i6), 9);
                        order.getClass();
                        ufm.i iVar3 = new ufm.i(order, z0Var3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return iVar3;
                    case 2:
                        g2 param2 = (g2) obj2;
                        List sales = (List) obj3;
                        Intrinsics.checkNotNullParameter(param2, "param");
                        Intrinsics.checkNotNullParameter(sales, "sales");
                        if (param2 instanceof g2.a) {
                            k2Var.f9555c.f("CACHE_KEY_SALES", sales);
                        } else {
                            if (!(param2 instanceof h2)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            FreelancerOrder freelancerOrder = (FreelancerOrder) zhm.d0.d0(sales);
                            if (freelancerOrder != null && (list = (List) k2Var.f9555c.get("CACHE_KEY_SALES")) != null) {
                                ne0.j jVar = k2Var.f9555c;
                                List list2 = list;
                                ArrayList arrayList = new ArrayList(zhm.w.t(list2, 10));
                                for (Object obj4 : list2) {
                                    if (Intrinsics.f(((FreelancerOrder) obj4).f73289a, freelancerOrder.f73289a)) {
                                        obj4 = freelancerOrder;
                                    }
                                    arrayList.add(obj4);
                                }
                                jVar.f("CACHE_KEY_SALES", arrayList);
                            }
                        }
                        return Unit.f186387a;
                    case 3:
                        List sales2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((g2) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(sales2, "sales");
                        is6.z zVar = k2Var.f9554b;
                        List list3 = sales2;
                        ArrayList arrayList2 = new ArrayList(zhm.w.t(list3, 10));
                        Iterator it9 = list3.iterator();
                        while (it9.hasNext()) {
                            arrayList2.add(ft6.u.d((FreelancerOrder) it9.next()));
                        }
                        zVar.getClass();
                        return Unit.f186387a;
                    case 4:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        Unit it10 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it10, "it");
                        efm.d0<com.revolut.feature.freelancer.impl.network.models.k0> processingSettings = k2Var.f9553a.getProcessingSettings();
                        z0 z0Var4 = new z0(new au0.j0(26), 11);
                        processingSettings.getClass();
                        ufm.i iVar4 = new ufm.i(processingSettings, z0Var4, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar4, "map(...)");
                        return iVar4;
                    case 5:
                        lr6.f0 settings = (lr6.f0) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(settings, "settings");
                        k2Var.f9555c.f("CACHE_KEY_PROCESSING_SETTINGS", settings);
                        return Unit.f186387a;
                    case 6:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter((Unit) obj3, "<unused var>");
                        efm.d0<com.revolut.feature.freelancer.impl.network.models.l0> profileSettings = k2Var.f9553a.getProfileSettings();
                        z0 z0Var5 = new z0(new au0.j0(29), 12);
                        profileSettings.getClass();
                        ufm.i iVar5 = new ufm.i(profileSettings, z0Var5, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar5, "map(...)");
                        return iVar5;
                    case 7:
                        FreelancerProfileSettings settings2 = (FreelancerProfileSettings) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(settings2, "settings");
                        k2Var.f9555c.f("CACHE_KEY_PROFILE_SETTINGS", settings2);
                        return Unit.f186387a;
                    case 8:
                        FreelancerProfileSettings settings3 = (FreelancerProfileSettings) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(settings3, "settings");
                        ue0.c cVar = k2Var.d;
                        Map map = ft6.k.f137948a;
                        Intrinsics.checkNotNullParameter(settings3, "<this>");
                        String str = settings3.f73324a;
                        String str2 = settings3.f73328h;
                        String str3 = settings3.f73325b;
                        String str4 = settings3.f73326c;
                        String str5 = settings3.d;
                        long j2 = settings3.e;
                        String str6 = settings3.f;
                        String str7 = settings3.f73327g;
                        cVar.G(new com.revolut.feature.freelancer.impl.network.models.l0(str, str3, str4, str5, j2, str6, (str7 == null && str2 == null) ? null : new com.revolut.feature.freelancer.impl.network.models.r(new com.revolut.feature.freelancer.impl.network.models.w(str7, str2))), "STORAGE_KEY_FREELANCER_PROFILE_SETTINGS", wim.z.d(kotlin.jvm.internal.o0.b(com.revolut.feature.freelancer.impl.network.models.l0.class)));
                        return Unit.f186387a;
                    case 9:
                        List banners2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(banners2, "banners");
                        k2Var.f9555c.f("CACHE_FREELANCER_BANNERS", banners2);
                        return Unit.f186387a;
                    case 10:
                        List banners3 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(banners3, "banners");
                        ue0.c cVar2 = k2Var.d;
                        List<FreelancerBanner> list4 = banners3;
                        ArrayList arrayList3 = new ArrayList(zhm.w.t(list4, 10));
                        for (FreelancerBanner freelancerBanner : list4) {
                            Map map2 = ft6.k.f137948a;
                            Intrinsics.checkNotNullParameter(freelancerBanner, "<this>");
                            arrayList3.add(new du6.e(freelancerBanner.f73275a.name()));
                        }
                        cVar2.G(arrayList3, "STORAGE_KEY_FREELANCE_BANNERS", kii.e.o(du6.e.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                    case 11:
                        w4l.f DataObservableDelegate5 = (w4l.f) obj2;
                        Unit it11 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate5, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it11, "it");
                        efm.d0<List<com.revolut.feature.freelancer.impl.network.models.s>> annualInboundVolumes = k2Var.f9553a.getAnnualInboundVolumes();
                        z0 z0Var6 = new z0(new e2(0), 13);
                        annualInboundVolumes.getClass();
                        ufm.i iVar6 = new ufm.i(annualInboundVolumes, z0Var6, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar6, "map(...)");
                        return iVar6;
                    case 12:
                        List banners4 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(banners4, "banners");
                        k2Var.f9555c.f("CACHE_FREELANCER_INBOUND_VOLUMES", banners4);
                        return Unit.f186387a;
                    default:
                        List banners5 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(banners5, "banners");
                        ue0.c cVar3 = k2Var.d;
                        List<FreelancerInboundVolume> list5 = banners5;
                        ArrayList arrayList4 = new ArrayList(zhm.w.t(list5, 10));
                        for (FreelancerInboundVolume freelancerInboundVolume : list5) {
                            Map map3 = ft6.k.f137948a;
                            Intrinsics.checkNotNullParameter(freelancerInboundVolume, "<this>");
                            arrayList4.add(new du6.f(freelancerInboundVolume.f73288c, freelancerInboundVolume.f73286a, freelancerInboundVolume.f73287b));
                        }
                        cVar3.G(arrayList4, "STORAGE_KEY_FREELANCER_INBOUND_VOLUMES", kii.e.o(du6.f.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                }
            }
        }, null, null, null, BERTags.FLAGS);
        final int i5 = 11;
        final int i6 = 12;
        final int i21 = 13;
        this.f = new w4l.f(new Function2(this) { // from class: au6.d2

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ k2 f9515b;

            {
                this.f9515b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                List list;
                int i59 = i5;
                int i66 = 0;
                int i212 = 10;
                k2 k2Var = this.f9515b;
                switch (i59) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        efm.d0<List<com.revolut.feature.freelancer.impl.network.models.q>> banners = k2Var.f9553a.getBanners();
                        z0 z0Var = new z0(new e2(1), 14);
                        banners.getClass();
                        ufm.i iVar = new ufm.i(banners, z0Var, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 1:
                        FreelancerService freelancerService = k2Var.f9553a;
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        g2 param = (g2) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(param, "param");
                        if (param instanceof g2.a) {
                            efm.d0<List<com.revolut.feature.freelancer.impl.network.models.v>> orders = freelancerService.getOrders(null, null, null, null);
                            z0 z0Var2 = new z0(new c2(k2Var, i212), 15);
                            orders.getClass();
                            ufm.i iVar2 = new ufm.i(orders, z0Var2, 1);
                            Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                            return iVar2;
                        }
                        if (!(param instanceof h2)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        efm.d0<com.revolut.feature.freelancer.impl.network.models.v> order = freelancerService.getOrder(((h2) param).f9535a);
                        z0 z0Var3 = new z0(new c2(k2Var, i66), 9);
                        order.getClass();
                        ufm.i iVar3 = new ufm.i(order, z0Var3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return iVar3;
                    case 2:
                        g2 param2 = (g2) obj2;
                        List sales = (List) obj3;
                        Intrinsics.checkNotNullParameter(param2, "param");
                        Intrinsics.checkNotNullParameter(sales, "sales");
                        if (param2 instanceof g2.a) {
                            k2Var.f9555c.f("CACHE_KEY_SALES", sales);
                        } else {
                            if (!(param2 instanceof h2)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            FreelancerOrder freelancerOrder = (FreelancerOrder) zhm.d0.d0(sales);
                            if (freelancerOrder != null && (list = (List) k2Var.f9555c.get("CACHE_KEY_SALES")) != null) {
                                ne0.j jVar = k2Var.f9555c;
                                List list2 = list;
                                ArrayList arrayList = new ArrayList(zhm.w.t(list2, 10));
                                for (Object obj4 : list2) {
                                    if (Intrinsics.f(((FreelancerOrder) obj4).f73289a, freelancerOrder.f73289a)) {
                                        obj4 = freelancerOrder;
                                    }
                                    arrayList.add(obj4);
                                }
                                jVar.f("CACHE_KEY_SALES", arrayList);
                            }
                        }
                        return Unit.f186387a;
                    case 3:
                        List sales2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((g2) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(sales2, "sales");
                        is6.z zVar = k2Var.f9554b;
                        List list3 = sales2;
                        ArrayList arrayList2 = new ArrayList(zhm.w.t(list3, 10));
                        Iterator it9 = list3.iterator();
                        while (it9.hasNext()) {
                            arrayList2.add(ft6.u.d((FreelancerOrder) it9.next()));
                        }
                        zVar.getClass();
                        return Unit.f186387a;
                    case 4:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        Unit it10 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it10, "it");
                        efm.d0<com.revolut.feature.freelancer.impl.network.models.k0> processingSettings = k2Var.f9553a.getProcessingSettings();
                        z0 z0Var4 = new z0(new au0.j0(26), 11);
                        processingSettings.getClass();
                        ufm.i iVar4 = new ufm.i(processingSettings, z0Var4, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar4, "map(...)");
                        return iVar4;
                    case 5:
                        lr6.f0 settings = (lr6.f0) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(settings, "settings");
                        k2Var.f9555c.f("CACHE_KEY_PROCESSING_SETTINGS", settings);
                        return Unit.f186387a;
                    case 6:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter((Unit) obj3, "<unused var>");
                        efm.d0<com.revolut.feature.freelancer.impl.network.models.l0> profileSettings = k2Var.f9553a.getProfileSettings();
                        z0 z0Var5 = new z0(new au0.j0(29), 12);
                        profileSettings.getClass();
                        ufm.i iVar5 = new ufm.i(profileSettings, z0Var5, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar5, "map(...)");
                        return iVar5;
                    case 7:
                        FreelancerProfileSettings settings2 = (FreelancerProfileSettings) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(settings2, "settings");
                        k2Var.f9555c.f("CACHE_KEY_PROFILE_SETTINGS", settings2);
                        return Unit.f186387a;
                    case 8:
                        FreelancerProfileSettings settings3 = (FreelancerProfileSettings) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(settings3, "settings");
                        ue0.c cVar = k2Var.d;
                        Map map = ft6.k.f137948a;
                        Intrinsics.checkNotNullParameter(settings3, "<this>");
                        String str = settings3.f73324a;
                        String str2 = settings3.f73328h;
                        String str3 = settings3.f73325b;
                        String str4 = settings3.f73326c;
                        String str5 = settings3.d;
                        long j2 = settings3.e;
                        String str6 = settings3.f;
                        String str7 = settings3.f73327g;
                        cVar.G(new com.revolut.feature.freelancer.impl.network.models.l0(str, str3, str4, str5, j2, str6, (str7 == null && str2 == null) ? null : new com.revolut.feature.freelancer.impl.network.models.r(new com.revolut.feature.freelancer.impl.network.models.w(str7, str2))), "STORAGE_KEY_FREELANCER_PROFILE_SETTINGS", wim.z.d(kotlin.jvm.internal.o0.b(com.revolut.feature.freelancer.impl.network.models.l0.class)));
                        return Unit.f186387a;
                    case 9:
                        List banners2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(banners2, "banners");
                        k2Var.f9555c.f("CACHE_FREELANCER_BANNERS", banners2);
                        return Unit.f186387a;
                    case 10:
                        List banners3 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(banners3, "banners");
                        ue0.c cVar2 = k2Var.d;
                        List<FreelancerBanner> list4 = banners3;
                        ArrayList arrayList3 = new ArrayList(zhm.w.t(list4, 10));
                        for (FreelancerBanner freelancerBanner : list4) {
                            Map map2 = ft6.k.f137948a;
                            Intrinsics.checkNotNullParameter(freelancerBanner, "<this>");
                            arrayList3.add(new du6.e(freelancerBanner.f73275a.name()));
                        }
                        cVar2.G(arrayList3, "STORAGE_KEY_FREELANCE_BANNERS", kii.e.o(du6.e.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                    case 11:
                        w4l.f DataObservableDelegate5 = (w4l.f) obj2;
                        Unit it11 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate5, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it11, "it");
                        efm.d0<List<com.revolut.feature.freelancer.impl.network.models.s>> annualInboundVolumes = k2Var.f9553a.getAnnualInboundVolumes();
                        z0 z0Var6 = new z0(new e2(0), 13);
                        annualInboundVolumes.getClass();
                        ufm.i iVar6 = new ufm.i(annualInboundVolumes, z0Var6, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar6, "map(...)");
                        return iVar6;
                    case 12:
                        List banners4 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(banners4, "banners");
                        k2Var.f9555c.f("CACHE_FREELANCER_INBOUND_VOLUMES", banners4);
                        return Unit.f186387a;
                    default:
                        List banners5 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(banners5, "banners");
                        ue0.c cVar3 = k2Var.d;
                        List<FreelancerInboundVolume> list5 = banners5;
                        ArrayList arrayList4 = new ArrayList(zhm.w.t(list5, 10));
                        for (FreelancerInboundVolume freelancerInboundVolume : list5) {
                            Map map3 = ft6.k.f137948a;
                            Intrinsics.checkNotNullParameter(freelancerInboundVolume, "<this>");
                            arrayList4.add(new du6.f(freelancerInboundVolume.f73288c, freelancerInboundVolume.f73286a, freelancerInboundVolume.f73287b));
                        }
                        cVar3.G(arrayList4, "STORAGE_KEY_FREELANCER_INBOUND_VOLUMES", kii.e.o(du6.f.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                }
            }
        }, new c2(this, 8), new Function2(this) { // from class: au6.d2

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ k2 f9515b;

            {
                this.f9515b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                List list;
                int i59 = i6;
                int i66 = 0;
                int i212 = 10;
                k2 k2Var = this.f9515b;
                switch (i59) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        efm.d0<List<com.revolut.feature.freelancer.impl.network.models.q>> banners = k2Var.f9553a.getBanners();
                        z0 z0Var = new z0(new e2(1), 14);
                        banners.getClass();
                        ufm.i iVar = new ufm.i(banners, z0Var, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 1:
                        FreelancerService freelancerService = k2Var.f9553a;
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        g2 param = (g2) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(param, "param");
                        if (param instanceof g2.a) {
                            efm.d0<List<com.revolut.feature.freelancer.impl.network.models.v>> orders = freelancerService.getOrders(null, null, null, null);
                            z0 z0Var2 = new z0(new c2(k2Var, i212), 15);
                            orders.getClass();
                            ufm.i iVar2 = new ufm.i(orders, z0Var2, 1);
                            Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                            return iVar2;
                        }
                        if (!(param instanceof h2)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        efm.d0<com.revolut.feature.freelancer.impl.network.models.v> order = freelancerService.getOrder(((h2) param).f9535a);
                        z0 z0Var3 = new z0(new c2(k2Var, i66), 9);
                        order.getClass();
                        ufm.i iVar3 = new ufm.i(order, z0Var3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return iVar3;
                    case 2:
                        g2 param2 = (g2) obj2;
                        List sales = (List) obj3;
                        Intrinsics.checkNotNullParameter(param2, "param");
                        Intrinsics.checkNotNullParameter(sales, "sales");
                        if (param2 instanceof g2.a) {
                            k2Var.f9555c.f("CACHE_KEY_SALES", sales);
                        } else {
                            if (!(param2 instanceof h2)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            FreelancerOrder freelancerOrder = (FreelancerOrder) zhm.d0.d0(sales);
                            if (freelancerOrder != null && (list = (List) k2Var.f9555c.get("CACHE_KEY_SALES")) != null) {
                                ne0.j jVar = k2Var.f9555c;
                                List list2 = list;
                                ArrayList arrayList = new ArrayList(zhm.w.t(list2, 10));
                                for (Object obj4 : list2) {
                                    if (Intrinsics.f(((FreelancerOrder) obj4).f73289a, freelancerOrder.f73289a)) {
                                        obj4 = freelancerOrder;
                                    }
                                    arrayList.add(obj4);
                                }
                                jVar.f("CACHE_KEY_SALES", arrayList);
                            }
                        }
                        return Unit.f186387a;
                    case 3:
                        List sales2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((g2) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(sales2, "sales");
                        is6.z zVar = k2Var.f9554b;
                        List list3 = sales2;
                        ArrayList arrayList2 = new ArrayList(zhm.w.t(list3, 10));
                        Iterator it9 = list3.iterator();
                        while (it9.hasNext()) {
                            arrayList2.add(ft6.u.d((FreelancerOrder) it9.next()));
                        }
                        zVar.getClass();
                        return Unit.f186387a;
                    case 4:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        Unit it10 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it10, "it");
                        efm.d0<com.revolut.feature.freelancer.impl.network.models.k0> processingSettings = k2Var.f9553a.getProcessingSettings();
                        z0 z0Var4 = new z0(new au0.j0(26), 11);
                        processingSettings.getClass();
                        ufm.i iVar4 = new ufm.i(processingSettings, z0Var4, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar4, "map(...)");
                        return iVar4;
                    case 5:
                        lr6.f0 settings = (lr6.f0) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(settings, "settings");
                        k2Var.f9555c.f("CACHE_KEY_PROCESSING_SETTINGS", settings);
                        return Unit.f186387a;
                    case 6:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter((Unit) obj3, "<unused var>");
                        efm.d0<com.revolut.feature.freelancer.impl.network.models.l0> profileSettings = k2Var.f9553a.getProfileSettings();
                        z0 z0Var5 = new z0(new au0.j0(29), 12);
                        profileSettings.getClass();
                        ufm.i iVar5 = new ufm.i(profileSettings, z0Var5, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar5, "map(...)");
                        return iVar5;
                    case 7:
                        FreelancerProfileSettings settings2 = (FreelancerProfileSettings) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(settings2, "settings");
                        k2Var.f9555c.f("CACHE_KEY_PROFILE_SETTINGS", settings2);
                        return Unit.f186387a;
                    case 8:
                        FreelancerProfileSettings settings3 = (FreelancerProfileSettings) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(settings3, "settings");
                        ue0.c cVar = k2Var.d;
                        Map map = ft6.k.f137948a;
                        Intrinsics.checkNotNullParameter(settings3, "<this>");
                        String str = settings3.f73324a;
                        String str2 = settings3.f73328h;
                        String str3 = settings3.f73325b;
                        String str4 = settings3.f73326c;
                        String str5 = settings3.d;
                        long j2 = settings3.e;
                        String str6 = settings3.f;
                        String str7 = settings3.f73327g;
                        cVar.G(new com.revolut.feature.freelancer.impl.network.models.l0(str, str3, str4, str5, j2, str6, (str7 == null && str2 == null) ? null : new com.revolut.feature.freelancer.impl.network.models.r(new com.revolut.feature.freelancer.impl.network.models.w(str7, str2))), "STORAGE_KEY_FREELANCER_PROFILE_SETTINGS", wim.z.d(kotlin.jvm.internal.o0.b(com.revolut.feature.freelancer.impl.network.models.l0.class)));
                        return Unit.f186387a;
                    case 9:
                        List banners2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(banners2, "banners");
                        k2Var.f9555c.f("CACHE_FREELANCER_BANNERS", banners2);
                        return Unit.f186387a;
                    case 10:
                        List banners3 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(banners3, "banners");
                        ue0.c cVar2 = k2Var.d;
                        List<FreelancerBanner> list4 = banners3;
                        ArrayList arrayList3 = new ArrayList(zhm.w.t(list4, 10));
                        for (FreelancerBanner freelancerBanner : list4) {
                            Map map2 = ft6.k.f137948a;
                            Intrinsics.checkNotNullParameter(freelancerBanner, "<this>");
                            arrayList3.add(new du6.e(freelancerBanner.f73275a.name()));
                        }
                        cVar2.G(arrayList3, "STORAGE_KEY_FREELANCE_BANNERS", kii.e.o(du6.e.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                    case 11:
                        w4l.f DataObservableDelegate5 = (w4l.f) obj2;
                        Unit it11 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate5, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it11, "it");
                        efm.d0<List<com.revolut.feature.freelancer.impl.network.models.s>> annualInboundVolumes = k2Var.f9553a.getAnnualInboundVolumes();
                        z0 z0Var6 = new z0(new e2(0), 13);
                        annualInboundVolumes.getClass();
                        ufm.i iVar6 = new ufm.i(annualInboundVolumes, z0Var6, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar6, "map(...)");
                        return iVar6;
                    case 12:
                        List banners4 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(banners4, "banners");
                        k2Var.f9555c.f("CACHE_FREELANCER_INBOUND_VOLUMES", banners4);
                        return Unit.f186387a;
                    default:
                        List banners5 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(banners5, "banners");
                        ue0.c cVar3 = k2Var.d;
                        List<FreelancerInboundVolume> list5 = banners5;
                        ArrayList arrayList4 = new ArrayList(zhm.w.t(list5, 10));
                        for (FreelancerInboundVolume freelancerInboundVolume : list5) {
                            Map map3 = ft6.k.f137948a;
                            Intrinsics.checkNotNullParameter(freelancerInboundVolume, "<this>");
                            arrayList4.add(new du6.f(freelancerInboundVolume.f73288c, freelancerInboundVolume.f73286a, freelancerInboundVolume.f73287b));
                        }
                        cVar3.G(arrayList4, "STORAGE_KEY_FREELANCER_INBOUND_VOLUMES", kii.e.o(du6.f.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                }
            }
        }, new c2(this, 9), new Function2(this) { // from class: au6.d2

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ k2 f9515b;

            {
                this.f9515b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                List list;
                int i59 = i21;
                int i66 = 0;
                int i212 = 10;
                k2 k2Var = this.f9515b;
                switch (i59) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        efm.d0<List<com.revolut.feature.freelancer.impl.network.models.q>> banners = k2Var.f9553a.getBanners();
                        z0 z0Var = new z0(new e2(1), 14);
                        banners.getClass();
                        ufm.i iVar = new ufm.i(banners, z0Var, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 1:
                        FreelancerService freelancerService = k2Var.f9553a;
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        g2 param = (g2) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(param, "param");
                        if (param instanceof g2.a) {
                            efm.d0<List<com.revolut.feature.freelancer.impl.network.models.v>> orders = freelancerService.getOrders(null, null, null, null);
                            z0 z0Var2 = new z0(new c2(k2Var, i212), 15);
                            orders.getClass();
                            ufm.i iVar2 = new ufm.i(orders, z0Var2, 1);
                            Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                            return iVar2;
                        }
                        if (!(param instanceof h2)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        efm.d0<com.revolut.feature.freelancer.impl.network.models.v> order = freelancerService.getOrder(((h2) param).f9535a);
                        z0 z0Var3 = new z0(new c2(k2Var, i66), 9);
                        order.getClass();
                        ufm.i iVar3 = new ufm.i(order, z0Var3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return iVar3;
                    case 2:
                        g2 param2 = (g2) obj2;
                        List sales = (List) obj3;
                        Intrinsics.checkNotNullParameter(param2, "param");
                        Intrinsics.checkNotNullParameter(sales, "sales");
                        if (param2 instanceof g2.a) {
                            k2Var.f9555c.f("CACHE_KEY_SALES", sales);
                        } else {
                            if (!(param2 instanceof h2)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            FreelancerOrder freelancerOrder = (FreelancerOrder) zhm.d0.d0(sales);
                            if (freelancerOrder != null && (list = (List) k2Var.f9555c.get("CACHE_KEY_SALES")) != null) {
                                ne0.j jVar = k2Var.f9555c;
                                List list2 = list;
                                ArrayList arrayList = new ArrayList(zhm.w.t(list2, 10));
                                for (Object obj4 : list2) {
                                    if (Intrinsics.f(((FreelancerOrder) obj4).f73289a, freelancerOrder.f73289a)) {
                                        obj4 = freelancerOrder;
                                    }
                                    arrayList.add(obj4);
                                }
                                jVar.f("CACHE_KEY_SALES", arrayList);
                            }
                        }
                        return Unit.f186387a;
                    case 3:
                        List sales2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((g2) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(sales2, "sales");
                        is6.z zVar = k2Var.f9554b;
                        List list3 = sales2;
                        ArrayList arrayList2 = new ArrayList(zhm.w.t(list3, 10));
                        Iterator it9 = list3.iterator();
                        while (it9.hasNext()) {
                            arrayList2.add(ft6.u.d((FreelancerOrder) it9.next()));
                        }
                        zVar.getClass();
                        return Unit.f186387a;
                    case 4:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        Unit it10 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it10, "it");
                        efm.d0<com.revolut.feature.freelancer.impl.network.models.k0> processingSettings = k2Var.f9553a.getProcessingSettings();
                        z0 z0Var4 = new z0(new au0.j0(26), 11);
                        processingSettings.getClass();
                        ufm.i iVar4 = new ufm.i(processingSettings, z0Var4, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar4, "map(...)");
                        return iVar4;
                    case 5:
                        lr6.f0 settings = (lr6.f0) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(settings, "settings");
                        k2Var.f9555c.f("CACHE_KEY_PROCESSING_SETTINGS", settings);
                        return Unit.f186387a;
                    case 6:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter((Unit) obj3, "<unused var>");
                        efm.d0<com.revolut.feature.freelancer.impl.network.models.l0> profileSettings = k2Var.f9553a.getProfileSettings();
                        z0 z0Var5 = new z0(new au0.j0(29), 12);
                        profileSettings.getClass();
                        ufm.i iVar5 = new ufm.i(profileSettings, z0Var5, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar5, "map(...)");
                        return iVar5;
                    case 7:
                        FreelancerProfileSettings settings2 = (FreelancerProfileSettings) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(settings2, "settings");
                        k2Var.f9555c.f("CACHE_KEY_PROFILE_SETTINGS", settings2);
                        return Unit.f186387a;
                    case 8:
                        FreelancerProfileSettings settings3 = (FreelancerProfileSettings) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(settings3, "settings");
                        ue0.c cVar = k2Var.d;
                        Map map = ft6.k.f137948a;
                        Intrinsics.checkNotNullParameter(settings3, "<this>");
                        String str = settings3.f73324a;
                        String str2 = settings3.f73328h;
                        String str3 = settings3.f73325b;
                        String str4 = settings3.f73326c;
                        String str5 = settings3.d;
                        long j2 = settings3.e;
                        String str6 = settings3.f;
                        String str7 = settings3.f73327g;
                        cVar.G(new com.revolut.feature.freelancer.impl.network.models.l0(str, str3, str4, str5, j2, str6, (str7 == null && str2 == null) ? null : new com.revolut.feature.freelancer.impl.network.models.r(new com.revolut.feature.freelancer.impl.network.models.w(str7, str2))), "STORAGE_KEY_FREELANCER_PROFILE_SETTINGS", wim.z.d(kotlin.jvm.internal.o0.b(com.revolut.feature.freelancer.impl.network.models.l0.class)));
                        return Unit.f186387a;
                    case 9:
                        List banners2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(banners2, "banners");
                        k2Var.f9555c.f("CACHE_FREELANCER_BANNERS", banners2);
                        return Unit.f186387a;
                    case 10:
                        List banners3 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(banners3, "banners");
                        ue0.c cVar2 = k2Var.d;
                        List<FreelancerBanner> list4 = banners3;
                        ArrayList arrayList3 = new ArrayList(zhm.w.t(list4, 10));
                        for (FreelancerBanner freelancerBanner : list4) {
                            Map map2 = ft6.k.f137948a;
                            Intrinsics.checkNotNullParameter(freelancerBanner, "<this>");
                            arrayList3.add(new du6.e(freelancerBanner.f73275a.name()));
                        }
                        cVar2.G(arrayList3, "STORAGE_KEY_FREELANCE_BANNERS", kii.e.o(du6.e.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                    case 11:
                        w4l.f DataObservableDelegate5 = (w4l.f) obj2;
                        Unit it11 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate5, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it11, "it");
                        efm.d0<List<com.revolut.feature.freelancer.impl.network.models.s>> annualInboundVolumes = k2Var.f9553a.getAnnualInboundVolumes();
                        z0 z0Var6 = new z0(new e2(0), 13);
                        annualInboundVolumes.getClass();
                        ufm.i iVar6 = new ufm.i(annualInboundVolumes, z0Var6, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar6, "map(...)");
                        return iVar6;
                    case 12:
                        List banners4 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(banners4, "banners");
                        k2Var.f9555c.f("CACHE_FREELANCER_INBOUND_VOLUMES", banners4);
                        return Unit.f186387a;
                    default:
                        List banners5 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(banners5, "banners");
                        ue0.c cVar3 = k2Var.d;
                        List<FreelancerInboundVolume> list5 = banners5;
                        ArrayList arrayList4 = new ArrayList(zhm.w.t(list5, 10));
                        for (FreelancerInboundVolume freelancerInboundVolume : list5) {
                            Map map3 = ft6.k.f137948a;
                            Intrinsics.checkNotNullParameter(freelancerInboundVolume, "<this>");
                            arrayList4.add(new du6.f(freelancerInboundVolume.f73288c, freelancerInboundVolume.f73286a, freelancerInboundVolume.f73287b));
                        }
                        cVar3.G(arrayList4, "STORAGE_KEY_FREELANCER_INBOUND_VOLUMES", kii.e.o(du6.f.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                }
            }
        }, null, null, null, BERTags.FLAGS);
        final int i22 = 1;
        Function2 function2 = new Function2(this) { // from class: au6.d2

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ k2 f9515b;

            {
                this.f9515b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                List list;
                int i59 = i22;
                int i66 = 0;
                int i212 = 10;
                k2 k2Var = this.f9515b;
                switch (i59) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        efm.d0<List<com.revolut.feature.freelancer.impl.network.models.q>> banners = k2Var.f9553a.getBanners();
                        z0 z0Var = new z0(new e2(1), 14);
                        banners.getClass();
                        ufm.i iVar = new ufm.i(banners, z0Var, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 1:
                        FreelancerService freelancerService = k2Var.f9553a;
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        g2 param = (g2) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(param, "param");
                        if (param instanceof g2.a) {
                            efm.d0<List<com.revolut.feature.freelancer.impl.network.models.v>> orders = freelancerService.getOrders(null, null, null, null);
                            z0 z0Var2 = new z0(new c2(k2Var, i212), 15);
                            orders.getClass();
                            ufm.i iVar2 = new ufm.i(orders, z0Var2, 1);
                            Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                            return iVar2;
                        }
                        if (!(param instanceof h2)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        efm.d0<com.revolut.feature.freelancer.impl.network.models.v> order = freelancerService.getOrder(((h2) param).f9535a);
                        z0 z0Var3 = new z0(new c2(k2Var, i66), 9);
                        order.getClass();
                        ufm.i iVar3 = new ufm.i(order, z0Var3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return iVar3;
                    case 2:
                        g2 param2 = (g2) obj2;
                        List sales = (List) obj3;
                        Intrinsics.checkNotNullParameter(param2, "param");
                        Intrinsics.checkNotNullParameter(sales, "sales");
                        if (param2 instanceof g2.a) {
                            k2Var.f9555c.f("CACHE_KEY_SALES", sales);
                        } else {
                            if (!(param2 instanceof h2)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            FreelancerOrder freelancerOrder = (FreelancerOrder) zhm.d0.d0(sales);
                            if (freelancerOrder != null && (list = (List) k2Var.f9555c.get("CACHE_KEY_SALES")) != null) {
                                ne0.j jVar = k2Var.f9555c;
                                List list2 = list;
                                ArrayList arrayList = new ArrayList(zhm.w.t(list2, 10));
                                for (Object obj4 : list2) {
                                    if (Intrinsics.f(((FreelancerOrder) obj4).f73289a, freelancerOrder.f73289a)) {
                                        obj4 = freelancerOrder;
                                    }
                                    arrayList.add(obj4);
                                }
                                jVar.f("CACHE_KEY_SALES", arrayList);
                            }
                        }
                        return Unit.f186387a;
                    case 3:
                        List sales2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((g2) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(sales2, "sales");
                        is6.z zVar = k2Var.f9554b;
                        List list3 = sales2;
                        ArrayList arrayList2 = new ArrayList(zhm.w.t(list3, 10));
                        Iterator it9 = list3.iterator();
                        while (it9.hasNext()) {
                            arrayList2.add(ft6.u.d((FreelancerOrder) it9.next()));
                        }
                        zVar.getClass();
                        return Unit.f186387a;
                    case 4:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        Unit it10 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it10, "it");
                        efm.d0<com.revolut.feature.freelancer.impl.network.models.k0> processingSettings = k2Var.f9553a.getProcessingSettings();
                        z0 z0Var4 = new z0(new au0.j0(26), 11);
                        processingSettings.getClass();
                        ufm.i iVar4 = new ufm.i(processingSettings, z0Var4, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar4, "map(...)");
                        return iVar4;
                    case 5:
                        lr6.f0 settings = (lr6.f0) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(settings, "settings");
                        k2Var.f9555c.f("CACHE_KEY_PROCESSING_SETTINGS", settings);
                        return Unit.f186387a;
                    case 6:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter((Unit) obj3, "<unused var>");
                        efm.d0<com.revolut.feature.freelancer.impl.network.models.l0> profileSettings = k2Var.f9553a.getProfileSettings();
                        z0 z0Var5 = new z0(new au0.j0(29), 12);
                        profileSettings.getClass();
                        ufm.i iVar5 = new ufm.i(profileSettings, z0Var5, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar5, "map(...)");
                        return iVar5;
                    case 7:
                        FreelancerProfileSettings settings2 = (FreelancerProfileSettings) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(settings2, "settings");
                        k2Var.f9555c.f("CACHE_KEY_PROFILE_SETTINGS", settings2);
                        return Unit.f186387a;
                    case 8:
                        FreelancerProfileSettings settings3 = (FreelancerProfileSettings) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(settings3, "settings");
                        ue0.c cVar = k2Var.d;
                        Map map = ft6.k.f137948a;
                        Intrinsics.checkNotNullParameter(settings3, "<this>");
                        String str = settings3.f73324a;
                        String str2 = settings3.f73328h;
                        String str3 = settings3.f73325b;
                        String str4 = settings3.f73326c;
                        String str5 = settings3.d;
                        long j2 = settings3.e;
                        String str6 = settings3.f;
                        String str7 = settings3.f73327g;
                        cVar.G(new com.revolut.feature.freelancer.impl.network.models.l0(str, str3, str4, str5, j2, str6, (str7 == null && str2 == null) ? null : new com.revolut.feature.freelancer.impl.network.models.r(new com.revolut.feature.freelancer.impl.network.models.w(str7, str2))), "STORAGE_KEY_FREELANCER_PROFILE_SETTINGS", wim.z.d(kotlin.jvm.internal.o0.b(com.revolut.feature.freelancer.impl.network.models.l0.class)));
                        return Unit.f186387a;
                    case 9:
                        List banners2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(banners2, "banners");
                        k2Var.f9555c.f("CACHE_FREELANCER_BANNERS", banners2);
                        return Unit.f186387a;
                    case 10:
                        List banners3 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(banners3, "banners");
                        ue0.c cVar2 = k2Var.d;
                        List<FreelancerBanner> list4 = banners3;
                        ArrayList arrayList3 = new ArrayList(zhm.w.t(list4, 10));
                        for (FreelancerBanner freelancerBanner : list4) {
                            Map map2 = ft6.k.f137948a;
                            Intrinsics.checkNotNullParameter(freelancerBanner, "<this>");
                            arrayList3.add(new du6.e(freelancerBanner.f73275a.name()));
                        }
                        cVar2.G(arrayList3, "STORAGE_KEY_FREELANCE_BANNERS", kii.e.o(du6.e.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                    case 11:
                        w4l.f DataObservableDelegate5 = (w4l.f) obj2;
                        Unit it11 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate5, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it11, "it");
                        efm.d0<List<com.revolut.feature.freelancer.impl.network.models.s>> annualInboundVolumes = k2Var.f9553a.getAnnualInboundVolumes();
                        z0 z0Var6 = new z0(new e2(0), 13);
                        annualInboundVolumes.getClass();
                        ufm.i iVar6 = new ufm.i(annualInboundVolumes, z0Var6, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar6, "map(...)");
                        return iVar6;
                    case 12:
                        List banners4 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(banners4, "banners");
                        k2Var.f9555c.f("CACHE_FREELANCER_INBOUND_VOLUMES", banners4);
                        return Unit.f186387a;
                    default:
                        List banners5 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(banners5, "banners");
                        ue0.c cVar3 = k2Var.d;
                        List<FreelancerInboundVolume> list5 = banners5;
                        ArrayList arrayList4 = new ArrayList(zhm.w.t(list5, 10));
                        for (FreelancerInboundVolume freelancerInboundVolume : list5) {
                            Map map3 = ft6.k.f137948a;
                            Intrinsics.checkNotNullParameter(freelancerInboundVolume, "<this>");
                            arrayList4.add(new du6.f(freelancerInboundVolume.f73288c, freelancerInboundVolume.f73286a, freelancerInboundVolume.f73287b));
                        }
                        cVar3.G(arrayList4, "STORAGE_KEY_FREELANCER_INBOUND_VOLUMES", kii.e.o(du6.f.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                }
            }
        };
        c2 c2Var = new c2(this, i22);
        final int i32 = 2;
        Function2 function22 = new Function2(this) { // from class: au6.d2

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ k2 f9515b;

            {
                this.f9515b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                List list;
                int i59 = i32;
                int i66 = 0;
                int i212 = 10;
                k2 k2Var = this.f9515b;
                switch (i59) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        efm.d0<List<com.revolut.feature.freelancer.impl.network.models.q>> banners = k2Var.f9553a.getBanners();
                        z0 z0Var = new z0(new e2(1), 14);
                        banners.getClass();
                        ufm.i iVar = new ufm.i(banners, z0Var, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 1:
                        FreelancerService freelancerService = k2Var.f9553a;
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        g2 param = (g2) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(param, "param");
                        if (param instanceof g2.a) {
                            efm.d0<List<com.revolut.feature.freelancer.impl.network.models.v>> orders = freelancerService.getOrders(null, null, null, null);
                            z0 z0Var2 = new z0(new c2(k2Var, i212), 15);
                            orders.getClass();
                            ufm.i iVar2 = new ufm.i(orders, z0Var2, 1);
                            Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                            return iVar2;
                        }
                        if (!(param instanceof h2)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        efm.d0<com.revolut.feature.freelancer.impl.network.models.v> order = freelancerService.getOrder(((h2) param).f9535a);
                        z0 z0Var3 = new z0(new c2(k2Var, i66), 9);
                        order.getClass();
                        ufm.i iVar3 = new ufm.i(order, z0Var3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return iVar3;
                    case 2:
                        g2 param2 = (g2) obj2;
                        List sales = (List) obj3;
                        Intrinsics.checkNotNullParameter(param2, "param");
                        Intrinsics.checkNotNullParameter(sales, "sales");
                        if (param2 instanceof g2.a) {
                            k2Var.f9555c.f("CACHE_KEY_SALES", sales);
                        } else {
                            if (!(param2 instanceof h2)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            FreelancerOrder freelancerOrder = (FreelancerOrder) zhm.d0.d0(sales);
                            if (freelancerOrder != null && (list = (List) k2Var.f9555c.get("CACHE_KEY_SALES")) != null) {
                                ne0.j jVar = k2Var.f9555c;
                                List list2 = list;
                                ArrayList arrayList = new ArrayList(zhm.w.t(list2, 10));
                                for (Object obj4 : list2) {
                                    if (Intrinsics.f(((FreelancerOrder) obj4).f73289a, freelancerOrder.f73289a)) {
                                        obj4 = freelancerOrder;
                                    }
                                    arrayList.add(obj4);
                                }
                                jVar.f("CACHE_KEY_SALES", arrayList);
                            }
                        }
                        return Unit.f186387a;
                    case 3:
                        List sales2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((g2) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(sales2, "sales");
                        is6.z zVar = k2Var.f9554b;
                        List list3 = sales2;
                        ArrayList arrayList2 = new ArrayList(zhm.w.t(list3, 10));
                        Iterator it9 = list3.iterator();
                        while (it9.hasNext()) {
                            arrayList2.add(ft6.u.d((FreelancerOrder) it9.next()));
                        }
                        zVar.getClass();
                        return Unit.f186387a;
                    case 4:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        Unit it10 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it10, "it");
                        efm.d0<com.revolut.feature.freelancer.impl.network.models.k0> processingSettings = k2Var.f9553a.getProcessingSettings();
                        z0 z0Var4 = new z0(new au0.j0(26), 11);
                        processingSettings.getClass();
                        ufm.i iVar4 = new ufm.i(processingSettings, z0Var4, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar4, "map(...)");
                        return iVar4;
                    case 5:
                        lr6.f0 settings = (lr6.f0) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(settings, "settings");
                        k2Var.f9555c.f("CACHE_KEY_PROCESSING_SETTINGS", settings);
                        return Unit.f186387a;
                    case 6:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter((Unit) obj3, "<unused var>");
                        efm.d0<com.revolut.feature.freelancer.impl.network.models.l0> profileSettings = k2Var.f9553a.getProfileSettings();
                        z0 z0Var5 = new z0(new au0.j0(29), 12);
                        profileSettings.getClass();
                        ufm.i iVar5 = new ufm.i(profileSettings, z0Var5, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar5, "map(...)");
                        return iVar5;
                    case 7:
                        FreelancerProfileSettings settings2 = (FreelancerProfileSettings) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(settings2, "settings");
                        k2Var.f9555c.f("CACHE_KEY_PROFILE_SETTINGS", settings2);
                        return Unit.f186387a;
                    case 8:
                        FreelancerProfileSettings settings3 = (FreelancerProfileSettings) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(settings3, "settings");
                        ue0.c cVar = k2Var.d;
                        Map map = ft6.k.f137948a;
                        Intrinsics.checkNotNullParameter(settings3, "<this>");
                        String str = settings3.f73324a;
                        String str2 = settings3.f73328h;
                        String str3 = settings3.f73325b;
                        String str4 = settings3.f73326c;
                        String str5 = settings3.d;
                        long j2 = settings3.e;
                        String str6 = settings3.f;
                        String str7 = settings3.f73327g;
                        cVar.G(new com.revolut.feature.freelancer.impl.network.models.l0(str, str3, str4, str5, j2, str6, (str7 == null && str2 == null) ? null : new com.revolut.feature.freelancer.impl.network.models.r(new com.revolut.feature.freelancer.impl.network.models.w(str7, str2))), "STORAGE_KEY_FREELANCER_PROFILE_SETTINGS", wim.z.d(kotlin.jvm.internal.o0.b(com.revolut.feature.freelancer.impl.network.models.l0.class)));
                        return Unit.f186387a;
                    case 9:
                        List banners2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(banners2, "banners");
                        k2Var.f9555c.f("CACHE_FREELANCER_BANNERS", banners2);
                        return Unit.f186387a;
                    case 10:
                        List banners3 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(banners3, "banners");
                        ue0.c cVar2 = k2Var.d;
                        List<FreelancerBanner> list4 = banners3;
                        ArrayList arrayList3 = new ArrayList(zhm.w.t(list4, 10));
                        for (FreelancerBanner freelancerBanner : list4) {
                            Map map2 = ft6.k.f137948a;
                            Intrinsics.checkNotNullParameter(freelancerBanner, "<this>");
                            arrayList3.add(new du6.e(freelancerBanner.f73275a.name()));
                        }
                        cVar2.G(arrayList3, "STORAGE_KEY_FREELANCE_BANNERS", kii.e.o(du6.e.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                    case 11:
                        w4l.f DataObservableDelegate5 = (w4l.f) obj2;
                        Unit it11 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate5, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it11, "it");
                        efm.d0<List<com.revolut.feature.freelancer.impl.network.models.s>> annualInboundVolumes = k2Var.f9553a.getAnnualInboundVolumes();
                        z0 z0Var6 = new z0(new e2(0), 13);
                        annualInboundVolumes.getClass();
                        ufm.i iVar6 = new ufm.i(annualInboundVolumes, z0Var6, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar6, "map(...)");
                        return iVar6;
                    case 12:
                        List banners4 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(banners4, "banners");
                        k2Var.f9555c.f("CACHE_FREELANCER_INBOUND_VOLUMES", banners4);
                        return Unit.f186387a;
                    default:
                        List banners5 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(banners5, "banners");
                        ue0.c cVar3 = k2Var.d;
                        List<FreelancerInboundVolume> list5 = banners5;
                        ArrayList arrayList4 = new ArrayList(zhm.w.t(list5, 10));
                        for (FreelancerInboundVolume freelancerInboundVolume : list5) {
                            Map map3 = ft6.k.f137948a;
                            Intrinsics.checkNotNullParameter(freelancerInboundVolume, "<this>");
                            arrayList4.add(new du6.f(freelancerInboundVolume.f73288c, freelancerInboundVolume.f73286a, freelancerInboundVolume.f73287b));
                        }
                        cVar3.G(arrayList4, "STORAGE_KEY_FREELANCER_INBOUND_VOLUMES", kii.e.o(du6.f.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                }
            }
        };
        c2 c2Var2 = new c2(this, i32);
        final int i33 = 3;
        this.f9556g = new w4l.f(function2, c2Var, function22, c2Var2, new Function2(this) { // from class: au6.d2

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ k2 f9515b;

            {
                this.f9515b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                List list;
                int i59 = i33;
                int i66 = 0;
                int i212 = 10;
                k2 k2Var = this.f9515b;
                switch (i59) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        efm.d0<List<com.revolut.feature.freelancer.impl.network.models.q>> banners = k2Var.f9553a.getBanners();
                        z0 z0Var = new z0(new e2(1), 14);
                        banners.getClass();
                        ufm.i iVar = new ufm.i(banners, z0Var, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 1:
                        FreelancerService freelancerService = k2Var.f9553a;
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        g2 param = (g2) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(param, "param");
                        if (param instanceof g2.a) {
                            efm.d0<List<com.revolut.feature.freelancer.impl.network.models.v>> orders = freelancerService.getOrders(null, null, null, null);
                            z0 z0Var2 = new z0(new c2(k2Var, i212), 15);
                            orders.getClass();
                            ufm.i iVar2 = new ufm.i(orders, z0Var2, 1);
                            Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                            return iVar2;
                        }
                        if (!(param instanceof h2)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        efm.d0<com.revolut.feature.freelancer.impl.network.models.v> order = freelancerService.getOrder(((h2) param).f9535a);
                        z0 z0Var3 = new z0(new c2(k2Var, i66), 9);
                        order.getClass();
                        ufm.i iVar3 = new ufm.i(order, z0Var3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return iVar3;
                    case 2:
                        g2 param2 = (g2) obj2;
                        List sales = (List) obj3;
                        Intrinsics.checkNotNullParameter(param2, "param");
                        Intrinsics.checkNotNullParameter(sales, "sales");
                        if (param2 instanceof g2.a) {
                            k2Var.f9555c.f("CACHE_KEY_SALES", sales);
                        } else {
                            if (!(param2 instanceof h2)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            FreelancerOrder freelancerOrder = (FreelancerOrder) zhm.d0.d0(sales);
                            if (freelancerOrder != null && (list = (List) k2Var.f9555c.get("CACHE_KEY_SALES")) != null) {
                                ne0.j jVar = k2Var.f9555c;
                                List list2 = list;
                                ArrayList arrayList = new ArrayList(zhm.w.t(list2, 10));
                                for (Object obj4 : list2) {
                                    if (Intrinsics.f(((FreelancerOrder) obj4).f73289a, freelancerOrder.f73289a)) {
                                        obj4 = freelancerOrder;
                                    }
                                    arrayList.add(obj4);
                                }
                                jVar.f("CACHE_KEY_SALES", arrayList);
                            }
                        }
                        return Unit.f186387a;
                    case 3:
                        List sales2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((g2) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(sales2, "sales");
                        is6.z zVar = k2Var.f9554b;
                        List list3 = sales2;
                        ArrayList arrayList2 = new ArrayList(zhm.w.t(list3, 10));
                        Iterator it9 = list3.iterator();
                        while (it9.hasNext()) {
                            arrayList2.add(ft6.u.d((FreelancerOrder) it9.next()));
                        }
                        zVar.getClass();
                        return Unit.f186387a;
                    case 4:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        Unit it10 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it10, "it");
                        efm.d0<com.revolut.feature.freelancer.impl.network.models.k0> processingSettings = k2Var.f9553a.getProcessingSettings();
                        z0 z0Var4 = new z0(new au0.j0(26), 11);
                        processingSettings.getClass();
                        ufm.i iVar4 = new ufm.i(processingSettings, z0Var4, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar4, "map(...)");
                        return iVar4;
                    case 5:
                        lr6.f0 settings = (lr6.f0) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(settings, "settings");
                        k2Var.f9555c.f("CACHE_KEY_PROCESSING_SETTINGS", settings);
                        return Unit.f186387a;
                    case 6:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter((Unit) obj3, "<unused var>");
                        efm.d0<com.revolut.feature.freelancer.impl.network.models.l0> profileSettings = k2Var.f9553a.getProfileSettings();
                        z0 z0Var5 = new z0(new au0.j0(29), 12);
                        profileSettings.getClass();
                        ufm.i iVar5 = new ufm.i(profileSettings, z0Var5, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar5, "map(...)");
                        return iVar5;
                    case 7:
                        FreelancerProfileSettings settings2 = (FreelancerProfileSettings) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(settings2, "settings");
                        k2Var.f9555c.f("CACHE_KEY_PROFILE_SETTINGS", settings2);
                        return Unit.f186387a;
                    case 8:
                        FreelancerProfileSettings settings3 = (FreelancerProfileSettings) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(settings3, "settings");
                        ue0.c cVar = k2Var.d;
                        Map map = ft6.k.f137948a;
                        Intrinsics.checkNotNullParameter(settings3, "<this>");
                        String str = settings3.f73324a;
                        String str2 = settings3.f73328h;
                        String str3 = settings3.f73325b;
                        String str4 = settings3.f73326c;
                        String str5 = settings3.d;
                        long j2 = settings3.e;
                        String str6 = settings3.f;
                        String str7 = settings3.f73327g;
                        cVar.G(new com.revolut.feature.freelancer.impl.network.models.l0(str, str3, str4, str5, j2, str6, (str7 == null && str2 == null) ? null : new com.revolut.feature.freelancer.impl.network.models.r(new com.revolut.feature.freelancer.impl.network.models.w(str7, str2))), "STORAGE_KEY_FREELANCER_PROFILE_SETTINGS", wim.z.d(kotlin.jvm.internal.o0.b(com.revolut.feature.freelancer.impl.network.models.l0.class)));
                        return Unit.f186387a;
                    case 9:
                        List banners2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(banners2, "banners");
                        k2Var.f9555c.f("CACHE_FREELANCER_BANNERS", banners2);
                        return Unit.f186387a;
                    case 10:
                        List banners3 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(banners3, "banners");
                        ue0.c cVar2 = k2Var.d;
                        List<FreelancerBanner> list4 = banners3;
                        ArrayList arrayList3 = new ArrayList(zhm.w.t(list4, 10));
                        for (FreelancerBanner freelancerBanner : list4) {
                            Map map2 = ft6.k.f137948a;
                            Intrinsics.checkNotNullParameter(freelancerBanner, "<this>");
                            arrayList3.add(new du6.e(freelancerBanner.f73275a.name()));
                        }
                        cVar2.G(arrayList3, "STORAGE_KEY_FREELANCE_BANNERS", kii.e.o(du6.e.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                    case 11:
                        w4l.f DataObservableDelegate5 = (w4l.f) obj2;
                        Unit it11 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate5, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it11, "it");
                        efm.d0<List<com.revolut.feature.freelancer.impl.network.models.s>> annualInboundVolumes = k2Var.f9553a.getAnnualInboundVolumes();
                        z0 z0Var6 = new z0(new e2(0), 13);
                        annualInboundVolumes.getClass();
                        ufm.i iVar6 = new ufm.i(annualInboundVolumes, z0Var6, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar6, "map(...)");
                        return iVar6;
                    case 12:
                        List banners4 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(banners4, "banners");
                        k2Var.f9555c.f("CACHE_FREELANCER_INBOUND_VOLUMES", banners4);
                        return Unit.f186387a;
                    default:
                        List banners5 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(banners5, "banners");
                        ue0.c cVar3 = k2Var.d;
                        List<FreelancerInboundVolume> list5 = banners5;
                        ArrayList arrayList4 = new ArrayList(zhm.w.t(list5, 10));
                        for (FreelancerInboundVolume freelancerInboundVolume : list5) {
                            Map map3 = ft6.k.f137948a;
                            Intrinsics.checkNotNullParameter(freelancerInboundVolume, "<this>");
                            arrayList4.add(new du6.f(freelancerInboundVolume.f73288c, freelancerInboundVolume.f73286a, freelancerInboundVolume.f73287b));
                        }
                        cVar3.G(arrayList4, "STORAGE_KEY_FREELANCER_INBOUND_VOLUMES", kii.e.o(du6.f.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                }
            }
        }, null, null, null, BERTags.FLAGS);
        final int i43 = 4;
        final int i59 = 5;
        this.f9557h = new w4l.f(new Function2(this) { // from class: au6.d2

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ k2 f9515b;

            {
                this.f9515b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                List list;
                int i592 = i43;
                int i66 = 0;
                int i212 = 10;
                k2 k2Var = this.f9515b;
                switch (i592) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        efm.d0<List<com.revolut.feature.freelancer.impl.network.models.q>> banners = k2Var.f9553a.getBanners();
                        z0 z0Var = new z0(new e2(1), 14);
                        banners.getClass();
                        ufm.i iVar = new ufm.i(banners, z0Var, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 1:
                        FreelancerService freelancerService = k2Var.f9553a;
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        g2 param = (g2) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(param, "param");
                        if (param instanceof g2.a) {
                            efm.d0<List<com.revolut.feature.freelancer.impl.network.models.v>> orders = freelancerService.getOrders(null, null, null, null);
                            z0 z0Var2 = new z0(new c2(k2Var, i212), 15);
                            orders.getClass();
                            ufm.i iVar2 = new ufm.i(orders, z0Var2, 1);
                            Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                            return iVar2;
                        }
                        if (!(param instanceof h2)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        efm.d0<com.revolut.feature.freelancer.impl.network.models.v> order = freelancerService.getOrder(((h2) param).f9535a);
                        z0 z0Var3 = new z0(new c2(k2Var, i66), 9);
                        order.getClass();
                        ufm.i iVar3 = new ufm.i(order, z0Var3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return iVar3;
                    case 2:
                        g2 param2 = (g2) obj2;
                        List sales = (List) obj3;
                        Intrinsics.checkNotNullParameter(param2, "param");
                        Intrinsics.checkNotNullParameter(sales, "sales");
                        if (param2 instanceof g2.a) {
                            k2Var.f9555c.f("CACHE_KEY_SALES", sales);
                        } else {
                            if (!(param2 instanceof h2)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            FreelancerOrder freelancerOrder = (FreelancerOrder) zhm.d0.d0(sales);
                            if (freelancerOrder != null && (list = (List) k2Var.f9555c.get("CACHE_KEY_SALES")) != null) {
                                ne0.j jVar = k2Var.f9555c;
                                List list2 = list;
                                ArrayList arrayList = new ArrayList(zhm.w.t(list2, 10));
                                for (Object obj4 : list2) {
                                    if (Intrinsics.f(((FreelancerOrder) obj4).f73289a, freelancerOrder.f73289a)) {
                                        obj4 = freelancerOrder;
                                    }
                                    arrayList.add(obj4);
                                }
                                jVar.f("CACHE_KEY_SALES", arrayList);
                            }
                        }
                        return Unit.f186387a;
                    case 3:
                        List sales2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((g2) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(sales2, "sales");
                        is6.z zVar = k2Var.f9554b;
                        List list3 = sales2;
                        ArrayList arrayList2 = new ArrayList(zhm.w.t(list3, 10));
                        Iterator it9 = list3.iterator();
                        while (it9.hasNext()) {
                            arrayList2.add(ft6.u.d((FreelancerOrder) it9.next()));
                        }
                        zVar.getClass();
                        return Unit.f186387a;
                    case 4:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        Unit it10 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it10, "it");
                        efm.d0<com.revolut.feature.freelancer.impl.network.models.k0> processingSettings = k2Var.f9553a.getProcessingSettings();
                        z0 z0Var4 = new z0(new au0.j0(26), 11);
                        processingSettings.getClass();
                        ufm.i iVar4 = new ufm.i(processingSettings, z0Var4, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar4, "map(...)");
                        return iVar4;
                    case 5:
                        lr6.f0 settings = (lr6.f0) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(settings, "settings");
                        k2Var.f9555c.f("CACHE_KEY_PROCESSING_SETTINGS", settings);
                        return Unit.f186387a;
                    case 6:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter((Unit) obj3, "<unused var>");
                        efm.d0<com.revolut.feature.freelancer.impl.network.models.l0> profileSettings = k2Var.f9553a.getProfileSettings();
                        z0 z0Var5 = new z0(new au0.j0(29), 12);
                        profileSettings.getClass();
                        ufm.i iVar5 = new ufm.i(profileSettings, z0Var5, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar5, "map(...)");
                        return iVar5;
                    case 7:
                        FreelancerProfileSettings settings2 = (FreelancerProfileSettings) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(settings2, "settings");
                        k2Var.f9555c.f("CACHE_KEY_PROFILE_SETTINGS", settings2);
                        return Unit.f186387a;
                    case 8:
                        FreelancerProfileSettings settings3 = (FreelancerProfileSettings) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(settings3, "settings");
                        ue0.c cVar = k2Var.d;
                        Map map = ft6.k.f137948a;
                        Intrinsics.checkNotNullParameter(settings3, "<this>");
                        String str = settings3.f73324a;
                        String str2 = settings3.f73328h;
                        String str3 = settings3.f73325b;
                        String str4 = settings3.f73326c;
                        String str5 = settings3.d;
                        long j2 = settings3.e;
                        String str6 = settings3.f;
                        String str7 = settings3.f73327g;
                        cVar.G(new com.revolut.feature.freelancer.impl.network.models.l0(str, str3, str4, str5, j2, str6, (str7 == null && str2 == null) ? null : new com.revolut.feature.freelancer.impl.network.models.r(new com.revolut.feature.freelancer.impl.network.models.w(str7, str2))), "STORAGE_KEY_FREELANCER_PROFILE_SETTINGS", wim.z.d(kotlin.jvm.internal.o0.b(com.revolut.feature.freelancer.impl.network.models.l0.class)));
                        return Unit.f186387a;
                    case 9:
                        List banners2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(banners2, "banners");
                        k2Var.f9555c.f("CACHE_FREELANCER_BANNERS", banners2);
                        return Unit.f186387a;
                    case 10:
                        List banners3 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(banners3, "banners");
                        ue0.c cVar2 = k2Var.d;
                        List<FreelancerBanner> list4 = banners3;
                        ArrayList arrayList3 = new ArrayList(zhm.w.t(list4, 10));
                        for (FreelancerBanner freelancerBanner : list4) {
                            Map map2 = ft6.k.f137948a;
                            Intrinsics.checkNotNullParameter(freelancerBanner, "<this>");
                            arrayList3.add(new du6.e(freelancerBanner.f73275a.name()));
                        }
                        cVar2.G(arrayList3, "STORAGE_KEY_FREELANCE_BANNERS", kii.e.o(du6.e.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                    case 11:
                        w4l.f DataObservableDelegate5 = (w4l.f) obj2;
                        Unit it11 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate5, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it11, "it");
                        efm.d0<List<com.revolut.feature.freelancer.impl.network.models.s>> annualInboundVolumes = k2Var.f9553a.getAnnualInboundVolumes();
                        z0 z0Var6 = new z0(new e2(0), 13);
                        annualInboundVolumes.getClass();
                        ufm.i iVar6 = new ufm.i(annualInboundVolumes, z0Var6, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar6, "map(...)");
                        return iVar6;
                    case 12:
                        List banners4 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(banners4, "banners");
                        k2Var.f9555c.f("CACHE_FREELANCER_INBOUND_VOLUMES", banners4);
                        return Unit.f186387a;
                    default:
                        List banners5 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(banners5, "banners");
                        ue0.c cVar3 = k2Var.d;
                        List<FreelancerInboundVolume> list5 = banners5;
                        ArrayList arrayList4 = new ArrayList(zhm.w.t(list5, 10));
                        for (FreelancerInboundVolume freelancerInboundVolume : list5) {
                            Map map3 = ft6.k.f137948a;
                            Intrinsics.checkNotNullParameter(freelancerInboundVolume, "<this>");
                            arrayList4.add(new du6.f(freelancerInboundVolume.f73288c, freelancerInboundVolume.f73286a, freelancerInboundVolume.f73287b));
                        }
                        cVar3.G(arrayList4, "STORAGE_KEY_FREELANCER_INBOUND_VOLUMES", kii.e.o(du6.f.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                }
            }
        }, new c2(this, 3), new Function2(this) { // from class: au6.d2

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ k2 f9515b;

            {
                this.f9515b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                List list;
                int i592 = i59;
                int i66 = 0;
                int i212 = 10;
                k2 k2Var = this.f9515b;
                switch (i592) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        efm.d0<List<com.revolut.feature.freelancer.impl.network.models.q>> banners = k2Var.f9553a.getBanners();
                        z0 z0Var = new z0(new e2(1), 14);
                        banners.getClass();
                        ufm.i iVar = new ufm.i(banners, z0Var, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 1:
                        FreelancerService freelancerService = k2Var.f9553a;
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        g2 param = (g2) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(param, "param");
                        if (param instanceof g2.a) {
                            efm.d0<List<com.revolut.feature.freelancer.impl.network.models.v>> orders = freelancerService.getOrders(null, null, null, null);
                            z0 z0Var2 = new z0(new c2(k2Var, i212), 15);
                            orders.getClass();
                            ufm.i iVar2 = new ufm.i(orders, z0Var2, 1);
                            Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                            return iVar2;
                        }
                        if (!(param instanceof h2)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        efm.d0<com.revolut.feature.freelancer.impl.network.models.v> order = freelancerService.getOrder(((h2) param).f9535a);
                        z0 z0Var3 = new z0(new c2(k2Var, i66), 9);
                        order.getClass();
                        ufm.i iVar3 = new ufm.i(order, z0Var3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return iVar3;
                    case 2:
                        g2 param2 = (g2) obj2;
                        List sales = (List) obj3;
                        Intrinsics.checkNotNullParameter(param2, "param");
                        Intrinsics.checkNotNullParameter(sales, "sales");
                        if (param2 instanceof g2.a) {
                            k2Var.f9555c.f("CACHE_KEY_SALES", sales);
                        } else {
                            if (!(param2 instanceof h2)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            FreelancerOrder freelancerOrder = (FreelancerOrder) zhm.d0.d0(sales);
                            if (freelancerOrder != null && (list = (List) k2Var.f9555c.get("CACHE_KEY_SALES")) != null) {
                                ne0.j jVar = k2Var.f9555c;
                                List list2 = list;
                                ArrayList arrayList = new ArrayList(zhm.w.t(list2, 10));
                                for (Object obj4 : list2) {
                                    if (Intrinsics.f(((FreelancerOrder) obj4).f73289a, freelancerOrder.f73289a)) {
                                        obj4 = freelancerOrder;
                                    }
                                    arrayList.add(obj4);
                                }
                                jVar.f("CACHE_KEY_SALES", arrayList);
                            }
                        }
                        return Unit.f186387a;
                    case 3:
                        List sales2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((g2) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(sales2, "sales");
                        is6.z zVar = k2Var.f9554b;
                        List list3 = sales2;
                        ArrayList arrayList2 = new ArrayList(zhm.w.t(list3, 10));
                        Iterator it9 = list3.iterator();
                        while (it9.hasNext()) {
                            arrayList2.add(ft6.u.d((FreelancerOrder) it9.next()));
                        }
                        zVar.getClass();
                        return Unit.f186387a;
                    case 4:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        Unit it10 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it10, "it");
                        efm.d0<com.revolut.feature.freelancer.impl.network.models.k0> processingSettings = k2Var.f9553a.getProcessingSettings();
                        z0 z0Var4 = new z0(new au0.j0(26), 11);
                        processingSettings.getClass();
                        ufm.i iVar4 = new ufm.i(processingSettings, z0Var4, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar4, "map(...)");
                        return iVar4;
                    case 5:
                        lr6.f0 settings = (lr6.f0) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(settings, "settings");
                        k2Var.f9555c.f("CACHE_KEY_PROCESSING_SETTINGS", settings);
                        return Unit.f186387a;
                    case 6:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter((Unit) obj3, "<unused var>");
                        efm.d0<com.revolut.feature.freelancer.impl.network.models.l0> profileSettings = k2Var.f9553a.getProfileSettings();
                        z0 z0Var5 = new z0(new au0.j0(29), 12);
                        profileSettings.getClass();
                        ufm.i iVar5 = new ufm.i(profileSettings, z0Var5, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar5, "map(...)");
                        return iVar5;
                    case 7:
                        FreelancerProfileSettings settings2 = (FreelancerProfileSettings) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(settings2, "settings");
                        k2Var.f9555c.f("CACHE_KEY_PROFILE_SETTINGS", settings2);
                        return Unit.f186387a;
                    case 8:
                        FreelancerProfileSettings settings3 = (FreelancerProfileSettings) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(settings3, "settings");
                        ue0.c cVar = k2Var.d;
                        Map map = ft6.k.f137948a;
                        Intrinsics.checkNotNullParameter(settings3, "<this>");
                        String str = settings3.f73324a;
                        String str2 = settings3.f73328h;
                        String str3 = settings3.f73325b;
                        String str4 = settings3.f73326c;
                        String str5 = settings3.d;
                        long j2 = settings3.e;
                        String str6 = settings3.f;
                        String str7 = settings3.f73327g;
                        cVar.G(new com.revolut.feature.freelancer.impl.network.models.l0(str, str3, str4, str5, j2, str6, (str7 == null && str2 == null) ? null : new com.revolut.feature.freelancer.impl.network.models.r(new com.revolut.feature.freelancer.impl.network.models.w(str7, str2))), "STORAGE_KEY_FREELANCER_PROFILE_SETTINGS", wim.z.d(kotlin.jvm.internal.o0.b(com.revolut.feature.freelancer.impl.network.models.l0.class)));
                        return Unit.f186387a;
                    case 9:
                        List banners2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(banners2, "banners");
                        k2Var.f9555c.f("CACHE_FREELANCER_BANNERS", banners2);
                        return Unit.f186387a;
                    case 10:
                        List banners3 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(banners3, "banners");
                        ue0.c cVar2 = k2Var.d;
                        List<FreelancerBanner> list4 = banners3;
                        ArrayList arrayList3 = new ArrayList(zhm.w.t(list4, 10));
                        for (FreelancerBanner freelancerBanner : list4) {
                            Map map2 = ft6.k.f137948a;
                            Intrinsics.checkNotNullParameter(freelancerBanner, "<this>");
                            arrayList3.add(new du6.e(freelancerBanner.f73275a.name()));
                        }
                        cVar2.G(arrayList3, "STORAGE_KEY_FREELANCE_BANNERS", kii.e.o(du6.e.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                    case 11:
                        w4l.f DataObservableDelegate5 = (w4l.f) obj2;
                        Unit it11 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate5, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it11, "it");
                        efm.d0<List<com.revolut.feature.freelancer.impl.network.models.s>> annualInboundVolumes = k2Var.f9553a.getAnnualInboundVolumes();
                        z0 z0Var6 = new z0(new e2(0), 13);
                        annualInboundVolumes.getClass();
                        ufm.i iVar6 = new ufm.i(annualInboundVolumes, z0Var6, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar6, "map(...)");
                        return iVar6;
                    case 12:
                        List banners4 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(banners4, "banners");
                        k2Var.f9555c.f("CACHE_FREELANCER_INBOUND_VOLUMES", banners4);
                        return Unit.f186387a;
                    default:
                        List banners5 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(banners5, "banners");
                        ue0.c cVar3 = k2Var.d;
                        List<FreelancerInboundVolume> list5 = banners5;
                        ArrayList arrayList4 = new ArrayList(zhm.w.t(list5, 10));
                        for (FreelancerInboundVolume freelancerInboundVolume : list5) {
                            Map map3 = ft6.k.f137948a;
                            Intrinsics.checkNotNullParameter(freelancerInboundVolume, "<this>");
                            arrayList4.add(new du6.f(freelancerInboundVolume.f73288c, freelancerInboundVolume.f73286a, freelancerInboundVolume.f73287b));
                        }
                        cVar3.G(arrayList4, "STORAGE_KEY_FREELANCER_INBOUND_VOLUMES", kii.e.o(du6.f.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                }
            }
        }, null, null, null, null, null, Constants.TAG_FULL_SVPP_IDENTIFICATION);
        final int i66 = 6;
        final int i74 = 7;
        final int i92 = 8;
        this.i = new w4l.f(new Function2(this) { // from class: au6.d2

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ k2 f9515b;

            {
                this.f9515b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                List list;
                int i592 = i66;
                int i662 = 0;
                int i212 = 10;
                k2 k2Var = this.f9515b;
                switch (i592) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        efm.d0<List<com.revolut.feature.freelancer.impl.network.models.q>> banners = k2Var.f9553a.getBanners();
                        z0 z0Var = new z0(new e2(1), 14);
                        banners.getClass();
                        ufm.i iVar = new ufm.i(banners, z0Var, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 1:
                        FreelancerService freelancerService = k2Var.f9553a;
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        g2 param = (g2) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(param, "param");
                        if (param instanceof g2.a) {
                            efm.d0<List<com.revolut.feature.freelancer.impl.network.models.v>> orders = freelancerService.getOrders(null, null, null, null);
                            z0 z0Var2 = new z0(new c2(k2Var, i212), 15);
                            orders.getClass();
                            ufm.i iVar2 = new ufm.i(orders, z0Var2, 1);
                            Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                            return iVar2;
                        }
                        if (!(param instanceof h2)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        efm.d0<com.revolut.feature.freelancer.impl.network.models.v> order = freelancerService.getOrder(((h2) param).f9535a);
                        z0 z0Var3 = new z0(new c2(k2Var, i662), 9);
                        order.getClass();
                        ufm.i iVar3 = new ufm.i(order, z0Var3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return iVar3;
                    case 2:
                        g2 param2 = (g2) obj2;
                        List sales = (List) obj3;
                        Intrinsics.checkNotNullParameter(param2, "param");
                        Intrinsics.checkNotNullParameter(sales, "sales");
                        if (param2 instanceof g2.a) {
                            k2Var.f9555c.f("CACHE_KEY_SALES", sales);
                        } else {
                            if (!(param2 instanceof h2)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            FreelancerOrder freelancerOrder = (FreelancerOrder) zhm.d0.d0(sales);
                            if (freelancerOrder != null && (list = (List) k2Var.f9555c.get("CACHE_KEY_SALES")) != null) {
                                ne0.j jVar = k2Var.f9555c;
                                List list2 = list;
                                ArrayList arrayList = new ArrayList(zhm.w.t(list2, 10));
                                for (Object obj4 : list2) {
                                    if (Intrinsics.f(((FreelancerOrder) obj4).f73289a, freelancerOrder.f73289a)) {
                                        obj4 = freelancerOrder;
                                    }
                                    arrayList.add(obj4);
                                }
                                jVar.f("CACHE_KEY_SALES", arrayList);
                            }
                        }
                        return Unit.f186387a;
                    case 3:
                        List sales2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((g2) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(sales2, "sales");
                        is6.z zVar = k2Var.f9554b;
                        List list3 = sales2;
                        ArrayList arrayList2 = new ArrayList(zhm.w.t(list3, 10));
                        Iterator it9 = list3.iterator();
                        while (it9.hasNext()) {
                            arrayList2.add(ft6.u.d((FreelancerOrder) it9.next()));
                        }
                        zVar.getClass();
                        return Unit.f186387a;
                    case 4:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        Unit it10 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it10, "it");
                        efm.d0<com.revolut.feature.freelancer.impl.network.models.k0> processingSettings = k2Var.f9553a.getProcessingSettings();
                        z0 z0Var4 = new z0(new au0.j0(26), 11);
                        processingSettings.getClass();
                        ufm.i iVar4 = new ufm.i(processingSettings, z0Var4, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar4, "map(...)");
                        return iVar4;
                    case 5:
                        lr6.f0 settings = (lr6.f0) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(settings, "settings");
                        k2Var.f9555c.f("CACHE_KEY_PROCESSING_SETTINGS", settings);
                        return Unit.f186387a;
                    case 6:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter((Unit) obj3, "<unused var>");
                        efm.d0<com.revolut.feature.freelancer.impl.network.models.l0> profileSettings = k2Var.f9553a.getProfileSettings();
                        z0 z0Var5 = new z0(new au0.j0(29), 12);
                        profileSettings.getClass();
                        ufm.i iVar5 = new ufm.i(profileSettings, z0Var5, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar5, "map(...)");
                        return iVar5;
                    case 7:
                        FreelancerProfileSettings settings2 = (FreelancerProfileSettings) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(settings2, "settings");
                        k2Var.f9555c.f("CACHE_KEY_PROFILE_SETTINGS", settings2);
                        return Unit.f186387a;
                    case 8:
                        FreelancerProfileSettings settings3 = (FreelancerProfileSettings) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(settings3, "settings");
                        ue0.c cVar = k2Var.d;
                        Map map = ft6.k.f137948a;
                        Intrinsics.checkNotNullParameter(settings3, "<this>");
                        String str = settings3.f73324a;
                        String str2 = settings3.f73328h;
                        String str3 = settings3.f73325b;
                        String str4 = settings3.f73326c;
                        String str5 = settings3.d;
                        long j2 = settings3.e;
                        String str6 = settings3.f;
                        String str7 = settings3.f73327g;
                        cVar.G(new com.revolut.feature.freelancer.impl.network.models.l0(str, str3, str4, str5, j2, str6, (str7 == null && str2 == null) ? null : new com.revolut.feature.freelancer.impl.network.models.r(new com.revolut.feature.freelancer.impl.network.models.w(str7, str2))), "STORAGE_KEY_FREELANCER_PROFILE_SETTINGS", wim.z.d(kotlin.jvm.internal.o0.b(com.revolut.feature.freelancer.impl.network.models.l0.class)));
                        return Unit.f186387a;
                    case 9:
                        List banners2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(banners2, "banners");
                        k2Var.f9555c.f("CACHE_FREELANCER_BANNERS", banners2);
                        return Unit.f186387a;
                    case 10:
                        List banners3 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(banners3, "banners");
                        ue0.c cVar2 = k2Var.d;
                        List<FreelancerBanner> list4 = banners3;
                        ArrayList arrayList3 = new ArrayList(zhm.w.t(list4, 10));
                        for (FreelancerBanner freelancerBanner : list4) {
                            Map map2 = ft6.k.f137948a;
                            Intrinsics.checkNotNullParameter(freelancerBanner, "<this>");
                            arrayList3.add(new du6.e(freelancerBanner.f73275a.name()));
                        }
                        cVar2.G(arrayList3, "STORAGE_KEY_FREELANCE_BANNERS", kii.e.o(du6.e.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                    case 11:
                        w4l.f DataObservableDelegate5 = (w4l.f) obj2;
                        Unit it11 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate5, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it11, "it");
                        efm.d0<List<com.revolut.feature.freelancer.impl.network.models.s>> annualInboundVolumes = k2Var.f9553a.getAnnualInboundVolumes();
                        z0 z0Var6 = new z0(new e2(0), 13);
                        annualInboundVolumes.getClass();
                        ufm.i iVar6 = new ufm.i(annualInboundVolumes, z0Var6, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar6, "map(...)");
                        return iVar6;
                    case 12:
                        List banners4 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(banners4, "banners");
                        k2Var.f9555c.f("CACHE_FREELANCER_INBOUND_VOLUMES", banners4);
                        return Unit.f186387a;
                    default:
                        List banners5 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(banners5, "banners");
                        ue0.c cVar3 = k2Var.d;
                        List<FreelancerInboundVolume> list5 = banners5;
                        ArrayList arrayList4 = new ArrayList(zhm.w.t(list5, 10));
                        for (FreelancerInboundVolume freelancerInboundVolume : list5) {
                            Map map3 = ft6.k.f137948a;
                            Intrinsics.checkNotNullParameter(freelancerInboundVolume, "<this>");
                            arrayList4.add(new du6.f(freelancerInboundVolume.f73288c, freelancerInboundVolume.f73286a, freelancerInboundVolume.f73287b));
                        }
                        cVar3.G(arrayList4, "STORAGE_KEY_FREELANCER_INBOUND_VOLUMES", kii.e.o(du6.f.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                }
            }
        }, new c2(this, 4), new Function2(this) { // from class: au6.d2

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ k2 f9515b;

            {
                this.f9515b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                List list;
                int i592 = i74;
                int i662 = 0;
                int i212 = 10;
                k2 k2Var = this.f9515b;
                switch (i592) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        efm.d0<List<com.revolut.feature.freelancer.impl.network.models.q>> banners = k2Var.f9553a.getBanners();
                        z0 z0Var = new z0(new e2(1), 14);
                        banners.getClass();
                        ufm.i iVar = new ufm.i(banners, z0Var, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 1:
                        FreelancerService freelancerService = k2Var.f9553a;
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        g2 param = (g2) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(param, "param");
                        if (param instanceof g2.a) {
                            efm.d0<List<com.revolut.feature.freelancer.impl.network.models.v>> orders = freelancerService.getOrders(null, null, null, null);
                            z0 z0Var2 = new z0(new c2(k2Var, i212), 15);
                            orders.getClass();
                            ufm.i iVar2 = new ufm.i(orders, z0Var2, 1);
                            Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                            return iVar2;
                        }
                        if (!(param instanceof h2)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        efm.d0<com.revolut.feature.freelancer.impl.network.models.v> order = freelancerService.getOrder(((h2) param).f9535a);
                        z0 z0Var3 = new z0(new c2(k2Var, i662), 9);
                        order.getClass();
                        ufm.i iVar3 = new ufm.i(order, z0Var3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return iVar3;
                    case 2:
                        g2 param2 = (g2) obj2;
                        List sales = (List) obj3;
                        Intrinsics.checkNotNullParameter(param2, "param");
                        Intrinsics.checkNotNullParameter(sales, "sales");
                        if (param2 instanceof g2.a) {
                            k2Var.f9555c.f("CACHE_KEY_SALES", sales);
                        } else {
                            if (!(param2 instanceof h2)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            FreelancerOrder freelancerOrder = (FreelancerOrder) zhm.d0.d0(sales);
                            if (freelancerOrder != null && (list = (List) k2Var.f9555c.get("CACHE_KEY_SALES")) != null) {
                                ne0.j jVar = k2Var.f9555c;
                                List list2 = list;
                                ArrayList arrayList = new ArrayList(zhm.w.t(list2, 10));
                                for (Object obj4 : list2) {
                                    if (Intrinsics.f(((FreelancerOrder) obj4).f73289a, freelancerOrder.f73289a)) {
                                        obj4 = freelancerOrder;
                                    }
                                    arrayList.add(obj4);
                                }
                                jVar.f("CACHE_KEY_SALES", arrayList);
                            }
                        }
                        return Unit.f186387a;
                    case 3:
                        List sales2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((g2) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(sales2, "sales");
                        is6.z zVar = k2Var.f9554b;
                        List list3 = sales2;
                        ArrayList arrayList2 = new ArrayList(zhm.w.t(list3, 10));
                        Iterator it9 = list3.iterator();
                        while (it9.hasNext()) {
                            arrayList2.add(ft6.u.d((FreelancerOrder) it9.next()));
                        }
                        zVar.getClass();
                        return Unit.f186387a;
                    case 4:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        Unit it10 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it10, "it");
                        efm.d0<com.revolut.feature.freelancer.impl.network.models.k0> processingSettings = k2Var.f9553a.getProcessingSettings();
                        z0 z0Var4 = new z0(new au0.j0(26), 11);
                        processingSettings.getClass();
                        ufm.i iVar4 = new ufm.i(processingSettings, z0Var4, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar4, "map(...)");
                        return iVar4;
                    case 5:
                        lr6.f0 settings = (lr6.f0) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(settings, "settings");
                        k2Var.f9555c.f("CACHE_KEY_PROCESSING_SETTINGS", settings);
                        return Unit.f186387a;
                    case 6:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter((Unit) obj3, "<unused var>");
                        efm.d0<com.revolut.feature.freelancer.impl.network.models.l0> profileSettings = k2Var.f9553a.getProfileSettings();
                        z0 z0Var5 = new z0(new au0.j0(29), 12);
                        profileSettings.getClass();
                        ufm.i iVar5 = new ufm.i(profileSettings, z0Var5, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar5, "map(...)");
                        return iVar5;
                    case 7:
                        FreelancerProfileSettings settings2 = (FreelancerProfileSettings) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(settings2, "settings");
                        k2Var.f9555c.f("CACHE_KEY_PROFILE_SETTINGS", settings2);
                        return Unit.f186387a;
                    case 8:
                        FreelancerProfileSettings settings3 = (FreelancerProfileSettings) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(settings3, "settings");
                        ue0.c cVar = k2Var.d;
                        Map map = ft6.k.f137948a;
                        Intrinsics.checkNotNullParameter(settings3, "<this>");
                        String str = settings3.f73324a;
                        String str2 = settings3.f73328h;
                        String str3 = settings3.f73325b;
                        String str4 = settings3.f73326c;
                        String str5 = settings3.d;
                        long j2 = settings3.e;
                        String str6 = settings3.f;
                        String str7 = settings3.f73327g;
                        cVar.G(new com.revolut.feature.freelancer.impl.network.models.l0(str, str3, str4, str5, j2, str6, (str7 == null && str2 == null) ? null : new com.revolut.feature.freelancer.impl.network.models.r(new com.revolut.feature.freelancer.impl.network.models.w(str7, str2))), "STORAGE_KEY_FREELANCER_PROFILE_SETTINGS", wim.z.d(kotlin.jvm.internal.o0.b(com.revolut.feature.freelancer.impl.network.models.l0.class)));
                        return Unit.f186387a;
                    case 9:
                        List banners2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(banners2, "banners");
                        k2Var.f9555c.f("CACHE_FREELANCER_BANNERS", banners2);
                        return Unit.f186387a;
                    case 10:
                        List banners3 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(banners3, "banners");
                        ue0.c cVar2 = k2Var.d;
                        List<FreelancerBanner> list4 = banners3;
                        ArrayList arrayList3 = new ArrayList(zhm.w.t(list4, 10));
                        for (FreelancerBanner freelancerBanner : list4) {
                            Map map2 = ft6.k.f137948a;
                            Intrinsics.checkNotNullParameter(freelancerBanner, "<this>");
                            arrayList3.add(new du6.e(freelancerBanner.f73275a.name()));
                        }
                        cVar2.G(arrayList3, "STORAGE_KEY_FREELANCE_BANNERS", kii.e.o(du6.e.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                    case 11:
                        w4l.f DataObservableDelegate5 = (w4l.f) obj2;
                        Unit it11 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate5, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it11, "it");
                        efm.d0<List<com.revolut.feature.freelancer.impl.network.models.s>> annualInboundVolumes = k2Var.f9553a.getAnnualInboundVolumes();
                        z0 z0Var6 = new z0(new e2(0), 13);
                        annualInboundVolumes.getClass();
                        ufm.i iVar6 = new ufm.i(annualInboundVolumes, z0Var6, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar6, "map(...)");
                        return iVar6;
                    case 12:
                        List banners4 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(banners4, "banners");
                        k2Var.f9555c.f("CACHE_FREELANCER_INBOUND_VOLUMES", banners4);
                        return Unit.f186387a;
                    default:
                        List banners5 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(banners5, "banners");
                        ue0.c cVar3 = k2Var.d;
                        List<FreelancerInboundVolume> list5 = banners5;
                        ArrayList arrayList4 = new ArrayList(zhm.w.t(list5, 10));
                        for (FreelancerInboundVolume freelancerInboundVolume : list5) {
                            Map map3 = ft6.k.f137948a;
                            Intrinsics.checkNotNullParameter(freelancerInboundVolume, "<this>");
                            arrayList4.add(new du6.f(freelancerInboundVolume.f73288c, freelancerInboundVolume.f73286a, freelancerInboundVolume.f73287b));
                        }
                        cVar3.G(arrayList4, "STORAGE_KEY_FREELANCER_INBOUND_VOLUMES", kii.e.o(du6.f.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                }
            }
        }, new c2(this, 6), new Function2(this) { // from class: au6.d2

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ k2 f9515b;

            {
                this.f9515b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                List list;
                int i592 = i92;
                int i662 = 0;
                int i212 = 10;
                k2 k2Var = this.f9515b;
                switch (i592) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        efm.d0<List<com.revolut.feature.freelancer.impl.network.models.q>> banners = k2Var.f9553a.getBanners();
                        z0 z0Var = new z0(new e2(1), 14);
                        banners.getClass();
                        ufm.i iVar = new ufm.i(banners, z0Var, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 1:
                        FreelancerService freelancerService = k2Var.f9553a;
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        g2 param = (g2) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(param, "param");
                        if (param instanceof g2.a) {
                            efm.d0<List<com.revolut.feature.freelancer.impl.network.models.v>> orders = freelancerService.getOrders(null, null, null, null);
                            z0 z0Var2 = new z0(new c2(k2Var, i212), 15);
                            orders.getClass();
                            ufm.i iVar2 = new ufm.i(orders, z0Var2, 1);
                            Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                            return iVar2;
                        }
                        if (!(param instanceof h2)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        efm.d0<com.revolut.feature.freelancer.impl.network.models.v> order = freelancerService.getOrder(((h2) param).f9535a);
                        z0 z0Var3 = new z0(new c2(k2Var, i662), 9);
                        order.getClass();
                        ufm.i iVar3 = new ufm.i(order, z0Var3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return iVar3;
                    case 2:
                        g2 param2 = (g2) obj2;
                        List sales = (List) obj3;
                        Intrinsics.checkNotNullParameter(param2, "param");
                        Intrinsics.checkNotNullParameter(sales, "sales");
                        if (param2 instanceof g2.a) {
                            k2Var.f9555c.f("CACHE_KEY_SALES", sales);
                        } else {
                            if (!(param2 instanceof h2)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            FreelancerOrder freelancerOrder = (FreelancerOrder) zhm.d0.d0(sales);
                            if (freelancerOrder != null && (list = (List) k2Var.f9555c.get("CACHE_KEY_SALES")) != null) {
                                ne0.j jVar = k2Var.f9555c;
                                List list2 = list;
                                ArrayList arrayList = new ArrayList(zhm.w.t(list2, 10));
                                for (Object obj4 : list2) {
                                    if (Intrinsics.f(((FreelancerOrder) obj4).f73289a, freelancerOrder.f73289a)) {
                                        obj4 = freelancerOrder;
                                    }
                                    arrayList.add(obj4);
                                }
                                jVar.f("CACHE_KEY_SALES", arrayList);
                            }
                        }
                        return Unit.f186387a;
                    case 3:
                        List sales2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((g2) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(sales2, "sales");
                        is6.z zVar = k2Var.f9554b;
                        List list3 = sales2;
                        ArrayList arrayList2 = new ArrayList(zhm.w.t(list3, 10));
                        Iterator it9 = list3.iterator();
                        while (it9.hasNext()) {
                            arrayList2.add(ft6.u.d((FreelancerOrder) it9.next()));
                        }
                        zVar.getClass();
                        return Unit.f186387a;
                    case 4:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        Unit it10 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it10, "it");
                        efm.d0<com.revolut.feature.freelancer.impl.network.models.k0> processingSettings = k2Var.f9553a.getProcessingSettings();
                        z0 z0Var4 = new z0(new au0.j0(26), 11);
                        processingSettings.getClass();
                        ufm.i iVar4 = new ufm.i(processingSettings, z0Var4, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar4, "map(...)");
                        return iVar4;
                    case 5:
                        lr6.f0 settings = (lr6.f0) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(settings, "settings");
                        k2Var.f9555c.f("CACHE_KEY_PROCESSING_SETTINGS", settings);
                        return Unit.f186387a;
                    case 6:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter((Unit) obj3, "<unused var>");
                        efm.d0<com.revolut.feature.freelancer.impl.network.models.l0> profileSettings = k2Var.f9553a.getProfileSettings();
                        z0 z0Var5 = new z0(new au0.j0(29), 12);
                        profileSettings.getClass();
                        ufm.i iVar5 = new ufm.i(profileSettings, z0Var5, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar5, "map(...)");
                        return iVar5;
                    case 7:
                        FreelancerProfileSettings settings2 = (FreelancerProfileSettings) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(settings2, "settings");
                        k2Var.f9555c.f("CACHE_KEY_PROFILE_SETTINGS", settings2);
                        return Unit.f186387a;
                    case 8:
                        FreelancerProfileSettings settings3 = (FreelancerProfileSettings) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(settings3, "settings");
                        ue0.c cVar = k2Var.d;
                        Map map = ft6.k.f137948a;
                        Intrinsics.checkNotNullParameter(settings3, "<this>");
                        String str = settings3.f73324a;
                        String str2 = settings3.f73328h;
                        String str3 = settings3.f73325b;
                        String str4 = settings3.f73326c;
                        String str5 = settings3.d;
                        long j2 = settings3.e;
                        String str6 = settings3.f;
                        String str7 = settings3.f73327g;
                        cVar.G(new com.revolut.feature.freelancer.impl.network.models.l0(str, str3, str4, str5, j2, str6, (str7 == null && str2 == null) ? null : new com.revolut.feature.freelancer.impl.network.models.r(new com.revolut.feature.freelancer.impl.network.models.w(str7, str2))), "STORAGE_KEY_FREELANCER_PROFILE_SETTINGS", wim.z.d(kotlin.jvm.internal.o0.b(com.revolut.feature.freelancer.impl.network.models.l0.class)));
                        return Unit.f186387a;
                    case 9:
                        List banners2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(banners2, "banners");
                        k2Var.f9555c.f("CACHE_FREELANCER_BANNERS", banners2);
                        return Unit.f186387a;
                    case 10:
                        List banners3 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(banners3, "banners");
                        ue0.c cVar2 = k2Var.d;
                        List<FreelancerBanner> list4 = banners3;
                        ArrayList arrayList3 = new ArrayList(zhm.w.t(list4, 10));
                        for (FreelancerBanner freelancerBanner : list4) {
                            Map map2 = ft6.k.f137948a;
                            Intrinsics.checkNotNullParameter(freelancerBanner, "<this>");
                            arrayList3.add(new du6.e(freelancerBanner.f73275a.name()));
                        }
                        cVar2.G(arrayList3, "STORAGE_KEY_FREELANCE_BANNERS", kii.e.o(du6.e.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                    case 11:
                        w4l.f DataObservableDelegate5 = (w4l.f) obj2;
                        Unit it11 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate5, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it11, "it");
                        efm.d0<List<com.revolut.feature.freelancer.impl.network.models.s>> annualInboundVolumes = k2Var.f9553a.getAnnualInboundVolumes();
                        z0 z0Var6 = new z0(new e2(0), 13);
                        annualInboundVolumes.getClass();
                        ufm.i iVar6 = new ufm.i(annualInboundVolumes, z0Var6, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar6, "map(...)");
                        return iVar6;
                    case 12:
                        List banners4 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(banners4, "banners");
                        k2Var.f9555c.f("CACHE_FREELANCER_INBOUND_VOLUMES", banners4);
                        return Unit.f186387a;
                    default:
                        List banners5 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(banners5, "banners");
                        ue0.c cVar3 = k2Var.d;
                        List<FreelancerInboundVolume> list5 = banners5;
                        ArrayList arrayList4 = new ArrayList(zhm.w.t(list5, 10));
                        for (FreelancerInboundVolume freelancerInboundVolume : list5) {
                            Map map3 = ft6.k.f137948a;
                            Intrinsics.checkNotNullParameter(freelancerInboundVolume, "<this>");
                            arrayList4.add(new du6.f(freelancerInboundVolume.f73288c, freelancerInboundVolume.f73286a, freelancerInboundVolume.f73287b));
                        }
                        cVar3.G(arrayList4, "STORAGE_KEY_FREELANCER_INBOUND_VOLUMES", kii.e.o(du6.f.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                }
            }
        }, null, null, null, BERTags.FLAGS);
    }
}
