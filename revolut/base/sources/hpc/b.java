package hpc;

import aw0.o9;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import hx7.e;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import nmc.d;

/* JADX INFO: loaded from: classes6.dex */
public final class b implements s1h.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f154520a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gte.a f154521b;

    public b(d roboPortfolioUiMapper, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(roboPortfolioUiMapper, "roboPortfolioUiMapper");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f154520a = roboPortfolioUiMapper;
        this.f154521b = featureToggleInteractor;
    }

    public final TextClause a(a portfolioInfo) throws Throwable {
        Intrinsics.checkNotNullParameter(portfolioInfo, "portfolioInfo");
        if (portfolioInfo != null) {
            return this.f154520a.c(portfolioInfo.f154519a);
        }
        e.n(new IllegalArgumentException("Unsupported portfolio info type: " + portfolioInfo));
        return new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
    }
}
