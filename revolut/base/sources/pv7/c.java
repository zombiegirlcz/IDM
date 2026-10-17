package pv7;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes4.dex */
public final class c extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ pkf.g f239984w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(pkf.g gVar, Continuation continuation) {
        super(continuation);
        this.f239984w = gVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f239984w.emit(null, this);
    }
}
