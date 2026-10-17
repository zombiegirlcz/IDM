package akf;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes8.dex */
public final class j0 extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ g f5848w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(g gVar, Continuation continuation) {
        super(continuation);
        this.f5848w = gVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f5848w.emit(null, this);
    }
}
