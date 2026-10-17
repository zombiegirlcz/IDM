package t7i;

import c8i.i0;
import com.revolut.feature.shared.savings.models.SavingsAccountDetails;
import com.revolut.feature_move_money.api.model.AccountSource;
import com.revolut.feature_move_money.api.model.AccountWrapper;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pcd.s;

/* JADX INFO: loaded from: classes10.dex */
public final class p {

    @NotNull
    public static final j Companion = new j();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ubd.i f268739a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.revolut.feature.shared.savings.impl.core.error.c f268740b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final wsg.n f268741c;
    public final gte.a d;

    public p(ubd.i savingsAccountInteractor, com.revolut.feature.shared.savings.impl.core.error.c savingsErrorInterceptor, i0 savingsMoveMoneyResultSuccessFactory, wsg.n walletInteractor, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(savingsAccountInteractor, "savingsAccountInteractor");
        Intrinsics.checkNotNullParameter(savingsErrorInterceptor, "savingsErrorInterceptor");
        Intrinsics.checkNotNullParameter(savingsMoveMoneyResultSuccessFactory, "savingsMoveMoneyResultSuccessFactory");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f268739a = savingsAccountInteractor;
        this.f268740b = savingsErrorInterceptor;
        this.f268741c = walletInteractor;
        this.d = featureToggleInteractor;
    }

    public static boolean f(j8l.h hVar, j8l.h hVar2) {
        return pw5.a.s(((AccountWrapper) hVar).f97224a) && pw5.a.s(((AccountWrapper) hVar2).f97224a);
    }

    public final Object a(j8l.h hVar, j8l.h hVar2, gim.c cVar) {
        String str;
        if (!(hVar2 instanceof AccountWrapper)) {
            throw new IllegalArgumentException(("Unexpected MoveMoney account: " + a6i.a.e(hVar2) + ". Retail supports " + AccountWrapper.class + ". Check app dependency configuration.").toString());
        }
        if (f(hVar, hVar2)) {
            SavingsAccountDetails savingsAccountDetailsA = com.revolut.feature_move_money.api.model.b.a((AccountWrapper) hVar2);
            s sVar = savingsAccountDetailsA != null ? savingsAccountDetailsA.f86460a : null;
            if (sVar == null || (str = sVar.i().f234843c) == null) {
                throw new IllegalStateException("Invalid transfer - No pocket id in vault origin");
            }
            return str;
        }
        if (!g(hVar, hVar2)) {
            return ((AccountWrapper) hVar2).getPocketId();
        }
        AccountWrapper accountWrapper = (AccountWrapper) hVar2;
        AccountSource accountSource = accountWrapper.d;
        if (accountSource instanceof AccountSource.JuniorSavingsSource) {
            return c(fo3.d.YOUTH, ((AccountSource.JuniorSavingsSource) accountSource).f97207b.f86460a.f, cVar);
        }
        if (accountSource instanceof AccountSource.JointSavingsSource) {
            return c(fo3.d.PERSONAL_JOINT, ((AccountSource.JointSavingsSource) accountSource).f97201a.f86460a.f, cVar);
        }
        if (accountSource instanceof AccountSource.SavingsSource) {
            return b(hVar2, cVar);
        }
        throw new IllegalArgumentException(j6.a.q("Unexpected type of target account: ", a6i.a.b(accountWrapper)));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(j8l.h r11, gim.c r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof t7i.l
            if (r0 == 0) goto L13
            r0 = r12
            t7i.l r0 = (t7i.l) r0
            int r1 = r0.f268729w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f268729w = r1
            goto L18
        L13:
            t7i.l r0 = new t7i.l
            r0.<init>(r10, r12)
        L18:
            java.lang.Object r12 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f268729w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r12)
            goto L4e
        L27:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L2f:
            yhm.o.b(r12)
            com.revolut.feature_move_money.api.model.AccountWrapper r11 = (com.revolut.feature_move_money.api.model.AccountWrapper) r11
            dj0.d r11 = r11.getBalance()
            xi0.b r5 = r11.f115083b
            r8 = 0
            r9 = 62
            wsg.n r4 = r10.f268741c
            r6 = 0
            r7 = 0
            efm.d0 r11 = osg.b.r(r4, r5, r6, r7, r8, r9)
            r0.f268729w = r3
            java.lang.Object r12 = nim.a.b(r11, r0)
            if (r12 != r1) goto L4e
            return r1
        L4e:
            io3.d r12 = (io3.d) r12
            java.lang.String r11 = r12.f163145a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: t7i.p.b(j8l.h, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(fo3.d r7, java.lang.String r8, gim.c r9) {
        /*
            Method dump skipped, instruction units count: 223
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: t7i.p.c(fo3.d, java.lang.String, gim.c):java.lang.Object");
    }

    public final Object d(AccountWrapper accountWrapper, AccountWrapper accountWrapper2, gim.c cVar) {
        if (accountWrapper2 == null) {
            throw new IllegalArgumentException(j6.a.q("Unexpected type of target account: ", a6i.a.e(accountWrapper2)).toString());
        }
        if (!f(accountWrapper, accountWrapper2) && g(accountWrapper, accountWrapper2)) {
            AccountSource accountSource = accountWrapper2.d;
            return accountSource instanceof AccountSource.JuniorSavingsSource ? c(fo3.d.YOUTH, ((AccountSource.JuniorSavingsSource) accountSource).f97207b.f86460a.f, cVar) : accountSource instanceof AccountSource.JointSavingsSource ? c(fo3.d.PERSONAL_JOINT, ((AccountSource.JointSavingsSource) accountSource).f97201a.f86460a.f, cVar) : b(accountWrapper2, cVar);
        }
        return accountWrapper2.a();
    }

    public final j8l.m e(long j2, j8l.h source, j8l.h target, j8l.j jVar) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(target, "target");
        return i0.a(j2, ((AccountWrapper) source).getBalance().f115083b, ((AccountWrapper) target).getBalance().f115083b, jVar);
    }

    public final boolean g(j8l.h sourceAccount, j8l.h targetAccount) {
        Intrinsics.checkNotNullParameter(sourceAccount, "sourceAccount");
        Intrinsics.checkNotNullParameter(targetAccount, "targetAccount");
        if (f(sourceAccount, targetAccount)) {
            return false;
        }
        AccountWrapper accountWrapper = (AccountWrapper) targetAccount;
        if (!pw5.a.s(accountWrapper.f97224a)) {
            return false;
        }
        j8l.a aVar = accountWrapper.f97224a;
        j8l.a aVar2 = j8l.a.JUNIOR_SAVINGS;
        if (aVar == aVar2) {
            j8l.a[] elements = {j8l.a.JUNIOR_FIAT, j8l.a.JUNIOR_VAULT, aVar2};
            Intrinsics.checkNotNullParameter(elements, "elements");
            return !kotlin.collections.d.y0(elements).contains(((AccountWrapper) sourceAccount).f97224a);
        }
        j8l.a aVar3 = j8l.a.JOINT_SAVINGS;
        if (aVar == aVar3) {
            j8l.a[] elements2 = {j8l.a.JOINT, j8l.a.JOINT_VAULT, aVar3};
            Intrinsics.checkNotNullParameter(elements2, "elements");
            return !kotlin.collections.d.y0(elements2).contains(((AccountWrapper) sourceAccount).f97224a);
        }
        AccountWrapper accountWrapper2 = (AccountWrapper) sourceAccount;
        if (pw5.a.t(accountWrapper2.f97224a) && cp5.d.z(accountWrapper2.getBalance().f115083b)) {
            return true;
        }
        j8l.a[] elements3 = {j8l.a.JOINT, j8l.a.JOINT_VAULT, j8l.a.CRYPTO, j8l.a.JUNIOR_VAULT, j8l.a.JUNIOR_FIAT};
        Intrinsics.checkNotNullParameter(elements3, "elements");
        return kotlin.collections.d.y0(elements3).contains(accountWrapper2.f97224a);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(long r19, j8l.h r21, j8l.h r22, j8l.d r23, j8l.j r24, java.lang.String r25, gim.c r26) {
        /*
            Method dump skipped, instruction units count: 241
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: t7i.p.h(long, j8l.h, j8l.h, j8l.d, j8l.j, java.lang.String, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(long r12, j8l.h r14, j8l.h r15, j8l.d r16, j8l.j r17, java.lang.String r18, gim.c r19) {
        /*
            r11 = this;
            r0 = r19
            boolean r1 = r0 instanceof t7i.o
            if (r1 == 0) goto L16
            r1 = r0
            t7i.o r1 = (t7i.o) r1
            int r2 = r1.A
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L16
            int r2 = r2 - r3
            r1.A = r2
        L14:
            r9 = r1
            goto L1c
        L16:
            t7i.o r1 = new t7i.o
            r1.<init>(r11, r0)
            goto L14
        L1c:
            java.lang.Object r0 = r9.f268738y
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r9.A
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            long r12 = r9.u
            j8l.j r14 = r9.f268737x
            com.revolut.feature_move_money.api.model.AccountWrapper r1 = r9.f268736w
            com.revolut.feature_move_money.api.model.AccountWrapper r2 = r9.v
            yhm.o.b(r0)
            goto L81
        L33:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L3b:
            yhm.o.b(r0)
            r0 = r15
            com.revolut.feature_move_money.api.model.AccountWrapper r0 = (com.revolut.feature_move_money.api.model.AccountWrapper) r0
            java.lang.String r2 = r0.getPocketId()
            com.revolut.feature_move_money.api.model.AccountWrapper r14 = (com.revolut.feature_move_money.api.model.AccountWrapper) r14
            java.lang.String r6 = r14.getPocketId()
            int[] r4 = t7i.k.f268728a
            int r5 = r16.ordinal()
            r4 = r4[r5]
            if (r4 == r3) goto L62
            r5 = 2
            if (r4 != r5) goto L5c
            lcd.j r4 = lcd.j.SELL
        L5a:
            r7 = r4
            goto L65
        L5c:
            kotlin.NoWhenBranchMatchedException r12 = new kotlin.NoWhenBranchMatchedException
            r12.<init>()
            throw r12
        L62:
            lcd.j r4 = lcd.j.BUY
            goto L5a
        L65:
            r9.v = r14
            r9.f268736w = r0
            r10 = r17
            r9.f268737x = r10
            r9.u = r12
            r9.A = r3
            r3 = r2
            ubd.i r2 = r11.f268739a
            r4 = r12
            r8 = r18
            java.lang.Object r2 = r2.f(r3, r4, r6, r7, r8, r9)
            if (r2 != r1) goto L7e
            return r1
        L7e:
            r2 = r14
            r1 = r0
            r14 = r10
        L81:
            dj0.d r0 = r2.getBalance()
            xi0.b r0 = r0.f115083b
            dj0.d r1 = r1.getBalance()
            xi0.b r1 = r1.f115083b
            j8l.m r12 = c8i.i0.a(r12, r0, r1, r14)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: t7i.p.i(long, j8l.h, j8l.h, j8l.d, j8l.j, java.lang.String, gim.c):java.lang.Object");
    }
}
