package wbg;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes9.dex */
public final class o extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ wa3.h f296189w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(wa3.h hVar, Continuation continuation) {
        super(continuation);
        this.f296189w = hVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f296189w.emit(null, this);
    }
}
