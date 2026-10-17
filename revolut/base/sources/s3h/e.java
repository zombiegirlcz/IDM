package s3h;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes9.dex */
public final class e extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ rx6.e f259680w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(rx6.e eVar, Continuation continuation) {
        super(continuation);
        this.f259680w = eVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f259680w.emit(null, this);
    }
}
