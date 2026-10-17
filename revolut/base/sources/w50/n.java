package w50;

import kotlin.coroutines.Continuation;
import vkm.s0;

/* JADX INFO: loaded from: classes19.dex */
public final class n extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ s0 f294664w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(s0 s0Var, Continuation continuation) {
        super(continuation);
        this.f294664w = s0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f294664w.emit(null, this);
    }
}
