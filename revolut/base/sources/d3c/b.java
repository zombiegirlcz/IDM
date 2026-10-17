package d3c;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class b implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f110991a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f110992b;

    public b(String fullSize, String thumbnail) {
        Intrinsics.checkNotNullParameter(fullSize, "fullSize");
        Intrinsics.checkNotNullParameter(thumbnail, "thumbnail");
        this.f110991a = fullSize;
        this.f110992b = thumbnail;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f110991a, bVar.f110991a) && Intrinsics.f(this.f110992b, bVar.f110992b);
    }

    public final int hashCode() {
        return this.f110992b.hashCode() + (this.f110991a.hashCode() * 31);
    }
}
