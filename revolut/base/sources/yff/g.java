package yff;

import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class g implements jki.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f313337a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f313338b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f313339c;
    public final k d;
    public final AnalyticsContext e;
    public final boolean f;

    public g(String entityId, String str, Data troubleshooterList, k troubleshooterHeader, AnalyticsContext analyticsContext, boolean z) {
        Intrinsics.checkNotNullParameter(entityId, "entityId");
        Intrinsics.checkNotNullParameter(troubleshooterList, "troubleshooterList");
        Intrinsics.checkNotNullParameter(troubleshooterHeader, "troubleshooterHeader");
        this.f313337a = entityId;
        this.f313338b = str;
        this.f313339c = troubleshooterList;
        this.d = troubleshooterHeader;
        this.e = analyticsContext;
        this.f = z;
    }

    public static g a(g gVar, Data data, k kVar, AnalyticsContext analyticsContext, int i) {
        String entityId = gVar.f313337a;
        String str = gVar.f313338b;
        if ((i & 4) != 0) {
            data = gVar.f313339c;
        }
        Data troubleshooterList = data;
        if ((i & 8) != 0) {
            kVar = gVar.d;
        }
        k troubleshooterHeader = kVar;
        if ((i & 16) != 0) {
            analyticsContext = gVar.e;
        }
        boolean z = gVar.f;
        gVar.getClass();
        Intrinsics.checkNotNullParameter(entityId, "entityId");
        Intrinsics.checkNotNullParameter(troubleshooterList, "troubleshooterList");
        Intrinsics.checkNotNullParameter(troubleshooterHeader, "troubleshooterHeader");
        return new g(entityId, str, troubleshooterList, troubleshooterHeader, analyticsContext, z);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f313337a, gVar.f313337a) && Intrinsics.f(this.f313338b, gVar.f313338b) && Intrinsics.f(this.f313339c, gVar.f313339c) && Intrinsics.f(this.d, gVar.d) && Intrinsics.f(this.e, gVar.e) && this.f == gVar.f;
    }

    public final int hashCode() {
        int iHashCode = this.f313337a.hashCode() * 31;
        String str = this.f313338b;
        int iHashCode2 = (this.d.hashCode() + kii.e.c(this.f313339c, (iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31)) * 31;
        AnalyticsContext analyticsContext = this.e;
        return Boolean.hashCode(this.f) + ((iHashCode2 + (analyticsContext != null ? AnalyticsContext.a(analyticsContext.f50296a) : 0)) * 31);
    }
}
