package bme;

import android.os.Parcelable;
import com.revolut.analytics.ads.model.ViewableRecordItem$Type;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class a implements com.revolut.analytics.ads.model.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k19.c f16830a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zn.c f16831b;

    public a(k19.c action, zn.c trackingItem) {
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(trackingItem, "trackingItem");
        this.f16830a = action;
        this.f16831b = trackingItem;
    }

    @Override // com.revolut.analytics.ads.model.a
    public final String J0() {
        return this.f16831b.f323637b;
    }

    @Override // com.revolut.analytics.ads.model.a
    public final String N0() {
        return this.f16831b.f323636a;
    }

    @Override // com.revolut.analytics.ads.model.a
    public final Integer R0() {
        return this.f16831b.e;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f16830a, aVar.f16830a) && Intrinsics.f(this.f16831b, aVar.f16831b);
    }

    @Override // zn.d
    public final Parcelable getAnalyticsContext() {
        this.f16831b.getClass();
        return null;
    }

    @Override // com.revolut.analytics.ads.model.a, zn.d
    public final String getIdentifier() {
        return this.f16831b.getIdentifier();
    }

    @Override // com.revolut.analytics.ads.model.a
    public final Integer getPosition() {
        return this.f16831b.d;
    }

    public final int hashCode() {
        return this.f16831b.hashCode() + (this.f16830a.hashCode() * 31);
    }

    @Override // com.revolut.analytics.ads.model.a
    public final String n1() {
        return this.f16831b.f;
    }

    @Override // com.revolut.analytics.ads.model.a
    public final String o0() {
        return this.f16831b.f323638c;
    }

    @Override // com.revolut.analytics.ads.model.a, zn.d
    public final ViewableRecordItem$Type p0() {
        return this.f16831b.p0();
    }
}
