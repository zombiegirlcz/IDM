package w4k;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class p extends yji.n implements l {

    @NotNull
    public static final m Companion = new m();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final j60.a f294623l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final q06.l f294624m;

    public p(j60.a bottomDialog, q06.l deeplinkRouter) {
        Intrinsics.checkNotNullParameter(bottomDialog, "bottomDialog");
        Intrinsics.checkNotNullParameter(deeplinkRouter, "deeplinkRouter");
        this.f294623l = bottomDialog;
        this.f294624m = deeplinkRouter;
    }

    @Override // yji.n
    public final void H2() {
        yji.n.l2(this, rd0.e.b(this.f294623l.C()), null, new vrl.d(this, null, 29), 3);
    }
}
