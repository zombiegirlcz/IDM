package su0;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.recyclerview.widget.RecyclerView;
import au0.x1;
import aw0.x8;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.error.data.model.ServerError;
import com.revolut.core.ui_kit.internal.views.swipeablecards.SwipeableCardViewPager;
import com.revolut.core.ui_kit.internal.views.swipeablecards.container.SwipeableCardContainerView;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.MarketingPhotoHeaderContentView;
import com.revolut.core.ui_kit.views.navbar.NavBarWithBigTile;
import com.revolut.feature.invest.smart_notifications.api.domain.models.FeedFilter;
import com.revolut.feature.junior_settings.impl.ui_kompot.qr_code_scanner.JuniorAuthQrScannerFlowContract$Step;
import com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.PaymentMethod;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.retail.common.ui.R$string;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.core.navigation.NaviCommand;
import com.revolut.retail.feature.pricing_plans.ui.api.navigation.PricingPlanFeatureConfig;
import com.revolut.revolut.feature_fourthline_impl.R;
import d67.s;
import d67.u;
import gld.e0;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.q;
import my3.g;
import nii.l0;
import nii.y0;
import nii.z;
import rd0.d;
import sri.m;
import sw2.e;
import sw2.h;
import sx2.r;
import t04.o;
import tcg.a0;
import te0.v;
import th9.t;
import tjf.p0;
import tof.a3;
import tx0.u2;
import vkm.j2;
import wx.f;
import yji.l;
import zhm.h0;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class c extends q implements Function1 {
    public final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(int i, Object obj2, Class cls, String str, String str2, int i2, int i3) {
        super(i, i2, cls, obj2, str, str2);
        this.f = i3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v18, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        int i = 12;
        boolean z = true;
        char c2 = 1;
        int i2 = 6;
        int i3 = 0;
        int i5 = 5;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        Object[] objArr5 = 0;
        Object[] objArr6 = 0;
        Object[] objArr7 = 0;
        switch (this.f) {
            case 0:
                RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition = ((SwipeableCardViewPager) this.receiver).f57606b.findViewHolderForAdapterPosition(((Number) obj2).intValue());
                View view = viewHolderFindViewHolderForAdapterPosition != null ? viewHolderFindViewHolderForAdapterPosition.itemView : null;
                if (view instanceof SwipeableCardContainerView) {
                    return (SwipeableCardContainerView) view;
                }
                return null;
            case 1:
                RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition2 = ((SwipeableCardViewPager) this.receiver).f57606b.findViewHolderForAdapterPosition(((Number) obj2).intValue());
                View view2 = viewHolderFindViewHolderForAdapterPosition2 != null ? viewHolderFindViewHolderForAdapterPosition2.itemView : null;
                if (view2 instanceof SwipeableCardContainerView) {
                    return (SwipeableCardContainerView) view2;
                }
                return null;
            case 2:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "p0");
                h hVar = (h) this.receiver;
                hVar.getClass();
                l.a1(hVar, hVar.X1(new y0(null, new z(new TextLocalisedClause(R$string.general_error_common, null, null, 14), null, null, null, null, null, false, null, null, null, null, null, null, 32766), false, 5)), null, null, new e(hVar, objArr == true ? 1 : 0, i3), 3);
                return Boolean.TRUE;
            case 3:
                Throwable p0 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(p0, "p0");
                com.revolut.feature.rev_points.giftcards.impl.ui.screen.downloadcards.a aVar = (com.revolut.feature.rev_points.giftcards.impl.ui.screen.downloadcards.a) this.receiver;
                aVar.getClass();
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = d.f253311a;
                d.a(rd0.c.ERROR, null, null, p0, h0Var);
                aVar.X1(new y0(null, new z(new TextLocalisedClause(R.string.error_generic, null, null, 14), null, null, null, null, null, true, null, null, null, null, null, null, 32510), false, 5));
                return Boolean.TRUE;
            case 4:
                u p03 = (u) obj2;
                Intrinsics.checkNotNullParameter(p03, "p0");
                swi.c cVar = (swi.c) this.receiver;
                cVar.getClass();
                if (Intrinsics.f(p03, s.f111464a)) {
                    xfa.b bVar = xfa.b.AIRPORT_LOUNGES;
                    hha.u.Companion.getClass();
                    hha.u uVar = hha.u.f152364x;
                    cVar.C1(new BridgeDestination(new FeatureCommand(new PricingPlanFeatureConfig.DashboardByAnyFeature(uVar, zhm.u.c(uVar), bVar))));
                } else {
                    cVar.B2();
                }
                return Unit.f186387a;
            case 5:
                String str = (String) obj2;
                ((o) this.receiver).getClass();
                return str != null ? g.valueOf(str) : ht3.h.f155276a;
            case 6:
                gfd.d p010 = (gfd.d) obj2;
                Intrinsics.checkNotNullParameter(p010, "p0");
                com.revolut.feature.invest.smart_notifications.impl.ui.screen.all_insights.b bVar2 = (com.revolut.feature.invest.smart_notifications.impl.ui.screen.all_insights.b) this.receiver;
                bVar2.getClass();
                if (!p010.f143391a.isEmpty()) {
                    FeedFilter feedFilter = bVar2.o.f76427a;
                    Object byAssetFilter = feedFilter instanceof FeedFilter.ByRef ? (FeedFilter.ByRef) feedFilter : null;
                    if (byAssetFilter == null) {
                        byAssetFilter = new FeedFilter.ByAssetFilter(((t18.q) ((j2) bVar2.v.f22677a).getValue()).f267223a);
                    }
                    bVar2.n2(new r(bVar2, byAssetFilter, objArr2 == true ? 1 : 0, i5), new whi.b(i2));
                }
                return Unit.f186387a;
            case 7:
                return t3f.o.b((t3f.o) this.receiver, (Continuation) obj2);
            case 8:
                return t3f.o.a((t3f.o) this.receiver, (Continuation) obj2);
            case 9:
                NaviCommand p011 = (NaviCommand) obj2;
                Intrinsics.checkNotNullParameter(p011, "p0");
                ((m) this.receiver).c(p011);
                return Unit.f186387a;
            case 10:
                Throwable p012 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(p012, "p0");
                t50.u.I2((t50.u) this.receiver, p012);
                return Boolean.TRUE;
            case 11:
                Throwable p013 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(p013, "p0");
                t50.u.I2((t50.u) this.receiver, p013);
                return Boolean.TRUE;
            case 12:
                Throwable p014 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(p014, "p0");
                com.revolut.feature.card_screen.impl.kompot.cards_carousel.screen.g gVar = (com.revolut.feature.card_screen.impl.kompot.cards_carousel.screen.g) this.receiver;
                ServerError serverErrorA = gVar.f65430a0.a(p014);
                if (serverErrorA == null || serverErrorA.f51362a != 1217) {
                    z = false;
                } else {
                    gVar.X1(new y0(null, new l0(new TextLocalisedClause(com.revolut.feature.cards_core.R$string.card_terminate_mcy_error_title, null, null, 14), ((Boolean) gVar.i0.getValue()).booleanValue() ? new TextLocalisedClause(com.revolut.feature.cards_core.R$string.card_terminate_mcy_error_description_extended, null, null, 14) : new TextLocalisedClause(com.revolut.feature.cards_core.R$string.card_terminate_mcy_error_description, null, null, 14), null, null, null, null, false, null, 1020), false, 5));
                }
                return Boolean.valueOf(z);
            case 13:
                s7e.d p015 = (s7e.d) obj2;
                Intrinsics.checkNotNullParameter(p015, "p0");
                com.revolut.feature.subaccount.impl.ui.create.flow.main.c cVar2 = (com.revolut.feature.subaccount.impl.ui.create.flow.main.c) this.receiver;
                cVar2.getClass();
                if (!(p015 instanceof s7e.c)) {
                    throw new NoWhenBranchMatchedException();
                }
                cVar2.L2(((s7e.c) p015).f260678a);
                return Unit.f186387a;
            case 14:
                Throwable p016 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(p016, "p0");
                q7e.b.d((l) this.receiver, p016);
                return Boolean.TRUE;
            case 15:
                NaviCommand p017 = (NaviCommand) obj2;
                Intrinsics.checkNotNullParameter(p017, "p0");
                return ((ln.a) this.receiver).a(p017);
            case 16:
                NaviCommand p018 = (NaviCommand) obj2;
                Intrinsics.checkNotNullParameter(p018, "p0");
                return ((ln.a) this.receiver).a(p018);
            case 17:
                gdc.b p019 = (gdc.b) obj2;
                Intrinsics.checkNotNullParameter(p019, "p0");
                tdc.r rVar = (tdc.r) this.receiver;
                rVar.getClass();
                PaymentMethod.Card paymentMethod = p019.f143126a;
                Intrinsics.checkNotNullParameter(paymentMethod, "paymentMethod");
                rVar.X2(rVar.f269966p, new t8e.c(rVar, paymentMethod, i));
                return Unit.f186387a;
            case 18:
                w6c.e p020 = (w6c.e) obj2;
                Intrinsics.checkNotNullParameter(p020, "p0");
                tdc.r rVar2 = (tdc.r) this.receiver;
                rVar2.getClass();
                vki.a aVar2 = rVar2.f269966p;
                if (p020 instanceof w6c.b) {
                    rVar2.X2(aVar2, new a0(10));
                } else if (p020 instanceof w6c.c) {
                    PaymentMethod paymentMethod2 = ((w6c.c) p020).f295413a;
                    Intrinsics.checkNotNullParameter(paymentMethod2, "paymentMethod");
                    rVar2.X2(aVar2, new t8e.c(rVar2, paymentMethod2, i));
                } else if (p020 instanceof w6c.a) {
                    int i6 = jli.h.f175850a;
                } else {
                    if (!(p020 instanceof w6c.d)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    rVar2.f269967q.k(tdc.o.f269962a);
                }
                return Unit.f186387a;
            case 19:
                wx.g p021 = (wx.g) obj2;
                Intrinsics.checkNotNullParameter(p021, "p0");
                com.revolut.feature.junior_settings.impl.ui_kompot.qr_code_scanner.b bVar3 = (com.revolut.feature.junior_settings.impl.ui_kompot.qr_code_scanner.b) this.receiver;
                bVar3.getClass();
                if (Intrinsics.f(p021, wx.c.f300703a)) {
                    bVar3.B2();
                } else if (p021 instanceof f) {
                    String str2 = ((f) p021).f300706a.f51390a;
                    if (str2 == null) {
                        throw new IllegalArgumentException("Scanned QR-code is null");
                    }
                    bVar3.n2(new tgk.f(bVar3, str2, objArr4 == true ? 1 : 0, 23), new to8.c(bVar3, c2 == true ? 1 : 0));
                } else if (Intrinsics.f(p021, wx.d.f300704a)) {
                    oki.h.w2(bVar3.f77322r, JuniorAuthQrScannerFlowContract$Step.EnterQrDataDialog.f77313a, ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                } else {
                    if (!Intrinsics.f(p021, wx.e.f300705a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    bVar3.n2(new p0(bVar3, objArr3 == true ? 1 : 0, i2), new whi.b(i2));
                }
                return Unit.f186387a;
            case 20:
                Throwable p022 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(p022, "p0");
                com.revolut.feature.tax_residency.impl.v2.ui.fatca_flow.a aVar3 = (com.revolut.feature.tax_residency.impl.v2.ui.fatca_flow.a) this.receiver;
                lpe.d dVar = aVar3.f90260r;
                h0 h0Var2 = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList2 = d.f253311a;
                d.a(rd0.c.ERROR, null, null, p022, h0Var2);
                ipe.d dVarW = aVar3.f90261s.W(p022);
                if (dVarW instanceof ipe.f) {
                    ipe.f fVar = (ipe.f) dVarW;
                    wi0.b bVar4 = fVar.f167744a;
                    ipe.e eVar = fVar.f167745b;
                    AnalyticsProduct analyticsProduct = aVar3.o.f90254g;
                    dVar.getClass();
                    l.a1(aVar3, aVar3.X1(lpe.d.c(bVar4, eVar, analyticsProduct)), null, null, new e0(i5, objArr7 == true ? 1 : 0, new tpe.h(aVar3, 2)), 3);
                } else {
                    l.a1(aVar3, aVar3.X1(dVar.b(p022, false)), null, null, new e0(i5, objArr6 == true ? 1 : 0, objArr5 == true ? 1 : 0), 3);
                }
                return Boolean.TRUE;
            case 21:
                Throwable p023 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(p023, "p0");
                pu7.a.o((l) this.receiver, p023);
                return Boolean.TRUE;
            case 22:
                a3 p024 = (a3) obj2;
                Intrinsics.checkNotNullParameter(p024, "p0");
                ((v) this.receiver).set(p024);
                return Unit.f186387a;
            case 23:
                twl.d p025 = (twl.d) obj2;
                Intrinsics.checkNotNullParameter(p025, "p0");
                ((v) this.receiver).set(p025);
                return Unit.f186387a;
            case 24:
                ty0.a p026 = (ty0.a) obj2;
                Intrinsics.checkNotNullParameter(p026, "p0");
                ((ihm.f) this.receiver).onNext(p026);
                return Unit.f186387a;
            case 25:
                x8 p027 = (x8) obj2;
                Intrinsics.checkNotNullParameter(p027, "p0");
                MarketingPhotoHeaderContentView marketingPhotoHeaderContentView = (MarketingPhotoHeaderContentView) this.receiver;
                marketingPhotoHeaderContentView.k = p027;
                u2 u2Var = marketingPhotoHeaderContentView.f59261x;
                if (u2Var != null) {
                    u2Var.a(p027.f10609a, p027.f10610b, p027.f10611c, p027.e);
                }
                return Unit.f186387a;
            case 26:
                ty0.a p028 = (ty0.a) obj2;
                Intrinsics.checkNotNullParameter(p028, "p0");
                ((ihm.f) this.receiver).onNext(p028);
                return Unit.f186387a;
            case 27:
                ty0.a p029 = (ty0.a) obj2;
                Intrinsics.checkNotNullParameter(p029, "p0");
                ((ihm.f) this.receiver).onNext(p029);
                return Unit.f186387a;
            case 28:
                x1 source = (x1) obj2;
                Intrinsics.checkNotNullParameter(source, "p0");
                NavBarWithBigTile navBarWithBigTile = (NavBarWithBigTile) this.receiver;
                int i21 = NavBarWithBigTile.f0;
                navBarWithBigTile.getClass();
                Intrinsics.checkNotNullParameter(source, "source");
                navBarWithBigTile.k.f(source);
                t onRemoved = new t(source, 27);
                Object obj3 = or0.u.f228038a;
                Intrinsics.checkNotNullParameter(navBarWithBigTile, "<this>");
                Intrinsics.checkNotNullParameter(onRemoved, "onRemoved");
                ViewParent parent = navBarWithBigTile.getParent();
                ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                if (viewGroup != null) {
                    viewGroup.setOnHierarchyChangeListener(new or0.s(navBarWithBigTile, onRemoved, viewGroup));
                }
                return Unit.f186387a;
            default:
                Unit p030 = (Unit) obj2;
                Intrinsics.checkNotNullParameter(p030, "p0");
                ((ihm.f) this.receiver).onNext(p030);
                return Unit.f186387a;
        }
    }
}
