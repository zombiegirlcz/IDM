package com.revolut.feature.support.impl.transfer_tracker.ui.input_form;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.delegates.AmountEditDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.InputChecklistDelegate;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.support.impl.R$string;
import com.revolut.feature.support.impl.transfer_tracker.ui.input_form.TransferTrackerInputFormScreen;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import hba.k;
import hee.d;
import hee.f;
import hee.g;
import hee.n;
import hee.p;
import jii.u;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.q;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import rde.i;
import te0.w;
import tki.c;
import tx0.j0;
import vc.s;
import wp5.y;
import xki.e;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003:\u0001\bB\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/revolut/feature/support/impl/transfer_tracker/ui/input_form/TransferTrackerInputFormScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lhee/n;", "Ltki/c;", "Lhee/p;", "<init>", "()V", "Companion", "a", "feature_support_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TransferTrackerInputFormScreen extends ViewController<n> implements c {
    public final Object N;
    public final Object O;
    public final Object S;
    public static final /* synthetic */ KProperty[] U = {o0.f186429a.j(new h0(TransferTrackerInputFormScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();
    public final int K = R$layout.screen_recycler_navbar_nextbutton;
    public final boolean L = true;
    public final h M = s.t(this, b.f);
    public final AmountEditDelegate P = new AmountEditDelegate(null);
    public final InputTextDelegate Q = new InputTextDelegate(null);
    public final InputChecklistDelegate R = new InputChecklistDelegate();
    public final LargeActionButtonDelegate T = new LargeActionButtonDelegate();

    /* JADX INFO: renamed from: com.revolut.feature.support.impl.transfer_tracker.ui.input_form.TransferTrackerInputFormScreen$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    public static final /* synthetic */ class b extends q implements Function1 {
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

    public TransferTrackerInputFormScreen() {
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: hee.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransferTrackerInputFormScreen f151688b;

            {
                this.f151688b = this;
            }

            /* JADX WARN: Type inference failed for: r1v17, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                TransferTrackerInputFormScreen transferTrackerInputFormScreen = this.f151688b;
                int i3 = 4;
                int i5 = 3;
                int i6 = 2;
                int i21 = 1;
                int i22 = 0;
                int i32 = 5;
                switch (i2) {
                    case 0:
                        TransferTrackerInputFormScreen.Companion companion = TransferTrackerInputFormScreen.INSTANCE;
                        phm.a aVar = (phm.a) ue0.e.j(transferTrackerInputFormScreen.m2()).a().get(tce.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", tce.a.class, " is not found"));
                        }
                        rde.h hVar = ((rde.h) aVar2.b()).k;
                        rde.i iVar = new rde.i();
                        iVar.f253444a = e4m.b.b(e4m.c.a(transferTrackerInputFormScreen));
                        int i33 = 6;
                        iVar.f253445b = e4m.b.b(new r7d.o(hVar, iVar, i6, i33));
                        iVar.f253446c = e4m.b.b(new r7d.o(hVar, iVar, i21, i33));
                        iVar.d = e4m.b.b(new r7d.o(hVar, iVar, i22, i33));
                        iVar.e = e4m.b.b(new r7d.o(hVar, iVar, i3, i33));
                        iVar.f = e4m.b.b(new r7d.o(hVar, iVar, i5, i33));
                        iVar.f253447g = e4m.b.b(new r7d.o(hVar, iVar, 7, i33));
                        iVar.f253448h = e4m.b.b(new r7d.o(hVar, iVar, i33, i33));
                        iVar.i = e4m.b.b(new r7d.o(hVar, iVar, 8, i33));
                        iVar.f253449j = e4m.b.b(new r7d.o(hVar, iVar, 9, i33));
                        iVar.k = e4m.b.b(new r7d.o(hVar, iVar, i32, i33));
                        return iVar;
                    case 1:
                        TransferTrackerInputFormScreen.Companion companion2 = TransferTrackerInputFormScreen.INSTANCE;
                        return (o) ((rde.i) transferTrackerInputFormScreen.N.getValue()).k.get();
                    default:
                        TransferTrackerInputFormScreen.Companion companion3 = TransferTrackerInputFormScreen.INSTANCE;
                        TransferTrackerInputFormScreen transferTrackerInputFormScreen2 = this.f151688b;
                        return tki.g.a(transferTrackerInputFormScreen2, transferTrackerInputFormScreen2.R2(), zhm.v.k(transferTrackerInputFormScreen2.P, transferTrackerInputFormScreen2.Q, transferTrackerInputFormScreen2.R, new RowLoadingDelegate(), new FullScreenStateDelegate()), 0, null, null, null, 60);
                }
            }
        });
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: hee.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransferTrackerInputFormScreen f151688b;

            {
                this.f151688b = this;
            }

            /* JADX WARN: Type inference failed for: r1v17, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                TransferTrackerInputFormScreen transferTrackerInputFormScreen = this.f151688b;
                int i3 = 4;
                int i5 = 3;
                int i6 = 2;
                int i21 = 1;
                int i222 = 0;
                int i32 = 5;
                switch (i22) {
                    case 0:
                        TransferTrackerInputFormScreen.Companion companion = TransferTrackerInputFormScreen.INSTANCE;
                        phm.a aVar = (phm.a) ue0.e.j(transferTrackerInputFormScreen.m2()).a().get(tce.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", tce.a.class, " is not found"));
                        }
                        rde.h hVar = ((rde.h) aVar2.b()).k;
                        rde.i iVar = new rde.i();
                        iVar.f253444a = e4m.b.b(e4m.c.a(transferTrackerInputFormScreen));
                        int i33 = 6;
                        iVar.f253445b = e4m.b.b(new r7d.o(hVar, iVar, i6, i33));
                        iVar.f253446c = e4m.b.b(new r7d.o(hVar, iVar, i21, i33));
                        iVar.d = e4m.b.b(new r7d.o(hVar, iVar, i222, i33));
                        iVar.e = e4m.b.b(new r7d.o(hVar, iVar, i3, i33));
                        iVar.f = e4m.b.b(new r7d.o(hVar, iVar, i5, i33));
                        iVar.f253447g = e4m.b.b(new r7d.o(hVar, iVar, 7, i33));
                        iVar.f253448h = e4m.b.b(new r7d.o(hVar, iVar, i33, i33));
                        iVar.i = e4m.b.b(new r7d.o(hVar, iVar, 8, i33));
                        iVar.f253449j = e4m.b.b(new r7d.o(hVar, iVar, 9, i33));
                        iVar.k = e4m.b.b(new r7d.o(hVar, iVar, i32, i33));
                        return iVar;
                    case 1:
                        TransferTrackerInputFormScreen.Companion companion2 = TransferTrackerInputFormScreen.INSTANCE;
                        return (o) ((rde.i) transferTrackerInputFormScreen.N.getValue()).k.get();
                    default:
                        TransferTrackerInputFormScreen.Companion companion3 = TransferTrackerInputFormScreen.INSTANCE;
                        TransferTrackerInputFormScreen transferTrackerInputFormScreen2 = this.f151688b;
                        return tki.g.a(transferTrackerInputFormScreen2, transferTrackerInputFormScreen2.R2(), zhm.v.k(transferTrackerInputFormScreen2.P, transferTrackerInputFormScreen2.Q, transferTrackerInputFormScreen2.R, new RowLoadingDelegate(), new FullScreenStateDelegate()), 0, null, null, null, 60);
                }
            }
        });
        final int i3 = 2;
        this.S = w.y0(new Function0(this) { // from class: hee.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransferTrackerInputFormScreen f151688b;

            {
                this.f151688b = this;
            }

            /* JADX WARN: Type inference failed for: r1v17, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                TransferTrackerInputFormScreen transferTrackerInputFormScreen = this.f151688b;
                int i32 = 4;
                int i5 = 3;
                int i6 = 2;
                int i21 = 1;
                int i222 = 0;
                int i322 = 5;
                switch (i22) {
                    case 0:
                        TransferTrackerInputFormScreen.Companion companion = TransferTrackerInputFormScreen.INSTANCE;
                        phm.a aVar = (phm.a) ue0.e.j(transferTrackerInputFormScreen.m2()).a().get(tce.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", tce.a.class, " is not found"));
                        }
                        rde.h hVar = ((rde.h) aVar2.b()).k;
                        rde.i iVar = new rde.i();
                        iVar.f253444a = e4m.b.b(e4m.c.a(transferTrackerInputFormScreen));
                        int i33 = 6;
                        iVar.f253445b = e4m.b.b(new r7d.o(hVar, iVar, i6, i33));
                        iVar.f253446c = e4m.b.b(new r7d.o(hVar, iVar, i21, i33));
                        iVar.d = e4m.b.b(new r7d.o(hVar, iVar, i222, i33));
                        iVar.e = e4m.b.b(new r7d.o(hVar, iVar, i32, i33));
                        iVar.f = e4m.b.b(new r7d.o(hVar, iVar, i5, i33));
                        iVar.f253447g = e4m.b.b(new r7d.o(hVar, iVar, 7, i33));
                        iVar.f253448h = e4m.b.b(new r7d.o(hVar, iVar, i33, i33));
                        iVar.i = e4m.b.b(new r7d.o(hVar, iVar, 8, i33));
                        iVar.f253449j = e4m.b.b(new r7d.o(hVar, iVar, 9, i33));
                        iVar.k = e4m.b.b(new r7d.o(hVar, iVar, i322, i33));
                        return iVar;
                    case 1:
                        TransferTrackerInputFormScreen.Companion companion2 = TransferTrackerInputFormScreen.INSTANCE;
                        return (o) ((rde.i) transferTrackerInputFormScreen.N.getValue()).k.get();
                    default:
                        TransferTrackerInputFormScreen.Companion companion3 = TransferTrackerInputFormScreen.INSTANCE;
                        TransferTrackerInputFormScreen transferTrackerInputFormScreen2 = this.f151688b;
                        return tki.g.a(transferTrackerInputFormScreen2, transferTrackerInputFormScreen2.R2(), zhm.v.k(transferTrackerInputFormScreen2.P, transferTrackerInputFormScreen2.Q, transferTrackerInputFormScreen2.R, new RowLoadingDelegate(), new FullScreenStateDelegate()), 0, null, null, null, 60);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        p uiState = (p) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        d3().f174564b.setEnabled(uiState.f151699b);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (i) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        ((j60.a) ((i) this.N.getValue()).f253446c.get()).d(zhm.u.c(this.T));
        NavBarWithToolbar navBarWithToolbar = d3().f174565c;
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.locate_inbound_transfer_input_title, null, null, 14);
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        navBarWithToolbar.setSecondDescriptionText(new TextLocalisedClause(R$string.locate_inbound_transfer_input_caption, null, null, 14));
        navBarWithToolbar.setSecondDescriptionVisible(true);
        navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE);
        d3().f174564b.setText(new TextLocalisedClause(R$string.locate_inbound_transfer_input_action, null, null, 14));
        d3().f174564b.setLoadingButtonTag("LOCATE_TRANSFER_BUTTON_TAG");
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174565c.f59410q), null, new d(this, continuation, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174564b.o), null, new d(this, continuation, 1), 3);
        InputTextDelegate inputTextDelegate = this.Q;
        com.revolut.kompot.navigable.a.g2(this, y.x(inputTextDelegate.f52575g.f121375b, inputTextDelegate.f52577j.f121375b, "mergeWith(...)"), null, new hee.e(this, null), 3);
        AmountEditDelegate amountEditDelegate = this.P;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(amountEditDelegate.e.f121375b), null, new f(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(amountEditDelegate.d.f121375b), null, new k(this, continuation, 10), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(amountEditDelegate.f51622g.f121375b), null, new g(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.T.d.f121375b), null, new hee.h(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.R.f52518c), null, new hee.i(this, null), 3);
    }

    public final u d3() {
        ViewBinding value = this.M.getValue(this, U[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (u) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final hee.o R2() {
        return (hee.o) this.O.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (tki.a) this.S.getValue();
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.L);
    }
}
