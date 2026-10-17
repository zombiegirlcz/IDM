package ip0;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class ql extends ul {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Image f166013a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f166014b;

    public ql(int i, Clause clause, Image image) {
        clause = (i & 2) != 0 ? null : clause;
        Intrinsics.checkNotNullParameter(image, "image");
        this.f166013a = image;
        this.f166014b = clause;
    }

    @Override // ip0.ul
    public final Integer a() {
        return null;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ql)) {
            return false;
        }
        ql qlVar = (ql) obj2;
        return this.f166013a.equals(qlVar.f166013a) && Intrinsics.f(this.f166014b, qlVar.f166014b);
    }

    @Override // oy0.b
    /* JADX INFO: renamed from: getContentDescription */
    public final Clause getD() {
        return this.f166014b;
    }

    public final int hashCode() {
        int iHashCode = this.f166013a.hashCode() * 31;
        Clause clause = this.f166014b;
        return (iHashCode + (clause == null ? 0 : clause.hashCode())) * 31;
    }
}
