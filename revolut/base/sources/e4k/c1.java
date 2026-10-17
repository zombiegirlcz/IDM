package e4k;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes11.dex */
public final class c1 extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ dwi.v f122582w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(dwi.v vVar, Continuation continuation) {
        super(continuation);
        this.f122582w = vVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f122582w.emit(null, this);
    }
}
