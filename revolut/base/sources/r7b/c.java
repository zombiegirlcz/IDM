package r7b;

import kotlin.coroutines.Continuation;
import r74.a0;

/* JADX INFO: loaded from: classes6.dex */
public final class c extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ a0 f252061w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(a0 a0Var, Continuation continuation) {
        super(continuation);
        this.f252061w = a0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f252061w.emit(null, this);
    }
}
