package ob8;

import kotlin.jvm.internal.Intrinsics;
import nuh.j;
import rd0.e;
import v60.i;
import yji.n;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends mb8.a {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final sb8.a f223891l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final yb8.a f223892m;

    public a(sb8.a juniorAllowanceShotDialogEventsProvider, yb8.a juniorAllowanceShotDialogProvider) {
        Intrinsics.checkNotNullParameter(juniorAllowanceShotDialogEventsProvider, "juniorAllowanceShotDialogEventsProvider");
        Intrinsics.checkNotNullParameter(juniorAllowanceShotDialogProvider, "juniorAllowanceShotDialogProvider");
        this.f223891l = juniorAllowanceShotDialogEventsProvider;
        this.f223892m = juniorAllowanceShotDialogProvider;
    }

    @Override // yji.n
    public final void D2() {
        i deletionSubject = this.f223891l.f261515b;
        Intrinsics.checkNotNullExpressionValue(deletionSubject, "deletionSubject");
        n.j2(this, e.b(deletionSubject), null, new j(this, null, 25), 3);
    }
}
