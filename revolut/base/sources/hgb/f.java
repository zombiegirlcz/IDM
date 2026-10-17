package hgb;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes6.dex */
public final class f extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ hg4.i f152143w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(hg4.i iVar, Continuation continuation) {
        super(continuation);
        this.f152143w = iVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f152143w.emit(null, this);
    }
}
