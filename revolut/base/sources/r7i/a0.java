package r7i;

import com.revolut.feature_move_money.api.model.AccountWrapper;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import skm.p0;

/* JADX INFO: loaded from: classes10.dex */
public final class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gr6.e f252208a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c8i.a f252209b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ang.f f252210c;
    public final s d;
    public final g8i.a e;
    public final kbb.c f;

    public a0(g cryptoEligibilityChecker, gr6.e freelancerAvailabilityInteractor, c8i.a moveMoneyAccountPairEligibilityChecker, ang.f userInteractor, s juniorAccountsEligibilityChecker, g8i.a teenAccountsEligibilityChecker, kbb.c moveMoneyPocketCountryProfilesEligibilityChecker) {
        Intrinsics.checkNotNullParameter(cryptoEligibilityChecker, "cryptoEligibilityChecker");
        Intrinsics.checkNotNullParameter(freelancerAvailabilityInteractor, "freelancerAvailabilityInteractor");
        Intrinsics.checkNotNullParameter(moveMoneyAccountPairEligibilityChecker, "moveMoneyAccountPairEligibilityChecker");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(juniorAccountsEligibilityChecker, "juniorAccountsEligibilityChecker");
        Intrinsics.checkNotNullParameter(teenAccountsEligibilityChecker, "teenAccountsEligibilityChecker");
        Intrinsics.checkNotNullParameter(moveMoneyPocketCountryProfilesEligibilityChecker, "moveMoneyPocketCountryProfilesEligibilityChecker");
        this.f252208a = freelancerAvailabilityInteractor;
        this.f252209b = moveMoneyAccountPairEligibilityChecker;
        this.f252210c = userInteractor;
        this.d = juniorAccountsEligibilityChecker;
        this.e = teenAccountsEligibilityChecker;
        this.f = moveMoneyPocketCountryProfilesEligibilityChecker;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(pcd.s r5, com.revolut.feature_move_money.api.model.AccountWrapper r6, x5i.d r7, gim.c r8) {
        /*
            r4 = this;
            boolean r0 = r8 instanceof r7i.y
            if (r0 == 0) goto L13
            r0 = r8
            r7i.y r0 = (r7i.y) r0
            int r1 = r0.z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.z = r1
            goto L18
        L13:
            r7i.y r0 = new r7i.y
            r0.<init>(r4, r8)
        L18:
            java.lang.Object r8 = r0.f252259x
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.z
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            x5i.d r7 = r0.f252258w
            com.revolut.feature_move_money.api.model.AccountWrapper r6 = r0.v
            pcd.s r5 = r0.u
            yhm.o.b(r8)
            goto L4b
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            yhm.o.b(r8)
            r0.u = r5
            r0.v = r6
            r0.f252258w = r7
            r0.z = r3
            gr6.e r8 = r4.f252208a
            et6.l0 r8 = (et6.l0) r8
            java.lang.Object r8 = r8.h(r0)
            if (r8 != r1) goto L4b
            return r1
        L4b:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 != 0) goto L56
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            return r5
        L56:
            xi0.a r8 = xi0.b.Companion
            xi0.b r8 = kii.e.u(r5, r8)
            boolean r0 = cp5.d.A(r8)
            r1 = 0
            if (r0 == 0) goto L84
            boolean r8 = r7i.g.a(r8, r6)
            if (r8 == 0) goto L84
            c8i.a r8 = r4.f252209b
            c8i.b r8 = (c8i.b) r8
            r8.getClass()
            java.lang.String r8 = "vault"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r8)
            if (r6 != 0) goto L79
            r5 = r3
            goto L81
        L79:
            if (r7 != 0) goto L7d
            r5 = r1
            goto L81
        L7d:
            boolean r5 = c8i.b.a(r6)
        L81:
            if (r5 == 0) goto L84
            goto L85
        L84:
            r3 = r1
        L85:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r3)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: r7i.a0.a(pcd.s, com.revolut.feature_move_money.api.model.AccountWrapper, x5i.d, gim.c):java.lang.Object");
    }

    public final ufm.b b(AccountWrapper accountWrapper, pcd.s vault, x5i.d dVar) {
        Intrinsics.checkNotNullParameter(vault, "vault");
        return te0.w.o0(p0.f264003c, new qg7.p(11, this, vault, accountWrapper, dVar, (Continuation) null));
    }

    public final ufm.i c(AccountWrapper accountWrapper, pcd.s vault, x5i.d dVar) {
        Intrinsics.checkNotNullParameter(vault, "vault");
        ufm.i iVar = new ufm.i(te0.w.o0(p0.f264003c, new qu4.s(this, vault, null, 29)), new r4j.b(new x(this, vault, accountWrapper, dVar), 23), 0);
        Intrinsics.checkNotNullExpressionValue(iVar, "flatMap(...)");
        return iVar;
    }
}
