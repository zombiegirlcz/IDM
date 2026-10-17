package i09;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes4.dex */
public final class c extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ hui.d f157320w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(hui.d dVar, Continuation continuation) {
        super(continuation);
        this.f157320w = dVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f157320w.emit(null, this);
    }
}
