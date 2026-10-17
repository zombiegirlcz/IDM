package h6e;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f149646a;

    public j(String linkCode) {
        Intrinsics.checkNotNullParameter(linkCode, "linkCode");
        this.f149646a = linkCode;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof j) && Intrinsics.f(this.f149646a, ((j) obj2).f149646a);
    }

    public final int hashCode() {
        return this.f149646a.hashCode();
    }
}
