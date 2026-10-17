package dfj;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes11.dex */
public final class j4 extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ dah.d f114009w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j4(dah.d dVar, Continuation continuation) {
        super(continuation);
        this.f114009w = dVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f114009w.emit(null, this);
    }
}
