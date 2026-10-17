package jni;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class i implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f176793a;

    public i(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f176793a = value;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i) && Intrinsics.f(this.f176793a, ((i) obj2).f176793a);
    }

    public final int hashCode() {
        return this.f176793a.hashCode();
    }
}
