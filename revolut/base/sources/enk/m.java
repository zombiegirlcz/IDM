package enk;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes11.dex */
public final class m extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ egh.e f127843w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(egh.e eVar, Continuation continuation) {
        super(continuation);
        this.f127843w = eVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f127843w.emit(null, this);
    }
}
