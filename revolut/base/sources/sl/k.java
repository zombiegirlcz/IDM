package sl;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class k implements x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f264042a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f264043b;

    public k(String id10, String taskDefId) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(taskDefId, "taskDefId");
        this.f264042a = id10;
        this.f264043b = taskDefId;
    }

    @Override // sl.x
    public final String a() {
        return this.f264043b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f264042a, kVar.f264042a) && Intrinsics.f(this.f264043b, kVar.f264043b);
    }

    @Override // sl.x
    public final String getId() {
        return this.f264042a;
    }

    public final int hashCode() {
        return this.f264043b.hashCode() + (this.f264042a.hashCode() * 31);
    }

    public final String toString() {
        return j6.a.s("BiometricTokenRetrievalTask(id=", this.f264042a, ", taskDefId=", this.f264043b, ")");
    }
}
