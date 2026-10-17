package l96;

import cli.j;
import com.revolut.feature.direct_deposit.impl.model.DepositAmount;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DepositAmount f193041a;

    public b(DepositAmount currentDepositAmount) {
        Intrinsics.checkNotNullParameter(currentDepositAmount, "currentDepositAmount");
        this.f193041a = currentDepositAmount;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f193041a, ((b) obj2).f193041a);
    }

    public final int hashCode() {
        return this.f193041a.hashCode();
    }
}
