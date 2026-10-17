package jkc;

import com.google.gson.reflect.TypeToken;
import com.revolut.feature.rewards.shops.impl.data.network.services.LifestyleWidgetService;
import h30.q;
import java.lang.reflect.Type;
import java.util.List;
import jkc.e;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KTypeProjection;
import org.jetbrains.annotations.NotNull;
import skm.p0;
import te0.w;
import ufm.i;

/* JADX INFO: loaded from: classes6.dex */
public final class h implements a {

    @NotNull
    public static final d Companion = new d();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Type f175155g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LifestyleWidgetService f175156a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ue0.c f175157b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ne0.d f175158c;
    public final h4g.g d;
    public final q e;
    public final w4l.f f;

    static {
        Type type = new TypeToken<List<? extends hkc.a>>() { // from class: com.revolut.feature.rewards.shops.impl.data.repository.rewards.RewardsWidgetRepositoryImpl$Companion$SHOPS_REWARDS_TYPE$1
        }.getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        f175155g = type;
    }

    public h(LifestyleWidgetService lifestyleWidgetService, ue0.c storage, ne0.d rewardsHomeMemoryCache, h4g.g shopsFeatureAvailabilityInteractor, q storeAvailabilityInteractor) {
        Intrinsics.checkNotNullParameter(lifestyleWidgetService, "lifestyleWidgetService");
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(rewardsHomeMemoryCache, "rewardsHomeMemoryCache");
        Intrinsics.checkNotNullParameter(shopsFeatureAvailabilityInteractor, "shopsFeatureAvailabilityInteractor");
        Intrinsics.checkNotNullParameter(storeAvailabilityInteractor, "storeAvailabilityInteractor");
        this.f175156a = lifestyleWidgetService;
        this.f175157b = storage;
        this.f175158c = rewardsHomeMemoryCache;
        this.d = shopsFeatureAvailabilityInteractor;
        this.e = storeAvailabilityInteractor;
        final int i = 0;
        Function2 function2 = new Function2(this) { // from class: jkc.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h f175150b;

            {
                this.f175150b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        e params = (e) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params, "params");
                        if (params instanceof f) {
                            kotlinx.coroutines.d dVar = p0.f264003c;
                            h hVar = this.f175150b;
                            i iVar = new i(w.o0(dVar, new g(hVar, null, 0)), new jeg.h(new je2.d(hVar, params, 21), 19), 0);
                            Intrinsics.checkNotNullExpressionValue(iVar, "flatMap(...)");
                        }
                        break;
                    case 1:
                        List topOffers = (List) obj3;
                        Intrinsics.checkNotNullParameter((e) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(topOffers, "topOffers");
                        this.f175150b.f175158c.f("CACHE_KEY_TOP_OFFERS", topOffers);
                        break;
                    default:
                        List topOffers2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((e) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(topOffers2, "topOffers");
                        this.f175150b.f175157b.G(topOffers2, "CACHE_KEY_TOP_OFFERS", kii.e.o(hkc.a.class, KTypeProjection.INSTANCE, List.class));
                        break;
                }
                return Unit.f186387a;
            }
        };
        Function1 function1 = new Function1(this) { // from class: jkc.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h f175152b;

            {
                this.f175152b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                e params = (e) obj2;
                switch (i) {
                    case 0:
                        Intrinsics.checkNotNullParameter(params, "<unused var>");
                        return (List) this.f175152b.f175158c.get("CACHE_KEY_TOP_OFFERS");
                    case 1:
                        Intrinsics.checkNotNullParameter(params, "<unused var>");
                        return (List) this.f175152b.f175157b.T2("CACHE_KEY_TOP_OFFERS", h.f175155g);
                    default:
                        Intrinsics.checkNotNullParameter(params, "params");
                        if (!(params instanceof e.a)) {
                            return Unit.f186387a;
                        }
                        h hVar = this.f175152b;
                        hVar.f175158c.remove("CACHE_KEY_TOP_OFFERS");
                        hVar.f175157b.I0("CACHE_KEY_TOP_OFFERS");
                        return Unit.f186387a;
                }
            }
        };
        final int i2 = 1;
        Function2 function22 = new Function2(this) { // from class: jkc.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h f175150b;

            {
                this.f175150b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i2) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        e params = (e) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params, "params");
                        if (params instanceof f) {
                            kotlinx.coroutines.d dVar = p0.f264003c;
                            h hVar = this.f175150b;
                            i iVar = new i(w.o0(dVar, new g(hVar, null, 0)), new jeg.h(new je2.d(hVar, params, 21), 19), 0);
                            Intrinsics.checkNotNullExpressionValue(iVar, "flatMap(...)");
                        }
                        break;
                    case 1:
                        List topOffers = (List) obj3;
                        Intrinsics.checkNotNullParameter((e) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(topOffers, "topOffers");
                        this.f175150b.f175158c.f("CACHE_KEY_TOP_OFFERS", topOffers);
                        break;
                    default:
                        List topOffers2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((e) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(topOffers2, "topOffers");
                        this.f175150b.f175157b.G(topOffers2, "CACHE_KEY_TOP_OFFERS", kii.e.o(hkc.a.class, KTypeProjection.INSTANCE, List.class));
                        break;
                }
                return Unit.f186387a;
            }
        };
        Function1 function12 = new Function1(this) { // from class: jkc.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h f175152b;

            {
                this.f175152b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                e params = (e) obj2;
                switch (i2) {
                    case 0:
                        Intrinsics.checkNotNullParameter(params, "<unused var>");
                        return (List) this.f175152b.f175158c.get("CACHE_KEY_TOP_OFFERS");
                    case 1:
                        Intrinsics.checkNotNullParameter(params, "<unused var>");
                        return (List) this.f175152b.f175157b.T2("CACHE_KEY_TOP_OFFERS", h.f175155g);
                    default:
                        Intrinsics.checkNotNullParameter(params, "params");
                        if (!(params instanceof e.a)) {
                            return Unit.f186387a;
                        }
                        h hVar = this.f175152b;
                        hVar.f175158c.remove("CACHE_KEY_TOP_OFFERS");
                        hVar.f175157b.I0("CACHE_KEY_TOP_OFFERS");
                        return Unit.f186387a;
                }
            }
        };
        final int i3 = 2;
        this.f = new w4l.f(function2, function1, function22, function12, new Function2(this) { // from class: jkc.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h f175150b;

            {
                this.f175150b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i3) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        e params = (e) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params, "params");
                        if (params instanceof f) {
                            kotlinx.coroutines.d dVar = p0.f264003c;
                            h hVar = this.f175150b;
                            i iVar = new i(w.o0(dVar, new g(hVar, null, 0)), new jeg.h(new je2.d(hVar, params, 21), 19), 0);
                            Intrinsics.checkNotNullExpressionValue(iVar, "flatMap(...)");
                        }
                        break;
                    case 1:
                        List topOffers = (List) obj3;
                        Intrinsics.checkNotNullParameter((e) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(topOffers, "topOffers");
                        this.f175150b.f175158c.f("CACHE_KEY_TOP_OFFERS", topOffers);
                        break;
                    default:
                        List topOffers2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((e) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(topOffers2, "topOffers");
                        this.f175150b.f175157b.G(topOffers2, "CACHE_KEY_TOP_OFFERS", kii.e.o(hkc.a.class, KTypeProjection.INSTANCE, List.class));
                        break;
                }
                return Unit.f186387a;
            }
        }, new Function1(this) { // from class: jkc.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h f175152b;

            {
                this.f175152b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                e params = (e) obj2;
                switch (i3) {
                    case 0:
                        Intrinsics.checkNotNullParameter(params, "<unused var>");
                        return (List) this.f175152b.f175158c.get("CACHE_KEY_TOP_OFFERS");
                    case 1:
                        Intrinsics.checkNotNullParameter(params, "<unused var>");
                        return (List) this.f175152b.f175157b.T2("CACHE_KEY_TOP_OFFERS", h.f175155g);
                    default:
                        Intrinsics.checkNotNullParameter(params, "params");
                        if (!(params instanceof e.a)) {
                            return Unit.f186387a;
                        }
                        h hVar = this.f175152b;
                        hVar.f175158c.remove("CACHE_KEY_TOP_OFFERS");
                        hVar.f175157b.I0("CACHE_KEY_TOP_OFFERS");
                        return Unit.f186387a;
                }
            }
        }, null, null, 192);
    }
}
