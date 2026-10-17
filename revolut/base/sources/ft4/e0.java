package ft4;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes22.dex */
public final class e0 extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ fod.i f137901w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(fod.i iVar, Continuation continuation) {
        super(continuation);
        this.f137901w = iVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f137901w.emit(null, this);
    }
}
