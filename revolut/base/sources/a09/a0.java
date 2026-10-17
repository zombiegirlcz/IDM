package a09;

import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.RowsWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.g3;
import com.revolut.core.ui_kit.delegates.widgets.i3;
import com.revolut.core.ui_kit.delegates.widgets.m3;
import com.revolut.core.ui_kit.delegates.widgets.q0;
import com.revolut.core.ui_kit.views.MapView;
import com.revolut.feature.apm.core.models.alias.Alias;
import com.revolut.feature.apm.payid.api.navigation.PayIdVerifyOwnerShipDestination;
import com.revolut.feature.home_feed.api.models.HomeFeedWidgetContext;
import com.revolut.feature.home_feed.api.widget.VaultWidgetContext;
import com.revolut.feature.invest_feed.api.models.InvestWidgetContext;
import com.revolut.feature.learn.shared.models.domain.LearnReward;
import com.revolut.feature.mainscreen.api.navigation.MainScreenFeatureConfig;
import com.revolut.feature.mainscreen.core.api.ui.screen.MainContainerInnerConfiguration;
import com.revolut.feature.retail.cobranded_cards.api.widgets.CobrandsWidgetContext;
import com.revolut.feature.rev_points.api.navigation.RevPointsFlowDestination;
import com.revolut.feature.rev_points.api.widget.rim.RevPointsRimWidgetContext;
import com.revolut.feature.rev_points.giftcards.api.widgets.RevPointsGiftcardsWidgetContext;
import com.revolut.feature.shops.impl.ui.map_view.ShopsMapViewScreen;
import com.revolut.feature.wealth.api.widget.WealthWidgetContext;
import com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.kompot.common.ParcelableDestination;
import com.revolut.retail.core.navigation.ActivityAnimation;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.feature.airport.security_fast_track.api.widgets.AsftWidgetContext;
import com.revolut.retail.feature.airportlounges.api.widgets.AirportLoungesWidgetContext;
import com.revolut.retail.feature.api.rewards_hub.widget.RewardsHubWidgetContext;
import com.revolut.retail.feature.esim.api.widgets.EsimWidgetContext;
import fag.t0;
import java.lang.reflect.Type;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import kotlin.reflect.KTypeProjection;
import le.u1;
import m1c.l0;
import tof.a3;
import tof.i7;
import xzg.n0;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class a0 implements kfm.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f242a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f243b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f244c;
    public final /* synthetic */ Object d;

    public /* synthetic */ a0(Object obj2, int i, Object obj3, Object obj4) {
        this.f242a = i;
        this.f243b = obj2;
        this.f244c = obj3;
        this.d = obj4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r5v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r5v10 */
    @Override // kfm.a
    public final void run() {
        String strQ;
        int i = this.f242a;
        int i2 = 2;
        Object obj2 = this.d;
        Object obj3 = this.f244c;
        Object obj4 = this.f243b;
        switch (i) {
            case 0:
                u09.q qVar = (u09.q) obj4;
                u09.y progress = (u09.y) obj3;
                String id10 = qVar.f276145a;
                String title = qVar.f276146b;
                String courseId = qVar.f276147c;
                String thumbnail = qVar.d;
                List contentCards = qVar.e;
                u09.d0 d0Var = qVar.f;
                LearnReward reward = qVar.f276148g;
                String str = qVar.i;
                kotlin.jvm.internal.s content = qVar.f276150j;
                u09.i0 rewardStatus = qVar.k;
                int i3 = qVar.f276151l;
                int i5 = qVar.f276152m;
                List list = qVar.f276153n;
                Intrinsics.checkNotNullParameter(id10, "id");
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(courseId, "courseId");
                Intrinsics.checkNotNullParameter(thumbnail, "thumbnail");
                Intrinsics.checkNotNullParameter(contentCards, "contentCards");
                Intrinsics.checkNotNullParameter(reward, "reward");
                Intrinsics.checkNotNullParameter(progress, "progress");
                Intrinsics.checkNotNullParameter(content, "content");
                Intrinsics.checkNotNullParameter(rewardStatus, "rewardStatus");
                ((e0) obj2).f.j(id10, new u09.q(id10, title, courseId, thumbnail, contentCards, d0Var, reward, progress, str, content, rewardStatus, i3, i5, list));
                return;
            case 1:
                List list2 = (List) obj2;
                w4l.f fVar = ((a31.x) obj4).i;
                Intrinsics.h(list2);
                fVar.j((hbd.a) obj3, list2);
                return;
            case 2:
                ((bd7.d) obj4).f14540j.a(new dsh.o((HomeFeedWidgetContext.Personal) obj2, ((q0) ((BaseDraggableWidgetDelegate.a) obj3)).f55476b));
                return;
            case 3:
                ((cdh.m) obj4).f23263c.a(new dsh.o((WealthWidgetContext) obj2, ((q0) ((BaseDraggableWidgetDelegate.a) obj3)).f55476b));
                return;
            case 4:
                ((coj.g) obj4).f25565a.a(new dsh.o((EsimWidgetContext) obj2, (String) obj3));
                return;
            case 5:
                ((d8b.g) obj4).f112196a.a(new dsh.o((CobrandsWidgetContext) obj2, ((q0) obj3).f55476b));
                return;
            case 6:
                ((dxb.d) obj4).f120934a.a(new dsh.o((RevPointsGiftcardsWidgetContext) obj2, ((q0) ((BaseDraggableWidgetDelegate.a) obj3)).f55476b));
                return;
            case 7:
                n0 filter = (n0) obj2;
                o8h.g gVar = ((e8h.i0) obj4).f123695b;
                String key = u1.g((xzg.j0) obj3, e8h.j0.f123700a);
                Intrinsics.checkNotNullParameter(key, "key");
                Intrinsics.checkNotNullParameter(filter, "filter");
                gVar.f223031a.G(filter, "TopMoversKEY_FILTER".concat(key), wim.z.d(o0.b(n0.class)));
                return;
            case 8:
                ea1.b.a(((String) obj4) + " is completed (" + (System.currentTimeMillis() - ((kotlin.jvm.internal.n0) obj3).f186428a) + "ms)", (fa1.k) obj2);
                return;
            case 9:
                ((ed7.k) obj4).e.a(new dsh.o((HomeFeedWidgetContext.Personal) obj2, ((q0) ((BaseDraggableWidgetDelegate.a) obj3)).f55476b));
                return;
            case 10:
                er9.e eVar = (er9.e) obj3;
                String str2 = (String) obj2;
                for (oq9.v vVar : (List) obj4) {
                    ue0.c cVar = eVar.f128564a;
                    String strQ2 = j6.a.q("STORAGE_KEY_REMINDERS", str2);
                    Type remindersType = eVar.e;
                    Intrinsics.checkNotNullExpressionValue(remindersType, "remindersType");
                    eVar.f128564a.G(zhm.d0.F0(br9.j.a(vVar), (List) cVar.v0(zhm.f0.f322471a, strQ2, remindersType)), j6.a.q("STORAGE_KEY_REMINDERS", str2), kii.e.o(fr9.a.class, KTypeProjection.INSTANCE, List.class));
                }
                return;
            case 11:
                ((ezi.d) obj4).f130944a.a(new dsh.o((AirportLoungesWidgetContext) obj2, ((q0) obj3).f55476b));
                return;
            case 12:
                ((f28.a0) obj4).f131448b.a(new dsh.o((InvestWidgetContext) obj2, ((q0) ((BaseDraggableWidgetDelegate.a) obj3)).f55476b));
                return;
            case 13:
                t0 t0Var = (t0) obj4;
                t0Var.e(dgi.c.a(t0Var.a(), null, (LocalDate) obj3, (LocalDate) obj2, null, null, null, null, false, null, null, null, null, null, 4194297));
                return;
            case 14:
                fv5.d dVar = (fv5.d) obj4;
                i7 i7Var = (i7) obj2;
                pu5.e eVar2 = dVar.f138351p;
                Intrinsics.h(i7Var);
                yji.n.P2(dVar, dVar.o2(eVar2.a((a3) obj3, i7Var, "")), ModalDestination.Style.FullscreenPaged.f98310a, null, 2);
                return;
            case 15:
                ((gd0.f) obj4).f143029c.k((nd0.d) obj3, (ArrayList) obj2);
                return;
            case 16:
                hz5.a aVar = (hz5.a) obj4;
                aVar.f157033a.G((ArrayList) obj2, (String) obj3, kii.e.o(String.class, KTypeProjection.INSTANCE, List.class));
                aVar.f157034b.onNext(Unit.f186387a);
                return;
            case 17:
                ((i28.n) obj4).f157899b.a(new dsh.o((InvestWidgetContext) obj2, ((q0) ((BaseDraggableWidgetDelegate.a) obj3)).f55476b));
                return;
            case 18:
                com.revolut.feature_exchange.impl.ui.exchange_v2.market_order.a aVar2 = (com.revolut.feature_exchange.impl.ui.exchange_v2.market_order.a) obj4;
                ((rpi.b) aVar2.f96952r).N(false);
                ((opi.b) aVar2.f96948m).Z(((l2i.a) aVar2.f96956x).a((dj0.d) obj3, null, (dj0.d) obj2));
                return;
            case 19:
                ((j7e.f) obj4).f171913b.a(new dsh.o((VaultWidgetContext) obj2, ((q0) ((BaseDraggableWidgetDelegate.a) obj3)).f55476b));
                return;
            case 20:
                ((jc7.e) obj4).d.a(new dsh.o((HomeFeedWidgetContext.Personal) obj2, ((q0) ((BaseDraggableWidgetDelegate.a) obj3)).f55476b));
                return;
            case 21:
                ((jkb.d) obj4).f175146b.a(new dsh.o((HomeFeedWidgetContext.Savings) obj2, ((q0) ((BaseDraggableWidgetDelegate.a) obj3)).f55476b));
                return;
            case 22:
                jv9.b bVar = (jv9.b) obj3;
                dv9.m mVar = (dv9.m) obj2;
                iv9.a aVar3 = (iv9.a) zhm.d0.o0((List) obj4);
                lValueOf = aVar3 != null ? Long.valueOf(aVar3.f168781h) : 0;
                if (lValueOf != 0) {
                    ue0.c cVar2 = bVar.f178792c;
                    boolean z = mVar instanceof dv9.k;
                    Class cls = Long.TYPE;
                    if (z) {
                        strQ = j6.a.q("GROUP_CHAT_LATEST_UPDATED_TIME_", ((dv9.k) mVar).f118076a);
                    } else {
                        if (!(mVar instanceof dv9.l) && mVar != null) {
                            throw new NoWhenBranchMatchedException();
                        }
                        strQ = "MESSAGES_LATEST_UPDATED_TIME";
                    }
                    com.google.android.gms.internal.mlkit_vision_face.a.B(cls, cVar2, strQ, lValueOf);
                    return;
                }
                return;
            case 23:
                BaseDraggableWidgetDelegate.a aVar4 = (BaseDraggableWidgetDelegate.a) obj4;
                k1c.d dVar2 = (k1c.d) obj3;
                ash.d dVar3 = dVar2.e;
                RevPointsRimWidgetContext revPointsRimWidgetContext = (RevPointsRimWidgetContext) obj2;
                if (aVar4 instanceof q0) {
                    dVar2.d.a(new dsh.o(revPointsRimWidgetContext, ((q0) aVar4).f55476b));
                    return;
                }
                if (aVar4 instanceof g3) {
                    dVar3.a(new RevPointsFlowDestination(new RevPointsFlowDestination.StartType.OpenChallengesGrid(null)));
                    return;
                }
                if (aVar4 instanceof com.revolut.core.ui_kit.delegates.widgets.i) {
                    if (((com.revolut.core.ui_kit.delegates.widgets.i) aVar4).f55375c instanceof RowsWidgetDelegate.Model) {
                        dVar3.a(new RevPointsFlowDestination(new RevPointsFlowDestination.StartType.OpenChallengesGrid(null)));
                        return;
                    }
                    return;
                }
                if (aVar4 instanceof i3) {
                    Object obj5 = ((i3) aVar4).f55382c.u;
                    l0 l0Var = obj5 instanceof l0 ? (l0) obj5 : null;
                    if (l0Var == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    dVar2.f(l0Var.f201384a);
                    return;
                }
                if (aVar4 instanceof m3) {
                    Object obj6 = ((m3) aVar4).f55431c.u;
                    l0 l0Var2 = obj6 instanceof l0 ? (l0) obj6 : null;
                    if (l0Var2 == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    if (l0Var2.a()) {
                        String str3 = l0Var2.i;
                        if (str3 != null) {
                            dVar2.d(new jsl.t0(dVar2, str3, lValueOf, 20), new cs.a(i2));
                            return;
                        }
                        return;
                    }
                    if (l0Var2.f201394q) {
                        dVar2.f(l0Var2.f201384a);
                        return;
                    } else {
                        if (l0Var2.f201393p) {
                            dVar2.d(new jsl.t0(dVar2, l0Var2, lValueOf, 19), new k0d.c(dVar2, 4));
                            return;
                        }
                        return;
                    }
                }
                return;
            case 24:
                ((k7e.h) obj4).f182052b.a(new dsh.o((VaultWidgetContext) obj2, ((q0) ((BaseDraggableWidgetDelegate.a) obj3)).f55476b));
                return;
            case 25:
                ShopsMapViewScreen shopsMapViewScreen = (ShopsMapViewScreen) obj4;
                co3.a location = (co3.a) obj3;
                KProperty[] kPropertyArr = ShopsMapViewScreen.X;
                Intrinsics.checkNotNullParameter(location, "location");
                shopsMapViewScreen.d3().f305862g.g0(new ah0.a(location.f25486a, location.f25487b), 12.0f, false);
                ((com.revolut.feature.shops.impl.ui.map_view.e) shopsMapViewScreen.e3()).J2(false);
                ((MapView) obj2).setLocationVisible(true);
                return;
            case 26:
                ((kuj.f) obj4).f189839a.a(new dsh.o((RewardsHubWidgetContext) obj2, ((q0) ((BaseDraggableWidgetDelegate.a) obj3)).f55476b));
                return;
            case 27:
                ((kvi.e) obj4).f190134a.a(new dsh.o((AsftWidgetContext) obj2, ((q0) obj3).f55476b));
                return;
            case 28:
                ((kz1.i) obj2).f191052a.c(new FeatureCommand(new MainScreenFeatureConfig.WithInnerConfiguration(s49.a.SINGLE_TOP, new MainContainerInnerConfiguration(u49.a.f277275a, null, new FeatureCommand(new KompotBridgeFeatureConfig((ActivityAnimation) null, (ParcelableDestination) new PayIdVerifyOwnerShipDestination((Alias) obj3, (String) obj4), false, (Integer) null, 0, 61)), 2))));
                return;
            default:
                ((l7e.h) obj4).f192572b.a(new dsh.o((HomeFeedWidgetContext.PersonalPocket) obj2, ((q0) ((BaseDraggableWidgetDelegate.a) obj3)).f55476b));
                return;
        }
    }
}
