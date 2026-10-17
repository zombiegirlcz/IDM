package wxe;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class u implements y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f300920a;

    public u(String institutionId) {
        Intrinsics.checkNotNullParameter(institutionId, "institutionId");
        this.f300920a = institutionId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof u) && Intrinsics.f(this.f300920a, ((u) obj2).f300920a);
    }

    public final int hashCode() {
        return this.f300920a.hashCode();
    }
}
