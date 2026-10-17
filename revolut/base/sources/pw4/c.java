package pw4;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes22.dex */
public final class c extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ nj8.g f240320w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(nj8.g gVar, Continuation continuation) {
        super(continuation);
        this.f240320w = gVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f240320w.emit(null, this);
    }
}
