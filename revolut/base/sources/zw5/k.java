package zw5;

import d7j.o1;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes3.dex */
public final class k extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ o1 f325740w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(o1 o1Var, Continuation continuation) {
        super(continuation);
        this.f325740w = o1Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f325740w.emit(null, this);
    }
}
