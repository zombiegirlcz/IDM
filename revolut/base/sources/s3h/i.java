package s3h;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes9.dex */
public final class i extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ rx6.e f259685w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(rx6.e eVar, Continuation continuation) {
        super(continuation);
        this.f259685w = eVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f259685w.emit(null, this);
    }
}
