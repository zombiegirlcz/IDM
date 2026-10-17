package pt;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes17.dex */
public final class c extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ pkf.g f239553w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(pkf.g gVar, Continuation continuation) {
        super(continuation);
        this.f239553w = gVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f239553w.emit(null, this);
    }
}
