package com.revolut.feature_move_money.impl.amount;

import com.revolut.feature_move_money.api.model.AccountWrapper;
import com.revolut.feature_move_money.api.model.OrderMode;
import com.revolut.shared.feature.move_money.api.navigation.MoveMoneyInputData;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import n7i.f0;
import u7i.t;

/* JADX INFO: loaded from: classes10.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MoveAmountScreenContract$InputData f97294a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MoveMoneyInputData f97295b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l80.e f97296c;
    public final gte.a d;

    public e(MoveAmountScreenContract$InputData inputData, MoveMoneyInputData moveMoneyInputData, l80.e dateProvider, t moveMoneyAppConfig, n7i.f excludedScheduledPaymentsAccountTypesProvider, gte.a featureToggleInteractor, f0 moveMoneySchedulingSupportDelegate) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(moveMoneyInputData, "moveMoneyInputData");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        Intrinsics.checkNotNullParameter(moveMoneyAppConfig, "moveMoneyAppConfig");
        Intrinsics.checkNotNullParameter(excludedScheduledPaymentsAccountTypesProvider, "excludedScheduledPaymentsAccountTypesProvider");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(moveMoneySchedulingSupportDelegate, "moveMoneySchedulingSupportDelegate");
        this.f97294a = inputData;
        this.f97295b = moveMoneyInputData;
        this.f97296c = dateProvider;
        this.d = featureToggleInteractor;
    }

    public final OrderMode a(AccountWrapper sourceAccount, AccountWrapper targetAccount, OrderMode currentMode) {
        Intrinsics.checkNotNullParameter(currentMode, "currentMode");
        Intrinsics.checkNotNullParameter(sourceAccount, "sourceAccount");
        Intrinsics.checkNotNullParameter(targetAccount, "targetAccount");
        if (currentMode instanceof OrderMode.Threshold) {
            return new OrderMode.Market(null);
        }
        if ((currentMode instanceof OrderMode.Automation) || (currentMode instanceof OrderMode.Market)) {
            return currentMode;
        }
        if (!(currentMode instanceof OrderMode.Scheduling)) {
            throw new NoWhenBranchMatchedException();
        }
        Set setA = n7i.f.a();
        return (setA.contains(sourceAccount.f97224a) || setA.contains(targetAccount.f97224a) || !f0.a(sourceAccount, targetAccount)) ? new OrderMode.Market(null) : currentMode;
    }
}
