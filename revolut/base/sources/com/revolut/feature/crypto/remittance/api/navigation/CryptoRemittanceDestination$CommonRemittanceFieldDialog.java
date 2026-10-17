package com.revolut.feature.crypto.remittance.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.crypto.remittance.api.models.TransactionCryptoRemittanceAction;
import com.revolut.kompot.common.ParcelableDestination;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/crypto/remittance/api/navigation/CryptoRemittanceDestination$CommonRemittanceFieldDialog", "", "", "toString", "()Ljava/lang/String;", "feature_crypto_remittance_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CryptoRemittanceDestination$CommonRemittanceFieldDialog implements ParcelableDestination {

    @NotNull
    public static final Parcelable.Creator<CryptoRemittanceDestination$CommonRemittanceFieldDialog> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TransactionCryptoRemittanceAction f70935a;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CryptoRemittanceDestination$CommonRemittanceFieldDialog((TransactionCryptoRemittanceAction) parcel.readParcelable(CryptoRemittanceDestination$CommonRemittanceFieldDialog.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CryptoRemittanceDestination$CommonRemittanceFieldDialog[i];
        }
    }

    public CryptoRemittanceDestination$CommonRemittanceFieldDialog(TransactionCryptoRemittanceAction action) {
        Intrinsics.checkNotNullParameter(action, "action");
        this.f70935a = action;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final TransactionCryptoRemittanceAction getF70935a() {
        return this.f70935a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof CryptoRemittanceDestination$CommonRemittanceFieldDialog) && Intrinsics.f(this.f70935a, ((CryptoRemittanceDestination$CommonRemittanceFieldDialog) obj2).f70935a);
    }

    public final int hashCode() {
        return this.f70935a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f70935a, i);
    }
}
