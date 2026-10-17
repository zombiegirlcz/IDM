package zz9;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes5.dex */
public final class e0 extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ zul.l f326607w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(zul.l lVar, Continuation continuation) {
        super(continuation);
        this.f326607w = lVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f326607w.emit(null, this);
    }
}
