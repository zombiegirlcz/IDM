package etk;

import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class g extends yji.d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dtk.d f129449c;
    public final dtk.b d;

    public g(dtk.d delegates, dtk.b controllerModelExtension) {
        Intrinsics.checkNotNullParameter(delegates, "delegates");
        Intrinsics.checkNotNullParameter(controllerModelExtension, "controllerModelExtension");
        this.f129449c = delegates;
        this.d = controllerModelExtension;
    }

    @Override // yji.d
    public final void M() {
        dtk.d dVar = this.f129449c;
        ListSubheaderDelegate listSubheaderDelegate = dVar.f117464b;
        yji.d.H(this, new eq8.g(rd0.e.b(listSubheaderDelegate.f52707c), 9), new f(this, null, 0), 3);
        yji.d.H(this, new eq8.g(rd0.e.b(listSubheaderDelegate.d), 10), new f(this, null, 1), 3);
        yji.d.H(this, new eq8.g(rd0.e.b(dVar.f117463a.d), 11), new f(this, null, 2), 3);
    }
}
