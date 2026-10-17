package com.revolut.feature.retail.savings.api.navigation.feature_config;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m72.b;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\fÀ\u0006\u0003"}, d2 = {"com/revolut/feature/retail/savings/api/navigation/feature_config/SavingsKompotFeatureConfig$TransferWidgetCustomisationScreen$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "Customise", "SelectTopUpAccount", "SelectWithdrawAccount", "SelectSpareChangeAccount", "SelectGoalAccount", "Lcom/revolut/feature/retail/savings/api/navigation/feature_config/SavingsKompotFeatureConfig$TransferWidgetCustomisationScreen$InputData$Customise;", "Lcom/revolut/feature/retail/savings/api/navigation/feature_config/SavingsKompotFeatureConfig$TransferWidgetCustomisationScreen$InputData$SelectGoalAccount;", "Lcom/revolut/feature/retail/savings/api/navigation/feature_config/SavingsKompotFeatureConfig$TransferWidgetCustomisationScreen$InputData$SelectSpareChangeAccount;", "Lcom/revolut/feature/retail/savings/api/navigation/feature_config/SavingsKompotFeatureConfig$TransferWidgetCustomisationScreen$InputData$SelectTopUpAccount;", "Lcom/revolut/feature/retail/savings/api/navigation/feature_config/SavingsKompotFeatureConfig$TransferWidgetCustomisationScreen$InputData$SelectWithdrawAccount;", "feature_retail_savings_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface SavingsKompotFeatureConfig$TransferWidgetCustomisationScreen$InputData extends IOData$Input {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/retail/savings/api/navigation/feature_config/SavingsKompotFeatureConfig$TransferWidgetCustomisationScreen$InputData$Customise;", "Lcom/revolut/feature/retail/savings/api/navigation/feature_config/SavingsKompotFeatureConfig$TransferWidgetCustomisationScreen$InputData;", "", "toString", "()Ljava/lang/String;", "feature_retail_savings_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Customise implements SavingsKompotFeatureConfig$TransferWidgetCustomisationScreen$InputData {

        @NotNull
        public static final Parcelable.Creator<Customise> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f83172a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f83173b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f83174c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Customise(parcel.readString(), parcel.readString(), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Customise[i];
            }
        }

        public Customise(String str, String str2, boolean z) {
            this.f83172a = str;
            this.f83173b = str2;
            this.f83174c = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Customise)) {
                return false;
            }
            Customise customise = (Customise) obj2;
            return Intrinsics.f(this.f83172a, customise.f83172a) && Intrinsics.f(this.f83173b, customise.f83173b) && this.f83174c == customise.f83174c;
        }

        public final int hashCode() {
            String str = this.f83172a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f83173b;
            return Boolean.hashCode(this.f83174c) + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f83172a);
            dest.writeString(this.f83173b);
            dest.writeInt(this.f83174c ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/retail/savings/api/navigation/feature_config/SavingsKompotFeatureConfig$TransferWidgetCustomisationScreen$InputData$SelectGoalAccount;", "Lcom/revolut/feature/retail/savings/api/navigation/feature_config/SavingsKompotFeatureConfig$TransferWidgetCustomisationScreen$InputData;", "<init>", "()V", "feature_retail_savings_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class SelectGoalAccount implements SavingsKompotFeatureConfig$TransferWidgetCustomisationScreen$InputData {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final SelectGoalAccount f83175a = new SelectGoalAccount();

        @NotNull
        public static final Parcelable.Creator<SelectGoalAccount> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return SelectGoalAccount.f83175a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SelectGoalAccount[i];
            }
        }

        private SelectGoalAccount() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/retail/savings/api/navigation/feature_config/SavingsKompotFeatureConfig$TransferWidgetCustomisationScreen$InputData$SelectSpareChangeAccount;", "Lcom/revolut/feature/retail/savings/api/navigation/feature_config/SavingsKompotFeatureConfig$TransferWidgetCustomisationScreen$InputData;", "<init>", "()V", "feature_retail_savings_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class SelectSpareChangeAccount implements SavingsKompotFeatureConfig$TransferWidgetCustomisationScreen$InputData {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final SelectSpareChangeAccount f83176a = new SelectSpareChangeAccount();

        @NotNull
        public static final Parcelable.Creator<SelectSpareChangeAccount> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return SelectSpareChangeAccount.f83176a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SelectSpareChangeAccount[i];
            }
        }

        private SelectSpareChangeAccount() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/retail/savings/api/navigation/feature_config/SavingsKompotFeatureConfig$TransferWidgetCustomisationScreen$InputData$SelectTopUpAccount;", "Lcom/revolut/feature/retail/savings/api/navigation/feature_config/SavingsKompotFeatureConfig$TransferWidgetCustomisationScreen$InputData;", "", "toString", "()Ljava/lang/String;", "feature_retail_savings_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SelectTopUpAccount implements SavingsKompotFeatureConfig$TransferWidgetCustomisationScreen$InputData {

        @NotNull
        public static final Parcelable.Creator<SelectTopUpAccount> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Long f83177a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SelectTopUpAccount(parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SelectTopUpAccount[i];
            }
        }

        public SelectTopUpAccount() {
            this(null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof SelectTopUpAccount) && Intrinsics.f(this.f83177a, ((SelectTopUpAccount) obj2).f83177a);
        }

        public final int hashCode() {
            Long l2 = this.f83177a;
            if (l2 == null) {
                return 0;
            }
            return l2.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            Long l2 = this.f83177a;
            if (l2 == null) {
                dest.writeInt(0);
            } else {
                b.A(dest, 1, l2);
            }
        }

        public SelectTopUpAccount(Long l2) {
            this.f83177a = l2;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/retail/savings/api/navigation/feature_config/SavingsKompotFeatureConfig$TransferWidgetCustomisationScreen$InputData$SelectWithdrawAccount;", "Lcom/revolut/feature/retail/savings/api/navigation/feature_config/SavingsKompotFeatureConfig$TransferWidgetCustomisationScreen$InputData;", "<init>", "()V", "feature_retail_savings_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class SelectWithdrawAccount implements SavingsKompotFeatureConfig$TransferWidgetCustomisationScreen$InputData {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final SelectWithdrawAccount f83178a = new SelectWithdrawAccount();

        @NotNull
        public static final Parcelable.Creator<SelectWithdrawAccount> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return SelectWithdrawAccount.f83178a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SelectWithdrawAccount[i];
            }
        }

        private SelectWithdrawAccount() {
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
}
