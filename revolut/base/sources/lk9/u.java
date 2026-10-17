package lk9;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final class u extends gim.i implements Function1 {
    public final /* synthetic */ int u = 1;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ y f196328w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ zh9.y f196329x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(y yVar, zh9.y yVar2, Continuation continuation) {
        super(1, continuation);
        this.f196328w = yVar;
        this.f196329x = yVar2;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new u(this.f196329x, this.f196328w, continuation);
            default:
                return new u(this.f196328w, this.f196329x, continuation);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((u) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a2  */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            int r0 = r8.u
            switch(r0) {
                case 0: goto L33;
                default: goto L5;
            }
        L5:
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r8.v
            r2 = 1
            if (r1 == 0) goto L1a
            if (r1 != r2) goto L12
            yhm.o.b(r9)
            goto L30
        L12:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L1a:
            yhm.o.b(r9)
            lk9.u r9 = new lk9.u
            zh9.y r1 = r8.f196329x
            r3 = 0
            lk9.y r4 = r8.f196328w
            r9.<init>(r1, r4, r3)
            r8.v = r2
            java.lang.Object r9 = r4.p2(r8, r9)
            if (r9 != r0) goto L30
            goto L32
        L30:
            kotlin.Unit r0 = kotlin.Unit.f186387a
        L32:
            return r0
        L33:
            lk9.y r0 = r8.f196328w
            vi9.c0 r1 = r0.f196338t
            j60.a r2 = r0.u
            fim.a r3 = fim.a.COROUTINE_SUSPENDED
            int r4 = r8.v
            r5 = 2
            r6 = 1
            zh9.y r7 = r8.f196329x
            if (r4 == 0) goto L57
            if (r4 == r6) goto L53
            if (r4 != r5) goto L4b
            yhm.o.b(r9)
            goto L8c
        L4b:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L53:
            yhm.o.b(r9)
            goto L6f
        L57:
            yhm.o.b(r9)
            zh9.r0 r9 = r7.f322365a
            boolean r9 = r9.f322336q
            if (r9 == 0) goto L66
            com.revolut.feature.pay_later.api.navigation.PayLaterKompotFeatureConfig$RepayAmountNavigationDestination r9 = com.revolut.feature.pay_later.api.navigation.PayLaterKompotFeatureConfig.RepayAmountNavigationDestination.f78836b
            r0.C1(r9)
            goto Lac
        L66:
            r8.v = r6
            java.lang.Object r9 = lk9.y.z2(r0, r8)
            if (r9 != r3) goto L6f
            goto Lae
        L6f:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L7d
            com.revolut.feature.pay_later.api.navigation.PayLaterKompotFeatureConfig$RepayAmountNavigationDestination r9 = com.revolut.feature.pay_later.api.navigation.PayLaterKompotFeatureConfig.RepayAmountNavigationDestination.f78836b
            r0.C1(r9)
            goto Lac
        L7d:
            zh9.p r9 = r7.f322366b
            dj0.d r9 = czi.c.v(r9)
            r8.v = r5
            java.lang.Object r9 = lk9.y.y2(r0, r9, r8)
            if (r9 != r3) goto L8c
            goto Lae
        L8c:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto La2
            java.lang.String r9 = "REPAY_DIALOG_DELEGATES_KEY_PAY_LATER_REPAYMENT_DETAILS"
            bi9.f r0 = mif.a.S(r7)
            rp0.y r9 = r1.e(r7, r9, r0)
            r2.x(r9)
            goto Lac
        La2:
            r1.getClass()
            rp0.y r9 = vi9.c0.c()
            r2.x(r9)
        Lac:
            kotlin.Unit r3 = kotlin.Unit.f186387a
        Lae:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: lk9.u.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(zh9.y yVar, y yVar2, Continuation continuation) {
        super(1, continuation);
        this.f196329x = yVar;
        this.f196328w = yVar2;
    }
}
