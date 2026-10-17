package n2d;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes7.dex */
public final class b extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ n1j.d f211521w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(n1j.d dVar, Continuation continuation) {
        super(continuation);
        this.f211521w = dVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f211521w.emit(null, this);
    }
}
