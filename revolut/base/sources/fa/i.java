package fa;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f133010a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f133011b;

    public i(String title, boolean z) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f133010a = title;
        this.f133011b = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f133010a, iVar.f133010a) && this.f133011b == iVar.f133011b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f133011b) + (this.f133010a.hashCode() * 31);
    }

    public final String toString() {
        return "ContinueAction(title=" + this.f133010a + ", enabled=" + this.f133011b + ")";
    }
}
