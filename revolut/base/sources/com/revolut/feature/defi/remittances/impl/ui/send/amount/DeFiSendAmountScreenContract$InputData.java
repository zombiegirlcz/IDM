package com.revolut.feature.defi.remittances.impl.ui.send.amount;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.crypto.withdraw.api.models.CryptoAddress;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/defi/remittances/impl/ui/send/amount/DeFiSendAmountScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_defi_remittances_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class DeFiSendAmountScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<DeFiSendAmountScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f71821a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CryptoAddress f71822b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f71823c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new DeFiSendAmountScreenContract$InputData(parcel.readString(), (CryptoAddress) parcel.readParcelable(DeFiSendAmountScreenContract$InputData.class.getClassLoader()), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new DeFiSendAmountScreenContract$InputData[i];
        }
    }

    public DeFiSendAmountScreenContract$InputData(String accountId, CryptoAddress wallet, boolean z) {
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        Intrinsics.checkNotNullParameter(wallet, "wallet");
        this.f71821a = accountId;
        this.f71822b = wallet;
        this.f71823c = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof DeFiSendAmountScreenContract$InputData)) {
            return false;
        }
        DeFiSendAmountScreenContract$InputData deFiSendAmountScreenContract$InputData = (DeFiSendAmountScreenContract$InputData) obj2;
        return Intrinsics.f(this.f71821a, deFiSendAmountScreenContract$InputData.f71821a) && Intrinsics.f(this.f71822b, deFiSendAmountScreenContract$InputData.f71822b) && this.f71823c == deFiSendAmountScreenContract$InputData.f71823c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f71823c) + ((this.f71822b.hashCode() + (this.f71821a.hashCode() * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f71821a);
        dest.writeParcelable(this.f71822b, i);
        dest.writeInt(this.f71823c ? 1 : 0);
    }
}
