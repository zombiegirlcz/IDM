package sl;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class s implements x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f264064a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f264065b;

    public s(String id10, String taskDefId) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(taskDefId, "taskDefId");
        this.f264064a = id10;
        this.f264065b = taskDefId;
    }

    @Override // sl.x
    public final String a() {
        return this.f264065b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof s)) {
            return false;
        }
        s sVar = (s) obj2;
        return Intrinsics.f(this.f264064a, sVar.f264064a) && Intrinsics.f(this.f264065b, sVar.f264065b);
    }

    @Override // sl.x
    public final String getId() {
        return this.f264064a;
    }

    public final int hashCode() {
        return this.f264065b.hashCode() + (this.f264064a.hashCode() * 31);
    }

    public final String toString() {
        return j6.a.s("ProofOfAddressTask(id=", this.f264064a, ", taskDefId=", this.f264065b, ")");
    }
}
