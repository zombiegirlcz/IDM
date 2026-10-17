package wq4;

import cm4.p;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.credit.core.R$string;
import java.time.Duration;
import java.time.Instant;
import java.time.temporal.TemporalAmount;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.u;

/* JADX INFO: loaded from: classes22.dex */
public final class d extends h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f299407a;

    public d(p paymentData) {
        Intrinsics.checkNotNullParameter(paymentData, "paymentData");
        this.f299407a = paymentData;
    }

    @Override // wq4.i
    public final List a() {
        int i = R$string.credit_management_statement_dot_value;
        p pVar = this.f299407a;
        long j2 = pVar.f25133b;
        qv0.i[] elements = {new CellDetailsDelegate.Model("cc_first_statement", new TextLocalisedClause(i, u.c(h.h(Instant.ofEpochMilli(j2).minus((TemporalAmount) Duration.ofDays(1L)).toEpochMilli())), null, 12), h.g(j2), 0, null, null, null, null, null, false, 0, 0, 32760), h.c(pVar), new CellDetailsDelegate.Model("cc_first_payment", new TextLocalisedClause(R$string.credit_management_overview_payment_due, null, null, 14), h.g(pVar.f), 0, null, null, null, null, null, false, 0, 0, 32760)};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return kotlin.collections.d.L(elements);
    }
}
