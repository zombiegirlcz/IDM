package com.revolut.feature.rev_points.giftcards.impl.ui.flow.home;

import ali.g;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.rev_points.giftcards.api.R$string;
import com.revolut.feature.rev_points.giftcards.impl.R$id;
import com.revolut.feature.rev_points.giftcards.impl.R$layout;
import com.revolut.feature.rev_points.giftcards.impl.ui.flow.home.RevPointsGiftcardsHomePagerFlow;
import com.revolut.feature.rev_points.giftcards.impl.ui.flow.home.RevPointsGiftcardsHomePagerFlowContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.kompot.navigable.vc.pager.PagerItem;
import kji.f;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import no.d1;
import pwb.l;
import te0.w;
import vc.s;
import xki.e;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\u00020\u00062\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/feature/rev_points/giftcards/impl/ui/flow/home/RevPointsGiftcardsHomePagerFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lcom/revolut/feature/rev_points/giftcards/impl/ui/flow/home/a;", "Lali/g;", "Lpwb/l;", "Lcom/revolut/feature/rev_points/giftcards/impl/ui/flow/home/RevPointsGiftcardsHomePagerFlowContract$PagerItem;", "Lno/d1;", "Lkji/f;", "feature_rev_points_giftcards_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class RevPointsGiftcardsHomePagerFlow extends ViewController<a> implements g, d1, f {
    public static final /* synthetic */ KProperty[] Q = {o0.f186429a.j(new h0(RevPointsGiftcardsHomePagerFlow.class, "binding", "getBinding()Lcom/revolut/feature/rev_points/giftcards/impl/databinding/FlowRevPointsGiftcardsHomePagerFlowBinding;", 0))};
    public final RevPointsGiftcardsHomePagerFlowContract$InputData K;
    public final h L;
    public final int M;
    public final Object N;
    public final Object O;
    public final Object P;

    public RevPointsGiftcardsHomePagerFlow(RevPointsGiftcardsHomePagerFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = s.t(this, pwb.b.f);
        this.M = R$layout.flow_rev_points_giftcards_home_pager_flow;
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: pwb.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RevPointsGiftcardsHomePagerFlow f240376b;

            {
                this.f240376b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                RevPointsGiftcardsHomePagerFlow revPointsGiftcardsHomePagerFlow = this.f240376b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = RevPointsGiftcardsHomePagerFlow.Q;
                        return (e) ((iwb.h) revPointsGiftcardsHomePagerFlow.P.getValue()).d.get();
                    case 1:
                        KProperty[] kPropertyArr2 = RevPointsGiftcardsHomePagerFlow.Q;
                        return mif.a.a(revPointsGiftcardsHomePagerFlow, 0, R$id.revPointsGiftcardsHomePagerFlow_pager, revPointsGiftcardsHomePagerFlow.R2(), 5);
                    default:
                        KProperty[] kPropertyArr3 = RevPointsGiftcardsHomePagerFlow.Q;
                        phm.a aVar = (phm.a) ue0.e.j(revPointsGiftcardsHomePagerFlow.m2()).a().get(iwb.e.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", iwb.e.class, " is not found"));
                        }
                        iwb.e eVar = ((iwb.e) aVar2.b()).f169026r;
                        RevPointsGiftcardsHomePagerFlowContract$InputData revPointsGiftcardsHomePagerFlowContract$InputData = revPointsGiftcardsHomePagerFlow.K;
                        revPointsGiftcardsHomePagerFlowContract$InputData.getClass();
                        return new iwb.h(eVar, revPointsGiftcardsHomePagerFlowContract$InputData);
                }
            }
        });
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: pwb.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RevPointsGiftcardsHomePagerFlow f240376b;

            {
                this.f240376b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                RevPointsGiftcardsHomePagerFlow revPointsGiftcardsHomePagerFlow = this.f240376b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = RevPointsGiftcardsHomePagerFlow.Q;
                        return (e) ((iwb.h) revPointsGiftcardsHomePagerFlow.P.getValue()).d.get();
                    case 1:
                        KProperty[] kPropertyArr2 = RevPointsGiftcardsHomePagerFlow.Q;
                        return mif.a.a(revPointsGiftcardsHomePagerFlow, 0, R$id.revPointsGiftcardsHomePagerFlow_pager, revPointsGiftcardsHomePagerFlow.R2(), 5);
                    default:
                        KProperty[] kPropertyArr3 = RevPointsGiftcardsHomePagerFlow.Q;
                        phm.a aVar = (phm.a) ue0.e.j(revPointsGiftcardsHomePagerFlow.m2()).a().get(iwb.e.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", iwb.e.class, " is not found"));
                        }
                        iwb.e eVar = ((iwb.e) aVar2.b()).f169026r;
                        RevPointsGiftcardsHomePagerFlowContract$InputData revPointsGiftcardsHomePagerFlowContract$InputData = revPointsGiftcardsHomePagerFlow.K;
                        revPointsGiftcardsHomePagerFlowContract$InputData.getClass();
                        return new iwb.h(eVar, revPointsGiftcardsHomePagerFlowContract$InputData);
                }
            }
        });
        final int i3 = 2;
        this.P = w.y0(new Function0(this) { // from class: pwb.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RevPointsGiftcardsHomePagerFlow f240376b;

            {
                this.f240376b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                RevPointsGiftcardsHomePagerFlow revPointsGiftcardsHomePagerFlow = this.f240376b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = RevPointsGiftcardsHomePagerFlow.Q;
                        return (e) ((iwb.h) revPointsGiftcardsHomePagerFlow.P.getValue()).d.get();
                    case 1:
                        KProperty[] kPropertyArr2 = RevPointsGiftcardsHomePagerFlow.Q;
                        return mif.a.a(revPointsGiftcardsHomePagerFlow, 0, R$id.revPointsGiftcardsHomePagerFlow_pager, revPointsGiftcardsHomePagerFlow.R2(), 5);
                    default:
                        KProperty[] kPropertyArr3 = RevPointsGiftcardsHomePagerFlow.Q;
                        phm.a aVar = (phm.a) ue0.e.j(revPointsGiftcardsHomePagerFlow.m2()).a().get(iwb.e.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", iwb.e.class, " is not found"));
                        }
                        iwb.e eVar = ((iwb.e) aVar2.b()).f169026r;
                        RevPointsGiftcardsHomePagerFlowContract$InputData revPointsGiftcardsHomePagerFlowContract$InputData = revPointsGiftcardsHomePagerFlow.K;
                        revPointsGiftcardsHomePagerFlowContract$InputData.getClass();
                        return new iwb.h(eVar, revPointsGiftcardsHomePagerFlowContract$InputData);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        l uiState = (l) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        d3().f138590b.setItems(uiState.f240386b.f240384a);
        d3().f138590b.b(uiState.f240387c);
        d3().f138591c.setMenuItems(uiState.f240385a.f240383a);
    }

    @Override // ali.g
    public final void Q1(PagerItem pagerItem) {
        RevPointsGiftcardsHomePagerFlowContract$PagerItem pagerItem2 = (RevPointsGiftcardsHomePagerFlowContract$PagerItem) pagerItem;
        Intrinsics.checkNotNullParameter(pagerItem2, "pagerItem");
        c cVar = (c) R2();
        cVar.getClass();
        Intrinsics.checkNotNullParameter(pagerItem2, "pagerItem");
        cVar.H2(cVar.f83683s, new pth.l(pagerItem2, 12));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (iwb.h) this.P.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final qji.b R1() {
        return (iwb.h) this.P.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f138591c;
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.gift_cards_home_title, null, null, 14), null);
        navBarWithToolbar.setToolbarTitle(new TextLocalisedClause(R$string.gift_cards_home_title, null, null, 14));
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        navBarWithToolbar.setSearchButtonActive(true);
        navBarWithToolbar.f59417v0 = false;
        navBarWithToolbar.setHint(new TextLocalisedClause(R$string.gift_cards_home_search_placeholder, null, null, 14));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f138591c;
        ViewController.P2(this, rd0.e.b(navBarWithToolbar.f59410q), new pwb.c(this, null, 0), 3);
        ViewController.P2(this, rd0.e.b(navBarWithToolbar.o.f57403b), new pwb.d(this, null, 0), 3);
        ViewController.P2(this, rd0.e.b(navBarWithToolbar.v0()), new pwb.c(this, null, 1), 3);
        ViewController.P2(this, rd0.e.b(d3().f138590b.f58581q), new pwb.d(this, null, 1), 3);
    }

    public final fwb.a d3() {
        ViewBinding value = this.L.getValue(this, Q[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (fwb.a) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final pwb.e d() {
        return (pwb.e) this.N.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.M;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (ali.c) this.O.getValue();
    }
}
