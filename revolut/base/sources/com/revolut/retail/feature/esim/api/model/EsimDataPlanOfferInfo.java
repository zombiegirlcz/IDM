package com.revolut.retail.feature.esim.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/retail/feature/esim/api/model/EsimDataPlanOfferInfo;", "Landroid/os/Parcelable;", "FreeTeaser", "PlanBenefit", "Lcom/revolut/retail/feature/esim/api/model/EsimDataPlanOfferInfo$FreeTeaser;", "Lcom/revolut/retail/feature/esim/api/model/EsimDataPlanOfferInfo$PlanBenefit;", "feature_retail_esim_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class EsimDataPlanOfferInfo implements Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/esim/api/model/EsimDataPlanOfferInfo$FreeTeaser;", "Lcom/revolut/retail/feature/esim/api/model/EsimDataPlanOfferInfo;", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class FreeTeaser extends EsimDataPlanOfferInfo {

        @NotNull
        public static final Parcelable.Creator<FreeTeaser> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f100236a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new FreeTeaser(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new FreeTeaser[i];
            }
        }

        public FreeTeaser(String offerId) {
            Intrinsics.checkNotNullParameter(offerId, "offerId");
            this.f100236a = offerId;
        }

        @Override // com.revolut.retail.feature.esim.api.model.EsimDataPlanOfferInfo
        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getF100237a() {
            return this.f100236a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof FreeTeaser) && Intrinsics.f(this.f100236a, ((FreeTeaser) obj2).f100236a);
        }

        public final int hashCode() {
            return this.f100236a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f100236a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/esim/api/model/EsimDataPlanOfferInfo$PlanBenefit;", "Lcom/revolut/retail/feature/esim/api/model/EsimDataPlanOfferInfo;", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PlanBenefit extends EsimDataPlanOfferInfo {

        @NotNull
        public static final Parcelable.Creator<PlanBenefit> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f100237a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PlanBenefit(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PlanBenefit[i];
            }
        }

        public PlanBenefit(String offerId) {
            Intrinsics.checkNotNullParameter(offerId, "offerId");
            this.f100237a = offerId;
        }

        @Override // com.revolut.retail.feature.esim.api.model.EsimDataPlanOfferInfo
        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getF100237a() {
            return this.f100237a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof PlanBenefit) && Intrinsics.f(this.f100237a, ((PlanBenefit) obj2).f100237a);
        }

        public final int hashCode() {
            return this.f100237a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f100237a);
        }
    }

    /* JADX INFO: renamed from: a */
    public abstract String getF100237a();
}
