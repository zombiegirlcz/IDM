package p0c;

import kotlin.coroutines.Continuation;
import nvk.v;

/* JADX INFO: loaded from: classes6.dex */
public final class g extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ v f231503w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(v vVar, Continuation continuation) {
        super(continuation);
        this.f231503w = vVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f231503w.emit(null, this);
    }
}
