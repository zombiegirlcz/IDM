package t5d;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes7.dex */
public final class b extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ t05.f f268051w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(t05.f fVar, Continuation continuation) {
        super(continuation);
        this.f268051w = fVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f268051w.emit(null, this);
    }
}
