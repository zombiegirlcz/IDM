package et0;

import com.revolut.core.ui_kit_core.displayers.image.Image;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final cam.f f129028a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Image f129029b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f129030c;
    public final h0 d;
    public final m0 e;

    public g0(cam.f messagePosition, Image image, boolean z, h0 sideStatusBadge, m0 widthConstraint) {
        Intrinsics.checkNotNullParameter(messagePosition, "messagePosition");
        Intrinsics.checkNotNullParameter(sideStatusBadge, "sideStatusBadge");
        Intrinsics.checkNotNullParameter(widthConstraint, "widthConstraint");
        this.f129028a = messagePosition;
        this.f129029b = image;
        this.f129030c = z;
        this.d = sideStatusBadge;
        this.e = widthConstraint;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g0)) {
            return false;
        }
        g0 g0Var = (g0) obj2;
        return Intrinsics.f(this.f129028a, g0Var.f129028a) && Intrinsics.f(this.f129029b, g0Var.f129029b) && this.f129030c == g0Var.f129030c && Intrinsics.f(this.d, g0Var.d) && Intrinsics.f(this.e, g0Var.e);
    }

    public final int hashCode() {
        int iHashCode = this.f129028a.hashCode() * 31;
        Image image = this.f129029b;
        return this.e.hashCode() + ((this.d.hashCode() + j6.a.c((iHashCode + (image == null ? 0 : image.hashCode())) * 31, 31, this.f129030c)) * 31);
    }

    public /* synthetic */ g0(cam.f fVar, Image image, h0 h0Var, m0 m0Var, int i) {
        this(fVar, image, true, (i & 8) != 0 ? new h0(gw0.v.NONE, null) : h0Var, m0Var);
    }
}
