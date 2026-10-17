package zze;

import com.revolut.feature.topup_screen.api.google_pay.models.GooglePayFee;

/* JADX INFO: loaded from: classes8.dex */
public final class d extends gim.c {
    public ute.a u;
    public GooglePayFee v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f326707w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.topup_screen.impl.google_pay.flow.b f326708x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f326709y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(com.revolut.feature.topup_screen.impl.google_pay.flow.b bVar, gim.c cVar) {
        super(cVar);
        this.f326708x = bVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f326707w = obj2;
        this.f326709y |= Integer.MIN_VALUE;
        return this.f326708x.L2(null, null, null, this);
    }
}
