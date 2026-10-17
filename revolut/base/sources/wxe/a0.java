package wxe;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class a0 implements d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextClause f300893a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f300894b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Image f300895c;
    public final int d;
    public final au0.c0 e;
    public final int f;

    public a0(TextClause title, Clause description, Image endIcon, int i, au0.c0 descriptionClickable, int i2) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(endIcon, "endIcon");
        Intrinsics.checkNotNullParameter(descriptionClickable, "descriptionClickable");
        this.f300893a = title;
        this.f300894b = description;
        this.f300895c = endIcon;
        this.d = i;
        this.e = descriptionClickable;
        this.f = i2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj2;
        return this.f300893a.equals(a0Var.f300893a) && this.f300894b.equals(a0Var.f300894b) && this.f300895c.equals(a0Var.f300895c) && this.d == a0Var.d && this.e == a0Var.e && this.f == a0Var.f;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f) + ((this.e.hashCode() + j6.a.b(this.d, a10.b.c(this.f300895c, p.a.b(this.f300893a.hashCode() * 31, 31, this.f300894b), 31), 31)) * 31);
    }
}
