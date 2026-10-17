package com.revolut.feature.salary_switch.impl.ui.brazil.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.salary_switch.impl.ui.brazil.screen.bank_list.BankListScreenContract$InputData;
import com.revolut.feature.salary_switch.impl.ui.brazil.screen.review_details.ReviewDetailsScreenContract$InputData;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0006\b\t\n\u000b\f\r¨\u0006\u000eÀ\u0006\u0003"}, d2 = {"com/revolut/feature/salary_switch/impl/ui/brazil/flow/SalarySwitchBrFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "BankList", "EnterEmployerDetails", "ReviewDetails", "SalaryStatus", "RequestsList", "Promo", "Lcom/revolut/feature/salary_switch/impl/ui/brazil/flow/SalarySwitchBrFlowContract$Step$BankList;", "Lcom/revolut/feature/salary_switch/impl/ui/brazil/flow/SalarySwitchBrFlowContract$Step$EnterEmployerDetails;", "Lcom/revolut/feature/salary_switch/impl/ui/brazil/flow/SalarySwitchBrFlowContract$Step$Promo;", "Lcom/revolut/feature/salary_switch/impl/ui/brazil/flow/SalarySwitchBrFlowContract$Step$RequestsList;", "Lcom/revolut/feature/salary_switch/impl/ui/brazil/flow/SalarySwitchBrFlowContract$Step$ReviewDetails;", "Lcom/revolut/feature/salary_switch/impl/ui/brazil/flow/SalarySwitchBrFlowContract$Step$SalaryStatus;", "feature_retail_salary_switch_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface SalarySwitchBrFlowContract$Step extends FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/salary_switch/impl/ui/brazil/flow/SalarySwitchBrFlowContract$Step$BankList;", "Lcom/revolut/feature/salary_switch/impl/ui/brazil/flow/SalarySwitchBrFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_retail_salary_switch_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class BankList implements SalarySwitchBrFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<BankList> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final BankListScreenContract$InputData f85267a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new BankList(BankListScreenContract$InputData.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new BankList[i];
            }
        }

        public BankList(BankListScreenContract$InputData inputData) {
            Intrinsics.checkNotNullParameter(inputData, "inputData");
            this.f85267a = inputData;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof BankList) && Intrinsics.f(this.f85267a, ((BankList) obj2).f85267a);
        }

        public final int hashCode() {
            return this.f85267a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f85267a.writeToParcel(dest, i);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/salary_switch/impl/ui/brazil/flow/SalarySwitchBrFlowContract$Step$EnterEmployerDetails;", "Lcom/revolut/feature/salary_switch/impl/ui/brazil/flow/SalarySwitchBrFlowContract$Step;", "<init>", "()V", "feature_retail_salary_switch_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class EnterEmployerDetails implements SalarySwitchBrFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final EnterEmployerDetails f85268a = new EnterEmployerDetails();

        @NotNull
        public static final Parcelable.Creator<EnterEmployerDetails> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return EnterEmployerDetails.f85268a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new EnterEmployerDetails[i];
            }
        }

        private EnterEmployerDetails() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/salary_switch/impl/ui/brazil/flow/SalarySwitchBrFlowContract$Step$Promo;", "Lcom/revolut/feature/salary_switch/impl/ui/brazil/flow/SalarySwitchBrFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_retail_salary_switch_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Promo implements SalarySwitchBrFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Promo> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final SalarySwitchBrFlowContract$Step f85269a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Promo((SalarySwitchBrFlowContract$Step) parcel.readParcelable(Promo.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Promo[i];
            }
        }

        public Promo(SalarySwitchBrFlowContract$Step next) {
            Intrinsics.checkNotNullParameter(next, "next");
            this.f85269a = next;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Promo) && Intrinsics.f(this.f85269a, ((Promo) obj2).f85269a);
        }

        public final int hashCode() {
            return this.f85269a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f85269a, i);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/salary_switch/impl/ui/brazil/flow/SalarySwitchBrFlowContract$Step$RequestsList;", "Lcom/revolut/feature/salary_switch/impl/ui/brazil/flow/SalarySwitchBrFlowContract$Step;", "<init>", "()V", "feature_retail_salary_switch_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class RequestsList implements SalarySwitchBrFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final RequestsList f85270a = new RequestsList();

        @NotNull
        public static final Parcelable.Creator<RequestsList> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return RequestsList.f85270a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new RequestsList[i];
            }
        }

        private RequestsList() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/salary_switch/impl/ui/brazil/flow/SalarySwitchBrFlowContract$Step$ReviewDetails;", "Lcom/revolut/feature/salary_switch/impl/ui/brazil/flow/SalarySwitchBrFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_retail_salary_switch_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ReviewDetails implements SalarySwitchBrFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<ReviewDetails> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ReviewDetailsScreenContract$InputData f85271a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ReviewDetails(ReviewDetailsScreenContract$InputData.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ReviewDetails[i];
            }
        }

        public ReviewDetails(ReviewDetailsScreenContract$InputData inputData) {
            Intrinsics.checkNotNullParameter(inputData, "inputData");
            this.f85271a = inputData;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof ReviewDetails) && Intrinsics.f(this.f85271a, ((ReviewDetails) obj2).f85271a);
        }

        public final int hashCode() {
            return this.f85271a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f85271a.writeToParcel(dest, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/salary_switch/impl/ui/brazil/flow/SalarySwitchBrFlowContract$Step$SalaryStatus;", "Lcom/revolut/feature/salary_switch/impl/ui/brazil/flow/SalarySwitchBrFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_retail_salary_switch_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SalaryStatus implements SalarySwitchBrFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<SalaryStatus> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f85272a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SalaryStatus(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SalaryStatus[i];
            }
        }

        public SalaryStatus(String id10) {
            Intrinsics.checkNotNullParameter(id10, "id");
            this.f85272a = id10;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof SalaryStatus) && Intrinsics.f(this.f85272a, ((SalaryStatus) obj2).f85272a);
        }

        public final int hashCode() {
            return this.f85272a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f85272a);
        }
    }
}
