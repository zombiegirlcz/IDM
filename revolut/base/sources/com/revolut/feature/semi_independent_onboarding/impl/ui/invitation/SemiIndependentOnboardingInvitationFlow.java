package com.revolut.feature.semi_independent_onboarding.impl.ui.invitation;

import c1d.c;
import com.revolut.feature.semi_independent_onboarding.api.navigation.SemiIndependentInvitationContract$InputData;
import com.revolut.feature.semi_independent_onboarding.impl.ui.invitation.SemiIndependentOnboardingInvitationFlow;
import com.revolut.kompot.navigable.vc.ViewController;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import te0.w;
import ue0.e;
import v0d.b;
import yki.f;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/semi_independent_onboarding/impl/ui/invitation/SemiIndependentOnboardingInvitationFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lv0d/b;", "Lyki/f;", "feature_semi_independent_onboarding_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SemiIndependentOnboardingInvitationFlow extends ViewController<b> implements f {
    public final SemiIndependentInvitationContract$InputData K;
    public final Object L;
    public final Object M;
    public final Object N;

    public SemiIndependentOnboardingInvitationFlow(SemiIndependentInvitationContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: g1d.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SemiIndependentOnboardingInvitationFlow f139572b;

            {
                this.f139572b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        SemiIndependentOnboardingInvitationFlow semiIndependentOnboardingInvitationFlow = this.f139572b;
                        return czi.c.d(0, 6, null, semiIndependentOnboardingInvitationFlow, (b) semiIndependentOnboardingInvitationFlow.N.getValue());
                    case 1:
                        SemiIndependentOnboardingInvitationFlow semiIndependentOnboardingInvitationFlow2 = this.f139572b;
                        phm.a aVar = (phm.a) e.j(semiIndependentOnboardingInvitationFlow2.m2()).a().get(c1d.e.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", c1d.e.class, " is not found"));
                        }
                        c1d.a aVar3 = ((c1d.a) ((c1d.e) aVar2.b())).f20448g;
                        SemiIndependentInvitationContract$InputData semiIndependentInvitationContract$InputData = semiIndependentOnboardingInvitationFlow2.K;
                        semiIndependentInvitationContract$InputData.getClass();
                        return new c1d.c(aVar3, semiIndependentInvitationContract$InputData);
                    default:
                        return (b) ((c1d.c) this.f139572b.M.getValue()).d.get();
                }
            }
        });
        final int i2 = 1;
        this.M = w.y0(new Function0(this) { // from class: g1d.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SemiIndependentOnboardingInvitationFlow f139572b;

            {
                this.f139572b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        SemiIndependentOnboardingInvitationFlow semiIndependentOnboardingInvitationFlow = this.f139572b;
                        return czi.c.d(0, 6, null, semiIndependentOnboardingInvitationFlow, (b) semiIndependentOnboardingInvitationFlow.N.getValue());
                    case 1:
                        SemiIndependentOnboardingInvitationFlow semiIndependentOnboardingInvitationFlow2 = this.f139572b;
                        phm.a aVar = (phm.a) e.j(semiIndependentOnboardingInvitationFlow2.m2()).a().get(c1d.e.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", c1d.e.class, " is not found"));
                        }
                        c1d.a aVar3 = ((c1d.a) ((c1d.e) aVar2.b())).f20448g;
                        SemiIndependentInvitationContract$InputData semiIndependentInvitationContract$InputData = semiIndependentOnboardingInvitationFlow2.K;
                        semiIndependentInvitationContract$InputData.getClass();
                        return new c1d.c(aVar3, semiIndependentInvitationContract$InputData);
                    default:
                        return (b) ((c1d.c) this.f139572b.M.getValue()).d.get();
                }
            }
        });
        final int i3 = 2;
        this.N = w.y0(new Function0(this) { // from class: g1d.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SemiIndependentOnboardingInvitationFlow f139572b;

            {
                this.f139572b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        SemiIndependentOnboardingInvitationFlow semiIndependentOnboardingInvitationFlow = this.f139572b;
                        return czi.c.d(0, 6, null, semiIndependentOnboardingInvitationFlow, (b) semiIndependentOnboardingInvitationFlow.N.getValue());
                    case 1:
                        SemiIndependentOnboardingInvitationFlow semiIndependentOnboardingInvitationFlow2 = this.f139572b;
                        phm.a aVar = (phm.a) e.j(semiIndependentOnboardingInvitationFlow2.m2()).a().get(c1d.e.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", c1d.e.class, " is not found"));
                        }
                        c1d.a aVar3 = ((c1d.a) ((c1d.e) aVar2.b())).f20448g;
                        SemiIndependentInvitationContract$InputData semiIndependentInvitationContract$InputData = semiIndependentOnboardingInvitationFlow2.K;
                        semiIndependentInvitationContract$InputData.getClass();
                        return new c1d.c(aVar3, semiIndependentInvitationContract$InputData);
                    default:
                        return (b) ((c1d.c) this.f139572b.M.getValue()).d.get();
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (c) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final qji.b R1() {
        return (c) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (g1d.b) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final yki.c k() {
        return (yki.c) this.L.getValue();
    }
}
