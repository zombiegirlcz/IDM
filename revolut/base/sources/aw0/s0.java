package aw0;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f10518a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f10519b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Image f10520c;
    public final boolean d;

    public s0(Clause clause, Image image, boolean z) {
        this.f10518a = clause;
        this.f10519b = true;
        this.f10520c = image;
        this.d = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof s0)) {
            return false;
        }
        s0 s0Var = (s0) obj2;
        return Intrinsics.f(this.f10518a, s0Var.f10518a) && this.f10519b == s0Var.f10519b && Intrinsics.f(this.f10520c, s0Var.f10520c) && this.d == s0Var.d;
    }

    public final int hashCode() {
        Clause clause = this.f10518a;
        int iC = j6.a.c((clause == null ? 0 : clause.hashCode()) * 31, 31, this.f10519b);
        Image image = this.f10520c;
        return Boolean.hashCode(this.d) + ((iC + (image != null ? image.hashCode() : 0)) * 31);
    }

    public /* synthetic */ s0(Clause clause, ResourceImage resourceImage, int i) {
        this(clause, (Image) ((i & 4) != 0 ? null : resourceImage), false);
    }
}
