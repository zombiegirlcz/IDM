package fod;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes7.dex */
public final class g extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ f88.i f136935w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(f88.i iVar, Continuation continuation) {
        super(continuation);
        this.f136935w = iVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f136935w.emit(null, this);
    }
}
