package com.revolut.feature.trading.transfer.investments.api.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import u8f.h;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/trading/transfer/investments/api/domain/model/TransferBroker;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_trading_transfer_investments_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TransferBroker implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<TransferBroker> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f91500a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f91501b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h f91502c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new TransferBroker(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : h.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TransferBroker[i];
        }
    }

    public TransferBroker(String name, String icon, h hVar) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(icon, "icon");
        this.f91500a = name;
        this.f91501b = icon;
        this.f91502c = hVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TransferBroker)) {
            return false;
        }
        TransferBroker transferBroker = (TransferBroker) obj2;
        return Intrinsics.f(this.f91500a, transferBroker.f91500a) && Intrinsics.f(this.f91501b, transferBroker.f91501b) && this.f91502c == transferBroker.f91502c;
    }

    public final int hashCode() {
        int iC = p.a.c(this.f91500a.hashCode() * 31, 31, this.f91501b);
        h hVar = this.f91502c;
        return iC + (hVar == null ? 0 : hVar.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f91500a);
        dest.writeString(this.f91501b);
        h hVar = this.f91502c;
        if (hVar == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(hVar.name());
        }
    }
}
