package e4k;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes11.dex */
public final class x0 extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ dwi.v f122651w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(dwi.v vVar, Continuation continuation) {
        super(continuation);
        this.f122651w = vVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f122651w.emit(null, this);
    }
}
