package okf;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes8.dex */
public final class n extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ im9.k f226024w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(im9.k kVar, Continuation continuation) {
        super(continuation);
        this.f226024w = kVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f226024w.emit(null, this);
    }
}
