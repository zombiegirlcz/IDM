package jcc;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.revolutpay.promoted_merchants.impl.ui.promotedmerchants.search.RevolutPayMerchantsSearchControllerContract$InputData;
import java.util.Set;
import yji.n;

/* JADX INFO: loaded from: classes6.dex */
public final class d implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RevolutPayMerchantsSearchControllerContract$InputData f172765a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f172766b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f172767c;
    public final e4m.e d;
    public final e4m.e e;

    public d(e eVar, RevolutPayMerchantsSearchControllerContract$InputData revolutPayMerchantsSearchControllerContract$InputData) {
        this.f172766b = eVar;
        this.f172765a = revolutPayMerchantsSearchControllerContract$InputData;
        int i = 25;
        this.f172767c = e4m.b.b(new iwb.b(eVar, this, 1, i));
        this.d = e4m.b.b(new iwb.b(eVar, this, 2, i));
        this.e = e4m.b.b(new iwb.b(eVar, this, 0, i));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((n) this.f172766b.v.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }
}
