package mid;

import android.os.Parcelable;
import com.revolut.analytics.ads.model.ViewableRecordItem$Type;
import com.revolut.feature.shops.api.model.ShopsContext;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class k implements com.revolut.analytics.ads.model.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ShopsContext f205719a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f205720b;

    public k(ShopsContext shopsContext, h shopsAdsTrackingItem) {
        Intrinsics.checkNotNullParameter(shopsContext, "shopsContext");
        Intrinsics.checkNotNullParameter(shopsAdsTrackingItem, "shopsAdsTrackingItem");
        this.f205719a = shopsContext;
        this.f205720b = shopsAdsTrackingItem;
    }

    @Override // com.revolut.analytics.ads.model.a
    public final String J0() {
        return this.f205720b.f205707b;
    }

    @Override // com.revolut.analytics.ads.model.a
    public final String N0() {
        return this.f205720b.f205706a;
    }

    @Override // com.revolut.analytics.ads.model.a
    public final Integer R0() {
        this.f205720b.getClass();
        return null;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f205719a, kVar.f205719a) && Intrinsics.f(this.f205720b, kVar.f205720b);
    }

    @Override // zn.d
    public final Parcelable getAnalyticsContext() {
        this.f205720b.getClass();
        return null;
    }

    @Override // com.revolut.analytics.ads.model.a, zn.d
    public final String getIdentifier() {
        return this.f205720b.getIdentifier();
    }

    @Override // com.revolut.analytics.ads.model.a
    public final Integer getPosition() {
        return this.f205720b.d;
    }

    public final int hashCode() {
        return this.f205720b.hashCode() + (this.f205719a.hashCode() * 31);
    }

    @Override // com.revolut.analytics.ads.model.a
    public final String n1() {
        return null;
    }

    @Override // com.revolut.analytics.ads.model.a
    public final String o0() {
        return this.f205720b.f205708c;
    }

    @Override // com.revolut.analytics.ads.model.a, zn.d
    public final ViewableRecordItem$Type p0() {
        return this.f205720b.p0();
    }
}
