package rga;

import kotlin.coroutines.Continuation;
import r74.a0;

/* JADX INFO: loaded from: classes5.dex */
public final class e extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ a0 f254051w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(a0 a0Var, Continuation continuation) {
        super(continuation);
        this.f254051w = a0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f254051w.emit(null, this);
    }
}
