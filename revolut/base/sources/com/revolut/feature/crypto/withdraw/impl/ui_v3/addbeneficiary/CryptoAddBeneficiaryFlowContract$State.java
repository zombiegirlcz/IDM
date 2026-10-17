package com.revolut.feature.crypto.withdraw.impl.ui_v3.addbeneficiary;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowState;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/crypto/withdraw/impl/ui_v3/addbeneficiary/CryptoAddBeneficiaryFlowContract$State", "Lcom/revolut/kompot/navigable/flow/FlowState;", "", "toString", "()Ljava/lang/String;", "feature_crypto_withdraw_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CryptoAddBeneficiaryFlowContract$State implements FlowState {

    @NotNull
    public static final Parcelable.Creator<CryptoAddBeneficiaryFlowContract$State> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CryptoAddBeneficiaryFlowContract$CollectedDetails f71213a;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CryptoAddBeneficiaryFlowContract$State(parcel.readInt() == 0 ? null : CryptoAddBeneficiaryFlowContract$CollectedDetails.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CryptoAddBeneficiaryFlowContract$State[i];
        }
    }

    public CryptoAddBeneficiaryFlowContract$State(CryptoAddBeneficiaryFlowContract$CollectedDetails cryptoAddBeneficiaryFlowContract$CollectedDetails) {
        this.f71213a = cryptoAddBeneficiaryFlowContract$CollectedDetails;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof CryptoAddBeneficiaryFlowContract$State) && Intrinsics.f(this.f71213a, ((CryptoAddBeneficiaryFlowContract$State) obj2).f71213a);
    }

    public final int hashCode() {
        CryptoAddBeneficiaryFlowContract$CollectedDetails cryptoAddBeneficiaryFlowContract$CollectedDetails = this.f71213a;
        if (cryptoAddBeneficiaryFlowContract$CollectedDetails == null) {
            return 0;
        }
        return cryptoAddBeneficiaryFlowContract$CollectedDetails.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        CryptoAddBeneficiaryFlowContract$CollectedDetails cryptoAddBeneficiaryFlowContract$CollectedDetails = this.f71213a;
        if (cryptoAddBeneficiaryFlowContract$CollectedDetails == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            cryptoAddBeneficiaryFlowContract$CollectedDetails.writeToParcel(dest, i);
        }
    }

    public CryptoAddBeneficiaryFlowContract$State() {
        this(null);
    }
}
