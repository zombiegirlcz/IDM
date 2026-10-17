package ueg;

/* JADX INFO: loaded from: classes9.dex */
public final class z0 extends gim.c {
    public String u;
    public dgi.i v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public long f279450w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f279451x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.travel.hotels.impl.ui_kompot.screen.search_results.map.b f279452y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(com.revolut.feature.travel.hotels.impl.ui_kompot.screen.search_results.map.b bVar, gim.c cVar) {
        super(cVar);
        this.f279452y = bVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f279451x = obj2;
        this.z |= Integer.MIN_VALUE;
        return com.revolut.feature.travel.hotels.impl.ui_kompot.screen.search_results.map.b.I2(this.f279452y, null, 0L, this);
    }
}
