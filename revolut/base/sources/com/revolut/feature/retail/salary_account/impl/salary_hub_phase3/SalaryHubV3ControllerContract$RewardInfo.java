package com.revolut.feature.retail.salary_account.impl.salary_hub_phase3;

import android.os.Parcel;
import android.os.Parcelable;
import dj0.d;
import java.time.Instant;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0004\u0007\b\t\n¨\u0006\u000bÀ\u0006\u0003"}, d2 = {"com/revolut/feature/retail/salary_account/impl/salary_hub_phase3/SalaryHubV3ControllerContract$RewardInfo", "Landroid/os/Parcelable;", "RewardSalaryDraw", "FreePremium", "SavingsBoost", "IncomeInsurance", "RewardStatus", "Lcom/revolut/feature/retail/salary_account/impl/salary_hub_phase3/SalaryHubV3ControllerContract$RewardInfo$FreePremium;", "Lcom/revolut/feature/retail/salary_account/impl/salary_hub_phase3/SalaryHubV3ControllerContract$RewardInfo$IncomeInsurance;", "Lcom/revolut/feature/retail/salary_account/impl/salary_hub_phase3/SalaryHubV3ControllerContract$RewardInfo$RewardSalaryDraw;", "Lcom/revolut/feature/retail/salary_account/impl/salary_hub_phase3/SalaryHubV3ControllerContract$RewardInfo$SavingsBoost;", "feature_retail_salary_account_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface SalaryHubV3ControllerContract$RewardInfo extends Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/retail/salary_account/impl/salary_hub_phase3/SalaryHubV3ControllerContract$RewardInfo$FreePremium;", "Lcom/revolut/feature/retail/salary_account/impl/salary_hub_phase3/SalaryHubV3ControllerContract$RewardInfo;", "", "toString", "()Ljava/lang/String;", "feature_retail_salary_account_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class FreePremium implements SalaryHubV3ControllerContract$RewardInfo {

        @NotNull
        public static final Parcelable.Creator<FreePremium> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f82997a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final RewardStatus f82998b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new FreePremium(parcel.readString(), (RewardStatus) parcel.readParcelable(FreePremium.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new FreePremium[i];
            }
        }

        public FreePremium(String deeplink, RewardStatus rewardStatus) {
            Intrinsics.checkNotNullParameter(deeplink, "deeplink");
            Intrinsics.checkNotNullParameter(rewardStatus, "rewardStatus");
            this.f82997a = deeplink;
            this.f82998b = rewardStatus;
        }

        @Override // com.revolut.feature.retail.salary_account.impl.salary_hub_phase3.SalaryHubV3ControllerContract$RewardInfo
        /* JADX INFO: renamed from: C0, reason: from getter */
        public final String getF83007a() {
            return this.f82997a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof FreePremium)) {
                return false;
            }
            FreePremium freePremium = (FreePremium) obj2;
            return Intrinsics.f(this.f82997a, freePremium.f82997a) && Intrinsics.f(this.f82998b, freePremium.f82998b);
        }

        public final int hashCode() {
            return this.f82998b.hashCode() + (this.f82997a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f82997a);
            dest.writeParcelable(this.f82998b, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/retail/salary_account/impl/salary_hub_phase3/SalaryHubV3ControllerContract$RewardInfo$IncomeInsurance;", "Lcom/revolut/feature/retail/salary_account/impl/salary_hub_phase3/SalaryHubV3ControllerContract$RewardInfo;", "", "toString", "()Ljava/lang/String;", "feature_retail_salary_account_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class IncomeInsurance implements SalaryHubV3ControllerContract$RewardInfo {

        @NotNull
        public static final Parcelable.Creator<IncomeInsurance> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f82999a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final RewardStatus f83000b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new IncomeInsurance(parcel.readString(), (RewardStatus) parcel.readParcelable(IncomeInsurance.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new IncomeInsurance[i];
            }
        }

        public IncomeInsurance(String deeplink, RewardStatus rewardStatus) {
            Intrinsics.checkNotNullParameter(deeplink, "deeplink");
            Intrinsics.checkNotNullParameter(rewardStatus, "rewardStatus");
            this.f82999a = deeplink;
            this.f83000b = rewardStatus;
        }

        @Override // com.revolut.feature.retail.salary_account.impl.salary_hub_phase3.SalaryHubV3ControllerContract$RewardInfo
        /* JADX INFO: renamed from: C0, reason: from getter */
        public final String getF83007a() {
            return this.f82999a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof IncomeInsurance)) {
                return false;
            }
            IncomeInsurance incomeInsurance = (IncomeInsurance) obj2;
            return Intrinsics.f(this.f82999a, incomeInsurance.f82999a) && Intrinsics.f(this.f83000b, incomeInsurance.f83000b);
        }

        public final int hashCode() {
            return this.f83000b.hashCode() + (this.f82999a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f82999a);
            dest.writeParcelable(this.f83000b, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/retail/salary_account/impl/salary_hub_phase3/SalaryHubV3ControllerContract$RewardInfo$RewardSalaryDraw;", "Lcom/revolut/feature/retail/salary_account/impl/salary_hub_phase3/SalaryHubV3ControllerContract$RewardInfo;", "", "toString", "()Ljava/lang/String;", "feature_retail_salary_account_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class RewardSalaryDraw implements SalaryHubV3ControllerContract$RewardInfo {

        @NotNull
        public static final Parcelable.Creator<RewardSalaryDraw> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f83001a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final RewardStatus f83002b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final d f83003c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new RewardSalaryDraw(parcel.readString(), (RewardStatus) parcel.readParcelable(RewardSalaryDraw.class.getClassLoader()), (d) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new RewardSalaryDraw[i];
            }
        }

        public RewardSalaryDraw(String deeplink, RewardStatus rewardStatus, d prizeAmount) {
            Intrinsics.checkNotNullParameter(deeplink, "deeplink");
            Intrinsics.checkNotNullParameter(rewardStatus, "rewardStatus");
            Intrinsics.checkNotNullParameter(prizeAmount, "prizeAmount");
            this.f83001a = deeplink;
            this.f83002b = rewardStatus;
            this.f83003c = prizeAmount;
        }

        @Override // com.revolut.feature.retail.salary_account.impl.salary_hub_phase3.SalaryHubV3ControllerContract$RewardInfo
        /* JADX INFO: renamed from: C0, reason: from getter */
        public final String getF83007a() {
            return this.f83001a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof RewardSalaryDraw)) {
                return false;
            }
            RewardSalaryDraw rewardSalaryDraw = (RewardSalaryDraw) obj2;
            return Intrinsics.f(this.f83001a, rewardSalaryDraw.f83001a) && Intrinsics.f(this.f83002b, rewardSalaryDraw.f83002b) && Intrinsics.f(this.f83003c, rewardSalaryDraw.f83003c);
        }

        public final int hashCode() {
            return this.f83003c.hashCode() + ((this.f83002b.hashCode() + (this.f83001a.hashCode() * 31)) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f83001a);
            dest.writeParcelable(this.f83002b, i);
            dest.writeSerializable(this.f83003c);
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/retail/salary_account/impl/salary_hub_phase3/SalaryHubV3ControllerContract$RewardInfo$RewardStatus;", "Landroid/os/Parcelable;", "Locked", "Coming", "Other", "Lcom/revolut/feature/retail/salary_account/impl/salary_hub_phase3/SalaryHubV3ControllerContract$RewardInfo$RewardStatus$Coming;", "Lcom/revolut/feature/retail/salary_account/impl/salary_hub_phase3/SalaryHubV3ControllerContract$RewardInfo$RewardStatus$Locked;", "Lcom/revolut/feature/retail/salary_account/impl/salary_hub_phase3/SalaryHubV3ControllerContract$RewardInfo$RewardStatus$Other;", "feature_retail_salary_account_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface RewardStatus extends Parcelable {

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/retail/salary_account/impl/salary_hub_phase3/SalaryHubV3ControllerContract$RewardInfo$RewardStatus$Coming;", "Lcom/revolut/feature/retail/salary_account/impl/salary_hub_phase3/SalaryHubV3ControllerContract$RewardInfo$RewardStatus;", "", "toString", "()Ljava/lang/String;", "feature_retail_salary_account_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Coming implements RewardStatus {

            @NotNull
            public static final Parcelable.Creator<Coming> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Instant f83004a;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Coming((Instant) parcel.readSerializable());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Coming[i];
                }
            }

            public Coming() {
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
                return (obj2 instanceof Coming) && Intrinsics.f(this.f83004a, ((Coming) obj2).f83004a);
            }

            public final int hashCode() {
                Instant instant = this.f83004a;
                if (instant == null) {
                    return 0;
                }
                return instant.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeSerializable(this.f83004a);
            }

            public Coming(Instant instant) {
                this.f83004a = instant;
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/retail/salary_account/impl/salary_hub_phase3/SalaryHubV3ControllerContract$RewardInfo$RewardStatus$Locked;", "Lcom/revolut/feature/retail/salary_account/impl/salary_hub_phase3/SalaryHubV3ControllerContract$RewardInfo$RewardStatus;", "", "toString", "()Ljava/lang/String;", "feature_retail_salary_account_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Locked implements RewardStatus {

            @NotNull
            public static final Parcelable.Creator<Locked> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Integer f83005a;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Locked(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Locked[i];
                }
            }

            public Locked() {
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
                return (obj2 instanceof Locked) && Intrinsics.f(this.f83005a, ((Locked) obj2).f83005a);
            }

            public final int hashCode() {
                Integer num = this.f83005a;
                if (num == null) {
                    return 0;
                }
                return num.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                Integer num = this.f83005a;
                if (num == null) {
                    dest.writeInt(0);
                } else {
                    p.a.B(dest, 1, num);
                }
            }

            public Locked(Integer num) {
                this.f83005a = num;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/retail/salary_account/impl/salary_hub_phase3/SalaryHubV3ControllerContract$RewardInfo$RewardStatus$Other;", "Lcom/revolut/feature/retail/salary_account/impl/salary_hub_phase3/SalaryHubV3ControllerContract$RewardInfo$RewardStatus;", "<init>", "()V", "feature_retail_salary_account_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class Other implements RewardStatus {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final Other f83006a = new Other();

            @NotNull
            public static final Parcelable.Creator<Other> CREATOR = new a();

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return Other.f83006a;
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Other[i];
                }
            }

            private Other() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/retail/salary_account/impl/salary_hub_phase3/SalaryHubV3ControllerContract$RewardInfo$SavingsBoost;", "Lcom/revolut/feature/retail/salary_account/impl/salary_hub_phase3/SalaryHubV3ControllerContract$RewardInfo;", "", "toString", "()Ljava/lang/String;", "feature_retail_salary_account_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SavingsBoost implements SalaryHubV3ControllerContract$RewardInfo {

        @NotNull
        public static final Parcelable.Creator<SavingsBoost> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f83007a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final RewardStatus f83008b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SavingsBoost(parcel.readString(), (RewardStatus) parcel.readParcelable(SavingsBoost.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SavingsBoost[i];
            }
        }

        public SavingsBoost(String deeplink, RewardStatus rewardStatus) {
            Intrinsics.checkNotNullParameter(deeplink, "deeplink");
            Intrinsics.checkNotNullParameter(rewardStatus, "rewardStatus");
            this.f83007a = deeplink;
            this.f83008b = rewardStatus;
        }

        @Override // com.revolut.feature.retail.salary_account.impl.salary_hub_phase3.SalaryHubV3ControllerContract$RewardInfo
        /* JADX INFO: renamed from: C0, reason: from getter */
        public final String getF83007a() {
            return this.f83007a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof SavingsBoost)) {
                return false;
            }
            SavingsBoost savingsBoost = (SavingsBoost) obj2;
            return Intrinsics.f(this.f83007a, savingsBoost.f83007a) && Intrinsics.f(this.f83008b, savingsBoost.f83008b);
        }

        public final int hashCode() {
            return this.f83008b.hashCode() + (this.f83007a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f83007a);
            dest.writeParcelable(this.f83008b, i);
        }
    }

    /* JADX INFO: renamed from: C0 */
    String getF83007a();
}
