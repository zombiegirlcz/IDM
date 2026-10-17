package com.revolut.feature.trading.transfer.investments.api.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xi0.b;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/trading/transfer/investments/api/domain/model/TransferInInstrument;", "Lcom/revolut/feature/trading/transfer/investments/api/domain/model/TransferInstrument;", "", "toString", "()Ljava/lang/String;", "feature_trading_transfer_investments_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TransferInInstrument implements TransferInstrument {

    @NotNull
    public static final Parcelable.Creator<TransferInInstrument> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f91506a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f91507b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f91508c;
    public final b d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new TransferInInstrument(parcel.readString(), parcel.readString(), parcel.readString(), (b) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TransferInInstrument[i];
        }
    }

    public TransferInInstrument(String ref2, String name, String symbol, b currency) {
        Intrinsics.checkNotNullParameter(ref2, "ref");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.f91506a = ref2;
        this.f91507b = name;
        this.f91508c = symbol;
        this.d = currency;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TransferInInstrument)) {
            return false;
        }
        TransferInInstrument transferInInstrument = (TransferInInstrument) obj2;
        return Intrinsics.f(this.f91506a, transferInInstrument.f91506a) && Intrinsics.f(this.f91507b, transferInInstrument.f91507b) && Intrinsics.f(this.f91508c, transferInInstrument.f91508c) && Intrinsics.f(this.d, transferInInstrument.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + p.a.c(p.a.c(this.f91506a.hashCode() * 31, 31, this.f91507b), 31, this.f91508c);
    }

    @Override // com.revolut.feature.trading.transfer.investments.api.domain.model.TransferInstrument
    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getF91506a() {
        return this.f91506a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f91506a);
        dest.writeString(this.f91507b);
        dest.writeString(this.f91508c);
        dest.writeSerializable(this.d);
    }
}
