package k5c;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f181472a;

    public a(b status) {
        Intrinsics.checkNotNullParameter(status, "status");
        this.f181472a = status;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && this.f181472a == ((a) obj2).f181472a;
    }

    public final int hashCode() {
        return this.f181472a.hashCode();
    }
}
