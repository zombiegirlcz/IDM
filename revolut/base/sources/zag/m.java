package zag;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes9.dex */
public final class m extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ z6k.j f320703w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(z6k.j jVar, Continuation continuation) {
        super(continuation);
        this.f320703w = jVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f320703w.emit(null, this);
    }
}
