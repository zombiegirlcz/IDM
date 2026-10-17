package com.revolut.feature.retail.cfd.api.domain.models;

import android.os.Parcel;
import android.os.Parcelable;
import ej0.b;
import k4l.r0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/retail/cfd/api/domain/models/CfdExposureBreakdownOrderType;", "Landroid/os/Parcelable;", "Market", "Limit", "Stop", "Lcom/revolut/feature/retail/cfd/api/domain/models/CfdExposureBreakdownOrderType$Limit;", "Lcom/revolut/feature/retail/cfd/api/domain/models/CfdExposureBreakdownOrderType$Market;", "Lcom/revolut/feature/retail/cfd/api/domain/models/CfdExposureBreakdownOrderType$Stop;", "feature_retail_cfd_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface CfdExposureBreakdownOrderType extends Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/retail/cfd/api/domain/models/CfdExposureBreakdownOrderType$Limit;", "Lcom/revolut/feature/retail/cfd/api/domain/models/CfdExposureBreakdownOrderType;", "", "toString", "()Ljava/lang/String;", "feature_retail_cfd_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Limit implements CfdExposureBreakdownOrderType {

        @NotNull
        public static final Parcelable.Creator<Limit> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final b f82094a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final r0 f82095b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Limit((b) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Limit[i];
            }
        }

        public Limit(b targetPrice) {
            Intrinsics.checkNotNullParameter(targetPrice, "targetPrice");
            this.f82094a = targetPrice;
            this.f82095b = r0.LIMIT;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Limit) && Intrinsics.f(this.f82094a, ((Limit) obj2).f82094a);
        }

        @Override // com.revolut.feature.retail.cfd.api.domain.models.CfdExposureBreakdownOrderType
        /* JADX INFO: renamed from: getType, reason: from getter */
        public final r0 getF82099b() {
            return this.f82095b;
        }

        public final int hashCode() {
            return this.f82094a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f82094a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/retail/cfd/api/domain/models/CfdExposureBreakdownOrderType$Market;", "Lcom/revolut/feature/retail/cfd/api/domain/models/CfdExposureBreakdownOrderType;", "<init>", "()V", "feature_retail_cfd_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Market implements CfdExposureBreakdownOrderType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Market f82096a = new Market();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final r0 f82097b = r0.MARKET;

        @NotNull
        public static final Parcelable.Creator<Market> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Market.f82096a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Market[i];
            }
        }

        private Market() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.revolut.feature.retail.cfd.api.domain.models.CfdExposureBreakdownOrderType
        /* JADX INFO: renamed from: getType */
        public final r0 getF82099b() {
            return f82097b;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/retail/cfd/api/domain/models/CfdExposureBreakdownOrderType$Stop;", "Lcom/revolut/feature/retail/cfd/api/domain/models/CfdExposureBreakdownOrderType;", "", "toString", "()Ljava/lang/String;", "feature_retail_cfd_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Stop implements CfdExposureBreakdownOrderType {

        @NotNull
        public static final Parcelable.Creator<Stop> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final b f82098a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final r0 f82099b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Stop((b) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Stop[i];
            }
        }

        public Stop(b targetPrice) {
            Intrinsics.checkNotNullParameter(targetPrice, "targetPrice");
            this.f82098a = targetPrice;
            this.f82099b = r0.STOP;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Stop) && Intrinsics.f(this.f82098a, ((Stop) obj2).f82098a);
        }

        @Override // com.revolut.feature.retail.cfd.api.domain.models.CfdExposureBreakdownOrderType
        /* JADX INFO: renamed from: getType, reason: from getter */
        public final r0 getF82099b() {
            return this.f82099b;
        }

        public final int hashCode() {
            return this.f82098a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f82098a);
        }
    }

    /* JADX INFO: renamed from: getType */
    r0 getF82099b();
}
