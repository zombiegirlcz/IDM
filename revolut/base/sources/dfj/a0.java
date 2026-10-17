package dfj;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes11.dex */
public final class a0 extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ dah.d f113902w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(dah.d dVar, Continuation continuation) {
        super(continuation);
        this.f113902w = dVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f113902w.emit(null, this);
    }
}
