package hg0;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes19.dex */
public final class k extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ f3d.f f152055w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(f3d.f fVar, Continuation continuation) {
        super(continuation);
        this.f152055w = fVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f152055w.emit(null, this);
    }
}
