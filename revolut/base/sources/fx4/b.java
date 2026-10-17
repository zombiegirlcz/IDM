package fx4;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f138720a;

    public b(String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.f138720a = text;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f138720a, ((b) obj2).f138720a);
    }

    public final int hashCode() {
        return this.f138720a.hashCode();
    }
}
