package jcc;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.revolutpay.promoted_merchants.impl.ui.promotedmerchants.list.RevolutPayPromotedMerchantsControllerContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;
import yji.n;

/* JADX INFO: loaded from: classes6.dex */
public final class f implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RevolutPayPromotedMerchantsControllerContract$InputData f172783a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f172784b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f172785c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f172786g;

    public f(e eVar, ViewController viewController, RevolutPayPromotedMerchantsControllerContract$InputData revolutPayPromotedMerchantsControllerContract$InputData) {
        this.f172784b = eVar;
        this.f172783a = revolutPayPromotedMerchantsControllerContract$InputData;
        this.f172785c = e4m.b.b(new iwb.b(eVar, this, 1, 26));
        this.d = e4m.b.b(e4m.c.a(viewController));
        int i = 26;
        this.e = e4m.b.b(new iwb.b(eVar, this, 2, i));
        this.f = e4m.b.b(new iwb.b(eVar, this, 3, i));
        this.f172786g = e4m.b.b(new iwb.b(eVar, this, 0, i));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((n) this.f172784b.v.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }
}
