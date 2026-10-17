package tf9;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes5.dex */
public final class b extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ sij.c f270268w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(sij.c cVar, Continuation continuation) {
        super(continuation);
        this.f270268w = cVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f270268w.emit(null, this);
    }
}
