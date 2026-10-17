package o7i;

import com.revolut.feature_move_money.impl.flow.MoveMoneyFlowContract$MoveMoneyProcessState;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f222849a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MoveMoneyFlowContract$MoveMoneyProcessState f222850b;

    public e(String buttonTag, MoveMoneyFlowContract$MoveMoneyProcessState moveMoneyProcessState) {
        Intrinsics.checkNotNullParameter(buttonTag, "buttonTag");
        Intrinsics.checkNotNullParameter(moveMoneyProcessState, "moveMoneyProcessState");
        this.f222849a = buttonTag;
        this.f222850b = moveMoneyProcessState;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f222849a, eVar.f222849a) && Intrinsics.f(this.f222850b, eVar.f222850b);
    }

    public final int hashCode() {
        return this.f222850b.hashCode() + (this.f222849a.hashCode() * 31);
    }
}
