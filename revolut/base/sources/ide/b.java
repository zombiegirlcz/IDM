package ide;

import i52.l;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes8.dex */
public final class b extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ l f160476w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(l lVar, Continuation continuation) {
        super(continuation);
        this.f160476w = lVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f160476w.emit(null, this);
    }
}
