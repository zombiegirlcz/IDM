package k50;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class s extends u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n50.u f181226a;

    public s(n50.u message) {
        Intrinsics.checkNotNullParameter(message, "message");
        this.f181226a = message;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof s) && Intrinsics.f(this.f181226a, ((s) obj2).f181226a);
    }

    public final int hashCode() {
        return this.f181226a.hashCode();
    }
}
