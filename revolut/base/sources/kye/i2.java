package kye;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes8.dex */
public final class i2 extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ j2 f190745w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i2(j2 j2Var, Continuation continuation) {
        super(continuation);
        this.f190745w = j2Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f190745w.emit(null, this);
    }
}
