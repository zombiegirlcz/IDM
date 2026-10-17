package dec;

import com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.PaymentMethod;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes6.dex */
public final class j {
    public static md6.b a(PaymentMethod.Pocket pocket) {
        md6.e eVar;
        com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.i iVar = pocket.f84378c;
        com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.j jVar = pocket.f;
        com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.e eVar2 = pocket.f84379g;
        switch (i.f113368a[iVar.ordinal()]) {
            case 1:
                int i = i.f113369b[eVar2.ordinal()];
                if (i == 1) {
                    eVar = jVar != com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.j.PERSONAL_JOINT ? md6.e.CURRENCY : md6.e.JOINT;
                } else if (i == 2) {
                    eVar = md6.e.CRYPTO;
                } else {
                    if (i != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    eVar = md6.e.CURRENCY;
                }
                break;
            case 2:
                eVar = jVar != com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.j.PERSONAL_JOINT ? md6.e.PERSONAL_SUBACCOUNT : md6.e.JOINT_SUBACCOUNT;
                break;
            case 3:
            case 4:
                eVar = jVar != com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.j.PERSONAL_JOINT ? md6.e.SAVINGS : md6.e.JOINT_SAVINGS;
                break;
            case 5:
                eVar = md6.e.CREDIT;
                break;
            case 6:
                eVar = eVar2 != com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.e.FIAT ? null : md6.e.PRO;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        if (eVar == null) {
            return null;
        }
        md6.j jVar2 = md6.o.Companion;
        xi0.b bVar = pocket.i.f115083b;
        jVar2.getClass();
        return new md6.b(eVar, bVar != null ? new md6.n(bVar) : md6.m.f204493a, md6.d.OPENED, md6.f.SIMPLE);
    }
}
