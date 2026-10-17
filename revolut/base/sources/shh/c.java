package shh;

import chh.l;
import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class c extends chh.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final kge.d f263476c;
    public final l d;

    public c(kge.d screen, chh.b controllerModel) {
        Intrinsics.checkNotNullParameter(screen, "screen");
        Intrinsics.checkNotNullParameter(controllerModel, "controllerModel");
        this.f263476c = screen;
        this.d = controllerModel;
    }

    @Override // yji.d
    public final void M() {
        kge.d dVar = this.f263476c;
        yji.d.H(this, rd0.e.b(((CellDetailsChevronDelegate) dVar.f183974b).f51821c), new a(this, null), 3);
        yji.d.H(this, rd0.e.b(((RowDelegate) dVar.f183975c).f53218h), new b(this, null), 3);
    }
}
