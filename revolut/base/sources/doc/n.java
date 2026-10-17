package doc;

import com.revolut.core.ui_kit.delegates.FixedTabsDelegate;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.core.ui_kit.delegates.TagDelegate;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class n extends yji.d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t f116510c;
    public final g d;

    public n(t controllerModelExtension, g delegates) {
        Intrinsics.checkNotNullParameter(controllerModelExtension, "controllerModelExtension");
        Intrinsics.checkNotNullParameter(delegates, "delegates");
        this.f116510c = controllerModelExtension;
        this.d = delegates;
    }

    @Override // yji.d
    public final void M() {
        ihm.f fVar;
        efm.r rVarA0;
        efm.r rVarR;
        efm.r rVarA02;
        g gVar = this.d;
        Continuation continuation = null;
        yji.d.H(this, rd0.e.b(gVar.f116497a.r()), new l(this, null), 3);
        foc.j jVar = new foc.j();
        FixedTabsDelegate fixedTabsDelegate = gVar.f;
        yji.d.H(this, new dmj.k(rd0.e.b(fixedTabsDelegate.f52339c.f121375b), 3), new chf.a(jVar, this, continuation, 15), 3);
        yji.d.H(this, rd0.e.b(te0.w.a0(fixedTabsDelegate.d.f121375b, new dmj.a(14))), new m(this, continuation, 0), 3);
        SelectableDelegate selectableDelegate = gVar.f116501h;
        if (selectableDelegate != null && (rVarR = selectableDelegate.r()) != null && (rVarA02 = te0.w.a0(rVarR, new dmj.a(15))) != null) {
            yji.d.H(this, rd0.e.b(rVarA02), new m(this, continuation, 1), 3);
        }
        TagDelegate tagDelegate = gVar.e;
        if (tagDelegate == null || (fVar = tagDelegate.d) == null || (rVarA0 = te0.w.a0(fVar, new dmj.a(16))) == null) {
            return;
        }
        yji.d.H(this, rd0.e.b(rVarA0), new m(this, continuation, 2), 3);
    }
}
