package kjd;

import cli.y;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.feature.rev_points.models.EarningBadge;
import com.revolut.feature.shops.api.model.ShopsCampaignOffer;
import com.revolut.feature.shops.api.model.ShopsCategory;
import com.revolut.feature.shops.api.model.ShopsEarningRate;
import com.revolut.feature.shops.api.model.ShopsInstalmentOption;
import com.revolut.feature.shops.api.model.ShopsOutlet;
import com.revolut.feature.shops.impl.ui.map_view.ShopsMapViewScreen;
import com.revolut.feature.shops.impl.ui.map_view.a;
import ip0.qs;
import java.math.BigDecimal;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import mx0.q9;
import mx0.r9;
import mx0.s9;
import vkm.j2;

/* JADX INFO: loaded from: classes7.dex */
public final class e extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ ShopsMapViewScreen f184369w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(ShopsMapViewScreen shopsMapViewScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f184369w = shopsMapViewScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                e eVar = new e(this.f184369w, continuation, 0);
                eVar.v = obj2;
                return eVar;
            case 1:
                e eVar2 = new e(this.f184369w, continuation, 1);
                eVar2.v = obj2;
                return eVar2;
            case 2:
                e eVar3 = new e(this.f184369w, continuation, 2);
                eVar3.v = obj2;
                return eVar3;
            case 3:
                e eVar4 = new e(this.f184369w, continuation, 3);
                eVar4.v = obj2;
                return eVar4;
            case 4:
                e eVar5 = new e(this.f184369w, continuation, 4);
                eVar5.v = obj2;
                return eVar5;
            default:
                e eVar6 = new e(this.f184369w, continuation, 5);
                eVar6.v = obj2;
                return eVar6;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((e) create((Pair) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((e) create((yv0.k) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((e) create((cr0.h) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 3:
                return ((e) create((koi.j) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 4:
                return ((e) create((qs) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((e) create((zn.f) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        ShopsCampaignOffer shopsCampaignOffer;
        int i = this.u;
        final int i2 = 1;
        Object obj3 = null;
        final ShopsOutlet shopsOutlet = null;
        ShopsMapViewScreen shopsMapViewScreen = this.f184369w;
        switch (i) {
            case 0:
                Pair pair = (Pair) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                s9 s9Var = (s9) pair.f186385a;
                q9 boundariesUpdate = (q9) pair.f186386b;
                j jVarD = shopsMapViewScreen.d();
                Intrinsics.h(boundariesUpdate);
                r9 cameraState = s9Var.f209998a;
                com.revolut.feature.shops.impl.ui.map_view.e eVar = (com.revolut.feature.shops.impl.ui.map_view.e) jVarD;
                y yVar = eVar.u;
                Intrinsics.checkNotNullParameter(boundariesUpdate, "boundariesUpdate");
                Intrinsics.checkNotNullParameter(cameraState, "cameraState");
                if (cameraState == r9.IDLE) {
                    int i3 = p.f184399b[boundariesUpdate.f209963b.ordinal()];
                    if (i3 == 1) {
                        eVar.H2(yVar, new l(boundariesUpdate, eVar));
                    } else if (i3 == 2) {
                        eVar.H2(yVar, new l(boundariesUpdate));
                        if (((com.revolut.feature.shops.impl.ui.map_view.b) ((j2) yVar.f22677a).getValue()).i == null) {
                            eVar.I2();
                        }
                    }
                }
                break;
            case 1:
                yv0.k kVar = (yv0.k) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                yv0.i iVar = kVar instanceof yv0.i ? (yv0.i) kVar : null;
                Object obj4 = iVar != null ? iVar.f317077l : null;
                final ShopsOutlet outlet = obj4 instanceof ShopsOutlet ? (ShopsOutlet) obj4 : null;
                if (outlet != null) {
                    com.revolut.feature.shops.impl.ui.map_view.e eVar2 = (com.revolut.feature.shops.impl.ui.map_view.e) shopsMapViewScreen.d();
                    eVar2.getClass();
                    Intrinsics.checkNotNullParameter(outlet, "outlet");
                    final int i5 = 0;
                    eVar2.H2(eVar2.u, new Function1() { // from class: kjd.m
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj5) {
                            switch (i5) {
                                case 0:
                                    com.revolut.feature.shops.impl.ui.map_view.b update = (com.revolut.feature.shops.impl.ui.map_view.b) obj5;
                                    Intrinsics.checkNotNullParameter(update, "$this$update");
                                    return com.revolut.feature.shops.impl.ui.map_view.b.a(update, null, false, null, BitmapDescriptorFactory.HUE_RED, null, null, a.b.f87223a, null, outlet, 703);
                                default:
                                    com.revolut.feature.shops.impl.ui.map_view.b update2 = (com.revolut.feature.shops.impl.ui.map_view.b) obj5;
                                    Intrinsics.checkNotNullParameter(update2, "$this$update");
                                    return com.revolut.feature.shops.impl.ui.map_view.b.a(update2, null, false, null, BitmapDescriptorFactory.HUE_RED, null, null, null, null, outlet, 767);
                            }
                        }
                    });
                }
                break;
            case 2:
                cr0.h viewState = (cr0.h) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                j jVarD2 = shopsMapViewScreen.d();
                Intrinsics.h(viewState);
                com.revolut.feature.shops.impl.ui.map_view.e eVar3 = (com.revolut.feature.shops.impl.ui.map_view.e) jVarD2;
                y yVar2 = eVar3.u;
                Intrinsics.checkNotNullParameter(viewState, "viewState");
                int i6 = p.f184398a[viewState.ordinal()];
                a.b bVar = a.b.f87223a;
                Object obj5 = i6 != 1 ? i6 != 2 ? i6 != 3 ? i6 != 4 ? null : a.c.f87224a : a.C0547a.f87222a : bVar : a.d.f87225a;
                if (obj5 != null) {
                    eVar3.H2(yVar2, new k79.b(obj5, obj5.equals(bVar) ? ((com.revolut.feature.shops.impl.ui.map_view.b) ((j2) yVar2.f22677a).getValue()).i : null, 19));
                }
                break;
            case 3:
                koi.j jVar = (koi.j) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                qs qsVar = jVar instanceof qs ? (qs) jVar : null;
                Object obj6 = qsVar != null ? qsVar.i : null;
                zn.a aVar5 = obj6 instanceof zn.a ? (zn.a) obj6 : null;
                Object obj7 = aVar5 != null ? aVar5.f323632b : null;
                ShopsOutlet shopsOutlet2 = obj7 instanceof ShopsOutlet ? (ShopsOutlet) obj7 : null;
                if (shopsOutlet2 != null) {
                    j jVarD3 = shopsMapViewScreen.d();
                    String outletId = shopsOutlet2.f87056a;
                    com.revolut.feature.shops.impl.ui.map_view.e eVar4 = (com.revolut.feature.shops.impl.ui.map_view.e) jVarD3;
                    eVar4.getClass();
                    Intrinsics.checkNotNullParameter(outletId, "outletId");
                    y yVar3 = eVar4.u;
                    mid.o oVar = (mid.o) ((com.revolut.feature.shops.impl.ui.map_view.b) ((j2) yVar3.f22677a).getValue()).f87230h.getContent();
                    if (oVar != null) {
                        Iterator it8 = oVar.f205737b.iterator();
                        while (true) {
                            if (it8.hasNext()) {
                                Object next = it8.next();
                                if (Intrinsics.f(((ShopsOutlet) next).f87056a, outletId)) {
                                    obj3 = next;
                                }
                            }
                        }
                        shopsOutlet = (ShopsOutlet) obj3;
                    }
                    if (shopsOutlet != null) {
                        eVar4.H2(yVar3, new Function1() { // from class: kjd.m
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj52) {
                                switch (i2) {
                                    case 0:
                                        com.revolut.feature.shops.impl.ui.map_view.b update = (com.revolut.feature.shops.impl.ui.map_view.b) obj52;
                                        Intrinsics.checkNotNullParameter(update, "$this$update");
                                        return com.revolut.feature.shops.impl.ui.map_view.b.a(update, null, false, null, BitmapDescriptorFactory.HUE_RED, null, null, a.b.f87223a, null, shopsOutlet, 703);
                                    default:
                                        com.revolut.feature.shops.impl.ui.map_view.b update2 = (com.revolut.feature.shops.impl.ui.map_view.b) obj52;
                                        Intrinsics.checkNotNullParameter(update2, "$this$update");
                                        return com.revolut.feature.shops.impl.ui.map_view.b.a(update2, null, false, null, BitmapDescriptorFactory.HUE_RED, null, null, null, null, shopsOutlet, 767);
                                }
                            }
                        });
                    }
                }
                break;
            case 4:
                qs qsVar2 = (qs) this.v;
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                j jVarD4 = shopsMapViewScreen.d();
                Object obj8 = qsVar2.i;
                com.revolut.feature.shops.impl.ui.map_view.e eVar5 = (com.revolut.feature.shops.impl.ui.map_view.e) jVarD4;
                mid.o oVar2 = (mid.o) ((com.revolut.feature.shops.impl.ui.map_view.b) ((j2) eVar5.u.f22677a).getValue()).f87230h.getContent();
                if (oVar2 != null) {
                    LinkedHashMap linkedHashMap = oVar2.f205738c;
                    zn.a aVar7 = obj8 instanceof zn.a ? (zn.a) obj8 : null;
                    if (aVar7 != null) {
                        eVar5.f87236r.Z2(aVar7);
                        Object obj9 = aVar7.f323632b;
                        ShopsOutlet shopsOutlet3 = obj9 instanceof ShopsOutlet ? (ShopsOutlet) obj9 : null;
                        if (shopsOutlet3 != null && (shopsCampaignOffer = (ShopsCampaignOffer) linkedHashMap.get(shopsOutlet3.f87057b)) != null) {
                            String id10 = shopsCampaignOffer.f87023a;
                            String str = shopsCampaignOffer.f87024b;
                            String str2 = shopsCampaignOffer.f87025c;
                            String brandId = shopsCampaignOffer.d;
                            String name = shopsCampaignOffer.e;
                            String logoUrl = shopsCampaignOffer.f;
                            Boolean bool = shopsCampaignOffer.f87026g;
                            ekc.a aVar8 = shopsCampaignOffer.f87027h;
                            String str3 = shopsCampaignOffer.i;
                            String str4 = shopsCampaignOffer.f87028j;
                            BigDecimal bigDecimal = shopsCampaignOffer.k;
                            ShopsOutlet shopsOutlet4 = shopsOutlet3;
                            Double d = shopsCampaignOffer.f87029l;
                            ShopsEarningRate shopsEarningRate = shopsCampaignOffer.f87030m;
                            EarningBadge earningBadge = shopsCampaignOffer.f87031n;
                            boolean z = shopsCampaignOffer.o;
                            boolean z3 = shopsCampaignOffer.f87032p;
                            boolean z4 = shopsCampaignOffer.f87033q;
                            ShopsCategory shopsCategory = shopsCampaignOffer.f87034r;
                            String str5 = shopsCampaignOffer.f87035s;
                            String str6 = shopsCampaignOffer.f87036t;
                            String source = shopsCampaignOffer.u;
                            List list = shopsCampaignOffer.v;
                            List list2 = shopsCampaignOffer.f87037w;
                            String str7 = shopsCampaignOffer.f87039y;
                            Integer num = shopsCampaignOffer.z;
                            ShopsInstalmentOption shopsInstalmentOption = shopsCampaignOffer.A;
                            Intrinsics.checkNotNullParameter(id10, "id");
                            Intrinsics.checkNotNullParameter(brandId, "brandId");
                            Intrinsics.checkNotNullParameter(name, "name");
                            Intrinsics.checkNotNullParameter(logoUrl, "logoUrl");
                            Intrinsics.checkNotNullParameter(source, "source");
                            eVar5.C2(new h(new ShopsCampaignOffer(id10, str, str2, brandId, name, logoUrl, bool, aVar8, str3, str4, bigDecimal, d, shopsEarningRate, earningBadge, z, z3, z4, shopsCategory, str5, str6, source, list, list2, shopsOutlet4, str7, num, shopsInstalmentOption)));
                        }
                    }
                }
                break;
            default:
                zn.f viewableRecordSnapshot = (zn.f) this.v;
                fim.a aVar9 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.shops.impl.ui.map_view.e eVar6 = (com.revolut.feature.shops.impl.ui.map_view.e) shopsMapViewScreen.d();
                eVar6.getClass();
                Intrinsics.checkNotNullParameter(viewableRecordSnapshot, "viewableRecordSnapshot");
                eVar6.f87236r.b3(viewableRecordSnapshot);
                break;
        }
        return Unit.f186387a;
    }
}
