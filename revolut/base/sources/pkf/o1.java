package pkf;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes8.dex */
public final class o1 extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ g f237103w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o1(g gVar, Continuation continuation) {
        super(continuation);
        this.f237103w = gVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f237103w.emit(null, this);
    }
}
