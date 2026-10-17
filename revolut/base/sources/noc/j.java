package noc;

import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class j extends yji.d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f217985c;
    public final l d;

    public j(e delegates, l controllerModelExtension) {
        Intrinsics.checkNotNullParameter(delegates, "delegates");
        Intrinsics.checkNotNullParameter(controllerModelExtension, "controllerModelExtension");
        this.f217985c = delegates;
        this.d = controllerModelExtension;
    }

    @Override // yji.d
    public final void M() {
        e eVar = this.f217985c;
        ListSubheaderDelegate listSubheaderDelegate = eVar.f217978a;
        Continuation continuation = null;
        yji.d.H(this, rd0.e.b(te0.w.a0(listSubheaderDelegate.f52707c, new nnf.h(9))), new h(this, continuation, 0), 3);
        yji.d.H(this, rd0.e.b(te0.w.a0(listSubheaderDelegate.d, new nnf.h(10))), new h(this, continuation, 1), 3);
        efm.r rVarFilter = eVar.f217979b.d.f121375b.filter(new njf.c(new nnf.h(11), 15));
        Intrinsics.checkNotNullExpressionValue(rVarFilter, "filter(...)");
        yji.d.H(this, rd0.e.b(rVarFilter), new i(this, null), 3);
    }
}
