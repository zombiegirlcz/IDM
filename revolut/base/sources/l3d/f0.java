package l3d;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes7.dex */
public final class f0 extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ c2d.f f191903w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(c2d.f fVar, Continuation continuation) {
        super(continuation);
        this.f191903w = fVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f191903w.emit(null, this);
    }
}
