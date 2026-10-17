package m6i;

import com.revolut.shared.feature.move_money.api.navigation.Action;
import com.revolut.shared.feature.move_money.api.navigation.MoveMoneyInputData;
import h6i.r0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class j {

    @NotNull
    private static final d Companion = new d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w5i.c f203166a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h6i.o f203167b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w5i.a f203168c;
    public final r0 d;
    public final hd.r e;
    public final r f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final h0 f203169g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final kbb.c f203170h;
    public final gte.a i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final n0 f203171j;
    public final jul.o k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Action f203172l;

    public j(MoveMoneyInputData inputData, w5i.c balancesListInteractor, h6i.o pocketInteractor, w5i.a allowedBalancePickerGroupsProvider, r0 moveMoneyPreselectionRevPointsPocketDelegate, hd.r secondAccountSelector, r preselectedAccountsProviderV2, h0 moveMoneyStartupAccountProvider, n7i.e excludedBalanceProvider, kbb.c recurringPaymentPreselectedAccountsProvider, gte.a featureToggleInteractor, n0 targetAmountAwareSecondAccountSelector, jul.o hiddenAccountFilter) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(balancesListInteractor, "balancesListInteractor");
        Intrinsics.checkNotNullParameter(pocketInteractor, "pocketInteractor");
        Intrinsics.checkNotNullParameter(allowedBalancePickerGroupsProvider, "allowedBalancePickerGroupsProvider");
        Intrinsics.checkNotNullParameter(moveMoneyPreselectionRevPointsPocketDelegate, "moveMoneyPreselectionRevPointsPocketDelegate");
        Intrinsics.checkNotNullParameter(secondAccountSelector, "secondAccountSelector");
        Intrinsics.checkNotNullParameter(preselectedAccountsProviderV2, "preselectedAccountsProviderV2");
        Intrinsics.checkNotNullParameter(moveMoneyStartupAccountProvider, "moveMoneyStartupAccountProvider");
        Intrinsics.checkNotNullParameter(excludedBalanceProvider, "excludedBalanceProvider");
        Intrinsics.checkNotNullParameter(recurringPaymentPreselectedAccountsProvider, "recurringPaymentPreselectedAccountsProvider");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(targetAmountAwareSecondAccountSelector, "targetAmountAwareSecondAccountSelector");
        Intrinsics.checkNotNullParameter(hiddenAccountFilter, "hiddenAccountFilter");
        this.f203166a = balancesListInteractor;
        this.f203167b = pocketInteractor;
        this.f203168c = allowedBalancePickerGroupsProvider;
        this.d = moveMoneyPreselectionRevPointsPocketDelegate;
        this.e = secondAccountSelector;
        this.f = preselectedAccountsProviderV2;
        this.f203169g = moveMoneyStartupAccountProvider;
        this.f203170h = recurringPaymentPreselectedAccountsProvider;
        this.i = featureToggleInteractor;
        this.f203171j = targetAmountAwareSecondAccountSelector;
        this.k = hiddenAccountFilter;
        this.f203172l = inputData.f104833a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /* JADX WARN: Type inference failed for: r5v1, types: [zhm.h0] */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v16, types: [com.revolut.feature_move_money.api.model.AccountWrapper, java.util.Set] */
    /* JADX WARN: Type inference failed for: r5v19 */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.util.HashSet] */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v8, types: [java.util.HashSet] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(com.revolut.feature_move_money.api.model.AccountWrapper r18, long r19, java.util.Set r21, x5i.d r22, gim.c r23) {
        /*
            Method dump skipped, instruction units count: 469
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: m6i.j.a(com.revolut.feature_move_money.api.model.AccountWrapper, long, java.util.Set, x5i.d, gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:131:0x0299, code lost:
    
        if (r14 == r0) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x02ee, code lost:
    
        if (r14 != r0) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x032a, code lost:
    
        if (r14 != r0) goto L162;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x035e, code lost:
    
        if (r14 != r0) goto L170;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x037e, code lost:
    
        if (r14 == r0) goto L249;
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x0397, code lost:
    
        if (r14 == r0) goto L249;
     */
    /* JADX WARN: Code restructure failed: missing block: B:192:0x03c8, code lost:
    
        if (r14 != r0) goto L194;
     */
    /* JADX WARN: Code restructure failed: missing block: B:221:0x046b, code lost:
    
        if (r14 != r0) goto L223;
     */
    /* JADX WARN: Code restructure failed: missing block: B:231:0x049f, code lost:
    
        if (r14 != r0) goto L233;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x016d, code lost:
    
        if (r14 != r0) goto L51;
     */
    /* JADX WARN: Removed duplicated region for block: B:121:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0287 A[PHI: r1 r13 r14
      0x0287: PHI (r1v36 java.lang.Object) = (r1v30 java.lang.Object), (r1v40 java.lang.Object) binds: [B:126:0x0283, B:34:0x0107] A[DONT_GENERATE, DONT_INLINE]
      0x0287: PHI (r13v45 com.revolut.feature_move_money.api.model.AccountWrapper) = 
      (r13v43 com.revolut.feature_move_money.api.model.AccountWrapper)
      (r13v48 com.revolut.feature_move_money.api.model.AccountWrapper)
     binds: [B:126:0x0283, B:34:0x0107] A[DONT_GENERATE, DONT_INLINE]
      0x0287: PHI (r14v41 java.util.List) = (r14v40 java.util.List), (r14v43 java.util.List) binds: [B:126:0x0283, B:34:0x0107] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:130:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0401  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0418  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0438  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x04d0  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x04e9  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x01f7 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /* JADX WARN: Type inference failed for: r14v105 */
    /* JADX WARN: Type inference failed for: r14v106 */
    /* JADX WARN: Type inference failed for: r14v109 */
    /* JADX WARN: Type inference failed for: r14v110 */
    /* JADX WARN: Type inference failed for: r14v111 */
    /* JADX WARN: Type inference failed for: r14v16 */
    /* JADX WARN: Type inference failed for: r14v26, types: [com.revolut.feature_move_money.api.model.AccountWrapper, com.revolut.shared.feature.move_money.api.navigation.Action] */
    /* JADX WARN: Type inference failed for: r14v29 */
    /* JADX WARN: Type inference failed for: r14v47, types: [com.revolut.feature_move_money.api.model.AccountWrapper, com.revolut.shared.feature.move_money.api.navigation.Action] */
    /* JADX WARN: Type inference failed for: r14v50 */
    /* JADX WARN: Type inference failed for: r14v53, types: [com.revolut.feature_move_money.api.model.AccountWrapper, com.revolut.shared.feature.move_money.api.navigation.Action, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v56 */
    /* JADX WARN: Type inference failed for: r14v63, types: [com.revolut.feature_move_money.api.model.AccountWrapper, com.revolut.shared.feature.move_money.api.navigation.Action] */
    /* JADX WARN: Type inference failed for: r14v66 */
    /* JADX WARN: Type inference failed for: r14v73, types: [com.revolut.feature_move_money.api.model.AccountWrapper, com.revolut.shared.feature.move_money.api.navigation.Action, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v77 */
    /* JADX WARN: Type inference failed for: r14v80, types: [com.revolut.feature_move_money.api.model.AccountWrapper, com.revolut.shared.feature.move_money.api.navigation.Action] */
    /* JADX WARN: Type inference failed for: r14v83 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(com.revolut.shared.feature.move_money.api.navigation.Action r13, gim.c r14) {
        /*
            Method dump skipped, instruction units count: 1364
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: m6i.j.b(com.revolut.shared.feature.move_money.api.navigation.Action, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00cc A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(com.revolut.feature_move_money.api.model.AccountWrapper r10, com.revolut.shared.feature.move_money.api.navigation.StartUpPocket r11, gim.c r12, x5i.d r13) {
        /*
            Method dump skipped, instruction units count: 206
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: m6i.j.c(com.revolut.feature_move_money.api.model.AccountWrapper, com.revolut.shared.feature.move_money.api.navigation.StartUpPocket, gim.c, x5i.d):java.lang.Object");
    }

    public final boolean d() {
        Action action = this.f203172l;
        if ((action instanceof Action.OpenBalanceAutomation) || (action instanceof Action.Add) || (action instanceof Action.MoveWithFixedAccount) || (action instanceof Action.AddNewScheduledPayment) || (action instanceof Action.MoveMoney) || (action instanceof Action.Topup) || (action instanceof Action.Withdraw) || (action instanceof Action.Deposit) || (action instanceof Action.MoveMoneyWithAccountPair)) {
            return false;
        }
        if ((action instanceof Action.EditScheduledAutomation) || (action instanceof Action.EditScheduledPayment)) {
            return true;
        }
        throw new NoWhenBranchMatchedException();
    }
}
