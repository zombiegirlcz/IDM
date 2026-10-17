package ua2;

import cli.y;
import com.revolut.data.model.Data;
import com.revolut.domain.models.beneficiary.BeneficiarySpecialPurpose;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import u7k.f0;
import ua2.e;

/* JADX INFO: loaded from: classes20.dex */
public final class t extends oki.h implements g {
    public final fl3.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final o71.a f278533p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final x2k.e f278534q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final y f278535r;

    public t(fl3.a contactsRepository, o71.a beneficiaryRepository, x2k.e paymentsBankTransferNaviCommandProvider, cli.n stateMapper) {
        Intrinsics.checkNotNullParameter(contactsRepository, "contactsRepository");
        Intrinsics.checkNotNullParameter(beneficiaryRepository, "beneficiaryRepository");
        Intrinsics.checkNotNullParameter(paymentsBankTransferNaviCommandProvider, "paymentsBankTransferNaviCommandProvider");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = contactsRepository;
        this.f278533p = beneficiaryRepository;
        this.f278534q = paymentsBankTransferNaviCommandProvider;
        this.f278535r = mra.d.b(this, new d(new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), ""), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        yji.l.a1(this, rd0.e.b(((sl3.k) this.o).g()), null, null, new s(this, null, 0), 3);
        yji.l.a1(this, rd0.e.b(o71.a.b(this.f278533p, BeneficiarySpecialPurpose.PAYID_ALIAS, null, 13)), null, null, new s(this, null, 1), 3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void I2(n event) {
        String str;
        Intrinsics.checkNotNullParameter(event, "event");
        if (event instanceof m) {
            B2();
            return;
        }
        if (event instanceof j) {
            C2(e.a.f278521a);
            return;
        }
        String str2 = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        if (!(event instanceof i)) {
            if (event instanceof h) {
                l2(new f0(this, ((h) event).f278523a, objArr2 == true ? 1 : 0, 12), new yi5.b(26));
                return;
            } else if (event instanceof k) {
                l2(new u07.b(this, objArr == true ? 1 : 0, 18), new yi5.b(26));
                return;
            } else {
                if (!(event instanceof l)) {
                    throw new NoWhenBranchMatchedException();
                }
                H2(this.f278535r, new u6b.k(event, 15));
                return;
            }
        }
        zm3.a aVar = ((i) event).f278524a;
        zm3.f fVar = aVar instanceof zm3.f ? (zm3.f) aVar : null;
        if (fVar == null || (str = fVar.f323345a) == null) {
            zm3.e eVar = aVar instanceof zm3.e ? (zm3.e) aVar : null;
            if (eVar != null) {
                str2 = eVar.f323340a;
            }
        } else {
            str2 = str;
        }
        if (str2 != null) {
            C2(new f(str2));
        }
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f278535r;
    }
}
