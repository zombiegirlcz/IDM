package gob;

import com.revolut.shared.feature.move_money.api.navigation.MoveMoneyInputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class b extends e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MoveMoneyInputData f145121a;

    public b(MoveMoneyInputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f145121a = inputData;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f145121a, ((b) obj2).f145121a);
    }

    public final int hashCode() {
        return this.f145121a.hashCode();
    }
}
