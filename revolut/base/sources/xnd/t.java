package xnd;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes7.dex */
public final class t extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ u f307450w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(u uVar, Continuation continuation) {
        super(continuation);
        this.f307450w = uVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f307450w.emit(null, this);
    }
}
