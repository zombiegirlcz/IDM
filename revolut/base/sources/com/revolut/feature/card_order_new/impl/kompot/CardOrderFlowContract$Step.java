package com.revolut.feature.card_order_new.impl.kompot;

import android.os.Parcel;
import android.os.Parcelable;
import c93.e;
import com.revolut.feature.address.models.Address;
import com.revolut.kompot.navigable.flow.FlowStep;
import d93.d;
import e93.n;
import h93.f0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pi3.h;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\n\u0004\u0005\u0006\u0007\b\t\n\u000b\f\rB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\n\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017¨\u0006\u0018"}, d2 = {"com/revolut/feature/card_order_new/impl/kompot/CardOrderFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "CardPersonalisation", "ExtraSecurity", "CreatePin", "ConfirmPin", "ChangeDeliveryAddress", "AddDeliveryAddress", "AddressVerification", "CardDeliveryMethods", "FreelancerCashbackUpsell", "UserLegalAgreement", "Lcom/revolut/feature/card_order_new/impl/kompot/CardOrderFlowContract$Step$AddDeliveryAddress;", "Lcom/revolut/feature/card_order_new/impl/kompot/CardOrderFlowContract$Step$AddressVerification;", "Lcom/revolut/feature/card_order_new/impl/kompot/CardOrderFlowContract$Step$CardDeliveryMethods;", "Lcom/revolut/feature/card_order_new/impl/kompot/CardOrderFlowContract$Step$CardPersonalisation;", "Lcom/revolut/feature/card_order_new/impl/kompot/CardOrderFlowContract$Step$ChangeDeliveryAddress;", "Lcom/revolut/feature/card_order_new/impl/kompot/CardOrderFlowContract$Step$ConfirmPin;", "Lcom/revolut/feature/card_order_new/impl/kompot/CardOrderFlowContract$Step$CreatePin;", "Lcom/revolut/feature/card_order_new/impl/kompot/CardOrderFlowContract$Step$ExtraSecurity;", "Lcom/revolut/feature/card_order_new/impl/kompot/CardOrderFlowContract$Step$FreelancerCashbackUpsell;", "Lcom/revolut/feature/card_order_new/impl/kompot/CardOrderFlowContract$Step$UserLegalAgreement;", "feature_card_order_new_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class CardOrderFlowContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/card_order_new/impl/kompot/CardOrderFlowContract$Step$AddDeliveryAddress;", "Lcom/revolut/feature/card_order_new/impl/kompot/CardOrderFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_card_order_new_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AddDeliveryAddress extends CardOrderFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<AddDeliveryAddress> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f65066a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new AddDeliveryAddress(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AddDeliveryAddress[i];
            }
        }

        public AddDeliveryAddress(String country) {
            Intrinsics.checkNotNullParameter(country, "country");
            this.f65066a = country;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof AddDeliveryAddress) && Intrinsics.f(this.f65066a, ((AddDeliveryAddress) obj2).f65066a);
        }

        public final int hashCode() {
            return this.f65066a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f65066a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/card_order_new/impl/kompot/CardOrderFlowContract$Step$AddressVerification;", "Lcom/revolut/feature/card_order_new/impl/kompot/CardOrderFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_card_order_new_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AddressVerification extends CardOrderFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<AddressVerification> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Address f65067a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new AddressVerification((Address) parcel.readParcelable(AddressVerification.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AddressVerification[i];
            }
        }

        public AddressVerification(Address address) {
            this.f65067a = address;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof AddressVerification) && Intrinsics.f(this.f65067a, ((AddressVerification) obj2).f65067a);
        }

        public final int hashCode() {
            Address address = this.f65067a;
            if (address == null) {
                return 0;
            }
            return address.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f65067a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/card_order_new/impl/kompot/CardOrderFlowContract$Step$CardDeliveryMethods;", "Lcom/revolut/feature/card_order_new/impl/kompot/CardOrderFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_card_order_new_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CardDeliveryMethods extends CardOrderFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<CardDeliveryMethods> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Address f65068a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final d f65069b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CardDeliveryMethods((Address) parcel.readParcelable(CardDeliveryMethods.class.getClassLoader()), (d) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CardDeliveryMethods[i];
            }
        }

        public CardDeliveryMethods(Address address, d deliveryMethods) {
            Intrinsics.checkNotNullParameter(address, "address");
            Intrinsics.checkNotNullParameter(deliveryMethods, "deliveryMethods");
            this.f65068a = address;
            this.f65069b = deliveryMethods;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof CardDeliveryMethods)) {
                return false;
            }
            CardDeliveryMethods cardDeliveryMethods = (CardDeliveryMethods) obj2;
            return Intrinsics.f(this.f65068a, cardDeliveryMethods.f65068a) && Intrinsics.f(this.f65069b, cardDeliveryMethods.f65069b);
        }

        public final int hashCode() {
            return this.f65069b.hashCode() + (this.f65068a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f65068a, i);
            dest.writeSerializable(this.f65069b);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/card_order_new/impl/kompot/CardOrderFlowContract$Step$CardPersonalisation;", "Lcom/revolut/feature/card_order_new/impl/kompot/CardOrderFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_card_order_new_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CardPersonalisation extends CardOrderFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<CardPersonalisation> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final c93.b f65070a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final n f65071b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f65072c;
        public final boolean d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CardPersonalisation((c93.b) parcel.readSerializable(), (n) parcel.readSerializable(), parcel.readInt() != 0, parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CardPersonalisation[i];
            }
        }

        public CardPersonalisation(c93.b card, n customisation, boolean z, boolean z3) {
            Intrinsics.checkNotNullParameter(card, "card");
            Intrinsics.checkNotNullParameter(customisation, "customisation");
            this.f65070a = card;
            this.f65071b = customisation;
            this.f65072c = z;
            this.d = z3;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof CardPersonalisation)) {
                return false;
            }
            CardPersonalisation cardPersonalisation = (CardPersonalisation) obj2;
            return Intrinsics.f(this.f65070a, cardPersonalisation.f65070a) && Intrinsics.f(this.f65071b, cardPersonalisation.f65071b) && this.f65072c == cardPersonalisation.f65072c && this.d == cardPersonalisation.d;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.d) + j6.a.c((this.f65071b.hashCode() + (this.f65070a.hashCode() * 31)) * 31, 31, this.f65072c);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f65070a);
            dest.writeSerializable(this.f65071b);
            dest.writeInt(this.f65072c ? 1 : 0);
            dest.writeInt(this.d ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/card_order_new/impl/kompot/CardOrderFlowContract$Step$ChangeDeliveryAddress;", "Lcom/revolut/feature/card_order_new/impl/kompot/CardOrderFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_card_order_new_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ChangeDeliveryAddress extends CardOrderFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<ChangeDeliveryAddress> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final f0 f65073a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ChangeDeliveryAddress((f0) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ChangeDeliveryAddress[i];
            }
        }

        public ChangeDeliveryAddress(f0 card) {
            Intrinsics.checkNotNullParameter(card, "card");
            this.f65073a = card;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof ChangeDeliveryAddress) && Intrinsics.f(this.f65073a, ((ChangeDeliveryAddress) obj2).f65073a);
        }

        public final int hashCode() {
            return this.f65073a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f65073a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/card_order_new/impl/kompot/CardOrderFlowContract$Step$ConfirmPin;", "Lcom/revolut/feature/card_order_new/impl/kompot/CardOrderFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_card_order_new_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ConfirmPin extends CardOrderFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<ConfirmPin> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f65074a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ConfirmPin(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ConfirmPin[i];
            }
        }

        public ConfirmPin(String pin) {
            Intrinsics.checkNotNullParameter(pin, "pin");
            this.f65074a = pin;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof ConfirmPin) && Intrinsics.f(this.f65074a, ((ConfirmPin) obj2).f65074a);
        }

        public final int hashCode() {
            return this.f65074a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f65074a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/card_order_new/impl/kompot/CardOrderFlowContract$Step$CreatePin;", "Lcom/revolut/feature/card_order_new/impl/kompot/CardOrderFlowContract$Step;", "<init>", "()V", "feature_card_order_new_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class CreatePin extends CardOrderFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final CreatePin f65075a = new CreatePin();

        @NotNull
        public static final Parcelable.Creator<CreatePin> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return CreatePin.f65075a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CreatePin[i];
            }
        }

        private CreatePin() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/card_order_new/impl/kompot/CardOrderFlowContract$Step$ExtraSecurity;", "Lcom/revolut/feature/card_order_new/impl/kompot/CardOrderFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_card_order_new_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ExtraSecurity extends CardOrderFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<ExtraSecurity> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final e93.d f65076a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ExtraSecurity((e93.d) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ExtraSecurity[i];
            }
        }

        public ExtraSecurity(e93.d cardDesign) {
            Intrinsics.checkNotNullParameter(cardDesign, "cardDesign");
            this.f65076a = cardDesign;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof ExtraSecurity) && Intrinsics.f(this.f65076a, ((ExtraSecurity) obj2).f65076a);
        }

        public final int hashCode() {
            return this.f65076a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f65076a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/card_order_new/impl/kompot/CardOrderFlowContract$Step$UserLegalAgreement;", "Lcom/revolut/feature/card_order_new/impl/kompot/CardOrderFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_card_order_new_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class UserLegalAgreement extends CardOrderFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<UserLegalAgreement> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final wi0.b f65078a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final e f65079b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new UserLegalAgreement((wi0.b) parcel.readSerializable(), e.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new UserLegalAgreement[i];
            }
        }

        public UserLegalAgreement(wi0.b userCountryCode, e cardType) {
            Intrinsics.checkNotNullParameter(userCountryCode, "userCountryCode");
            Intrinsics.checkNotNullParameter(cardType, "cardType");
            this.f65078a = userCountryCode;
            this.f65079b = cardType;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof UserLegalAgreement)) {
                return false;
            }
            UserLegalAgreement userLegalAgreement = (UserLegalAgreement) obj2;
            return Intrinsics.f(this.f65078a, userLegalAgreement.f65078a) && this.f65079b == userLegalAgreement.f65079b;
        }

        public final int hashCode() {
            return this.f65079b.hashCode() + (this.f65078a.f297794a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f65078a);
            dest.writeString(this.f65079b.name());
        }
    }

    private CardOrderFlowContract$Step() {
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/card_order_new/impl/kompot/CardOrderFlowContract$Step$FreelancerCashbackUpsell;", "Lcom/revolut/feature/card_order_new/impl/kompot/CardOrderFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_card_order_new_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class FreelancerCashbackUpsell extends CardOrderFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<FreelancerCashbackUpsell> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final h f65077a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new FreelancerCashbackUpsell((h) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new FreelancerCashbackUpsell[i];
            }
        }

        public FreelancerCashbackUpsell(h hVar) {
            this.f65077a = hVar;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof FreelancerCashbackUpsell) && Intrinsics.f(this.f65077a, ((FreelancerCashbackUpsell) obj2).f65077a);
        }

        public final int hashCode() {
            h hVar = this.f65077a;
            if (hVar == null) {
                return 0;
            }
            return hVar.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f65077a);
        }

        public FreelancerCashbackUpsell() {
            this(null);
        }
    }
}
