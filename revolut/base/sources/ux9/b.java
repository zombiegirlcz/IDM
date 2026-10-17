package ux9;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class b implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f283918a;

    public b(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f283918a = value;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f283918a, ((b) obj2).f283918a);
    }

    public final int hashCode() {
        return this.f283918a.hashCode();
    }
}
