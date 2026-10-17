package oj4;

/* JADX INFO: loaded from: classes22.dex */
public final class e extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ com.revolut.feature.credit.application.plugins.impl.ui.waiting_list_v3.c v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f225729w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(com.revolut.feature.credit.application.plugins.impl.ui.waiting_list_v3.c cVar, gim.c cVar2) {
        super(cVar2);
        this.v = cVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f225729w |= Integer.MIN_VALUE;
        return com.revolut.feature.credit.application.plugins.impl.ui.waiting_list_v3.c.I2(this.v, this);
    }
}
