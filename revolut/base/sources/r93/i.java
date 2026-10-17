package r93;

import h93.f0;

/* JADX INFO: loaded from: classes21.dex */
public final class i extends gim.c {
    public f0 u;
    public n93.i v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f252508w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ k f252509x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f252510y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(k kVar, gim.c cVar) {
        super(cVar);
        this.f252509x = kVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f252508w = obj2;
        this.f252510y |= Integer.MIN_VALUE;
        return this.f252509x.h3(null, null, null, null, this);
    }
}
