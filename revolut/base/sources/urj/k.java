package urj;

import h6i.y;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes11.dex */
public final class k extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ y f282334w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(y yVar, Continuation continuation) {
        super(continuation);
        this.f282334w = yVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f282334w.emit(null, this);
    }
}
