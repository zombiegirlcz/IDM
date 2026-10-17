package t73;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes21.dex */
public final class x extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ v f268565w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(v vVar, Continuation continuation) {
        super(continuation);
        this.f268565w = vVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f268565w.emit(null, this);
    }
}
