package gnd;

import com.revolut.feature.categorisation.api.model.PeriodPreferenceType;
import com.revolut.feature.spending_analytics.api.declaration.AnalyticsFeatureConfig;
import com.revolut.feature.spending_analytics.api.models.NetWorthAccount;
import com.revolut.kompot.common.transition.ZoomTransitionAnimation;
import efm.d0;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import skm.p0;
import sri.m;
import te0.w;
import wp5.y;
import yld.g;

/* JADX INFO: loaded from: classes7.dex */
public final class e implements bmd.a {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f144963a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f0j.a f144964b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j0j.a f144965c;

    public e(m navigator, f0j.a travelInteractor, j0j.a tripsInteractor) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(travelInteractor, "travelInteractor");
        Intrinsics.checkNotNullParameter(tripsInteractor, "tripsInteractor");
        this.f144963a = navigator;
        this.f144964b = travelInteractor;
        this.f144965c = tripsInteractor;
    }

    public static PeriodPreferenceType b(jf0.c cVar) {
        String str = (String) cVar.d.get("view");
        if (str == null) {
            return null;
        }
        int iHashCode = str.hashCode();
        if (iHashCode == 3645428) {
            if (str.equals("week")) {
                return PeriodPreferenceType.WEEK;
            }
            return null;
        }
        if (iHashCode == 3704893) {
            if (str.equals("year")) {
                return PeriodPreferenceType.YEAR;
            }
            return null;
        }
        if (iHashCode == 104080000 && str.equals("month")) {
            return PeriodPreferenceType.MONTH;
        }
        return null;
    }

    public static q06.b c(boolean z) {
        if (z) {
            return new q06.b(ibb.c.f160140a, null);
        }
        return null;
    }

    public static a d(boolean z) {
        return new a(new AnalyticsFeatureConfig.Dashboard(0), new AnalyticsFeatureConfig.Dashboard.Destination((ZoomTransitionAnimation.Widgets) null, 3), c(z));
    }

    public static a g(boolean z) {
        g gVar = g.ASSET;
        return new a(new AnalyticsFeatureConfig.TotalWealthScreen(gVar, null, null), new AnalyticsFeatureConfig.TotalWealthScreen.Destination(gVar, NetWorthAccount.Personal.f87455a, null, null, null, 28), c(z));
    }

    public static a h(jf0.c cVar, boolean z) {
        return new a(new AnalyticsFeatureConfig.SpendingScreen((String) cVar.d.get("startDate"), b(cVar)), new AnalyticsFeatureConfig.SpendingScreen.Destination((String) cVar.d.get("startDate"), b(cVar), null), c(z));
    }

    @Override // jf0.d, q06.k
    public final boolean a(jf0.c cVar) {
        return y.D(cVar, "deeplink", 1, "networth-details") || Intrinsics.f(cVar.e(1), "analytics") || Intrinsics.f(cVar.e(1), "analytics-ccy") || Intrinsics.f(cVar.e(1), "spendings");
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0071, code lost:
    
        if (r8 == r1) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00a5, code lost:
    
        if (r8 == r1) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00a7, code lost:
    
        return r1;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // q06.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(jf0.c r7, kotlin.coroutines.Continuation r8) {
        /*
            Method dump skipped, instruction units count: 204
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: gnd.e.e(jf0.c, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // jf0.d
    public final d0 f(jf0.c deeplink, boolean z) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        return w.o0(p0.f264003c, new ald.m(deeplink, this, z, (Continuation) null, 21));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r10v15 */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r12v10, types: [int] */
    /* JADX WARN: Type inference failed for: r12v23 */
    /* JADX WARN: Type inference failed for: r12v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(jf0.c r10, boolean r11, gim.c r12) {
        /*
            Method dump skipped, instruction units count: 215
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: gnd.e.i(jf0.c, boolean, gim.c):java.lang.Object");
    }
}
