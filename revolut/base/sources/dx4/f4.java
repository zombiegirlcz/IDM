package dx4;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class f4 implements e1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f120595a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f120596b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4 f120597c;
    public final String d;
    public final String e;
    public final q f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final l f120598g;

    public f4(String name, String title, e4 titleStyle, String str, String buttonText, q qVar, l lVar) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(titleStyle, "titleStyle");
        Intrinsics.checkNotNullParameter(buttonText, "buttonText");
        this.f120595a = name;
        this.f120596b = title;
        this.f120597c = titleStyle;
        this.d = str;
        this.e = buttonText;
        this.f = qVar;
        this.f120598g = lVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f4)) {
            return false;
        }
        f4 f4Var = (f4) obj2;
        return Intrinsics.f(this.f120595a, f4Var.f120595a) && Intrinsics.f(this.f120596b, f4Var.f120596b) && this.f120597c == f4Var.f120597c && Intrinsics.f(this.d, f4Var.d) && Intrinsics.f(this.e, f4Var.e) && this.f == f4Var.f && Intrinsics.f(this.f120598g, f4Var.f120598g);
    }

    public final int hashCode() {
        int iHashCode = (this.f120597c.hashCode() + p.a.c(this.f120595a.hashCode() * 31, 31, this.f120596b)) * 31;
        String str = this.d;
        int iC = p.a.c((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.e);
        q qVar = this.f;
        int iHashCode2 = (iC + (qVar == null ? 0 : qVar.hashCode())) * 31;
        l lVar = this.f120598g;
        return iHashCode2 + (lVar != null ? lVar.hashCode() : 0);
    }
}
