package kye;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes8.dex */
public final class n2 extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ j2 f190799w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n2(j2 j2Var, Continuation continuation) {
        super(continuation);
        this.f190799w = j2Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f190799w.emit(null, this);
    }
}
