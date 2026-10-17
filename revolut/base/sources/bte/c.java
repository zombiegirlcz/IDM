package bte;

import ate.e;
import ihm.f;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import vkm.q;
import vkm.q0;
import zhm.h0;

/* JADX INFO: loaded from: classes8.dex */
public final class c implements a, CoroutineScope {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CoroutineScope f18566a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f18567b;

    public c(CoroutineScope scope, e appTipsInteractor) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(appTipsInteractor, "appTipsInteractor");
        this.f18566a = scope;
        this.f18567b = appTipsInteractor;
    }

    @Override // kotlinx.coroutines.CoroutineScope
    public final CoroutineContext getCoroutineContext() {
        return this.f18566a.getCoroutineContext();
    }

    @Override // bte.a
    public final void start() {
        q.G(rd0.e.d(new q0(rd0.e.b((f) xv0.b.f309146a.getValue()), new btd.e(this, null, 1), 1), h0.f322473a), this.f18566a);
    }
}
