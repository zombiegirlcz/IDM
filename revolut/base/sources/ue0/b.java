package ue0;

import ard.b0;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes19.dex */
public final class b extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ b0 f279286w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(b0 b0Var, Continuation continuation) {
        super(continuation);
        this.f279286w = b0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f279286w.emit(null, this);
    }
}
