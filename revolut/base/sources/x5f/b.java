package x5f;

import kotlin.coroutines.Continuation;
import vkm.s0;

/* JADX INFO: loaded from: classes8.dex */
public final class b extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ s0 f302948w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(s0 s0Var, Continuation continuation) {
        super(continuation);
        this.f302948w = s0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f302948w.emit(null, this);
    }
}
