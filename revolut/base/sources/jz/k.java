package jz;

import ard.b0;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes16.dex */
public final class k extends gim.c {
    public long u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ b0 f179543w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f179544x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(b0 b0Var, Continuation continuation) {
        super(continuation);
        this.f179543w = b0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f179544x |= Integer.MIN_VALUE;
        return this.f179543w.emit(null, this);
    }
}
