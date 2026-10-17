package fmb;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes6.dex */
public final class s0 extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ f88.i f136301w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(f88.i iVar, Continuation continuation) {
        super(continuation);
        this.f136301w = iVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f136301w.emit(null, this);
    }
}
