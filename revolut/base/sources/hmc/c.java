package hmc;

import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class c extends yji.d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dlc.c f153629c;
    public final e d;

    public c(dlc.c delegates, e controllerModelExtension) {
        Intrinsics.checkNotNullParameter(delegates, "delegates");
        Intrinsics.checkNotNullParameter(controllerModelExtension, "controllerModelExtension");
        this.f153629c = delegates;
        this.d = controllerModelExtension;
    }

    @Override // yji.d
    public final void M() {
        dlc.c cVar = this.f153629c;
        Continuation continuation = null;
        yji.d.H(this, rd0.e.b(te0.w.a0(cVar.f115724a.f53218h, new hhd.n(29))), new b(this, continuation, 1), 3);
        yji.d.H(this, rd0.e.b(te0.w.a0(cVar.f115724a.f53218h, new a(0))), new b(this, continuation, 2), 3);
        yji.d.H(this, rd0.e.b(te0.w.a0(cVar.f115725b.f51821c, new a(1))), new b(this, continuation, 3), 3);
        LargeActionButtonDelegate largeActionButtonDelegate = cVar.f115726c;
        yji.d.H(this, rd0.e.b(te0.w.a0(largeActionButtonDelegate.d.f121375b, new a(2))), new hbg.h(this, continuation, 14), 3);
        yji.d.H(this, rd0.e.b(te0.w.a0(largeActionButtonDelegate.d.f121375b, new a(3))), new b(this, continuation, 0), 3);
    }
}
