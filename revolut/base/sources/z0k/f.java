package z0k;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes11.dex */
public final class f extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ yuc.d f318628w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(yuc.d dVar, Continuation continuation) {
        super(continuation);
        this.f318628w = dVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f318628w.emit(null, this);
    }
}
