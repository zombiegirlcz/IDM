package g1k;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes11.dex */
public final class o extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ fod.i f139706w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(fod.i iVar, Continuation continuation) {
        super(continuation);
        this.f139706w = iVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f139706w.emit(null, this);
    }
}
