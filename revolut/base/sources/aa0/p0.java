package aa0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class p0 implements r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2737a;

    public p0(String fileId) {
        Intrinsics.checkNotNullParameter(fileId, "fileId");
        this.f2737a = fileId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof p0) && Intrinsics.f(this.f2737a, ((p0) obj2).f2737a);
    }

    public final int hashCode() {
        return this.f2737a.hashCode();
    }
}
