package sh2;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes21.dex */
public final class p extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ mc2.j f263413w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(mc2.j jVar, Continuation continuation) {
        super(continuation);
        this.f263413w = jVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f263413w.emit(null, this);
    }
}
