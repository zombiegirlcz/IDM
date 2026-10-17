package n7e;

import com.revolut.shared.feature.move_money.api.navigation.MoveMoneyInputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class d extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MoveMoneyInputData f213075a;

    public d(MoveMoneyInputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f213075a = inputData;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f213075a, ((d) obj2).f213075a);
    }

    public final int hashCode() {
        return this.f213075a.hashCode();
    }
}
