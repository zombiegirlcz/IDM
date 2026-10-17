package com.revolut.feature.transfer.models.transfer;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.transfer.models.transfer.RecipientTrustState;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/transfer/models/transfer/TransferTrustData;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_transfer_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TransferTrustData implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<TransferTrustData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f92304a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final RecipientTrustState f92305b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f92306c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new TransferTrustData(parcel.readInt() != 0, (RecipientTrustState) parcel.readParcelable(TransferTrustData.class.getClassLoader()), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TransferTrustData[i];
        }
    }

    public TransferTrustData(boolean z, RecipientTrustState recipientTrustState, boolean z3) {
        this.f92304a = z;
        this.f92305b = recipientTrustState;
        this.f92306c = z3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TransferTrustData)) {
            return false;
        }
        TransferTrustData transferTrustData = (TransferTrustData) obj2;
        return this.f92304a == transferTrustData.f92304a && Intrinsics.f(this.f92305b, transferTrustData.f92305b) && this.f92306c == transferTrustData.f92306c;
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f92304a) * 31;
        RecipientTrustState recipientTrustState = this.f92305b;
        return Boolean.hashCode(this.f92306c) + ((iHashCode + (recipientTrustState == null ? 0 : recipientTrustState.hashCode())) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.f92304a ? 1 : 0);
        dest.writeParcelable(this.f92305b, i);
        dest.writeInt(this.f92306c ? 1 : 0);
    }

    public TransferTrustData(boolean z, RecipientTrustState recipientTrustState) {
        this(z, recipientTrustState, !Intrinsics.f(recipientTrustState, RecipientTrustState.Untrusted.f92303a));
    }
}
