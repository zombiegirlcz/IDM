package i4h;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes9.dex */
public final class k0 extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ i4b.y f158458w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(i4b.y yVar, Continuation continuation) {
        super(continuation);
        this.f158458w = yVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f158458w.emit(null, this);
    }
}
