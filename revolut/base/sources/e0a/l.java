package e0a;

import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;
import vkm.z1;

/* JADX INFO: loaded from: classes5.dex */
public final class l extends yji.n {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final j9i.d f121506l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final n60.b f121507m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final cw9.d f121508n;
    public final j2 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final z1 f121509p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final z1 f121510q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final j2 f121511r;

    public l(j9i.d reactionsKeyboardViewExtension, n60.b keyboardViewExtension, cw9.d paymentsProductFeatureChecker) {
        Intrinsics.checkNotNullParameter(reactionsKeyboardViewExtension, "reactionsKeyboardViewExtension");
        Intrinsics.checkNotNullParameter(keyboardViewExtension, "keyboardViewExtension");
        Intrinsics.checkNotNullParameter(paymentsProductFeatureChecker, "paymentsProductFeatureChecker");
        this.f121506l = reactionsKeyboardViewExtension;
        this.f121507m = keyboardViewExtension;
        this.f121508n = paymentsProductFeatureChecker;
        this.o = vkm.q.c(fu9.a.REACTIONS_KEYBOARD);
        this.f121509p = vkm.q.b(0, 7, null);
        this.f121510q = vkm.q.b(0, 7, null);
        this.f121511r = vkm.q.c(zz9.s.DISABLED);
    }

    @Override // yji.n
    public final void D2() {
        efm.r rVarDistinctUntilChanged = this.f121506l.d.o.distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(rVarDistinctUntilChanged, "distinctUntilChanged(...)");
        Continuation continuation = null;
        yji.n.j2(this, rd0.e.b(rVarDistinctUntilChanged), null, new j(this, continuation, 0), 3);
        efm.r rVarDistinctUntilChanged2 = this.f121507m.d.distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(rVarDistinctUntilChanged2, "distinctUntilChanged(...)");
        yji.n.j2(this, rd0.e.b(rVarDistinctUntilChanged2), null, new j(this, continuation, 1), 3);
    }
}
