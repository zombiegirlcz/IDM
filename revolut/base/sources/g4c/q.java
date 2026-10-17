package g4c;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes6.dex */
public final class q extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ g27.d f140486w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(g27.d dVar, Continuation continuation) {
        super(continuation);
        this.f140486w = dVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f140486w.emit(null, this);
    }
}
