package bgf;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f15189a;

    public b(a type) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.f15189a = type;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && this.f15189a == ((b) obj2).f15189a;
    }

    public final int hashCode() {
        return this.f15189a.hashCode();
    }
}
