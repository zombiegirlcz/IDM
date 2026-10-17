package yxc;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit.models.q0;
import com.revolut.feature.be_driven_design.models.domain.SectionContent;
import com.revolut.feature.be_driven_design.models.domain.Step;
import com.revolut.feature.selfserve.entity.config.shared.R$string;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class s implements z9l.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l80.e f317655a;

    public s(l80.e dateProvider) {
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        this.f317655a = dateProvider;
    }

    public final Clause a(SectionContent.ProgressionSteps progress, Step step) {
        Intrinsics.checkNotNullParameter(progress, "progress");
        Intrinsics.checkNotNullParameter(step, "step");
        Long l2 = step.f64196c;
        if (l2 == null) {
            return null;
        }
        long jLongValue = l2.longValue();
        return progress.d < progress.f64180c.indexOf(step) ? new TextLocalisedClause(R$string.selfserve_progression_estimated, zhm.u.c(new TimeClause(jLongValue, new TimeClause.Format.Pretty(q0.ONLY_DATE), null, null, 12)), null, 12) : ((l80.f) this.f317655a).c(jLongValue) ? new TimeClause(jLongValue, new TimeClause.Format.Pretty(0), null, null, 12) : new TimeClause(jLongValue, new TimeClause.Format.Pretty(q0.ONLY_DATE), null, null, 12);
    }
}
