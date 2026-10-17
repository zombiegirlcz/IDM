package r4k;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes11.dex */
public final class b0 extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ qx4.b f251474w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(qx4.b bVar, Continuation continuation) {
        super(continuation);
        this.f251474w = bVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f251474w.emit(null, this);
    }
}
