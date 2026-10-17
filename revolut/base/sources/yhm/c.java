package yhm;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes14.dex */
public final class c extends b implements Continuation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public slm.y f314185a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Unit f314186b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Continuation f314187c;
    public Object d;

    @Override // kotlin.coroutines.Continuation
    public final CoroutineContext getContext() {
        return kotlin.coroutines.g.f186406a;
    }

    @Override // kotlin.coroutines.Continuation
    public final void resumeWith(Object obj2) {
        this.f314187c = null;
        this.d = obj2;
    }
}
