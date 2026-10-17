package xnd;

import com.revolut.retail.feature.api.AnalyticsAccountsSelection;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
public final class s0 extends gim.i implements Function2 {
    public /* synthetic */ Object A;
    public final /* synthetic */ t0 B;
    public final /* synthetic */ AnalyticsAccountsSelection C;
    public t0 u;
    public y0 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public m0 f307447w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public n0 f307448x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public k0 f307449y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(t0 t0Var, AnalyticsAccountsSelection analyticsAccountsSelection, Continuation continuation) {
        super(2, continuation);
        this.B = t0Var;
        this.C = analyticsAccountsSelection;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        s0 s0Var = new s0(this.B, this.C, continuation);
        s0Var.A = obj2;
        return s0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((s0) create((Pair) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x009e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x009f  */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            r18 = this;
            r0 = r18
            java.lang.Object r1 = r0.A
            kotlin.Pair r1 = (kotlin.Pair) r1
            fim.a r2 = fim.a.COROUTINE_SUSPENDED
            int r3 = r0.z
            com.revolut.retail.feature.api.AnalyticsAccountsSelection r4 = r0.C
            xnd.t0 r5 = r0.B
            r6 = 1
            if (r3 == 0) goto L30
            if (r3 != r6) goto L28
            xnd.k0 r1 = r0.f307449y
            xnd.n0 r2 = r0.f307448x
            xnd.m0 r3 = r0.f307447w
            xnd.y0 r6 = r0.v
            xnd.t0 r7 = r0.u
            yhm.o.b(r19)
            r14 = r1
            r11 = r2
            r10 = r3
            r8 = r6
            r6 = r19
            goto La4
        L28:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L30:
            yhm.o.b(r19)
            java.lang.Object r3 = r1.f186385a
            kotlin.Pair r3 = (kotlin.Pair) r3
            java.lang.Object r1 = r1.f186386b
            kotlin.Pair r1 = (kotlin.Pair) r1
            java.lang.Object r7 = r3.f186385a
            od0.i r7 = (od0.i) r7
            java.lang.Object r3 = r3.f186386b
            od0.i r3 = (od0.i) r3
            java.lang.Object r8 = r1.f186385a
            od0.i r8 = (od0.i) r8
            java.lang.Object r1 = r1.f186386b
            od0.i r1 = (od0.i) r1
            java.lang.Object r7 = r7.f224257a
            xnd.y0 r7 = (xnd.y0) r7
            java.lang.Object r8 = r8.f224257a
            xnd.m0 r8 = (xnd.m0) r8
            java.lang.Object r1 = r1.f224257a
            xnd.n0 r1 = (xnd.n0) r1
            java.lang.Object r3 = r3.f224257a
            xnd.k0 r3 = (xnd.k0) r3
            r9 = r4
            com.revolut.retail.feature.api.AnalyticsAccountsSelection$Spending r9 = (com.revolut.retail.feature.api.AnalyticsAccountsSelection.Spending) r9
            r10 = 0
            r0.A = r10
            r0.u = r5
            r0.v = r7
            r0.f307447w = r8
            r0.f307448x = r1
            r0.f307449y = r3
            r0.z = r6
            java.util.Set r6 = r9.f99207a
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            boolean r9 = r6 instanceof java.util.Collection
            if (r9 == 0) goto L7f
            r9 = r6
            java.util.Collection r9 = (java.util.Collection) r9
            boolean r9 = r9.isEmpty()
            if (r9 == 0) goto L7f
            goto L9a
        L7f:
            java.util.Iterator r6 = r6.iterator()
        L83:
            boolean r9 = r6.hasNext()
            if (r9 == 0) goto L9a
            java.lang.Object r9 = r6.next()
            com.revolut.retail.feature.api.SpendingAnalyticsAccount r9 = (com.revolut.retail.feature.api.SpendingAnalyticsAccount) r9
            boolean r9 = r9 instanceof com.revolut.retail.feature.api.AnalyticsAccount.Personal
            if (r9 == 0) goto L83
            v5a.c r6 = r5.e
            java.lang.Object r6 = r6.a(r0)
            goto L9c
        L9a:
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
        L9c:
            if (r6 != r2) goto L9f
            return r2
        L9f:
            r11 = r1
            r14 = r3
            r10 = r8
            r8 = r7
            r7 = r5
        La4:
            r15 = r6
            java.lang.Boolean r15 = (java.lang.Boolean) r15
            boolean r16 = r5.b(r4)
            r17 = 50
            r9 = 0
            r12 = 0
            r13 = 0
            xnd.r0 r1 = xnd.t0.a(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: xnd.s0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
