package ewh;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes10.dex */
public final class t extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ esj.e f130282w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(esj.e eVar, Continuation continuation) {
        super(continuation);
        this.f130282w = eVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f130282w.emit(null, this);
    }
}
