package a0j;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f417a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u f418b;

    public v(List actions, u uVar) {
        Intrinsics.checkNotNullParameter(actions, "actions");
        this.f417a = actions;
        this.f418b = uVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof v)) {
            return false;
        }
        v vVar = (v) obj2;
        return Intrinsics.f(this.f417a, vVar.f417a) && this.f418b == vVar.f418b;
    }

    public final int hashCode() {
        int iHashCode = this.f417a.hashCode() * 31;
        u uVar = this.f418b;
        return iHashCode + (uVar == null ? 0 : uVar.hashCode());
    }
}
