package yy0;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class k implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Image f317756a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f317757b;

    public k(Clause clause, Image image) {
        Intrinsics.checkNotNullParameter(image, "image");
        this.f317756a = image;
        this.f317757b = clause;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f317756a, kVar.f317756a) && Intrinsics.f(this.f317757b, kVar.f317757b);
    }

    @Override // oy0.b
    /* JADX INFO: renamed from: getContentDescription */
    public final Clause getD() {
        return this.f317757b;
    }

    @Override // yy0.l
    public final Image getImage() {
        return this.f317756a;
    }

    public final int hashCode() {
        int iHashCode = this.f317756a.hashCode() * 31;
        Clause clause = this.f317757b;
        return iHashCode + (clause == null ? 0 : clause.hashCode());
    }
}
