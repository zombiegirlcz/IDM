package dx4;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class y4 implements e1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f120854a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f120855b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f120856c;
    public final d1 d;

    public y4(String id10, String title, String str, d1 image) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(image, "image");
        this.f120854a = id10;
        this.f120855b = title;
        this.f120856c = str;
        this.d = image;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof y4)) {
            return false;
        }
        y4 y4Var = (y4) obj2;
        return Intrinsics.f(this.f120854a, y4Var.f120854a) && Intrinsics.f(this.f120855b, y4Var.f120855b) && Intrinsics.f(this.f120856c, y4Var.f120856c) && Intrinsics.f(this.d, y4Var.d);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f120854a.hashCode() * 31, 31, this.f120855b);
        String str = this.f120856c;
        return this.d.hashCode() + ((iC + (str == null ? 0 : str.hashCode())) * 31);
    }
}
