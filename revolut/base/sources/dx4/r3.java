package dx4;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class r3 implements e1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f120748a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f120749b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f120750c;
    public final String d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final l f120751g;

    public r3(String id10, String header, String title, String titleExtra, String str, String footer, l lVar) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(titleExtra, "titleExtra");
        Intrinsics.checkNotNullParameter(footer, "footer");
        this.f120748a = id10;
        this.f120749b = header;
        this.f120750c = title;
        this.d = titleExtra;
        this.e = str;
        this.f = footer;
        this.f120751g = lVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r3)) {
            return false;
        }
        r3 r3Var = (r3) obj2;
        return Intrinsics.f(this.f120748a, r3Var.f120748a) && Intrinsics.f(this.f120749b, r3Var.f120749b) && Intrinsics.f(this.f120750c, r3Var.f120750c) && Intrinsics.f(this.d, r3Var.d) && Intrinsics.f(this.e, r3Var.e) && Intrinsics.f(this.f, r3Var.f) && Intrinsics.f(this.f120751g, r3Var.f120751g);
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(p.a.c(this.f120748a.hashCode() * 31, 31, this.f120749b), 31, this.f120750c), 31, this.d);
        String str = this.e;
        int iC2 = p.a.c((iC + (str == null ? 0 : str.hashCode())) * 31, 31, this.f);
        l lVar = this.f120751g;
        return iC2 + (lVar != null ? lVar.hashCode() : 0);
    }
}
