package is;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes17.dex */
public final class d extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ img.c f168068w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(img.c cVar, Continuation continuation) {
        super(continuation);
        this.f168068w = cVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f168068w.emit(null, this);
    }
}
