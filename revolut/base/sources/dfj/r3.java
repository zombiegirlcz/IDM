package dfj;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes11.dex */
public final class r3 extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ dah.d f114090w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r3(dah.d dVar, Continuation continuation) {
        super(continuation);
        this.f114090w = dVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f114090w.emit(null, this);
    }
}
