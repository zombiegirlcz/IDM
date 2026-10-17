package e0a;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes5.dex */
public final class t extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ dwi.v f121523w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(dwi.v vVar, Continuation continuation) {
        super(continuation);
        this.f121523w = vVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f121523w.emit(null, this);
    }
}
