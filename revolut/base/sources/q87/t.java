package q87;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes3.dex */
public final class t extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ q5g.f f243033w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(q5g.f fVar, Continuation continuation) {
        super(continuation);
        this.f243033w = fVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f243033w.emit(null, this);
    }
}
