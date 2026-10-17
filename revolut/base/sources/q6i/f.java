package q6i;

import com.revolut.feature_move_money.impl.R$string;
import com.revolut.feature_move_money.impl.amount.MoveAmountScreenContract$InputData;
import com.revolut.shared.feature.move_money.api.navigation.MoveMoneyInputData;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MoveMoneyInputData f242617a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MoveAmountScreenContract$InputData f242618b;

    public f(MoveMoneyInputData moveMoneyInputData, MoveAmountScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(moveMoneyInputData, "moveMoneyInputData");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f242617a = moveMoneyInputData;
        this.f242618b = inputData;
    }

    public static int a(b6i.i iVar) {
        int i = e.f242614a[iVar.ordinal()];
        if (i == 1) {
            return R$string.move_money_amount_screen_action_move;
        }
        if (i == 2) {
            return R$string.move_money_amount_screen_action_add;
        }
        if (i == 3) {
            return R$string.move_money_amount_screen_action_withdraw;
        }
        throw new NoWhenBranchMatchedException();
    }
}
