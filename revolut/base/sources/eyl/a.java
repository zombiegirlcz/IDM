package eyl;

import com.revolut.core.ui_kit.models.Clause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f130874a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f130875b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f130876c;
    public final int d;
    public final int e;
    public final boolean f;

    public a(Clause text, b style, int i, int i2, int i3) {
        style = (i3 & 2) != 0 ? b.BODY_2 : style;
        i2 = (i3 & 16) != 0 ? Integer.MAX_VALUE : i2;
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(style, "style");
        this.f130874a = text;
        this.f130875b = style;
        this.f130876c = i;
        this.d = 4;
        this.e = i2;
        this.f = true;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f130874a, aVar.f130874a) && this.f130875b == aVar.f130875b && this.f130876c == aVar.f130876c && this.d == aVar.d && this.e == aVar.e && this.f == aVar.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + j6.a.b(this.e, j6.a.b(this.d, j6.a.b(this.f130876c, (this.f130875b.hashCode() + (this.f130874a.hashCode() * 31)) * 31, 31), 31), 31);
    }
}
