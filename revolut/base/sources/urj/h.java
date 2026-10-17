package urj;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes11.dex */
public final class h extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ urd.m f282329w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(urd.m mVar, Continuation continuation) {
        super(continuation);
        this.f282329w = mVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f282329w.emit(null, this);
    }
}
