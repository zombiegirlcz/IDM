package g9j;

import g23.e0;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes11.dex */
public final class o extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ e0 f141929w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(e0 e0Var, Continuation continuation) {
        super(continuation);
        this.f141929w = e0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f141929w.emit(null, this);
    }
}
