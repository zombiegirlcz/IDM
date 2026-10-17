package mkk;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes11.dex */
public final class n extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ mhd.f f206492w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(mhd.f fVar, Continuation continuation) {
        super(continuation);
        this.f206492w = fVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f206492w.emit(null, this);
    }
}
