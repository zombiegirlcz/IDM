package com.revolut.sso.impl.ui.protection_check.flow;

import aii.q;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.sso.impl.ui.protection_check.flow.ProtectionCheckFlow;
import czi.c;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import ljl.k0;
import ljl.q0;
import qji.b;
import te0.w;
import xki.e;
import yki.f;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/sso/impl/ui/protection_check/flow/ProtectionCheckFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Lyki/f;", "", "<init>", "()V", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ProtectionCheckFlow extends ViewController<q> implements f {
    public final Object K;
    public final Object L;
    public final Object M;

    public ProtectionCheckFlow() {
        final int i = 0;
        this.K = w.y0(new Function0(this) { // from class: vol.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ProtectionCheckFlow f290997b;

            {
                this.f290997b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        return new k0(((q0) kli.a.n(this.f290997b.m2())).E);
                    case 1:
                        return (b) ((k0) this.f290997b.K.getValue()).f196008b.get();
                    default:
                        ProtectionCheckFlow protectionCheckFlow = this.f290997b;
                        return c.d(0, 6, null, protectionCheckFlow, (b) protectionCheckFlow.L.getValue());
                }
            }
        });
        final int i2 = 1;
        this.L = w.y0(new Function0(this) { // from class: vol.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ProtectionCheckFlow f290997b;

            {
                this.f290997b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        return new k0(((q0) kli.a.n(this.f290997b.m2())).E);
                    case 1:
                        return (b) ((k0) this.f290997b.K.getValue()).f196008b.get();
                    default:
                        ProtectionCheckFlow protectionCheckFlow = this.f290997b;
                        return c.d(0, 6, null, protectionCheckFlow, (b) protectionCheckFlow.L.getValue());
                }
            }
        });
        final int i3 = 2;
        this.M = w.y0(new Function0(this) { // from class: vol.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ProtectionCheckFlow f290997b;

            {
                this.f290997b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        return new k0(((q0) kli.a.n(this.f290997b.m2())).E);
                    case 1:
                        return (b) ((k0) this.f290997b.K.getValue()).f196008b.get();
                    default:
                        ProtectionCheckFlow protectionCheckFlow = this.f290997b;
                        return c.d(0, 6, null, protectionCheckFlow, (b) protectionCheckFlow.L.getValue());
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (k0) this.K.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final b R1() {
        return (k0) this.K.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (vol.b) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final yki.c k() {
        return (yki.c) this.M.getValue();
    }
}
