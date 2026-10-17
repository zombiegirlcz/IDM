package t9e;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes8.dex */
public final class t extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ t73.v f269000w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(t73.v vVar, Continuation continuation) {
        super(continuation);
        this.f269000w = vVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f269000w.emit(null, this);
    }
}
