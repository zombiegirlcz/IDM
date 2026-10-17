package y61;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class b implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f311116a;

    public b(String subjectId) {
        Intrinsics.checkNotNullParameter(subjectId, "subjectId");
        Intrinsics.checkNotNullParameter("CONSENT", "subjectType");
        this.f311116a = subjectId;
    }

    @Override // y61.d
    public final String a() {
        return this.f311116a;
    }

    @Override // y61.d
    public final String b() {
        return "CONSENT";
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f311116a, ((b) obj2).f311116a);
    }

    public final int hashCode() {
        return (this.f311116a.hashCode() * 31) + 1669483514;
    }
}
