package rbh;

import com.revolut.retail.trading.core.domain.PocketInfo;

/* JADX INFO: loaded from: classes9.dex */
public final class l extends gim.c {
    public PocketInfo u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ m f253075w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f253076x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(m mVar, gim.c cVar) {
        super(cVar);
        this.f253075w = mVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f253076x |= Integer.MIN_VALUE;
        return m.g3(this.f253075w, null, this);
    }
}
