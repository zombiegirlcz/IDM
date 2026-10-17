package cnk;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes11.dex */
public final class g extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ c65.h f25457w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(c65.h hVar, Continuation continuation) {
        super(continuation);
        this.f25457w = hVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f25457w.emit(null, this);
    }
}
