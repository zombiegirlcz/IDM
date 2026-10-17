package com.revolut.feature.junior_settings.impl.ui_kompot.account_details.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.junior_payment_links.api.model.PaymentLinkCustomAmountBundle;
import com.revolut.kompot.navigable.flow.FlowStep;
import io3.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"com/revolut/feature/junior_settings/impl/ui_kompot/account_details/flow/JuniorAccountDetailsFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "AccountDetails", "ReviewPaymentLinkConsent", "CustomAmount", "ParentAccountDetails", "Lcom/revolut/feature/junior_settings/impl/ui_kompot/account_details/flow/JuniorAccountDetailsFlowContract$Step$AccountDetails;", "Lcom/revolut/feature/junior_settings/impl/ui_kompot/account_details/flow/JuniorAccountDetailsFlowContract$Step$CustomAmount;", "Lcom/revolut/feature/junior_settings/impl/ui_kompot/account_details/flow/JuniorAccountDetailsFlowContract$Step$ParentAccountDetails;", "Lcom/revolut/feature/junior_settings/impl/ui_kompot/account_details/flow/JuniorAccountDetailsFlowContract$Step$ReviewPaymentLinkConsent;", "feature_junior_settings_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface JuniorAccountDetailsFlowContract$Step extends FlowStep {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/junior_settings/impl/ui_kompot/account_details/flow/JuniorAccountDetailsFlowContract$Step$AccountDetails;", "Lcom/revolut/feature/junior_settings/impl/ui_kompot/account_details/flow/JuniorAccountDetailsFlowContract$Step;", "<init>", "()V", "feature_junior_settings_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class AccountDetails implements JuniorAccountDetailsFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final AccountDetails f77268a = new AccountDetails();

        @NotNull
        public static final Parcelable.Creator<AccountDetails> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return AccountDetails.f77268a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AccountDetails[i];
            }
        }

        private AccountDetails() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/junior_settings/impl/ui_kompot/account_details/flow/JuniorAccountDetailsFlowContract$Step$CustomAmount;", "Lcom/revolut/feature/junior_settings/impl/ui_kompot/account_details/flow/JuniorAccountDetailsFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_junior_settings_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CustomAmount implements JuniorAccountDetailsFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<CustomAmount> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PaymentLinkCustomAmountBundle f77269a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CustomAmount((PaymentLinkCustomAmountBundle) parcel.readParcelable(CustomAmount.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CustomAmount[i];
            }
        }

        public CustomAmount(PaymentLinkCustomAmountBundle initialAmountBundle) {
            Intrinsics.checkNotNullParameter(initialAmountBundle, "initialAmountBundle");
            this.f77269a = initialAmountBundle;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof CustomAmount) && Intrinsics.f(this.f77269a, ((CustomAmount) obj2).f77269a);
        }

        public final int hashCode() {
            return this.f77269a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f77269a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/junior_settings/impl/ui_kompot/account_details/flow/JuniorAccountDetailsFlowContract$Step$ParentAccountDetails;", "Lcom/revolut/feature/junior_settings/impl/ui_kompot/account_details/flow/JuniorAccountDetailsFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_junior_settings_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ParentAccountDetails implements JuniorAccountDetailsFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<ParentAccountDetails> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final d f77270a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ParentAccountDetails((d) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ParentAccountDetails[i];
            }
        }

        public ParentAccountDetails(d pocket) {
            Intrinsics.checkNotNullParameter(pocket, "pocket");
            this.f77270a = pocket;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof ParentAccountDetails) && Intrinsics.f(this.f77270a, ((ParentAccountDetails) obj2).f77270a);
        }

        public final int hashCode() {
            return this.f77270a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f77270a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/junior_settings/impl/ui_kompot/account_details/flow/JuniorAccountDetailsFlowContract$Step$ReviewPaymentLinkConsent;", "Lcom/revolut/feature/junior_settings/impl/ui_kompot/account_details/flow/JuniorAccountDetailsFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_junior_settings_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ReviewPaymentLinkConsent implements JuniorAccountDetailsFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<ReviewPaymentLinkConsent> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f77271a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f77272b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f77273c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ReviewPaymentLinkConsent(parcel.readString(), parcel.readString(), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ReviewPaymentLinkConsent[i];
            }
        }

        public ReviewPaymentLinkConsent(String firstName, String username, boolean z) {
            Intrinsics.checkNotNullParameter(firstName, "firstName");
            Intrinsics.checkNotNullParameter(username, "username");
            this.f77271a = firstName;
            this.f77272b = username;
            this.f77273c = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof ReviewPaymentLinkConsent)) {
                return false;
            }
            ReviewPaymentLinkConsent reviewPaymentLinkConsent = (ReviewPaymentLinkConsent) obj2;
            return Intrinsics.f(this.f77271a, reviewPaymentLinkConsent.f77271a) && Intrinsics.f(this.f77272b, reviewPaymentLinkConsent.f77272b) && this.f77273c == reviewPaymentLinkConsent.f77273c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f77273c) + p.a.c(this.f77271a.hashCode() * 31, 31, this.f77272b);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f77271a);
            dest.writeString(this.f77272b);
            dest.writeInt(this.f77273c ? 1 : 0);
        }
    }
}
