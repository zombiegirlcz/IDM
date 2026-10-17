package ha4;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class f implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f150440a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f150441b;

    public f(String sourceId, String formattedValue) {
        Intrinsics.checkNotNullParameter(sourceId, "sourceId");
        Intrinsics.checkNotNullParameter(formattedValue, "formattedValue");
        this.f150440a = sourceId;
        this.f150441b = formattedValue;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f150440a, fVar.f150440a) && Intrinsics.f(this.f150441b, fVar.f150441b);
    }

    public final int hashCode() {
        return this.f150441b.hashCode() + (this.f150440a.hashCode() * 31);
    }
}
