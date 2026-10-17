package qb4;

import kotlin.coroutines.Continuation;
import qb3.p;

/* JADX INFO: loaded from: classes22.dex */
public final class c extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ p f244110w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(p pVar, Continuation continuation) {
        super(continuation);
        this.f244110w = pVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f244110w.emit(null, this);
    }
}
