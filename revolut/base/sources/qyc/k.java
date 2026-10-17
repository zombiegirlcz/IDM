package qyc;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class k implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f250277a;

    public k(String description) {
        Intrinsics.checkNotNullParameter(description, "description");
        this.f250277a = description;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof k) && Intrinsics.f(this.f250277a, ((k) obj2).f250277a);
    }

    public final int hashCode() {
        return this.f250277a.hashCode();
    }
}
