package qd8;

import kotlin.coroutines.Continuation;
import qb3.p;

/* JADX INFO: loaded from: classes4.dex */
public final class d extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ p f244886w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(p pVar, Continuation continuation) {
        super(continuation);
        this.f244886w = pVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f244886w.emit(null, this);
    }
}
