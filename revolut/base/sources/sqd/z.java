package sqd;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes7.dex */
public final class z extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ spb.f f265083w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(spb.f fVar, Continuation continuation) {
        super(continuation);
        this.f265083w = fVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f265083w.emit(null, this);
    }
}
