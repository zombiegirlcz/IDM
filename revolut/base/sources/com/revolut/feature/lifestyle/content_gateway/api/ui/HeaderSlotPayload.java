package com.revolut.feature.lifestyle.content_gateway.api.ui;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.analytics.ads.model.ViewableRecordItem$Type;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/lifestyle/content_gateway/api/ui/HeaderSlotPayload;", "Landroid/os/Parcelable;", "Lcom/revolut/analytics/ads/model/a;", "", "toString", "()Ljava/lang/String;", "feature_lifestyle_content_gateway_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class HeaderSlotPayload implements Parcelable, com.revolut.analytics.ads.model.a {

    @NotNull
    public static final Parcelable.Creator<HeaderSlotPayload> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f78048a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f78049b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f78050c;
    public final String d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Integer f78051g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Integer f78052h;
    public final String i;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new HeaderSlotPayload(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new HeaderSlotPayload[i];
        }
    }

    public HeaderSlotPayload(String id10, String deeplink, String str, String str2, String str3, String str4, Integer num, Integer num2, String str5) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        this.f78048a = id10;
        this.f78049b = deeplink;
        this.f78050c = str;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.f78051g = num;
        this.f78052h = num2;
        this.i = str5;
    }

    @Override // com.revolut.analytics.ads.model.a
    /* JADX INFO: renamed from: J0, reason: from getter */
    public final String getE() {
        return this.e;
    }

    @Override // com.revolut.analytics.ads.model.a
    /* JADX INFO: renamed from: N0, reason: from getter */
    public final String getF() {
        return this.f;
    }

    @Override // com.revolut.analytics.ads.model.a
    /* JADX INFO: renamed from: R0, reason: from getter */
    public final Integer getF78052h() {
        return this.f78052h;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof HeaderSlotPayload)) {
            return false;
        }
        HeaderSlotPayload headerSlotPayload = (HeaderSlotPayload) obj2;
        return Intrinsics.f(this.f78048a, headerSlotPayload.f78048a) && Intrinsics.f(this.f78049b, headerSlotPayload.f78049b) && Intrinsics.f(this.f78050c, headerSlotPayload.f78050c) && Intrinsics.f(this.d, headerSlotPayload.d) && Intrinsics.f(this.e, headerSlotPayload.e) && Intrinsics.f(this.f, headerSlotPayload.f) && Intrinsics.f(this.f78051g, headerSlotPayload.f78051g) && Intrinsics.f(this.f78052h, headerSlotPayload.f78052h) && Intrinsics.f(this.i, headerSlotPayload.i);
    }

    @Override // zn.d
    /* JADX INFO: renamed from: getAnalyticsContext */
    public final Parcelable getD() {
        return null;
    }

    @Override // com.revolut.analytics.ads.model.a
    /* JADX INFO: renamed from: getPosition, reason: from getter */
    public final Integer getF78051g() {
        return this.f78051g;
    }

    public final int hashCode() {
        int iC = p.a.c(this.f78048a.hashCode() * 31, 31, this.f78049b);
        String str = this.f78050c;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.e;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num = this.f78051g;
        int iHashCode5 = (iHashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f78052h;
        int iHashCode6 = (iHashCode5 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str5 = this.i;
        return iHashCode6 + (str5 != null ? str5.hashCode() : 0);
    }

    @Override // com.revolut.analytics.ads.model.a
    /* JADX INFO: renamed from: n1, reason: from getter */
    public final String getI() {
        return this.i;
    }

    @Override // com.revolut.analytics.ads.model.a
    /* JADX INFO: renamed from: o0, reason: from getter */
    public final String getD() {
        return this.d;
    }

    @Override // com.revolut.analytics.ads.model.a, zn.d
    /* JADX INFO: renamed from: p0 */
    public final ViewableRecordItem$Type getE() {
        return new ViewableRecordItem$Type.Impression(this.f78052h, this.f78051g, this.e, this.f, this.d, this.i);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f78048a);
        dest.writeString(this.f78049b);
        dest.writeString(this.f78050c);
        dest.writeString(this.d);
        dest.writeString(this.e);
        dest.writeString(this.f);
        Integer num = this.f78051g;
        if (num == null) {
            dest.writeInt(0);
        } else {
            p.a.B(dest, 1, num);
        }
        Integer num2 = this.f78052h;
        if (num2 == null) {
            dest.writeInt(0);
        } else {
            p.a.B(dest, 1, num2);
        }
        dest.writeString(this.i);
    }
}
