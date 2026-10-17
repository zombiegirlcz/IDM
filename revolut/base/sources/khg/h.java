package khg;

import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.data.model.Data;
import hfg.f0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class h implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f184122a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f184123b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f0 f184124c;
    public final AnalyticsContext d;

    public h(Data flightDetails, Data milesProviderData, f0 f0Var, AnalyticsContext analyticsContext) {
        Intrinsics.checkNotNullParameter(flightDetails, "flightDetails");
        Intrinsics.checkNotNullParameter(milesProviderData, "milesProviderData");
        this.f184122a = flightDetails;
        this.f184123b = milesProviderData;
        this.f184124c = f0Var;
        this.d = analyticsContext;
    }

    public static h a(h hVar, Data flightDetails, Data milesProviderData, f0 f0Var, AnalyticsContext analyticsContext, int i) {
        if ((i & 1) != 0) {
            flightDetails = hVar.f184122a;
        }
        if ((i & 2) != 0) {
            milesProviderData = hVar.f184123b;
        }
        if ((i & 4) != 0) {
            f0Var = hVar.f184124c;
        }
        if ((i & 8) != 0) {
            analyticsContext = hVar.d;
        }
        hVar.getClass();
        Intrinsics.checkNotNullParameter(flightDetails, "flightDetails");
        Intrinsics.checkNotNullParameter(milesProviderData, "milesProviderData");
        return new h(flightDetails, milesProviderData, f0Var, analyticsContext);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f184122a, hVar.f184122a) && Intrinsics.f(this.f184123b, hVar.f184123b) && Intrinsics.f(this.f184124c, hVar.f184124c) && Intrinsics.f(this.d, hVar.d);
    }

    public final int hashCode() {
        int iC = kii.e.c(this.f184123b, this.f184122a.hashCode() * 31, 31);
        f0 f0Var = this.f184124c;
        int iHashCode = (iC + (f0Var == null ? 0 : f0Var.hashCode())) * 31;
        AnalyticsContext analyticsContext = this.d;
        return iHashCode + (analyticsContext != null ? AnalyticsContext.a(analyticsContext.f50296a) : 0);
    }
}
