package q97;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes21.dex */
public final class a1 extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ q5g.f f243646w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(q5g.f fVar, Continuation continuation) {
        super(continuation);
        this.f243646w = fVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f243646w.emit(null, this);
    }
}
