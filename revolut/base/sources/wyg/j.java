package wyg;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes9.dex */
public final class j extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ wv2.l f301291w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(wv2.l lVar, Continuation continuation) {
        super(continuation);
        this.f301291w = lVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f301291w.emit(null, this);
    }
}
