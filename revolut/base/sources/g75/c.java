package g75;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes21.dex */
public final class c extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ ay4.e f141111w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(ay4.e eVar, Continuation continuation) {
        super(continuation);
        this.f141111w = eVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f141111w.emit(null, this);
    }
}
