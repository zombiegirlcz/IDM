package aw0;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f10536a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Image f10537b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f10538c;
    public final boolean d;
    public final boolean e;

    public /* synthetic */ t0(Clause clause, Image image, int i, boolean z, int i2) {
        this(clause, (i2 & 2) != 0 ? null : image, (i2 & 4) != 0 ? 2 : i, (i2 & 8) != 0 ? false : z, false);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof t0)) {
            return false;
        }
        t0 t0Var = (t0) obj2;
        return Intrinsics.f(this.f10536a, t0Var.f10536a) && Intrinsics.f(this.f10537b, t0Var.f10537b) && this.f10538c == t0Var.f10538c && this.d == t0Var.d && this.e == t0Var.e;
    }

    public final int hashCode() {
        int iHashCode = this.f10536a.hashCode() * 31;
        Image image = this.f10537b;
        return Boolean.hashCode(this.e) + j6.a.c(j6.a.b(this.f10538c, (iHashCode + (image == null ? 0 : image.hashCode())) * 31, 31), 31, this.d);
    }

    public t0(Clause label, Image image, int i, boolean z, boolean z3) {
        Intrinsics.checkNotNullParameter(label, "label");
        this.f10536a = label;
        this.f10537b = image;
        this.f10538c = i;
        this.d = z;
        this.e = z3;
    }
}
