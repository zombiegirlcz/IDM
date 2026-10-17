package em2;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f127593a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f127594b;

    public l(String themeId, boolean z) {
        Intrinsics.checkNotNullParameter(themeId, "themeId");
        this.f127593a = themeId;
        this.f127594b = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f127593a, lVar.f127593a) && this.f127594b == lVar.f127594b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f127594b) + (this.f127593a.hashCode() * 31);
    }
}
