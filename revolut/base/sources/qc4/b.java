package qc4;

import kotlin.coroutines.Continuation;
import qb3.p;

/* JADX INFO: loaded from: classes22.dex */
public final class b extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ p f244553w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(p pVar, Continuation continuation) {
        super(continuation);
        this.f244553w = pVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f244553w.emit(null, this);
    }
}
