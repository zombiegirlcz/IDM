package ms0;

import com.revolut.core.ui_kit.models.Clause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class s4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f208420a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f208421b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f208422c;
    public final boolean d;

    public s4(List icons, Clause label, int i, int i2) {
        icons = (i2 & 1) != 0 ? zhm.f0.f322471a : icons;
        i = (i2 & 4) != 0 ? 1 : i;
        boolean z = (i2 & 16) == 0;
        Intrinsics.checkNotNullParameter(icons, "icons");
        Intrinsics.checkNotNullParameter(label, "label");
        this.f208420a = icons;
        this.f208421b = label;
        this.f208422c = i;
        this.d = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof s4)) {
            return false;
        }
        s4 s4Var = (s4) obj2;
        return Intrinsics.f(this.f208420a, s4Var.f208420a) && Intrinsics.f(this.f208421b, s4Var.f208421b) && this.f208422c == s4Var.f208422c && this.d == s4Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + j6.a.b(this.f208422c, p.a.a(this.f208420a.hashCode() * 31, 31, this.f208421b), 961);
    }
}
