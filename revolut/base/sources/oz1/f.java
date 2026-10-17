package oz1;

import kotlin.coroutines.Continuation;
import ood.x;

/* JADX INFO: loaded from: classes20.dex */
public final class f extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ x f231107w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(x xVar, Continuation continuation) {
        super(continuation);
        this.f231107w = xVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f231107w.emit(null, this);
    }
}
