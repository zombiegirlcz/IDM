package jsl;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes12.dex */
public final class f extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ jhd.d f178208w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(jhd.d dVar, Continuation continuation) {
        super(continuation);
        this.f178208w = dVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f178208w.emit(null, this);
    }
}
