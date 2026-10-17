package dv9;

import com.revolut.domain.models.moneyrequest.MoneyRequest;
import com.revolut.domain.models.moneyrequest.MoneyRequestDirection;
import com.revolut.feature.payments.messaging.data.api.model.DonationItem;
import com.revolut.feature.payments.messaging.data.api.model.MoneyRequestItem;
import com.revolut.feature.payments.messaging.data.api.model.P2PChatItem;
import com.revolut.feature.payments.messaging.data.api.model.TransactionItem;
import com.revolut.feature.payments.messaging.data.api.model.TransferLinkItem;
import com.revolut.feature.transfer.core.models.CountryProfile;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;
import tof.a3;
import tof.v6;
import tof.x6;

/* JADX INFO: loaded from: classes5.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Set f118061a;

    static {
        v6[] elements = {v6.PENDING, v6.CANCELLED};
        Intrinsics.checkNotNullParameter(elements, "elements");
        f118061a = kotlin.collections.d.y0(elements);
    }

    private b() {
    }

    public static MoneyRequestItem a(MoneyRequest moneyRequest, String str, CountryProfile countryProfile) {
        Intrinsics.checkNotNullParameter(moneyRequest, "moneyRequest");
        n nVar = moneyRequest.f60322n == MoneyRequestDirection.INCOMING ? n.INCOMING : n.OUTGOING;
        String str2 = moneyRequest.f60314a;
        DateTime dateTime = moneyRequest.f60319j;
        dj0.d dVar = moneyRequest.d;
        String str3 = moneyRequest.e;
        String str4 = moneyRequest.f;
        if (nVar != n.OUTGOING) {
            str = null;
        }
        return new MoneyRequestItem(str2, dateTime, nVar, dVar, str3, str4, moneyRequest, str, countryProfile);
    }

    public static P2PChatItem b(a3 transaction, CountryProfile countryProfile) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        x6 x6Var = transaction.I;
        DateTime dateTime = transaction.f272593h;
        String str = x6Var.f273161a;
        if (str != null && f118061a.contains(transaction.f)) {
            String str2 = transaction.f272579a;
            dj0.d dVar = transaction.k;
            return new TransferLinkItem(str2, dateTime, dVar.f115082a > 0 ? n.INCOMING : n.OUTGOING, dVar, transaction.f272614t, x6Var.f273162b, transaction, str, countryProfile);
        }
        if (k71.k.K0(transaction)) {
            return new DonationItem(transaction.f272579a, dateTime, transaction.k, transaction, countryProfile);
        }
        String str3 = transaction.f272579a;
        dj0.d dVar2 = transaction.k;
        return new TransactionItem(str3, dateTime, dVar2.f115082a > 0 ? n.INCOMING : n.OUTGOING, dVar2, transaction.f272614t, x6Var.f273162b, transaction, countryProfile);
    }
}
