package q97;

import com.revolut.feature_move_money.api.navigation.MoveMoneyDestination;
import com.revolut.shared.feature.move_money.api.navigation.Action;
import com.revolut.shared.feature.move_money.api.navigation.MoveMoneyInputData;
import com.revolut.shared.feature.move_money.api.navigation.StartUpPocket;
import java.util.Set;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class n1 extends r97.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t97.d f243750b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n1(t97.c productCellProvider) {
        super(productCellProvider);
        Intrinsics.checkNotNullParameter(productCellProvider, "productCellProvider");
        this.f243750b = t97.d.ACCOUNT_MOVE_MONEY;
    }

    @Override // r97.b
    public final p97.b f() {
        return this.f243750b;
    }

    @Override // r97.b
    public final Object g(Continuation continuation) {
        return new o97.d(new MoveMoneyDestination(new MoveMoneyInputData(new Action.MoveMoney(StartUpPocket.FiatAccountsAll.f104847a, (com.revolut.shared.feature.move_money.api.navigation.a) null, 6), (Set) null, 6), null));
    }
}
