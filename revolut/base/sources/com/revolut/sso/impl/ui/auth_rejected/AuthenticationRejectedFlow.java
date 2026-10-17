package com.revolut.sso.impl.ui.auth_rejected;

import com.revolut.kompot.navigable.ModalTransitionAnimation;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.sso.impl.ui.auth_rejected.AuthenticationRejectedFlow;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import ljl.d;
import te0.w;
import ukl.f;
import wii.b;
import xki.e;
import yki.c;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/sso/impl/ui/auth_rejected/AuthenticationRejectedFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lukl/f;", "Lyki/f;", "Lwii/b;", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class AuthenticationRejectedFlow extends ViewController<f> implements yki.f, b {
    public final ModalTransitionAnimation.Style.POPUP K;
    public final Object L;
    public final Object M;
    public final Object N;

    public AuthenticationRejectedFlow(AuthenticationRejectedFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = ModalTransitionAnimation.Style.POPUP.f98391a;
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: ukl.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AuthenticationRejectedFlow f280793b;

            {
                this.f280793b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        return (b) ((ljl.d) this.f280793b.N.getValue()).f195915b.get();
                    default:
                        AuthenticationRejectedFlow authenticationRejectedFlow = this.f280793b;
                        return czi.c.d(0, 6, null, authenticationRejectedFlow, (b) authenticationRejectedFlow.L.getValue());
                }
            }
        });
        final int i2 = 1;
        this.M = w.y0(new Function0(this) { // from class: ukl.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AuthenticationRejectedFlow f280793b;

            {
                this.f280793b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        return (b) ((ljl.d) this.f280793b.N.getValue()).f195915b.get();
                    default:
                        AuthenticationRejectedFlow authenticationRejectedFlow = this.f280793b;
                        return czi.c.d(0, 6, null, authenticationRejectedFlow, (b) authenticationRejectedFlow.L.getValue());
                }
            }
        });
        this.N = w.y0(new uj7.a(this, inputData, 4));
    }

    @Override // wii.b
    /* JADX INFO: renamed from: P0 */
    public final Boolean getV() {
        return Boolean.FALSE;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (d) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final qji.b R1() {
        return (d) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (ukl.b) this.L.getValue();
    }

    @Override // wii.b
    /* JADX INFO: renamed from: d2 */
    public final ModalTransitionAnimation.Style getK() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final c k() {
        return (c) this.M.getValue();
    }
}
