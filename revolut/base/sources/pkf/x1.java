package pkf;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes8.dex */
public final class x1 extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ im9.k f237154w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x1(im9.k kVar, Continuation continuation) {
        super(continuation);
        this.f237154w = kVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f237154w.emit(null, this);
    }
}
