package com.revolut.feature.trading.transfer.investments.impl.ui.transfer_in_create.screens.broker_selection;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.trading.transfer.investments.impl.R$string;
import com.revolut.feature.trading.transfer.investments.impl.ui.transfer_in_create.screens.broker_selection.BrokerSelectionScreen;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import dze.n;
import ea4.d;
import eaf.b;
import eaf.c;
import eaf.g;
import eaf.j;
import eaf.k;
import eaf.l;
import jii.m;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import l9f.v;
import te0.w;
import tx0.j0;
import vc.s;
import xki.e;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/trading/transfer/investments/impl/ui/transfer_in_create/screens/broker_selection/BrokerSelectionScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Leaf/j;", "Ldli/a;", "Leaf/l;", "feature_trading_transfer_investments_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class BrokerSelectionScreen extends ViewController<j> implements a {
    public static final /* synthetic */ KProperty[] S = {o0.f186429a.j(new h0(BrokerSelectionScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final g K;
    public final h L;
    public final RowDelegate M;
    public final FullScreenStateDelegate N;
    public final int O;
    public final Object P;
    public final Object Q;
    public final Object R;

    public BrokerSelectionScreen(g inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = s.t(this, b.f);
        this.M = new RowDelegate(null, null, 7);
        this.N = new FullScreenStateDelegate();
        this.O = R$layout.screen_recycler_navbar;
        final int i = 0;
        this.P = w.y0(new Function0(this) { // from class: eaf.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BrokerSelectionScreen f124226b;

            {
                this.f124226b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                BrokerSelectionScreen brokerSelectionScreen = this.f124226b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = BrokerSelectionScreen.S;
                        qji.b bVarU2 = brokerSelectionScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.trading.transfer.investments.impl.ui.transfer_in_create.screens.broker_selection.di.BrokerSelectionScreenInjector");
                        v vVar = (v) ((faf.a) bVarU2).b().mo3808a(brokerSelectionScreen);
                        g gVar = brokerSelectionScreen.K;
                        switch (vVar.f193228a) {
                            case 0:
                                gVar.getClass();
                                vVar.d = gVar;
                                break;
                            default:
                                gVar.getClass();
                                vVar.d = gVar;
                                break;
                        }
                        return (l9f.w) vVar.mo3783build();
                    case 1:
                        KProperty[] kPropertyArr2 = BrokerSelectionScreen.S;
                        l9f.w wVar = (l9f.w) brokerSelectionScreen.P.getValue();
                        switch (wVar.f193231a) {
                            case 0:
                                return (k) wVar.d.get();
                            default:
                                return (k) wVar.d.get();
                        }
                    default:
                        KProperty[] kPropertyArr3 = BrokerSelectionScreen.S;
                        BrokerSelectionScreen brokerSelectionScreen2 = this.f124226b;
                        return dli.f.a(brokerSelectionScreen2, (k) brokerSelectionScreen2.Q.getValue(), zhm.v.k(new RowLoadingDelegate(), brokerSelectionScreen2.M, brokerSelectionScreen2.N), 0, null, null, null, 60);
                }
            }
        });
        final int i2 = 1;
        this.Q = w.y0(new Function0(this) { // from class: eaf.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BrokerSelectionScreen f124226b;

            {
                this.f124226b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                BrokerSelectionScreen brokerSelectionScreen = this.f124226b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = BrokerSelectionScreen.S;
                        qji.b bVarU2 = brokerSelectionScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.trading.transfer.investments.impl.ui.transfer_in_create.screens.broker_selection.di.BrokerSelectionScreenInjector");
                        v vVar = (v) ((faf.a) bVarU2).b().mo3808a(brokerSelectionScreen);
                        g gVar = brokerSelectionScreen.K;
                        switch (vVar.f193228a) {
                            case 0:
                                gVar.getClass();
                                vVar.d = gVar;
                                break;
                            default:
                                gVar.getClass();
                                vVar.d = gVar;
                                break;
                        }
                        return (l9f.w) vVar.mo3783build();
                    case 1:
                        KProperty[] kPropertyArr2 = BrokerSelectionScreen.S;
                        l9f.w wVar = (l9f.w) brokerSelectionScreen.P.getValue();
                        switch (wVar.f193231a) {
                            case 0:
                                return (k) wVar.d.get();
                            default:
                                return (k) wVar.d.get();
                        }
                    default:
                        KProperty[] kPropertyArr3 = BrokerSelectionScreen.S;
                        BrokerSelectionScreen brokerSelectionScreen2 = this.f124226b;
                        return dli.f.a(brokerSelectionScreen2, (k) brokerSelectionScreen2.Q.getValue(), zhm.v.k(new RowLoadingDelegate(), brokerSelectionScreen2.M, brokerSelectionScreen2.N), 0, null, null, null, 60);
                }
            }
        });
        final int i3 = 2;
        this.R = w.y0(new Function0(this) { // from class: eaf.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BrokerSelectionScreen f124226b;

            {
                this.f124226b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                BrokerSelectionScreen brokerSelectionScreen = this.f124226b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = BrokerSelectionScreen.S;
                        qji.b bVarU2 = brokerSelectionScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.trading.transfer.investments.impl.ui.transfer_in_create.screens.broker_selection.di.BrokerSelectionScreenInjector");
                        v vVar = (v) ((faf.a) bVarU2).b().mo3808a(brokerSelectionScreen);
                        g gVar = brokerSelectionScreen.K;
                        switch (vVar.f193228a) {
                            case 0:
                                gVar.getClass();
                                vVar.d = gVar;
                                break;
                            default:
                                gVar.getClass();
                                vVar.d = gVar;
                                break;
                        }
                        return (l9f.w) vVar.mo3783build();
                    case 1:
                        KProperty[] kPropertyArr2 = BrokerSelectionScreen.S;
                        l9f.w wVar = (l9f.w) brokerSelectionScreen.P.getValue();
                        switch (wVar.f193231a) {
                            case 0:
                                return (k) wVar.d.get();
                            default:
                                return (k) wVar.d.get();
                        }
                    default:
                        KProperty[] kPropertyArr3 = BrokerSelectionScreen.S;
                        BrokerSelectionScreen brokerSelectionScreen2 = this.f124226b;
                        return dli.f.a(brokerSelectionScreen2, (k) brokerSelectionScreen2.Q.getValue(), zhm.v.k(new RowLoadingDelegate(), brokerSelectionScreen2.M, brokerSelectionScreen2.N), 0, null, null, null, 60);
                }
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // cli.w
    public final void B(o oVar, q qVar) {
        l uiState = (l) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        NavBarWithToolbar navBarWithToolbar = d3().f174539b;
        eaf.h hVar = uiState.f124239b;
        ?? r06 = hVar.f124235a;
        navBarWithToolbar.setTitle(r06, null);
        navBarWithToolbar.setToolbarTitle(r06);
        Clause clause = hVar.f124236b;
        navBarWithToolbar.setSecondDescriptionText(clause);
        navBarWithToolbar.setSecondDescriptionVisible(clause != null);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (l9f.w) this.P.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (k) this.Q.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174539b;
        Intrinsics.checkNotNullExpressionValue(navBarWithToolbar, "navBarWithToolbar");
        navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE_LARGE);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        navBarWithToolbar.setSearchButtonActive(true);
        navBarWithToolbar.setHint(new TextLocalisedClause(R$string.trading_stocks_transfer_in_broker_search, null, null, 14));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174539b;
        ViewController.P2(this, rd0.e.b(navBarWithToolbar.f59410q), new n(this, null, 25), 3);
        ViewController.P2(this, vkm.q.q(rd0.e.b(navBarWithToolbar.f59409p.f57337m)), new d(this, null, 3), 3);
        ViewController.P2(this, rd0.e.b(this.M.f53218h), new c(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.N.f52371h.f121375b), new eaf.d(this, null), 3);
    }

    public final m d3() {
        ViewBinding value = this.L.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (m) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.O;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.R.getValue();
    }
}
