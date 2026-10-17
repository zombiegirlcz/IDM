package bcj;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes11.dex */
public final class j extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ a3i.h f14459w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(a3i.h hVar, Continuation continuation) {
        super(continuation);
        this.f14459w = hVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f14459w.emit(null, this);
    }
}
