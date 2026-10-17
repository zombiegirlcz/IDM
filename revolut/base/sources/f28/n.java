package f28;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes4.dex */
public final class n extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ k f131474w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(k kVar, Continuation continuation) {
        super(continuation);
        this.f131474w = kVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f131474w.emit(null, this);
    }
}
