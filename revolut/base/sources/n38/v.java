package n38;

import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class v implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j38.a f211962a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f211963b;

    public v(j38.a relationshipStatus, List purposes) {
        Intrinsics.checkNotNullParameter(relationshipStatus, "relationshipStatus");
        Intrinsics.checkNotNullParameter(purposes, "purposes");
        this.f211962a = relationshipStatus;
        this.f211963b = purposes;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof v)) {
            return false;
        }
        v vVar = (v) obj2;
        return Intrinsics.f(this.f211962a, vVar.f211962a) && Intrinsics.f(this.f211963b, vVar.f211963b);
    }

    public final int hashCode() {
        return this.f211963b.hashCode() + (this.f211962a.hashCode() * 31);
    }
}
