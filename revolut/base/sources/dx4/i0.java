package dx4;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class i0 implements e1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f120620a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f120621b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f120622c;
    public final String d;
    public final h0 e;

    public i0(String name, String title, String subtitle, String str, h0 h0Var) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        this.f120620a = name;
        this.f120621b = title;
        this.f120622c = subtitle;
        this.d = str;
        this.e = h0Var;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i0)) {
            return false;
        }
        i0 i0Var = (i0) obj2;
        return Intrinsics.f(this.f120620a, i0Var.f120620a) && Intrinsics.f(this.f120621b, i0Var.f120621b) && Intrinsics.f(this.f120622c, i0Var.f120622c) && Intrinsics.f(this.d, i0Var.d) && this.e == i0Var.e;
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(this.f120620a.hashCode() * 31, 31, this.f120621b), 31, this.f120622c);
        String str = this.d;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        h0 h0Var = this.e;
        return iHashCode + (h0Var != null ? h0Var.hashCode() : 0);
    }
}
