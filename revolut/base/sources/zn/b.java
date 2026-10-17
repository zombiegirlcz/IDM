package zn;

import android.os.Parcelable;
import com.revolut.analytics.ads.model.ViewableRecordItem$Type;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class b implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f323633a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ViewableRecordItem$Type.ViewableRecord f323634b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AnalyticsContext f323635c;

    public b(String identifier, ViewableRecordItem$Type.ViewableRecord viewableRecordType, AnalyticsContext analyticsContext) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        Intrinsics.checkNotNullParameter(viewableRecordType, "viewableRecordType");
        this.f323633a = identifier;
        this.f323634b = viewableRecordType;
        this.f323635c = analyticsContext;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f323633a, bVar.f323633a) && this.f323634b.equals(bVar.f323634b) && this.f323635c.equals(bVar.f323635c);
    }

    @Override // zn.d
    /* JADX INFO: renamed from: getAnalyticsContext */
    public final Parcelable getD() {
        return this.f323635c;
    }

    @Override // zn.d
    /* JADX INFO: renamed from: getIdentifier */
    public final String getF100566c() {
        return this.f323633a;
    }

    public final int hashCode() {
        return AnalyticsContext.a(this.f323635c.f50296a) + ((this.f323634b.hashCode() + (this.f323633a.hashCode() * 31)) * 31);
    }

    @Override // zn.d
    /* JADX INFO: renamed from: p0 */
    public final ViewableRecordItem$Type getE() {
        return this.f323634b;
    }
}
