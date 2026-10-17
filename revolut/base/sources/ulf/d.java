package ulf;

import com.revolut.shared.feature.move_money.api.navigation.StartUpPocket;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final StartUpPocket f280967a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k1j.a f280968b;

    public d(StartUpPocket startUpPocket, k1j.a balanceChooserBalanceType) {
        Intrinsics.checkNotNullParameter(startUpPocket, "startUpPocket");
        Intrinsics.checkNotNullParameter(balanceChooserBalanceType, "balanceChooserBalanceType");
        this.f280967a = startUpPocket;
        this.f280968b = balanceChooserBalanceType;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f280967a, dVar.f280967a) && this.f280968b == dVar.f280968b;
    }

    public final int hashCode() {
        return this.f280968b.hashCode() + (this.f280967a.hashCode() * 31);
    }
}
