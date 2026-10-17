package eme;

import android.os.Parcelable;
import com.revolut.analytics.ads.model.ViewableRecordItem$Type;
import j19.r;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class a implements com.revolut.analytics.ads.model.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f127652a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zn.c f127653b;

    public a(r item, zn.c trackingItem) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingItem, "trackingItem");
        this.f127652a = item;
        this.f127653b = trackingItem;
    }

    @Override // com.revolut.analytics.ads.model.a
    public final String J0() {
        return this.f127653b.f323637b;
    }

    @Override // com.revolut.analytics.ads.model.a
    public final String N0() {
        return this.f127653b.f323636a;
    }

    @Override // com.revolut.analytics.ads.model.a
    public final Integer R0() {
        return this.f127653b.e;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f127652a, aVar.f127652a) && Intrinsics.f(this.f127653b, aVar.f127653b);
    }

    @Override // zn.d
    public final Parcelable getAnalyticsContext() {
        this.f127653b.getClass();
        return null;
    }

    @Override // com.revolut.analytics.ads.model.a, zn.d
    public final String getIdentifier() {
        return this.f127653b.getIdentifier();
    }

    @Override // com.revolut.analytics.ads.model.a
    public final Integer getPosition() {
        return this.f127653b.d;
    }

    public final int hashCode() {
        return this.f127653b.hashCode() + (this.f127652a.hashCode() * 31);
    }

    @Override // com.revolut.analytics.ads.model.a
    public final String n1() {
        return this.f127653b.f;
    }

    @Override // com.revolut.analytics.ads.model.a
    public final String o0() {
        return this.f127653b.f323638c;
    }

    @Override // com.revolut.analytics.ads.model.a, zn.d
    public final ViewableRecordItem$Type p0() {
        return this.f127653b.p0();
    }
}
