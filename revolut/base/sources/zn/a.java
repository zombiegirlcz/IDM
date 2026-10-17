package zn;

import android.os.Parcelable;
import com.revolut.analytics.ads.model.ViewableRecordItem$Type;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class a implements com.revolut.analytics.ads.model.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f323631a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f323632b;

    public a(c simpleTrackingItem, Object parcel) {
        Intrinsics.checkNotNullParameter(simpleTrackingItem, "simpleTrackingItem");
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        this.f323631a = simpleTrackingItem;
        this.f323632b = parcel;
    }

    @Override // com.revolut.analytics.ads.model.a
    public final String J0() {
        return this.f323631a.f323637b;
    }

    @Override // com.revolut.analytics.ads.model.a
    public final String N0() {
        return this.f323631a.f323636a;
    }

    @Override // com.revolut.analytics.ads.model.a
    public final Integer R0() {
        return this.f323631a.e;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f323631a, aVar.f323631a) && Intrinsics.f(this.f323632b, aVar.f323632b);
    }

    @Override // zn.d
    public final Parcelable getAnalyticsContext() {
        this.f323631a.getClass();
        return null;
    }

    @Override // com.revolut.analytics.ads.model.a, zn.d
    public final String getIdentifier() {
        return this.f323631a.getIdentifier();
    }

    @Override // com.revolut.analytics.ads.model.a
    public final Integer getPosition() {
        return this.f323631a.d;
    }

    public final int hashCode() {
        return this.f323632b.hashCode() + (this.f323631a.hashCode() * 31);
    }

    @Override // com.revolut.analytics.ads.model.a
    public final String n1() {
        return this.f323631a.f;
    }

    @Override // com.revolut.analytics.ads.model.a
    public final String o0() {
        return this.f323631a.f323638c;
    }

    @Override // com.revolut.analytics.ads.model.a, zn.d
    public final ViewableRecordItem$Type p0() {
        return this.f323631a.p0();
    }
}
