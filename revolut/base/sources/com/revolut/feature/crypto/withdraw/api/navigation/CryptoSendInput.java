package com.revolut.feature.crypto.withdraw.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.crypto.withdraw.api.models.SupportedSendRecipientInput;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xi0.b;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/crypto/withdraw/api/navigation/CryptoSendInput;", "Lcom/revolut/kompot/common/IOData$Input;", "SendCrypto", "BeneficiaryDetails", "Lcom/revolut/feature/crypto/withdraw/api/navigation/CryptoSendInput$BeneficiaryDetails;", "Lcom/revolut/feature/crypto/withdraw/api/navigation/CryptoSendInput$SendCrypto;", "feature_crypto_withdraw_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface CryptoSendInput extends IOData$Input {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/crypto/withdraw/api/navigation/CryptoSendInput$BeneficiaryDetails;", "Lcom/revolut/feature/crypto/withdraw/api/navigation/CryptoSendInput;", "", "toString", "()Ljava/lang/String;", "feature_crypto_withdraw_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class BeneficiaryDetails implements CryptoSendInput {

        @NotNull
        public static final Parcelable.Creator<BeneficiaryDetails> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f71140a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Integer f71141b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new BeneficiaryDetails(parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new BeneficiaryDetails[i];
            }
        }

        public BeneficiaryDetails(String beneficiaryId, Integer num) {
            Intrinsics.checkNotNullParameter(beneficiaryId, "beneficiaryId");
            this.f71140a = beneficiaryId;
            this.f71141b = num;
        }

        @Override // com.revolut.feature.crypto.withdraw.api.navigation.CryptoSendInput
        /* JADX INFO: renamed from: U, reason: from getter */
        public final Integer getF71141b() {
            return this.f71141b;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof BeneficiaryDetails)) {
                return false;
            }
            BeneficiaryDetails beneficiaryDetails = (BeneficiaryDetails) obj2;
            return Intrinsics.f(this.f71140a, beneficiaryDetails.f71140a) && Intrinsics.f(this.f71141b, beneficiaryDetails.f71141b);
        }

        public final int hashCode() {
            int iHashCode = this.f71140a.hashCode() * 31;
            Integer num = this.f71141b;
            return iHashCode + (num == null ? 0 : num.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f71140a);
            Integer num = this.f71141b;
            if (num == null) {
                dest.writeInt(0);
            } else {
                p.a.B(dest, 1, num);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/crypto/withdraw/api/navigation/CryptoSendInput$SendCrypto;", "Lcom/revolut/feature/crypto/withdraw/api/navigation/CryptoSendInput;", "", "toString", "()Ljava/lang/String;", "feature_crypto_withdraw_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SendCrypto implements CryptoSendInput {

        @NotNull
        public static final Parcelable.Creator<SendCrypto> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final b f71142a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final SupportedSendRecipientInput f71143b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SendCrypto((b) parcel.readSerializable(), (SupportedSendRecipientInput) parcel.readParcelable(SendCrypto.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SendCrypto[i];
            }
        }

        public SendCrypto() {
            this(0);
        }

        @Override // com.revolut.feature.crypto.withdraw.api.navigation.CryptoSendInput
        /* JADX INFO: renamed from: U */
        public final Integer getF71141b() {
            return null;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof SendCrypto)) {
                return false;
            }
            SendCrypto sendCrypto = (SendCrypto) obj2;
            return Intrinsics.f(this.f71142a, sendCrypto.f71142a) && Intrinsics.f(this.f71143b, sendCrypto.f71143b);
        }

        public final int hashCode() {
            b bVar = this.f71142a;
            return this.f71143b.hashCode() + ((bVar == null ? 0 : bVar.hashCode()) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f71142a);
            dest.writeParcelable(this.f71143b, i);
        }

        public SendCrypto(b bVar, SupportedSendRecipientInput supportedSendRecipientInput) {
            Intrinsics.checkNotNullParameter(supportedSendRecipientInput, "supportedSendRecipientInput");
            this.f71142a = bVar;
            this.f71143b = supportedSendRecipientInput;
        }

        public /* synthetic */ SendCrypto(int i) {
            this(null, SupportedSendRecipientInput.Default.f71115a);
        }
    }

    /* JADX INFO: renamed from: U */
    Integer getF71141b();
}
