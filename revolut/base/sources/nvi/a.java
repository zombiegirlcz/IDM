package nvi;

import android.os.Parcelable;
import com.revolut.analytics.ads.model.ViewableRecordItem$Type;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.retail.feature.airport.security_fast_track.api.model.AsftPass;
import kotlin.jvm.internal.Intrinsics;
import zn.d;

/* JADX INFO: loaded from: classes10.dex */
public final class a implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AsftPass f219699a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f219700b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f219701c;
    public final AnalyticsContext d;
    public final ViewableRecordItem$Type.ViewableRecord e;

    public a(AsftPass pass, String termsUrl, String identifier, AnalyticsContext analyticsContext, ViewableRecordItem$Type.ViewableRecord viewableRecordType) {
        Intrinsics.checkNotNullParameter(pass, "pass");
        Intrinsics.checkNotNullParameter(termsUrl, "termsUrl");
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        Intrinsics.checkNotNullParameter(viewableRecordType, "viewableRecordType");
        this.f219699a = pass;
        this.f219700b = termsUrl;
        this.f219701c = identifier;
        this.d = analyticsContext;
        this.e = viewableRecordType;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return this.f219699a.equals(aVar.f219699a) && Intrinsics.f(this.f219700b, aVar.f219700b) && Intrinsics.f(this.f219701c, aVar.f219701c) && this.d.equals(aVar.d) && this.e.equals(aVar.e);
    }

    @Override // zn.d
    /* JADX INFO: renamed from: getAnalyticsContext */
    public final Parcelable getD() {
        return this.d;
    }

    @Override // zn.d
    /* JADX INFO: renamed from: getIdentifier */
    public final String getF100566c() {
        return this.f219701c;
    }

    public final int hashCode() {
        return this.e.hashCode() + ((AnalyticsContext.a(this.d.f50296a) + p.a.c(p.a.c(this.f219699a.hashCode() * 31, 31, this.f219700b), 31, this.f219701c)) * 31);
    }

    @Override // zn.d
    /* JADX INFO: renamed from: p0 */
    public final ViewableRecordItem$Type getE() {
        return this.e;
    }
}
