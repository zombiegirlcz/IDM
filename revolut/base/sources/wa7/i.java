package wa7;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes21.dex */
public final class i extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ wa3.h f295840w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(wa3.h hVar, Continuation continuation) {
        super(continuation);
        this.f295840w = hVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f295840w.emit(null, this);
    }
}
