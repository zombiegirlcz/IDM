package c7i;

import com.revolut.feature_move_money.impl.model.MoveMoneyOrderInfo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class s extends t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MoveMoneyOrderInfo f22027a;

    public s(MoveMoneyOrderInfo moveMoneyOrderInfo) {
        Intrinsics.checkNotNullParameter(moveMoneyOrderInfo, "moveMoneyOrderInfo");
        Intrinsics.checkNotNullParameter("MOVE_MONEY_AUTOMATION_CTA_BUTTON_TAG", "buttonTag");
        this.f22027a = moveMoneyOrderInfo;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof s) && this.f22027a.equals(((s) obj2).f22027a);
    }

    public final int hashCode() {
        return (this.f22027a.hashCode() * 31) + 1191704439;
    }
}
