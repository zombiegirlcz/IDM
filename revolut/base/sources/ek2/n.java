package ek2;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes21.dex */
public final class n extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ egh.e f126944w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(egh.e eVar, Continuation continuation) {
        super(continuation);
        this.f126944w = eVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f126944w.emit(null, this);
    }
}
