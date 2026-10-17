package q9c;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes6.dex */
public final class a0 extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ x f243854w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(x xVar, Continuation continuation) {
        super(continuation);
        this.f243854w = xVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f243854w.emit(null, this);
    }
}
