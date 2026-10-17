package i4b;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes6.dex */
public final class k0 extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ y f158352w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(y yVar, Continuation continuation) {
        super(continuation);
        this.f158352w = yVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f158352w.emit(null, this);
    }
}
