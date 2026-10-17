package o17;

import com.revolut.feature.freelancer.common.models.FreelancerOrder;

/* JADX INFO: loaded from: classes3.dex */
public final class w extends gim.c {
    public final /* synthetic */ com.revolut.feature.freelancer.impl.ui.sales.details.kompot.screen.a A;
    public int B;
    public FreelancerOrder u;
    public l17.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public com.revolut.feature.freelancer.impl.ui.sales.details.kompot.screen.a f221338w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public tqi.g f221339x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public String f221340y;
    public /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(com.revolut.feature.freelancer.impl.ui.sales.details.kompot.screen.a aVar, gim.c cVar) {
        super(cVar);
        this.A = aVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.z = obj2;
        this.B |= Integer.MIN_VALUE;
        return com.revolut.feature.freelancer.impl.ui.sales.details.kompot.screen.a.I2(this.A, null, this);
    }
}
