package com.revolut.feature.junior.account_activation.impl.ui.flow.activation;

import com.revolut.feature.junior.account_activation.impl.ui.flow.activation.AccountActivationFlow;
import com.revolut.feature.junior.account_activation.impl.ui.flow.activation.AccountActivationFlowContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import te0.w;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/junior/account_activation/impl/ui/flow/activation/AccountActivationFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "", "Lyki/f;", "feature_junior_account_activation_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class AccountActivationFlow extends ViewController<Object> implements yki.f {
    public final AccountActivationFlowContract$InputData K;
    public final Object L;
    public final Object M;
    public final Object N;

    public AccountActivationFlow(AccountActivationFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: c68.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AccountActivationFlow f21695b;

            {
                this.f21695b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        AccountActivationFlow accountActivationFlow = this.f21695b;
                        return czi.c.d(0, 6, null, accountActivationFlow, (b) accountActivationFlow.N.getValue());
                    case 1:
                        AccountActivationFlow accountActivationFlow2 = this.f21695b;
                        phm.a aVar = (phm.a) ue0.e.j(accountActivationFlow2.m2()).a().get(o58.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", o58.a.class, " is not found"));
                        }
                        z58.j jVar = ((z58.j) aVar2.b()).o;
                        AccountActivationFlowContract$InputData accountActivationFlowContract$InputData = accountActivationFlow2.K;
                        accountActivationFlowContract$InputData.getClass();
                        return new z58.f(jVar, accountActivationFlowContract$InputData);
                    default:
                        return (b) ((z58.f) this.f21695b.M.getValue()).d.get();
                }
            }
        });
        final int i2 = 1;
        this.M = w.y0(new Function0(this) { // from class: c68.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AccountActivationFlow f21695b;

            {
                this.f21695b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        AccountActivationFlow accountActivationFlow = this.f21695b;
                        return czi.c.d(0, 6, null, accountActivationFlow, (b) accountActivationFlow.N.getValue());
                    case 1:
                        AccountActivationFlow accountActivationFlow2 = this.f21695b;
                        phm.a aVar = (phm.a) ue0.e.j(accountActivationFlow2.m2()).a().get(o58.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", o58.a.class, " is not found"));
                        }
                        z58.j jVar = ((z58.j) aVar2.b()).o;
                        AccountActivationFlowContract$InputData accountActivationFlowContract$InputData = accountActivationFlow2.K;
                        accountActivationFlowContract$InputData.getClass();
                        return new z58.f(jVar, accountActivationFlowContract$InputData);
                    default:
                        return (b) ((z58.f) this.f21695b.M.getValue()).d.get();
                }
            }
        });
        final int i3 = 2;
        this.N = w.y0(new Function0(this) { // from class: c68.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AccountActivationFlow f21695b;

            {
                this.f21695b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        AccountActivationFlow accountActivationFlow = this.f21695b;
                        return czi.c.d(0, 6, null, accountActivationFlow, (b) accountActivationFlow.N.getValue());
                    case 1:
                        AccountActivationFlow accountActivationFlow2 = this.f21695b;
                        phm.a aVar = (phm.a) ue0.e.j(accountActivationFlow2.m2()).a().get(o58.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", o58.a.class, " is not found"));
                        }
                        z58.j jVar = ((z58.j) aVar2.b()).o;
                        AccountActivationFlowContract$InputData accountActivationFlowContract$InputData = accountActivationFlow2.K;
                        accountActivationFlowContract$InputData.getClass();
                        return new z58.f(jVar, accountActivationFlowContract$InputData);
                    default:
                        return (b) ((z58.f) this.f21695b.M.getValue()).d.get();
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (z58.f) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final qji.b R1() {
        return (z58.f) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (c68.b) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final yki.c k() {
        return (yki.c) this.L.getValue();
    }
}
