package d27;

import java.time.LocalDateTime;

/* JADX INFO: loaded from: classes3.dex */
public final class h0 extends gim.c {
    public /* synthetic */ Object A;
    public final /* synthetic */ com.revolut.feature.freelancer.impl.ui.sales.order_init_page.create.a B;
    public int C;
    public u u;
    public xi0.b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public LocalDateTime f110747w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public bbd.b f110748x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public dj0.d f110749y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(com.revolut.feature.freelancer.impl.ui.sales.order_init_page.create.a aVar, gim.c cVar) {
        super(cVar);
        this.B = aVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.A = obj2;
        this.C |= Integer.MIN_VALUE;
        return com.revolut.feature.freelancer.impl.ui.sales.order_init_page.create.a.I2(this.B, this);
    }
}
