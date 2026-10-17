package zze;

import com.revolut.feature.topup_screen.api.google_pay.models.GooglePayFee;

/* JADX INFO: loaded from: classes8.dex */
public final class j extends gim.c {
    public ute.a u;
    public GooglePayFee v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public String f326720w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f326721x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.topup_screen.impl.google_pay.flow.b f326722y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(com.revolut.feature.topup_screen.impl.google_pay.flow.b bVar, gim.c cVar) {
        super(cVar);
        this.f326722y = bVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f326721x = obj2;
        this.z |= Integer.MIN_VALUE;
        return com.revolut.feature.topup_screen.impl.google_pay.flow.b.K2(this.f326722y, null, null, this);
    }
}
