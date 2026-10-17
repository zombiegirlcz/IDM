package z19;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f318782a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f318783b;

    public k(String text, boolean z) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.f318782a = text;
        this.f318783b = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f318782a, kVar.f318782a) && this.f318783b == kVar.f318783b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f318783b) + (this.f318782a.hashCode() * 31);
    }
}
