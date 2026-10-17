package jni;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class j implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f176794a;

    public j(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f176794a = value;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof j) && Intrinsics.f(this.f176794a, ((j) obj2).f176794a);
    }

    public final int hashCode() {
        return this.f176794a.hashCode();
    }
}
