package g2e;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f139990a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f139991b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f139992c;

    public h(String id10, String source, String str) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(source, "source");
        this.f139990a = id10;
        this.f139991b = source;
        this.f139992c = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f139990a, hVar.f139990a) && Intrinsics.f(this.f139991b, hVar.f139991b) && Intrinsics.f(this.f139992c, hVar.f139992c);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f139990a.hashCode() * 31, 31, this.f139991b);
        String str = this.f139992c;
        return iC + (str == null ? 0 : str.hashCode());
    }
}
