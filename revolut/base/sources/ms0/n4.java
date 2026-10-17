package ms0;

import com.revolut.core.ui_kit.models.Clause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class n4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f208339a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f208340b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f208341c;
    public final m4 d;
    public final boolean e;

    public n4(Clause buttonTitle, boolean z, Integer num, m4 theme, boolean z3) {
        Intrinsics.checkNotNullParameter(buttonTitle, "buttonTitle");
        Intrinsics.checkNotNullParameter(theme, "theme");
        this.f208339a = buttonTitle;
        this.f208340b = z;
        this.f208341c = num;
        this.d = theme;
        this.e = z3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n4)) {
            return false;
        }
        n4 n4Var = (n4) obj2;
        return Intrinsics.f(this.f208339a, n4Var.f208339a) && this.f208340b == n4Var.f208340b && Intrinsics.f(this.f208341c, n4Var.f208341c) && this.d == n4Var.d && this.e == n4Var.e;
    }

    public final int hashCode() {
        int iC = j6.a.c(this.f208339a.hashCode() * 961, 31, this.f208340b);
        Integer num = this.f208341c;
        return Boolean.hashCode(this.e) + ((this.d.hashCode() + ((iC + (num == null ? 0 : num.hashCode())) * 31)) * 961);
    }
}
