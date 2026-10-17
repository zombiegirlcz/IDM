package com.revolut.retail.feature.beneficiary.impl.ui.bank_beneficiary_details;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.model.account.AccountId;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/retail/feature/beneficiary/impl/ui/bank_beneficiary_details/BankBeneficiaryDetailsScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_beneficiary_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BankBeneficiaryDetailsScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<BankBeneficiaryDetailsScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f5j.a f99659a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f99660b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AccountId f99661c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new BankBeneficiaryDetailsScreenContract$InputData((f5j.a) parcel.readSerializable(), parcel.readString(), (AccountId) parcel.readParcelable(BankBeneficiaryDetailsScreenContract$InputData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new BankBeneficiaryDetailsScreenContract$InputData[i];
        }
    }

    public BankBeneficiaryDetailsScreenContract$InputData(f5j.a aVar, String beneficiaryId, AccountId accountId) {
        Intrinsics.checkNotNullParameter(beneficiaryId, "beneficiaryId");
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        this.f99659a = aVar;
        this.f99660b = beneficiaryId;
        this.f99661c = accountId;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof BankBeneficiaryDetailsScreenContract$InputData)) {
            return false;
        }
        BankBeneficiaryDetailsScreenContract$InputData bankBeneficiaryDetailsScreenContract$InputData = (BankBeneficiaryDetailsScreenContract$InputData) obj2;
        return Intrinsics.f(this.f99659a, bankBeneficiaryDetailsScreenContract$InputData.f99659a) && Intrinsics.f(this.f99660b, bankBeneficiaryDetailsScreenContract$InputData.f99660b) && Intrinsics.f(this.f99661c, bankBeneficiaryDetailsScreenContract$InputData.f99661c);
    }

    public final int hashCode() {
        f5j.a aVar = this.f99659a;
        return this.f99661c.hashCode() + p.a.c((aVar == null ? 0 : aVar.hashCode()) * 31, 31, this.f99660b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f99659a);
        dest.writeString(this.f99660b);
        dest.writeParcelable(this.f99661c, i);
    }
}
