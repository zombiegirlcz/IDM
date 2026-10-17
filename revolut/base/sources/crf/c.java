package crf;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes9.dex */
public final class c extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ cq6.i f108361w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(cq6.i iVar, Continuation continuation) {
        super(continuation);
        this.f108361w = iVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f108361w.emit(null, this);
    }
}
