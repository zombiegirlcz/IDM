package oge;

import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import nya.i0;
import org.jetbrains.annotations.NotNull;
import vge.t3;
import vge.z2;
import vkm.q;
import yji.n;

/* JADX INFO: loaded from: classes8.dex */
public final class f extends n {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final z2 f225132l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final zge.a f225133m;

    public f(z2 productAccountsInteractor, zge.a accountNotificationInteractor) {
        Intrinsics.checkNotNullParameter(productAccountsInteractor, "productAccountsInteractor");
        Intrinsics.checkNotNullParameter(accountNotificationInteractor, "accountNotificationInteractor");
        this.f225132l = productAccountsInteractor;
        this.f225133m = accountNotificationInteractor;
    }

    @Override // yji.n
    public final void H2() {
        n.l2(this, mo3.a.g(q.j(((t3) this.f225132l).g(), -1, 2), null, null, 3), null, new i0(this, (Continuation) null, 28), 3);
    }
}
