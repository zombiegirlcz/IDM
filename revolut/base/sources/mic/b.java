package mic;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes6.dex */
public final class b extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ mhd.f f205653w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(mhd.f fVar, Continuation continuation) {
        super(continuation);
        this.f205653w = fVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f205653w.emit(null, this);
    }
}
