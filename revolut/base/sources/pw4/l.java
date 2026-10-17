package pw4;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes22.dex */
public final class l extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ pvk.k f240332w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(pvk.k kVar, Continuation continuation) {
        super(continuation);
        this.f240332w = kVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f240332w.emit(null, this);
    }
}
