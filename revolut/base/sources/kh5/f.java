package kh5;

import b8d.a0;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes3.dex */
public final class f extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ a0 f184070w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(a0 a0Var, Continuation continuation) {
        super(continuation);
        this.f184070w = a0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f184070w.emit(null, this);
    }
}
