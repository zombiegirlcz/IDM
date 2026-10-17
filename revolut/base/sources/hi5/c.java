package hi5;

import gim.i;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends gim.c {
    public i u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ e f152493w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f152494x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(e eVar, gim.c cVar) {
        super(cVar);
        this.f152493w = eVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f152494x |= Integer.MIN_VALUE;
        return this.f152493w.Z2(null, this);
    }
}
