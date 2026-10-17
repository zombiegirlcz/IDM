package sl;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class l implements x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f264044a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f264045b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f264046c;

    public l(String id10, String taskDefId, String str) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(taskDefId, "taskDefId");
        this.f264044a = id10;
        this.f264045b = taskDefId;
        this.f264046c = str;
    }

    @Override // sl.x
    public final String a() {
        return this.f264045b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f264044a, lVar.f264044a) && Intrinsics.f(this.f264045b, lVar.f264045b) && Intrinsics.f(this.f264046c, lVar.f264046c);
    }

    @Override // sl.x
    public final String getId() {
        return this.f264044a;
    }

    public final int hashCode() {
        int iC = p.a.c(this.f264044a.hashCode() * 31, 31, this.f264045b);
        String str = this.f264046c;
        return iC + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return v0.a.i(v0.a.m("BiometricTokenStorageTask(id=", this.f264044a, ", taskDefId=", this.f264045b, ", encryptedBiometricToken="), this.f264046c, ")");
    }
}
