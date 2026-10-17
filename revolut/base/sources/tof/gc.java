package tof;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class gc implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f272773a;

    public gc(String description) {
        Intrinsics.checkNotNullParameter(description, "description");
        this.f272773a = description;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof gc) && Intrinsics.f(this.f272773a, ((gc) obj2).f272773a);
    }

    public final int hashCode() {
        return this.f272773a.hashCode();
    }
}
