package q87;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes3.dex */
public final class e extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ q5g.f f243016w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(q5g.f fVar, Continuation continuation) {
        super(continuation);
        this.f243016w = fVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f243016w.emit(null, this);
    }
}
