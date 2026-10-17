package p7f;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes8.dex */
public final class d extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ p26.j f233758w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(p26.j jVar, Continuation continuation) {
        super(continuation);
        this.f233758w = jVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f233758w.emit(null, this);
    }
}
