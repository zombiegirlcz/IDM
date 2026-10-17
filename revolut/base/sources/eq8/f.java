package eq8;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes4.dex */
public final class f extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ egh.e f128377w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(egh.e eVar, Continuation continuation) {
        super(continuation);
        this.f128377w = eVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f128377w.emit(null, this);
    }
}
