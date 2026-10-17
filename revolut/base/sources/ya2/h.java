package ya2;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class h implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f311912a;

    public h(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f311912a = value;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && Intrinsics.f(this.f311912a, ((h) obj2).f311912a);
    }

    public final int hashCode() {
        return this.f311912a.hashCode();
    }
}
