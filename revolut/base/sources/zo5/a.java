package zo5;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.crypto.withdraw.api.navigation.CryptoAddBeneficiaryInput;
import java.util.Set;
import z0g.k0;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements xki.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CryptoAddBeneficiaryInput f323874a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f323875b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f323876c;
    public final e4m.e d;

    public a(d dVar, CryptoAddBeneficiaryInput cryptoAddBeneficiaryInput) {
        this.f323875b = dVar;
        this.f323874a = cryptoAddBeneficiaryInput;
        int i = 21;
        this.f323876c = e4m.b.b(new k0(dVar, this, 1, i));
        this.d = e4m.b.b(new k0(dVar, this, 0, i));
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
