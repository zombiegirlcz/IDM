package ua2;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class f extends e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f278522a;

    public f(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f278522a = value;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f278522a, ((f) obj2).f278522a);
    }

    public final int hashCode() {
        return this.f278522a.hashCode();
    }
}
