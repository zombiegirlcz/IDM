package ykf;

import kotlin.coroutines.Continuation;
import yed.f0;

/* JADX INFO: loaded from: classes8.dex */
public final class a extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ f0 f314616w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(f0 f0Var, Continuation continuation) {
        super(continuation);
        this.f314616w = f0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f314616w.emit(null, this);
    }
}
