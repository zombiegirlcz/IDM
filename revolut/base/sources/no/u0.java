package no;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes.dex */
public final class u0 extends gim.i implements Function2 {
    public /* synthetic */ Object A;
    public final /* synthetic */ com.revolut.analytics.tracking.v3.f B;
    public skm.h0 u;
    public skm.g0 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public com.revolut.analytics.tracking.v3.f f217846w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public String f217847x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public String f217848y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(com.revolut.analytics.tracking.v3.f fVar, Continuation continuation) {
        super(2, continuation);
        this.B = fVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        u0 u0Var = new u0(this.B, continuation);
        u0Var.A = obj2;
        return u0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((u0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00a3  */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            java.lang.Object r0 = r11.A
            kotlinx.coroutines.CoroutineScope r0 = (kotlinx.coroutines.CoroutineScope) r0
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r11.z
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L3b
            if (r2 == r5) goto L31
            if (r2 == r4) goto L27
            if (r2 != r3) goto L1f
            java.lang.String r0 = r11.f217848y
            java.lang.String r1 = r11.f217847x
            com.revolut.analytics.tracking.v3.f r2 = r11.f217846w
            yhm.o.b(r12)
            goto La6
        L1f:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L27:
            java.lang.String r0 = r11.f217847x
            com.revolut.analytics.tracking.v3.f r2 = r11.f217846w
            skm.g0 r4 = r11.v
            yhm.o.b(r12)
            goto L8c
        L31:
            com.revolut.analytics.tracking.v3.f r0 = r11.f217846w
            skm.g0 r2 = r11.v
            skm.h0 r5 = r11.u
            yhm.o.b(r12)
            goto L72
        L3b:
            yhm.o.b(r12)
            no.s0 r12 = new no.s0
            r2 = 0
            com.revolut.analytics.tracking.v3.f r7 = r11.B
            r12.<init>(r7, r6, r2)
            skm.h0 r12 = skm.e0.g(r0, r6, r6, r12, r3)
            no.s0 r2 = new no.s0
            r8 = 1
            r2.<init>(r7, r6, r8)
            skm.h0 r2 = skm.e0.g(r0, r6, r6, r2, r3)
            no.t0 r8 = new no.t0
            r9 = 0
            r8.<init>(r7, r6, r9)
            skm.h0 r0 = skm.e0.g(r0, r6, r6, r8, r3)
            r11.A = r6
            r11.u = r12
            r11.v = r2
            r11.f217846w = r7
            r11.z = r5
            java.lang.Object r0 = r0.y(r11)
            if (r0 != r1) goto L6f
            goto La2
        L6f:
            r5 = r12
            r12 = r0
            r0 = r7
        L72:
            java.lang.String r12 = (java.lang.String) r12
            r11.A = r6
            r11.u = r6
            r11.v = r2
            r11.f217846w = r0
            r11.f217847x = r12
            r11.z = r4
            java.lang.Object r4 = r5.i(r11)
            if (r4 != r1) goto L87
            goto La2
        L87:
            r10 = r0
            r0 = r12
            r12 = r4
            r4 = r2
            r2 = r10
        L8c:
            java.lang.String r12 = (java.lang.String) r12
            r11.A = r6
            r11.u = r6
            r11.v = r6
            r11.f217846w = r2
            r11.f217847x = r0
            r11.f217848y = r12
            r11.z = r3
            java.lang.Object r3 = r4.i(r11)
            if (r3 != r1) goto La3
        La2:
            return r1
        La3:
            r1 = r0
            r0 = r12
            r12 = r3
        La6:
            java.lang.String r12 = (java.lang.String) r12
            r2.getClass()
            com.revolut.analytics.tracking.v3.AnalyticsProduct$Shared$MobilePlatform r3 = com.revolut.analytics.tracking.v3.AnalyticsProduct.Shared.MobilePlatform.f
            ky4.f r6 = new ky4.f
            r4 = 15
            r6.<init>(r1, r4, r0, r12)
            r7 = 14
            r4 = 0
            r5 = 0
            com.revolut.analytics.tracking.v3.f.g(r2, r3, r4, r5, r6, r7)
            kotlin.Unit r12 = kotlin.Unit.f186387a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: no.u0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
