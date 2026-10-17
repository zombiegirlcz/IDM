package j54;

/* JADX INFO: loaded from: classes22.dex */
public final class e0 extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ com.revolut.feature.credit.application.plugins.impl.ui.application.extensions.d v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f171506w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(com.revolut.feature.credit.application.plugins.impl.ui.application.extensions.d dVar, gim.c cVar) {
        super(cVar);
        this.v = dVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f171506w |= Integer.MIN_VALUE;
        return this.v.d3(this);
    }
}
