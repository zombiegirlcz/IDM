package pkf;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes8.dex */
public final class b extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ nvk.v f237022w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(nvk.v vVar, Continuation continuation) {
        super(continuation);
        this.f237022w = vVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f237022w.emit(null, this);
    }
}
