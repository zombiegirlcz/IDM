package pkf;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.ProgressStepVerticalV2Delegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.feature.transactions.impl.R$string;
import com.revolut.revolut.feature_fourthline_impl.R;
import ip0.c50;
import ip0.f50;
import ip0.g50;
import ip0.h50;
import ip0.j50;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;
import tof.a3;
import tof.p3;

/* JADX INFO: loaded from: classes8.dex */
public final class h1 {

    @NotNull
    public static final f1 Companion = new f1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Set f237064b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sj5.a f237065a;

    static {
        yk5.e[] elements = {yk5.e.INVESTIGATION, yk5.e.FROZEN, yk5.e.SCREENING};
        Intrinsics.checkNotNullParameter(elements, "elements");
        f237064b = kotlin.collections.d.y0(elements);
    }

    public h1(sj5.a depositTransactionStateChecker) {
        Intrinsics.checkNotNullParameter(depositTransactionStateChecker, "depositTransactionStateChecker");
        this.f237065a = depositTransactionStateChecker;
    }

    public static ProgressStepVerticalV2Delegate.Model a() {
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.transaction_details_cryptodeposit_transfer_deposit_funds_returned_text, null, null, 14);
        m70.a.c(kotlin.jvm.internal.t0.f186434a);
        return new ProgressStepVerticalV2Delegate.Model("DEPOSIT_TRACKING_SECOND_STEP_ID", textLocalisedClause, new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new g50(c50.LAST), false, null, 0, 0, 0, null, false, false, 32752);
    }

    public static TimeClause b(cmf.d dVar) {
        Long lH = dVar.a().h();
        return new TimeClause(lH != null ? lH.longValue() : dVar.f25224a.i.getMillis(), new TimeClause.Format.Pretty(0), null, null, 12);
    }

    public static List c(cmf.d dVar) {
        a3 a3Var = dVar.f25224a;
        p3 p3Var = a3Var.W;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.transaction_details_cryptodeposit_transfer_processing_completed_title, null, null, 14);
        j50 j50Var = j50.FAILED;
        ProgressStepVerticalV2Delegate.Model modelD = d(a3Var, textLocalisedClause, j50Var);
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.transaction_details_cryptodeposit_transfer_deposit_transfer_failed_text, null, null, 14);
        DateTime dateTime = a3Var.f272596j;
        TimeClause timeClause = new TimeClause(dateTime != null ? dateTime.getMillis() : a3Var.i.getMillis(), new TimeClause.Format.Pretty(0), null, null, 12);
        TextLocalisedClause[] elements = {new TextLocalisedClause(R$string.transaction_details_cryptodeposit_transfer_deposit_blockchain_rejected_text, null, null, 14), null};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return zhm.v.k(modelD, e(textLocalisedClause2, h(timeClause, yoj.b.m(new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), kotlin.collections.d.L(elements))), true, j50Var));
    }

    public static ProgressStepVerticalV2Delegate.Model d(a3 a3Var, TextLocalisedClause textLocalisedClause, j50 j50Var) {
        return g("DEPOSIT_TRACKING_FIRST_STEP_ID", textLocalisedClause, new TimeClause(a3Var.f272591g.getMillis(), new TimeClause.Format.Pretty(0), null, null, 12), false, j50Var, c50.FIRST);
    }

    public static ProgressStepVerticalV2Delegate.Model e(TextLocalisedClause textLocalisedClause, Clause clause, boolean z, j50 j50Var) {
        return g("DEPOSIT_TRACKING_SECOND_STEP_ID", textLocalisedClause, clause, z, j50Var, z ? c50.LAST : c50.MIDDLE);
    }

    public static /* synthetic */ ProgressStepVerticalV2Delegate.Model f(h1 h1Var, TextLocalisedClause textLocalisedClause, TimeClause timeClause, j50 j50Var) {
        h1Var.getClass();
        return e(textLocalisedClause, timeClause, false, j50Var);
    }

    public static ProgressStepVerticalV2Delegate.Model g(String str, TextLocalisedClause textLocalisedClause, Clause clause, boolean z, j50 j50Var, c50 c50Var) {
        return new ProgressStepVerticalV2Delegate.Model(str, textLocalisedClause, clause, z ? new f50(j50Var, c50.LAST, false) : new h50(j50Var, c50Var), false, null, 0, 0, 0, null, false, false, 32752);
    }

    public static CompositeClause h(Clause... clauseArr) {
        return v1.c.f(zhm.v.m(Arrays.copyOf(clauseArr, clauseArr.length)), null);
    }

    public static ProgressStepVerticalV2Delegate.Model i(TextLocalisedClause textLocalisedClause, CompositeClause compositeClause, j50 j50Var) {
        return g("DEPOSIT_TRACKING_THIRD_STEP_ID", textLocalisedClause, compositeClause, true, j50Var, c50.LAST);
    }

    public static ProgressStepVerticalV2Delegate.Model j(cmf.d dVar, j50 j50Var) {
        return g("DEPOSIT_TRACKING_FIRST_STEP_ID", new TextLocalisedClause(R$string.transaction_details_cryptodeposit_funds_rejected_text, null, null, 14), h(new TimeClause(dVar.f25224a.i.getMillis(), new TimeClause.Format.Pretty(0), null, null, 12), yoj.b.m(new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), zhm.v.k(new TextLocalisedClause(R$string.transaction_details_cryptodeposit_unsupported_text, null, null, 14), new TextLocalisedClause(R.string.common_action_learn_more, null, new Click(30, (Integer) null, (Object) null, "UNSUPPORTED_ASSET_LEARN_MORE_CLICK_ID", false), 10)))), false, j50Var, c50.FIRST);
    }
}
