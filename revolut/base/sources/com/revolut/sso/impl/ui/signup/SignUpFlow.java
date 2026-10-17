package com.revolut.sso.impl.ui.signup;

import bjl.n0;
import com.revolut.kompot.R$id;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.sso.api.login.RevolutSsoApi$SignUpInputData;
import com.revolut.sso.impl.ui.signup.SignUpFlow;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import ljl.w0;
import te0.w;
import uki.c;
import xki.e;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/sso/impl/ui/signup/SignUpFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lbjl/n0;", "Luki/c;", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SignUpFlow extends ViewController<n0> implements c {
    public final Object K;
    public final Object L;
    public final Object M;

    public SignUpFlow(RevolutSsoApi$SignUpInputData inputData, yil.a codeChallengeGenerator) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(codeChallengeGenerator, "codeChallengeGenerator");
        final int i = 0;
        this.K = w.y0(new Function0(this) { // from class: iql.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SignUpFlow f167894b;

            {
                this.f167894b = this;
            }

            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        SignUpFlow signUpFlow = this.f167894b;
                        return czi.c.a(R$id.container, (c) signUpFlow.M.getValue(), signUpFlow);
                    default:
                        return (c) ((w0) this.f167894b.L.getValue()).f196131m.get();
                }
            }
        });
        this.L = w.y0(new a2.a(this, 22, inputData, codeChallengeGenerator));
        final int i2 = 1;
        this.M = w.y0(new Function0(this) { // from class: iql.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SignUpFlow f167894b;

            {
                this.f167894b = this;
            }

            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        SignUpFlow signUpFlow = this.f167894b;
                        return czi.c.a(R$id.container, (c) signUpFlow.M.getValue(), signUpFlow);
                    default:
                        return (c) ((w0) this.f167894b.L.getValue()).f196131m.get();
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (w0) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final qji.b R1() {
        return (w0) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (iql.c) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (uki.a) this.K.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final yki.c k() {
        return (uki.a) this.K.getValue();
    }
}
