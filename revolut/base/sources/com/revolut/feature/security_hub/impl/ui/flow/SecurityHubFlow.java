package com.revolut.feature.security_hub.impl.ui.flow;

import com.revolut.feature.security_hub.api.navigation.SecurityHubInputData;
import com.revolut.feature.security_hub.impl.ui.flow.SecurityHubFlow;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import te0.w;
import vtc.t;
import vtc.u;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/security_hub/impl/ui/flow/SecurityHubFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lotc/a;", "Lyki/f;", "feature_security_hub_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SecurityHubFlow extends ViewController<otc.a> implements yki.f {
    public final SecurityHubInputData K;
    public final int L;
    public final Object M;
    public final Object N;
    public final Object O;

    public SecurityHubFlow(SecurityHubInputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_transparent;
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: huc.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SecurityHubFlow f155606b;

            {
                this.f155606b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        SecurityHubFlow securityHubFlow = this.f155606b;
                        phm.a aVar = (phm.a) ue0.e.j(securityHubFlow.m2()).a().get(t.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", t.class, " is not found"));
                        }
                        t tVar = ((t) aVar2.b()).M;
                        SecurityHubInputData securityHubInputData = securityHubFlow.K;
                        securityHubInputData.getClass();
                        return new u(tVar, securityHubInputData);
                    case 1:
                        return (c) ((u) this.f155606b.M.getValue()).d.get();
                    default:
                        SecurityHubFlow securityHubFlow2 = this.f155606b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, securityHubFlow2, (c) securityHubFlow2.N.getValue());
                }
            }
        });
        final int i2 = 1;
        this.N = w.y0(new Function0(this) { // from class: huc.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SecurityHubFlow f155606b;

            {
                this.f155606b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        SecurityHubFlow securityHubFlow = this.f155606b;
                        phm.a aVar = (phm.a) ue0.e.j(securityHubFlow.m2()).a().get(t.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", t.class, " is not found"));
                        }
                        t tVar = ((t) aVar2.b()).M;
                        SecurityHubInputData securityHubInputData = securityHubFlow.K;
                        securityHubInputData.getClass();
                        return new u(tVar, securityHubInputData);
                    case 1:
                        return (c) ((u) this.f155606b.M.getValue()).d.get();
                    default:
                        SecurityHubFlow securityHubFlow2 = this.f155606b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, securityHubFlow2, (c) securityHubFlow2.N.getValue());
                }
            }
        });
        final int i3 = 2;
        this.O = w.y0(new Function0(this) { // from class: huc.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SecurityHubFlow f155606b;

            {
                this.f155606b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        SecurityHubFlow securityHubFlow = this.f155606b;
                        phm.a aVar = (phm.a) ue0.e.j(securityHubFlow.m2()).a().get(t.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", t.class, " is not found"));
                        }
                        t tVar = ((t) aVar2.b()).M;
                        SecurityHubInputData securityHubInputData = securityHubFlow.K;
                        securityHubInputData.getClass();
                        return new u(tVar, securityHubInputData);
                    case 1:
                        return (c) ((u) this.f155606b.M.getValue()).d.get();
                    default:
                        SecurityHubFlow securityHubFlow2 = this.f155606b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, securityHubFlow2, (c) securityHubFlow2.N.getValue());
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (u) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final qji.b R1() {
        return (u) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (huc.c) this.N.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getQ() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final yki.c k() {
        return (yki.c) this.O.getValue();
    }
}
