package vb4;

/* JADX INFO: loaded from: classes22.dex */
public final class r extends gim.c {
    public whf.p u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ s f287416w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f287417x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(s sVar, gim.c cVar) {
        super(cVar);
        this.f287416w = sVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f287417x |= Integer.MIN_VALUE;
        return s.I2(this.f287416w, null, null, this);
    }
}
