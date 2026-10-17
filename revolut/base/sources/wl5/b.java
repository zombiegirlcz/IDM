package wl5;

import kotlin.coroutines.Continuation;
import vkm.s0;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ s0 f298413w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(s0 s0Var, Continuation continuation) {
        super(continuation);
        this.f298413w = s0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f298413w.emit(null, this);
    }
}
