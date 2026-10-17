package rvf;

import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import kotlin.jvm.internal.Intrinsics;
import ru6.r;
import te0.w;
import zhm.u;

/* JADX INFO: loaded from: classes9.dex */
public final class c extends yji.d implements a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j60.a f257772c;
    public final d d;
    public final LargeActionButtonDelegate e;

    public c(j60.a bottomDialogExtension, d modelExtension) {
        Intrinsics.checkNotNullParameter(bottomDialogExtension, "bottomDialogExtension");
        Intrinsics.checkNotNullParameter(modelExtension, "modelExtension");
        this.f257772c = bottomDialogExtension;
        this.d = modelExtension;
        this.e = new LargeActionButtonDelegate();
    }

    @Override // yji.d
    public final void M() {
        yji.d.H(this, rd0.e.b(this.f257772c.E()), new rlh.c(this, null, 21), 3);
        yji.d.H(this, rd0.e.b(w.a0(this.e.d.f121375b, new r(9))), new b(this, null), 3);
    }

    @Override // yji.d
    public final void onCreate() {
        this.f257772c.d(u.c(this.e));
    }
}
