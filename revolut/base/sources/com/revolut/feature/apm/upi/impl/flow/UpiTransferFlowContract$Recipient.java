package com.revolut.feature.apm.upi.impl.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.apm.core.models.alias.beneficiary.AliasMerchant;
import com.revolut.feature.payment.counterparty.models.PaymentCounterpartyInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import n61.j;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"com/revolut/feature/apm/upi/impl/flow/UpiTransferFlowContract$Recipient", "Landroid/os/Parcelable;", "Alias", "BankBeneficiary", "UpiMerchant", "Lcom/revolut/feature/apm/upi/impl/flow/UpiTransferFlowContract$Recipient$Alias;", "Lcom/revolut/feature/apm/upi/impl/flow/UpiTransferFlowContract$Recipient$BankBeneficiary;", "Lcom/revolut/feature/apm/upi/impl/flow/UpiTransferFlowContract$Recipient$UpiMerchant;", "feature_apm_upi_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface UpiTransferFlowContract$Recipient extends Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/upi/impl/flow/UpiTransferFlowContract$Recipient$Alias;", "Lcom/revolut/feature/apm/upi/impl/flow/UpiTransferFlowContract$Recipient;", "", "toString", "()Ljava/lang/String;", "feature_apm_upi_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Alias implements UpiTransferFlowContract$Recipient {

        @NotNull
        public static final Parcelable.Creator<Alias> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PaymentCounterpartyInfo f62963a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f62964b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f62965c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Alias((PaymentCounterpartyInfo) parcel.readParcelable(Alias.class.getClassLoader()), parcel.readString(), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Alias[i];
            }
        }

        public Alias(PaymentCounterpartyInfo paymentCounterparty, String alias, boolean z) {
            Intrinsics.checkNotNullParameter(paymentCounterparty, "paymentCounterparty");
            Intrinsics.checkNotNullParameter(alias, "alias");
            this.f62963a = paymentCounterparty;
            this.f62964b = alias;
            this.f62965c = z;
        }

        @Override // com.revolut.feature.apm.upi.impl.flow.UpiTransferFlowContract$Recipient
        /* JADX INFO: renamed from: I2, reason: from getter */
        public final boolean getF62968b() {
            return this.f62965c;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Alias)) {
                return false;
            }
            Alias alias = (Alias) obj2;
            return Intrinsics.f(this.f62963a, alias.f62963a) && Intrinsics.f(this.f62964b, alias.f62964b) && this.f62965c == alias.f62965c;
        }

        @Override // com.revolut.feature.apm.upi.impl.flow.UpiTransferFlowContract$Recipient
        public final String getDisplayName() {
            return this.f62963a.getDisplayName();
        }

        @Override // com.revolut.feature.apm.upi.impl.flow.UpiTransferFlowContract$Recipient
        public final String getId() {
            return this.f62963a.f79060a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f62965c) + p.a.c(this.f62963a.hashCode() * 31, 31, this.f62964b);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f62963a, i);
            dest.writeString(this.f62964b);
            dest.writeInt(this.f62965c ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/upi/impl/flow/UpiTransferFlowContract$Recipient$BankBeneficiary;", "Lcom/revolut/feature/apm/upi/impl/flow/UpiTransferFlowContract$Recipient;", "", "toString", "()Ljava/lang/String;", "feature_apm_upi_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class BankBeneficiary implements UpiTransferFlowContract$Recipient {

        @NotNull
        public static final Parcelable.Creator<BankBeneficiary> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final f5j.a f62966a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new BankBeneficiary((f5j.a) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new BankBeneficiary[i];
            }
        }

        public BankBeneficiary(f5j.a beneficiary) {
            Intrinsics.checkNotNullParameter(beneficiary, "beneficiary");
            this.f62966a = beneficiary;
        }

        @Override // com.revolut.feature.apm.upi.impl.flow.UpiTransferFlowContract$Recipient
        /* JADX INFO: renamed from: I2 */
        public final boolean getF62968b() {
            return true;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof BankBeneficiary) && Intrinsics.f(this.f62966a, ((BankBeneficiary) obj2).f62966a);
        }

        @Override // com.revolut.feature.apm.upi.impl.flow.UpiTransferFlowContract$Recipient
        public final String getDisplayName() {
            return j.c(this.f62966a);
        }

        @Override // com.revolut.feature.apm.upi.impl.flow.UpiTransferFlowContract$Recipient
        public final String getId() {
            return this.f62966a.f132329a;
        }

        public final int hashCode() {
            return this.f62966a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f62966a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/upi/impl/flow/UpiTransferFlowContract$Recipient$UpiMerchant;", "Lcom/revolut/feature/apm/upi/impl/flow/UpiTransferFlowContract$Recipient;", "", "toString", "()Ljava/lang/String;", "feature_apm_upi_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class UpiMerchant implements UpiTransferFlowContract$Recipient {

        @NotNull
        public static final Parcelable.Creator<UpiMerchant> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AliasMerchant f62967a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f62968b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new UpiMerchant((AliasMerchant) parcel.readParcelable(UpiMerchant.class.getClassLoader()), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new UpiMerchant[i];
            }
        }

        public UpiMerchant(AliasMerchant aliasMerchant, boolean z) {
            Intrinsics.checkNotNullParameter(aliasMerchant, "aliasMerchant");
            this.f62967a = aliasMerchant;
            this.f62968b = z;
        }

        @Override // com.revolut.feature.apm.upi.impl.flow.UpiTransferFlowContract$Recipient
        /* JADX INFO: renamed from: I2, reason: from getter */
        public final boolean getF62968b() {
            return this.f62968b;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof UpiMerchant)) {
                return false;
            }
            UpiMerchant upiMerchant = (UpiMerchant) obj2;
            return Intrinsics.f(this.f62967a, upiMerchant.f62967a) && this.f62968b == upiMerchant.f62968b;
        }

        @Override // com.revolut.feature.apm.upi.impl.flow.UpiTransferFlowContract$Recipient
        public final String getDisplayName() {
            AliasMerchant aliasMerchant = this.f62967a;
            String str = aliasMerchant.e;
            return (str == null && (str = aliasMerchant.f61902c) == null) ? aliasMerchant.f61900a : str;
        }

        @Override // com.revolut.feature.apm.upi.impl.flow.UpiTransferFlowContract$Recipient
        public final String getId() {
            return this.f62967a.f61900a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f62968b) + (this.f62967a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f62967a, i);
            dest.writeInt(this.f62968b ? 1 : 0);
        }
    }

    /* JADX INFO: renamed from: I2 */
    boolean getF62968b();

    String getDisplayName();

    String getId();
}
