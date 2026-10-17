package q6i;

import com.revolut.data.model.Data;
import com.revolut.feature.transfer.models.quotes.CreditCardInterest;
import com.revolut.feature.transfer.models.quotes.TransferAvailability;
import com.revolut.feature_move_money.api.model.AccountWrapper;
import com.revolut.feature_move_money.api.model.OrderMode;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: loaded from: classes10.dex */
public final class a0 implements z5i.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l80.e f242603a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n7i.z f242604b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final tul.b f242605c;
    public final n d;
    public final g0 e;
    public final kdh.b f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final r6i.a f242606g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final h f242607h;

    public a0(l80.e dateProvider, cdi.b revPointsFooterProvider, n7i.z creditCardDisclaimerProvider, tul.b futuresDisclaimerMapper, n moveMoneyCryptoBuyDisclaimerProvider, g0 moveMoneyInvestDisclaimerProvider, kdh.b legalEntityContextProvider, r6i.a moveMoneyArrivalNoteProvider, r6i.b moveMoneyFooterClauseProvider, h moveMoneyCfdWithdrawalDisclaimerProvider) {
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        Intrinsics.checkNotNullParameter(revPointsFooterProvider, "revPointsFooterProvider");
        Intrinsics.checkNotNullParameter(creditCardDisclaimerProvider, "creditCardDisclaimerProvider");
        Intrinsics.checkNotNullParameter(futuresDisclaimerMapper, "futuresDisclaimerMapper");
        Intrinsics.checkNotNullParameter(moveMoneyCryptoBuyDisclaimerProvider, "moveMoneyCryptoBuyDisclaimerProvider");
        Intrinsics.checkNotNullParameter(moveMoneyInvestDisclaimerProvider, "moveMoneyInvestDisclaimerProvider");
        Intrinsics.checkNotNullParameter(legalEntityContextProvider, "legalEntityContextProvider");
        Intrinsics.checkNotNullParameter(moveMoneyArrivalNoteProvider, "moveMoneyArrivalNoteProvider");
        Intrinsics.checkNotNullParameter(moveMoneyFooterClauseProvider, "moveMoneyFooterClauseProvider");
        Intrinsics.checkNotNullParameter(moveMoneyCfdWithdrawalDisclaimerProvider, "moveMoneyCfdWithdrawalDisclaimerProvider");
        this.f242603a = dateProvider;
        this.f242604b = creditCardDisclaimerProvider;
        this.f242605c = futuresDisclaimerMapper;
        this.d = moveMoneyCryptoBuyDisclaimerProvider;
        this.e = moveMoneyInvestDisclaimerProvider;
        this.f = legalEntityContextProvider;
        this.f242606g = moveMoneyArrivalNoteProvider;
        this.f242607h = moveMoneyCfdWithdrawalDisclaimerProvider;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x010d A[PHI: r1 r2 r3 r6 r13
      0x010d: PHI (r1v7 com.revolut.core.ui_kit.models.Clause) = (r1v6 com.revolut.core.ui_kit.models.Clause), (r1v18 com.revolut.core.ui_kit.models.Clause) binds: [B:37:0x0109, B:18:0x0057] A[DONT_GENERATE, DONT_INLINE]
      0x010d: PHI (r2v5 com.revolut.core.ui_kit.models.Clause) = (r2v4 com.revolut.core.ui_kit.models.Clause), (r2v13 com.revolut.core.ui_kit.models.Clause) binds: [B:37:0x0109, B:18:0x0057] A[DONT_GENERATE, DONT_INLINE]
      0x010d: PHI (r3v14 java.lang.Object) = (r3v13 java.lang.Object), (r3v1 java.lang.Object) binds: [B:37:0x0109, B:18:0x0057] A[DONT_GENERATE, DONT_INLINE]
      0x010d: PHI (r6v10 x5i.a) = (r6v9 x5i.a), (r6v15 x5i.a) binds: [B:37:0x0109, B:18:0x0057] A[DONT_GENERATE, DONT_INLINE]
      0x010d: PHI (r13v7 x5i.a) = (r13v6 x5i.a), (r13v9 x5i.a) binds: [B:37:0x0109, B:18:0x0057] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(x5i.a r39, x5i.a r40, com.revolut.feature.transfer.models.quotes.CreditCardInterest r41, gim.c r42) {
        /*
            Method dump skipped, instruction units count: 430
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: q6i.a0.a(x5i.a, x5i.a, com.revolut.feature.transfer.models.quotes.CreditCardInterest, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x02f4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(x5i.a r24, x5i.a r25, com.revolut.retail.feature.transfer.schedule.models.TransferScheduleData r26, com.revolut.feature_move_money.api.model.OrderMode r27, com.revolut.feature.transfer.models.quotes.TransferAvailability r28, com.revolut.feature.transfer.models.quotes.CreditCardInterest r29, gim.c r30) {
        /*
            Method dump skipped, instruction units count: 763
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: q6i.a0.b(x5i.a, x5i.a, com.revolut.retail.feature.transfer.schedule.models.TransferScheduleData, com.revolut.feature_move_money.api.model.OrderMode, com.revolut.feature.transfer.models.quotes.TransferAvailability, com.revolut.feature.transfer.models.quotes.CreditCardInterest, gim.c):java.lang.Object");
    }

    public final wkm.l c(x5i.a sourceAccount, x5i.a targetAccount, OrderMode orderMode, TransferAvailability transferAvailability, CreditCardInterest creditCardInterest) {
        md6.t tVarA;
        Intrinsics.checkNotNullParameter(sourceAccount, "sourceAccount");
        Intrinsics.checkNotNullParameter(targetAccount, "targetAccount");
        Intrinsics.checkNotNullParameter(orderMode, "orderMode");
        AccountWrapper sourceAccount2 = sourceAccount.f302980b;
        AccountWrapper targetAccount2 = targetAccount.f302980b;
        Intrinsics.checkNotNullParameter(sourceAccount2, "sourceAccount");
        Intrinsics.checkNotNullParameter(targetAccount2, "targetAccount");
        kdh.b bVar = this.f;
        by5.a aVar = (by5.a) bVar.f182900c;
        md6.t tVarA2 = aVar.a(sourceAccount2);
        Flow gVar = (tVarA2 == null || (tVarA = aVar.a(targetAccount2)) == null) ? new go.g(new Data(null, null, false, 7, null), 2) : ((i4b.f) bVar.f182899b).j(new md6.u(tVarA2, tVarA));
        return vkm.q.H(new ac8.h(25, this, sourceAccount, targetAccount, orderMode, transferAvailability, creditCardInterest, (Continuation) null), gVar);
    }
}
