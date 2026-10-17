package fx4;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f138730a;

    public g(String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.f138730a = text;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && Intrinsics.f(this.f138730a, ((g) obj2).f138730a);
    }

    public final int hashCode() {
        return this.f138730a.hashCode();
    }
}
