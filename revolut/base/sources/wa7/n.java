package wa7;

import tof.a3;

/* JADX INFO: loaded from: classes21.dex */
public final class n extends gim.c {
    public a3 u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ p f295850w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f295851x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(p pVar, gim.c cVar) {
        super(cVar);
        this.f295850w = pVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f295851x |= Integer.MIN_VALUE;
        return this.f295850w.d(null, this);
    }
}
