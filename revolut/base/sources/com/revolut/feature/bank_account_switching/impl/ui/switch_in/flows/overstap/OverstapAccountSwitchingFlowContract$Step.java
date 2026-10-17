package com.revolut.feature.bank_account_switching.impl.ui.switch_in.flows.overstap;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.bank_account_switching.impl.domain.joint_account.JointAccountData;
import com.revolut.feature.bank_account_switching.impl.ui.form.domain.FormState;
import com.revolut.kompot.navigable.flow.FlowStep;
import java.time.LocalDate;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000(\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0007\u0002\u0003\u0004\u0005\u0006\u0007\b\u0082\u0001\u0007\t\n\u000b\f\r\u000e\u000f¨\u0006\u0010À\u0006\u0003"}, d2 = {"com/revolut/feature/bank_account_switching/impl/ui/switch_in/flows/overstap/OverstapAccountSwitchingFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "Entry", "ProductArticle", "TargetAccountSelection", "SourceAccountForm", "StartDateSelection", "Review", "RequestStatus", "Lcom/revolut/feature/bank_account_switching/impl/ui/switch_in/flows/overstap/OverstapAccountSwitchingFlowContract$Step$Entry;", "Lcom/revolut/feature/bank_account_switching/impl/ui/switch_in/flows/overstap/OverstapAccountSwitchingFlowContract$Step$ProductArticle;", "Lcom/revolut/feature/bank_account_switching/impl/ui/switch_in/flows/overstap/OverstapAccountSwitchingFlowContract$Step$RequestStatus;", "Lcom/revolut/feature/bank_account_switching/impl/ui/switch_in/flows/overstap/OverstapAccountSwitchingFlowContract$Step$Review;", "Lcom/revolut/feature/bank_account_switching/impl/ui/switch_in/flows/overstap/OverstapAccountSwitchingFlowContract$Step$SourceAccountForm;", "Lcom/revolut/feature/bank_account_switching/impl/ui/switch_in/flows/overstap/OverstapAccountSwitchingFlowContract$Step$StartDateSelection;", "Lcom/revolut/feature/bank_account_switching/impl/ui/switch_in/flows/overstap/OverstapAccountSwitchingFlowContract$Step$TargetAccountSelection;", "feature_bank_account_switching_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface OverstapAccountSwitchingFlowContract$Step extends FlowStep {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/bank_account_switching/impl/ui/switch_in/flows/overstap/OverstapAccountSwitchingFlowContract$Step$Entry;", "Lcom/revolut/feature/bank_account_switching/impl/ui/switch_in/flows/overstap/OverstapAccountSwitchingFlowContract$Step;", "<init>", "()V", "feature_bank_account_switching_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Entry implements OverstapAccountSwitchingFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Entry f64031a = new Entry();

        @NotNull
        public static final Parcelable.Creator<Entry> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Entry.f64031a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Entry[i];
            }
        }

        private Entry() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/bank_account_switching/impl/ui/switch_in/flows/overstap/OverstapAccountSwitchingFlowContract$Step$ProductArticle;", "Lcom/revolut/feature/bank_account_switching/impl/ui/switch_in/flows/overstap/OverstapAccountSwitchingFlowContract$Step;", "<init>", "()V", "feature_bank_account_switching_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class ProductArticle implements OverstapAccountSwitchingFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ProductArticle f64032a = new ProductArticle();

        @NotNull
        public static final Parcelable.Creator<ProductArticle> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return ProductArticle.f64032a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ProductArticle[i];
            }
        }

        private ProductArticle() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/bank_account_switching/impl/ui/switch_in/flows/overstap/OverstapAccountSwitchingFlowContract$Step$RequestStatus;", "Lcom/revolut/feature/bank_account_switching/impl/ui/switch_in/flows/overstap/OverstapAccountSwitchingFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_bank_account_switching_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class RequestStatus implements OverstapAccountSwitchingFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<RequestStatus> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f64033a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new RequestStatus(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new RequestStatus[i];
            }
        }

        public RequestStatus(String requestId) {
            Intrinsics.checkNotNullParameter(requestId, "requestId");
            this.f64033a = requestId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof RequestStatus) && Intrinsics.f(this.f64033a, ((RequestStatus) obj2).f64033a);
        }

        public final int hashCode() {
            return this.f64033a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f64033a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/bank_account_switching/impl/ui/switch_in/flows/overstap/OverstapAccountSwitchingFlowContract$Step$Review;", "Lcom/revolut/feature/bank_account_switching/impl/ui/switch_in/flows/overstap/OverstapAccountSwitchingFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_bank_account_switching_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Review implements OverstapAccountSwitchingFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Review> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final wn2.a f64034a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final FormState f64035b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final LocalDate f64036c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Review(wn2.a.valueOf(parcel.readString()), FormState.CREATOR.createFromParcel(parcel), (LocalDate) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Review[i];
            }
        }

        public Review(wn2.a targetAccountType, FormState formState, LocalDate selectedStartDate) {
            Intrinsics.checkNotNullParameter(targetAccountType, "targetAccountType");
            Intrinsics.checkNotNullParameter(formState, "formState");
            Intrinsics.checkNotNullParameter(selectedStartDate, "selectedStartDate");
            this.f64034a = targetAccountType;
            this.f64035b = formState;
            this.f64036c = selectedStartDate;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Review)) {
                return false;
            }
            Review review = (Review) obj2;
            return this.f64034a == review.f64034a && Intrinsics.f(this.f64035b, review.f64035b) && Intrinsics.f(this.f64036c, review.f64036c);
        }

        public final int hashCode() {
            return this.f64036c.hashCode() + ((this.f64035b.hashCode() + (this.f64034a.hashCode() * 31)) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f64034a.name());
            this.f64035b.writeToParcel(dest, i);
            dest.writeSerializable(this.f64036c);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/bank_account_switching/impl/ui/switch_in/flows/overstap/OverstapAccountSwitchingFlowContract$Step$SourceAccountForm;", "Lcom/revolut/feature/bank_account_switching/impl/ui/switch_in/flows/overstap/OverstapAccountSwitchingFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_bank_account_switching_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SourceAccountForm implements OverstapAccountSwitchingFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<SourceAccountForm> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final wn2.a f64037a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SourceAccountForm(wn2.a.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SourceAccountForm[i];
            }
        }

        public SourceAccountForm(wn2.a targetAccountType) {
            Intrinsics.checkNotNullParameter(targetAccountType, "targetAccountType");
            this.f64037a = targetAccountType;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof SourceAccountForm) && this.f64037a == ((SourceAccountForm) obj2).f64037a;
        }

        public final int hashCode() {
            return this.f64037a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f64037a.name());
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/bank_account_switching/impl/ui/switch_in/flows/overstap/OverstapAccountSwitchingFlowContract$Step$StartDateSelection;", "Lcom/revolut/feature/bank_account_switching/impl/ui/switch_in/flows/overstap/OverstapAccountSwitchingFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_bank_account_switching_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class StartDateSelection implements OverstapAccountSwitchingFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<StartDateSelection> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final wn2.a f64038a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final FormState f64039b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new StartDateSelection(FormState.CREATOR.createFromParcel(parcel), wn2.a.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new StartDateSelection[i];
            }
        }

        public StartDateSelection(FormState formState, wn2.a targetAccountType) {
            Intrinsics.checkNotNullParameter(targetAccountType, "targetAccountType");
            Intrinsics.checkNotNullParameter(formState, "formState");
            this.f64038a = targetAccountType;
            this.f64039b = formState;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof StartDateSelection)) {
                return false;
            }
            StartDateSelection startDateSelection = (StartDateSelection) obj2;
            return this.f64038a == startDateSelection.f64038a && Intrinsics.f(this.f64039b, startDateSelection.f64039b);
        }

        public final int hashCode() {
            return this.f64039b.hashCode() + (this.f64038a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f64038a.name());
            this.f64039b.writeToParcel(dest, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/bank_account_switching/impl/ui/switch_in/flows/overstap/OverstapAccountSwitchingFlowContract$Step$TargetAccountSelection;", "Lcom/revolut/feature/bank_account_switching/impl/ui/switch_in/flows/overstap/OverstapAccountSwitchingFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_bank_account_switching_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class TargetAccountSelection implements OverstapAccountSwitchingFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<TargetAccountSelection> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final JointAccountData f64040a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new TargetAccountSelection(JointAccountData.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new TargetAccountSelection[i];
            }
        }

        public TargetAccountSelection(JointAccountData jointAccountData) {
            Intrinsics.checkNotNullParameter(jointAccountData, "jointAccountData");
            this.f64040a = jointAccountData;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof TargetAccountSelection) && Intrinsics.f(this.f64040a, ((TargetAccountSelection) obj2).f64040a);
        }

        public final int hashCode() {
            return this.f64040a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f64040a.writeToParcel(dest, i);
        }
    }
}
