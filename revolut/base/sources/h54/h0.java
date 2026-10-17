package h54;

/* JADX INFO: loaded from: classes22.dex */
public final class h0 extends gim.c {
    public boolean u;
    public com.revolut.feature.credit.application.plugins.impl.ui.application.d v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public yki.i f149470w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f149471x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.credit.application.plugins.impl.ui.application.d f149472y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(com.revolut.feature.credit.application.plugins.impl.ui.application.d dVar, gim.c cVar) {
        super(cVar);
        this.f149472y = dVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f149471x = obj2;
        this.z |= Integer.MIN_VALUE;
        return this.f149472y.i3(this);
    }
}
