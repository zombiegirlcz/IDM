package dx4;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class m4 implements e1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f120680a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f120681b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f120682c;
    public final boolean d;
    public final String e;

    public m4(String id10, String title, String str, String parameterKey, boolean z) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(parameterKey, "parameterKey");
        this.f120680a = id10;
        this.f120681b = title;
        this.f120682c = str;
        this.d = z;
        this.e = parameterKey;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m4)) {
            return false;
        }
        m4 m4Var = (m4) obj2;
        return Intrinsics.f(this.f120680a, m4Var.f120680a) && Intrinsics.f(this.f120681b, m4Var.f120681b) && Intrinsics.f(this.f120682c, m4Var.f120682c) && this.d == m4Var.d && Intrinsics.f(this.e, m4Var.e);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f120680a.hashCode() * 31, 31, this.f120681b);
        String str = this.f120682c;
        return this.e.hashCode() + j6.a.c((iC + (str == null ? 0 : str.hashCode())) * 31, 31, this.d);
    }
}
