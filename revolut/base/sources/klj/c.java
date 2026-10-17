package klj;

import kkf.h9;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes11.dex */
public final class c extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ h9 f185633w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(h9 h9Var, Continuation continuation) {
        super(continuation);
        this.f185633w = h9Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f185633w.emit(null, this);
    }
}
