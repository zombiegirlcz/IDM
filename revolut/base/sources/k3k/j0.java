package k3k;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes11.dex */
public final class j0 extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ jsl.k f180774w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(jsl.k kVar, Continuation continuation) {
        super(continuation);
        this.f180774w = kVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f180774w.emit(null, this);
    }
}
