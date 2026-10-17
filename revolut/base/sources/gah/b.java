package gah;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes9.dex */
public final class b extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ a87.f f142176w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(a87.f fVar, Continuation continuation) {
        super(continuation);
        this.f142176w = fVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f142176w.emit(null, this);
    }
}
