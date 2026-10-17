package u3a;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes5.dex */
public final class m extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ tzh.e f276857w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(tzh.e eVar, Continuation continuation) {
        super(continuation);
        this.f276857w = eVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f276857w.emit(null, this);
    }
}
