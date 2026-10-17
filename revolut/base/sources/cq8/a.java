package cq8;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ cq6.i f108021w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(cq6.i iVar, Continuation continuation) {
        super(continuation);
        this.f108021w = iVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f108021w.emit(null, this);
    }
}
