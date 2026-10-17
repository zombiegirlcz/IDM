package dgc;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f114625a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f114626b;

    public f(String text, boolean z) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.f114625a = text;
        this.f114626b = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f114625a, fVar.f114625a) && this.f114626b == fVar.f114626b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f114626b) + (this.f114625a.hashCode() * 31);
    }
}
