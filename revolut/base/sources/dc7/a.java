package dc7;

import android.os.Parcelable;
import com.revolut.analytics.ads.model.ViewableRecordItem$Type;
import ekc.d;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class a implements com.revolut.analytics.ads.model.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f112808a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f112809b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f112810c;
    public final d d;

    public a(int i, String creativeUrl, String str, d dVar) {
        Intrinsics.checkNotNullParameter(creativeUrl, "creativeUrl");
        Intrinsics.checkNotNullParameter("9b8f8d3e-d6c1-4b86-8400-3573593aae7d", "placementId");
        this.f112808a = i;
        this.f112809b = creativeUrl;
        this.f112810c = str;
        this.d = dVar;
    }

    @Override // com.revolut.analytics.ads.model.a
    public final String J0() {
        return "9b8f8d3e-d6c1-4b86-8400-3573593aae7d";
    }

    @Override // com.revolut.analytics.ads.model.a
    public final String N0() {
        return this.f112809b;
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
        return this.f112808a == aVar.f112808a && Intrinsics.f(this.f112809b, aVar.f112809b) && Intrinsics.f(this.f112810c, aVar.f112810c) && this.d.equals(aVar.d);
    }

    @Override // zn.d
    public final Parcelable getAnalyticsContext() {
        return null;
    }

    @Override // com.revolut.analytics.ads.model.a
    public final Integer getPosition() {
        return Integer.valueOf(this.f112808a);
    }

    public final int hashCode() {
        int iHashCode = (((this.f112809b.hashCode() + (Integer.hashCode(this.f112808a) * 31)) * 31) + 136440070) * 31;
        String str = this.f112810c;
        return (this.d.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31;
    }

    @Override // com.revolut.analytics.ads.model.a
    public final String n1() {
        return null;
    }

    @Override // com.revolut.analytics.ads.model.a
    public final String o0() {
        return this.f112810c;
    }

    @Override // com.revolut.analytics.ads.model.a, zn.d
    public final ViewableRecordItem$Type p0() {
        return new ViewableRecordItem$Type.Impression(null, Integer.valueOf(this.f112808a), "9b8f8d3e-d6c1-4b86-8400-3573593aae7d", this.f112809b, this.f112810c, null);
    }
}
