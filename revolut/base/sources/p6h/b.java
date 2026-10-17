package p6h;

import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import kotlin.jvm.internal.Intrinsics;
import zjh.i;

/* JADX INFO: loaded from: classes9.dex */
public final class b extends u5h.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i f233309c;
    public final u5h.b d;

    public b(i screen, u5h.b controllerModel) {
        Intrinsics.checkNotNullParameter(screen, "screen");
        Intrinsics.checkNotNullParameter(controllerModel, "controllerModel");
        this.f233309c = screen;
        this.d = controllerModel;
    }

    @Override // yji.d
    public final void M() {
        yji.d.H(this, rd0.e.b(((CellDetailsActionDelegate) this.f233309c.f322838b).d), new a(2, 4, u5h.b.class, this.d, "onCellDetailActionClicked", "onCellDetailActionClicked(Lcom/revolut/core/ui_kit/delegates/CellDetailsActionDelegate$Model;)V"), 3);
    }
}
