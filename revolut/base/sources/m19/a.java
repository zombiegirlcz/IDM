package m19;

import android.os.Parcelable;
import com.revolut.analytics.ads.model.ViewableRecordItem$Type;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class a implements com.revolut.analytics.ads.model.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f201289a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f201290b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f201291c;
    public final zn.c d;

    public a(String id10, String deeplink, String str, zn.c trackingItem) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        Intrinsics.checkNotNullParameter(trackingItem, "trackingItem");
        this.f201289a = id10;
        this.f201290b = deeplink;
        this.f201291c = str;
        this.d = trackingItem;
    }

    @Override // com.revolut.analytics.ads.model.a
    /* JADX INFO: renamed from: J0 */
    public final String getE() {
        return this.d.f323637b;
    }

    @Override // com.revolut.analytics.ads.model.a
    /* JADX INFO: renamed from: N0 */
    public final String getF() {
        return this.d.f323636a;
    }

    @Override // com.revolut.analytics.ads.model.a
    /* JADX INFO: renamed from: R0 */
    public final Integer getF78052h() {
        return this.d.e;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f201289a, aVar.f201289a) && Intrinsics.f(this.f201290b, aVar.f201290b) && Intrinsics.f(this.f201291c, aVar.f201291c) && Intrinsics.f(this.d, aVar.d);
    }

    @Override // zn.d
    /* JADX INFO: renamed from: getAnalyticsContext */
    public final Parcelable getD() {
        this.d.getClass();
        return null;
    }

    @Override // com.revolut.analytics.ads.model.a, zn.d
    /* JADX INFO: renamed from: getIdentifier */
    public final String getF100566c() {
        return this.d.getF100566c();
    }

    @Override // com.revolut.analytics.ads.model.a
    /* JADX INFO: renamed from: getPosition */
    public final Integer getF78051g() {
        return this.d.d;
    }

    public final int hashCode() {
        int iC = p.a.c(this.f201289a.hashCode() * 31, 31, this.f201290b);
        String str = this.f201291c;
        return this.d.hashCode() + ((iC + (str == null ? 0 : str.hashCode())) * 31);
    }

    @Override // com.revolut.analytics.ads.model.a
    /* JADX INFO: renamed from: n1 */
    public final String getI() {
        return this.d.f;
    }

    @Override // com.revolut.analytics.ads.model.a
    /* JADX INFO: renamed from: o0 */
    public final String getD() {
        return this.d.f323638c;
    }

    @Override // com.revolut.analytics.ads.model.a, zn.d
    /* JADX INFO: renamed from: p0 */
    public final ViewableRecordItem$Type getE() {
        return this.d.getE();
    }
}
