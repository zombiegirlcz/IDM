package ry4;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import java.util.List;
import jki.n;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class f implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f258217a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f258218b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f258219c;
    public final Image d;
    public final List e;

    public f(Clause toolbarTitle, Clause clause, int i, Image toolbarEndImage, aim.e items) {
        Intrinsics.checkNotNullParameter(toolbarTitle, "toolbarTitle");
        Intrinsics.checkNotNullParameter(toolbarEndImage, "toolbarEndImage");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f258217a = toolbarTitle;
        this.f258218b = clause;
        this.f258219c = i;
        this.d = toolbarEndImage;
        this.e = items;
    }

    @Override // jki.n
    public final List c() {
        return this.e;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f258217a, fVar.f258217a) && Intrinsics.f(this.f258218b, fVar.f258218b) && this.f258219c == fVar.f258219c && Intrinsics.f(this.d, fVar.d) && Intrinsics.f(this.e, fVar.e);
    }

    public final int hashCode() {
        int iHashCode = this.f258217a.hashCode() * 31;
        Clause clause = this.f258218b;
        return this.e.hashCode() + a10.b.c(this.d, j6.a.b(this.f258219c, (iHashCode + (clause == null ? 0 : clause.hashCode())) * 31, 31), 31);
    }
}
