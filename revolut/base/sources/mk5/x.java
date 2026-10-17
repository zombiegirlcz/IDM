package mk5;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes3.dex */
public final class x extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ mhd.f f206205w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(mhd.f fVar, Continuation continuation) {
        super(continuation);
        this.f206205w = fVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f206205w.emit(null, this);
    }
}
