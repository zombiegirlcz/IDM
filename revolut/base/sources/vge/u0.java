package vge;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: loaded from: classes8.dex */
public final class u0 implements qfe.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f289028a;

    public u0(d accountInteractor) {
        Intrinsics.checkNotNullParameter(accountInteractor, "accountInteractor");
        this.f289028a = accountInteractor;
    }

    @Override // dm2.a
    public final Flow a() {
        return vkm.q.q(nim.a.v(((x) this.f289028a).f(qfe.j.f245295a), new vga.g(13)));
    }
}
