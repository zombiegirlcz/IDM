package nsh;

import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.core.ui_kit.delegates.ProgressStepsDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.delegates.TwinHorizontalButtonDelegate;
import kotlin.jvm.internal.Intrinsics;
import te0.w;
import wm.b;
import zhm.v;

/* JADX INFO: loaded from: classes10.dex */
public final class p extends ash.h {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final j60.c f218898l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final RowDelegate f218899m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final LargeActionButtonDelegate f218900n;
    public final ifm.b o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final CellDetailsDelegate f218901p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final TwinHorizontalButtonDelegate f218902q;

    public p(j60.c bottomDialogExtension) {
        Intrinsics.checkNotNullParameter(bottomDialogExtension, "bottomDialogExtension");
        this.f218898l = bottomDialogExtension;
        this.f218899m = new RowDelegate(null, null, 7);
        this.f218900n = new LargeActionButtonDelegate();
        this.o = new ifm.b();
        this.f218901p = new CellDetailsDelegate();
        this.f218902q = new TwinHorizontalButtonDelegate();
    }

    @Override // yji.n
    public final void D2() {
        this.f218898l.d(v.k(this.f218899m, this.f218900n, new PlainTextDelegate(), new TextDelegate(), new ProgressStepsDelegate(), this.f218901p, this.f218902q));
    }

    @Override // yji.n
    public final void E2() {
        this.o.d();
    }

    @Override // qm.a
    /* JADX INFO: renamed from: Z2, reason: merged with bridge method [inline-methods] */
    public final void D(wm.b payload) {
        Intrinsics.checkNotNullParameter(payload, "payload");
        boolean z = payload instanceof b.a;
        j60.c cVar = this.f218898l;
        if (z) {
            j60.a.v(cVar, false, null, 2);
            return;
        }
        if (payload instanceof wm.c) {
            cVar.x(((wm.c) payload).f298572a);
        } else {
            if (!(payload instanceof wm.d)) {
                throw new IllegalArgumentException("Unsupported state!");
            }
            w.j0(this.o, cVar.G(((wm.d) payload).f298573a).v());
        }
    }

    @Override // qm.a
    public final efm.b c0(Object obj2) {
        wm.b payload = (wm.b) obj2;
        Intrinsics.checkNotNullParameter(payload, "payload");
        pfm.h hVar = new pfm.h(new ne0.o(this, payload, 5), 2);
        Intrinsics.checkNotNullExpressionValue(hVar, "fromAction(...)");
        return hVar;
    }
}
