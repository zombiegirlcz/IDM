package j54;

import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.feature.credit.application.models.plugins.EntryPointParams;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f171592a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f171593b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final wi0.b f171594c;
    public final boolean d;
    public final EntryPointParams e;
    public final AnalyticsContext f;

    public z0(String workflowId, String applicationId, wi0.b countryCode, boolean z, EntryPointParams entryPointParams, AnalyticsContext analyticsContext) {
        Intrinsics.checkNotNullParameter(workflowId, "workflowId");
        Intrinsics.checkNotNullParameter(applicationId, "applicationId");
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        Intrinsics.checkNotNullParameter(entryPointParams, "entryPointParams");
        this.f171592a = workflowId;
        this.f171593b = applicationId;
        this.f171594c = countryCode;
        this.d = z;
        this.e = entryPointParams;
        this.f = analyticsContext;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof z0)) {
            return false;
        }
        z0 z0Var = (z0) obj2;
        return Intrinsics.f(this.f171592a, z0Var.f171592a) && Intrinsics.f(this.f171593b, z0Var.f171593b) && Intrinsics.f(this.f171594c, z0Var.f171594c) && this.d == z0Var.d && Intrinsics.f(this.e, z0Var.e) && Intrinsics.f(this.f, z0Var.f);
    }

    public final int hashCode() {
        int iHashCode = (this.e.hashCode() + j6.a.c(p.a.c(p.a.c(this.f171592a.hashCode() * 31, 31, this.f171593b), 31, this.f171594c.f297794a), 31, this.d)) * 31;
        AnalyticsContext analyticsContext = this.f;
        return iHashCode + (analyticsContext == null ? 0 : AnalyticsContext.a(analyticsContext.f50296a));
    }
}
