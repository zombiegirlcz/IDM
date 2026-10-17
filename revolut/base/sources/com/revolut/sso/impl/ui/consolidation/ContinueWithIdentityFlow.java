package com.revolut.sso.impl.ui.consolidation;

import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.sso.impl.ui.consolidation.ContinueWithIdentityFlow;
import iml.d;
import iml.h;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import ljl.m;
import ljl.q0;
import te0.w;
import xki.e;
import yki.c;
import yki.f;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/sso/impl/ui/consolidation/ContinueWithIdentityFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Liml/h;", "Lyki/f;", "<init>", "()V", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ContinueWithIdentityFlow extends ViewController<h> implements f {
    public final Object K;
    public final int L = R$layout.screen_transparent;
    public final Object M;
    public final Object N;

    public ContinueWithIdentityFlow() {
        final int i = 0;
        this.K = w.y0(new Function0(this) { // from class: iml.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ContinueWithIdentityFlow f162562b;

            {
                this.f162562b = this;
            }

            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        return new m(((q0) kli.a.n(this.f162562b.m2())).E);
                    case 1:
                        ContinueWithIdentityFlow continueWithIdentityFlow = this.f162562b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, continueWithIdentityFlow, (d) continueWithIdentityFlow.N.getValue());
                    default:
                        return (d) ((m) this.f162562b.K.getValue()).f196027c.get();
                }
            }
        });
        final int i2 = 1;
        this.M = w.y0(new Function0(this) { // from class: iml.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ContinueWithIdentityFlow f162562b;

            {
                this.f162562b = this;
            }

            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        return new m(((q0) kli.a.n(this.f162562b.m2())).E);
                    case 1:
                        ContinueWithIdentityFlow continueWithIdentityFlow = this.f162562b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, continueWithIdentityFlow, (d) continueWithIdentityFlow.N.getValue());
                    default:
                        return (d) ((m) this.f162562b.K.getValue()).f196027c.get();
                }
            }
        });
        final int i3 = 2;
        this.N = w.y0(new Function0(this) { // from class: iml.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ContinueWithIdentityFlow f162562b;

            {
                this.f162562b = this;
            }

            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        return new m(((q0) kli.a.n(this.f162562b.m2())).E);
                    case 1:
                        ContinueWithIdentityFlow continueWithIdentityFlow = this.f162562b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, continueWithIdentityFlow, (d) continueWithIdentityFlow.N.getValue());
                    default:
                        return (d) ((m) this.f162562b.K.getValue()).f196027c.get();
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (m) this.K.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final qji.b R1() {
        return (m) this.K.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (d) this.N.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final c k() {
        return (c) this.M.getValue();
    }
}
