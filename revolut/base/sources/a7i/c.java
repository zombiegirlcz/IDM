package a7i;

import com.revolut.feature_move_money.impl.model.MoveMoneyOrderInfo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class c extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MoveMoneyOrderInfo f1909a;

    public c(MoveMoneyOrderInfo moveMoneyOrderInfo) {
        Intrinsics.checkNotNullParameter(moveMoneyOrderInfo, "moveMoneyOrderInfo");
        Intrinsics.checkNotNullParameter("MOVE_MONEY_AUTOMATION_CTA_BUTTON_TAG", "buttonTag");
        this.f1909a = moveMoneyOrderInfo;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && this.f1909a.equals(((c) obj2).f1909a);
    }

    public final int hashCode() {
        return (this.f1909a.hashCode() * 31) + 1191704439;
    }
}
