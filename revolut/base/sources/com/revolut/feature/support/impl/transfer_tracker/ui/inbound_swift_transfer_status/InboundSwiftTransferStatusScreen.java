package com.revolut.feature.support.impl.transfer_tracker.ui.inbound_swift_transfer_status;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.q;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderLoadingDelegate;
import com.revolut.core.ui_kit.delegates.ProgressStepVerticalV2Delegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit.views.navbar.TextNavBarMenuItem;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.support.impl.R$string;
import com.revolut.feature.support.impl.transfer_tracker.ui.inbound_swift_transfer_status.InboundSwiftTransferStatusScreen;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import cvi.b;
import dee.i;
import dee.j;
import dee.k;
import dee.l;
import dee.m;
import dee.o;
import dee.r;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import rde.c;
import te0.w;
import tx0.r4;
import vc.s;
import xki.e;
import zhm.u;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00052\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003:\u0001\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/support/impl/transfer_tracker/ui/inbound_swift_transfer_status/InboundSwiftTransferStatusScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Ldee/o;", "Ldli/a;", "Ldee/r;", "Companion", "a", "feature_support_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class InboundSwiftTransferStatusScreen extends ViewController<o> implements dli.a {
    public final int K;
    public final h L;
    public final Object M;
    public final Object N;
    public final RowDelegate O;
    public final FullScreenStateDelegate P;
    public final ProgressStepVerticalV2Delegate Q;
    public final Object R;
    public static final /* synthetic */ KProperty[] S = {o0.f186429a.j(new h0(InboundSwiftTransferStatusScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};

    @NotNull
    private static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public InboundSwiftTransferStatusScreen(InboundSwiftTransferStatusScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = R$layout.screen_recycler_navbar;
        this.L = s.t(this, i.f);
        this.M = w.y0(new b(this, inputData, 25));
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: dee.h

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InboundSwiftTransferStatusScreen f113410b;

            {
                this.f113410b = this;
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        KProperty[] kPropertyArr = InboundSwiftTransferStatusScreen.S;
                        return (q) ((rde.c) this.f113410b.M.getValue()).i.get();
                    default:
                        KProperty[] kPropertyArr2 = InboundSwiftTransferStatusScreen.S;
                        InboundSwiftTransferStatusScreen inboundSwiftTransferStatusScreen = this.f113410b;
                        return dli.f.a(inboundSwiftTransferStatusScreen, inboundSwiftTransferStatusScreen.R2(), zhm.v.k(inboundSwiftTransferStatusScreen.O, new RowLoadingDelegate(), inboundSwiftTransferStatusScreen.P, new ListSubheaderDelegate(), new ListSubheaderLoadingDelegate(), new TextDelegate(), inboundSwiftTransferStatusScreen.Q), 0, null, null, null, 60);
                }
            }
        });
        this.O = new RowDelegate(null, null, 7);
        this.P = new FullScreenStateDelegate();
        this.Q = new ProgressStepVerticalV2Delegate();
        final int i2 = 1;
        this.R = w.y0(new Function0(this) { // from class: dee.h

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InboundSwiftTransferStatusScreen f113410b;

            {
                this.f113410b = this;
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = InboundSwiftTransferStatusScreen.S;
                        return (q) ((rde.c) this.f113410b.M.getValue()).i.get();
                    default:
                        KProperty[] kPropertyArr2 = InboundSwiftTransferStatusScreen.S;
                        InboundSwiftTransferStatusScreen inboundSwiftTransferStatusScreen = this.f113410b;
                        return dli.f.a(inboundSwiftTransferStatusScreen, inboundSwiftTransferStatusScreen.R2(), zhm.v.k(inboundSwiftTransferStatusScreen.O, new RowLoadingDelegate(), inboundSwiftTransferStatusScreen.P, new ListSubheaderDelegate(), new ListSubheaderLoadingDelegate(), new TextDelegate(), inboundSwiftTransferStatusScreen.Q), 0, null, null, null, 60);
                }
            }
        });
    }

    @Override // cli.w
    public final /* bridge */ void B(cli.o oVar, q qVar) {
        dli.a.z0((r) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (c) this.M.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174539b;
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.locate_inbound_transfer_status_title, null, null, 14), null);
        navBarWithToolbar.setToolbarTitle(new TextLocalisedClause(R$string.locate_inbound_transfer_status_title, null, null, 14));
        navBarWithToolbar.setMenuItems(u.c(new TextNavBarMenuItem("DONE_MENU_ITEM_ID", new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_done, null, null, 14), r4.ACTION, null, 8)));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(d3().f174539b.f59410q), new j(this, null, 0), 3);
        ViewController.P2(this, rd0.e.b(d3().f174539b.o.f57403b), new j(this, null, 1), 3);
        RowDelegate rowDelegate = this.O;
        ViewController.P2(this, rd0.e.b(rowDelegate.f53218h), new k(this, null), 3);
        ViewController.P2(this, rd0.e.b(rowDelegate.f53226s), new l(this, null, 0), 3);
        ViewController.P2(this, rd0.e.b(this.P.f52371h.f121375b), new m(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.Q.e), new l(this, null, 1), 3);
    }

    public final jii.m d3() {
        ViewBinding value = this.L.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.m) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final dee.q R2() {
        return (dee.q) this.N.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getM() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.R.getValue();
    }
}
