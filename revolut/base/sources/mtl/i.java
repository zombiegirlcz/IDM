package mtl;

import kotlin.coroutines.Continuation;
import mle.t;

/* JADX INFO: loaded from: classes12.dex */
public final class i extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ t f208920w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(t tVar, Continuation continuation) {
        super(continuation);
        this.f208920w = tVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f208920w.emit(null, this);
    }
}
