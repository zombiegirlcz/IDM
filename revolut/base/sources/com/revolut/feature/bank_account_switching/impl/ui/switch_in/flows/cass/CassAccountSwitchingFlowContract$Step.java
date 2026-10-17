package com.revolut.feature.bank_account_switching.impl.ui.switch_in.flows.cass;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.bank_account_switching.impl.articles.BankAccountSwitchingArticle;
import com.revolut.feature.bank_account_switching.impl.domain.CardDigits;
import com.revolut.feature.bank_account_switching.impl.domain.joint_account.JointAccountData;
import com.revolut.feature.bank_account_switching.impl.ui.form.domain.FormData;
import com.revolut.feature.bank_account_switching.impl.ui.form.domain.FormState;
import com.revolut.kompot.navigable.flow.FlowStep;
import java.time.LocalDate;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wn2.d;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\t\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u0082\u0001\t\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013¨\u0006\u0014À\u0006\u0003"}, d2 = {"com/revolut/feature/bank_account_switching/impl/ui/switch_in/flows/cass/CassAccountSwitchingFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "Entry", "ProductArticle", "SwitchPreferenceSelection", "TargetAccountSelection", "SourceAccountForm", "CardDigitsInput", "SwitchDateSelection", "Review", "RequestStatus", "Lcom/revolut/feature/bank_account_switching/impl/ui/switch_in/flows/cass/CassAccountSwitchingFlowContract$Step$CardDigitsInput;", "Lcom/revolut/feature/bank_account_switching/impl/ui/switch_in/flows/cass/CassAccountSwitchingFlowContract$Step$Entry;", "Lcom/revolut/feature/bank_account_switching/impl/ui/switch_in/flows/cass/CassAccountSwitchingFlowContract$Step$ProductArticle;", "Lcom/revolut/feature/bank_account_switching/impl/ui/switch_in/flows/cass/CassAccountSwitchingFlowContract$Step$RequestStatus;", "Lcom/revolut/feature/bank_account_switching/impl/ui/switch_in/flows/cass/CassAccountSwitchingFlowContract$Step$Review;", "Lcom/revolut/feature/bank_account_switching/impl/ui/switch_in/flows/cass/CassAccountSwitchingFlowContract$Step$SourceAccountForm;", "Lcom/revolut/feature/bank_account_switching/impl/ui/switch_in/flows/cass/CassAccountSwitchingFlowContract$Step$SwitchDateSelection;", "Lcom/revolut/feature/bank_account_switching/impl/ui/switch_in/flows/cass/CassAccountSwitchingFlowContract$Step$SwitchPreferenceSelection;", "Lcom/revolut/feature/bank_account_switching/impl/ui/switch_in/flows/cass/CassAccountSwitchingFlowContract$Step$TargetAccountSelection;", "feature_bank_account_switching_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface CassAccountSwitchingFlowContract$Step extends FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/bank_account_switching/impl/ui/switch_in/flows/cass/CassAccountSwitchingFlowContract$Step$CardDigitsInput;", "Lcom/revolut/feature/bank_account_switching/impl/ui/switch_in/flows/cass/CassAccountSwitchingFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_bank_account_switching_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CardDigitsInput implements CassAccountSwitchingFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<CardDigitsInput> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final d f63989a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final FormState f63990b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final FormData f63991c;
        public final wn2.a d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CardDigitsInput(d.valueOf(parcel.readString()), FormState.CREATOR.createFromParcel(parcel), FormData.CREATOR.createFromParcel(parcel), wn2.a.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CardDigitsInput[i];
            }
        }

        public CardDigitsInput(d switchPreference, FormState formState, FormData formData, wn2.a targetAccountType) {
            Intrinsics.checkNotNullParameter(switchPreference, "switchPreference");
            Intrinsics.checkNotNullParameter(formState, "formState");
            Intrinsics.checkNotNullParameter(formData, "formData");
            Intrinsics.checkNotNullParameter(targetAccountType, "targetAccountType");
            this.f63989a = switchPreference;
            this.f63990b = formState;
            this.f63991c = formData;
            this.d = targetAccountType;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof CardDigitsInput)) {
                return false;
            }
            CardDigitsInput cardDigitsInput = (CardDigitsInput) obj2;
            return this.f63989a == cardDigitsInput.f63989a && Intrinsics.f(this.f63990b, cardDigitsInput.f63990b) && Intrinsics.f(this.f63991c, cardDigitsInput.f63991c) && this.d == cardDigitsInput.d;
        }

        public final int hashCode() {
            return this.d.hashCode() + ((this.f63991c.hashCode() + ((this.f63990b.hashCode() + (this.f63989a.hashCode() * 31)) * 31)) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f63989a.name());
            this.f63990b.writeToParcel(dest, i);
            this.f63991c.writeToParcel(dest, i);
            dest.writeString(this.d.name());
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/bank_account_switching/impl/ui/switch_in/flows/cass/CassAccountSwitchingFlowContract$Step$Entry;", "Lcom/revolut/feature/bank_account_switching/impl/ui/switch_in/flows/cass/CassAccountSwitchingFlowContract$Step;", "<init>", "()V", "feature_bank_account_switching_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Entry implements CassAccountSwitchingFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Entry f63992a = new Entry();

        @NotNull
        public static final Parcelable.Creator<Entry> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Entry.f63992a;
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/bank_account_switching/impl/ui/switch_in/flows/cass/CassAccountSwitchingFlowContract$Step$ProductArticle;", "Lcom/revolut/feature/bank_account_switching/impl/ui/switch_in/flows/cass/CassAccountSwitchingFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_bank_account_switching_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ProductArticle implements CassAccountSwitchingFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<ProductArticle> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final BankAccountSwitchingArticle f63993a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ProductArticle(BankAccountSwitchingArticle.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ProductArticle[i];
            }
        }

        public ProductArticle(BankAccountSwitchingArticle articleKey) {
            Intrinsics.checkNotNullParameter(articleKey, "articleKey");
            this.f63993a = articleKey;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof ProductArticle) && this.f63993a == ((ProductArticle) obj2).f63993a;
        }

        public final int hashCode() {
            return this.f63993a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f63993a.writeToParcel(dest, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/bank_account_switching/impl/ui/switch_in/flows/cass/CassAccountSwitchingFlowContract$Step$RequestStatus;", "Lcom/revolut/feature/bank_account_switching/impl/ui/switch_in/flows/cass/CassAccountSwitchingFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_bank_account_switching_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class RequestStatus implements CassAccountSwitchingFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<RequestStatus> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f63994a;

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
            this.f63994a = requestId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof RequestStatus) && Intrinsics.f(this.f63994a, ((RequestStatus) obj2).f63994a);
        }

        public final int hashCode() {
            return this.f63994a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f63994a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/bank_account_switching/impl/ui/switch_in/flows/cass/CassAccountSwitchingFlowContract$Step$Review;", "Lcom/revolut/feature/bank_account_switching/impl/ui/switch_in/flows/cass/CassAccountSwitchingFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_bank_account_switching_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Review implements CassAccountSwitchingFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Review> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final d f63995a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final FormState f63996b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final wn2.a f63997c;
        public final CardDigits d;
        public final LocalDate e;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Review(d.valueOf(parcel.readString()), FormState.CREATOR.createFromParcel(parcel), wn2.a.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : CardDigits.CREATOR.createFromParcel(parcel), (LocalDate) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Review[i];
            }
        }

        public Review(d switchPreference, FormState formState, wn2.a targetAccountType, CardDigits cardDigits, LocalDate localDate) {
            Intrinsics.checkNotNullParameter(switchPreference, "switchPreference");
            Intrinsics.checkNotNullParameter(formState, "formState");
            Intrinsics.checkNotNullParameter(targetAccountType, "targetAccountType");
            this.f63995a = switchPreference;
            this.f63996b = formState;
            this.f63997c = targetAccountType;
            this.d = cardDigits;
            this.e = localDate;
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
            return this.f63995a == review.f63995a && Intrinsics.f(this.f63996b, review.f63996b) && this.f63997c == review.f63997c && Intrinsics.f(this.d, review.d) && Intrinsics.f(this.e, review.e);
        }

        public final int hashCode() {
            int iHashCode = (this.f63997c.hashCode() + ((this.f63996b.hashCode() + (this.f63995a.hashCode() * 31)) * 31)) * 31;
            CardDigits cardDigits = this.d;
            int iHashCode2 = (iHashCode + (cardDigits == null ? 0 : cardDigits.hashCode())) * 31;
            LocalDate localDate = this.e;
            return iHashCode2 + (localDate != null ? localDate.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f63995a.name());
            this.f63996b.writeToParcel(dest, i);
            dest.writeString(this.f63997c.name());
            CardDigits cardDigits = this.d;
            if (cardDigits == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                cardDigits.writeToParcel(dest, i);
            }
            dest.writeSerializable(this.e);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/bank_account_switching/impl/ui/switch_in/flows/cass/CassAccountSwitchingFlowContract$Step$SourceAccountForm;", "Lcom/revolut/feature/bank_account_switching/impl/ui/switch_in/flows/cass/CassAccountSwitchingFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_bank_account_switching_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SourceAccountForm implements CassAccountSwitchingFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<SourceAccountForm> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final d f63998a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final wn2.a f63999b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SourceAccountForm(d.valueOf(parcel.readString()), wn2.a.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SourceAccountForm[i];
            }
        }

        public SourceAccountForm(d switchPreference, wn2.a targetAccountType) {
            Intrinsics.checkNotNullParameter(switchPreference, "switchPreference");
            Intrinsics.checkNotNullParameter(targetAccountType, "targetAccountType");
            this.f63998a = switchPreference;
            this.f63999b = targetAccountType;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof SourceAccountForm)) {
                return false;
            }
            SourceAccountForm sourceAccountForm = (SourceAccountForm) obj2;
            return this.f63998a == sourceAccountForm.f63998a && this.f63999b == sourceAccountForm.f63999b;
        }

        public final int hashCode() {
            return this.f63999b.hashCode() + (this.f63998a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f63998a.name());
            dest.writeString(this.f63999b.name());
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/bank_account_switching/impl/ui/switch_in/flows/cass/CassAccountSwitchingFlowContract$Step$SwitchDateSelection;", "Lcom/revolut/feature/bank_account_switching/impl/ui/switch_in/flows/cass/CassAccountSwitchingFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_bank_account_switching_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SwitchDateSelection implements CassAccountSwitchingFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<SwitchDateSelection> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final d f64000a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final FormState f64001b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final wn2.a f64002c;
        public final CardDigits d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SwitchDateSelection(d.valueOf(parcel.readString()), FormState.CREATOR.createFromParcel(parcel), wn2.a.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : CardDigits.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SwitchDateSelection[i];
            }
        }

        public SwitchDateSelection(d switchPreference, FormState formState, wn2.a targetAccountType, CardDigits cardDigits) {
            Intrinsics.checkNotNullParameter(switchPreference, "switchPreference");
            Intrinsics.checkNotNullParameter(formState, "formState");
            Intrinsics.checkNotNullParameter(targetAccountType, "targetAccountType");
            this.f64000a = switchPreference;
            this.f64001b = formState;
            this.f64002c = targetAccountType;
            this.d = cardDigits;
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
            return this.f64000a == switchDateSelection.f64000a && Intrinsics.f(this.f64001b, switchDateSelection.f64001b) && this.f64002c == switchDateSelection.f64002c && Intrinsics.f(this.d, switchDateSelection.d);
        }

        public final int hashCode() {
            int iHashCode = (this.f64002c.hashCode() + ((this.f64001b.hashCode() + (this.f64000a.hashCode() * 31)) * 31)) * 31;
            CardDigits cardDigits = this.d;
            return iHashCode + (cardDigits == null ? 0 : cardDigits.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f64000a.name());
            this.f64001b.writeToParcel(dest, i);
            dest.writeString(this.f64002c.name());
            CardDigits cardDigits = this.d;
            if (cardDigits == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                cardDigits.writeToParcel(dest, i);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/bank_account_switching/impl/ui/switch_in/flows/cass/CassAccountSwitchingFlowContract$Step$SwitchPreferenceSelection;", "Lcom/revolut/feature/bank_account_switching/impl/ui/switch_in/flows/cass/CassAccountSwitchingFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_bank_account_switching_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SwitchPreferenceSelection implements CassAccountSwitchingFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<SwitchPreferenceSelection> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f64003a;

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
            this.f64003a = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof SwitchPreferenceSelection) && this.f64003a == ((SwitchPreferenceSelection) obj2).f64003a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f64003a);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.f64003a ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/bank_account_switching/impl/ui/switch_in/flows/cass/CassAccountSwitchingFlowContract$Step$TargetAccountSelection;", "Lcom/revolut/feature/bank_account_switching/impl/ui/switch_in/flows/cass/CassAccountSwitchingFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_bank_account_switching_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class TargetAccountSelection implements CassAccountSwitchingFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<TargetAccountSelection> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final d f64004a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final JointAccountData f64005b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new TargetAccountSelection(d.valueOf(parcel.readString()), JointAccountData.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new TargetAccountSelection[i];
            }
        }

        public TargetAccountSelection(d switchPreference, JointAccountData jointAccountData) {
            Intrinsics.checkNotNullParameter(switchPreference, "switchPreference");
            Intrinsics.checkNotNullParameter(jointAccountData, "jointAccountData");
            this.f64004a = switchPreference;
            this.f64005b = jointAccountData;
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
            return this.f64004a == targetAccountSelection.f64004a && Intrinsics.f(this.f64005b, targetAccountSelection.f64005b);
        }

        public final int hashCode() {
            return this.f64005b.hashCode() + (this.f64004a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f64004a.name());
            this.f64005b.writeToParcel(dest, i);
        }
    }
}
