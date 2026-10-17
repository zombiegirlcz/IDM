package to7;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class u implements y7a.w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f272548a;

    public u(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f272548a = value;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof u) && Intrinsics.f(this.f272548a, ((u) obj2).f272548a);
    }

    public final int hashCode() {
        return this.f272548a.hashCode();
    }
}
