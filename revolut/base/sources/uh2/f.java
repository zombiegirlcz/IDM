package uh2;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes21.dex */
public final class f extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ tzh.e f280057w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(tzh.e eVar, Continuation continuation) {
        super(continuation);
        this.f280057w = eVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f280057w.emit(null, this);
    }
}
