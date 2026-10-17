package com.revolut.feature.tab.lifestyle.impl.ui.payload;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.analytics.ads.model.ViewableRecordItem$Type;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zn.d;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/tab/lifestyle/impl/ui/payload/FeedSlotPayload;", "Landroid/os/Parcelable;", "Lcom/revolut/analytics/ads/model/a;", "Lzn/d;", "", "toString", "()Ljava/lang/String;", "feature_tab_lifestyle_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class FeedSlotPayload implements Parcelable, com.revolut.analytics.ads.model.a, d {

    @NotNull
    public static final Parcelable.Creator<FeedSlotPayload> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f89897a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f89898b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f89899c;
    public final String d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f89900g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f89901h;
    public final int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f89902j;
    public final String k;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new FeedSlotPayload(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new FeedSlotPayload[i];
        }
    }

    public FeedSlotPayload(String slotId, String deeplink, String str, String str2, String str3, String str4, String str5, String str6, int i, int i2, String str7) {
        Intrinsics.checkNotNullParameter(slotId, "slotId");
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        this.f89897a = slotId;
        this.f89898b = deeplink;
        this.f89899c = str;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.f89900g = str5;
        this.f89901h = str6;
        this.i = i;
        this.f89902j = i2;
        this.k = str7;
    }

    @Override // com.revolut.analytics.ads.model.a
    /* JADX INFO: renamed from: J0, reason: from getter */
    public final String getF89900g() {
        return this.f89900g;
    }

    @Override // com.revolut.analytics.ads.model.a
    /* JADX INFO: renamed from: N0, reason: from getter */
    public final String getF89901h() {
        return this.f89901h;
    }

    @Override // com.revolut.analytics.ads.model.a
    /* JADX INFO: renamed from: R0 */
    public final Integer getF78052h() {
        return Integer.valueOf(this.f89902j);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof FeedSlotPayload)) {
            return false;
        }
        FeedSlotPayload feedSlotPayload = (FeedSlotPayload) obj2;
        return Intrinsics.f(this.f89897a, feedSlotPayload.f89897a) && Intrinsics.f(this.f89898b, feedSlotPayload.f89898b) && Intrinsics.f(this.f89899c, feedSlotPayload.f89899c) && Intrinsics.f(this.d, feedSlotPayload.d) && Intrinsics.f(this.e, feedSlotPayload.e) && Intrinsics.f(this.f, feedSlotPayload.f) && Intrinsics.f(this.f89900g, feedSlotPayload.f89900g) && Intrinsics.f(this.f89901h, feedSlotPayload.f89901h) && this.i == feedSlotPayload.i && this.f89902j == feedSlotPayload.f89902j && Intrinsics.f(this.k, feedSlotPayload.k);
    }

    @Override // zn.d
    /* JADX INFO: renamed from: getAnalyticsContext */
    public final Parcelable getD() {
        return null;
    }

    @Override // com.revolut.analytics.ads.model.a
    /* JADX INFO: renamed from: getPosition */
    public final Integer getF78051g() {
        return Integer.valueOf(this.i);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f89897a.hashCode() * 31, 31, this.f89898b);
        String str = this.f89899c;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.e;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f89900g;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f89901h;
        int iB = j6.a.b(this.f89902j, j6.a.b(this.i, (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31, 31), 31);
        String str7 = this.k;
        return iB + (str7 != null ? str7.hashCode() : 0);
    }

    @Override // com.revolut.analytics.ads.model.a
    /* JADX INFO: renamed from: n1, reason: from getter */
    public final String getK() {
        return this.k;
    }

    @Override // com.revolut.analytics.ads.model.a
    /* JADX INFO: renamed from: o0, reason: from getter */
    public final String getF() {
        return this.f;
    }

    @Override // com.revolut.analytics.ads.model.a, zn.d
    /* JADX INFO: renamed from: p0 */
    public final ViewableRecordItem$Type getE() {
        return new ViewableRecordItem$Type.Impression(Integer.valueOf(this.f89902j), Integer.valueOf(this.i), this.f89900g, this.f89901h, this.f, this.k);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f89897a);
        dest.writeString(this.f89898b);
        dest.writeString(this.f89899c);
        dest.writeString(this.d);
        dest.writeString(this.e);
        dest.writeString(this.f);
        dest.writeString(this.f89900g);
        dest.writeString(this.f89901h);
        dest.writeInt(this.i);
        dest.writeInt(this.f89902j);
        dest.writeString(this.k);
    }
}
