package l7i;

import kotlin.jvm.internal.Intrinsics;
import wtc.b1;

/* JADX INFO: loaded from: classes10.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b1 f192666a;

    public e(b1 wealthProtectionProductInteractor) {
        Intrinsics.checkNotNullParameter(wealthProtectionProductInteractor, "wealthProtectionProductInteractor");
        this.f192666a = wealthProtectionProductInteractor;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(com.revolut.feature_move_money.impl.automation.screen.MoveMoneyAutomationScreenContract$CreationState r7, gim.c r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof l7i.d
            if (r0 == 0) goto L13
            r0 = r8
            l7i.d r0 = (l7i.d) r0
            int r1 = r0.f192665x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f192665x = r1
            goto L18
        L13:
            l7i.d r0 = new l7i.d
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f192665x
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            com.revolut.feature_move_money.impl.automation.screen.MoveMoneyAutomationScreenContract$CreationState r7 = r0.u
            yhm.o.b(r8)
            goto L6f
        L29:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L31:
            yhm.o.b(r8)
            com.revolut.feature_move_money.api.model.AccountWrapper r8 = r7.f97326b
            j8l.a r8 = r8.f97224a
            boolean r2 = pw5.a.s(r8)
            r4 = 0
            if (r2 == 0) goto L42
            qtc.k r8 = qtc.k.SAVINGS_WITHDRAWAL
            goto L4c
        L42:
            boolean r8 = pw5.a.t(r8)
            if (r8 == 0) goto L4b
            qtc.k r8 = qtc.k.POCKETS_WITHDRAWAL
            goto L4c
        L4b:
            r8 = r4
        L4c:
            if (r8 != 0) goto L4f
            goto L8b
        L4f:
            boolean r2 = r7.d
            if (r2 != 0) goto L78
            wtc.b1 r2 = r6.f192666a
            vkm.v1 r8 = r2.a(r8)
            l2c.v r2 = new l2c.v
            r5 = 20
            r2.<init>(r5)
            jhi.b r8 = mo3.a.g(r8, r4, r2, r3)
            r0.u = r7
            r0.f192665x = r3
            java.lang.Object r8 = vkm.q.x(r8, r0)
            if (r8 != r1) goto L6f
            return r1
        L6f:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L78
            goto L79
        L78:
            r3 = 0
        L79:
            if (r3 == 0) goto L8b
            com.revolut.feature.shared.recurring_payments.models.WalletAutomation r8 = r7.f97325a
            com.revolut.feature.shared.recurring_payments.models.WalletAutomation$Limit r8 = r8.getD()
            if (r8 != 0) goto L8b
            l7i.b r8 = new l7i.b
            com.revolut.feature_move_money.api.model.AccountWrapper r7 = r7.f97326b
            r8.<init>(r7)
            return r8
        L8b:
            l7i.a r7 = l7i.a.f192662a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: l7i.e.a(com.revolut.feature_move_money.impl.automation.screen.MoveMoneyAutomationScreenContract$CreationState, gim.c):java.lang.Object");
    }
}
