package lx0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f200514a;

    public h(String resourceId) {
        Intrinsics.checkNotNullParameter(resourceId, "resourceId");
        this.f200514a = resourceId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && Intrinsics.f(this.f200514a, ((h) obj2).f200514a);
    }

    public final int hashCode() {
        return this.f200514a.hashCode();
    }
}
