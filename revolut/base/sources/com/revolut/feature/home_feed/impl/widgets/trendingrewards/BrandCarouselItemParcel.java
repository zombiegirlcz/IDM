package com.revolut.feature.home_feed.impl.widgets.trendingrewards;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/home_feed/impl/widgets/trendingrewards/BrandCarouselItemParcel;", "Lcom/revolut/analytics/ads/model/a;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_home_feed_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BrandCarouselItemParcel implements com.revolut.analytics.ads.model.a, Parcelable {

    @NotNull
    public static final Parcelable.Creator<BrandCarouselItemParcel> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f74742a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f74743b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f74744c;
    public final String d;
    public final int e;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new BrandCarouselItemParcel(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new BrandCarouselItemParcel[i];
        }
    }

    public BrandCarouselItemParcel(String deeplink, String creativeUrl, String placementId, String str, int i) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        Intrinsics.checkNotNullParameter(creativeUrl, "creativeUrl");
        Intrinsics.checkNotNullParameter(placementId, "placementId");
        this.f74742a = deeplink;
        this.f74743b = creativeUrl;
        this.f74744c = placementId;
        this.d = str;
        this.e = i;
    }

    @Override // com.revolut.analytics.ads.model.a
    /* JADX INFO: renamed from: J0, reason: from getter */
    public final String getF74744c() {
        return this.f74744c;
    }

    @Override // com.revolut.analytics.ads.model.a
    /* JADX INFO: renamed from: N0, reason: from getter */
    public final String getF74743b() {
        return this.f74743b;
    }

    @Override // com.revolut.analytics.ads.model.a
    public final Integer R0() {
        return null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof BrandCarouselItemParcel)) {
            return false;
        }
        BrandCarouselItemParcel brandCarouselItemParcel = (BrandCarouselItemParcel) obj2;
        return Intrinsics.f(this.f74742a, brandCarouselItemParcel.f74742a) && Intrinsics.f(this.f74743b, brandCarouselItemParcel.f74743b) && Intrinsics.f(this.f74744c, brandCarouselItemParcel.f74744c) && Intrinsics.f(this.d, brandCarouselItemParcel.d) && this.e == brandCarouselItemParcel.e;
    }

    @Override // zn.d
    public final Parcelable getAnalyticsContext() {
        return null;
    }

    @Override // com.revolut.analytics.ads.model.a
    public final Integer getPosition() {
        return Integer.valueOf(this.e);
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(this.f74742a.hashCode() * 31, 31, this.f74743b), 31, this.f74744c);
        String str = this.d;
        return Integer.hashCode(this.e) + ((iC + (str == null ? 0 : str.hashCode())) * 31);
    }

    @Override // com.revolut.analytics.ads.model.a
    public final String n1() {
        return null;
    }

    @Override // com.revolut.analytics.ads.model.a
    /* JADX INFO: renamed from: o0, reason: from getter */
    public final String getD() {
        return this.d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f74742a);
        dest.writeString(this.f74743b);
        dest.writeString(this.f74744c);
        dest.writeString(this.d);
        dest.writeInt(this.e);
    }
}
