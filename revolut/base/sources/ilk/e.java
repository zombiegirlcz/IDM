package ilk;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class e extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final iha.a f162254a;

    public e(iha.a selectedReason) {
        Intrinsics.checkNotNullParameter(selectedReason, "selectedReason");
        this.f162254a = selectedReason;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && this.f162254a == ((e) obj2).f162254a;
    }

    public final int hashCode() {
        return this.f162254a.hashCode();
    }
}
