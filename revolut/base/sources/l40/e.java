package l40;

import kotlin.coroutines.Continuation;
import kx4.b0;

/* JADX INFO: loaded from: classes19.dex */
public final class e extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ b0 f191992w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(b0 b0Var, Continuation continuation) {
        super(continuation);
        this.f191992w = b0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f191992w.emit(null, this);
    }
}
