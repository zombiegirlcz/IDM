package dx4;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class l2 implements e1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f120661a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f120662b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f120663c;
    public final String d;
    public final d1 e;
    public final l f;

    public l2(String id10, String title, String description, String str, d1 d1Var, l lVar) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        this.f120661a = id10;
        this.f120662b = title;
        this.f120663c = description;
        this.d = str;
        this.e = d1Var;
        this.f = lVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l2)) {
            return false;
        }
        l2 l2Var = (l2) obj2;
        return Intrinsics.f(this.f120661a, l2Var.f120661a) && Intrinsics.f(this.f120662b, l2Var.f120662b) && Intrinsics.f(this.f120663c, l2Var.f120663c) && Intrinsics.f(this.d, l2Var.d) && Intrinsics.f(this.e, l2Var.e) && Intrinsics.f(this.f, l2Var.f);
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(this.f120661a.hashCode() * 31, 31, this.f120662b), 31, this.f120663c);
        String str = this.d;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        d1 d1Var = this.e;
        int iHashCode2 = (iHashCode + (d1Var == null ? 0 : d1Var.hashCode())) * 31;
        l lVar = this.f;
        return iHashCode2 + (lVar != null ? lVar.hashCode() : 0);
    }
}
