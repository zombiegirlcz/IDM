package f8i;

import com.revolut.feature_move_money.api.navigation.MoveMoneyDestination;
import com.revolut.kompot.common.ParcelableDestination;
import com.revolut.shared.feature.move_money.api.navigation.Action;
import com.revolut.shared.feature.move_money.api.navigation.MoveMoneyInputData;
import com.revolut.shared.feature.move_money.api.navigation.StartUpPocket;
import java.util.Set;
import kotlin.collections.d;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import lg0.e;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class a implements xii.b {

    @NotNull
    public static final C0781a Companion = new C0781a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f132783a;

    /* JADX INFO: renamed from: f8i.a$a, reason: collision with other inner class name */
    public static final class C0781a {
        private C0781a() {
        }
    }

    public a() {
        String[] elements = {"widget/move-money", "widget/move-money/balance-automation", "exchange"};
        Intrinsics.checkNotNullParameter(elements, "elements");
        this.f132783a = d.y0(elements);
    }

    @Override // xii.b
    public final Set a() {
        return this.f132783a;
    }

    @Override // xii.b
    public final ParcelableDestination e(e deeplink) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        return new MoveMoneyDestination(new MoveMoneyInputData(d0.J(deeplink.f195039a, "widget/move-money/balance-automation", false) ? Action.OpenBalanceAutomation.f104828a : new Action.MoveMoney(StartUpPocket.FiatAccountsAll.f104847a, (com.revolut.shared.feature.move_money.api.navigation.a) null, 6), (Set) null, 6), null);
    }
}
