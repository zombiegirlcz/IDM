package x6h;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class b extends y5h.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final zjh.c f303099c;
    public final y5h.b d;

    public b(zjh.c screen, y5h.b controllerModel) {
        Intrinsics.checkNotNullParameter(screen, "screen");
        Intrinsics.checkNotNullParameter(controllerModel, "controllerModel");
        this.f303099c = screen;
        this.d = controllerModel;
    }

    @Override // yji.d
    public final void M() {
        yji.d.H(this, rd0.e.b(((RowDelegate) this.f303099c.f322830b).f53218h), new a(2, 4, y5h.b.class, this.d, "onRowClicked", "onRowClicked(Lcom/revolut/core/ui_kit/delegates/RowDelegate$Model;)V"), 3);
    }
}
