package xxi;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class h implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f309541a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f309542b;

    public h(String queryParam, String code) {
        Intrinsics.checkNotNullParameter(queryParam, "queryParam");
        Intrinsics.checkNotNullParameter(code, "code");
        this.f309541a = queryParam;
        this.f309542b = code;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f309541a, hVar.f309541a) && Intrinsics.f(this.f309542b, hVar.f309542b);
    }

    public final int hashCode() {
        return this.f309542b.hashCode() + (this.f309541a.hashCode() * 31);
    }
}
