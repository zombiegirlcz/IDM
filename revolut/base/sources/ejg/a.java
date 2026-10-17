package ejg;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.trusted_merchants.impl.ui.kompot.details.TrustedMerchantDetailsContract$InputData;
import dw3.w3;
import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
public final class a implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TrustedMerchantDetailsContract$InputData f126879a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f126880b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f126881c;

    public a(b bVar, d dVar, TrustedMerchantDetailsContract$InputData trustedMerchantDetailsContract$InputData) {
        this.f126880b = bVar;
        this.f126879a = trustedMerchantDetailsContract$InputData;
        this.f126881c = e4m.b.b(new w3(bVar, this, 16));
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
