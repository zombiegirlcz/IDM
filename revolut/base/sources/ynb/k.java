package ynb;

/* JADX INFO: loaded from: classes6.dex */
public final class k extends gim.c {
    public zpb.h u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ r f315407w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f315408x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(r rVar, gim.c cVar) {
        super(cVar);
        this.f315407w = rVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f315408x |= Integer.MIN_VALUE;
        return this.f315407w.h3(null, null, this);
    }
}
