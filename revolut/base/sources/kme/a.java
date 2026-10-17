package kme;

import android.os.Parcelable;
import com.revolut.analytics.ads.model.ViewableRecordItem$Type;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class a implements com.revolut.analytics.ads.model.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h19.d f185787a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zn.c f185788b;

    public a(h19.d lifestyleHomeProduct, zn.c trackingItem) {
        Intrinsics.checkNotNullParameter(lifestyleHomeProduct, "lifestyleHomeProduct");
        Intrinsics.checkNotNullParameter(trackingItem, "trackingItem");
        this.f185787a = lifestyleHomeProduct;
        this.f185788b = trackingItem;
    }

    @Override // com.revolut.analytics.ads.model.a
    public final String J0() {
        return this.f185788b.f323637b;
    }

    @Override // com.revolut.analytics.ads.model.a
    public final String N0() {
        return this.f185788b.f323636a;
    }

    @Override // com.revolut.analytics.ads.model.a
    public final Integer R0() {
        return this.f185788b.e;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f185787a, aVar.f185787a) && Intrinsics.f(this.f185788b, aVar.f185788b);
    }

    @Override // zn.d
    public final Parcelable getAnalyticsContext() {
        this.f185788b.getClass();
        return null;
    }

    @Override // com.revolut.analytics.ads.model.a, zn.d
    public final String getIdentifier() {
        return this.f185788b.getIdentifier();
    }

    @Override // com.revolut.analytics.ads.model.a
    public final Integer getPosition() {
        return this.f185788b.d;
    }

    public final int hashCode() {
        return this.f185788b.hashCode() + (this.f185787a.hashCode() * 31);
    }

    @Override // com.revolut.analytics.ads.model.a
    public final String n1() {
        return this.f185788b.f;
    }

    @Override // com.revolut.analytics.ads.model.a
    public final String o0() {
        return this.f185788b.f323638c;
    }

    @Override // com.revolut.analytics.ads.model.a, zn.d
    public final ViewableRecordItem$Type p0() {
        return this.f185788b.p0();
    }
}
