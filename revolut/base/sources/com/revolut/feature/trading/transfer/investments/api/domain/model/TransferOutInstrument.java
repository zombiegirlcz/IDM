package com.revolut.feature.trading.transfer.investments.api.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import dj0.d;
import h30.l;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xi0.b;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/trading/transfer/investments/api/domain/model/TransferOutInstrument;", "Lcom/revolut/feature/trading/transfer/investments/api/domain/model/TransferInstrument;", "", "toString", "()Ljava/lang/String;", "feature_trading_transfer_investments_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TransferOutInstrument implements TransferInstrument {

    @NotNull
    public static final Parcelable.Creator<TransferOutInstrument> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f91514a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f91515b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f91516c;
    public final b d;
    public final BigDecimal e;
    public final d f;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new TransferOutInstrument(parcel.readString(), parcel.readString(), parcel.readString(), (b) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), (d) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TransferOutInstrument[i];
        }
    }

    public TransferOutInstrument(String ref2, String name, String symbol, b currency, BigDecimal quantity, d dVar) {
        Intrinsics.checkNotNullParameter(ref2, "ref");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(quantity, "quantity");
        this.f91514a = ref2;
        this.f91515b = name;
        this.f91516c = symbol;
        this.d = currency;
        this.e = quantity;
        this.f = dVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TransferOutInstrument)) {
            return false;
        }
        TransferOutInstrument transferOutInstrument = (TransferOutInstrument) obj2;
        return Intrinsics.f(this.f91514a, transferOutInstrument.f91514a) && Intrinsics.f(this.f91515b, transferOutInstrument.f91515b) && Intrinsics.f(this.f91516c, transferOutInstrument.f91516c) && Intrinsics.f(this.d, transferOutInstrument.d) && Intrinsics.f(this.e, transferOutInstrument.e) && Intrinsics.f(this.f, transferOutInstrument.f);
    }

    public final int hashCode() {
        int iD = t61.a.d(this.e, l.j(this.d, p.a.c(p.a.c(this.f91514a.hashCode() * 31, 31, this.f91515b), 31, this.f91516c), 31), 31);
        d dVar = this.f;
        return iD + (dVar == null ? 0 : dVar.hashCode());
    }

    @Override // com.revolut.feature.trading.transfer.investments.api.domain.model.TransferInstrument
    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getF91514a() {
        return this.f91514a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f91514a);
        dest.writeString(this.f91515b);
        dest.writeString(this.f91516c);
        dest.writeSerializable(this.d);
        dest.writeSerializable(this.e);
        dest.writeSerializable(this.f);
    }
}
