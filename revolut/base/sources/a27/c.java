package a27;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends gim.c {
    public AtomicReference u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ k f699w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f700x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(k kVar, gim.c cVar) {
        super(cVar);
        this.f699w = kVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f700x |= Integer.MIN_VALUE;
        return this.f699w.b(null, this);
    }
}
