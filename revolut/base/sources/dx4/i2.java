package dx4;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class i2 implements e1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f120623a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f120624b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a1 f120625c;
    public final l d;
    public final h2 e;

    public i2(String id10, String title, a1 icon, l action, h2 gradient) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(gradient, "gradient");
        this.f120623a = id10;
        this.f120624b = title;
        this.f120625c = icon;
        this.d = action;
        this.e = gradient;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i2)) {
            return false;
        }
        i2 i2Var = (i2) obj2;
        return Intrinsics.f(this.f120623a, i2Var.f120623a) && Intrinsics.f(this.f120624b, i2Var.f120624b) && this.f120625c == i2Var.f120625c && Intrinsics.f(this.d, i2Var.d) && this.e == i2Var.e;
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + ((this.f120625c.hashCode() + p.a.c(this.f120623a.hashCode() * 31, 31, this.f120624b)) * 31)) * 31);
    }
}
