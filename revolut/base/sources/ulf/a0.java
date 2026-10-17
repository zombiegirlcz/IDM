package ulf;

import com.revolut.shared.feature.move_money.api.navigation.MoveMoneyInputData;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class a0 implements d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MoveMoneyInputData f280961a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f280962b;

    public a0(MoveMoneyInputData inputData, List coveringBalances) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(coveringBalances, "coveringBalances");
        this.f280961a = inputData;
        this.f280962b = coveringBalances;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj2;
        return Intrinsics.f(this.f280961a, a0Var.f280961a) && Intrinsics.f(this.f280962b, a0Var.f280962b);
    }

    public final int hashCode() {
        return this.f280962b.hashCode() + (this.f280961a.hashCode() * 31);
    }
}
