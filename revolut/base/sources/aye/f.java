package aye;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class f implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yte.e f11139a;

    public f(yte.e storedMethod) {
        Intrinsics.checkNotNullParameter(storedMethod, "storedMethod");
        this.f11139a = storedMethod;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f11139a, ((f) obj2).f11139a);
    }

    public final int hashCode() {
        return this.f11139a.hashCode();
    }
}
