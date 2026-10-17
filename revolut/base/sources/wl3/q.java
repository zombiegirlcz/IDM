package wl3;

/* JADX INFO: loaded from: classes21.dex */
public final class q extends gim.c {
    public ihm.k u;
    public sl3.o v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public long f298396w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f298397x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ s f298398y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(s sVar, gim.c cVar) {
        super(cVar);
        this.f298398y = sVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f298397x = obj2;
        this.z |= Integer.MIN_VALUE;
        return s.a(this.f298398y, null, this);
    }
}
