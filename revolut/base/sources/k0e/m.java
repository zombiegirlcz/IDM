package k0e;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes7.dex */
public final class m extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ jsl.k f180037w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(jsl.k kVar, Continuation continuation) {
        super(continuation);
        this.f180037w = kVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f180037w.emit(null, this);
    }
}
