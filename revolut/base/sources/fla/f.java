package fla;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes5.dex */
public final class f extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ f88.i f135924w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(f88.i iVar, Continuation continuation) {
        super(continuation);
        this.f135924w = iVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f135924w.emit(null, this);
    }
}
