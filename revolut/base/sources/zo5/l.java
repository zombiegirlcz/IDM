package zo5;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.crypto.withdraw.impl.ui_v3.addbeneficiary.createbeneficiary.CryptoCreateBeneficiaryScreenContract$InputData;
import java.util.Set;
import yo5.w;
import z0g.k0;

/* JADX INFO: loaded from: classes3.dex */
public final class l implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f323922a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CryptoCreateBeneficiaryScreenContract$InputData f323923b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f323924c;
    public final e4m.e d;
    public final e4m.e e;

    public l(d dVar, CryptoCreateBeneficiaryScreenContract$InputData cryptoCreateBeneficiaryScreenContract$InputData) {
        this.f323924c = dVar;
        this.f323923b = cryptoCreateBeneficiaryScreenContract$InputData;
        int i = 25;
        this.d = e4m.b.b(new k0(dVar, this, 1, i));
        this.e = e4m.b.b(new k0(dVar, this, 0, i));
    }

    public final bq5.c b() {
        switch (this.f323922a) {
            case 0:
                mo5.a aVarC = ((w) this.f323924c.f323886b).c();
                vc.s.j(aVarC);
                return new bq5.c(aVarC);
            default:
                mo5.a aVarC2 = ((w) this.f323924c.f323886b).c();
                vc.s.j(aVarC2);
                return new bq5.c(aVarC2);
        }
    }

    @Override // xki.e
    public final Set f() {
        switch (this.f323922a) {
        }
        return ImmutableSet.of();
    }

    @Override // xki.e
    public final Set g() {
        switch (this.f323922a) {
        }
        return ImmutableSet.of();
    }

    public l(d dVar, f fVar, CryptoCreateBeneficiaryScreenContract$InputData cryptoCreateBeneficiaryScreenContract$InputData) {
        this.f323924c = dVar;
        this.f323923b = cryptoCreateBeneficiaryScreenContract$InputData;
        int i = 24;
        this.d = e4m.b.b(new k0(dVar, this, 1, i));
        this.e = e4m.b.b(new k0(dVar, this, 0, i));
    }
}
