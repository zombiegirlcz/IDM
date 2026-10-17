package com.revolut.feature.credit.loan.impl.ui.rev10.repaymentaccountpicker;

import com.revolut.feature.credit.loan.impl.ui.rev10.repaymentaccountpicker.LoanRepaymentAccountModelExtension;
import com.revolut.feature_move_money.api.model.AccountWrapper;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import q35.f0;

/* JADX INFO: loaded from: classes21.dex */
public final class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f70506a = new a();

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Pair pair = (Pair) obj2;
        Intrinsics.checkNotNullParameter(pair, "<destruct>");
        return new LoanRepaymentAccountModelExtension.RepaymentAccountState((AccountWrapper) pair.f186385a, (f0) pair.f186386b);
    }
}
