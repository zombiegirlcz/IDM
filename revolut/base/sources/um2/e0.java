package um2;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes21.dex */
public final class e0 extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ uh7.q f281192w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(uh7.q qVar, Continuation continuation) {
        super(continuation);
        this.f281192w = qVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f281192w.emit(null, this);
    }
}
