package qyc;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class j implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f250276a;

    public j(String description) {
        Intrinsics.checkNotNullParameter(description, "description");
        this.f250276a = description;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof j) && Intrinsics.f(this.f250276a, ((j) obj2).f250276a);
    }

    public final int hashCode() {
        return this.f250276a.hashCode();
    }
}
