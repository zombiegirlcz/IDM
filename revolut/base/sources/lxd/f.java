package lxd;

/* JADX INFO: loaded from: classes7.dex */
public final class f extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ com.revolut.feature.standingordertopup.impl.ui.flow.auto_top_up.b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f200556w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(com.revolut.feature.standingordertopup.impl.ui.flow.auto_top_up.b bVar, gim.c cVar) {
        super(cVar);
        this.v = bVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f200556w |= Integer.MIN_VALUE;
        return com.revolut.feature.standingordertopup.impl.ui.flow.auto_top_up.b.J2(this.v, null, this);
    }
}
