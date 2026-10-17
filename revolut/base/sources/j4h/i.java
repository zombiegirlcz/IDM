package j4h;

import iyg.a0;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes9.dex */
public final class i extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ a0 f171389w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(a0 a0Var, Continuation continuation) {
        super(continuation);
        this.f171389w = a0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f171389w.emit(null, this);
    }
}
