package com.revolut.feature.retail.salary_account.impl.flow.ui;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000(\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0007\u0002\u0003\u0004\u0005\u0006\u0007\b\u0082\u0001\u0007\t\n\u000b\f\r\u000e\u000f¨\u0006\u0010À\u0006\u0003"}, d2 = {"com/revolut/feature/retail/salary_account/impl/flow/ui/SalaryAccountFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "SalaryAccountProductArticle", "SalaryAccountDetails", "SalaryHub", "SalaryHubV3", "SalarySwitchAssistant", "IncomeInsuranceClaim", "SalaryMoveBottomSheet", "Lcom/revolut/feature/retail/salary_account/impl/flow/ui/SalaryAccountFlowContract$Step$IncomeInsuranceClaim;", "Lcom/revolut/feature/retail/salary_account/impl/flow/ui/SalaryAccountFlowContract$Step$SalaryAccountDetails;", "Lcom/revolut/feature/retail/salary_account/impl/flow/ui/SalaryAccountFlowContract$Step$SalaryAccountProductArticle;", "Lcom/revolut/feature/retail/salary_account/impl/flow/ui/SalaryAccountFlowContract$Step$SalaryHub;", "Lcom/revolut/feature/retail/salary_account/impl/flow/ui/SalaryAccountFlowContract$Step$SalaryHubV3;", "Lcom/revolut/feature/retail/salary_account/impl/flow/ui/SalaryAccountFlowContract$Step$SalaryMoveBottomSheet;", "Lcom/revolut/feature/retail/salary_account/impl/flow/ui/SalaryAccountFlowContract$Step$SalarySwitchAssistant;", "feature_retail_salary_account_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface SalaryAccountFlowContract$Step extends FlowStep {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/retail/salary_account/impl/flow/ui/SalaryAccountFlowContract$Step$IncomeInsuranceClaim;", "Lcom/revolut/feature/retail/salary_account/impl/flow/ui/SalaryAccountFlowContract$Step;", "<init>", "()V", "feature_retail_salary_account_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class IncomeInsuranceClaim implements SalaryAccountFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final IncomeInsuranceClaim f82969a = new IncomeInsuranceClaim();

        @NotNull
        public static final Parcelable.Creator<IncomeInsuranceClaim> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return IncomeInsuranceClaim.f82969a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new IncomeInsuranceClaim[i];
            }
        }

        private IncomeInsuranceClaim() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/retail/salary_account/impl/flow/ui/SalaryAccountFlowContract$Step$SalaryAccountDetails;", "Lcom/revolut/feature/retail/salary_account/impl/flow/ui/SalaryAccountFlowContract$Step;", "<init>", "()V", "feature_retail_salary_account_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class SalaryAccountDetails implements SalaryAccountFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final SalaryAccountDetails f82970a = new SalaryAccountDetails();

        @NotNull
        public static final Parcelable.Creator<SalaryAccountDetails> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return SalaryAccountDetails.f82970a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SalaryAccountDetails[i];
            }
        }

        private SalaryAccountDetails() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/retail/salary_account/impl/flow/ui/SalaryAccountFlowContract$Step$SalaryAccountProductArticle;", "Lcom/revolut/feature/retail/salary_account/impl/flow/ui/SalaryAccountFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_retail_salary_account_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SalaryAccountProductArticle implements SalaryAccountFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<SalaryAccountProductArticle> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final agb.a f82971a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SalaryAccountProductArticle(agb.a.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SalaryAccountProductArticle[i];
            }
        }

        public SalaryAccountProductArticle(agb.a productArticleId) {
            Intrinsics.checkNotNullParameter(productArticleId, "productArticleId");
            this.f82971a = productArticleId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof SalaryAccountProductArticle) && this.f82971a == ((SalaryAccountProductArticle) obj2).f82971a;
        }

        public final int hashCode() {
            return this.f82971a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f82971a.name());
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/retail/salary_account/impl/flow/ui/SalaryAccountFlowContract$Step$SalaryHub;", "Lcom/revolut/feature/retail/salary_account/impl/flow/ui/SalaryAccountFlowContract$Step;", "<init>", "()V", "feature_retail_salary_account_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class SalaryHub implements SalaryAccountFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final SalaryHub f82972a = new SalaryHub();

        @NotNull
        public static final Parcelable.Creator<SalaryHub> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return SalaryHub.f82972a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SalaryHub[i];
            }
        }

        private SalaryHub() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/retail/salary_account/impl/flow/ui/SalaryAccountFlowContract$Step$SalaryHubV3;", "Lcom/revolut/feature/retail/salary_account/impl/flow/ui/SalaryAccountFlowContract$Step;", "<init>", "()V", "feature_retail_salary_account_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class SalaryHubV3 implements SalaryAccountFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final SalaryHubV3 f82973a = new SalaryHubV3();

        @NotNull
        public static final Parcelable.Creator<SalaryHubV3> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return SalaryHubV3.f82973a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SalaryHubV3[i];
            }
        }

        private SalaryHubV3() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/retail/salary_account/impl/flow/ui/SalaryAccountFlowContract$Step$SalaryMoveBottomSheet;", "Lcom/revolut/feature/retail/salary_account/impl/flow/ui/SalaryAccountFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_retail_salary_account_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SalaryMoveBottomSheet implements SalaryAccountFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<SalaryMoveBottomSheet> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final mn2.a f82974a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final bgb.c f82975b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SalaryMoveBottomSheet(mn2.a.valueOf(parcel.readString()), bgb.c.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SalaryMoveBottomSheet[i];
            }
        }

        public SalaryMoveBottomSheet(mn2.a serviceType, bgb.c navigationOrigin) {
            Intrinsics.checkNotNullParameter(serviceType, "serviceType");
            Intrinsics.checkNotNullParameter(navigationOrigin, "navigationOrigin");
            this.f82974a = serviceType;
            this.f82975b = navigationOrigin;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof SalaryMoveBottomSheet)) {
                return false;
            }
            SalaryMoveBottomSheet salaryMoveBottomSheet = (SalaryMoveBottomSheet) obj2;
            return this.f82974a == salaryMoveBottomSheet.f82974a && this.f82975b == salaryMoveBottomSheet.f82975b;
        }

        public final int hashCode() {
            return this.f82975b.hashCode() + (this.f82974a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f82974a.name());
            dest.writeString(this.f82975b.name());
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/retail/salary_account/impl/flow/ui/SalaryAccountFlowContract$Step$SalarySwitchAssistant;", "Lcom/revolut/feature/retail/salary_account/impl/flow/ui/SalaryAccountFlowContract$Step;", "<init>", "()V", "feature_retail_salary_account_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class SalarySwitchAssistant implements SalaryAccountFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final SalarySwitchAssistant f82976a = new SalarySwitchAssistant();

        @NotNull
        public static final Parcelable.Creator<SalarySwitchAssistant> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return SalarySwitchAssistant.f82976a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SalarySwitchAssistant[i];
            }
        }

        private SalarySwitchAssistant() {
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
