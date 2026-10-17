package rei;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f253634a;

    public s(r status) {
        Intrinsics.checkNotNullParameter(status, "status");
        this.f253634a = status;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof s) && this.f253634a == ((s) obj2).f253634a;
    }

    public final int hashCode() {
        return this.f253634a.hashCode();
    }
}
