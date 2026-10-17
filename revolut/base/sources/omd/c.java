package omd;

import com.revolut.feature.spending_analytics.api.declaration.AnalyticsFeatureConfig;
import efm.d0;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import q06.h;
import sri.m;
import wp5.y;

/* JADX INFO: loaded from: classes7.dex */
public final class c implements bmd.c {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f226813a;

    public c(m navigator) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        this.f226813a = navigator;
    }

    @Override // jf0.d, q06.k
    public final boolean a(jf0.c cVar) {
        return y.D(cVar, "deeplink", 1, "income-sorters");
    }

    @Override // q06.k
    public final Object e(jf0.c cVar, Continuation continuation) {
        if (!Intrinsics.f(cVar.e(1), "income-sorters")) {
            return null;
        }
        String strE = cVar.e(2);
        if (Intrinsics.f(strE, "new")) {
            return new h(new AnalyticsFeatureConfig.IncomeSorterCreation.Destination((String) cVar.d.get("transactionId")), new q06.b(ibb.c.f160140a, null));
        }
        boolean zF = Intrinsics.f(strE, "executions");
        AnalyticsFeatureConfig.IncomeSortersList.Destination destination = AnalyticsFeatureConfig.IncomeSortersList.Destination.f87418a;
        if (!zF) {
            return strE.length() > 0 ? new h(new AnalyticsFeatureConfig.IncomeSorterDetails.Destination(cVar.e(2)), new q06.b(ibb.c.f160140a, null)) : new h(destination, new q06.b(ibb.c.f160140a, null));
        }
        String strE2 = cVar.e(3);
        return strE2.length() > 0 ? new h(new AnalyticsFeatureConfig.IncomeSorterExecutionScreen.Destination(strE2), new q06.b(ibb.c.f160140a, null)) : new h(destination, new q06.b(ibb.c.f160140a, null));
    }

    @Override // jf0.d
    public final d0 f(jf0.c deeplink, boolean z) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        ufm.c cVar = new ufm.c(new a6j.b(deeplink, this, z, 13), 2);
        Intrinsics.checkNotNullExpressionValue(cVar, "fromCallable(...)");
        return cVar;
    }
}
