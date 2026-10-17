package g23;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes21.dex */
public final class i0 extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ fod.i f139801w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(fod.i iVar, Continuation continuation) {
        super(continuation);
        this.f139801w = iVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f139801w.emit(null, this);
    }
}
