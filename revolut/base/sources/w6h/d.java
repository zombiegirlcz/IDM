package w6h;

import kotlin.coroutines.Continuation;
import vkm.s0;

/* JADX INFO: loaded from: classes9.dex */
public final class d extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ s0 f295438w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(s0 s0Var, Continuation continuation) {
        super(continuation);
        this.f295438w = s0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f295438w.emit(null, this);
    }
}
