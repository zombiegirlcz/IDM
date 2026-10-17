package dcf;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes8.dex */
public final class l0 extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ dah.d f112957w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(dah.d dVar, Continuation continuation) {
        super(continuation);
        this.f112957w = dVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f112957w.emit(null, this);
    }
}
