package h4k;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes11.dex */
public final class j extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ h1k.d f149388w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(h1k.d dVar, Continuation continuation) {
        super(continuation);
        this.f149388w = dVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f149388w.emit(null, this);
    }
}
