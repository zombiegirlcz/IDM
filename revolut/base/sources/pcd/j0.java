package pcd;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class j0 implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i0 f234868a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f234869b;

    public j0(i0 type, String description) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(description, "description");
        this.f234868a = type;
        this.f234869b = description;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j0)) {
            return false;
        }
        j0 j0Var = (j0) obj2;
        return this.f234868a == j0Var.f234868a && Intrinsics.f(this.f234869b, j0Var.f234869b);
    }

    public final int hashCode() {
        return this.f234869b.hashCode() + (this.f234868a.hashCode() * 31);
    }
}
