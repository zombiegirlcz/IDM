package tyg;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes9.dex */
public final class i extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ a87.f f275580w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(a87.f fVar, Continuation continuation) {
        super(continuation);
        this.f275580w = fVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f275580w.emit(null, this);
    }
}
