package m1c;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class j1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i1 f201379a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Image f201380b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f201381c;
    public final TextLocalisedClause d;
    public final boolean e;

    public j1(i1 productId, Image image, Clause title, TextLocalisedClause subtitle, boolean z) {
        Intrinsics.checkNotNullParameter(productId, "productId");
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        this.f201379a = productId;
        this.f201380b = image;
        this.f201381c = title;
        this.d = subtitle;
        this.e = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j1)) {
            return false;
        }
        j1 j1Var = (j1) obj2;
        return this.f201379a == j1Var.f201379a && this.f201380b.equals(j1Var.f201380b) && this.f201381c.equals(j1Var.f201381c) && this.d.equals(j1Var.d) && this.e == j1Var.e;
    }

    public final int hashCode() {
        return j6.a.c(t61.a.a(p.a.b(a10.b.c(this.f201380b, this.f201379a.hashCode() * 31, 31), 31, this.f201381c), 31, this.d), 31, this.e);
    }
}
