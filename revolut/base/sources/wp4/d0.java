package wp4;

import kotlin.coroutines.Continuation;
import vkm.s0;

/* JADX INFO: loaded from: classes22.dex */
public final class d0 extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ s0 f299042w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(s0 s0Var, Continuation continuation) {
        super(continuation);
        this.f299042w = s0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f299042w.emit(null, this);
    }
}
