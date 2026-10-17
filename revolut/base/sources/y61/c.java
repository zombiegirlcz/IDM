package y61;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class c implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f311117a;

    public c(String subjectId) {
        Intrinsics.checkNotNullParameter(subjectId, "subjectId");
        Intrinsics.checkNotNullParameter("PAYMENT", "subjectType");
        this.f311117a = subjectId;
    }

    @Override // y61.d
    public final String a() {
        return this.f311117a;
    }

    @Override // y61.d
    public final String b() {
        return "PAYMENT";
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f311117a, ((c) obj2).f311117a);
    }

    public final int hashCode() {
        return (this.f311117a.hashCode() * 31) - 68698650;
    }
}
