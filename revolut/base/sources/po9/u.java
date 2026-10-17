package po9;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes5.dex */
public final class u extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ nj8.g f237936w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(nj8.g gVar, Continuation continuation) {
        super(continuation);
        this.f237936w = gVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f237936w.emit(null, this);
    }
}
