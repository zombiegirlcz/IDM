package fyg;

import aw0.a5;
import aw0.d5;
import aw0.t5;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit_resources.R$attr;
import gyg.m;
import ip0.ui;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import te0.w;
import uyg.h;
import zhm.f0;
import zhm.u;

/* JADX INFO: loaded from: classes9.dex */
public final class g implements a {

    @NotNull
    public static final f Companion = new f();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kxg.b f138991a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f138992b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h f138993c;
    public final gte.a d;
    public final Object e;

    public g(kxg.b chartMapper, m barChartMapper, h allocationMapper, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(chartMapper, "chartMapper");
        Intrinsics.checkNotNullParameter(barChartMapper, "barChartMapper");
        Intrinsics.checkNotNullParameter(allocationMapper, "allocationMapper");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f138991a = chartMapper;
        this.f138992b = barChartMapper;
        this.f138993c = allocationMapper;
        this.d = featureToggleInteractor;
        this.e = w.y0(new fp3.a(this, 11));
    }

    public final List a(xi0.b bVar) {
        f0 f0Var = f0.f322471a;
        d5 d5VarE = this.f138992b.e();
        int i = R$attr.uikit_dp16;
        return u.c(new ui("BAR_CHART_LIST_ID", f0Var, null, new t5(u.c(new a5(BitmapDescriptorFactory.HUE_RED, new MoneyClause(new dj0.d(0L, bVar), new MoneyClause.Format.Shorts(false, 63), null, null, 12)))), false, null, d5VarE, i, i, i, 14316));
    }
}
