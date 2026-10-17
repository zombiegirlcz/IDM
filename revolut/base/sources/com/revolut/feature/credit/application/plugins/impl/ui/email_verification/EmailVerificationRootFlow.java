package com.revolut.feature.credit.application.plugins.impl.ui.email_verification;

import com.revolut.feature.credit.application.plugins.impl.ui.core.plugins.PluginFlowControllerV2;
import com.revolut.feature.credit.application.plugins.impl.ui.email_verification.EmailVerificationFlowContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.email_verification.EmailVerificationRootFlow;
import dw3.c1;
import dw3.u2;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import te0.w;
import xki.e;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/email_verification/EmailVerificationRootFlow;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/core/plugins/PluginFlowControllerV2;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class EmailVerificationRootFlow extends PluginFlowControllerV2 {
    public final EmailVerificationFlowContract$InputData L;
    public final Object M;
    public final Object N;
    public final Object O;

    public EmailVerificationRootFlow(EmailVerificationFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.L = inputData;
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: pa4.i

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EmailVerificationRootFlow f234342b;

            {
                this.f234342b = this;
            }

            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v15, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        EmailVerificationRootFlow emailVerificationRootFlow = this.f234342b;
                        phm.a aVar = (phm.a) ue0.e.j(emailVerificationRootFlow.m2()).a().get(dw3.e.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", dw3.e.class, " is not found"));
                        }
                        c1 c1Var = ((c1) ((dw3.e) aVar2.b())).m0;
                        EmailVerificationFlowContract$InputData emailVerificationFlowContract$InputData = emailVerificationRootFlow.L;
                        emailVerificationFlowContract$InputData.getClass();
                        return new u2(c1Var, new iq3.a(), emailVerificationRootFlow, emailVerificationFlowContract$InputData);
                    case 1:
                        return (a) ((u2) this.f234342b.M.getValue()).u.get();
                    default:
                        EmailVerificationRootFlow emailVerificationRootFlow2 = this.f234342b;
                        return czi.c.d(0, 6, null, emailVerificationRootFlow2, (a) emailVerificationRootFlow2.N.getValue());
                }
            }
        });
        final int i2 = 1;
        this.N = w.y0(new Function0(this) { // from class: pa4.i

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EmailVerificationRootFlow f234342b;

            {
                this.f234342b = this;
            }

            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v15, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        EmailVerificationRootFlow emailVerificationRootFlow = this.f234342b;
                        phm.a aVar = (phm.a) ue0.e.j(emailVerificationRootFlow.m2()).a().get(dw3.e.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", dw3.e.class, " is not found"));
                        }
                        c1 c1Var = ((c1) ((dw3.e) aVar2.b())).m0;
                        EmailVerificationFlowContract$InputData emailVerificationFlowContract$InputData = emailVerificationRootFlow.L;
                        emailVerificationFlowContract$InputData.getClass();
                        return new u2(c1Var, new iq3.a(), emailVerificationRootFlow, emailVerificationFlowContract$InputData);
                    case 1:
                        return (a) ((u2) this.f234342b.M.getValue()).u.get();
                    default:
                        EmailVerificationRootFlow emailVerificationRootFlow2 = this.f234342b;
                        return czi.c.d(0, 6, null, emailVerificationRootFlow2, (a) emailVerificationRootFlow2.N.getValue());
                }
            }
        });
        final int i3 = 2;
        this.O = w.y0(new Function0(this) { // from class: pa4.i

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EmailVerificationRootFlow f234342b;

            {
                this.f234342b = this;
            }

            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v15, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        EmailVerificationRootFlow emailVerificationRootFlow = this.f234342b;
                        phm.a aVar = (phm.a) ue0.e.j(emailVerificationRootFlow.m2()).a().get(dw3.e.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", dw3.e.class, " is not found"));
                        }
                        c1 c1Var = ((c1) ((dw3.e) aVar2.b())).m0;
                        EmailVerificationFlowContract$InputData emailVerificationFlowContract$InputData = emailVerificationRootFlow.L;
                        emailVerificationFlowContract$InputData.getClass();
                        return new u2(c1Var, new iq3.a(), emailVerificationRootFlow, emailVerificationFlowContract$InputData);
                    case 1:
                        return (a) ((u2) this.f234342b.M.getValue()).u.get();
                    default:
                        EmailVerificationRootFlow emailVerificationRootFlow2 = this.f234342b;
                        return czi.c.d(0, 6, null, emailVerificationRootFlow2, (a) emailVerificationRootFlow2.N.getValue());
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (u2) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final qji.b R1() {
        return (u2) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (pa4.a) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.feature.credit.application.plugins.impl.ui.core.plugins.PluginFlowControllerV2, oki.f
    public final yki.c k() {
        return (yki.c) this.O.getValue();
    }
}
