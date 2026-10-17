package a5h;

import a07.o;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes9.dex */
public final class b extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ o f1393w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(o oVar, Continuation continuation) {
        super(continuation);
        this.f1393w = oVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f1393w.emit(null, this);
    }
}
