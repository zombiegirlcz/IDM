package m1b;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class c extends b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f201329a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f201330b;

    public c(String deeplink, boolean z) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        this.f201329a = deeplink;
        this.f201330b = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f201329a, cVar.f201329a) && this.f201330b == cVar.f201330b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f201330b) + (this.f201329a.hashCode() * 31);
    }
}
