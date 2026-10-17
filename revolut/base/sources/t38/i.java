package t38;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes4.dex */
public final class i extends gim.c {
    public xi0.b u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ p f267685w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f267686x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(p pVar, Continuation continuation) {
        super(continuation);
        this.f267685w = pVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f267686x |= Integer.MIN_VALUE;
        return this.f267685w.d3(null, this);
    }
}
