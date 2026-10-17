package f6k;

import com.revolut.domain.models.moneyrequest.MoneyRequest;
import com.revolut.domain.models.moneyrequest.MoneyRequestChannel;
import com.revolut.domain.models.moneyrequest.MoneyRequestCounterParty;
import com.revolut.domain.models.moneyrequest.MoneyRequestDirection;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public abstract class a {
    public static final String a(MoneyRequest moneyRequest) {
        Intrinsics.checkNotNullParameter(moneyRequest, "<this>");
        MoneyRequestCounterParty moneyRequestCounterParty = moneyRequest.f60320l;
        if (moneyRequestCounterParty instanceof MoneyRequestCounterParty.Apm) {
            return ((MoneyRequestCounterParty.Apm) moneyRequestCounterParty).f60337a;
        }
        if (moneyRequestCounterParty instanceof MoneyRequestCounterParty.Revolut) {
            return ((MoneyRequestCounterParty.Revolut) moneyRequestCounterParty).e;
        }
        if (moneyRequestCounterParty instanceof MoneyRequestCounterParty.BankBeneficiary) {
            return ((MoneyRequestCounterParty.BankBeneficiary) moneyRequestCounterParty).f60340a;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final boolean b(MoneyRequest moneyRequest) {
        Intrinsics.checkNotNullParameter(moneyRequest, "<this>");
        return moneyRequest.f60322n == MoneyRequestDirection.INCOMING && moneyRequest.k != null;
    }

    public static final boolean c(MoneyRequest moneyRequest) {
        Intrinsics.checkNotNullParameter(moneyRequest, "<this>");
        return (moneyRequest.f60316c instanceof MoneyRequestChannel.APM) && moneyRequest.f60317g != null;
    }

    public static final boolean d(MoneyRequest moneyRequest) {
        Intrinsics.checkNotNullParameter(moneyRequest, "<this>");
        return moneyRequest.f60322n == MoneyRequestDirection.OUTGOING && moneyRequest.k == null;
    }

    public static final boolean e(MoneyRequest moneyRequest) {
        Intrinsics.checkNotNullParameter(moneyRequest, "<this>");
        return moneyRequest.f60322n == MoneyRequestDirection.OUTGOING && moneyRequest.k != null;
    }
}
