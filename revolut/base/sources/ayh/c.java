package ayh;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature_crypto_order_details.impl.ui.pager.CryptoOrderDetailsPagerFlowContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes10.dex */
public final class c implements xki.c, gyh.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CryptoOrderDetailsPagerFlowContract$InputData f11203a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f11204b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f11205c = this;
    public final e4m.e d;

    public c(b bVar, CryptoOrderDetailsPagerFlowContract$InputData cryptoOrderDetailsPagerFlowContract$InputData) {
        this.f11204b = bVar;
        this.f11203a = cryptoOrderDetailsPagerFlowContract$InputData;
        this.d = e4m.b.b(new a0b.a(bVar, this, 18));
    }

    @Override // gyh.c
    public final gyh.a b() {
        return new d(this.f11204b, this.f11205c);
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }
}
