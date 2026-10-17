package p01;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f231439a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k01.c f231440b;

    public l(int i, k01.c clickResponse) {
        Intrinsics.checkNotNullParameter(clickResponse, "clickResponse");
        this.f231439a = i;
        this.f231440b = clickResponse;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return this.f231439a == lVar.f231439a && this.f231440b.equals(lVar.f231440b);
    }

    public final int hashCode() {
        return this.f231440b.f179898a.hashCode() + (Integer.hashCode(this.f231439a) * 31);
    }
}
