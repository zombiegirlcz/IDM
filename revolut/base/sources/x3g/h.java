package x3g;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f302748a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f302749b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final double f302750c;
    public final List d;
    public final String e;

    public h(String experienceId, int i, double d, List reviews, String str) {
        Intrinsics.checkNotNullParameter(experienceId, "experienceId");
        Intrinsics.checkNotNullParameter(reviews, "reviews");
        this.f302748a = experienceId;
        this.f302749b = i;
        this.f302750c = d;
        this.d = reviews;
        this.e = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f302748a, hVar.f302748a) && this.f302749b == hVar.f302749b && Double.compare(this.f302750c, hVar.f302750c) == 0 && Intrinsics.f(this.d, hVar.d) && Intrinsics.f(this.e, hVar.e);
    }

    public final int hashCode() {
        int iD = p.a.d(m72.b.c(j6.a.b(this.f302749b, this.f302748a.hashCode() * 31, 31), this.f302750c, 31), 31, this.d);
        String str = this.e;
        return iD + (str == null ? 0 : str.hashCode());
    }
}
