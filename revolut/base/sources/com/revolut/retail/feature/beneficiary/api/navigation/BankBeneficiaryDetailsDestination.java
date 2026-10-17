package com.revolut.retail.feature.beneficiary.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.model.account.AccountId;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/beneficiary/api/navigation/BankBeneficiaryDetailsDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_beneficiary_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BankBeneficiaryDetailsDestination implements KompotDestination {

    @NotNull
    public static final Parcelable.Creator<BankBeneficiaryDetailsDestination> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f5j.a f99619a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f99620b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AccountId f99621c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new BankBeneficiaryDetailsDestination((f5j.a) parcel.readSerializable(), parcel.readString(), (AccountId) parcel.readParcelable(BankBeneficiaryDetailsDestination.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new BankBeneficiaryDetailsDestination[i];
        }
    }

    public BankBeneficiaryDetailsDestination(f5j.a aVar, String beneficiaryId, AccountId accountId) {
        Intrinsics.checkNotNullParameter(beneficiaryId, "beneficiaryId");
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        this.f99619a = aVar;
        this.f99620b = beneficiaryId;
        this.f99621c = accountId;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getF99620b() {
        return this.f99620b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof BankBeneficiaryDetailsDestination)) {
            return false;
        }
        BankBeneficiaryDetailsDestination bankBeneficiaryDetailsDestination = (BankBeneficiaryDetailsDestination) obj2;
        return Intrinsics.f(this.f99619a, bankBeneficiaryDetailsDestination.f99619a) && Intrinsics.f(this.f99620b, bankBeneficiaryDetailsDestination.f99620b) && Intrinsics.f(this.f99621c, bankBeneficiaryDetailsDestination.f99621c);
    }

    /* JADX INFO: renamed from: getAccountId, reason: from getter */
    public final AccountId getF99621c() {
        return this.f99621c;
    }

    public final int hashCode() {
        f5j.a aVar = this.f99619a;
        return this.f99621c.hashCode() + p.a.c((aVar == null ? 0 : aVar.hashCode()) * 31, 31, this.f99620b);
    }

    /* JADX INFO: renamed from: s, reason: from getter */
    public final f5j.a getF99619a() {
        return this.f99619a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f99619a);
        dest.writeString(this.f99620b);
        dest.writeParcelable(this.f99621c, i);
    }

    public /* synthetic */ BankBeneficiaryDetailsDestination(f5j.a aVar, String str) {
        this(aVar, str, AccountId.Personal.f51414a);
    }
}
