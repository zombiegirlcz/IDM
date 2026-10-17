package wrd;

import kotlin.coroutines.Continuation;
import vkm.s0;

/* JADX INFO: loaded from: classes7.dex */
public final class r extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ s0 f299569w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(s0 s0Var, Continuation continuation) {
        super(continuation);
        this.f299569w = s0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f299569w.emit(null, this);
    }
}
