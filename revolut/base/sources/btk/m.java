package btk;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes12.dex */
public final class m extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ bq5.o f18644w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(bq5.o oVar, Continuation continuation) {
        super(continuation);
        this.f18644w = oVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f18644w.emit(null, this);
    }
}
