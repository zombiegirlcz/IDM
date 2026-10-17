package com.revolut.feature.salary_switch.impl.ui.mexico.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.salary_switch.impl.models.SalarySwitchPreview;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"com/revolut/feature/salary_switch/impl/ui/mexico/flow/SalarySwitchMxFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "EnterAccountDetails", "ReviewAccountDetails", "ShowSalaryStatus", "Lcom/revolut/feature/salary_switch/impl/ui/mexico/flow/SalarySwitchMxFlowContract$Step$EnterAccountDetails;", "Lcom/revolut/feature/salary_switch/impl/ui/mexico/flow/SalarySwitchMxFlowContract$Step$ReviewAccountDetails;", "Lcom/revolut/feature/salary_switch/impl/ui/mexico/flow/SalarySwitchMxFlowContract$Step$ShowSalaryStatus;", "feature_retail_salary_switch_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface SalarySwitchMxFlowContract$Step extends FlowStep {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/salary_switch/impl/ui/mexico/flow/SalarySwitchMxFlowContract$Step$EnterAccountDetails;", "Lcom/revolut/feature/salary_switch/impl/ui/mexico/flow/SalarySwitchMxFlowContract$Step;", "<init>", "()V", "feature_retail_salary_switch_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class EnterAccountDetails implements SalarySwitchMxFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final EnterAccountDetails f85320a = new EnterAccountDetails();

        @NotNull
        public static final Parcelable.Creator<EnterAccountDetails> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return EnterAccountDetails.f85320a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new EnterAccountDetails[i];
            }
        }

        private EnterAccountDetails() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/salary_switch/impl/ui/mexico/flow/SalarySwitchMxFlowContract$Step$ReviewAccountDetails;", "Lcom/revolut/feature/salary_switch/impl/ui/mexico/flow/SalarySwitchMxFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_retail_salary_switch_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ReviewAccountDetails implements SalarySwitchMxFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<ReviewAccountDetails> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final SalarySwitchPreview f85321a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f85322b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ReviewAccountDetails(SalarySwitchPreview.CREATOR.createFromParcel(parcel), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ReviewAccountDetails[i];
            }
        }

        public ReviewAccountDetails(SalarySwitchPreview salarySwitchPreview, String currencyCode) {
            Intrinsics.checkNotNullParameter(salarySwitchPreview, "salarySwitchPreview");
            Intrinsics.checkNotNullParameter(currencyCode, "currencyCode");
            this.f85321a = salarySwitchPreview;
            this.f85322b = currencyCode;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof ReviewAccountDetails)) {
                return false;
            }
            ReviewAccountDetails reviewAccountDetails = (ReviewAccountDetails) obj2;
            return Intrinsics.f(this.f85321a, reviewAccountDetails.f85321a) && Intrinsics.f(this.f85322b, reviewAccountDetails.f85322b);
        }

        public final int hashCode() {
            return this.f85322b.hashCode() + (this.f85321a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f85321a.writeToParcel(dest, i);
            dest.writeString(this.f85322b);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/salary_switch/impl/ui/mexico/flow/SalarySwitchMxFlowContract$Step$ShowSalaryStatus;", "Lcom/revolut/feature/salary_switch/impl/ui/mexico/flow/SalarySwitchMxFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_retail_salary_switch_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ShowSalaryStatus implements SalarySwitchMxFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<ShowSalaryStatus> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f85323a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ShowSalaryStatus(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ShowSalaryStatus[i];
            }
        }

        public ShowSalaryStatus(String submissionId) {
            Intrinsics.checkNotNullParameter(submissionId, "submissionId");
            this.f85323a = submissionId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof ShowSalaryStatus) && Intrinsics.f(this.f85323a, ((ShowSalaryStatus) obj2).f85323a);
        }

        public final int hashCode() {
            return this.f85323a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f85323a);
        }
    }
}
