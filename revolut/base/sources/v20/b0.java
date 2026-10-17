package v20;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes19.dex */
public final class b0 extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ u97.e f285337w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(u97.e eVar, Continuation continuation) {
        super(continuation);
        this.f285337w = eVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f285337w.emit(null, this);
    }
}
