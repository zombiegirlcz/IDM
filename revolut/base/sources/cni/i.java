package cni;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class i implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f25440a;

    public i(String code) {
        Intrinsics.checkNotNullParameter(code, "code");
        this.f25440a = code;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i) && Intrinsics.f(this.f25440a, ((i) obj2).f25440a);
    }

    public final int hashCode() {
        return this.f25440a.hashCode();
    }
}
