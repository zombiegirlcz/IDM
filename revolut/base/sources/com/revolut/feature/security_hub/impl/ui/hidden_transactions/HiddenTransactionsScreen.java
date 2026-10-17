package com.revolut.feature.security_hub.impl.ui.hidden_transactions;

import aii.q;
import android.view.View;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.viewbinding.ViewBinding;
import ao.h;
import au0.j4;
import cli.o;
import com.google.crypto.tink.shaded.protobuf.t1;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.core.ui_kit.delegates.SwipeToActionDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.security_hub.api.R$string;
import com.revolut.feature.security_hub.impl.ui.hidden_transactions.HiddenTransactionsScreen;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import ix0.m1;
import jii.u;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import nuc.c;
import nuc.d;
import nuc.f;
import nuc.l;
import nuc.m;
import org.jetbrains.annotations.NotNull;
import te0.w;
import vc.s;
import vtc.g;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003:\u0001\bB\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/revolut/feature/security_hub/impl/ui/hidden_transactions/HiddenTransactionsScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Lnuc/m;", "<init>", "()V", "Companion", "a", "feature_security_hub_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class HiddenTransactionsScreen extends ViewController<q> implements dli.a {
    public final h K = s.t(this, b.f);
    public final RowDelegate L;
    public final FullScreenStateDelegate M;
    public final SelectableDelegate N;
    public final SwipeToActionDelegate O;
    public final Object P;
    public final int Q;
    public final boolean R;
    public final Object S;
    public final Object T;
    public final Object U;
    public static final /* synthetic */ KProperty[] V = {o0.f186429a.j(new h0(HiddenTransactionsScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: com.revolut.feature.security_hub.impl.ui.hidden_transactions.HiddenTransactionsScreen$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    public static final /* synthetic */ class b extends kotlin.jvm.internal.q implements Function1 {
        public static final b f = new b();

        public b() {
            super(1, u.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj2) {
            View p0 = (View) obj2;
            Intrinsics.checkNotNullParameter(p0, "p0");
            return u.a(p0);
        }
    }

    public HiddenTransactionsScreen() {
        RowDelegate rowDelegate = new RowDelegate(null, null, 7);
        this.L = rowDelegate;
        this.M = new FullScreenStateDelegate();
        this.N = new SelectableDelegate(rowDelegate);
        this.O = new SwipeToActionDelegate(rowDelegate, false);
        this.P = w.y0(new ns1.a(18));
        this.Q = R$layout.screen_recycler_navbar_nextbutton;
        this.R = true;
        final int i = 0;
        this.S = w.y0(new Function0(this) { // from class: nuc.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ HiddenTransactionsScreen f219281b;

            {
                this.f219281b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                HiddenTransactionsScreen hiddenTransactionsScreen = this.f219281b;
                switch (i2) {
                    case 0:
                        HiddenTransactionsScreen.Companion companion = HiddenTransactionsScreen.INSTANCE;
                        qji.b bVarU2 = hiddenTransactionsScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.security_hub.impl.ui.hidden_transactions.di.HiddenTransactionsScreenInjector");
                        vtc.u uVar = (vtc.u) bVarU2;
                        return new vtc.g(uVar.f292082b, uVar.f292083c);
                    case 1:
                        HiddenTransactionsScreen.Companion companion2 = HiddenTransactionsScreen.INSTANCE;
                        return (l) ((vtc.g) hiddenTransactionsScreen.S.getValue()).f291978b.get();
                    default:
                        HiddenTransactionsScreen.Companion companion3 = HiddenTransactionsScreen.INSTANCE;
                        HiddenTransactionsScreen hiddenTransactionsScreen2 = this.f219281b;
                        return dli.f.a(hiddenTransactionsScreen2, hiddenTransactionsScreen2.R2(), v.k(hiddenTransactionsScreen2.M, hiddenTransactionsScreen2.N, hiddenTransactionsScreen2.O, new ListSubheaderDelegate(), new RowLoadingDelegate(), hiddenTransactionsScreen2.L), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.T = w.y0(new Function0(this) { // from class: nuc.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ HiddenTransactionsScreen f219281b;

            {
                this.f219281b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                HiddenTransactionsScreen hiddenTransactionsScreen = this.f219281b;
                switch (i22) {
                    case 0:
                        HiddenTransactionsScreen.Companion companion = HiddenTransactionsScreen.INSTANCE;
                        qji.b bVarU2 = hiddenTransactionsScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.security_hub.impl.ui.hidden_transactions.di.HiddenTransactionsScreenInjector");
                        vtc.u uVar = (vtc.u) bVarU2;
                        return new vtc.g(uVar.f292082b, uVar.f292083c);
                    case 1:
                        HiddenTransactionsScreen.Companion companion2 = HiddenTransactionsScreen.INSTANCE;
                        return (l) ((vtc.g) hiddenTransactionsScreen.S.getValue()).f291978b.get();
                    default:
                        HiddenTransactionsScreen.Companion companion3 = HiddenTransactionsScreen.INSTANCE;
                        HiddenTransactionsScreen hiddenTransactionsScreen2 = this.f219281b;
                        return dli.f.a(hiddenTransactionsScreen2, hiddenTransactionsScreen2.R2(), v.k(hiddenTransactionsScreen2.M, hiddenTransactionsScreen2.N, hiddenTransactionsScreen2.O, new ListSubheaderDelegate(), new RowLoadingDelegate(), hiddenTransactionsScreen2.L), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        final int i3 = 2;
        this.U = w.y0(new Function0(this) { // from class: nuc.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ HiddenTransactionsScreen f219281b;

            {
                this.f219281b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                HiddenTransactionsScreen hiddenTransactionsScreen = this.f219281b;
                switch (i22) {
                    case 0:
                        HiddenTransactionsScreen.Companion companion = HiddenTransactionsScreen.INSTANCE;
                        qji.b bVarU2 = hiddenTransactionsScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.security_hub.impl.ui.hidden_transactions.di.HiddenTransactionsScreenInjector");
                        vtc.u uVar = (vtc.u) bVarU2;
                        return new vtc.g(uVar.f292082b, uVar.f292083c);
                    case 1:
                        HiddenTransactionsScreen.Companion companion2 = HiddenTransactionsScreen.INSTANCE;
                        return (l) ((vtc.g) hiddenTransactionsScreen.S.getValue()).f291978b.get();
                    default:
                        HiddenTransactionsScreen.Companion companion3 = HiddenTransactionsScreen.INSTANCE;
                        HiddenTransactionsScreen hiddenTransactionsScreen2 = this.f219281b;
                        return dli.f.a(hiddenTransactionsScreen2, hiddenTransactionsScreen2.R2(), v.k(hiddenTransactionsScreen2.M, hiddenTransactionsScreen2.N, hiddenTransactionsScreen2.O, new ListSubheaderDelegate(), new RowLoadingDelegate(), hiddenTransactionsScreen2.L), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        m uiState = (m) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        boolean z = uiState.f219292h;
        if (qVar instanceof m.a.C1219a) {
            d3().f174565c.i0();
            d3().f174565c.m0(j4.FADE);
            d3().f174565c.setSearchButtonActive(false);
            ScreenContentRecyclerView recyclerView = d3().d;
            Intrinsics.checkNotNullExpressionValue(recyclerView, "recyclerView");
            m1.a(recyclerView);
        }
        if (!z) {
            d3().f174565c.i0();
            d3().f174565c.m0(j4.FADE);
        }
        d3().f174565c.setSearchButtonActive(z);
        d3().f174565c.setMenuItems(uiState.f219291g);
        if (!uiState.d) {
            d3().f174564b.setVisibility(8);
            d3().f174565c.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        } else {
            d3().f174564b.setVisibility(0);
            d3().f174564b.setText(uiState.e);
            d3().f174564b.setEnabled(uiState.f);
            d3().f174565c.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_cross));
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (g) this.S.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174565c;
        navBarWithToolbar.setToolbarTitle(new TextLocalisedClause(R$string.security_hub_home_hidden_transactions_title, null, null, 14));
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.security_hub_home_hidden_transactions_title, null, null, 14), null);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        d3().f174564b.setVisibility(8);
        d3().d.setItemAnimator((DefaultItemAnimator) this.P.getValue());
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        ViewController.P2(this, rd0.e.b(d3().f174565c.f59410q), new nuc.b(this, continuation, 0), 3);
        ViewController.P2(this, vkm.q.q(t1.g(rd0.e.b(d3().f174565c.f59409p.f57337m), 300L)), new c(this, continuation, 0), 3);
        int i = 1;
        ViewController.P2(this, rd0.e.b(d3().f174565c.o.f57403b), new c(this, continuation, i), 3);
        ViewController.P2(this, rd0.e.b(this.M.f52371h.f121375b), new d(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.N.r()), new nuc.e(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.L.f53218h), new f(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.O.f), new nuc.g(this, null), 3);
        ViewController.P2(this, rd0.e.b(d3().f174564b.o), new nuc.b(this, continuation, i), 3);
    }

    public final u d3() {
        ViewBinding value = this.K.getValue(this, V[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (u) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final l R2() {
        return (l) this.T.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getM() {
        return this.Q;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.U.getValue();
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.R);
    }
}
