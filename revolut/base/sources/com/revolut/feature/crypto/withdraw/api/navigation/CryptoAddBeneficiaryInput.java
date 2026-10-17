package com.revolut.feature.crypto.withdraw.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.crypto.remittance.models.CounterpartyRequiredFields;
import com.revolut.feature.crypto.remittance.models.CryptoAddressCounterparty;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xi0.b;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0004\u0007\b\t\n¨\u0006\u000bÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/crypto/withdraw/api/navigation/CryptoAddBeneficiaryInput;", "Lcom/revolut/kompot/common/IOData$Input;", "NewBeneficiary", "SubmitRecipientDetails", "SubmitCounterpartyDetails", "EditLabel", "lo5/b", "Lcom/revolut/feature/crypto/withdraw/api/navigation/CryptoAddBeneficiaryInput$EditLabel;", "Lcom/revolut/feature/crypto/withdraw/api/navigation/CryptoAddBeneficiaryInput$NewBeneficiary;", "Lcom/revolut/feature/crypto/withdraw/api/navigation/CryptoAddBeneficiaryInput$SubmitCounterpartyDetails;", "Lcom/revolut/feature/crypto/withdraw/api/navigation/CryptoAddBeneficiaryInput$SubmitRecipientDetails;", "feature_crypto_withdraw_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface CryptoAddBeneficiaryInput extends IOData$Input {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/crypto/withdraw/api/navigation/CryptoAddBeneficiaryInput$EditLabel;", "Lcom/revolut/feature/crypto/withdraw/api/navigation/CryptoAddBeneficiaryInput;", "", "toString", "()Ljava/lang/String;", "feature_crypto_withdraw_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class EditLabel implements CryptoAddBeneficiaryInput {

        @NotNull
        public static final Parcelable.Creator<EditLabel> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f71120a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Integer f71121b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new EditLabel(parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new EditLabel[i];
            }
        }

        public EditLabel(String beneficiaryId, Integer num) {
            Intrinsics.checkNotNullParameter(beneficiaryId, "beneficiaryId");
            this.f71120a = beneficiaryId;
            this.f71121b = num;
        }

        @Override // com.revolut.feature.crypto.withdraw.api.navigation.CryptoAddBeneficiaryInput
        /* JADX INFO: renamed from: U, reason: from getter */
        public final Integer getF71130c() {
            return this.f71121b;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof EditLabel)) {
                return false;
            }
            EditLabel editLabel = (EditLabel) obj2;
            return Intrinsics.f(this.f71120a, editLabel.f71120a) && Intrinsics.f(this.f71121b, editLabel.f71121b);
        }

        public final int hashCode() {
            int iHashCode = this.f71120a.hashCode() * 31;
            Integer num = this.f71121b;
            return iHashCode + (num == null ? 0 : num.hashCode());
        }

        @Override // com.revolut.feature.crypto.withdraw.api.navigation.CryptoAddBeneficiaryInput
        /* JADX INFO: renamed from: r9 */
        public final boolean getD() {
            return false;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f71120a);
            Integer num = this.f71121b;
            if (num == null) {
                dest.writeInt(0);
            } else {
                p.a.B(dest, 1, num);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/crypto/withdraw/api/navigation/CryptoAddBeneficiaryInput$NewBeneficiary;", "Lcom/revolut/feature/crypto/withdraw/api/navigation/CryptoAddBeneficiaryInput;", "", "toString", "()Ljava/lang/String;", "feature_crypto_withdraw_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class NewBeneficiary implements CryptoAddBeneficiaryInput {

        @NotNull
        public static final Parcelable.Creator<NewBeneficiary> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final b f71122a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final wk5.a f71123b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f71124c;
        public final boolean d;
        public final Integer e;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new NewBeneficiary((b) parcel.readSerializable(), parcel.readInt() == 0 ? null : wk5.a.valueOf(parcel.readString()), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new NewBeneficiary[i];
            }
        }

        public NewBeneficiary() {
            this((b) null, (wk5.a) null, (String) null, (Integer) null, 31);
        }

        @Override // com.revolut.feature.crypto.withdraw.api.navigation.CryptoAddBeneficiaryInput
        /* JADX INFO: renamed from: U, reason: from getter */
        public final Integer getF71130c() {
            return this.e;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof NewBeneficiary)) {
                return false;
            }
            NewBeneficiary newBeneficiary = (NewBeneficiary) obj2;
            return Intrinsics.f(this.f71122a, newBeneficiary.f71122a) && this.f71123b == newBeneficiary.f71123b && Intrinsics.f(this.f71124c, newBeneficiary.f71124c) && this.d == newBeneficiary.d && Intrinsics.f(this.e, newBeneficiary.e);
        }

        public final int hashCode() {
            b bVar = this.f71122a;
            int iHashCode = (bVar == null ? 0 : bVar.hashCode()) * 31;
            wk5.a aVar = this.f71123b;
            int iHashCode2 = (iHashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
            String str = this.f71124c;
            int iC = j6.a.c((iHashCode2 + (str == null ? 0 : str.hashCode())) * 31, 31, this.d);
            Integer num = this.e;
            return iC + (num != null ? num.hashCode() : 0);
        }

        @Override // com.revolut.feature.crypto.withdraw.api.navigation.CryptoAddBeneficiaryInput
        /* JADX INFO: renamed from: r9, reason: from getter */
        public final boolean getD() {
            return this.d;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f71122a);
            wk5.a aVar = this.f71123b;
            if (aVar == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(aVar.name());
            }
            dest.writeString(this.f71124c);
            dest.writeInt(this.d ? 1 : 0);
            Integer num = this.e;
            if (num == null) {
                dest.writeInt(0);
            } else {
                p.a.B(dest, 1, num);
            }
        }

        public /* synthetic */ NewBeneficiary(b bVar, wk5.a aVar, String str, Integer num, int i) {
            this((i & 1) != 0 ? null : bVar, (i & 2) != 0 ? null : aVar, (i & 4) != 0 ? null : str, (i & 8) != 0, (i & 16) != 0 ? null : num);
        }

        public NewBeneficiary(b bVar, wk5.a aVar, String str, boolean z, Integer num) {
            this.f71122a = bVar;
            this.f71123b = aVar;
            this.f71124c = str;
            this.d = z;
            this.e = num;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/crypto/withdraw/api/navigation/CryptoAddBeneficiaryInput$SubmitCounterpartyDetails;", "Lcom/revolut/feature/crypto/withdraw/api/navigation/CryptoAddBeneficiaryInput;", "", "toString", "()Ljava/lang/String;", "feature_crypto_withdraw_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SubmitCounterpartyDetails implements CryptoAddBeneficiaryInput {

        @NotNull
        public static final Parcelable.Creator<SubmitCounterpartyDetails> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CryptoAddressCounterparty f71125a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final lo5.b f71126b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final CounterpartyRequiredFields f71127c;
        public final Integer d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SubmitCounterpartyDetails((CryptoAddressCounterparty) parcel.readParcelable(SubmitCounterpartyDetails.class.getClassLoader()), lo5.b.valueOf(parcel.readString()), (CounterpartyRequiredFields) parcel.readParcelable(SubmitCounterpartyDetails.class.getClassLoader()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SubmitCounterpartyDetails[i];
            }
        }

        public SubmitCounterpartyDetails(CryptoAddressCounterparty cryptoAddressCounterparty, lo5.b defaultTab, CounterpartyRequiredFields counterpartyRequiredFields, Integer num) {
            Intrinsics.checkNotNullParameter(cryptoAddressCounterparty, "cryptoAddressCounterparty");
            Intrinsics.checkNotNullParameter(defaultTab, "defaultTab");
            this.f71125a = cryptoAddressCounterparty;
            this.f71126b = defaultTab;
            this.f71127c = counterpartyRequiredFields;
            this.d = num;
        }

        @Override // com.revolut.feature.crypto.withdraw.api.navigation.CryptoAddBeneficiaryInput
        /* JADX INFO: renamed from: U, reason: from getter */
        public final Integer getF71130c() {
            return this.d;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof SubmitCounterpartyDetails)) {
                return false;
            }
            SubmitCounterpartyDetails submitCounterpartyDetails = (SubmitCounterpartyDetails) obj2;
            return Intrinsics.f(this.f71125a, submitCounterpartyDetails.f71125a) && this.f71126b == submitCounterpartyDetails.f71126b && Intrinsics.f(this.f71127c, submitCounterpartyDetails.f71127c) && Intrinsics.f(this.d, submitCounterpartyDetails.d);
        }

        public final int hashCode() {
            int iHashCode = (this.f71126b.hashCode() + (this.f71125a.hashCode() * 31)) * 31;
            CounterpartyRequiredFields counterpartyRequiredFields = this.f71127c;
            int iHashCode2 = (iHashCode + (counterpartyRequiredFields == null ? 0 : counterpartyRequiredFields.hashCode())) * 31;
            Integer num = this.d;
            return iHashCode2 + (num != null ? num.hashCode() : 0);
        }

        @Override // com.revolut.feature.crypto.withdraw.api.navigation.CryptoAddBeneficiaryInput
        /* JADX INFO: renamed from: r9 */
        public final boolean getD() {
            return false;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f71125a, i);
            dest.writeString(this.f71126b.name());
            dest.writeParcelable(this.f71127c, i);
            Integer num = this.d;
            if (num == null) {
                dest.writeInt(0);
            } else {
                p.a.B(dest, 1, num);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/crypto/withdraw/api/navigation/CryptoAddBeneficiaryInput$SubmitRecipientDetails;", "Lcom/revolut/feature/crypto/withdraw/api/navigation/CryptoAddBeneficiaryInput;", "", "toString", "()Ljava/lang/String;", "feature_crypto_withdraw_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SubmitRecipientDetails implements CryptoAddBeneficiaryInput {

        @NotNull
        public static final Parcelable.Creator<SubmitRecipientDetails> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f71128a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f71129b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Integer f71130c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SubmitRecipientDetails(parcel.readInt() != 0, parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SubmitRecipientDetails[i];
            }
        }

        public SubmitRecipientDetails(boolean z, String beneficiaryId, Integer num) {
            Intrinsics.checkNotNullParameter(beneficiaryId, "beneficiaryId");
            this.f71128a = z;
            this.f71129b = beneficiaryId;
            this.f71130c = num;
        }

        @Override // com.revolut.feature.crypto.withdraw.api.navigation.CryptoAddBeneficiaryInput
        /* JADX INFO: renamed from: U, reason: from getter */
        public final Integer getF71130c() {
            return this.f71130c;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof SubmitRecipientDetails)) {
                return false;
            }
            SubmitRecipientDetails submitRecipientDetails = (SubmitRecipientDetails) obj2;
            return this.f71128a == submitRecipientDetails.f71128a && Intrinsics.f(this.f71129b, submitRecipientDetails.f71129b) && Intrinsics.f(this.f71130c, submitRecipientDetails.f71130c);
        }

        public final int hashCode() {
            int iC = p.a.c(Boolean.hashCode(this.f71128a) * 31, 31, this.f71129b);
            Integer num = this.f71130c;
            return iC + (num == null ? 0 : num.hashCode());
        }

        @Override // com.revolut.feature.crypto.withdraw.api.navigation.CryptoAddBeneficiaryInput
        /* JADX INFO: renamed from: r9 */
        public final boolean getD() {
            return true;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.f71128a ? 1 : 0);
            dest.writeString(this.f71129b);
            Integer num = this.f71130c;
            if (num == null) {
                dest.writeInt(0);
            } else {
                p.a.B(dest, 1, num);
            }
        }
    }

    /* JADX INFO: renamed from: U */
    Integer getF71130c();

    /* JADX INFO: renamed from: r9 */
    boolean getD();
}
