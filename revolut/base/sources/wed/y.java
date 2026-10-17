package wed;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes7.dex */
public final class y extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ wa3.h f296764w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(wa3.h hVar, Continuation continuation) {
        super(continuation);
        this.f296764w = hVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f296764w.emit(null, this);
    }
}
