package dx4;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class l3 implements e1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f120664a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f120665b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f120666c;
    public final a1 d;

    public l3(a1 icon, String id10, String title, String str) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(icon, "icon");
        this.f120664a = id10;
        this.f120665b = title;
        this.f120666c = str;
        this.d = icon;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l3)) {
            return false;
        }
        l3 l3Var = (l3) obj2;
        return Intrinsics.f(this.f120664a, l3Var.f120664a) && Intrinsics.f(this.f120665b, l3Var.f120665b) && Intrinsics.f(this.f120666c, l3Var.f120666c) && this.d == l3Var.d;
    }

    public final int hashCode() {
        int iC = p.a.c(this.f120664a.hashCode() * 31, 31, this.f120665b);
        String str = this.f120666c;
        return this.d.hashCode() + ((iC + (str == null ? 0 : str.hashCode())) * 31);
    }
}
