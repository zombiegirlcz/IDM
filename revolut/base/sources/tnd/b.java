package tnd;

import boh.f;
import com.revolut.data.model.Data;
import com.revolut.feature.spending_analytics.api.AnalyticsFeatureApi$Toggles;
import com.revolut.feature.spending_analytics.impl.ui.rev10.analytics_dashboard.dashboard.AnalyticsDashboardContract$InputData;
import com.revolut.feature.tab.accounts.models.ProductAccountDescriptor$Value;
import e5d.e;
import go.g;
import jte.d;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import l5d.i;
import om4.r0;
import org.jetbrains.annotations.NotNull;
import rnd.j;
import rnd.y;
import vkm.q;

/* JADX INFO: loaded from: classes7.dex */
public final class b implements e {

    @NotNull
    private static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final rpj.a f272424a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f272425b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final gte.a f272426c;
    public final AnalyticsDashboardContract$InputData d;

    public b(rpj.a analyticsAirTipInteractor, j analyticsAccountProvider, gte.a featureToggleInteractor, AnalyticsDashboardContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(analyticsAirTipInteractor, "analyticsAirTipInteractor");
        Intrinsics.checkNotNullParameter(analyticsAccountProvider, "analyticsAccountProvider");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f272424a = analyticsAirTipInteractor;
        this.f272425b = analyticsAccountProvider;
        this.f272426c = featureToggleInteractor;
        this.d = inputData;
    }

    @Override // e5d.e
    public final Object b(d5d.a aVar, i iVar) {
        Object objB = this.f272424a.f256397a.b(aVar.f111406a, iVar);
        fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
        if (objB != aVar2) {
            objB = Unit.f186387a;
        }
        return objB == aVar2 ? objB : Unit.f186387a;
    }

    @Override // e5d.e
    public final Flow c() {
        AnalyticsFeatureApi$Toggles.AnalyticsRevamp analyticsRevamp = AnalyticsFeatureApi$Toggles.AnalyticsRevamp.f87388c;
        d dVar = (d) this.f272426c;
        if (!dVar.c(analyticsRevamp) || !dVar.c(AnalyticsFeatureApi$Toggles.AnalyticsAirTip.f87383c)) {
            od0.i.Companion.getClass();
            return new g(new Data(od0.i.f224256b, null, false, 6, null), 2);
        }
        ProductAccountDescriptor$Value productAccountDescriptor$Value = this.d.f87523a;
        y yVar = (y) this.f272425b;
        return f.e(q.Q(yVar.f255654n, new r0(null, yVar, productAccountDescriptor$Value, 21)), new tjf.e(this, 17));
    }
}
