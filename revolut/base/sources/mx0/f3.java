package mx0;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class f3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Image f209692a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f209693b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f209694c;
    public final boolean d;
    public final h3 e;
    public final boolean f;

    public f3(Image image, Clause clause, Clause clause2, boolean z, h3 state, boolean z3) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.f209692a = image;
        this.f209693b = clause;
        this.f209694c = clause2;
        this.d = z;
        this.e = state;
        this.f = z3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f3)) {
            return false;
        }
        f3 f3Var = (f3) obj2;
        return Intrinsics.f(this.f209692a, f3Var.f209692a) && Intrinsics.f(this.f209693b, f3Var.f209693b) && Intrinsics.f(this.f209694c, f3Var.f209694c) && this.d == f3Var.d && this.e == f3Var.e && this.f == f3Var.f;
    }

    public final int hashCode() {
        Image image = this.f209692a;
        int iHashCode = (image == null ? 0 : image.hashCode()) * 31;
        Clause clause = this.f209693b;
        int iHashCode2 = (iHashCode + (clause == null ? 0 : clause.hashCode())) * 31;
        Clause clause2 = this.f209694c;
        return Boolean.hashCode(this.f) + ((this.e.hashCode() + j6.a.c((iHashCode2 + (clause2 != null ? clause2.hashCode() : 0)) * 31, 31, this.d)) * 31);
    }
}
