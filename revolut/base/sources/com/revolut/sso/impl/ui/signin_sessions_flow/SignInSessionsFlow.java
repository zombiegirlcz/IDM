package com.revolut.sso.impl.ui.signin_sessions_flow;

import android.view.View;
import android.view.Window;
import bjl.l0;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.sso.impl.ui.signin_sessions_flow.SignInSessionsFlow;
import dql.c;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import ljl.q0;
import ljl.u0;
import no.d1;
import qji.b;
import te0.w;
import xki.e;
import yki.f;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/sso/impl/ui/signin_sessions_flow/SignInSessionsFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lbjl/l0;", "Lyki/f;", "Lno/d1;", "<init>", "()V", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SignInSessionsFlow extends ViewController<l0> implements f, d1 {
    public Integer K;
    public final Object L;
    public final Object M;
    public final Object N;
    public final int O = R$layout.screen_transparent;

    public SignInSessionsFlow() {
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: bql.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SignInSessionsFlow f17844b;

            {
                this.f17844b = this;
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        SignInSessionsFlow signInSessionsFlow = this.f17844b;
                        return new u0(((q0) kli.a.n(signInSessionsFlow.m2())).E, new dql.a(), signInSessionsFlow);
                    case 1:
                        return (b) ((u0) this.f17844b.L.getValue()).f196113l.get();
                    default:
                        SignInSessionsFlow signInSessionsFlow2 = this.f17844b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, signInSessionsFlow2, (b) signInSessionsFlow2.M.getValue());
                }
            }
        });
        final int i2 = 1;
        this.M = w.y0(new Function0(this) { // from class: bql.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SignInSessionsFlow f17844b;

            {
                this.f17844b = this;
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        SignInSessionsFlow signInSessionsFlow = this.f17844b;
                        return new u0(((q0) kli.a.n(signInSessionsFlow.m2())).E, new dql.a(), signInSessionsFlow);
                    case 1:
                        return (b) ((u0) this.f17844b.L.getValue()).f196113l.get();
                    default:
                        SignInSessionsFlow signInSessionsFlow2 = this.f17844b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, signInSessionsFlow2, (b) signInSessionsFlow2.M.getValue());
                }
            }
        });
        final int i3 = 2;
        this.N = w.y0(new Function0(this) { // from class: bql.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SignInSessionsFlow f17844b;

            {
                this.f17844b = this;
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        SignInSessionsFlow signInSessionsFlow = this.f17844b;
                        return new u0(((q0) kli.a.n(signInSessionsFlow.m2())).E, new dql.a(), signInSessionsFlow);
                    case 1:
                        return (b) ((u0) this.f17844b.L.getValue()).f196113l.get();
                    default:
                        SignInSessionsFlow signInSessionsFlow2 = this.f17844b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, signInSessionsFlow2, (b) signInSessionsFlow2.M.getValue());
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (u0) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final b R1() {
        return (u0) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (bql.b) this.M.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        this.K = Integer.valueOf(m2().getWindow().getNavigationBarColor());
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Z2() {
        int iS;
        Window window = m2().getWindow();
        Integer num = this.K;
        if (num != null) {
            iS = num.intValue();
        } else {
            iS = kli.a.s(R$attr.uikit_colorElevatedBackground, c.a(((u0) this.L.getValue()).f196108b).f22265a);
        }
        window.setNavigationBarColor(iS);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        m2().getWindow().setNavigationBarColor(kli.a.s(R$attr.uikit_colorElevatedBackground, c.a(((u0) this.L.getValue()).f196108b).f22265a));
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getO() {
        return this.O;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final yki.c k() {
        return (yki.c) this.N.getValue();
    }
}
