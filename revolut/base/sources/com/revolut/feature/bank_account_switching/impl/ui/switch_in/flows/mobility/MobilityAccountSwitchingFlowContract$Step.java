package com.revolut.feature.bank_account_switching.impl.ui.switch_in.flows.mobility;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.bank_account_switching.impl.domain.joint_account.JointAccountData;
import com.revolut.feature.bank_account_switching.impl.ui.form.domain.FormState;
import com.revolut.kompot.navigable.flow.FlowStep;
import java.time.LocalDate;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wn2.d;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\b\u0002\u0003\u0004\u0005\u0006\u0007\b\t\u0082\u0001\b\n\u000b\f\r\u000e\u000f\u0010\u0011¨\u0006\u0012À\u0006\u0003"}, d2 = {"com/revolut/feature/bank_account_switching/impl/ui/switch_in/flows/mobility/MobilityAccountSwitchingFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "Entry", "ProductArticle", "SwitchPreferenceSelection", "SourceAccountForm", "TargetAccountSelection", "SwitchDateSelection", "Review", "RequestStatus", "Lcom/revolut/feature/bank_account_switching/impl/ui/switch_in/flows/mobility/MobilityAccountSwitchingFlowContract$Step$Entry;", "Lcom/revolut/feature/bank_account_switching/impl/ui/switch_in/flows/mobility/MobilityAccountSwitchingFlowContract$Step$ProductArticle;", "Lcom/revolut/feature/bank_account_switching/impl/ui/switch_in/flows/mobility/MobilityAccountSwitchingFlowContract$Step$RequestStatus;", "Lcom/revolut/feature/bank_account_switching/impl/ui/switch_in/flows/mobility/MobilityAccountSwitchingFlowContract$Step$Review;", "Lcom/revolut/feature/bank_account_switching/impl/ui/switch_in/flows/mobility/MobilityAccountSwitchingFlowContract$Step$SourceAccountForm;", "Lcom/revolut/feature/bank_account_switching/impl/ui/switch_in/flows/mobility/MobilityAccountSwitchingFlowContract$Step$SwitchDateSelection;", "Lcom/revolut/feature/bank_account_switching/impl/ui/switch_in/flows/mobility/MobilityAccountSwitchingFlowContract$Step$SwitchPreferenceSelection;", "Lcom/revolut/feature/bank_account_switching/impl/ui/switch_in/flows/mobility/MobilityAccountSwitchingFlowContract$Step$TargetAccountSelection;", "feature_bank_account_switching_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface MobilityAccountSwitchingFlowContract$Step extends FlowStep {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/bank_account_switching/impl/ui/switch_in/flows/mobility/MobilityAccountSwitchingFlowContract$Step$Entry;", "Lcom/revolut/feature/bank_account_switching/impl/ui/switch_in/flows/mobility/MobilityAccountSwitchingFlowContract$Step;", "<init>", "()V", "feature_bank_account_switching_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Entry implements MobilityAccountSwitchingFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Entry f64011a = new Entry();

        @NotNull
        public static final Parcelable.Creator<Entry> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Entry.f64011a;
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/bank_account_switching/impl/ui/switch_in/flows/mobility/MobilityAccountSwitchingFlowContract$Step$ProductArticle;", "Lcom/revolut/feature/bank_account_switching/impl/ui/switch_in/flows/mobility/MobilityAccountSwitchingFlowContract$Step;", "<init>", "()V", "feature_bank_account_switching_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class ProductArticle implements MobilityAccountSwitchingFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ProductArticle f64012a = new ProductArticle();

        @NotNull
        public static final Parcelable.Creator<ProductArticle> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return ProductArticle.f64012a;
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/bank_account_switching/impl/ui/switch_in/flows/mobility/MobilityAccountSwitchingFlowContract$Step$RequestStatus;", "Lcom/revolut/feature/bank_account_switching/impl/ui/switch_in/flows/mobility/MobilityAccountSwitchingFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_bank_account_switching_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class RequestStatus implements MobilityAccountSwitchingFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<RequestStatus> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f64013a;

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
            this.f64013a = requestId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof RequestStatus) && Intrinsics.f(this.f64013a, ((RequestStatus) obj2).f64013a);
        }

        public final int hashCode() {
            return this.f64013a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f64013a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/bank_account_switching/impl/ui/switch_in/flows/mobility/MobilityAccountSwitchingFlowContract$Step$Review;", "Lcom/revolut/feature/bank_account_switching/impl/ui/switch_in/flows/mobility/MobilityAccountSwitchingFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_bank_account_switching_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Review implements MobilityAccountSwitchingFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Review> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final d f64014a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final FormState f64015b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final wn2.a f64016c;
        public final LocalDate d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Review(d.valueOf(parcel.readString()), FormState.CREATOR.createFromParcel(parcel), wn2.a.valueOf(parcel.readString()), (LocalDate) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Review[i];
            }
        }

        public Review(d switchPreference, FormState formState, wn2.a targetAccountType, LocalDate selectedStartDate) {
            Intrinsics.checkNotNullParameter(switchPreference, "switchPreference");
            Intrinsics.checkNotNullParameter(formState, "formState");
            Intrinsics.checkNotNullParameter(targetAccountType, "targetAccountType");
            Intrinsics.checkNotNullParameter(selectedStartDate, "selectedStartDate");
            this.f64014a = switchPreference;
            this.f64015b = formState;
            this.f64016c = targetAccountType;
            this.d = selectedStartDate;
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
            return this.f64014a == review.f64014a && Intrinsics.f(this.f64015b, review.f64015b) && this.f64016c == review.f64016c && Intrinsics.f(this.d, review.d);
        }

        public final int hashCode() {
            return this.d.hashCode() + ((this.f64016c.hashCode() + ((this.f64015b.hashCode() + (this.f64014a.hashCode() * 31)) * 31)) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f64014a.name());
            this.f64015b.writeToParcel(dest, i);
            dest.writeString(this.f64016c.name());
            dest.writeSerializable(this.d);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/bank_account_switching/impl/ui/switch_in/flows/mobility/MobilityAccountSwitchingFlowContract$Step$SourceAccountForm;", "Lcom/revolut/feature/bank_account_switching/impl/ui/switch_in/flows/mobility/MobilityAccountSwitchingFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_bank_account_switching_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SourceAccountForm implements MobilityAccountSwitchingFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<SourceAccountForm> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final d f64017a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SourceAccountForm(d.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SourceAccountForm[i];
            }
        }

        public SourceAccountForm(d switchPreference) {
            Intrinsics.checkNotNullParameter(switchPreference, "switchPreference");
            this.f64017a = switchPreference;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof SourceAccountForm) && this.f64017a == ((SourceAccountForm) obj2).f64017a;
        }

        public final int hashCode() {
            return this.f64017a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f64017a.name());
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/bank_account_switching/impl/ui/switch_in/flows/mobility/MobilityAccountSwitchingFlowContract$Step$SwitchDateSelection;", "Lcom/revolut/feature/bank_account_switching/impl/ui/switch_in/flows/mobility/MobilityAccountSwitchingFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_bank_account_switching_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SwitchDateSelection implements MobilityAccountSwitchingFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<SwitchDateSelection> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final d f64018a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final FormState f64019b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final wn2.a f64020c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SwitchDateSelection(FormState.CREATOR.createFromParcel(parcel), wn2.a.valueOf(parcel.readString()), d.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SwitchDateSelection[i];
            }
        }

        public SwitchDateSelection(FormState formState, wn2.a targetAccountType, d switchPreference) {
            Intrinsics.checkNotNullParameter(switchPreference, "switchPreference");
            Intrinsics.checkNotNullParameter(formState, "formState");
            Intrinsics.checkNotNullParameter(targetAccountType, "targetAccountType");
            this.f64018a = switchPreference;
            this.f64019b = formState;
            this.f64020c = targetAccountType;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof SwitchDateSelection)) {
                return false;
            }
            SwitchDateSelection switchDateSelection = (SwitchDateSelection) obj2;
            return this.f64018a == switchDateSelection.f64018a && Intrinsics.f(this.f64019b, switchDateSelection.f64019b) && this.f64020c == switchDateSelection.f64020c;
        }

        public final int hashCode() {
            return this.f64020c.hashCode() + ((this.f64019b.hashCode() + (this.f64018a.hashCode() * 31)) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f64018a.name());
            this.f64019b.writeToParcel(dest, i);
            dest.writeString(this.f64020c.name());
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/bank_account_switching/impl/ui/switch_in/flows/mobility/MobilityAccountSwitchingFlowContract$Step$SwitchPreferenceSelection;", "Lcom/revolut/feature/bank_account_switching/impl/ui/switch_in/flows/mobility/MobilityAccountSwitchingFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_bank_account_switching_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SwitchPreferenceSelection implements MobilityAccountSwitchingFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<SwitchPreferenceSelection> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f64021a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SwitchPreferenceSelection(parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SwitchPreferenceSelection[i];
            }
        }

        public SwitchPreferenceSelection(boolean z) {
            this.f64021a = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof SwitchPreferenceSelection) && this.f64021a == ((SwitchPreferenceSelection) obj2).f64021a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f64021a);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.f64021a ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/bank_account_switching/impl/ui/switch_in/flows/mobility/MobilityAccountSwitchingFlowContract$Step$TargetAccountSelection;", "Lcom/revolut/feature/bank_account_switching/impl/ui/switch_in/flows/mobility/MobilityAccountSwitchingFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_bank_account_switching_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class TargetAccountSelection implements MobilityAccountSwitchingFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<TargetAccountSelection> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final d f64022a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final FormState f64023b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final JointAccountData f64024c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new TargetAccountSelection(d.valueOf(parcel.readString()), FormState.CREATOR.createFromParcel(parcel), JointAccountData.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new TargetAccountSelection[i];
            }
        }

        public TargetAccountSelection(d switchPreference, FormState formState, JointAccountData jointAccountData) {
            Intrinsics.checkNotNullParameter(switchPreference, "switchPreference");
            Intrinsics.checkNotNullParameter(formState, "formState");
            Intrinsics.checkNotNullParameter(jointAccountData, "jointAccountData");
            this.f64022a = switchPreference;
            this.f64023b = formState;
            this.f64024c = jointAccountData;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof TargetAccountSelection)) {
                return false;
            }
            TargetAccountSelection targetAccountSelection = (TargetAccountSelection) obj2;
            return this.f64022a == targetAccountSelection.f64022a && Intrinsics.f(this.f64023b, targetAccountSelection.f64023b) && Intrinsics.f(this.f64024c, targetAccountSelection.f64024c);
        }

        public final int hashCode() {
            return this.f64024c.hashCode() + ((this.f64023b.hashCode() + (this.f64022a.hashCode() * 31)) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f64022a.name());
            this.f64023b.writeToParcel(dest, i);
            this.f64024c.writeToParcel(dest, i);
        }
    }
}
