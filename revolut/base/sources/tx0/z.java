package tx0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f275284a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f275285b;

    public z(String pageId, boolean z) {
        Intrinsics.checkNotNullParameter(pageId, "pageId");
        this.f275284a = pageId;
        this.f275285b = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof z)) {
            return false;
        }
        z zVar = (z) obj2;
        return Intrinsics.f(this.f275284a, zVar.f275284a) && this.f275285b == zVar.f275285b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f275285b) + (this.f275284a.hashCode() * 31);
    }
}
