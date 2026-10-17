package sbb;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class r extends yji.n {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final uak.f f261557l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ihm.f f261558m;

    public r(uak.f pendingPaymentChecker) {
        Intrinsics.checkNotNullParameter(pendingPaymentChecker, "pendingPaymentChecker");
        this.f261557l = pendingPaymentChecker;
        this.f261558m = v0.a.d("create(...)");
    }

    @Override // yji.n
    public final void D2() {
        yji.n.j2(this, rd0.e.b(this.f261558m), null, new s1k.b(this, null, 22), 3);
    }

    @Override // yji.n
    public final void H2() {
        this.f261558m.onNext(Unit.f186387a);
    }
}
