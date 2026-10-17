package com.revolut.retail.feature.esim.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lcom/revolut/retail/feature/esim/api/model/EsimGetPlanLaunchMode;", "Landroid/os/Parcelable;", "PlanChange", "DataPlanChange", "PlanUpgrade", "Lcom/revolut/retail/feature/esim/api/model/EsimGetPlanLaunchMode$DataPlanChange;", "Lcom/revolut/retail/feature/esim/api/model/EsimGetPlanLaunchMode$PlanChange;", "Lcom/revolut/retail/feature/esim/api/model/EsimGetPlanLaunchMode$PlanUpgrade;", "feature_retail_esim_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface EsimGetPlanLaunchMode extends Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/esim/api/model/EsimGetPlanLaunchMode$DataPlanChange;", "Lcom/revolut/retail/feature/esim/api/model/EsimGetPlanLaunchMode;", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class DataPlanChange implements EsimGetPlanLaunchMode {

        @NotNull
        public static final Parcelable.Creator<DataPlanChange> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f100262a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f100263b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new DataPlanChange(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new DataPlanChange[i];
            }
        }

        public DataPlanChange(String subscriptionId, String changesFromDataPlanId) {
            Intrinsics.checkNotNullParameter(subscriptionId, "subscriptionId");
            Intrinsics.checkNotNullParameter(changesFromDataPlanId, "changesFromDataPlanId");
            this.f100262a = subscriptionId;
            this.f100263b = changesFromDataPlanId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof DataPlanChange)) {
                return false;
            }
            DataPlanChange dataPlanChange = (DataPlanChange) obj2;
            return Intrinsics.f(this.f100262a, dataPlanChange.f100262a) && Intrinsics.f(this.f100263b, dataPlanChange.f100263b);
        }

        public final int hashCode() {
            return this.f100263b.hashCode() + (this.f100262a.hashCode() * 31);
        }

        @Override // com.revolut.retail.feature.esim.api.model.EsimGetPlanLaunchMode
        /* JADX INFO: renamed from: t1, reason: from getter */
        public final String getF100266a() {
            return this.f100262a;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f100262a);
            dest.writeString(this.f100263b);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/esim/api/model/EsimGetPlanLaunchMode$PlanChange;", "Lcom/revolut/retail/feature/esim/api/model/EsimGetPlanLaunchMode;", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PlanChange implements EsimGetPlanLaunchMode {

        @NotNull
        public static final Parcelable.Creator<PlanChange> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f100264a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f100265b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PlanChange(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PlanChange[i];
            }
        }

        public PlanChange(String str, String changesFromMobilePlanId) {
            Intrinsics.checkNotNullParameter(changesFromMobilePlanId, "changesFromMobilePlanId");
            this.f100264a = str;
            this.f100265b = changesFromMobilePlanId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof PlanChange)) {
                return false;
            }
            PlanChange planChange = (PlanChange) obj2;
            return Intrinsics.f(this.f100264a, planChange.f100264a) && Intrinsics.f(this.f100265b, planChange.f100265b);
        }

        public final int hashCode() {
            String str = this.f100264a;
            return this.f100265b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
        }

        @Override // com.revolut.retail.feature.esim.api.model.EsimGetPlanLaunchMode
        /* JADX INFO: renamed from: t1, reason: from getter */
        public final String getF100266a() {
            return this.f100264a;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f100264a);
            dest.writeString(this.f100265b);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/esim/api/model/EsimGetPlanLaunchMode$PlanUpgrade;", "Lcom/revolut/retail/feature/esim/api/model/EsimGetPlanLaunchMode;", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PlanUpgrade implements EsimGetPlanLaunchMode {

        @NotNull
        public static final Parcelable.Creator<PlanUpgrade> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f100266a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f100267b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PlanUpgrade(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PlanUpgrade[i];
            }
        }

        public PlanUpgrade(String str, String upgradesFromMobilePlanId) {
            Intrinsics.checkNotNullParameter(upgradesFromMobilePlanId, "upgradesFromMobilePlanId");
            this.f100266a = str;
            this.f100267b = upgradesFromMobilePlanId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof PlanUpgrade)) {
                return false;
            }
            PlanUpgrade planUpgrade = (PlanUpgrade) obj2;
            return Intrinsics.f(this.f100266a, planUpgrade.f100266a) && Intrinsics.f(this.f100267b, planUpgrade.f100267b);
        }

        public final int hashCode() {
            String str = this.f100266a;
            return this.f100267b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
        }

        @Override // com.revolut.retail.feature.esim.api.model.EsimGetPlanLaunchMode
        /* JADX INFO: renamed from: t1, reason: from getter */
        public final String getF100266a() {
            return this.f100266a;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f100266a);
            dest.writeString(this.f100267b);
        }
    }

    /* JADX INFO: renamed from: t1 */
    String getF100266a();
}
