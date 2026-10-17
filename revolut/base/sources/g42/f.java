package g42;

import aw0.o9;
import c12.m0;
import cli.n;
import cli.y;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.data.model.Data;
import com.revolut.feature.apm.core.models.onboarding.ApmOnboardingStatusTerms;
import com.revolut.feature.apm.core.ui.api.navigation.ApmRegistrationTermsScope$InputData;
import g1k.i;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import zhm.d0;

/* JADX INFO: loaded from: classes20.dex */
public final class f extends h implements dli.b {
    public final pre.c o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ApmRegistrationTermsScope$InputData f140328p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f140329q;

    public f(pre.c termsInteractor, ApmRegistrationTermsScope$InputData inputData, n stateMapper) {
        String str;
        Intrinsics.checkNotNullParameter(termsInteractor, "termsInteractor");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = termsInteractor;
        this.f140328p = inputData;
        ApmOnboardingStatusTerms apmOnboardingStatusTerms = (ApmOnboardingStatusTerms) d0.d0(inputData.f62275a);
        Data data = new Data(null, null, true, 3, null);
        TextClause textClause = null;
        TextClause textClause2 = apmOnboardingStatusTerms != null ? new TextClause(apmOnboardingStatusTerms.f61977a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null;
        if (apmOnboardingStatusTerms != null && (str = apmOnboardingStatusTerms.f61978b) != null) {
            textClause = new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        }
        this.f140329q = mra.d.b(this, new a(data, 0, textClause2, textClause), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        ApmRegistrationTermsScope$InputData apmRegistrationTermsScope$InputData = this.f140328p;
        if (apmRegistrationTermsScope$InputData.f62275a.isEmpty()) {
            C2(m0.f20343a);
        } else {
            l2(new i(this, (ApmOnboardingStatusTerms) apmRegistrationTermsScope$InputData.f62275a.get(0), null, 5), new yi5.b(26));
        }
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f140329q;
    }
}
