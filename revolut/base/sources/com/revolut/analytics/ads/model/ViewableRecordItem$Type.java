package com.revolut.analytics.ads.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"com/revolut/analytics/ads/model/ViewableRecordItem$Type", "Landroid/os/Parcelable;", "ViewableRecord", "Impression", "Lcom/revolut/analytics/ads/model/ViewableRecordItem$Type$Impression;", "Lcom/revolut/analytics/ads/model/ViewableRecordItem$Type$ViewableRecord;", "analytics_ads_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class ViewableRecordItem$Type implements Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/analytics/ads/model/ViewableRecordItem$Type$Impression;", "Lcom/revolut/analytics/ads/model/ViewableRecordItem$Type;", "", "toString", "()Ljava/lang/String;", "analytics_ads_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Impression extends ViewableRecordItem$Type {

        @NotNull
        public static final Parcelable.Creator<Impression> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f50284a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f50285b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f50286c;
        public final Integer d;
        public final String e;
        public final Integer f;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string = parcel.readString();
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                return new Impression(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, string, string2, string3, parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Impression[i];
            }
        }

        public Impression(Integer num, Integer num2, String str, String str2, String str3, String str4) {
            this.f50284a = str;
            this.f50285b = str2;
            this.f50286c = str3;
            this.d = num;
            this.e = str4;
            this.f = num2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Impression)) {
                return false;
            }
            Impression impression = (Impression) obj2;
            return Intrinsics.f(this.f50284a, impression.f50284a) && Intrinsics.f(this.f50285b, impression.f50285b) && Intrinsics.f(this.f50286c, impression.f50286c) && Intrinsics.f(this.d, impression.d) && Intrinsics.f(this.e, impression.e) && Intrinsics.f(this.f, impression.f);
        }

        public final int hashCode() {
            String str = this.f50284a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f50285b;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f50286c;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            Integer num = this.d;
            int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
            String str4 = this.e;
            int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
            Integer num2 = this.f;
            return iHashCode5 + (num2 != null ? num2.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f50284a);
            dest.writeString(this.f50285b);
            dest.writeString(this.f50286c);
            Integer num = this.d;
            if (num == null) {
                dest.writeInt(0);
            } else {
                p.a.B(dest, 1, num);
            }
            dest.writeString(this.e);
            Integer num2 = this.f;
            if (num2 == null) {
                dest.writeInt(0);
            } else {
                p.a.B(dest, 1, num2);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/analytics/ads/model/ViewableRecordItem$Type$ViewableRecord;", "Lcom/revolut/analytics/ads/model/ViewableRecordItem$Type;", "", "toString", "()Ljava/lang/String;", "analytics_ads_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ViewableRecord extends ViewableRecordItem$Type {

        @NotNull
        public static final Parcelable.Creator<ViewableRecord> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Integer f50287a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ViewableRecord(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ViewableRecord[i];
            }
        }

        public ViewableRecord(Integer num) {
            this.f50287a = num;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof ViewableRecord) && Intrinsics.f(this.f50287a, ((ViewableRecord) obj2).f50287a);
        }

        public final int hashCode() {
            Integer num = this.f50287a;
            if (num == null) {
                return 0;
            }
            return num.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            Integer num = this.f50287a;
            if (num == null) {
                dest.writeInt(0);
            } else {
                p.a.B(dest, 1, num);
            }
        }

        public ViewableRecord() {
            this(null);
        }
    }
}
