package com.revolut.feature.payments.social.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import ba6.l;
import com.revolut.feature.apm.core.models.recipients.ApmRecipient;
import com.revolut.feature.crypto.withdraw.api.models.CryptoAddress;
import com.revolut.feature.payment.counterparty.models.PaymentCounterpartyInfo;
import com.revolut.feature.push_to_card.api.data.CardOwner;
import com.revolut.feature.transfer.core.models.TransferMoneyPocket;
import hx7.q;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import n61.j;
import org.jetbrains.annotations.NotNull;
import xi0.b;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0007\u0004\u0005\u0006\u0007\b\t\nB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0007\u000b\f\r\u000e\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/revolut/feature/payments/social/api/model/ChatTransferRecipient;", "Landroid/os/Parcelable;", "<init>", "()V", "ContactRecipient", "BeneficiaryRecipient", "CardRecipient", "CryptoAddressRecipient", "CharityRecipient", "ApmTransferRecipient", "PaymentCounterpartyRecipient", "Lcom/revolut/feature/payments/social/api/model/ChatTransferRecipient$ApmTransferRecipient;", "Lcom/revolut/feature/payments/social/api/model/ChatTransferRecipient$BeneficiaryRecipient;", "Lcom/revolut/feature/payments/social/api/model/ChatTransferRecipient$CardRecipient;", "Lcom/revolut/feature/payments/social/api/model/ChatTransferRecipient$CharityRecipient;", "Lcom/revolut/feature/payments/social/api/model/ChatTransferRecipient$ContactRecipient;", "Lcom/revolut/feature/payments/social/api/model/ChatTransferRecipient$CryptoAddressRecipient;", "Lcom/revolut/feature/payments/social/api/model/ChatTransferRecipient$PaymentCounterpartyRecipient;", "feature_payments_social_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class ChatTransferRecipient implements Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/payments/social/api/model/ChatTransferRecipient$ApmTransferRecipient;", "Lcom/revolut/feature/payments/social/api/model/ChatTransferRecipient;", "", "toString", "()Ljava/lang/String;", "feature_payments_social_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ApmTransferRecipient extends ChatTransferRecipient {

        @NotNull
        public static final Parcelable.Creator<ApmTransferRecipient> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ApmRecipient f79715a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ApmTransferRecipient((ApmRecipient) parcel.readParcelable(ApmTransferRecipient.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ApmTransferRecipient[i];
            }
        }

        public ApmTransferRecipient(ApmRecipient apmRecipient) {
            Intrinsics.checkNotNullParameter(apmRecipient, "apmRecipient");
            this.f79715a = apmRecipient;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof ApmTransferRecipient) && Intrinsics.f(this.f79715a, ((ApmTransferRecipient) obj2).f79715a);
        }

        @Override // com.revolut.feature.payments.social.api.model.ChatTransferRecipient
        public final String getName() {
            return this.f79715a.getDisplayName();
        }

        public final int hashCode() {
            return this.f79715a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f79715a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/payments/social/api/model/ChatTransferRecipient$BeneficiaryRecipient;", "Lcom/revolut/feature/payments/social/api/model/ChatTransferRecipient;", "", "toString", "()Ljava/lang/String;", "feature_payments_social_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class BeneficiaryRecipient extends ChatTransferRecipient {

        @NotNull
        public static final Parcelable.Creator<BeneficiaryRecipient> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final f5j.a f79716a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final TransferMoneyPocket f79717b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new BeneficiaryRecipient((f5j.a) parcel.readSerializable(), (TransferMoneyPocket) parcel.readParcelable(BeneficiaryRecipient.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new BeneficiaryRecipient[i];
            }
        }

        public BeneficiaryRecipient(f5j.a beneficiary, TransferMoneyPocket transferMoneyPocket) {
            Intrinsics.checkNotNullParameter(beneficiary, "beneficiary");
            this.f79716a = beneficiary;
            this.f79717b = transferMoneyPocket;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof BeneficiaryRecipient)) {
                return false;
            }
            BeneficiaryRecipient beneficiaryRecipient = (BeneficiaryRecipient) obj2;
            return Intrinsics.f(this.f79716a, beneficiaryRecipient.f79716a) && Intrinsics.f(this.f79717b, beneficiaryRecipient.f79717b);
        }

        @Override // com.revolut.feature.payments.social.api.model.ChatTransferRecipient
        public final String getName() {
            return j.c(this.f79716a);
        }

        public final int hashCode() {
            int iHashCode = this.f79716a.hashCode() * 31;
            TransferMoneyPocket transferMoneyPocket = this.f79717b;
            return iHashCode + (transferMoneyPocket == null ? 0 : transferMoneyPocket.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f79716a);
            dest.writeParcelable(this.f79717b, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/payments/social/api/model/ChatTransferRecipient$CardRecipient;", "Lcom/revolut/feature/payments/social/api/model/ChatTransferRecipient;", "", "toString", "()Ljava/lang/String;", "feature_payments_social_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CardRecipient extends ChatTransferRecipient {

        @NotNull
        public static final Parcelable.Creator<CardRecipient> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CardOwner f79718a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CardRecipient((CardOwner) parcel.readParcelable(CardRecipient.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CardRecipient[i];
            }
        }

        public CardRecipient(CardOwner card) {
            Intrinsics.checkNotNullParameter(card, "card");
            this.f79718a = card;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof CardRecipient) && Intrinsics.f(this.f79718a, ((CardRecipient) obj2).f79718a);
        }

        @Override // com.revolut.feature.payments.social.api.model.ChatTransferRecipient
        public final String getName() {
            return this.f79718a.a();
        }

        public final int hashCode() {
            return this.f79718a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f79718a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/payments/social/api/model/ChatTransferRecipient$CharityRecipient;", "Lcom/revolut/feature/payments/social/api/model/ChatTransferRecipient;", "", "toString", "()Ljava/lang/String;", "feature_payments_social_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CharityRecipient extends ChatTransferRecipient {

        @NotNull
        public static final Parcelable.Creator<CharityRecipient> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final l f79719a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CharityRecipient((l) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CharityRecipient[i];
            }
        }

        public CharityRecipient(l charity) {
            Intrinsics.checkNotNullParameter(charity, "charity");
            this.f79719a = charity;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof CharityRecipient) && Intrinsics.f(this.f79719a, ((CharityRecipient) obj2).f79719a);
        }

        @Override // com.revolut.feature.payments.social.api.model.ChatTransferRecipient
        public final String getName() {
            return this.f79719a.f13939b;
        }

        public final int hashCode() {
            return this.f79719a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f79719a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/payments/social/api/model/ChatTransferRecipient$ContactRecipient;", "Lcom/revolut/feature/payments/social/api/model/ChatTransferRecipient;", "", "toString", "()Ljava/lang/String;", "feature_payments_social_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ContactRecipient extends ChatTransferRecipient {

        @NotNull
        public static final Parcelable.Creator<ContactRecipient> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final zm3.a f79720a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ContactRecipient((zm3.a) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ContactRecipient[i];
            }
        }

        public ContactRecipient(zm3.a contact) {
            Intrinsics.checkNotNullParameter(contact, "contact");
            this.f79720a = contact;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof ContactRecipient) && Intrinsics.f(this.f79720a, ((ContactRecipient) obj2).f79720a);
        }

        @Override // com.revolut.feature.payments.social.api.model.ChatTransferRecipient
        public final String getName() {
            return q.v(this.f79720a);
        }

        public final int hashCode() {
            return this.f79720a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f79720a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/payments/social/api/model/ChatTransferRecipient$PaymentCounterpartyRecipient;", "Lcom/revolut/feature/payments/social/api/model/ChatTransferRecipient;", "", "toString", "()Ljava/lang/String;", "feature_payments_social_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PaymentCounterpartyRecipient extends ChatTransferRecipient {

        @NotNull
        public static final Parcelable.Creator<PaymentCounterpartyRecipient> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PaymentCounterpartyInfo f79724a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PaymentCounterpartyRecipient((PaymentCounterpartyInfo) parcel.readParcelable(PaymentCounterpartyRecipient.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PaymentCounterpartyRecipient[i];
            }
        }

        public PaymentCounterpartyRecipient(PaymentCounterpartyInfo counterparty) {
            Intrinsics.checkNotNullParameter(counterparty, "counterparty");
            this.f79724a = counterparty;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof PaymentCounterpartyRecipient) && Intrinsics.f(this.f79724a, ((PaymentCounterpartyRecipient) obj2).f79724a);
        }

        @Override // com.revolut.feature.payments.social.api.model.ChatTransferRecipient
        public final String getName() {
            return this.f79724a.getDisplayName();
        }

        public final int hashCode() {
            return this.f79724a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f79724a, i);
        }
    }

    private ChatTransferRecipient() {
    }

    public abstract String getName();

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/payments/social/api/model/ChatTransferRecipient$CryptoAddressRecipient;", "Lcom/revolut/feature/payments/social/api/model/ChatTransferRecipient;", "", "toString", "()Ljava/lang/String;", "feature_payments_social_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CryptoAddressRecipient extends ChatTransferRecipient {

        @NotNull
        public static final Parcelable.Creator<CryptoAddressRecipient> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CryptoAddress f79721a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final b f79722b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final jz9.a f79723c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CryptoAddressRecipient((CryptoAddress) parcel.readParcelable(CryptoAddressRecipient.class.getClassLoader()), (b) parcel.readSerializable(), parcel.readInt() == 0 ? null : jz9.a.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CryptoAddressRecipient[i];
            }
        }

        public CryptoAddressRecipient(CryptoAddress cryptoAddress, b bVar, jz9.a aVar) {
            Intrinsics.checkNotNullParameter(cryptoAddress, "cryptoAddress");
            this.f79721a = cryptoAddress;
            this.f79722b = bVar;
            this.f79723c = aVar;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof CryptoAddressRecipient)) {
                return false;
            }
            CryptoAddressRecipient cryptoAddressRecipient = (CryptoAddressRecipient) obj2;
            return Intrinsics.f(this.f79721a, cryptoAddressRecipient.f79721a) && Intrinsics.f(this.f79722b, cryptoAddressRecipient.f79722b) && this.f79723c == cryptoAddressRecipient.f79723c;
        }

        @Override // com.revolut.feature.payments.social.api.model.ChatTransferRecipient
        public final String getName() {
            return CryptoAddress.e(this.f79721a, 0, 3).f186223a;
        }

        public final int hashCode() {
            int iHashCode = this.f79721a.hashCode() * 31;
            b bVar = this.f79722b;
            int iHashCode2 = (iHashCode + (bVar == null ? 0 : bVar.hashCode())) * 31;
            jz9.a aVar = this.f79723c;
            return iHashCode2 + (aVar != null ? aVar.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f79721a, i);
            dest.writeSerializable(this.f79722b);
            jz9.a aVar = this.f79723c;
            if (aVar == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(aVar.name());
            }
        }

        public /* synthetic */ CryptoAddressRecipient(CryptoAddress cryptoAddress, jz9.a aVar, int i) {
            this(cryptoAddress, (b) null, (i & 4) != 0 ? null : aVar);
        }
    }
}
