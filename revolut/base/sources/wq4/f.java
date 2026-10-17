package wq4;

import cm4.p;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.credit.core.R$string;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class f extends h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f299409a;

    public f(p paymentData) {
        Intrinsics.checkNotNullParameter(paymentData, "paymentData");
        this.f299409a = paymentData;
    }

    @Override // wq4.i
    public final List a() {
        p pVar = this.f299409a;
        CellDetailsDelegate.Model modelE = h.e(pVar);
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.credit_management_overview_overdue_subtitle, null, null, 14);
        xi0.b currency = pVar.f25135g;
        Long l2 = pVar.i;
        if (l2 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        long jLongValue = l2.longValue();
        Intrinsics.checkNotNullParameter(currency, "currency");
        qv0.i[] elements = {modelE, h.b("id_cc_overdue", textLocalisedClause, sx4.f.b(3, null, null, new dj0.d(jLongValue, currency))), h.c(pVar), h.d(pVar), h.f(pVar)};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return kotlin.collections.d.L(elements);
    }
}
