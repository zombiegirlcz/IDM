package klf;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes8.dex */
public final class f0 extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ v f185474w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(v vVar, Continuation continuation) {
        super(continuation);
        this.f185474w = vVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f185474w.emit(null, this);
    }
}
