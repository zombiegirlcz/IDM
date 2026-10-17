package tlf;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes8.dex */
public final class e extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ sij.c f272067w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(sij.c cVar, Continuation continuation) {
        super(continuation);
        this.f272067w = cVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f272067w.emit(null, this);
    }
}
