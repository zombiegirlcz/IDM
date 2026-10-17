package avk;

import aqd.w0;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes12.dex */
public final class e0 extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ w0 f10078w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(w0 w0Var, Continuation continuation) {
        super(continuation);
        this.f10078w = w0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f10078w.emit(null, this);
    }
}
