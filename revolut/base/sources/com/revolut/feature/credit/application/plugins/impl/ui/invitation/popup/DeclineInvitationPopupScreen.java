package com.revolut.feature.credit.application.plugins.impl.ui.invitation.popup;

import android.view.View;
import cli.a0;
import cli.l;
import cli.o;
import cli.q;
import cli.w;
import com.revolut.core.ui_kit.delegates.TwinHorizontalButtonDelegate;
import com.revolut.feature.credit.application.plugins.impl.ui.invitation.popup.DeclineInvitationPopupScreen;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dw3.b2;
import in0.g;
import j60.a;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import q97.b1;
import qba.b;
import qc4.d;
import qc4.e;
import qc4.f;
import zhm.u;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/invitation/popup/DeclineInvitationPopupScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lqc4/e;", "Lcli/w;", "Lcli/l;", "Lin0/g;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class DeclineInvitationPopupScreen extends ViewController<e> implements w, g {
    public final TwinHorizontalButtonDelegate K;
    public final Object L;
    public final int M;
    public final Object N;
    public final Object O;

    public DeclineInvitationPopupScreen(DeclineInvitationPopupScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = new TwinHorizontalButtonDelegate();
        final int i = 0;
        this.L = te0.w.y0(new Function0(this) { // from class: qc4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DeclineInvitationPopupScreen f244552b;

            {
                this.f244552b = this;
            }

            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        DeclineInvitationPopupScreen declineInvitationPopupScreen = this.f244552b;
                        return n14.e.a(declineInvitationPopupScreen, (f) declineInvitationPopupScreen.O.getValue());
                    default:
                        return (f) ((b2) this.f244552b.N.getValue()).f.get();
                }
            }
        });
        this.M = R$layout.screen_transparent;
        this.N = te0.w.y0(new b(this, inputData, 3));
        final int i2 = 1;
        this.O = te0.w.y0(new Function0(this) { // from class: qc4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DeclineInvitationPopupScreen f244552b;

            {
                this.f244552b = this;
            }

            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        DeclineInvitationPopupScreen declineInvitationPopupScreen = this.f244552b;
                        return n14.e.a(declineInvitationPopupScreen, (f) declineInvitationPopupScreen.O.getValue());
                    default:
                        return (f) ((b2) this.f244552b.N.getValue()).f.get();
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        l uiState = (l) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (b2) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (f) this.O.getValue();
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ((a) ((b2) this.N.getValue()).d.get()).d(u.c(this.K));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        TwinHorizontalButtonDelegate twinHorizontalButtonDelegate = this.K;
        Continuation continuation = null;
        ViewController.P2(this, new b1(rd0.e.b(twinHorizontalButtonDelegate.f53572c.f121375b), 2), new d(this, continuation, 0), 3);
        ViewController.P2(this, new b1(rd0.e.b(twinHorizontalButtonDelegate.d.f121375b), 3), new d(this, continuation, 1), 3);
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.M;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (a0) this.L.getValue();
    }

    @Override // in0.g
    public final boolean p0() {
        return true;
    }
}
