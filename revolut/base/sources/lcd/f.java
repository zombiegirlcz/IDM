package lcd;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f193841a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f193842b;

    public f(e type, String description) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(description, "description");
        this.f193841a = type;
        this.f193842b = description;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return this.f193841a == fVar.f193841a && Intrinsics.f(this.f193842b, fVar.f193842b);
    }

    public final int hashCode() {
        return this.f193842b.hashCode() + (this.f193841a.hashCode() * 31);
    }
}
