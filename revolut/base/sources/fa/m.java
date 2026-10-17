package fa;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f133017a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f133018b;

    public m(l state, String label) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(label, "label");
        this.f133017a = state;
        this.f133018b = label;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return this.f133017a == mVar.f133017a && Intrinsics.f(this.f133018b, mVar.f133018b);
    }

    public final int hashCode() {
        return this.f133018b.hashCode() + (this.f133017a.hashCode() * 31);
    }

    public final String toString() {
        return "Status(state=" + this.f133017a + ", label=" + this.f133018b + ")";
    }
}
