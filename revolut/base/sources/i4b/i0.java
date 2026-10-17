package i4b;

import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CellDetailsActionDelegate f158346a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CellDetailsDelegate f158347b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LargeActionButtonDelegate f158348c;

    public i0(CellDetailsActionDelegate cellDetailsActionDelegate, CellDetailsDelegate cellDetailsDelegate, LargeActionButtonDelegate largeActionButtonDelegate) {
        Intrinsics.checkNotNullParameter(cellDetailsActionDelegate, "cellDetailsActionDelegate");
        Intrinsics.checkNotNullParameter(cellDetailsDelegate, "cellDetailsDelegate");
        Intrinsics.checkNotNullParameter(largeActionButtonDelegate, "largeActionButtonDelegate");
        this.f158346a = cellDetailsActionDelegate;
        this.f158347b = cellDetailsDelegate;
        this.f158348c = largeActionButtonDelegate;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i0)) {
            return false;
        }
        i0 i0Var = (i0) obj2;
        return Intrinsics.f(this.f158346a, i0Var.f158346a) && Intrinsics.f(this.f158347b, i0Var.f158347b) && Intrinsics.f(this.f158348c, i0Var.f158348c);
    }

    public final int hashCode() {
        return this.f158348c.hashCode() + ((this.f158347b.hashCode() + (this.f158346a.hashCode() * 31)) * 31);
    }
}
