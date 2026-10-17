package i85;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes21.dex */
public final class i extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ ay4.e f159453w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(ay4.e eVar, Continuation continuation) {
        super(continuation);
        this.f159453w = eVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f159453w.emit(null, this);
    }
}
