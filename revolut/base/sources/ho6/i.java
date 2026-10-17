package ho6;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f154231a;

    public i(String globalInstitutionId) {
        Intrinsics.checkNotNullParameter(globalInstitutionId, "globalInstitutionId");
        this.f154231a = globalInstitutionId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i) && Intrinsics.f(this.f154231a, ((i) obj2).f154231a);
    }

    public final int hashCode() {
        return this.f154231a.hashCode();
    }
}
