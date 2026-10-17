package ale;

import com.revolut.feature_move_money.api.navigation.MoveMoneyDestination;
import com.revolut.shared.feature.move_money.api.navigation.Action;
import com.revolut.shared.feature.move_money.api.navigation.MoveMoneyInputData;
import com.revolut.shared.feature.move_money.api.navigation.StartUpPocket;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class b implements iih.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m4f.b f6249a;

    public b(m4f.b wealthAddMoneyCommandProvider) {
        Intrinsics.checkNotNullParameter(wealthAddMoneyCommandProvider, "wealthAddMoneyCommandProvider");
        this.f6249a = wealthAddMoneyCommandProvider;
    }

    public final MoveMoneyDestination a(kel.b cashHolding, com.revolut.shared.feature.move_money.api.navigation.a pocketPosition) {
        Intrinsics.checkNotNullParameter(cashHolding, "cashHolding");
        Intrinsics.checkNotNullParameter(pocketPosition, "pocketPosition");
        return new MoveMoneyDestination(new MoveMoneyInputData(new Action.MoveMoney((StartUpPocket) new StartUpPocket.InvestCashHolding(cashHolding.f183150c), pocketPosition, false), (Set) null, 6), null);
    }
}
