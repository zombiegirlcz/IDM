package r1a;

import com.revolut.feature.payments.splitbill.models.splitbilllink.SplitBillLink;

/* JADX INFO: loaded from: classes5.dex */
public final class c extends gim.c {
    public SplitBillLink u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ d f250938w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f250939x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, gim.c cVar) {
        super(cVar);
        this.f250938w = dVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f250939x |= Integer.MIN_VALUE;
        return d.d3(this.f250938w, null, null, this);
    }
}
