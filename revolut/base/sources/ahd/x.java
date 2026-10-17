package ahd;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes7.dex */
public final class x extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ a87.f f4966w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(a87.f fVar, Continuation continuation) {
        super(continuation);
        this.f4966w = fVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f4966w.emit(null, this);
    }
}
