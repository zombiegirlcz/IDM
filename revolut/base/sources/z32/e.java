package z32;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes20.dex */
public final class e extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ yuc.d f319125w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(yuc.d dVar, Continuation continuation) {
        super(continuation);
        this.f319125w = dVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f319125w.emit(null, this);
    }
}
