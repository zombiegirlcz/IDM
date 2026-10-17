package zd5;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.domain.models.user.UserCompanyRegion;
import com.revolut.feature.crypto.convert.common.R$string;
import com.revolut.feature_move_money.api.model.AccountWrapper;
import j8l.h;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.u;

/* JADX INFO: loaded from: classes3.dex */
public final class e {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l61.a f321315a;

    public e(l61.a userCompanyInteractor) {
        Intrinsics.checkNotNullParameter(userCompanyInteractor, "userCompanyInteractor");
        this.f321315a = userCompanyInteractor;
    }

    public static TextLocalisedClause b(l71.d userCompany, h sourceAccount, boolean z) {
        String str = userCompany.f192498a;
        Intrinsics.checkNotNullParameter(userCompany, "userCompany");
        Intrinsics.checkNotNullParameter(sourceAccount, "sourceAccount");
        if (((AccountWrapper) sourceAccount).f97224a == j8l.a.REVX_FIAT) {
            if (userCompany.a() == UserCompanyRegion.GB) {
                return new TextLocalisedClause(R$string.move_money_disclaimer_revolut_x_withdrawal_uk, null, null, 14);
            }
            UserCompanyRegion userCompanyRegionA = userCompany.a();
            Set set = yd5.a.f312638a;
            if (set.contains(userCompanyRegionA) && z) {
                return new TextLocalisedClause(R$string.move_money_disclaimer_revolut_x_withdrawal_with_bank_name, u.c(str), null, 12);
            }
            if (set.contains(userCompany.a()) && !z) {
                return new TextLocalisedClause(R$string.move_money_disclaimer_revolut_x_withdrawal, null, null, 14);
            }
        } else {
            if (userCompany.a() == UserCompanyRegion.GB) {
                return new TextLocalisedClause(R$string.move_money_disclaimer_revolut_x_top_up_uk, null, null, 14);
            }
            UserCompanyRegion userCompanyRegionA2 = userCompany.a();
            Set set2 = yd5.a.f312638a;
            if (set2.contains(userCompanyRegionA2) && z) {
                return new TextLocalisedClause(R$string.move_money_disclaimer_revolut_x_top_up_with_bank_name, u.c(str), null, 12);
            }
            if (set2.contains(userCompany.a()) && !z) {
                return new TextLocalisedClause(R$string.move_money_disclaimer_revolut_x_top_up, null, null, 14);
            }
        }
        return null;
    }

    public static boolean c(h sourceAccount, h targetAccount, a checkCondition) {
        Intrinsics.checkNotNullParameter(sourceAccount, "sourceAccount");
        Intrinsics.checkNotNullParameter(targetAccount, "targetAccount");
        Intrinsics.checkNotNullParameter(checkCondition, "checkCondition");
        AccountWrapper accountWrapper = (AccountWrapper) sourceAccount;
        j8l.a aVar = accountWrapper.f97224a;
        j8l.a aVar2 = j8l.a.REVX_FIAT;
        boolean z = aVar == aVar2 || ((AccountWrapper) targetAccount).f97224a == aVar2;
        boolean zF = Intrinsics.f(accountWrapper.getBalance().f115083b.f306286a, ((AccountWrapper) targetAccount).getBalance().f115083b.f306286a);
        int i = c.f321311a[checkCondition.ordinal()];
        if (i != 1) {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            zF = !zF;
        }
        return z && zF;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(j8l.h r19, j8l.h r20, boolean r21, gim.c r22) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = r22
            boolean r3 = r2 instanceof zd5.d
            if (r3 == 0) goto L19
            r3 = r2
            zd5.d r3 = (zd5.d) r3
            int r4 = r3.f321314y
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L19
            int r4 = r4 - r5
            r3.f321314y = r4
            goto L1e
        L19:
            zd5.d r3 = new zd5.d
            r3.<init>(r0, r2)
        L1e:
            java.lang.Object r2 = r3.f321312w
            fim.a r4 = fim.a.COROUTINE_SUSPENDED
            int r5 = r3.f321314y
            r6 = 1
            if (r5 == 0) goto L3b
            if (r5 != r6) goto L33
            boolean r1 = r3.v
            j8l.h r3 = r3.u
            yhm.o.b(r2)
            r5 = r1
            r1 = r3
            goto L5f
        L33:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L3b:
            yhm.o.b(r2)
            zd5.a r2 = zd5.a.DIFFERENT_CURRENCIES
            r5 = r20
            boolean r2 = c(r1, r5, r2)
            if (r2 == 0) goto L8a
            l61.a r2 = r0.f321315a
            ang.b r2 = (ang.b) r2
            efm.d0 r2 = r2.a()
            r3.u = r1
            r5 = r21
            r3.v = r5
            r3.f321314y = r6
            java.lang.Object r2 = nim.a.b(r2, r3)
            if (r2 != r4) goto L5f
            return r4
        L5f:
            l71.d r2 = (l71.d) r2
            kotlin.jvm.internal.Intrinsics.h(r2)
            com.revolut.core.ui_kit.models.TextLocalisedClause r8 = b(r2, r1, r5)
            if (r8 != 0) goto L6d
            zhm.f0 r1 = zhm.f0.f322471a
            return r1
        L6d:
            com.revolut.core.ui_kit.delegates.TextDelegate$Model r6 = new com.revolut.core.ui_kit.delegates.TextDelegate$Model
            ip0.ak0 r10 = new ip0.ak0
            r1 = 3
            r2 = 0
            r10.<init>(r2, r2, r1)
            r16 = 0
            r17 = 2036(0x7f4, float:2.853E-42)
            java.lang.String r7 = "REVX_FIAT_FOOTER_DISCLAIMER_ID"
            r9 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            java.util.List r1 = zhm.u.c(r6)
            return r1
        L8a:
            zhm.f0 r1 = zhm.f0.f322471a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: zd5.e.a(j8l.h, j8l.h, boolean, gim.c):java.lang.Object");
    }
}
