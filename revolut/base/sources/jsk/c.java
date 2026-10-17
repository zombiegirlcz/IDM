package jsk;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes12.dex */
public final class c extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ jhd.d f178186w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(jhd.d dVar, Continuation continuation) {
        super(continuation);
        this.f178186w = dVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f178186w.emit(null, this);
    }
}
