package ww8;

import com.revolut.data.model.Data;

/* JADX INFO: loaded from: classes4.dex */
public final class l extends gim.c {
    public Data u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.kyc.impl.screens.addressconfirmation.a f300630w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f300631x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(com.revolut.feature.kyc.impl.screens.addressconfirmation.a aVar, gim.c cVar) {
        super(cVar);
        this.f300630w = aVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f300631x |= Integer.MIN_VALUE;
        return com.revolut.feature.kyc.impl.screens.addressconfirmation.a.I2(this.f300630w, null, this);
    }
}
