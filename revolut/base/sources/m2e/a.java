package m2e;

import android.os.Parcelable;
import com.revolut.analytics.ads.model.ViewableRecordItem$Type;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class a implements com.revolut.analytics.ads.model.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f201954a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f201955b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f201956c;
    public final Integer d;
    public final ViewableRecordItem$Type.Impression e;

    public a(int i, Integer num, String str, String str2, String analyticsRef) {
        Integer num2 = (i & 8) != 0 ? 1 : num;
        Intrinsics.checkNotNullParameter(analyticsRef, "analyticsRef");
        this.f201954a = str;
        this.f201955b = str2;
        this.f201956c = analyticsRef;
        this.d = num2;
        this.e = new ViewableRecordItem$Type.Impression(null, num2, str2, str, analyticsRef, null);
    }

    @Override // com.revolut.analytics.ads.model.a
    public final String J0() {
        return this.f201955b;
    }

    @Override // com.revolut.analytics.ads.model.a
    public final String N0() {
        return this.f201954a;
    }

    @Override // com.revolut.analytics.ads.model.a
    public final Integer R0() {
        return null;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f201954a, aVar.f201954a) && Intrinsics.f(this.f201955b, aVar.f201955b) && Intrinsics.f(this.f201956c, aVar.f201956c) && Intrinsics.f(this.d, aVar.d);
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
        String str = this.f201954a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f201955b;
        int iC = p.a.c((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.f201956c);
        Integer num = this.d;
        return (iC + (num != null ? num.hashCode() : 0)) * 31;
    }

    @Override // com.revolut.analytics.ads.model.a
    public final String n1() {
        return null;
    }

    @Override // com.revolut.analytics.ads.model.a
    public final String o0() {
        return this.f201956c;
    }

    @Override // com.revolut.analytics.ads.model.a, zn.d
    public final ViewableRecordItem$Type p0() {
        return this.e;
    }
}
