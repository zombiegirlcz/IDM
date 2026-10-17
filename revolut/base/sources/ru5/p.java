package ru5;

/* JADX INFO: loaded from: classes3.dex */
public final class p extends gim.c {
    public String u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ z f257431w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f257432x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(z zVar, gim.c cVar) {
        super(cVar);
        this.f257431w = zVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f257432x |= Integer.MIN_VALUE;
        return z.y2(this.f257431w, null, this);
    }
}
