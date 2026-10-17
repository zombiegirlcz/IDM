package fn5;

import android.content.Context;
import io3.k;
import java.math.BigDecimal;
import java.util.Set;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import vkm.q;
import yfe.e1;

/* JADX INFO: loaded from: classes3.dex */
public final class j implements e1 {

    @NotNull
    private static final e Companion = new e();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final BigDecimal f136538j = new BigDecimal(100);
    public static final n9l.b k = n9l.b.SEC_10;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final Set f136539l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xh5.a f136540a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wsg.b f136541b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final mu5.f f136542c;
    public final ur5.c d;
    public final ppk.f e;
    public final Context f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ty0.c f136543g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final gte.a f136544h;
    public final Lazy i;

    static {
        k[] elements = {k.ACTIVE, k.INACTIVE};
        Intrinsics.checkNotNullParameter(elements, "elements");
        f136539l = kotlin.collections.d.y0(elements);
    }

    public j(xh5.a cryptoFeatureEnabledInteractor, wsg.b walletsInteractor, mu5.f cryptoInvestmentsInteractor, ur5.c revolutXFiatBalanceInteractor, wt5.a cryptoInvestmentsCalculations, ppk.f ratesInteractor, Context context, ty0.c clauseDisplayer, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(cryptoFeatureEnabledInteractor, "cryptoFeatureEnabledInteractor");
        Intrinsics.checkNotNullParameter(walletsInteractor, "walletsInteractor");
        Intrinsics.checkNotNullParameter(cryptoInvestmentsInteractor, "cryptoInvestmentsInteractor");
        Intrinsics.checkNotNullParameter(revolutXFiatBalanceInteractor, "revolutXFiatBalanceInteractor");
        Intrinsics.checkNotNullParameter(cryptoInvestmentsCalculations, "cryptoInvestmentsCalculations");
        Intrinsics.checkNotNullParameter(ratesInteractor, "ratesInteractor");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(clauseDisplayer, "clauseDisplayer");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f136540a = cryptoFeatureEnabledInteractor;
        this.f136541b = walletsInteractor;
        this.f136542c = cryptoInvestmentsInteractor;
        this.d = revolutXFiatBalanceInteractor;
        this.e = ratesInteractor;
        this.f = context;
        this.f136543g = clauseDisplayer;
        this.f136544h = featureToggleInteractor;
        this.i = yhm.j.b(new es.e(this, 26));
    }

    @Override // yfe.e1
    public final Flow a(sfe.a dataLoadingMode) {
        Intrinsics.checkNotNullParameter(dataLoadingMode, "dataLoadingMode");
        return q.q(q.Q(q.q(rd0.e.b(zi0.c.q(((ji5.e) this.f136540a).f(), yh5.a.FEATURE_UNAVAILABLE))), new g(null, this, dataLoadingMode, 0)));
    }
}
