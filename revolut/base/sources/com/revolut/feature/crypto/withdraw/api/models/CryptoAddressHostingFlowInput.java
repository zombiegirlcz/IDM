package com.revolut.feature.crypto.withdraw.api.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/crypto/withdraw/api/models/CryptoAddressHostingFlowInput;", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_crypto_withdraw_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CryptoAddressHostingFlowInput implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<CryptoAddressHostingFlowInput> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f71076a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f71077b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CryptoAddressHostingFlowInput(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CryptoAddressHostingFlowInput[i];
        }
    }

    public CryptoAddressHostingFlowInput(Integer num, boolean z) {
        this.f71076a = num;
        this.f71077b = z;
    }

    /* JADX INFO: renamed from: U, reason: from getter */
    public final Integer getF71076a() {
        return this.f71076a;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final boolean getF71077b() {
        return this.f71077b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CryptoAddressHostingFlowInput)) {
            return false;
        }
        CryptoAddressHostingFlowInput cryptoAddressHostingFlowInput = (CryptoAddressHostingFlowInput) obj2;
        return Intrinsics.f(this.f71076a, cryptoAddressHostingFlowInput.f71076a) && this.f71077b == cryptoAddressHostingFlowInput.f71077b;
    }

    public final int hashCode() {
        Integer num = this.f71076a;
        return Boolean.hashCode(this.f71077b) + ((num == null ? 0 : num.hashCode()) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Integer num = this.f71076a;
        if (num == null) {
            dest.writeInt(0);
        } else {
            p.a.B(dest, 1, num);
        }
        dest.writeInt(this.f71077b ? 1 : 0);
    }
}
