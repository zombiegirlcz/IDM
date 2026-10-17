package com.revolut.feature.payments.who_to_transfer.api.transfer;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.transfer.core.models.TransferMoneyPocket;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/payments/who_to_transfer/api/transfer/TransferDestinationParcel;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_payments_who_to_transfer_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TransferDestinationParcel implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<TransferDestinationParcel> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TransferMoneyPocket f80045a;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new TransferDestinationParcel((TransferMoneyPocket) parcel.readParcelable(TransferDestinationParcel.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TransferDestinationParcel[i];
        }
    }

    public TransferDestinationParcel(TransferMoneyPocket transferMoneyPocket) {
        this.f80045a = transferMoneyPocket;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof TransferDestinationParcel) && Intrinsics.f(this.f80045a, ((TransferDestinationParcel) obj2).f80045a);
    }

    public final int hashCode() {
        TransferMoneyPocket transferMoneyPocket = this.f80045a;
        if (transferMoneyPocket == null) {
            return 0;
        }
        return transferMoneyPocket.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f80045a, i);
    }

    public TransferDestinationParcel() {
        this(null);
    }
}
