package qf1;

import android.os.Parcelable;
import com.revolut.analytics.ads.model.ViewableRecordItem$Type;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class q implements zn.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f245228a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f245229b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AnalyticsContext f245230c;
    public final Integer d;
    public final ViewableRecordItem$Type.ViewableRecord e;

    public /* synthetic */ q(String str, AnalyticsContext analyticsContext) {
        this(o.f245227a, str, analyticsContext, null);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q)) {
            return false;
        }
        q qVar = (q) obj2;
        return Intrinsics.f(this.f245228a, qVar.f245228a) && Intrinsics.f(this.f245229b, qVar.f245229b) && Intrinsics.f(this.f245230c, qVar.f245230c) && Intrinsics.f(this.d, qVar.d);
    }

    @Override // zn.d
    /* JADX INFO: renamed from: getAnalyticsContext */
    public final Parcelable getD() {
        return this.f245230c;
    }

    @Override // zn.d
    /* JADX INFO: renamed from: getIdentifier */
    public final String getF100566c() {
        return this.f245229b;
    }

    public final int hashCode() {
        int iC = p.a.c(this.f245228a.hashCode() * 31, 31, this.f245229b);
        AnalyticsContext analyticsContext = this.f245230c;
        int iA = (iC + (analyticsContext == null ? 0 : AnalyticsContext.a(analyticsContext.f50296a))) * 31;
        Integer num = this.d;
        return iA + (num != null ? num.hashCode() : 0);
    }

    @Override // zn.d
    /* JADX INFO: renamed from: p0 */
    public final ViewableRecordItem$Type getE() {
        return this.e;
    }

    public q(p payload, String identifier, AnalyticsContext analyticsContext, Integer num) {
        Intrinsics.checkNotNullParameter(payload, "payload");
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        this.f245228a = payload;
        this.f245229b = identifier;
        this.f245230c = analyticsContext;
        this.d = num;
        this.e = new ViewableRecordItem$Type.ViewableRecord(num);
    }
}
