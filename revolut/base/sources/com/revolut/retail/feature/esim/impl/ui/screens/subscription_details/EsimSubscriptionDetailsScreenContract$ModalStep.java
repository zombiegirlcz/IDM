package com.revolut.retail.feature.esim.impl.ui.screens.subscription_details;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import com.revolut.retail.feature.esim.api.model.EsimAutoRenewalTerms;
import com.revolut.retail.feature.esim.api.model.EsimProfile;
import com.revolut.retail.feature.esim.api.model.EsimProfileEntry;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0006\b\t\n\u000b\f\r¨\u0006\u000eÀ\u0006\u0003"}, d2 = {"com/revolut/retail/feature/esim/impl/ui/screens/subscription_details/EsimSubscriptionDetailsScreenContract$ModalStep", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "AutoRenewalInfo", "NonRefundableSubscription", "EsimMigration", "DataPlanAssignedToVoiceAndData", "EsimInstallation", "ShareEsim", "Lcom/revolut/retail/feature/esim/impl/ui/screens/subscription_details/EsimSubscriptionDetailsScreenContract$ModalStep$AutoRenewalInfo;", "Lcom/revolut/retail/feature/esim/impl/ui/screens/subscription_details/EsimSubscriptionDetailsScreenContract$ModalStep$DataPlanAssignedToVoiceAndData;", "Lcom/revolut/retail/feature/esim/impl/ui/screens/subscription_details/EsimSubscriptionDetailsScreenContract$ModalStep$EsimInstallation;", "Lcom/revolut/retail/feature/esim/impl/ui/screens/subscription_details/EsimSubscriptionDetailsScreenContract$ModalStep$EsimMigration;", "Lcom/revolut/retail/feature/esim/impl/ui/screens/subscription_details/EsimSubscriptionDetailsScreenContract$ModalStep$NonRefundableSubscription;", "Lcom/revolut/retail/feature/esim/impl/ui/screens/subscription_details/EsimSubscriptionDetailsScreenContract$ModalStep$ShareEsim;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface EsimSubscriptionDetailsScreenContract$ModalStep extends FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/esim/impl/ui/screens/subscription_details/EsimSubscriptionDetailsScreenContract$ModalStep$AutoRenewalInfo;", "Lcom/revolut/retail/feature/esim/impl/ui/screens/subscription_details/EsimSubscriptionDetailsScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AutoRenewalInfo implements EsimSubscriptionDetailsScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<AutoRenewalInfo> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final EsimAutoRenewalTerms f101419a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new AutoRenewalInfo((EsimAutoRenewalTerms) parcel.readParcelable(AutoRenewalInfo.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AutoRenewalInfo[i];
            }
        }

        public AutoRenewalInfo(EsimAutoRenewalTerms terms) {
            Intrinsics.checkNotNullParameter(terms, "terms");
            this.f101419a = terms;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof AutoRenewalInfo) && Intrinsics.f(this.f101419a, ((AutoRenewalInfo) obj2).f101419a);
        }

        public final int hashCode() {
            return this.f101419a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f101419a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/esim/impl/ui/screens/subscription_details/EsimSubscriptionDetailsScreenContract$ModalStep$DataPlanAssignedToVoiceAndData;", "Lcom/revolut/retail/feature/esim/impl/ui/screens/subscription_details/EsimSubscriptionDetailsScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class DataPlanAssignedToVoiceAndData implements EsimSubscriptionDetailsScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<DataPlanAssignedToVoiceAndData> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f101420a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f101421b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new DataPlanAssignedToVoiceAndData(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new DataPlanAssignedToVoiceAndData[i];
            }
        }

        public DataPlanAssignedToVoiceAndData(String phoneNumber, String str) {
            Intrinsics.checkNotNullParameter(phoneNumber, "phoneNumber");
            this.f101420a = phoneNumber;
            this.f101421b = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof DataPlanAssignedToVoiceAndData)) {
                return false;
            }
            DataPlanAssignedToVoiceAndData dataPlanAssignedToVoiceAndData = (DataPlanAssignedToVoiceAndData) obj2;
            return Intrinsics.f(this.f101420a, dataPlanAssignedToVoiceAndData.f101420a) && Intrinsics.f(this.f101421b, dataPlanAssignedToVoiceAndData.f101421b);
        }

        public final int hashCode() {
            int iHashCode = this.f101420a.hashCode() * 31;
            String str = this.f101421b;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f101420a);
            dest.writeString(this.f101421b);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/esim/impl/ui/screens/subscription_details/EsimSubscriptionDetailsScreenContract$ModalStep$EsimInstallation;", "Lcom/revolut/retail/feature/esim/impl/ui/screens/subscription_details/EsimSubscriptionDetailsScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class EsimInstallation implements EsimSubscriptionDetailsScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<EsimInstallation> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final EsimProfile f101422a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new EsimInstallation((EsimProfile) parcel.readParcelable(EsimInstallation.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new EsimInstallation[i];
            }
        }

        public EsimInstallation(EsimProfile esimProfile) {
            Intrinsics.checkNotNullParameter(esimProfile, "esimProfile");
            this.f101422a = esimProfile;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof EsimInstallation) && Intrinsics.f(this.f101422a, ((EsimInstallation) obj2).f101422a);
        }

        public final int hashCode() {
            return this.f101422a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f101422a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/esim/impl/ui/screens/subscription_details/EsimSubscriptionDetailsScreenContract$ModalStep$EsimMigration;", "Lcom/revolut/retail/feature/esim/impl/ui/screens/subscription_details/EsimSubscriptionDetailsScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class EsimMigration implements EsimSubscriptionDetailsScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<EsimMigration> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f101423a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final EsimProfileEntry f101424b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new EsimMigration(parcel.readInt() != 0, (EsimProfileEntry) parcel.readParcelable(EsimMigration.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new EsimMigration[i];
            }
        }

        public EsimMigration(boolean z, EsimProfileEntry esimProfileEntry) {
            Intrinsics.checkNotNullParameter(esimProfileEntry, "esimProfileEntry");
            this.f101423a = z;
            this.f101424b = esimProfileEntry;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof EsimMigration)) {
                return false;
            }
            EsimMigration esimMigration = (EsimMigration) obj2;
            return this.f101423a == esimMigration.f101423a && Intrinsics.f(this.f101424b, esimMigration.f101424b);
        }

        public final int hashCode() {
            return this.f101424b.hashCode() + (Boolean.hashCode(this.f101423a) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.f101423a ? 1 : 0);
            dest.writeParcelable(this.f101424b, i);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/esim/impl/ui/screens/subscription_details/EsimSubscriptionDetailsScreenContract$ModalStep$NonRefundableSubscription;", "Lcom/revolut/retail/feature/esim/impl/ui/screens/subscription_details/EsimSubscriptionDetailsScreenContract$ModalStep;", "<init>", "()V", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class NonRefundableSubscription implements EsimSubscriptionDetailsScreenContract$ModalStep {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final NonRefundableSubscription f101425a = new NonRefundableSubscription();

        @NotNull
        public static final Parcelable.Creator<NonRefundableSubscription> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return NonRefundableSubscription.f101425a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new NonRefundableSubscription[i];
            }
        }

        private NonRefundableSubscription() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/esim/impl/ui/screens/subscription_details/EsimSubscriptionDetailsScreenContract$ModalStep$ShareEsim;", "Lcom/revolut/retail/feature/esim/impl/ui/screens/subscription_details/EsimSubscriptionDetailsScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ShareEsim implements EsimSubscriptionDetailsScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<ShareEsim> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f101426a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ShareEsim(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ShareEsim[i];
            }
        }

        public ShareEsim(String simProfileId) {
            Intrinsics.checkNotNullParameter(simProfileId, "simProfileId");
            this.f101426a = simProfileId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof ShareEsim) && Intrinsics.f(this.f101426a, ((ShareEsim) obj2).f101426a);
        }

        public final int hashCode() {
            return this.f101426a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f101426a);
        }
    }
}
