package zze;

import com.revolut.feature.topup_screen.api.google_pay.models.GooglePayFee;

/* JADX INFO: loaded from: classes8.dex */
public final class i extends gim.c {
    public ute.a u;
    public GooglePayFee v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f326717w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.topup_screen.impl.google_pay.flow.b f326718x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f326719y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(com.revolut.feature.topup_screen.impl.google_pay.flow.b bVar, gim.c cVar) {
        super(cVar);
        this.f326718x = bVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f326717w = obj2;
        this.f326719y |= Integer.MIN_VALUE;
        return this.f326718x.M2(null, null, this);
    }
}
