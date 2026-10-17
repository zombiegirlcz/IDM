package ky0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f190615a;

    public d(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f190615a = value;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f190615a, ((d) obj2).f190615a);
    }

    public final int hashCode() {
        return this.f190615a.hashCode();
    }
}
