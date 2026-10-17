package pkf;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes8.dex */
public final class m0 extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ im9.k f237094w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(im9.k kVar, Continuation continuation) {
        super(continuation);
        this.f237094w = kVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f237094w.emit(null, this);
    }
}
