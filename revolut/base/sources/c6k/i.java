package c6k;

import bnf.r;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.retail.feature.payments.core.R$string;
import ip0.n40;
import ip0.o40;
import ip0.r40;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;
import thf.m;
import tof.h2;
import tof.j4;
import tof.v2;
import zhm.u;

/* JADX INFO: loaded from: classes11.dex */
public final class i extends g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f21820b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(a paymentTrackingDateFormatter, m transactionTextResourcesMapper) {
        super(paymentTrackingDateFormatter);
        Intrinsics.checkNotNullParameter(paymentTrackingDateFormatter, "paymentTrackingDateFormatter");
        Intrinsics.checkNotNullParameter(transactionTextResourcesMapper, "transactionTextResourcesMapper");
        this.f21820b = transactionTextResourcesMapper;
    }

    @Override // c6k.g
    public final r40 b(h2 step, j4 j4Var, v2 v2Var, z61.a aVar) {
        Intrinsics.checkNotNullParameter(step, "step");
        return new r40("VIEW_ID_TRACKER_ROW_1", null, new TextLocalisedClause(R$string.payment_link_tracker_title_created, null, null, 14), null, null, null, R$attr.uikit_colorRed, false, new o40(n40.PAST), 0, 0, 0, null, 16048);
    }

    @Override // c6k.g
    public final r40 d(h2 step, int i, v2 v2Var) {
        Intrinsics.checkNotNullParameter(step, "step");
        return new r40("VIEW_ID_TRACKER_ROW_1", c(step, true), new TextLocalisedClause(R$string.payment_link_tracker_title_created, null, null, 14), null, null, null, i, false, g.h(step), 0, 0, 0, null, 16048);
    }

    @Override // c6k.g
    public final r40 e(h2 step, h2 h2Var, int i, v2 v2Var) {
        Intrinsics.checkNotNullParameter(step, "step");
        Clause clauseC = c(step, true);
        DateTime dateTimeB = step.b();
        return new r40("VIEW_ID_TRACKER_ROW_1", clauseC, new TextLocalisedClause(R$string.payment_link_tracker_title_created, null, null, 14), dateTimeB != null ? new TextLocalisedClause(R$string.payment_link_tracker_created_subtitle_expiration, u.c(((r) this.f21820b).q(dateTimeB)), null, 12) : null, null, null, i, false, g.h(step), 0, 0, 0, null, 16048);
    }
}
