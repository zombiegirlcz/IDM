package g37;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes3.dex */
public final class u extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ g27.d f140230w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(g27.d dVar, Continuation continuation) {
        super(continuation);
        this.f140230w = dVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f140230w.emit(null, this);
    }
}
