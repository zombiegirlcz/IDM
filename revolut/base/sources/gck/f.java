package gck;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes11.dex */
public final class f extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ g9d.e f142499w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g9d.e eVar, Continuation continuation) {
        super(continuation);
        this.f142499w = eVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f142499w.emit(null, this);
    }
}
