package jpl;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class b extends yji.d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final gjl.b f177321c;
    public RowDelegate d;

    public b(gjl.b connectedAppsControllerModelExtension) {
        Intrinsics.checkNotNullParameter(connectedAppsControllerModelExtension, "connectedAppsControllerModelExtension");
        this.f177321c = connectedAppsControllerModelExtension;
    }

    @Override // yji.d
    public final void M() {
        RowDelegate rowDelegate = this.d;
        if (rowDelegate != null) {
            yji.d.H(this, rd0.e.b(rowDelegate.f53218h), new a(this, null), 3);
        } else {
            Intrinsics.r("rowDelegate");
            throw null;
        }
    }
}
