package eh8;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes4.dex */
public final class j extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ egh.e f125759w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(egh.e eVar, Continuation continuation) {
        super(continuation);
        this.f125759w = eVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f125759w.emit(null, this);
    }
}
