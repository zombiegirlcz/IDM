package o7b;

import kotlin.coroutines.Continuation;
import o42.j;

/* JADX INFO: loaded from: classes6.dex */
public final class c extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ j f222737w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(j jVar, Continuation continuation) {
        super(continuation);
        this.f222737w = jVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f222737w.emit(null, this);
    }
}
