package e40;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes19.dex */
public final class a extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ dc0.c f122341w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(dc0.c cVar, Continuation continuation) {
        super(continuation);
        this.f122341w = cVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f122341w.emit(null, this);
    }
}
