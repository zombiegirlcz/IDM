package awk;

import au6.e2;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import efm.r;
import kotlin.jvm.internal.Intrinsics;
import te0.w;

/* JADX INFO: loaded from: classes12.dex */
public final class i extends yji.d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l f10803c;
    public final a d;

    public i(l controllerModelExtension, a delegates) {
        Intrinsics.checkNotNullParameter(controllerModelExtension, "controllerModelExtension");
        Intrinsics.checkNotNullParameter(delegates, "delegates");
        this.f10803c = controllerModelExtension;
        this.d = delegates;
    }

    @Override // yji.d
    public final void M() {
        RowDelegate rowDelegate = this.d.f10794a;
        r rVarMergeWith = rowDelegate.f53218h.mergeWith(rowDelegate.k);
        Intrinsics.checkNotNullExpressionValue(rVarMergeWith, "mergeWith(...)");
        yji.d.H(this, rd0.e.b(w.a0(rVarMergeWith, new e2(27))), new avk.i(this, null, 5), 3);
    }
}
