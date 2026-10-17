package wwi;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes10.dex */
public final class n extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ wv2.l f300685w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(wv2.l lVar, Continuation continuation) {
        super(continuation);
        this.f300685w = lVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f300685w.emit(null, this);
    }
}
