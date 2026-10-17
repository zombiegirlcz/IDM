package cv3;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class q implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f109264a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f109265b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f109266c;
    public final String d;
    public final w e;

    public q(String title, String str, String tag2, String backgroundImage, w wVar) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(tag2, "tag");
        Intrinsics.checkNotNullParameter(backgroundImage, "backgroundImage");
        this.f109264a = title;
        this.f109265b = str;
        this.f109266c = tag2;
        this.d = backgroundImage;
        this.e = wVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q)) {
            return false;
        }
        q qVar = (q) obj2;
        return Intrinsics.f(this.f109264a, qVar.f109264a) && Intrinsics.f(this.f109265b, qVar.f109265b) && Intrinsics.f(this.f109266c, qVar.f109266c) && Intrinsics.f(this.d, qVar.d) && Intrinsics.f(this.e, qVar.e);
    }

    public final int hashCode() {
        int iHashCode = this.f109264a.hashCode() * 31;
        String str = this.f109265b;
        int iC = p.a.c(p.a.c((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f109266c), 31, this.d);
        w wVar = this.e;
        return iC + (wVar != null ? wVar.hashCode() : 0);
    }
}
