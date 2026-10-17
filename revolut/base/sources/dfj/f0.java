package dfj;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes11.dex */
public final class f0 extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ dah.d f113960w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(dah.d dVar, Continuation continuation) {
        super(continuation);
        this.f113960w = dVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f113960w.emit(null, this);
    }
}
