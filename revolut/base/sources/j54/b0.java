package j54;

/* JADX INFO: loaded from: classes22.dex */
public final class b0 extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ com.revolut.feature.credit.application.plugins.impl.ui.application.extensions.d v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f171496w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(com.revolut.feature.credit.application.plugins.impl.ui.application.extensions.d dVar, gim.c cVar) {
        super(cVar);
        this.v = dVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f171496w |= Integer.MIN_VALUE;
        return this.v.b3(this);
    }
}
