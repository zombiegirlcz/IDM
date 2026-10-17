package u29;

import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import vkm.y;
import zhm.h0;

/* JADX INFO: loaded from: classes4.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o29.n f276574a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y29.a f276575b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final nyb.k f276576c;
    public final o29.a d;
    public final p19.a e;
    public final f39.c f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final vii.b f276577g;

    public m(o29.n repository, y29.a lifestyleTabConfigValidator, nyb.k revPointsInteractor, o29.a lifestyleClosedS4URepository, p19.a lifestyleContentGatewayInteractor, f39.c lifestyleFeaturesProvider) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(lifestyleTabConfigValidator, "lifestyleTabConfigValidator");
        Intrinsics.checkNotNullParameter(revPointsInteractor, "revPointsInteractor");
        Intrinsics.checkNotNullParameter(lifestyleClosedS4URepository, "lifestyleClosedS4URepository");
        Intrinsics.checkNotNullParameter(lifestyleContentGatewayInteractor, "lifestyleContentGatewayInteractor");
        Intrinsics.checkNotNullParameter(lifestyleFeaturesProvider, "lifestyleFeaturesProvider");
        this.f276574a = repository;
        this.f276575b = lifestyleTabConfigValidator;
        this.f276576c = revPointsInteractor;
        this.d = lifestyleClosedS4URepository;
        this.e = lifestyleContentGatewayInteractor;
        this.f = lifestyleFeaturesProvider;
        this.f276577g = new vii.b();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r5, gim.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof u29.h
            if (r0 == 0) goto L13
            r0 = r6
            u29.h r0 = (u29.h) r0
            int r1 = r0.f276571w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f276571w = r1
            goto L18
        L13:
            u29.h r0 = new u29.h
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f276571w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r6)
            goto L4a
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            yhm.o.b(r6)
            r0.f276571w = r3
            o29.a r6 = r4.d
            ue0.c r6 = r6.f221550a
            java.lang.String r0 = "LIFESTYLE_CLOSED_S4U_"
            java.lang.String r5 = j6.a.q(r0, r5)
            java.lang.String r0 = ""
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            z9h.n.l(r2, r6, r5, r0)
            kotlin.Unit r5 = kotlin.Unit.f186387a
            if (r5 != r1) goto L4a
            return r1
        L4a:
            vii.b r5 = r4.f276577g
            r5.a()
            kotlin.Unit r5 = kotlin.Unit.f186387a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: u29.m.a(java.lang.String, gim.c):java.lang.Object");
    }

    public final y b(i19.f refreshStrategyType) {
        Intrinsics.checkNotNullParameter(refreshStrategyType, "refreshStrategyType");
        Continuation continuation = null;
        return rd0.e.e(vkm.q.Q(mo3.a.g(vkm.q.q(f39.c.b(this.f)), null, null, 3), new sdi.a(continuation, this, refreshStrategyType, 13)), h0.f322473a, new tc6.d(3, 18, continuation));
    }
}
