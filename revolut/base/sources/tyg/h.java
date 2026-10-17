package tyg;

import akg.n;
import com.revolut.feature.wealth.analytics.widgetised.navigation.WidgetisedAnalyticsType;
import ip0.jl;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import tx0.z4;

/* JADX INFO: loaded from: classes9.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xxg.a f275578a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f275579b;

    public h(xxg.a complexAnalyticsPortfolioAllocationProvider, j widgetisedProductConfigInteractor) {
        Intrinsics.checkNotNullParameter(complexAnalyticsPortfolioAllocationProvider, "complexAnalyticsPortfolioAllocationProvider");
        Intrinsics.checkNotNullParameter(widgetisedProductConfigInteractor, "widgetisedProductConfigInteractor");
        this.f275578a = complexAnalyticsPortfolioAllocationProvider;
        this.f275579b = widgetisedProductConfigInteractor;
    }

    public final n a(WidgetisedAnalyticsType analyticsType, vyg.a category) {
        boolean z;
        Intrinsics.checkNotNullParameter(analyticsType, "analyticsType");
        Intrinsics.checkNotNullParameter(category, "allocationCategory");
        boolean zG = this.f275579b.g(analyticsType);
        Continuation continuation = null;
        xxg.a aVar = this.f275578a;
        if (zG) {
            xxg.m mVar = (xxg.m) aVar;
            mVar.getClass();
            Intrinsics.checkNotNullParameter(category, "category");
            Intrinsics.checkNotNullParameter(analyticsType, "analyticsType");
            kwg.l lVar = mVar.f309524b;
            z = category == vyg.a.SECTOR;
            Intrinsics.checkNotNullParameter(analyticsType, "analyticsType");
            return nim.a.v(xam.a.h(new wo2.l(category, mVar, continuation, 17), rd0.e.b(lVar.f(new jl(lVar, analyticsType, z, 2)))), new tx.f(29));
        }
        xxg.m mVar2 = (xxg.m) aVar;
        mVar2.getClass();
        Intrinsics.checkNotNullParameter(category, "category");
        Intrinsics.checkNotNullParameter(analyticsType, "analyticsType");
        kwg.l lVar2 = mVar2.f309524b;
        z = category == vyg.a.SECTOR;
        Intrinsics.checkNotNullParameter(analyticsType, "analyticsType");
        return nim.a.v(xam.a.h(new z4(mVar2, analyticsType, category, continuation, 10), rd0.e.b(lVar2.e(analyticsType, new a4b.i(lVar2, z, analyticsType, 13)))), new g(0));
    }
}
