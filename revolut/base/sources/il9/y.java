package il9;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v f162203a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f162204b;

    public y(v result, l task) {
        Intrinsics.checkNotNullParameter(result, "result");
        Intrinsics.checkNotNullParameter(task, "task");
        this.f162203a = result;
        this.f162204b = task;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof y)) {
            return false;
        }
        y yVar = (y) obj2;
        return Intrinsics.f(this.f162203a, yVar.f162203a) && Intrinsics.f(this.f162204b, yVar.f162204b);
    }

    public final int hashCode() {
        return this.f162204b.hashCode() + (this.f162203a.f162202a.hashCode() * 31);
    }
}
