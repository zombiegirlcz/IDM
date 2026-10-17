package fo6;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f136830a;

    public j(String institutionId) {
        Intrinsics.checkNotNullParameter(institutionId, "institutionId");
        this.f136830a = institutionId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof j) && Intrinsics.f(this.f136830a, ((j) obj2).f136830a);
    }

    public final int hashCode() {
        return this.f136830a.hashCode();
    }
}
