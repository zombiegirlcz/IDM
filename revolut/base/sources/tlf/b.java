package tlf;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes8.dex */
public final class b extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ te8.j f272059w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(te8.j jVar, Continuation continuation) {
        super(continuation);
        this.f272059w = jVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f272059w.emit(null, this);
    }
}
