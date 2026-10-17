package b6i;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f12778a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f12779b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f12780c;
    public final boolean d;
    public final Image e;

    public f(boolean z, Clause clause, boolean z3, boolean z4, ResourceImage resourceImage) {
        this.f12778a = z;
        this.f12779b = clause;
        this.f12780c = z3;
        this.d = z4;
        this.e = resourceImage;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return this.f12778a == fVar.f12778a && Intrinsics.f(this.f12779b, fVar.f12779b) && this.f12780c == fVar.f12780c && this.d == fVar.d && Intrinsics.f(this.e, fVar.e);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f12778a) * 31;
        Clause clause = this.f12779b;
        int iC = j6.a.c(j6.a.c((iHashCode + (clause == null ? 0 : clause.hashCode())) * 31, 31, this.f12780c), 31, this.d);
        Image image = this.e;
        return iC + (image != null ? image.hashCode() : 0);
    }
}
