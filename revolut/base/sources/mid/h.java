package mid;

import android.os.Parcelable;
import com.revolut.analytics.ads.model.ViewableRecordItem$Type;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class h implements com.revolut.analytics.ads.model.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f205706a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f205707b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f205708c;
    public final Integer d;

    public h(Integer num, String str, String placementId, String str2) {
        Intrinsics.checkNotNullParameter(placementId, "placementId");
        this.f205706a = str;
        this.f205707b = placementId;
        this.f205708c = str2;
        this.d = num;
    }

    @Override // com.revolut.analytics.ads.model.a
    public final String J0() {
        return this.f205707b;
    }

    @Override // com.revolut.analytics.ads.model.a
    public final String N0() {
        return this.f205706a;
    }

    @Override // com.revolut.analytics.ads.model.a
    public final Integer R0() {
        return null;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f205706a, hVar.f205706a) && Intrinsics.f(this.f205707b, hVar.f205707b) && Intrinsics.f(this.f205708c, hVar.f205708c) && Intrinsics.f(this.d, hVar.d);
    }

    @Override // zn.d
    public final Parcelable getAnalyticsContext() {
        return null;
    }

    @Override // com.revolut.analytics.ads.model.a
    public final Integer getPosition() {
        return this.d;
    }

    public final int hashCode() {
        String str = this.f205706a;
        int iC = p.a.c((str == null ? 0 : str.hashCode()) * 31, 31, this.f205707b);
        String str2 = this.f205708c;
        int iHashCode = (iC + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.d;
        return (iHashCode + (num != null ? num.hashCode() : 0)) * 31;
    }

    @Override // com.revolut.analytics.ads.model.a
    public final String n1() {
        return null;
    }

    @Override // com.revolut.analytics.ads.model.a
    public final String o0() {
        return this.f205708c;
    }

    @Override // com.revolut.analytics.ads.model.a, zn.d
    public final ViewableRecordItem$Type p0() {
        return new ViewableRecordItem$Type.Impression(null, this.d, this.f205707b, this.f205706a, this.f205708c, null);
    }
}
