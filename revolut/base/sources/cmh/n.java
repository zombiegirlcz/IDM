package cmh;

import android.content.Context;
import au.c0;
import d4f.s;
import java.util.Set;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import ybl.p;
import yfe.e1;

/* JADX INFO: loaded from: classes10.dex */
public final class n implements e1 {

    @NotNull
    public static final k Companion = new k();
    public static final Set i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final tzg.l f25261a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s f25262b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final tzg.m f25263c;
    public final wsg.b d;
    public final Context e;
    public final ty0.c f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ijh.e f25264g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final adh.i f25265h;

    static {
        p[] elements = {p.TRADING, p.ROBO, p.COMMODITIES};
        Intrinsics.checkNotNullParameter(elements, "elements");
        i = kotlin.collections.d.y0(elements);
    }

    public n(tzg.l accountsBalanceInteractor, s wealthFeaturesInteractor, tzg.m wealthAccountsInteractor, wsg.b walletsInteractor, Context context, ty0.c clauseDisplayer, ijh.e accountsComparator, adh.i roboStrategiesToggleProvider) {
        Intrinsics.checkNotNullParameter(accountsBalanceInteractor, "accountsBalanceInteractor");
        Intrinsics.checkNotNullParameter(wealthFeaturesInteractor, "wealthFeaturesInteractor");
        Intrinsics.checkNotNullParameter(wealthAccountsInteractor, "wealthAccountsInteractor");
        Intrinsics.checkNotNullParameter(walletsInteractor, "walletsInteractor");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(clauseDisplayer, "clauseDisplayer");
        Intrinsics.checkNotNullParameter(accountsComparator, "accountsComparator");
        Intrinsics.checkNotNullParameter(roboStrategiesToggleProvider, "roboStrategiesToggleProvider");
        this.f25261a = accountsBalanceInteractor;
        this.f25262b = wealthFeaturesInteractor;
        this.f25263c = wealthAccountsInteractor;
        this.d = walletsInteractor;
        this.e = context;
        this.f = clauseDisplayer;
        this.f25264g = accountsComparator;
        this.f25265h = roboStrategiesToggleProvider;
    }

    @Override // yfe.e1
    public final Flow a(sfe.a dataLoadingMode) {
        Intrinsics.checkNotNullParameter(dataLoadingMode, "dataLoadingMode");
        return new a87.b(mo3.a.g(xam.a.h(new c0(this, dataLoadingMode, (Continuation) null, 1), nim.a.v(this.f25262b.a(i), new cmc.c(8))), null, new clk.b(7), 1), 6);
    }
}
