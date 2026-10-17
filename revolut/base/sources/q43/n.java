package q43;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes21.dex */
public final class n extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ pvk.k f242031w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(pvk.k kVar, Continuation continuation) {
        super(continuation);
        this.f242031w = kVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f242031w.emit(null, this);
    }
}
