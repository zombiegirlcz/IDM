package jsl;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class n0 implements p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f178226a;

    public n0(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.f178226a = key;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof n0) && Intrinsics.f(this.f178226a, ((n0) obj2).f178226a);
    }

    public final int hashCode() {
        return this.f178226a.hashCode();
    }
}
