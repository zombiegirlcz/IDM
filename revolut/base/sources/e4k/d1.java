package e4k;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes11.dex */
public final class d1 extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ dwi.v f122585w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(dwi.v vVar, Continuation continuation) {
        super(continuation);
        this.f122585w = vVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f122585w.emit(null, this);
    }
}
