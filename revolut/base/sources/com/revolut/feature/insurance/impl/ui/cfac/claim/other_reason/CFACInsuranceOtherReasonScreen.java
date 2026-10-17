package com.revolut.feature.insurance.impl.ui.cfac.claim.other_reason;

import aj0.o;
import ak7.c;
import ak7.e;
import ak7.f;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.insurance.impl.R$string;
import com.revolut.feature.insurance.impl.ui.cfac.claim.other_reason.CFACInsuranceOtherReasonScreen;
import com.revolut.kompot.common.IOData$EmptyInput;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen;
import java.util.List;
import jii.u;
import jki.m;
import jki.n;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.q;
import kotlin.reflect.KProperty;
import nk7.t;
import sji.b;
import te0.w;
import vc.s;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/insurance/impl/ui/cfac/claim/other_reason/CFACInsuranceOtherReasonScreen;", "Lcom/revolut/kompot/navigable/screen/BaseRecyclerViewScreen;", "Lak7/f;", "Lcom/revolut/kompot/common/IOData$EmptyInput;", "Lak7/e;", "<init>", "()V", "feature_insurance_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CFACInsuranceOtherReasonScreen extends BaseRecyclerViewScreen<f, IOData$EmptyInput, e> {

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f75090b0 = {o0.f186429a.j(new h0(CFACInsuranceOtherReasonScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};
    public final int U;
    public final boolean V;
    public final h W;
    public final Object X;
    public final Object Y;
    public final Object Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final Object f75091a0;

    public static final /* synthetic */ class a extends q implements Function1 {
        public static final a f = new a();

        public a() {
            super(1, u.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj2) {
            View p0 = (View) obj2;
            Intrinsics.checkNotNullParameter(p0, "p0");
            return u.a(p0);
        }
    }

    public CFACInsuranceOtherReasonScreen() {
        super(IOData$EmptyInput.f98299a);
        this.U = R$layout.screen_recycler_navbar_nextbutton;
        this.V = true;
        this.W = s.t(this, a.f);
        final int i = 0;
        this.X = w.y0(new Function0(this) { // from class: ak7.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CFACInsuranceOtherReasonScreen f5726b;

            {
                this.f5726b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                CFACInsuranceOtherReasonScreen cFACInsuranceOtherReasonScreen = this.f5726b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = CFACInsuranceOtherReasonScreen.f75090b0;
                        qji.b bVarQ2 = cFACInsuranceOtherReasonScreen.Q2();
                        Intrinsics.i(bVarQ2, "null cannot be cast to non-null type com.revolut.feature.insurance.impl.ui.cfac.claim.other_reason.di.CFACInsuranceOtherReasonScreenInjector");
                        t tVar = new t();
                        int i3 = 4;
                        tVar.f216726a = e4m.b.b(new nk7.e(tVar, 1, i3));
                        tVar.f216727b = e4m.b.b(new nk7.e(tVar, 0, i3));
                        return tVar;
                    case 1:
                        KProperty[] kPropertyArr2 = CFACInsuranceOtherReasonScreen.f75090b0;
                        return (h) ((t) cFACInsuranceOtherReasonScreen.X.getValue()).f216727b.get();
                    default:
                        KProperty[] kPropertyArr3 = CFACInsuranceOtherReasonScreen.f75090b0;
                        return zhm.u.c((InputTextDelegate) cFACInsuranceOtherReasonScreen.Z.getValue());
                }
            }
        });
        final int i2 = 1;
        this.Y = w.y0(new Function0(this) { // from class: ak7.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CFACInsuranceOtherReasonScreen f5726b;

            {
                this.f5726b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                CFACInsuranceOtherReasonScreen cFACInsuranceOtherReasonScreen = this.f5726b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CFACInsuranceOtherReasonScreen.f75090b0;
                        qji.b bVarQ2 = cFACInsuranceOtherReasonScreen.Q2();
                        Intrinsics.i(bVarQ2, "null cannot be cast to non-null type com.revolut.feature.insurance.impl.ui.cfac.claim.other_reason.di.CFACInsuranceOtherReasonScreenInjector");
                        t tVar = new t();
                        int i3 = 4;
                        tVar.f216726a = e4m.b.b(new nk7.e(tVar, 1, i3));
                        tVar.f216727b = e4m.b.b(new nk7.e(tVar, 0, i3));
                        return tVar;
                    case 1:
                        KProperty[] kPropertyArr2 = CFACInsuranceOtherReasonScreen.f75090b0;
                        return (h) ((t) cFACInsuranceOtherReasonScreen.X.getValue()).f216727b.get();
                    default:
                        KProperty[] kPropertyArr3 = CFACInsuranceOtherReasonScreen.f75090b0;
                        return zhm.u.c((InputTextDelegate) cFACInsuranceOtherReasonScreen.Z.getValue());
                }
            }
        });
        this.Z = w.y0(new o(13));
        final int i3 = 2;
        this.f75091a0 = w.y0(new Function0(this) { // from class: ak7.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CFACInsuranceOtherReasonScreen f5726b;

            {
                this.f5726b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                CFACInsuranceOtherReasonScreen cFACInsuranceOtherReasonScreen = this.f5726b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CFACInsuranceOtherReasonScreen.f75090b0;
                        qji.b bVarQ2 = cFACInsuranceOtherReasonScreen.Q2();
                        Intrinsics.i(bVarQ2, "null cannot be cast to non-null type com.revolut.feature.insurance.impl.ui.cfac.claim.other_reason.di.CFACInsuranceOtherReasonScreenInjector");
                        t tVar = new t();
                        int i32 = 4;
                        tVar.f216726a = e4m.b.b(new nk7.e(tVar, 1, i32));
                        tVar.f216727b = e4m.b.b(new nk7.e(tVar, 0, i32));
                        return tVar;
                    case 1:
                        KProperty[] kPropertyArr2 = CFACInsuranceOtherReasonScreen.f75090b0;
                        return (h) ((t) cFACInsuranceOtherReasonScreen.X.getValue()).f216727b.get();
                    default:
                        KProperty[] kPropertyArr3 = CFACInsuranceOtherReasonScreen.f75090b0;
                        return zhm.u.c((InputTextDelegate) cFACInsuranceOtherReasonScreen.Z.getValue());
                }
            }
        });
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    /* JADX INFO: renamed from: O2 */
    public final void Z2(m mVar, jki.o oVar) {
        f uiState = (f) mVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        super.Z2(uiState, oVar);
        g3().f174564b.setEnabled(uiState.f5730b);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final b S2() {
        return (t) this.X.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final jki.h T2() {
        return (ak7.h) this.Y.getValue();
    }

    /* JADX WARN: Type inference failed for: r5v10, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.V2(view);
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(g3().f174565c.f59410q), null, new ak7.b(this, continuation, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(g3().f174565c.o.f57403b), null, new ak7.b(this, continuation, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((InputTextDelegate) this.Z.getValue()).e.f121375b), null, new c(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(g3().f174564b.o), null, new ak7.b(this, continuation, 2), 3);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void W2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.W2(view);
        NavBarWithToolbar navBarWithToolbar = g3().f174565c;
        navBarWithToolbar.setToolbarTitle(new TextLocalisedClause(R$string.cfac_claim_custom_cancellation_reason_title, null, null, 14));
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.cfac_claim_custom_cancellation_reason_title, null, null, 14), null);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        navBarWithToolbar.setMenuItems(ik7.f.b());
        g3().f174564b.setText(new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_continue, null, null, 14));
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    public final void Z2(n nVar, jki.o oVar) {
        f uiState = (f) nVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        super.Z2(uiState, oVar);
        g3().f174564b.setEnabled(uiState.f5730b);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: c3 */
    public final List getF74047a0() {
        return (List) this.f75091a0.getValue();
    }

    public final u g3() {
        ViewBinding value = this.W.getValue(this, f75090b0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (u) value;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getQ() {
        return this.U;
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.V);
    }
}
