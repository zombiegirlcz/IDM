package tch;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes9.dex */
public final class n extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ t73.v f269841w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(t73.v vVar, Continuation continuation) {
        super(continuation);
        this.f269841w = vVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f269841w.emit(null, this);
    }
}
