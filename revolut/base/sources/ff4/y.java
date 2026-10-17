package ff4;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes22.dex */
public final class y extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ f88.i f134752w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(f88.i iVar, Continuation continuation) {
        super(continuation);
        this.f134752w = iVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f134752w.emit(null, this);
    }
}
