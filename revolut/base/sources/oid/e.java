package oid;

import com.google.gson.reflect.TypeToken;
import com.revolut.feature.address.models.Address;
import com.revolut.feature.rev_points.models.EarningBadge;
import com.revolut.feature.shops.api.model.ShopsAuction;
import com.revolut.feature.shops.api.model.ShopsCampaignOffer;
import com.revolut.feature.shops.api.model.ShopsCategory;
import com.revolut.feature.shops.api.model.ShopsContext;
import com.revolut.feature.shops.api.model.ShopsDeeplinkOffer;
import com.revolut.feature.shops.api.model.ShopsFrozenOffer;
import com.revolut.feature.shops.api.model.ShopsLockedProductOffer;
import com.revolut.feature.shops.api.model.ShopsOutlet;
import com.revolut.feature.shops.api.model.ShopsProductOffer;
import com.revolut.feature.shops.api.model.ShopsPurchase;
import com.revolut.feature.shops.api.model.ShopsSoldOutProductOffer;
import com.revolut.feature.shops.api.model.ShopsWaitlistOffer;
import com.revolut.feature.shops.impl.service.AdvertisingService;
import ip0.v7;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KTypeProjection;
import mid.n0;
import mid.p0;
import mid.q0;
import mid.r0;
import mid.s0;
import mid.t0;
import mid.u0;
import mid.v0;
import org.bouncycastle.asn1.BERTags;

/* JADX INFO: loaded from: classes7.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AdvertisingService f225624a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ne0.j f225625b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ue0.c f225626c;
    public final w4l.f d;

    public e(AdvertisingService advertisingService, ne0.j memoryCache, ue0.c storage, int i) {
        switch (i) {
            case 1:
                Intrinsics.checkNotNullParameter(advertisingService, "advertisingService");
                Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
                Intrinsics.checkNotNullParameter(storage, "storage");
                this.f225624a = advertisingService;
                this.f225625b = memoryCache;
                this.f225626c = storage;
                final int i2 = 0;
                Function2 function2 = new Function2(this) { // from class: oid.l

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ e f225655b;

                    {
                        this.f225655b = this;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        switch (i2) {
                            case 0:
                                w4l.f DataObservableDelegate = (w4l.f) obj2;
                                k params = (k) obj3;
                                Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                                Intrinsics.checkNotNullParameter(params, "params");
                                break;
                            case 1:
                                k params2 = (k) obj2;
                                eid.p shopsCarousel = (eid.p) obj3;
                                Intrinsics.checkNotNullParameter(params2, "params");
                                Intrinsics.checkNotNullParameter(shopsCarousel, "shopsCarousel");
                                this.f225655b.f225625b.f("MEMORY_CACHE_SHOPS_CAROUSEL_DETAILS" + params2.a(), shopsCarousel);
                                break;
                            default:
                                k params3 = (k) obj2;
                                eid.p shopsCarousel2 = (eid.p) obj3;
                                Intrinsics.checkNotNullParameter(params3, "params");
                                Intrinsics.checkNotNullParameter(shopsCarousel2, "shopsCarousel");
                                this.f225655b.f225626c.G(shopsCarousel2, j6.a.q("MEMORY_CACHE_SHOPS_CAROUSEL_DETAILS", params3.a()), wim.z.d(o0.b(eid.p.class)));
                                break;
                        }
                        return Unit.f186387a;
                    }
                };
                Function1 function1 = new Function1(this) { // from class: oid.m

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ e f225659b;

                    {
                        this.f225659b = this;
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        k params = (k) obj2;
                        switch (i2) {
                            case 0:
                                Intrinsics.checkNotNullParameter(params, "params");
                                return (eid.p) v7.r("MEMORY_CACHE_SHOPS_CAROUSEL_DETAILS", params.a(), this.f225659b.f225625b);
                            default:
                                Intrinsics.checkNotNullParameter(params, "it");
                                return (eid.p) this.f225659b.f225626c.T2("MEMORY_CACHE_SHOPS_CAROUSEL_DETAILS", eid.p.class);
                        }
                    }
                };
                final int i3 = 1;
                Function2 function22 = new Function2(this) { // from class: oid.l

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ e f225655b;

                    {
                        this.f225655b = this;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        switch (i3) {
                            case 0:
                                w4l.f DataObservableDelegate = (w4l.f) obj2;
                                k params = (k) obj3;
                                Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                                Intrinsics.checkNotNullParameter(params, "params");
                                break;
                            case 1:
                                k params2 = (k) obj2;
                                eid.p shopsCarousel = (eid.p) obj3;
                                Intrinsics.checkNotNullParameter(params2, "params");
                                Intrinsics.checkNotNullParameter(shopsCarousel, "shopsCarousel");
                                this.f225655b.f225625b.f("MEMORY_CACHE_SHOPS_CAROUSEL_DETAILS" + params2.a(), shopsCarousel);
                                break;
                            default:
                                k params3 = (k) obj2;
                                eid.p shopsCarousel2 = (eid.p) obj3;
                                Intrinsics.checkNotNullParameter(params3, "params");
                                Intrinsics.checkNotNullParameter(shopsCarousel2, "shopsCarousel");
                                this.f225655b.f225626c.G(shopsCarousel2, j6.a.q("MEMORY_CACHE_SHOPS_CAROUSEL_DETAILS", params3.a()), wim.z.d(o0.b(eid.p.class)));
                                break;
                        }
                        return Unit.f186387a;
                    }
                };
                Function1 function12 = new Function1(this) { // from class: oid.m

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ e f225659b;

                    {
                        this.f225659b = this;
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        k params = (k) obj2;
                        switch (i3) {
                            case 0:
                                Intrinsics.checkNotNullParameter(params, "params");
                                return (eid.p) v7.r("MEMORY_CACHE_SHOPS_CAROUSEL_DETAILS", params.a(), this.f225659b.f225625b);
                            default:
                                Intrinsics.checkNotNullParameter(params, "it");
                                return (eid.p) this.f225659b.f225626c.T2("MEMORY_CACHE_SHOPS_CAROUSEL_DETAILS", eid.p.class);
                        }
                    }
                };
                final int i5 = 2;
                this.d = new w4l.f(function2, function1, function22, function12, new Function2(this) { // from class: oid.l

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ e f225655b;

                    {
                        this.f225655b = this;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        switch (i5) {
                            case 0:
                                w4l.f DataObservableDelegate = (w4l.f) obj2;
                                k params = (k) obj3;
                                Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                                Intrinsics.checkNotNullParameter(params, "params");
                                break;
                            case 1:
                                k params2 = (k) obj2;
                                eid.p shopsCarousel = (eid.p) obj3;
                                Intrinsics.checkNotNullParameter(params2, "params");
                                Intrinsics.checkNotNullParameter(shopsCarousel, "shopsCarousel");
                                this.f225655b.f225625b.f("MEMORY_CACHE_SHOPS_CAROUSEL_DETAILS" + params2.a(), shopsCarousel);
                                break;
                            default:
                                k params3 = (k) obj2;
                                eid.p shopsCarousel2 = (eid.p) obj3;
                                Intrinsics.checkNotNullParameter(params3, "params");
                                Intrinsics.checkNotNullParameter(shopsCarousel2, "shopsCarousel");
                                this.f225655b.f225626c.G(shopsCarousel2, j6.a.q("MEMORY_CACHE_SHOPS_CAROUSEL_DETAILS", params3.a()), wim.z.d(o0.b(eid.p.class)));
                                break;
                        }
                        return Unit.f186387a;
                    }
                }, null, null, null, BERTags.FLAGS);
                break;
            case 2:
                Intrinsics.checkNotNullParameter(advertisingService, "advertisingService");
                Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
                Intrinsics.checkNotNullParameter(storage, "storage");
                this.f225624a = advertisingService;
                this.f225625b = memoryCache;
                this.f225626c = storage;
                final int i6 = 0;
                Function2 function23 = new Function2(this) { // from class: oid.n

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ e f225663b;

                    {
                        this.f225663b = this;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        switch (i6) {
                            case 0:
                                w4l.f DataObservableDelegate = (w4l.f) obj2;
                                s params = (s) obj3;
                                Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                                Intrinsics.checkNotNullParameter(params, "params");
                                break;
                            case 1:
                                s type = (s) obj2;
                                List shopsCategoryTiles = (List) obj3;
                                Intrinsics.checkNotNullParameter(type, "type");
                                Intrinsics.checkNotNullParameter(shopsCategoryTiles, "shopsCategoryTiles");
                                ehe.n.z("MEMORY_CACHE_SHOPS_CATEGORY_TILES_", type.a(), this.f225663b.f225625b, shopsCategoryTiles);
                                break;
                            default:
                                s type2 = (s) obj2;
                                List shopsCategoryTiles2 = (List) obj3;
                                Intrinsics.checkNotNullParameter(type2, "type");
                                Intrinsics.checkNotNullParameter(shopsCategoryTiles2, "shopsCategoryTiles");
                                this.f225663b.f225626c.G(shopsCategoryTiles2, j6.a.q("STORAGE_CACHE_SHOPS_CATEGORY_TILES_", type2.a()), kii.e.o(eid.e0.class, KTypeProjection.INSTANCE, List.class));
                                break;
                        }
                        return Unit.f186387a;
                    }
                };
                Function1 function13 = new Function1(this) { // from class: oid.o

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ e f225665b;

                    {
                        this.f225665b = this;
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        int i21 = i6;
                        e eVar = this.f225665b;
                        s type = (s) obj2;
                        switch (i21) {
                            case 0:
                                Intrinsics.checkNotNullParameter(type, "type");
                                return (List) v7.r("MEMORY_CACHE_SHOPS_CATEGORY_TILES_", type.a(), eVar.f225625b);
                            default:
                                Intrinsics.checkNotNullParameter(type, "type");
                                ue0.c cVar = eVar.f225626c;
                                String strQ = j6.a.q("STORAGE_CACHE_SHOPS_CATEGORY_TILES_", type.a());
                                Type type2 = TypeToken.getParameterized(List.class, eid.e0.class).getType();
                                Intrinsics.checkNotNullExpressionValue(type2, "getType(...)");
                                return (List) cVar.T2(strQ, type2);
                        }
                    }
                };
                final int i21 = 1;
                Function2 function24 = new Function2(this) { // from class: oid.n

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ e f225663b;

                    {
                        this.f225663b = this;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        switch (i21) {
                            case 0:
                                w4l.f DataObservableDelegate = (w4l.f) obj2;
                                s params = (s) obj3;
                                Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                                Intrinsics.checkNotNullParameter(params, "params");
                                break;
                            case 1:
                                s type = (s) obj2;
                                List shopsCategoryTiles = (List) obj3;
                                Intrinsics.checkNotNullParameter(type, "type");
                                Intrinsics.checkNotNullParameter(shopsCategoryTiles, "shopsCategoryTiles");
                                ehe.n.z("MEMORY_CACHE_SHOPS_CATEGORY_TILES_", type.a(), this.f225663b.f225625b, shopsCategoryTiles);
                                break;
                            default:
                                s type2 = (s) obj2;
                                List shopsCategoryTiles2 = (List) obj3;
                                Intrinsics.checkNotNullParameter(type2, "type");
                                Intrinsics.checkNotNullParameter(shopsCategoryTiles2, "shopsCategoryTiles");
                                this.f225663b.f225626c.G(shopsCategoryTiles2, j6.a.q("STORAGE_CACHE_SHOPS_CATEGORY_TILES_", type2.a()), kii.e.o(eid.e0.class, KTypeProjection.INSTANCE, List.class));
                                break;
                        }
                        return Unit.f186387a;
                    }
                };
                Function1 function14 = new Function1(this) { // from class: oid.o

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ e f225665b;

                    {
                        this.f225665b = this;
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        int i212 = i21;
                        e eVar = this.f225665b;
                        s type = (s) obj2;
                        switch (i212) {
                            case 0:
                                Intrinsics.checkNotNullParameter(type, "type");
                                return (List) v7.r("MEMORY_CACHE_SHOPS_CATEGORY_TILES_", type.a(), eVar.f225625b);
                            default:
                                Intrinsics.checkNotNullParameter(type, "type");
                                ue0.c cVar = eVar.f225626c;
                                String strQ = j6.a.q("STORAGE_CACHE_SHOPS_CATEGORY_TILES_", type.a());
                                Type type2 = TypeToken.getParameterized(List.class, eid.e0.class).getType();
                                Intrinsics.checkNotNullExpressionValue(type2, "getType(...)");
                                return (List) cVar.T2(strQ, type2);
                        }
                    }
                };
                final int i22 = 2;
                this.d = new w4l.f(function23, function13, function24, function14, new Function2(this) { // from class: oid.n

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ e f225663b;

                    {
                        this.f225663b = this;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        switch (i22) {
                            case 0:
                                w4l.f DataObservableDelegate = (w4l.f) obj2;
                                s params = (s) obj3;
                                Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                                Intrinsics.checkNotNullParameter(params, "params");
                                break;
                            case 1:
                                s type = (s) obj2;
                                List shopsCategoryTiles = (List) obj3;
                                Intrinsics.checkNotNullParameter(type, "type");
                                Intrinsics.checkNotNullParameter(shopsCategoryTiles, "shopsCategoryTiles");
                                ehe.n.z("MEMORY_CACHE_SHOPS_CATEGORY_TILES_", type.a(), this.f225663b.f225625b, shopsCategoryTiles);
                                break;
                            default:
                                s type2 = (s) obj2;
                                List shopsCategoryTiles2 = (List) obj3;
                                Intrinsics.checkNotNullParameter(type2, "type");
                                Intrinsics.checkNotNullParameter(shopsCategoryTiles2, "shopsCategoryTiles");
                                this.f225663b.f225626c.G(shopsCategoryTiles2, j6.a.q("STORAGE_CACHE_SHOPS_CATEGORY_TILES_", type2.a()), kii.e.o(eid.e0.class, KTypeProjection.INSTANCE, List.class));
                                break;
                        }
                        return Unit.f186387a;
                    }
                }, null, null, null, BERTags.FLAGS);
                break;
            case 3:
                Intrinsics.checkNotNullParameter(advertisingService, "advertisingService");
                Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
                Intrinsics.checkNotNullParameter(storage, "storage");
                this.f225624a = advertisingService;
                this.f225625b = memoryCache;
                this.f225626c = storage;
                final int i32 = 0;
                Function2 function25 = new Function2(this) { // from class: oid.p

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ e f225667b;

                    {
                        this.f225667b = this;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        switch (i32) {
                            case 0:
                                w4l.f DataObservableDelegate = (w4l.f) obj2;
                                Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                                Intrinsics.checkNotNullParameter((Unit) obj3, "<unused var>");
                                efm.d0<List<eid.k>> pills = this.f225667b.f225624a.getPills();
                                oc8.e eVar = new oc8.e(28, new oh3.a(10));
                                pills.getClass();
                                ufm.i iVar = new ufm.i(pills, eVar, 1);
                                Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                                break;
                            case 1:
                                List shopsCategoryPills = (List) obj3;
                                Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                                Intrinsics.checkNotNullParameter(shopsCategoryPills, "shopsCategoryPills");
                                this.f225667b.f225625b.f("MEMORY_CACHE_SHOPS_PILLS", shopsCategoryPills);
                                break;
                            default:
                                List shopsCategoryPills2 = (List) obj3;
                                Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                                Intrinsics.checkNotNullParameter(shopsCategoryPills2, "shopsCategoryPills");
                                ue0.c cVar = this.f225667b.f225626c;
                                List<ShopsCategory> list = shopsCategoryPills2;
                                ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                                for (ShopsCategory shopsCategory : list) {
                                    Intrinsics.checkNotNullParameter(shopsCategory, "<this>");
                                    arrayList.add(new sid.g(shopsCategory.f87040a, shopsCategory.f87041b));
                                }
                                cVar.G(arrayList, "STORAGE_CACHE_SHOPS_PILLS", kii.e.o(sid.g.class, KTypeProjection.INSTANCE, List.class));
                                break;
                        }
                        return Unit.f186387a;
                    }
                };
                Function1 function15 = new Function1(this) { // from class: oid.q

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ e f225669b;

                    {
                        this.f225669b = this;
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        Unit unit = (Unit) obj2;
                        switch (i32) {
                            case 0:
                                Intrinsics.checkNotNullParameter(unit, "<unused var>");
                                return (List) this.f225669b.f225625b.get("MEMORY_CACHE_SHOPS_PILLS");
                            default:
                                Intrinsics.checkNotNullParameter(unit, "<unused var>");
                                ue0.c cVar = this.f225669b.f225626c;
                                Type type = r.f225670a;
                                Intrinsics.checkNotNullExpressionValue(type, "access$getSHOPS_CATEGORY_LIST_TYPE$p(...)");
                                List list = (List) cVar.T2("STORAGE_CACHE_SHOPS_PILLS", type);
                                if (list == null) {
                                    return null;
                                }
                                List<sid.g> list2 = list;
                                ArrayList arrayList = new ArrayList(zhm.w.t(list2, 10));
                                for (sid.g gVar : list2) {
                                    Intrinsics.checkNotNullParameter(gVar, "<this>");
                                    arrayList.add(new ShopsCategory(gVar.getId(), gVar.getName()));
                                }
                                return arrayList;
                        }
                    }
                };
                final int i33 = 1;
                Function2 function26 = new Function2(this) { // from class: oid.p

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ e f225667b;

                    {
                        this.f225667b = this;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        switch (i33) {
                            case 0:
                                w4l.f DataObservableDelegate = (w4l.f) obj2;
                                Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                                Intrinsics.checkNotNullParameter((Unit) obj3, "<unused var>");
                                efm.d0<List<eid.k>> pills = this.f225667b.f225624a.getPills();
                                oc8.e eVar = new oc8.e(28, new oh3.a(10));
                                pills.getClass();
                                ufm.i iVar = new ufm.i(pills, eVar, 1);
                                Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                                break;
                            case 1:
                                List shopsCategoryPills = (List) obj3;
                                Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                                Intrinsics.checkNotNullParameter(shopsCategoryPills, "shopsCategoryPills");
                                this.f225667b.f225625b.f("MEMORY_CACHE_SHOPS_PILLS", shopsCategoryPills);
                                break;
                            default:
                                List shopsCategoryPills2 = (List) obj3;
                                Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                                Intrinsics.checkNotNullParameter(shopsCategoryPills2, "shopsCategoryPills");
                                ue0.c cVar = this.f225667b.f225626c;
                                List<ShopsCategory> list = shopsCategoryPills2;
                                ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                                for (ShopsCategory shopsCategory : list) {
                                    Intrinsics.checkNotNullParameter(shopsCategory, "<this>");
                                    arrayList.add(new sid.g(shopsCategory.f87040a, shopsCategory.f87041b));
                                }
                                cVar.G(arrayList, "STORAGE_CACHE_SHOPS_PILLS", kii.e.o(sid.g.class, KTypeProjection.INSTANCE, List.class));
                                break;
                        }
                        return Unit.f186387a;
                    }
                };
                Function1 function16 = new Function1(this) { // from class: oid.q

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ e f225669b;

                    {
                        this.f225669b = this;
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        Unit unit = (Unit) obj2;
                        switch (i33) {
                            case 0:
                                Intrinsics.checkNotNullParameter(unit, "<unused var>");
                                return (List) this.f225669b.f225625b.get("MEMORY_CACHE_SHOPS_PILLS");
                            default:
                                Intrinsics.checkNotNullParameter(unit, "<unused var>");
                                ue0.c cVar = this.f225669b.f225626c;
                                Type type = r.f225670a;
                                Intrinsics.checkNotNullExpressionValue(type, "access$getSHOPS_CATEGORY_LIST_TYPE$p(...)");
                                List list = (List) cVar.T2("STORAGE_CACHE_SHOPS_PILLS", type);
                                if (list == null) {
                                    return null;
                                }
                                List<sid.g> list2 = list;
                                ArrayList arrayList = new ArrayList(zhm.w.t(list2, 10));
                                for (sid.g gVar : list2) {
                                    Intrinsics.checkNotNullParameter(gVar, "<this>");
                                    arrayList.add(new ShopsCategory(gVar.getId(), gVar.getName()));
                                }
                                return arrayList;
                        }
                    }
                };
                final int i43 = 2;
                this.d = new w4l.f(function25, function15, function26, function16, new Function2(this) { // from class: oid.p

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ e f225667b;

                    {
                        this.f225667b = this;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        switch (i43) {
                            case 0:
                                w4l.f DataObservableDelegate = (w4l.f) obj2;
                                Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                                Intrinsics.checkNotNullParameter((Unit) obj3, "<unused var>");
                                efm.d0<List<eid.k>> pills = this.f225667b.f225624a.getPills();
                                oc8.e eVar = new oc8.e(28, new oh3.a(10));
                                pills.getClass();
                                ufm.i iVar = new ufm.i(pills, eVar, 1);
                                Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                                break;
                            case 1:
                                List shopsCategoryPills = (List) obj3;
                                Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                                Intrinsics.checkNotNullParameter(shopsCategoryPills, "shopsCategoryPills");
                                this.f225667b.f225625b.f("MEMORY_CACHE_SHOPS_PILLS", shopsCategoryPills);
                                break;
                            default:
                                List shopsCategoryPills2 = (List) obj3;
                                Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                                Intrinsics.checkNotNullParameter(shopsCategoryPills2, "shopsCategoryPills");
                                ue0.c cVar = this.f225667b.f225626c;
                                List<ShopsCategory> list = shopsCategoryPills2;
                                ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                                for (ShopsCategory shopsCategory : list) {
                                    Intrinsics.checkNotNullParameter(shopsCategory, "<this>");
                                    arrayList.add(new sid.g(shopsCategory.f87040a, shopsCategory.f87041b));
                                }
                                cVar.G(arrayList, "STORAGE_CACHE_SHOPS_PILLS", kii.e.o(sid.g.class, KTypeProjection.INSTANCE, List.class));
                                break;
                        }
                        return Unit.f186387a;
                    }
                }, null, null, null, BERTags.FLAGS);
                break;
            case 4:
                Intrinsics.checkNotNullParameter(advertisingService, "advertisingService");
                Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
                Intrinsics.checkNotNullParameter(storage, "storage");
                this.f225624a = advertisingService;
                this.f225625b = memoryCache;
                this.f225626c = storage;
                final int i59 = 0;
                Function2 function27 = new Function2(this) { // from class: oid.u

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ e f225677b;

                    {
                        this.f225677b = this;
                    }

                    /* JADX WARN: Type inference failed for: r2v19, types: [java.lang.Object, java.util.Map] */
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        sid.q qVar;
                        int i66;
                        ArrayList arrayList;
                        String strB;
                        v0 v0Var;
                        sid.i iVar;
                        sid.k kVar;
                        Iterator it8;
                        String str;
                        sid.t tVar;
                        sid.b bVar;
                        sid.v vVar;
                        String str2;
                        String str3;
                        String str4;
                        sid.p pVar;
                        sid.h hVar;
                        sid.e eVar;
                        sid.u uVar;
                        ShopsAuction.Bid bid2;
                        ShopsAuction.Offer offer;
                        switch (i59) {
                            case 0:
                                w4l.f DataObservableDelegate = (w4l.f) obj2;
                                t params = (t) obj3;
                                Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                                Intrinsics.checkNotNullParameter(params, "params");
                                efm.d0<eid.q> homeCategoryLayout = this.f225677b.f225624a.getHomeCategoryLayout(params.f225673a, params.f225674b, params.f225675c, null);
                                oc8.e eVar2 = new oc8.e(29, new oh3.a(11));
                                homeCategoryLayout.getClass();
                                ufm.i iVar2 = new ufm.i(homeCategoryLayout, eVar2, 1);
                                Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                                return iVar2;
                            case 1:
                                t params2 = (t) obj2;
                                mid.m shopsHomeLayout = (mid.m) obj3;
                                Intrinsics.checkNotNullParameter(params2, "params");
                                Intrinsics.checkNotNullParameter(shopsHomeLayout, "shopsHomeLayout");
                                this.f225677b.f225625b.f("MEMORY_CACHE_SHOPS_HOME_" + params2.f225673a, shopsHomeLayout);
                                return Unit.f186387a;
                            default:
                                t params3 = (t) obj2;
                                mid.m shopsHomeLayout2 = (mid.m) obj3;
                                Intrinsics.checkNotNullParameter(params3, "params");
                                Intrinsics.checkNotNullParameter(shopsHomeLayout2, "shopsHomeLayout");
                                ue0.c cVar = this.f225677b.f225626c;
                                String str5 = "STORAGE_KEY_SHOPS_HOME_" + params3.f225673a;
                                Intrinsics.checkNotNullParameter(shopsHomeLayout2, "<this>");
                                ArrayList arrayList2 = shopsHomeLayout2.f205726a;
                                int i74 = 10;
                                ArrayList arrayList3 = new ArrayList(zhm.w.t(arrayList2, 10));
                                Iterator it9 = arrayList2.iterator();
                                while (it9.hasNext()) {
                                    mid.n nVar = (mid.n) it9.next();
                                    Intrinsics.checkNotNullParameter(nVar, "<this>");
                                    String str6 = nVar.f205729a;
                                    String str7 = nVar.f205730b;
                                    String str8 = nVar.f205731c;
                                    List list = nVar.d;
                                    ArrayList arrayList4 = new ArrayList(zhm.w.t(list, i74));
                                    Iterator it10 = list.iterator();
                                    while (it10.hasNext()) {
                                        mid.d0 d0Var = (mid.d0) it10.next();
                                        Intrinsics.checkNotNullParameter(d0Var, "<this>");
                                        String str9 = d0Var.f205691a;
                                        v0 v0Var2 = d0Var.f205692b;
                                        Iterator it11 = it9;
                                        if (v0Var2 instanceof mid.f0) {
                                            strB = lid.l.CAMPAIGN_HERO_TILE.b();
                                        } else if (v0Var2 instanceof mid.g0) {
                                            strB = lid.l.CAMPAIGN_TILE.b();
                                        } else if (v0Var2 instanceof mid.h0) {
                                            strB = lid.l.DEEPLINK_TILE.b();
                                        } else if (v0Var2 instanceof mid.k0) {
                                            strB = lid.l.LOCKED_HERO_TILE.b();
                                        } else if (v0Var2 instanceof mid.l0) {
                                            strB = lid.l.LOCKED_TILE.b();
                                        } else if (v0Var2 instanceof mid.m0) {
                                            strB = lid.l.PRODUCT_HERO_TILE.b();
                                        } else if (v0Var2 instanceof n0) {
                                            strB = lid.l.PRODUCT_TILE.b();
                                        } else if (v0Var2 instanceof mid.o0) {
                                            strB = lid.l.SOLD_OUT_HERO_TILE.b();
                                        } else if (v0Var2 instanceof p0) {
                                            strB = lid.l.SOLD_OUT_TILE.b();
                                        } else if (v0Var2 instanceof q0) {
                                            strB = lid.l.WAITLIST_HERO_TILE.b();
                                        } else if (v0Var2 instanceof r0) {
                                            strB = lid.l.WAITLIST_TILE.b();
                                        } else if (v0Var2 instanceof s0) {
                                            strB = lid.l.FROZEN_HERO_TILE.b();
                                        } else if (v0Var2 instanceof t0) {
                                            strB = lid.l.FROZEN_TILE.b();
                                        } else if (v0Var2 instanceof mid.i0) {
                                            strB = lid.l.AUCTION_HERO_TILE.b();
                                        } else if (v0Var2 instanceof mid.j0) {
                                            strB = lid.l.AUCTION_TILE.b();
                                        } else if (v0Var2 instanceof u0) {
                                            strB = lid.l.PURCHASE_TILE.b();
                                        } else if (v0Var2 instanceof mid.e0) {
                                            strB = lid.l.BID_TILE.b();
                                        } else {
                                            if (!(v0Var2 instanceof v0.a)) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            strB = lid.l.UNKNOWN_TILE.b();
                                        }
                                        String str10 = strB;
                                        String str11 = d0Var.f205693c;
                                        String str12 = d0Var.d;
                                        String str13 = d0Var.e;
                                        String str14 = d0Var.f;
                                        String str15 = d0Var.f205694g;
                                        String str16 = d0Var.f205695h;
                                        EarningBadge earningBadge = d0Var.i;
                                        sid.d dVarC = earningBadge != null ? lid.b.c(earningBadge) : null;
                                        ShopsContext shopsContextA = v0Var2.a();
                                        ShopsCampaignOffer shopsCampaignOffer = shopsContextA instanceof ShopsCampaignOffer ? (ShopsCampaignOffer) shopsContextA : null;
                                        sid.f fVarC = shopsCampaignOffer != null ? lid.c.c(shopsCampaignOffer) : null;
                                        ShopsContext shopsContextA2 = v0Var2.a();
                                        ShopsDeeplinkOffer shopsDeeplinkOffer = shopsContextA2 instanceof ShopsDeeplinkOffer ? (ShopsDeeplinkOffer) shopsContextA2 : null;
                                        if (shopsDeeplinkOffer != null) {
                                            Intrinsics.checkNotNullParameter(shopsDeeplinkOffer, "<this>");
                                            v0Var = v0Var2;
                                            iVar = new sid.i(shopsDeeplinkOffer.f87042a, shopsDeeplinkOffer.f87043b);
                                        } else {
                                            v0Var = v0Var2;
                                            iVar = null;
                                        }
                                        ShopsContext shopsContextA3 = v0Var.a();
                                        ShopsFrozenOffer shopsFrozenOffer = shopsContextA3 instanceof ShopsFrozenOffer ? (ShopsFrozenOffer) shopsContextA3 : null;
                                        if (shopsFrozenOffer != null) {
                                            Intrinsics.checkNotNullParameter(shopsFrozenOffer, "<this>");
                                            kVar = new sid.k(shopsFrozenOffer.f87049c, shopsFrozenOffer.d);
                                        } else {
                                            kVar = null;
                                        }
                                        ShopsContext shopsContextA4 = v0Var.a();
                                        ShopsProductOffer shopsProductOffer = shopsContextA4 instanceof ShopsProductOffer ? (ShopsProductOffer) shopsContextA4 : null;
                                        if (shopsProductOffer != null) {
                                            Intrinsics.checkNotNullParameter(shopsProductOffer, "<this>");
                                            String str17 = shopsProductOffer.f87062a;
                                            String str18 = shopsProductOffer.e;
                                            it8 = it10;
                                            Double d = shopsProductOffer.f87064c;
                                            str = str6;
                                            tVar = new sid.t(str17, shopsProductOffer.f87063b, d != null ? String.valueOf(d.doubleValue()) : null, str18);
                                        } else {
                                            it8 = it10;
                                            str = str6;
                                            tVar = null;
                                        }
                                        ShopsContext shopsContextA5 = v0Var.a();
                                        ShopsAuction shopsAuction = shopsContextA5 instanceof ShopsAuction ? (ShopsAuction) shopsContextA5 : null;
                                        if (shopsAuction == null || (offer = shopsAuction.f87010a) == null) {
                                            bVar = null;
                                        } else {
                                            Intrinsics.checkNotNullParameter(offer, "<this>");
                                            String strValueOf = String.valueOf(offer.f87017c);
                                            String string = offer.f87016b.toString();
                                            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                                            bVar = new sid.b(offer.f87015a, string, strValueOf, offer.d, offer.e);
                                        }
                                        ShopsContext shopsContextA6 = v0Var.a();
                                        ShopsSoldOutProductOffer shopsSoldOutProductOffer = shopsContextA6 instanceof ShopsSoldOutProductOffer ? (ShopsSoldOutProductOffer) shopsContextA6 : null;
                                        if (shopsSoldOutProductOffer != null) {
                                            Intrinsics.checkNotNullParameter(shopsSoldOutProductOffer, "<this>");
                                            vVar = new sid.v(shopsSoldOutProductOffer.f87076b);
                                        } else {
                                            vVar = null;
                                        }
                                        ShopsContext shopsContextA7 = v0Var.a();
                                        ShopsLockedProductOffer shopsLockedProductOffer = shopsContextA7 instanceof ShopsLockedProductOffer ? (ShopsLockedProductOffer) shopsContextA7 : null;
                                        if (shopsLockedProductOffer != null) {
                                            Intrinsics.checkNotNullParameter(shopsLockedProductOffer, "<this>");
                                            String str19 = shopsLockedProductOffer.f87053a;
                                            String str20 = shopsLockedProductOffer.e;
                                            String str21 = shopsLockedProductOffer.f87054b;
                                            List list2 = shopsLockedProductOffer.f87055c;
                                            str2 = str7;
                                            str3 = str8;
                                            str4 = str9;
                                            ArrayList arrayList5 = new ArrayList(zhm.w.t(list2, 10));
                                            Iterator it12 = list2.iterator();
                                            while (it12.hasNext()) {
                                                arrayList5.add(((m1c.r) it12.next()).name());
                                            }
                                            pVar = new sid.p(str19, str21, str20, arrayList5);
                                        } else {
                                            str2 = str7;
                                            str3 = str8;
                                            str4 = str9;
                                            pVar = null;
                                        }
                                        ShopsContext shopsContextA8 = v0Var.a();
                                        ShopsWaitlistOffer shopsWaitlistOffer = shopsContextA8 instanceof ShopsWaitlistOffer ? (ShopsWaitlistOffer) shopsContextA8 : null;
                                        if (shopsWaitlistOffer != null) {
                                            Intrinsics.checkNotNullParameter(shopsWaitlistOffer, "<this>");
                                            hVar = new sid.h(shopsWaitlistOffer.f87078b);
                                        } else {
                                            hVar = null;
                                        }
                                        ShopsContext shopsContextA9 = v0Var.a();
                                        ShopsAuction shopsAuction2 = shopsContextA9 instanceof ShopsAuction ? (ShopsAuction) shopsContextA9 : null;
                                        if (shopsAuction2 == null || (bid2 = shopsAuction2.f87011b) == null) {
                                            eVar = null;
                                        } else {
                                            Intrinsics.checkNotNullParameter(bid2, "<this>");
                                            eVar = new sid.e(String.valueOf(bid2.f87013a), bid2.f87014b.toString());
                                        }
                                        ShopsContext shopsContextA10 = v0Var.a();
                                        ShopsPurchase shopsPurchase = shopsContextA10 instanceof ShopsPurchase ? (ShopsPurchase) shopsContextA10 : null;
                                        if (shopsPurchase != null) {
                                            Intrinsics.checkNotNullParameter(shopsPurchase, "<this>");
                                            String str22 = shopsPurchase.d;
                                            String string2 = shopsPurchase.f.toString();
                                            Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                                            String strValueOf2 = String.valueOf(shopsPurchase.f87069h);
                                            String str23 = shopsPurchase.f87065a;
                                            String strName = shopsPurchase.f87066b.name();
                                            int i92 = shopsPurchase.f87068g;
                                            Address address = shopsPurchase.i;
                                            uVar = new sid.u(str23, strName, string2, shopsPurchase.k, i92, strValueOf2, address != null ? oo3.a.d(address) : null, shopsPurchase.f87071l, str22);
                                        } else {
                                            uVar = null;
                                        }
                                        arrayList4.add(new sid.w(str4, str10, str11, str12, str13, str14, str15, str16, dVarC, fVarC, iVar, kVar, tVar, bVar, vVar, pVar, hVar, eVar, uVar));
                                        it9 = it11;
                                        it10 = it8;
                                        str6 = str;
                                        str7 = str2;
                                        str8 = str3;
                                    }
                                    Iterator it13 = it9;
                                    String str24 = str6;
                                    String str25 = str7;
                                    String str26 = str8;
                                    List<mid.g> list3 = nVar.e;
                                    ArrayList arrayList6 = new ArrayList(zhm.w.t(list3, 10));
                                    for (mid.g gVar : list3) {
                                        Intrinsics.checkNotNullParameter(gVar, "<this>");
                                        String str27 = gVar.f205702a;
                                        EarningBadge earningBadge2 = gVar.f205703b;
                                        arrayList6.add(new sid.a(str27, earningBadge2 != null ? lid.b.c(earningBadge2) : null));
                                    }
                                    bo3.a aVar = nVar.f;
                                    if (aVar != null) {
                                        Intrinsics.checkNotNullParameter(aVar, "<this>");
                                        co3.a aVar2 = aVar.f17282a;
                                        Intrinsics.checkNotNullParameter(aVar2, "<this>");
                                        sid.o oVar = new sid.o(aVar2.f25486a, aVar2.f25487b);
                                        co3.a aVar3 = aVar.f17283b;
                                        Intrinsics.checkNotNullParameter(aVar3, "<this>");
                                        qVar = new sid.q(oVar, new sid.o(aVar3.f25486a, aVar3.f25487b));
                                    } else {
                                        qVar = null;
                                    }
                                    List list4 = nVar.f205732g;
                                    if (list4 != null) {
                                        List list5 = list4;
                                        i66 = 10;
                                        ArrayList arrayList7 = new ArrayList(zhm.w.t(list5, 10));
                                        Iterator it14 = list5.iterator();
                                        while (it14.hasNext()) {
                                            arrayList7.add(yoj.b.N((ShopsOutlet) it14.next()));
                                        }
                                        arrayList = arrayList7;
                                    } else {
                                        i66 = 10;
                                        arrayList = null;
                                    }
                                    ?? r2 = nVar.f205733h;
                                    ArrayList arrayList8 = new ArrayList(r2.size());
                                    Iterator it15 = r2.entrySet().iterator();
                                    while (it15.hasNext()) {
                                        arrayList8.add(lid.c.c((ShopsCampaignOffer) ((Map.Entry) it15.next()).getValue()));
                                    }
                                    arrayList3.add(new sid.l(str24, str25, str26, arrayList4, arrayList6, qVar, arrayList, arrayList8));
                                    i74 = i66;
                                    it9 = it13;
                                }
                                cVar.G(new sid.m(arrayList3), str5, wim.z.d(o0.b(sid.m.class)));
                                return Unit.f186387a;
                        }
                    }
                };
                Function1 function17 = new Function1(this) { // from class: oid.v

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ e f225679b;

                    {
                        this.f225679b = this;
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Removed duplicated region for block: B:123:0x02a6  */
                    /* JADX WARN: Removed duplicated region for block: B:131:0x02cc  */
                    /* JADX WARN: Removed duplicated region for block: B:145:0x030d  */
                    /* JADX WARN: Removed duplicated region for block: B:159:0x034e  */
                    /* JADX WARN: Removed duplicated region for block: B:201:0x043d  */
                    /* JADX WARN: Removed duplicated region for block: B:202:0x0440  */
                    /* JADX WARN: Removed duplicated region for block: B:44:0x0121  */
                    /* JADX WARN: Removed duplicated region for block: B:86:0x01f7  */
                    /* JADX WARN: Removed duplicated region for block: B:87:0x01fe  */
                    /* JADX WARN: Type inference failed for: r13v0, types: [java.util.List] */
                    /* JADX WARN: Type inference failed for: r1v2, types: [zhm.f0] */
                    /* JADX WARN: Type inference failed for: r1v20, types: [java.util.ArrayList] */
                    /* JADX WARN: Type inference failed for: r1v3 */
                    @Override // kotlin.jvm.functions.Function1
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final java.lang.Object invoke(java.lang.Object r36) {
                        /*
                            Method dump skipped, instruction units count: 1464
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: oid.v.invoke(java.lang.Object):java.lang.Object");
                    }
                };
                final int i66 = 1;
                Function2 function28 = new Function2(this) { // from class: oid.u

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ e f225677b;

                    {
                        this.f225677b = this;
                    }

                    /* JADX WARN: Type inference failed for: r2v19, types: [java.lang.Object, java.util.Map] */
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        sid.q qVar;
                        int i662;
                        ArrayList arrayList;
                        String strB;
                        v0 v0Var;
                        sid.i iVar;
                        sid.k kVar;
                        Iterator it8;
                        String str;
                        sid.t tVar;
                        sid.b bVar;
                        sid.v vVar;
                        String str2;
                        String str3;
                        String str4;
                        sid.p pVar;
                        sid.h hVar;
                        sid.e eVar;
                        sid.u uVar;
                        ShopsAuction.Bid bid2;
                        ShopsAuction.Offer offer;
                        switch (i66) {
                            case 0:
                                w4l.f DataObservableDelegate = (w4l.f) obj2;
                                t params = (t) obj3;
                                Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                                Intrinsics.checkNotNullParameter(params, "params");
                                efm.d0<eid.q> homeCategoryLayout = this.f225677b.f225624a.getHomeCategoryLayout(params.f225673a, params.f225674b, params.f225675c, null);
                                oc8.e eVar2 = new oc8.e(29, new oh3.a(11));
                                homeCategoryLayout.getClass();
                                ufm.i iVar2 = new ufm.i(homeCategoryLayout, eVar2, 1);
                                Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                                return iVar2;
                            case 1:
                                t params2 = (t) obj2;
                                mid.m shopsHomeLayout = (mid.m) obj3;
                                Intrinsics.checkNotNullParameter(params2, "params");
                                Intrinsics.checkNotNullParameter(shopsHomeLayout, "shopsHomeLayout");
                                this.f225677b.f225625b.f("MEMORY_CACHE_SHOPS_HOME_" + params2.f225673a, shopsHomeLayout);
                                return Unit.f186387a;
                            default:
                                t params3 = (t) obj2;
                                mid.m shopsHomeLayout2 = (mid.m) obj3;
                                Intrinsics.checkNotNullParameter(params3, "params");
                                Intrinsics.checkNotNullParameter(shopsHomeLayout2, "shopsHomeLayout");
                                ue0.c cVar = this.f225677b.f225626c;
                                String str5 = "STORAGE_KEY_SHOPS_HOME_" + params3.f225673a;
                                Intrinsics.checkNotNullParameter(shopsHomeLayout2, "<this>");
                                ArrayList arrayList2 = shopsHomeLayout2.f205726a;
                                int i74 = 10;
                                ArrayList arrayList3 = new ArrayList(zhm.w.t(arrayList2, 10));
                                Iterator it9 = arrayList2.iterator();
                                while (it9.hasNext()) {
                                    mid.n nVar = (mid.n) it9.next();
                                    Intrinsics.checkNotNullParameter(nVar, "<this>");
                                    String str6 = nVar.f205729a;
                                    String str7 = nVar.f205730b;
                                    String str8 = nVar.f205731c;
                                    List list = nVar.d;
                                    ArrayList arrayList4 = new ArrayList(zhm.w.t(list, i74));
                                    Iterator it10 = list.iterator();
                                    while (it10.hasNext()) {
                                        mid.d0 d0Var = (mid.d0) it10.next();
                                        Intrinsics.checkNotNullParameter(d0Var, "<this>");
                                        String str9 = d0Var.f205691a;
                                        v0 v0Var2 = d0Var.f205692b;
                                        Iterator it11 = it9;
                                        if (v0Var2 instanceof mid.f0) {
                                            strB = lid.l.CAMPAIGN_HERO_TILE.b();
                                        } else if (v0Var2 instanceof mid.g0) {
                                            strB = lid.l.CAMPAIGN_TILE.b();
                                        } else if (v0Var2 instanceof mid.h0) {
                                            strB = lid.l.DEEPLINK_TILE.b();
                                        } else if (v0Var2 instanceof mid.k0) {
                                            strB = lid.l.LOCKED_HERO_TILE.b();
                                        } else if (v0Var2 instanceof mid.l0) {
                                            strB = lid.l.LOCKED_TILE.b();
                                        } else if (v0Var2 instanceof mid.m0) {
                                            strB = lid.l.PRODUCT_HERO_TILE.b();
                                        } else if (v0Var2 instanceof n0) {
                                            strB = lid.l.PRODUCT_TILE.b();
                                        } else if (v0Var2 instanceof mid.o0) {
                                            strB = lid.l.SOLD_OUT_HERO_TILE.b();
                                        } else if (v0Var2 instanceof p0) {
                                            strB = lid.l.SOLD_OUT_TILE.b();
                                        } else if (v0Var2 instanceof q0) {
                                            strB = lid.l.WAITLIST_HERO_TILE.b();
                                        } else if (v0Var2 instanceof r0) {
                                            strB = lid.l.WAITLIST_TILE.b();
                                        } else if (v0Var2 instanceof s0) {
                                            strB = lid.l.FROZEN_HERO_TILE.b();
                                        } else if (v0Var2 instanceof t0) {
                                            strB = lid.l.FROZEN_TILE.b();
                                        } else if (v0Var2 instanceof mid.i0) {
                                            strB = lid.l.AUCTION_HERO_TILE.b();
                                        } else if (v0Var2 instanceof mid.j0) {
                                            strB = lid.l.AUCTION_TILE.b();
                                        } else if (v0Var2 instanceof u0) {
                                            strB = lid.l.PURCHASE_TILE.b();
                                        } else if (v0Var2 instanceof mid.e0) {
                                            strB = lid.l.BID_TILE.b();
                                        } else {
                                            if (!(v0Var2 instanceof v0.a)) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            strB = lid.l.UNKNOWN_TILE.b();
                                        }
                                        String str10 = strB;
                                        String str11 = d0Var.f205693c;
                                        String str12 = d0Var.d;
                                        String str13 = d0Var.e;
                                        String str14 = d0Var.f;
                                        String str15 = d0Var.f205694g;
                                        String str16 = d0Var.f205695h;
                                        EarningBadge earningBadge = d0Var.i;
                                        sid.d dVarC = earningBadge != null ? lid.b.c(earningBadge) : null;
                                        ShopsContext shopsContextA = v0Var2.a();
                                        ShopsCampaignOffer shopsCampaignOffer = shopsContextA instanceof ShopsCampaignOffer ? (ShopsCampaignOffer) shopsContextA : null;
                                        sid.f fVarC = shopsCampaignOffer != null ? lid.c.c(shopsCampaignOffer) : null;
                                        ShopsContext shopsContextA2 = v0Var2.a();
                                        ShopsDeeplinkOffer shopsDeeplinkOffer = shopsContextA2 instanceof ShopsDeeplinkOffer ? (ShopsDeeplinkOffer) shopsContextA2 : null;
                                        if (shopsDeeplinkOffer != null) {
                                            Intrinsics.checkNotNullParameter(shopsDeeplinkOffer, "<this>");
                                            v0Var = v0Var2;
                                            iVar = new sid.i(shopsDeeplinkOffer.f87042a, shopsDeeplinkOffer.f87043b);
                                        } else {
                                            v0Var = v0Var2;
                                            iVar = null;
                                        }
                                        ShopsContext shopsContextA3 = v0Var.a();
                                        ShopsFrozenOffer shopsFrozenOffer = shopsContextA3 instanceof ShopsFrozenOffer ? (ShopsFrozenOffer) shopsContextA3 : null;
                                        if (shopsFrozenOffer != null) {
                                            Intrinsics.checkNotNullParameter(shopsFrozenOffer, "<this>");
                                            kVar = new sid.k(shopsFrozenOffer.f87049c, shopsFrozenOffer.d);
                                        } else {
                                            kVar = null;
                                        }
                                        ShopsContext shopsContextA4 = v0Var.a();
                                        ShopsProductOffer shopsProductOffer = shopsContextA4 instanceof ShopsProductOffer ? (ShopsProductOffer) shopsContextA4 : null;
                                        if (shopsProductOffer != null) {
                                            Intrinsics.checkNotNullParameter(shopsProductOffer, "<this>");
                                            String str17 = shopsProductOffer.f87062a;
                                            String str18 = shopsProductOffer.e;
                                            it8 = it10;
                                            Double d = shopsProductOffer.f87064c;
                                            str = str6;
                                            tVar = new sid.t(str17, shopsProductOffer.f87063b, d != null ? String.valueOf(d.doubleValue()) : null, str18);
                                        } else {
                                            it8 = it10;
                                            str = str6;
                                            tVar = null;
                                        }
                                        ShopsContext shopsContextA5 = v0Var.a();
                                        ShopsAuction shopsAuction = shopsContextA5 instanceof ShopsAuction ? (ShopsAuction) shopsContextA5 : null;
                                        if (shopsAuction == null || (offer = shopsAuction.f87010a) == null) {
                                            bVar = null;
                                        } else {
                                            Intrinsics.checkNotNullParameter(offer, "<this>");
                                            String strValueOf = String.valueOf(offer.f87017c);
                                            String string = offer.f87016b.toString();
                                            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                                            bVar = new sid.b(offer.f87015a, string, strValueOf, offer.d, offer.e);
                                        }
                                        ShopsContext shopsContextA6 = v0Var.a();
                                        ShopsSoldOutProductOffer shopsSoldOutProductOffer = shopsContextA6 instanceof ShopsSoldOutProductOffer ? (ShopsSoldOutProductOffer) shopsContextA6 : null;
                                        if (shopsSoldOutProductOffer != null) {
                                            Intrinsics.checkNotNullParameter(shopsSoldOutProductOffer, "<this>");
                                            vVar = new sid.v(shopsSoldOutProductOffer.f87076b);
                                        } else {
                                            vVar = null;
                                        }
                                        ShopsContext shopsContextA7 = v0Var.a();
                                        ShopsLockedProductOffer shopsLockedProductOffer = shopsContextA7 instanceof ShopsLockedProductOffer ? (ShopsLockedProductOffer) shopsContextA7 : null;
                                        if (shopsLockedProductOffer != null) {
                                            Intrinsics.checkNotNullParameter(shopsLockedProductOffer, "<this>");
                                            String str19 = shopsLockedProductOffer.f87053a;
                                            String str20 = shopsLockedProductOffer.e;
                                            String str21 = shopsLockedProductOffer.f87054b;
                                            List list2 = shopsLockedProductOffer.f87055c;
                                            str2 = str7;
                                            str3 = str8;
                                            str4 = str9;
                                            ArrayList arrayList5 = new ArrayList(zhm.w.t(list2, 10));
                                            Iterator it12 = list2.iterator();
                                            while (it12.hasNext()) {
                                                arrayList5.add(((m1c.r) it12.next()).name());
                                            }
                                            pVar = new sid.p(str19, str21, str20, arrayList5);
                                        } else {
                                            str2 = str7;
                                            str3 = str8;
                                            str4 = str9;
                                            pVar = null;
                                        }
                                        ShopsContext shopsContextA8 = v0Var.a();
                                        ShopsWaitlistOffer shopsWaitlistOffer = shopsContextA8 instanceof ShopsWaitlistOffer ? (ShopsWaitlistOffer) shopsContextA8 : null;
                                        if (shopsWaitlistOffer != null) {
                                            Intrinsics.checkNotNullParameter(shopsWaitlistOffer, "<this>");
                                            hVar = new sid.h(shopsWaitlistOffer.f87078b);
                                        } else {
                                            hVar = null;
                                        }
                                        ShopsContext shopsContextA9 = v0Var.a();
                                        ShopsAuction shopsAuction2 = shopsContextA9 instanceof ShopsAuction ? (ShopsAuction) shopsContextA9 : null;
                                        if (shopsAuction2 == null || (bid2 = shopsAuction2.f87011b) == null) {
                                            eVar = null;
                                        } else {
                                            Intrinsics.checkNotNullParameter(bid2, "<this>");
                                            eVar = new sid.e(String.valueOf(bid2.f87013a), bid2.f87014b.toString());
                                        }
                                        ShopsContext shopsContextA10 = v0Var.a();
                                        ShopsPurchase shopsPurchase = shopsContextA10 instanceof ShopsPurchase ? (ShopsPurchase) shopsContextA10 : null;
                                        if (shopsPurchase != null) {
                                            Intrinsics.checkNotNullParameter(shopsPurchase, "<this>");
                                            String str22 = shopsPurchase.d;
                                            String string2 = shopsPurchase.f.toString();
                                            Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                                            String strValueOf2 = String.valueOf(shopsPurchase.f87069h);
                                            String str23 = shopsPurchase.f87065a;
                                            String strName = shopsPurchase.f87066b.name();
                                            int i92 = shopsPurchase.f87068g;
                                            Address address = shopsPurchase.i;
                                            uVar = new sid.u(str23, strName, string2, shopsPurchase.k, i92, strValueOf2, address != null ? oo3.a.d(address) : null, shopsPurchase.f87071l, str22);
                                        } else {
                                            uVar = null;
                                        }
                                        arrayList4.add(new sid.w(str4, str10, str11, str12, str13, str14, str15, str16, dVarC, fVarC, iVar, kVar, tVar, bVar, vVar, pVar, hVar, eVar, uVar));
                                        it9 = it11;
                                        it10 = it8;
                                        str6 = str;
                                        str7 = str2;
                                        str8 = str3;
                                    }
                                    Iterator it13 = it9;
                                    String str24 = str6;
                                    String str25 = str7;
                                    String str26 = str8;
                                    List<mid.g> list3 = nVar.e;
                                    ArrayList arrayList6 = new ArrayList(zhm.w.t(list3, 10));
                                    for (mid.g gVar : list3) {
                                        Intrinsics.checkNotNullParameter(gVar, "<this>");
                                        String str27 = gVar.f205702a;
                                        EarningBadge earningBadge2 = gVar.f205703b;
                                        arrayList6.add(new sid.a(str27, earningBadge2 != null ? lid.b.c(earningBadge2) : null));
                                    }
                                    bo3.a aVar = nVar.f;
                                    if (aVar != null) {
                                        Intrinsics.checkNotNullParameter(aVar, "<this>");
                                        co3.a aVar2 = aVar.f17282a;
                                        Intrinsics.checkNotNullParameter(aVar2, "<this>");
                                        sid.o oVar = new sid.o(aVar2.f25486a, aVar2.f25487b);
                                        co3.a aVar3 = aVar.f17283b;
                                        Intrinsics.checkNotNullParameter(aVar3, "<this>");
                                        qVar = new sid.q(oVar, new sid.o(aVar3.f25486a, aVar3.f25487b));
                                    } else {
                                        qVar = null;
                                    }
                                    List list4 = nVar.f205732g;
                                    if (list4 != null) {
                                        List list5 = list4;
                                        i662 = 10;
                                        ArrayList arrayList7 = new ArrayList(zhm.w.t(list5, 10));
                                        Iterator it14 = list5.iterator();
                                        while (it14.hasNext()) {
                                            arrayList7.add(yoj.b.N((ShopsOutlet) it14.next()));
                                        }
                                        arrayList = arrayList7;
                                    } else {
                                        i662 = 10;
                                        arrayList = null;
                                    }
                                    ?? r2 = nVar.f205733h;
                                    ArrayList arrayList8 = new ArrayList(r2.size());
                                    Iterator it15 = r2.entrySet().iterator();
                                    while (it15.hasNext()) {
                                        arrayList8.add(lid.c.c((ShopsCampaignOffer) ((Map.Entry) it15.next()).getValue()));
                                    }
                                    arrayList3.add(new sid.l(str24, str25, str26, arrayList4, arrayList6, qVar, arrayList, arrayList8));
                                    i74 = i662;
                                    it9 = it13;
                                }
                                cVar.G(new sid.m(arrayList3), str5, wim.z.d(o0.b(sid.m.class)));
                                return Unit.f186387a;
                        }
                    }
                };
                Function1 function18 = new Function1(this) { // from class: oid.v

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ e f225679b;

                    {
                        this.f225679b = this;
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Removed duplicated region for block: B:123:0x02a6  */
                    /* JADX WARN: Removed duplicated region for block: B:131:0x02cc  */
                    /* JADX WARN: Removed duplicated region for block: B:145:0x030d  */
                    /* JADX WARN: Removed duplicated region for block: B:159:0x034e  */
                    /* JADX WARN: Removed duplicated region for block: B:201:0x043d  */
                    /* JADX WARN: Removed duplicated region for block: B:202:0x0440  */
                    /* JADX WARN: Removed duplicated region for block: B:44:0x0121  */
                    /* JADX WARN: Removed duplicated region for block: B:86:0x01f7  */
                    /* JADX WARN: Removed duplicated region for block: B:87:0x01fe  */
                    /* JADX WARN: Type inference failed for: r13v0, types: [java.util.List] */
                    /* JADX WARN: Type inference failed for: r1v2, types: [zhm.f0] */
                    /* JADX WARN: Type inference failed for: r1v20, types: [java.util.ArrayList] */
                    /* JADX WARN: Type inference failed for: r1v3 */
                    @Override // kotlin.jvm.functions.Function1
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final java.lang.Object invoke(java.lang.Object r36) {
                        /*
                            Method dump skipped, instruction units count: 1464
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: oid.v.invoke(java.lang.Object):java.lang.Object");
                    }
                };
                final int i74 = 2;
                this.d = new w4l.f(function27, function17, function28, function18, new Function2(this) { // from class: oid.u

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ e f225677b;

                    {
                        this.f225677b = this;
                    }

                    /* JADX WARN: Type inference failed for: r2v19, types: [java.lang.Object, java.util.Map] */
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        sid.q qVar;
                        int i662;
                        ArrayList arrayList;
                        String strB;
                        v0 v0Var;
                        sid.i iVar;
                        sid.k kVar;
                        Iterator it8;
                        String str;
                        sid.t tVar;
                        sid.b bVar;
                        sid.v vVar;
                        String str2;
                        String str3;
                        String str4;
                        sid.p pVar;
                        sid.h hVar;
                        sid.e eVar;
                        sid.u uVar;
                        ShopsAuction.Bid bid2;
                        ShopsAuction.Offer offer;
                        switch (i74) {
                            case 0:
                                w4l.f DataObservableDelegate = (w4l.f) obj2;
                                t params = (t) obj3;
                                Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                                Intrinsics.checkNotNullParameter(params, "params");
                                efm.d0<eid.q> homeCategoryLayout = this.f225677b.f225624a.getHomeCategoryLayout(params.f225673a, params.f225674b, params.f225675c, null);
                                oc8.e eVar2 = new oc8.e(29, new oh3.a(11));
                                homeCategoryLayout.getClass();
                                ufm.i iVar2 = new ufm.i(homeCategoryLayout, eVar2, 1);
                                Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                                return iVar2;
                            case 1:
                                t params2 = (t) obj2;
                                mid.m shopsHomeLayout = (mid.m) obj3;
                                Intrinsics.checkNotNullParameter(params2, "params");
                                Intrinsics.checkNotNullParameter(shopsHomeLayout, "shopsHomeLayout");
                                this.f225677b.f225625b.f("MEMORY_CACHE_SHOPS_HOME_" + params2.f225673a, shopsHomeLayout);
                                return Unit.f186387a;
                            default:
                                t params3 = (t) obj2;
                                mid.m shopsHomeLayout2 = (mid.m) obj3;
                                Intrinsics.checkNotNullParameter(params3, "params");
                                Intrinsics.checkNotNullParameter(shopsHomeLayout2, "shopsHomeLayout");
                                ue0.c cVar = this.f225677b.f225626c;
                                String str5 = "STORAGE_KEY_SHOPS_HOME_" + params3.f225673a;
                                Intrinsics.checkNotNullParameter(shopsHomeLayout2, "<this>");
                                ArrayList arrayList2 = shopsHomeLayout2.f205726a;
                                int i742 = 10;
                                ArrayList arrayList3 = new ArrayList(zhm.w.t(arrayList2, 10));
                                Iterator it9 = arrayList2.iterator();
                                while (it9.hasNext()) {
                                    mid.n nVar = (mid.n) it9.next();
                                    Intrinsics.checkNotNullParameter(nVar, "<this>");
                                    String str6 = nVar.f205729a;
                                    String str7 = nVar.f205730b;
                                    String str8 = nVar.f205731c;
                                    List list = nVar.d;
                                    ArrayList arrayList4 = new ArrayList(zhm.w.t(list, i742));
                                    Iterator it10 = list.iterator();
                                    while (it10.hasNext()) {
                                        mid.d0 d0Var = (mid.d0) it10.next();
                                        Intrinsics.checkNotNullParameter(d0Var, "<this>");
                                        String str9 = d0Var.f205691a;
                                        v0 v0Var2 = d0Var.f205692b;
                                        Iterator it11 = it9;
                                        if (v0Var2 instanceof mid.f0) {
                                            strB = lid.l.CAMPAIGN_HERO_TILE.b();
                                        } else if (v0Var2 instanceof mid.g0) {
                                            strB = lid.l.CAMPAIGN_TILE.b();
                                        } else if (v0Var2 instanceof mid.h0) {
                                            strB = lid.l.DEEPLINK_TILE.b();
                                        } else if (v0Var2 instanceof mid.k0) {
                                            strB = lid.l.LOCKED_HERO_TILE.b();
                                        } else if (v0Var2 instanceof mid.l0) {
                                            strB = lid.l.LOCKED_TILE.b();
                                        } else if (v0Var2 instanceof mid.m0) {
                                            strB = lid.l.PRODUCT_HERO_TILE.b();
                                        } else if (v0Var2 instanceof n0) {
                                            strB = lid.l.PRODUCT_TILE.b();
                                        } else if (v0Var2 instanceof mid.o0) {
                                            strB = lid.l.SOLD_OUT_HERO_TILE.b();
                                        } else if (v0Var2 instanceof p0) {
                                            strB = lid.l.SOLD_OUT_TILE.b();
                                        } else if (v0Var2 instanceof q0) {
                                            strB = lid.l.WAITLIST_HERO_TILE.b();
                                        } else if (v0Var2 instanceof r0) {
                                            strB = lid.l.WAITLIST_TILE.b();
                                        } else if (v0Var2 instanceof s0) {
                                            strB = lid.l.FROZEN_HERO_TILE.b();
                                        } else if (v0Var2 instanceof t0) {
                                            strB = lid.l.FROZEN_TILE.b();
                                        } else if (v0Var2 instanceof mid.i0) {
                                            strB = lid.l.AUCTION_HERO_TILE.b();
                                        } else if (v0Var2 instanceof mid.j0) {
                                            strB = lid.l.AUCTION_TILE.b();
                                        } else if (v0Var2 instanceof u0) {
                                            strB = lid.l.PURCHASE_TILE.b();
                                        } else if (v0Var2 instanceof mid.e0) {
                                            strB = lid.l.BID_TILE.b();
                                        } else {
                                            if (!(v0Var2 instanceof v0.a)) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            strB = lid.l.UNKNOWN_TILE.b();
                                        }
                                        String str10 = strB;
                                        String str11 = d0Var.f205693c;
                                        String str12 = d0Var.d;
                                        String str13 = d0Var.e;
                                        String str14 = d0Var.f;
                                        String str15 = d0Var.f205694g;
                                        String str16 = d0Var.f205695h;
                                        EarningBadge earningBadge = d0Var.i;
                                        sid.d dVarC = earningBadge != null ? lid.b.c(earningBadge) : null;
                                        ShopsContext shopsContextA = v0Var2.a();
                                        ShopsCampaignOffer shopsCampaignOffer = shopsContextA instanceof ShopsCampaignOffer ? (ShopsCampaignOffer) shopsContextA : null;
                                        sid.f fVarC = shopsCampaignOffer != null ? lid.c.c(shopsCampaignOffer) : null;
                                        ShopsContext shopsContextA2 = v0Var2.a();
                                        ShopsDeeplinkOffer shopsDeeplinkOffer = shopsContextA2 instanceof ShopsDeeplinkOffer ? (ShopsDeeplinkOffer) shopsContextA2 : null;
                                        if (shopsDeeplinkOffer != null) {
                                            Intrinsics.checkNotNullParameter(shopsDeeplinkOffer, "<this>");
                                            v0Var = v0Var2;
                                            iVar = new sid.i(shopsDeeplinkOffer.f87042a, shopsDeeplinkOffer.f87043b);
                                        } else {
                                            v0Var = v0Var2;
                                            iVar = null;
                                        }
                                        ShopsContext shopsContextA3 = v0Var.a();
                                        ShopsFrozenOffer shopsFrozenOffer = shopsContextA3 instanceof ShopsFrozenOffer ? (ShopsFrozenOffer) shopsContextA3 : null;
                                        if (shopsFrozenOffer != null) {
                                            Intrinsics.checkNotNullParameter(shopsFrozenOffer, "<this>");
                                            kVar = new sid.k(shopsFrozenOffer.f87049c, shopsFrozenOffer.d);
                                        } else {
                                            kVar = null;
                                        }
                                        ShopsContext shopsContextA4 = v0Var.a();
                                        ShopsProductOffer shopsProductOffer = shopsContextA4 instanceof ShopsProductOffer ? (ShopsProductOffer) shopsContextA4 : null;
                                        if (shopsProductOffer != null) {
                                            Intrinsics.checkNotNullParameter(shopsProductOffer, "<this>");
                                            String str17 = shopsProductOffer.f87062a;
                                            String str18 = shopsProductOffer.e;
                                            it8 = it10;
                                            Double d = shopsProductOffer.f87064c;
                                            str = str6;
                                            tVar = new sid.t(str17, shopsProductOffer.f87063b, d != null ? String.valueOf(d.doubleValue()) : null, str18);
                                        } else {
                                            it8 = it10;
                                            str = str6;
                                            tVar = null;
                                        }
                                        ShopsContext shopsContextA5 = v0Var.a();
                                        ShopsAuction shopsAuction = shopsContextA5 instanceof ShopsAuction ? (ShopsAuction) shopsContextA5 : null;
                                        if (shopsAuction == null || (offer = shopsAuction.f87010a) == null) {
                                            bVar = null;
                                        } else {
                                            Intrinsics.checkNotNullParameter(offer, "<this>");
                                            String strValueOf = String.valueOf(offer.f87017c);
                                            String string = offer.f87016b.toString();
                                            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                                            bVar = new sid.b(offer.f87015a, string, strValueOf, offer.d, offer.e);
                                        }
                                        ShopsContext shopsContextA6 = v0Var.a();
                                        ShopsSoldOutProductOffer shopsSoldOutProductOffer = shopsContextA6 instanceof ShopsSoldOutProductOffer ? (ShopsSoldOutProductOffer) shopsContextA6 : null;
                                        if (shopsSoldOutProductOffer != null) {
                                            Intrinsics.checkNotNullParameter(shopsSoldOutProductOffer, "<this>");
                                            vVar = new sid.v(shopsSoldOutProductOffer.f87076b);
                                        } else {
                                            vVar = null;
                                        }
                                        ShopsContext shopsContextA7 = v0Var.a();
                                        ShopsLockedProductOffer shopsLockedProductOffer = shopsContextA7 instanceof ShopsLockedProductOffer ? (ShopsLockedProductOffer) shopsContextA7 : null;
                                        if (shopsLockedProductOffer != null) {
                                            Intrinsics.checkNotNullParameter(shopsLockedProductOffer, "<this>");
                                            String str19 = shopsLockedProductOffer.f87053a;
                                            String str20 = shopsLockedProductOffer.e;
                                            String str21 = shopsLockedProductOffer.f87054b;
                                            List list2 = shopsLockedProductOffer.f87055c;
                                            str2 = str7;
                                            str3 = str8;
                                            str4 = str9;
                                            ArrayList arrayList5 = new ArrayList(zhm.w.t(list2, 10));
                                            Iterator it12 = list2.iterator();
                                            while (it12.hasNext()) {
                                                arrayList5.add(((m1c.r) it12.next()).name());
                                            }
                                            pVar = new sid.p(str19, str21, str20, arrayList5);
                                        } else {
                                            str2 = str7;
                                            str3 = str8;
                                            str4 = str9;
                                            pVar = null;
                                        }
                                        ShopsContext shopsContextA8 = v0Var.a();
                                        ShopsWaitlistOffer shopsWaitlistOffer = shopsContextA8 instanceof ShopsWaitlistOffer ? (ShopsWaitlistOffer) shopsContextA8 : null;
                                        if (shopsWaitlistOffer != null) {
                                            Intrinsics.checkNotNullParameter(shopsWaitlistOffer, "<this>");
                                            hVar = new sid.h(shopsWaitlistOffer.f87078b);
                                        } else {
                                            hVar = null;
                                        }
                                        ShopsContext shopsContextA9 = v0Var.a();
                                        ShopsAuction shopsAuction2 = shopsContextA9 instanceof ShopsAuction ? (ShopsAuction) shopsContextA9 : null;
                                        if (shopsAuction2 == null || (bid2 = shopsAuction2.f87011b) == null) {
                                            eVar = null;
                                        } else {
                                            Intrinsics.checkNotNullParameter(bid2, "<this>");
                                            eVar = new sid.e(String.valueOf(bid2.f87013a), bid2.f87014b.toString());
                                        }
                                        ShopsContext shopsContextA10 = v0Var.a();
                                        ShopsPurchase shopsPurchase = shopsContextA10 instanceof ShopsPurchase ? (ShopsPurchase) shopsContextA10 : null;
                                        if (shopsPurchase != null) {
                                            Intrinsics.checkNotNullParameter(shopsPurchase, "<this>");
                                            String str22 = shopsPurchase.d;
                                            String string2 = shopsPurchase.f.toString();
                                            Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                                            String strValueOf2 = String.valueOf(shopsPurchase.f87069h);
                                            String str23 = shopsPurchase.f87065a;
                                            String strName = shopsPurchase.f87066b.name();
                                            int i92 = shopsPurchase.f87068g;
                                            Address address = shopsPurchase.i;
                                            uVar = new sid.u(str23, strName, string2, shopsPurchase.k, i92, strValueOf2, address != null ? oo3.a.d(address) : null, shopsPurchase.f87071l, str22);
                                        } else {
                                            uVar = null;
                                        }
                                        arrayList4.add(new sid.w(str4, str10, str11, str12, str13, str14, str15, str16, dVarC, fVarC, iVar, kVar, tVar, bVar, vVar, pVar, hVar, eVar, uVar));
                                        it9 = it11;
                                        it10 = it8;
                                        str6 = str;
                                        str7 = str2;
                                        str8 = str3;
                                    }
                                    Iterator it13 = it9;
                                    String str24 = str6;
                                    String str25 = str7;
                                    String str26 = str8;
                                    List<mid.g> list3 = nVar.e;
                                    ArrayList arrayList6 = new ArrayList(zhm.w.t(list3, 10));
                                    for (mid.g gVar : list3) {
                                        Intrinsics.checkNotNullParameter(gVar, "<this>");
                                        String str27 = gVar.f205702a;
                                        EarningBadge earningBadge2 = gVar.f205703b;
                                        arrayList6.add(new sid.a(str27, earningBadge2 != null ? lid.b.c(earningBadge2) : null));
                                    }
                                    bo3.a aVar = nVar.f;
                                    if (aVar != null) {
                                        Intrinsics.checkNotNullParameter(aVar, "<this>");
                                        co3.a aVar2 = aVar.f17282a;
                                        Intrinsics.checkNotNullParameter(aVar2, "<this>");
                                        sid.o oVar = new sid.o(aVar2.f25486a, aVar2.f25487b);
                                        co3.a aVar3 = aVar.f17283b;
                                        Intrinsics.checkNotNullParameter(aVar3, "<this>");
                                        qVar = new sid.q(oVar, new sid.o(aVar3.f25486a, aVar3.f25487b));
                                    } else {
                                        qVar = null;
                                    }
                                    List list4 = nVar.f205732g;
                                    if (list4 != null) {
                                        List list5 = list4;
                                        i662 = 10;
                                        ArrayList arrayList7 = new ArrayList(zhm.w.t(list5, 10));
                                        Iterator it14 = list5.iterator();
                                        while (it14.hasNext()) {
                                            arrayList7.add(yoj.b.N((ShopsOutlet) it14.next()));
                                        }
                                        arrayList = arrayList7;
                                    } else {
                                        i662 = 10;
                                        arrayList = null;
                                    }
                                    ?? r2 = nVar.f205733h;
                                    ArrayList arrayList8 = new ArrayList(r2.size());
                                    Iterator it15 = r2.entrySet().iterator();
                                    while (it15.hasNext()) {
                                        arrayList8.add(lid.c.c((ShopsCampaignOffer) ((Map.Entry) it15.next()).getValue()));
                                    }
                                    arrayList3.add(new sid.l(str24, str25, str26, arrayList4, arrayList6, qVar, arrayList, arrayList8));
                                    i742 = i662;
                                    it9 = it13;
                                }
                                cVar.G(new sid.m(arrayList3), str5, wim.z.d(o0.b(sid.m.class)));
                                return Unit.f186387a;
                        }
                    }
                }, null, null, null, BERTags.FLAGS);
                break;
            case 5:
                Intrinsics.checkNotNullParameter(advertisingService, "advertisingService");
                Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
                Intrinsics.checkNotNullParameter(storage, "storage");
                this.f225624a = advertisingService;
                this.f225625b = memoryCache;
                this.f225626c = storage;
                final int i92 = 0;
                Function2 function29 = new Function2(this) { // from class: oid.j0

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ e f225648b;

                    {
                        this.f225648b = this;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        switch (i92) {
                            case 0:
                                w4l.f DataObservableDelegate = (w4l.f) obj2;
                                a params = (a) obj3;
                                Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                                Intrinsics.checkNotNullParameter(params, "params");
                                break;
                            case 1:
                                a params2 = (a) obj2;
                                mid.a0 results = (mid.a0) obj3;
                                Intrinsics.checkNotNullParameter(params2, "params");
                                Intrinsics.checkNotNullParameter(results, "results");
                                this.f225648b.f225625b.f("MEMORY_CACHE_SHOPS_SEARCH_LAYOUT_" + params2.a(), results);
                                break;
                            default:
                                a params3 = (a) obj2;
                                mid.a0 results2 = (mid.a0) obj3;
                                Intrinsics.checkNotNullParameter(params3, "params");
                                Intrinsics.checkNotNullParameter(results2, "results");
                                this.f225648b.f225626c.G(results2, j6.a.q("MEMORY_CACHE_SHOPS_SEARCH_LAYOUT_", params3.a()), wim.z.d(o0.b(mid.a0.class)));
                                break;
                        }
                        return Unit.f186387a;
                    }
                };
                Function1 function19 = new Function1(this) { // from class: oid.k0

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ e f225653b;

                    {
                        this.f225653b = this;
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        a params = (a) obj2;
                        switch (i92) {
                            case 0:
                                Intrinsics.checkNotNullParameter(params, "params");
                                return (mid.a0) v7.r("MEMORY_CACHE_SHOPS_SEARCH_LAYOUT_", params.a(), this.f225653b.f225625b);
                            default:
                                Intrinsics.checkNotNullParameter(params, "params");
                                return (mid.a0) this.f225653b.f225626c.T2("MEMORY_CACHE_SHOPS_SEARCH_LAYOUT_" + params.a(), mid.a0.class);
                        }
                    }
                };
                final int i96 = 1;
                Function2 function210 = new Function2(this) { // from class: oid.j0

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ e f225648b;

                    {
                        this.f225648b = this;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        switch (i96) {
                            case 0:
                                w4l.f DataObservableDelegate = (w4l.f) obj2;
                                a params = (a) obj3;
                                Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                                Intrinsics.checkNotNullParameter(params, "params");
                                break;
                            case 1:
                                a params2 = (a) obj2;
                                mid.a0 results = (mid.a0) obj3;
                                Intrinsics.checkNotNullParameter(params2, "params");
                                Intrinsics.checkNotNullParameter(results, "results");
                                this.f225648b.f225625b.f("MEMORY_CACHE_SHOPS_SEARCH_LAYOUT_" + params2.a(), results);
                                break;
                            default:
                                a params3 = (a) obj2;
                                mid.a0 results2 = (mid.a0) obj3;
                                Intrinsics.checkNotNullParameter(params3, "params");
                                Intrinsics.checkNotNullParameter(results2, "results");
                                this.f225648b.f225626c.G(results2, j6.a.q("MEMORY_CACHE_SHOPS_SEARCH_LAYOUT_", params3.a()), wim.z.d(o0.b(mid.a0.class)));
                                break;
                        }
                        return Unit.f186387a;
                    }
                };
                Function1 function110 = new Function1(this) { // from class: oid.k0

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ e f225653b;

                    {
                        this.f225653b = this;
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        a params = (a) obj2;
                        switch (i96) {
                            case 0:
                                Intrinsics.checkNotNullParameter(params, "params");
                                return (mid.a0) v7.r("MEMORY_CACHE_SHOPS_SEARCH_LAYOUT_", params.a(), this.f225653b.f225625b);
                            default:
                                Intrinsics.checkNotNullParameter(params, "params");
                                return (mid.a0) this.f225653b.f225626c.T2("MEMORY_CACHE_SHOPS_SEARCH_LAYOUT_" + params.a(), mid.a0.class);
                        }
                    }
                };
                final int i99 = 2;
                this.d = new w4l.f(function29, function19, function210, function110, new Function2(this) { // from class: oid.j0

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ e f225648b;

                    {
                        this.f225648b = this;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        switch (i99) {
                            case 0:
                                w4l.f DataObservableDelegate = (w4l.f) obj2;
                                a params = (a) obj3;
                                Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                                Intrinsics.checkNotNullParameter(params, "params");
                                break;
                            case 1:
                                a params2 = (a) obj2;
                                mid.a0 results = (mid.a0) obj3;
                                Intrinsics.checkNotNullParameter(params2, "params");
                                Intrinsics.checkNotNullParameter(results, "results");
                                this.f225648b.f225625b.f("MEMORY_CACHE_SHOPS_SEARCH_LAYOUT_" + params2.a(), results);
                                break;
                            default:
                                a params3 = (a) obj2;
                                mid.a0 results2 = (mid.a0) obj3;
                                Intrinsics.checkNotNullParameter(params3, "params");
                                Intrinsics.checkNotNullParameter(results2, "results");
                                this.f225648b.f225626c.G(results2, j6.a.q("MEMORY_CACHE_SHOPS_SEARCH_LAYOUT_", params3.a()), wim.z.d(o0.b(mid.a0.class)));
                                break;
                        }
                        return Unit.f186387a;
                    }
                }, null, null, null, BERTags.FLAGS);
                break;
            case 6:
                Intrinsics.checkNotNullParameter(advertisingService, "advertisingService");
                Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
                Intrinsics.checkNotNullParameter(storage, "storage");
                this.f225624a = advertisingService;
                this.f225625b = memoryCache;
                this.f225626c = storage;
                final int i100 = 0;
                Function2 function211 = new Function2(this) { // from class: oid.l0

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ e f225657b;

                    {
                        this.f225657b = this;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        switch (i100) {
                            case 0:
                                w4l.f DataObservableDelegate = (w4l.f) obj2;
                                b params = (b) obj3;
                                Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                                Intrinsics.checkNotNullParameter(params, "params");
                                break;
                            case 1:
                                b params2 = (b) obj2;
                                eid.c0 shopsCarousels = (eid.c0) obj3;
                                Intrinsics.checkNotNullParameter(params2, "params");
                                Intrinsics.checkNotNullParameter(shopsCarousels, "shopsCarousels");
                                this.f225657b.f225625b.f("MEMORY_CACHE_SHOPS_SEARCH__" + params2.a(), shopsCarousels);
                                break;
                            default:
                                b params3 = (b) obj2;
                                eid.c0 shopsCarousels2 = (eid.c0) obj3;
                                Intrinsics.checkNotNullParameter(params3, "params");
                                Intrinsics.checkNotNullParameter(shopsCarousels2, "shopsCarousels");
                                this.f225657b.f225626c.G(shopsCarousels2, j6.a.q("MEMORY_CACHE_SHOPS_SEARCH__", params3.a()), wim.z.d(o0.b(eid.c0.class)));
                                break;
                        }
                        return Unit.f186387a;
                    }
                };
                Function1 function111 = new Function1(this) { // from class: oid.m0

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ e f225661b;

                    {
                        this.f225661b = this;
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        b params = (b) obj2;
                        switch (i100) {
                            case 0:
                                Intrinsics.checkNotNullParameter(params, "params");
                                return (eid.c0) v7.r("MEMORY_CACHE_SHOPS_SEARCH__", params.a(), this.f225661b.f225625b);
                            default:
                                Intrinsics.checkNotNullParameter(params, "params");
                                return (eid.c0) this.f225661b.f225626c.T2("MEMORY_CACHE_SHOPS_SEARCH__" + params.a(), eid.c0.class);
                        }
                    }
                };
                final int i101 = 1;
                Function2 function212 = new Function2(this) { // from class: oid.l0

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ e f225657b;

                    {
                        this.f225657b = this;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        switch (i101) {
                            case 0:
                                w4l.f DataObservableDelegate = (w4l.f) obj2;
                                b params = (b) obj3;
                                Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                                Intrinsics.checkNotNullParameter(params, "params");
                                break;
                            case 1:
                                b params2 = (b) obj2;
                                eid.c0 shopsCarousels = (eid.c0) obj3;
                                Intrinsics.checkNotNullParameter(params2, "params");
                                Intrinsics.checkNotNullParameter(shopsCarousels, "shopsCarousels");
                                this.f225657b.f225625b.f("MEMORY_CACHE_SHOPS_SEARCH__" + params2.a(), shopsCarousels);
                                break;
                            default:
                                b params3 = (b) obj2;
                                eid.c0 shopsCarousels2 = (eid.c0) obj3;
                                Intrinsics.checkNotNullParameter(params3, "params");
                                Intrinsics.checkNotNullParameter(shopsCarousels2, "shopsCarousels");
                                this.f225657b.f225626c.G(shopsCarousels2, j6.a.q("MEMORY_CACHE_SHOPS_SEARCH__", params3.a()), wim.z.d(o0.b(eid.c0.class)));
                                break;
                        }
                        return Unit.f186387a;
                    }
                };
                Function1 function112 = new Function1(this) { // from class: oid.m0

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ e f225661b;

                    {
                        this.f225661b = this;
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        b params = (b) obj2;
                        switch (i101) {
                            case 0:
                                Intrinsics.checkNotNullParameter(params, "params");
                                return (eid.c0) v7.r("MEMORY_CACHE_SHOPS_SEARCH__", params.a(), this.f225661b.f225625b);
                            default:
                                Intrinsics.checkNotNullParameter(params, "params");
                                return (eid.c0) this.f225661b.f225626c.T2("MEMORY_CACHE_SHOPS_SEARCH__" + params.a(), eid.c0.class);
                        }
                    }
                };
                final int i102 = 2;
                this.d = new w4l.f(function211, function111, function212, function112, new Function2(this) { // from class: oid.l0

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ e f225657b;

                    {
                        this.f225657b = this;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        switch (i102) {
                            case 0:
                                w4l.f DataObservableDelegate = (w4l.f) obj2;
                                b params = (b) obj3;
                                Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                                Intrinsics.checkNotNullParameter(params, "params");
                                break;
                            case 1:
                                b params2 = (b) obj2;
                                eid.c0 shopsCarousels = (eid.c0) obj3;
                                Intrinsics.checkNotNullParameter(params2, "params");
                                Intrinsics.checkNotNullParameter(shopsCarousels, "shopsCarousels");
                                this.f225657b.f225625b.f("MEMORY_CACHE_SHOPS_SEARCH__" + params2.a(), shopsCarousels);
                                break;
                            default:
                                b params3 = (b) obj2;
                                eid.c0 shopsCarousels2 = (eid.c0) obj3;
                                Intrinsics.checkNotNullParameter(params3, "params");
                                Intrinsics.checkNotNullParameter(shopsCarousels2, "shopsCarousels");
                                this.f225657b.f225626c.G(shopsCarousels2, j6.a.q("MEMORY_CACHE_SHOPS_SEARCH__", params3.a()), wim.z.d(o0.b(eid.c0.class)));
                                break;
                        }
                        return Unit.f186387a;
                    }
                }, null, null, null, BERTags.FLAGS);
                break;
            default:
                Intrinsics.checkNotNullParameter(advertisingService, "advertisingService");
                Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
                Intrinsics.checkNotNullParameter(storage, "storage");
                this.f225624a = advertisingService;
                this.f225625b = memoryCache;
                this.f225626c = storage;
                final int i103 = 0;
                Function2 function213 = new Function2(this) { // from class: oid.c

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ e f225619b;

                    {
                        this.f225619b = this;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        switch (i103) {
                            case 0:
                                w4l.f DataObservableDelegate = (w4l.f) obj2;
                                Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                                Intrinsics.checkNotNullParameter((Unit) obj3, "<unused var>");
                                break;
                            case 1:
                                eid.a shopsAdvertisingInfo = (eid.a) obj3;
                                Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                                Intrinsics.checkNotNullParameter(shopsAdvertisingInfo, "shopsAdvertisingInfo");
                                this.f225619b.f225625b.f("MEMORY_CACHE_SHOPS_ADV_INFO", shopsAdvertisingInfo);
                                break;
                            default:
                                eid.a shopsAdvertisingInfo2 = (eid.a) obj3;
                                Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                                Intrinsics.checkNotNullParameter(shopsAdvertisingInfo2, "shopsAdvertisingInfo");
                                this.f225619b.f225626c.G(shopsAdvertisingInfo2, "STORAGE_CACHE_SHOPS_ADV_INFO", wim.z.d(o0.b(eid.a.class)));
                                break;
                        }
                        return Unit.f186387a;
                    }
                };
                Function1 function113 = new Function1(this) { // from class: oid.d

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ e f225623b;

                    {
                        this.f225623b = this;
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        Unit unit = (Unit) obj2;
                        switch (i103) {
                            case 0:
                                Intrinsics.checkNotNullParameter(unit, "<unused var>");
                                return (eid.a) this.f225623b.f225625b.get("MEMORY_CACHE_SHOPS_ADV_INFO");
                            default:
                                Intrinsics.checkNotNullParameter(unit, "<unused var>");
                                return (eid.a) this.f225623b.f225626c.T2("STORAGE_CACHE_SHOPS_ADV_INFO", eid.a.class);
                        }
                    }
                };
                final int i104 = 1;
                Function2 function214 = new Function2(this) { // from class: oid.c

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ e f225619b;

                    {
                        this.f225619b = this;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        switch (i104) {
                            case 0:
                                w4l.f DataObservableDelegate = (w4l.f) obj2;
                                Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                                Intrinsics.checkNotNullParameter((Unit) obj3, "<unused var>");
                                break;
                            case 1:
                                eid.a shopsAdvertisingInfo = (eid.a) obj3;
                                Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                                Intrinsics.checkNotNullParameter(shopsAdvertisingInfo, "shopsAdvertisingInfo");
                                this.f225619b.f225625b.f("MEMORY_CACHE_SHOPS_ADV_INFO", shopsAdvertisingInfo);
                                break;
                            default:
                                eid.a shopsAdvertisingInfo2 = (eid.a) obj3;
                                Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                                Intrinsics.checkNotNullParameter(shopsAdvertisingInfo2, "shopsAdvertisingInfo");
                                this.f225619b.f225626c.G(shopsAdvertisingInfo2, "STORAGE_CACHE_SHOPS_ADV_INFO", wim.z.d(o0.b(eid.a.class)));
                                break;
                        }
                        return Unit.f186387a;
                    }
                };
                Function1 function114 = new Function1(this) { // from class: oid.d

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ e f225623b;

                    {
                        this.f225623b = this;
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        Unit unit = (Unit) obj2;
                        switch (i104) {
                            case 0:
                                Intrinsics.checkNotNullParameter(unit, "<unused var>");
                                return (eid.a) this.f225623b.f225625b.get("MEMORY_CACHE_SHOPS_ADV_INFO");
                            default:
                                Intrinsics.checkNotNullParameter(unit, "<unused var>");
                                return (eid.a) this.f225623b.f225626c.T2("STORAGE_CACHE_SHOPS_ADV_INFO", eid.a.class);
                        }
                    }
                };
                final int i105 = 2;
                this.d = new w4l.f(function213, function113, function214, function114, new Function2(this) { // from class: oid.c

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ e f225619b;

                    {
                        this.f225619b = this;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        switch (i105) {
                            case 0:
                                w4l.f DataObservableDelegate = (w4l.f) obj2;
                                Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                                Intrinsics.checkNotNullParameter((Unit) obj3, "<unused var>");
                                break;
                            case 1:
                                eid.a shopsAdvertisingInfo = (eid.a) obj3;
                                Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                                Intrinsics.checkNotNullParameter(shopsAdvertisingInfo, "shopsAdvertisingInfo");
                                this.f225619b.f225625b.f("MEMORY_CACHE_SHOPS_ADV_INFO", shopsAdvertisingInfo);
                                break;
                            default:
                                eid.a shopsAdvertisingInfo2 = (eid.a) obj3;
                                Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                                Intrinsics.checkNotNullParameter(shopsAdvertisingInfo2, "shopsAdvertisingInfo");
                                this.f225619b.f225626c.G(shopsAdvertisingInfo2, "STORAGE_CACHE_SHOPS_ADV_INFO", wim.z.d(o0.b(eid.a.class)));
                                break;
                        }
                        return Unit.f186387a;
                    }
                }, null, null, null, BERTags.FLAGS);
                break;
        }
    }
}
