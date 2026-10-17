package wl3;

import java.util.List;

/* JADX INFO: loaded from: classes21.dex */
public final class p extends gim.c {
    public List u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ uvl.c f298394w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f298395x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(uvl.c cVar, gim.c cVar2) {
        super(cVar2);
        this.f298394w = cVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f298395x |= Integer.MIN_VALUE;
        return this.f298394w.w(null, this);
    }
}
