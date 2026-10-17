package h6e;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class h extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f149644a;

    public h(String teenId) {
        Intrinsics.checkNotNullParameter(teenId, "teenId");
        this.f149644a = teenId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && Intrinsics.f(this.f149644a, ((h) obj2).f149644a);
    }

    public final int hashCode() {
        return this.f149644a.hashCode();
    }
}
