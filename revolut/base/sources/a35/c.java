package a35;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes22.dex */
public final class c extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ a07.o f1055w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(a07.o oVar, Continuation continuation) {
        super(continuation);
        this.f1055w = oVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f1055w.emit(null, this);
    }
}
