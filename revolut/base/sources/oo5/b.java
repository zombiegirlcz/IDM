package oo5;

import aw0.o9;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.feature.crypto.remittance.models.CryptoAddressCounterparty;
import com.revolut.feature.crypto.withdraw.impl.R$string;
import dj0.d;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import wk5.e;
import wk5.f;
import wk5.g;
import zhm.v;

/* JADX INFO: loaded from: classes3.dex */
public abstract class b {
    public static final boolean a(CryptoAddressCounterparty cryptoAddressCounterparty) {
        Intrinsics.checkNotNullParameter(cryptoAddressCounterparty, "<this>");
        return cryptoAddressCounterparty.f70979c == g.PENDING_VALIDATION && cryptoAddressCounterparty.f70981h == f.PENDING && cryptoAddressCounterparty.i == e.MESH;
    }

    public static final CompositeClause b(long j2) {
        return yoj.b.m(new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), v.k(new TimeClause(j2, TimeClause.Format.DateLong.f57962b, null, null, 12), new TextLocalisedClause(R$string.crypto_send_limits_dialog_potential_fraud_at, null, null, 14), new TimeClause(j2, TimeClause.Format.TimeDefault.f57977b, null, null, 12)));
    }

    public static final MoneyClause c(d dVar, boolean z) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        return new MoneyClause(dVar, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, z ? o9.SENSITIVE : o9.NON_SENSITIVE, 4);
    }
}
