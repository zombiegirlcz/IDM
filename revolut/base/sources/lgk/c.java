package lgk;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes11.dex */
public final class c extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ l5d.d f195128w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(l5d.d dVar, Continuation continuation) {
        super(continuation);
        this.f195128w = dVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f195128w.emit(null, this);
    }
}
