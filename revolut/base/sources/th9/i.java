package th9;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes5.dex */
public final class i extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ te8.j f271338w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(te8.j jVar, Continuation continuation) {
        super(continuation);
        this.f271338w = jVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f271338w.emit(null, this);
    }
}
