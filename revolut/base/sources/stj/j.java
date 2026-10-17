package stj;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes11.dex */
public final class j extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ spb.f f265613w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(spb.f fVar, Continuation continuation) {
        super(continuation);
        this.f265613w = fVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f265613w.emit(null, this);
    }
}
