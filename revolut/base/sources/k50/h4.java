package k50;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes19.dex */
public final class h4 extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ jsl.k f181100w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h4(jsl.k kVar, Continuation continuation) {
        super(continuation);
        this.f181100w = kVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f181100w.emit(null, this);
    }
}
