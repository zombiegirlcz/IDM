package q6i;

import com.revolut.feature.shared.savings.models.product.SavingsProductData;
import com.revolut.feature_move_money.api.model.AccountSource;
import com.revolut.feature_move_money.api.model.AccountWrapper;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l61.a f242622a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ang.f f242623b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final gte.a f242624c;

    public g0(l61.a userCompanyInteractor, ang.f userInteractor, gte.a featureToggleInteractor, zd5.e revXFiatDisclaimerMapper) {
        Intrinsics.checkNotNullParameter(userCompanyInteractor, "userCompanyInteractor");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(revXFiatDisclaimerMapper, "revXFiatDisclaimerMapper");
        this.f242622a = userCompanyInteractor;
        this.f242623b = userInteractor;
        this.f242624c = featureToggleInteractor;
    }

    public static boolean d(AccountWrapper accountWrapper) {
        SavingsProductData savingsProductData;
        AccountSource accountSource = accountWrapper.d;
        AccountSource.SavingsSource savingsSource = accountSource instanceof AccountSource.SavingsSource ? (AccountSource.SavingsSource) accountSource : null;
        if (savingsSource == null || (savingsProductData = savingsSource.f97216a.f86462c) == null) {
            return false;
        }
        Intrinsics.checkNotNullParameter(savingsProductData, "<this>");
        return ocd.a.d(savingsProductData);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(com.revolut.feature_move_money.api.model.AccountWrapper r7, com.revolut.feature_move_money.api.model.AccountWrapper r8, gim.c r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof q6i.d0
            if (r0 == 0) goto L13
            r0 = r9
            q6i.d0 r0 = (q6i.d0) r0
            int r1 = r0.f242613y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f242613y = r1
            goto L18
        L13:
            q6i.d0 r0 = new q6i.d0
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.f242611w
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f242613y
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L41
            if (r2 == r5) goto L39
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            yhm.o.b(r9)
            return r9
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L35:
            yhm.o.b(r9)
            return r9
        L39:
            com.revolut.feature_move_money.api.model.AccountWrapper r8 = r0.v
            com.revolut.feature_move_money.api.model.AccountWrapper r7 = r0.u
            yhm.o.b(r9)
            goto L59
        L41:
            yhm.o.b(r9)
            l61.a r9 = r6.f242622a
            ang.b r9 = (ang.b) r9
            efm.d0 r9 = r9.a()
            r0.u = r7
            r0.v = r8
            r0.f242613y = r5
            java.lang.Object r9 = nim.a.b(r9, r0)
            if (r9 != r1) goto L59
            goto L88
        L59:
            l71.d r9 = (l71.d) r9
            boolean r2 = d(r7)
            r5 = 0
            if (r2 == 0) goto L73
            kotlin.jvm.internal.Intrinsics.h(r9)
            r0.u = r5
            r0.v = r5
            r0.f242613y = r4
            java.lang.Object r7 = r6.c(r9, r0)
            if (r7 != r1) goto L72
            goto L88
        L72:
            return r7
        L73:
            boolean r2 = d(r8)
            if (r2 == 0) goto L8a
            kotlin.jvm.internal.Intrinsics.h(r9)
            r0.u = r5
            r0.v = r5
            r0.f242613y = r3
            java.lang.Object r7 = r6.b(r9, r0)
            if (r7 != r1) goto L89
        L88:
            return r1
        L89:
            return r7
        L8a:
            zd5.a r0 = zd5.a.SAME_CURRENCIES
            boolean r8 = zd5.e.c(r7, r8, r0)
            if (r8 == 0) goto La4
            kotlin.jvm.internal.Intrinsics.h(r9)
            com.revolut.feature_move_money.api.MoveMoneyFeatureApi$Toggles$MoveMoneyEuDisclaimerUpdate r8 = com.revolut.feature_move_money.api.MoveMoneyFeatureApi$Toggles.MoveMoneyEuDisclaimerUpdate.f97186c
            gte.a r0 = r6.f242624c
            jte.d r0 = (jte.d) r0
            boolean r8 = r0.c(r8)
            com.revolut.core.ui_kit.models.TextLocalisedClause r7 = zd5.e.b(r9, r7, r8)
            return r7
        La4:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: q6i.g0.a(com.revolut.feature_move_money.api.model.AccountWrapper, com.revolut.feature_move_money.api.model.AccountWrapper, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(l71.d r13, gim.c r14) {
        /*
            Method dump skipped, instruction units count: 249
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: q6i.g0.b(l71.d, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(l71.d r13, gim.c r14) {
        /*
            Method dump skipped, instruction units count: 249
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: q6i.g0.c(l71.d, gim.c):java.lang.Object");
    }
}
