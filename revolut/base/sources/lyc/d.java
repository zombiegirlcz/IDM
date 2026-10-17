package lyc;

import k7i.i;

/* JADX INFO: loaded from: classes7.dex */
public final class d extends gim.c {
    public Boolean u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ i f200780w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f200781x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(i iVar, gim.c cVar) {
        super(cVar);
        this.f200780w = iVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f200781x |= Integer.MIN_VALUE;
        return this.f200780w.t(this);
    }
}
