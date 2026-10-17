package e1g;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes9.dex */
public final class f extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ dc0.c f121983w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(dc0.c cVar, Continuation continuation) {
        super(continuation);
        this.f121983w = cVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f121983w.emit(null, this);
    }
}
