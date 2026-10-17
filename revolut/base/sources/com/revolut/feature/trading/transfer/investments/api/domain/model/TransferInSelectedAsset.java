package com.revolut.feature.trading.transfer.investments.api.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import ej0.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/trading/transfer/investments/api/domain/model/TransferInSelectedAsset;", "Lcom/revolut/feature/trading/transfer/investments/api/domain/model/TransferSelectedAsset;", "", "toString", "()Ljava/lang/String;", "feature_trading_transfer_investments_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TransferInSelectedAsset implements TransferSelectedAsset {

    @NotNull
    public static final Parcelable.Creator<TransferInSelectedAsset> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TransferInInstrument f91510a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f91511b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f91512c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new TransferInSelectedAsset(TransferInInstrument.CREATOR.createFromParcel(parcel), parcel.readInt(), (b) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TransferInSelectedAsset[i];
        }
    }

    public TransferInSelectedAsset(TransferInInstrument instrument, int i, b bVar) {
        Intrinsics.checkNotNullParameter(instrument, "instrument");
        this.f91510a = instrument;
        this.f91511b = i;
        this.f91512c = bVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TransferInSelectedAsset)) {
            return false;
        }
        TransferInSelectedAsset transferInSelectedAsset = (TransferInSelectedAsset) obj2;
        return Intrinsics.f(this.f91510a, transferInSelectedAsset.f91510a) && this.f91511b == transferInSelectedAsset.f91511b && Intrinsics.f(this.f91512c, transferInSelectedAsset.f91512c);
    }

    public final int hashCode() {
        int iB = j6.a.b(this.f91511b, this.f91510a.hashCode() * 31, 31);
        b bVar = this.f91512c;
        return iB + (bVar == null ? 0 : bVar.hashCode());
    }

    @Override // com.revolut.feature.trading.transfer.investments.api.domain.model.TransferSelectedAsset
    public final TransferInstrument n() {
        return this.f91510a;
    }

    @Override // com.revolut.feature.trading.transfer.investments.api.domain.model.TransferSelectedAsset
    /* JADX INFO: renamed from: u, reason: from getter */
    public final int getF91511b() {
        return this.f91511b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        this.f91510a.writeToParcel(dest, i);
        dest.writeInt(this.f91511b);
        dest.writeSerializable(this.f91512c);
    }
}
