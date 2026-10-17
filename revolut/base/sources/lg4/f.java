package lg4;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes22.dex */
public final class f extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ l5d.d f195048w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(l5d.d dVar, Continuation continuation) {
        super(continuation);
        this.f195048w = dVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f195048w.emit(null, this);
    }
}
