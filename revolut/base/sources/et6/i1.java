package et6;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes3.dex */
public final class i1 extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ esj.e f129246w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i1(esj.e eVar, Continuation continuation) {
        super(continuation);
        this.f129246w = eVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f129246w.emit(null, this);
    }
}
