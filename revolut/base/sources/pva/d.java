package pva;

import com.revolut.core.model.account.AccountId;
import com.revolut.feature_crypto_order_details.api.navigation.CryptoOrderDetailsInputData;
import efm.d0;
import kotlin.jvm.internal.Intrinsics;
import l80.e;
import l80.f;
import pth.m;
import qua.p;
import qua.u;
import ufm.i;
import wsg.n;
import yua.q;

/* JADX INFO: loaded from: classes5.dex */
public final class d implements iva.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f240040a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xua.a f240041b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f240042c;

    public d(n walletInteractor, xua.a recurringPaymentInteractor, e dateProvider, xh5.a cryptoFeatureEnabledInteractor) {
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(recurringPaymentInteractor, "recurringPaymentInteractor");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        Intrinsics.checkNotNullParameter(cryptoFeatureEnabledInteractor, "cryptoFeatureEnabledInteractor");
        this.f240040a = walletInteractor;
        this.f240041b = recurringPaymentInteractor;
        this.f240042c = dateProvider;
    }

    public final CryptoOrderDetailsInputData.RecurringInputData a(p payment) {
        Intrinsics.checkNotNullParameter(payment, "payment");
        wua.a aVar = payment.f249328q;
        if (aVar == null) {
            return null;
        }
        String str = payment.f249314a.f160150a;
        boolean zI = u.i(payment, ((f) this.f240042c).g());
        Long l2 = payment.f249323j;
        if (l2 == null) {
            return null;
        }
        long jLongValue = l2.longValue();
        xi0.a aVar2 = xi0.b.Companion;
        String str2 = payment.i;
        aVar2.getClass();
        return new CryptoOrderDetailsInputData.RecurringInputData(str, zI, jLongValue, xi0.a.a(str2), aVar.f300092a, xi0.a.a(aVar.f300093b));
    }

    public final i b(p recurringPayment) {
        Intrinsics.checkNotNullParameter(recurringPayment, "recurringPayment");
        String str = recurringPayment.f249318c;
        if (str == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        d0 d0VarZ = this.f240040a.z(AccountId.Personal.f51414a, str);
        prl.n nVar = new prl.n(28, new m(this, recurringPayment, 2));
        d0VarZ.getClass();
        i iVar = new i(d0VarZ, nVar, 1);
        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
        return iVar;
    }

    public final i c(String recurringPaymentId) {
        Intrinsics.checkNotNullParameter(recurringPaymentId, "recurringPaymentId");
        d0 d0VarFirstOrError = m70.a.g(((q) this.f240041b).o(recurringPaymentId), null, new psl.m(24), 1).firstOrError();
        c cVar = new c(0, new m(this, recurringPaymentId, 3));
        d0VarFirstOrError.getClass();
        i iVar = new i(d0VarFirstOrError, cVar, 1);
        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
        return iVar;
    }
}
