package rh8;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class n implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f254355a;

    public n(String juniorId) {
        Intrinsics.checkNotNullParameter(juniorId, "juniorId");
        this.f254355a = juniorId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof n) && Intrinsics.f(this.f254355a, ((n) obj2).f254355a);
    }

    public final int hashCode() {
        return this.f254355a.hashCode();
    }
}
