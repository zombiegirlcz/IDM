package g6k;

import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.TwinHorizontalButtonDelegate;
import kotlin.jvm.internal.Intrinsics;
import te0.w;
import zhm.v;

/* JADX INFO: loaded from: classes11.dex */
public final class e extends yji.d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j60.a f140987c;
    public final f d;
    public final InputTextDelegate e;
    public final TwinHorizontalButtonDelegate f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final LargeActionButtonDelegate f140988g;

    public e(j60.a bottomDialogExtension, f modelExtension) {
        Intrinsics.checkNotNullParameter(bottomDialogExtension, "bottomDialogExtension");
        Intrinsics.checkNotNullParameter(modelExtension, "modelExtension");
        this.f140987c = bottomDialogExtension;
        this.d = modelExtension;
        this.e = new InputTextDelegate(null);
        this.f = new TwinHorizontalButtonDelegate();
        this.f140988g = new LargeActionButtonDelegate();
    }

    @Override // yji.d
    public final void M() {
        TwinHorizontalButtonDelegate twinHorizontalButtonDelegate = this.f;
        yji.d.H(this, rd0.e.b(twinHorizontalButtonDelegate.f53572c.f121375b), new b(this, null, 0), 3);
        yji.d.H(this, rd0.e.b(w.a0(twinHorizontalButtonDelegate.d.f121375b, new g64.c(4))), new g06.k(this, null, 21), 3);
        yji.d.H(this, rd0.e.b(this.f140988g.d.f121375b), new c(this, null), 3);
        yji.d.H(this, rd0.e.b(this.e.e.f121375b), new d(this, null), 3);
        yji.d.H(this, rd0.e.b(this.f140987c.E()), new b(this, null, 1), 3);
    }

    @Override // yji.d
    public final void onCreate() {
        this.f140987c.d(v.k(this.e, this.f, this.f140988g));
    }
}
