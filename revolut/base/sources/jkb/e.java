package jkb;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f175147a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f175148b;

    public e(dj0.d weeklyDepositAmount, ArrayList checkpoints) {
        Intrinsics.checkNotNullParameter(weeklyDepositAmount, "weeklyDepositAmount");
        Intrinsics.checkNotNullParameter(checkpoints, "checkpoints");
        this.f175147a = weeklyDepositAmount;
        this.f175148b = checkpoints;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f175147a, eVar.f175147a) && this.f175148b.equals(eVar.f175148b);
    }

    public final int hashCode() {
        return this.f175148b.hashCode() + (this.f175147a.hashCode() * 31);
    }
}
