package wj0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f297953a;

    public b(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f297953a = value;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f297953a, ((b) obj2).f297953a);
    }

    public final int hashCode() {
        return this.f297953a.hashCode();
    }
}
