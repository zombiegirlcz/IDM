package b3j;

import com.google.common.collect.ImmutableSet;
import com.revolut.retail.feature.beneficiary.api.navigation.BeneficiaryCreationKompotInputData;
import java.util.Set;

/* JADX INFO: loaded from: classes10.dex */
public final class s implements xki.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BeneficiaryCreationKompotInputData f12092a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f12093b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f12094c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    public s(t tVar, BeneficiaryCreationKompotInputData beneficiaryCreationKompotInputData) {
        this.f12093b = tVar;
        this.f12092a = beneficiaryCreationKompotInputData;
        int i = 27;
        this.f12094c = e4m.b.b(new ak5.f(tVar, this, 2, i));
        this.d = e4m.b.b(new ak5.f(tVar, this, 1, i));
        this.e = e4m.b.b(new ak5.f(tVar, this, 0, i));
        this.f = e4m.b.b(new ak5.f(tVar, this, 3, i));
    }

    public final n4j.h b() {
        t tVar = this.f12093b;
        return new n4j.h(((c21.b) tVar.f12097c).a(), new zq.a(new usc.a((dnm.a) tVar.v.get()), (zzl.b) tVar.f12109w.get()), new n4j.j());
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.e.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }
}
