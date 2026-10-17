package com.revolut.feature.credit.card.impl.ui.cancellation.flow.cancellation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.credit.card.api.models.cancellation.PayoffBreakdown;
import com.revolut.feature.credit.card.api.models.cancellation.RepaymentDeferral;
import com.revolut.kompot.navigable.flow.FlowStep;
import dj0.d;
import hl4.g;
import ip0.v7;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wi0.b;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"com/revolut/feature/credit/card/impl/ui/cancellation/flow/cancellation/CreditCardCancellationFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "AdditionalCardholderFacilityOwnerConfirmationScreen", "AdditionalCardholderSelfConfirmationScreen", "ConfirmationScreen", "CheckoutScreen", "Lcom/revolut/feature/credit/card/impl/ui/cancellation/flow/cancellation/CreditCardCancellationFlowContract$Step$AdditionalCardholderFacilityOwnerConfirmationScreen;", "Lcom/revolut/feature/credit/card/impl/ui/cancellation/flow/cancellation/CreditCardCancellationFlowContract$Step$AdditionalCardholderSelfConfirmationScreen;", "Lcom/revolut/feature/credit/card/impl/ui/cancellation/flow/cancellation/CreditCardCancellationFlowContract$Step$CheckoutScreen;", "Lcom/revolut/feature/credit/card/impl/ui/cancellation/flow/cancellation/CreditCardCancellationFlowContract$Step$ConfirmationScreen;", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class CreditCardCancellationFlowContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/card/impl/ui/cancellation/flow/cancellation/CreditCardCancellationFlowContract$Step$AdditionalCardholderFacilityOwnerConfirmationScreen;", "Lcom/revolut/feature/credit/card/impl/ui/cancellation/flow/cancellation/CreditCardCancellationFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AdditionalCardholderFacilityOwnerConfirmationScreen extends CreditCardCancellationFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<AdditionalCardholderFacilityOwnerConfirmationScreen> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f69118a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new AdditionalCardholderFacilityOwnerConfirmationScreen(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AdditionalCardholderFacilityOwnerConfirmationScreen[i];
            }
        }

        public AdditionalCardholderFacilityOwnerConfirmationScreen(String cardholderId) {
            Intrinsics.checkNotNullParameter(cardholderId, "cardholderId");
            this.f69118a = cardholderId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof AdditionalCardholderFacilityOwnerConfirmationScreen) && Intrinsics.f(this.f69118a, ((AdditionalCardholderFacilityOwnerConfirmationScreen) obj2).f69118a);
        }

        public final int hashCode() {
            return this.f69118a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f69118a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/credit/card/impl/ui/cancellation/flow/cancellation/CreditCardCancellationFlowContract$Step$AdditionalCardholderSelfConfirmationScreen;", "Lcom/revolut/feature/credit/card/impl/ui/cancellation/flow/cancellation/CreditCardCancellationFlowContract$Step;", "<init>", "()V", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class AdditionalCardholderSelfConfirmationScreen extends CreditCardCancellationFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final AdditionalCardholderSelfConfirmationScreen f69119a = new AdditionalCardholderSelfConfirmationScreen();

        @NotNull
        public static final Parcelable.Creator<AdditionalCardholderSelfConfirmationScreen> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return AdditionalCardholderSelfConfirmationScreen.f69119a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AdditionalCardholderSelfConfirmationScreen[i];
            }
        }

        private AdditionalCardholderSelfConfirmationScreen() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/card/impl/ui/cancellation/flow/cancellation/CreditCardCancellationFlowContract$Step$CheckoutScreen;", "Lcom/revolut/feature/credit/card/impl/ui/cancellation/flow/cancellation/CreditCardCancellationFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CheckoutScreen extends CreditCardCancellationFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<CheckoutScreen> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final g f69120a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final d f69121b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final RepaymentDeferral f69122c;
        public final PayoffBreakdown d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CheckoutScreen(g.valueOf(parcel.readString()), (d) parcel.readSerializable(), (RepaymentDeferral) parcel.readParcelable(CheckoutScreen.class.getClassLoader()), (PayoffBreakdown) parcel.readParcelable(CheckoutScreen.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CheckoutScreen[i];
            }
        }

        public CheckoutScreen(g repaymentStrategy, d repaymentAmount, RepaymentDeferral repaymentDeferral, PayoffBreakdown payoffBreakdown) {
            Intrinsics.checkNotNullParameter(repaymentStrategy, "repaymentStrategy");
            Intrinsics.checkNotNullParameter(repaymentAmount, "repaymentAmount");
            this.f69120a = repaymentStrategy;
            this.f69121b = repaymentAmount;
            this.f69122c = repaymentDeferral;
            this.d = payoffBreakdown;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof CheckoutScreen)) {
                return false;
            }
            CheckoutScreen checkoutScreen = (CheckoutScreen) obj2;
            return this.f69120a == checkoutScreen.f69120a && Intrinsics.f(this.f69121b, checkoutScreen.f69121b) && Intrinsics.f(this.f69122c, checkoutScreen.f69122c) && Intrinsics.f(this.d, checkoutScreen.d);
        }

        public final int hashCode() {
            int iC = v7.c(this.f69120a.hashCode() * 31, 31, this.f69121b);
            RepaymentDeferral repaymentDeferral = this.f69122c;
            int iHashCode = (iC + (repaymentDeferral == null ? 0 : repaymentDeferral.hashCode())) * 31;
            PayoffBreakdown payoffBreakdown = this.d;
            return iHashCode + (payoffBreakdown != null ? payoffBreakdown.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f69120a.name());
            dest.writeSerializable(this.f69121b);
            dest.writeParcelable(this.f69122c, i);
            dest.writeParcelable(this.d, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/card/impl/ui/cancellation/flow/cancellation/CreditCardCancellationFlowContract$Step$ConfirmationScreen;", "Lcom/revolut/feature/credit/card/impl/ui/cancellation/flow/cancellation/CreditCardCancellationFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ConfirmationScreen extends CreditCardCancellationFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<ConfirmationScreen> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final g f69123a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final d f69124b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final RepaymentDeferral f69125c;
        public final PayoffBreakdown d;
        public final b e;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ConfirmationScreen(parcel.readInt() == 0 ? null : g.valueOf(parcel.readString()), (d) parcel.readSerializable(), (RepaymentDeferral) parcel.readParcelable(ConfirmationScreen.class.getClassLoader()), (PayoffBreakdown) parcel.readParcelable(ConfirmationScreen.class.getClassLoader()), (b) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ConfirmationScreen[i];
            }
        }

        public ConfirmationScreen(g gVar, d dVar, RepaymentDeferral repaymentDeferral, PayoffBreakdown payoffBreakdown, b countryCode) {
            Intrinsics.checkNotNullParameter(countryCode, "countryCode");
            this.f69123a = gVar;
            this.f69124b = dVar;
            this.f69125c = repaymentDeferral;
            this.d = payoffBreakdown;
            this.e = countryCode;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof ConfirmationScreen)) {
                return false;
            }
            ConfirmationScreen confirmationScreen = (ConfirmationScreen) obj2;
            return this.f69123a == confirmationScreen.f69123a && Intrinsics.f(this.f69124b, confirmationScreen.f69124b) && Intrinsics.f(this.f69125c, confirmationScreen.f69125c) && Intrinsics.f(this.d, confirmationScreen.d) && Intrinsics.f(this.e, confirmationScreen.e);
        }

        public final int hashCode() {
            g gVar = this.f69123a;
            int iHashCode = (gVar == null ? 0 : gVar.hashCode()) * 31;
            d dVar = this.f69124b;
            int iHashCode2 = (iHashCode + (dVar == null ? 0 : dVar.hashCode())) * 31;
            RepaymentDeferral repaymentDeferral = this.f69125c;
            int iHashCode3 = (iHashCode2 + (repaymentDeferral == null ? 0 : repaymentDeferral.hashCode())) * 31;
            PayoffBreakdown payoffBreakdown = this.d;
            return this.e.f297794a.hashCode() + ((iHashCode3 + (payoffBreakdown != null ? payoffBreakdown.hashCode() : 0)) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            g gVar = this.f69123a;
            if (gVar == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(gVar.name());
            }
            dest.writeSerializable(this.f69124b);
            dest.writeParcelable(this.f69125c, i);
            dest.writeParcelable(this.d, i);
            dest.writeSerializable(this.e);
        }
    }

    private CreditCardCancellationFlowContract$Step() {
    }
}
