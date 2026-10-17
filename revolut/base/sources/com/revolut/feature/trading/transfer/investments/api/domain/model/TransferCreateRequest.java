package com.revolut.feature.trading.transfer.investments.api.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import u8f.d;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/trading/transfer/investments/api/domain/model/TransferCreateRequest;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_trading_transfer_investments_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TransferCreateRequest implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<TransferCreateRequest> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f91503a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TransferBroker f91504b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TransferUserAccountInformation f91505c;
    public final List d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            d dVarValueOf = d.valueOf(parcel.readString());
            TransferBroker transferBrokerCreateFromParcel = TransferBroker.CREATOR.createFromParcel(parcel);
            TransferUserAccountInformation transferUserAccountInformation = (TransferUserAccountInformation) parcel.readParcelable(TransferCreateRequest.class.getClassLoader());
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iE = 0;
            while (iE != i) {
                iE = j6.a.e(TransferCreateRequest.class, parcel, arrayList, iE, 1);
            }
            return new TransferCreateRequest(dVarValueOf, transferBrokerCreateFromParcel, transferUserAccountInformation, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TransferCreateRequest[i];
        }
    }

    public TransferCreateRequest(d direction, TransferBroker broker, TransferUserAccountInformation userAccountInformation, List selectedAssets) {
        Intrinsics.checkNotNullParameter(direction, "direction");
        Intrinsics.checkNotNullParameter(broker, "broker");
        Intrinsics.checkNotNullParameter(userAccountInformation, "userAccountInformation");
        Intrinsics.checkNotNullParameter(selectedAssets, "selectedAssets");
        this.f91503a = direction;
        this.f91504b = broker;
        this.f91505c = userAccountInformation;
        this.d = selectedAssets;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TransferCreateRequest)) {
            return false;
        }
        TransferCreateRequest transferCreateRequest = (TransferCreateRequest) obj2;
        return this.f91503a == transferCreateRequest.f91503a && Intrinsics.f(this.f91504b, transferCreateRequest.f91504b) && Intrinsics.f(this.f91505c, transferCreateRequest.f91505c) && Intrinsics.f(this.d, transferCreateRequest.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.f91505c.hashCode() + ((this.f91504b.hashCode() + (this.f91503a.hashCode() * 31)) * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f91503a.name());
        this.f91504b.writeToParcel(dest, i);
        dest.writeParcelable(this.f91505c, i);
        Iterator itV = p.a.v(this.d, dest);
        while (itV.hasNext()) {
            dest.writeParcelable((Parcelable) itV.next(), i);
        }
    }
}
