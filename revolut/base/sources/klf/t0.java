package klf;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes8.dex */
public final class t0 extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ aci.d f185577w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(aci.d dVar, Continuation continuation) {
        super(continuation);
        this.f185577w = dVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f185577w.emit(null, this);
    }
}
