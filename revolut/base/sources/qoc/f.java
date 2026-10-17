package qoc;

import com.revolut.core.ui_kit.delegates.ActionWidgetDelegate;
import com.revolut.core.ui_kit.delegates.InputSliderDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.SmallActionButtonDelegate;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class f extends yji.d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r f248119c;
    public final jlc.e d;
    public final j60.a e;

    public f(r modelExtension, jlc.e delegates, j60.a bottomExpandableDialogControllerExtension) {
        Intrinsics.checkNotNullParameter(modelExtension, "modelExtension");
        Intrinsics.checkNotNullParameter(delegates, "delegates");
        Intrinsics.checkNotNullParameter(bottomExpandableDialogControllerExtension, "bottomExpandableDialogControllerExtension");
        this.f248119c = modelExtension;
        this.d = delegates;
        this.e = bottomExpandableDialogControllerExtension;
    }

    @Override // yji.d
    public final void M() {
        ihm.f fVar;
        ihm.f fVar2;
        efm.r rVarA0;
        ihm.f fVar3;
        efm.r rVarA02;
        ihm.f fVar4;
        efm.r rVarA03;
        ihm.f fVar5;
        jlc.e eVar = this.d;
        efm.r rVarHide = eVar.f175677a.f52369c.hide();
        Intrinsics.checkNotNullExpressionValue(rVarHide, "hide(...)");
        efm.r rVarFilter = rVarHide.filter(new qmd.c(2, new qnd.c(5)));
        Intrinsics.checkNotNullExpressionValue(rVarFilter, "filter(...)");
        Continuation continuation = null;
        yji.d.H(this, rd0.e.b(rVarFilter), new c(this, continuation, 3), 3);
        yji.d.H(this, rd0.e.b(te0.w.a0(eVar.d.d, new qnd.c(6))), new c(this, continuation, 4), 3);
        InputSliderDelegate inputSliderDelegate = eVar.e;
        if (inputSliderDelegate != null && (fVar5 = inputSliderDelegate.f52559c) != null) {
            efm.r rVarFilter2 = fVar5.filter(new qmd.c(3, new qnd.c(7)));
            if (rVarFilter2 != null) {
                yji.d.H(this, rd0.e.b(rVarFilter2), new e(this, null), 3);
            }
        }
        if (inputSliderDelegate != null && (fVar4 = inputSliderDelegate.e) != null && (rVarA03 = te0.w.a0(fVar4, new qnd.c(8))) != null) {
            yji.d.H(this, rd0.e.b(rVarA03), new c(this, continuation, 5), 3);
        }
        SmallActionButtonDelegate smallActionButtonDelegate = eVar.f175680g;
        if (smallActionButtonDelegate != null && (fVar3 = smallActionButtonDelegate.f53336c.f121375b) != null && (rVarA02 = te0.w.a0(fVar3, new qnd.c(9))) != null) {
            yji.d.H(this, rd0.e.b(rVarA02), new c(this, continuation, 0), 3);
        }
        LargeActionButtonDelegate largeActionButtonDelegate = eVar.f;
        if (largeActionButtonDelegate != null && (fVar2 = largeActionButtonDelegate.d.f121375b) != null && (rVarA0 = te0.w.a0(fVar2, new qnd.c(10))) != null) {
            yji.d.H(this, rd0.e.b(rVarA0), new c(this, continuation, 1), 3);
        }
        yji.d.H(this, rd0.e.b(te0.w.a0(this.e.C(), new qnd.c(11))), new c(this, continuation, 2), 3);
        ActionWidgetDelegate actionWidgetDelegate = eVar.f175681h;
        if (actionWidgetDelegate == null || (fVar = actionWidgetDelegate.f51589c.f121375b) == null) {
            return;
        }
        yji.d.H(this, rd0.e.b(fVar), new d(this, null), 3);
    }
}
