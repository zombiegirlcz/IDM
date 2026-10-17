package yh7;

import kotlin.coroutines.Continuation;
import yed.f0;

/* JADX INFO: loaded from: classes22.dex */
public final class f extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ f0 f313872w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(f0 f0Var, Continuation continuation) {
        super(continuation);
        this.f313872w = f0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f313872w.emit(null, this);
    }
}
