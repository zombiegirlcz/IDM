package l71;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class b extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f192497a;

    public b(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f192497a = value;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f192497a, ((b) obj2).f192497a);
    }

    public final int hashCode() {
        return this.f192497a.hashCode();
    }
}
