package com.revolut.retail.feature.crypto_deposits.impl.ui.overview;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import com.revolut.retail.feature.crypto_deposits.impl.ui.overview.flow.CryptoDepositsOverviewFlowContract$InputData;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zbj.u0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/retail/feature/crypto_deposits/impl/ui/overview/CryptoDepositsOverviewControllerContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_crypto_deposits_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CryptoDepositsOverviewControllerContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<CryptoDepositsOverviewControllerContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xi0.b f100075a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f100076b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final u0 f100077c;
    public final hbj.b d;
    public final wk5.a e;
    public final CryptoDepositsOverviewFlowContract$InputData.Source f;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            xi0.b bVar = (xi0.b) parcel.readSerializable();
            boolean z = parcel.readInt() != 0;
            return new CryptoDepositsOverviewControllerContract$InputData((CryptoDepositsOverviewFlowContract$InputData.Source) parcel.readParcelable(CryptoDepositsOverviewControllerContract$InputData.class.getClassLoader()), hbj.b.valueOf(parcel.readString()), parcel.readInt() != 0 ? wk5.a.valueOf(parcel.readString()) : null, bVar, parcel.readInt() == 0 ? null : u0.valueOf(parcel.readString()), z);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CryptoDepositsOverviewControllerContract$InputData[i];
        }
    }

    public CryptoDepositsOverviewControllerContract$InputData(CryptoDepositsOverviewFlowContract$InputData.Source source, hbj.b insidePopupToShow, wk5.a aVar, xi0.b currency, u0 u0Var, boolean z) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(insidePopupToShow, "insidePopupToShow");
        Intrinsics.checkNotNullParameter(source, "source");
        this.f100075a = currency;
        this.f100076b = z;
        this.f100077c = u0Var;
        this.d = insidePopupToShow;
        this.e = aVar;
        this.f = source;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CryptoDepositsOverviewControllerContract$InputData)) {
            return false;
        }
        CryptoDepositsOverviewControllerContract$InputData cryptoDepositsOverviewControllerContract$InputData = (CryptoDepositsOverviewControllerContract$InputData) obj2;
        return Intrinsics.f(this.f100075a, cryptoDepositsOverviewControllerContract$InputData.f100075a) && this.f100076b == cryptoDepositsOverviewControllerContract$InputData.f100076b && this.f100077c == cryptoDepositsOverviewControllerContract$InputData.f100077c && this.d == cryptoDepositsOverviewControllerContract$InputData.d && this.e == cryptoDepositsOverviewControllerContract$InputData.e && Intrinsics.f(this.f, cryptoDepositsOverviewControllerContract$InputData.f);
    }

    public final int hashCode() {
        int iC = j6.a.c(this.f100075a.hashCode() * 31, 31, this.f100076b);
        u0 u0Var = this.f100077c;
        int iHashCode = (this.d.hashCode() + ((iC + (u0Var == null ? 0 : u0Var.hashCode())) * 31)) * 31;
        wk5.a aVar = this.e;
        return this.f.hashCode() + ((iHashCode + (aVar != null ? aVar.hashCode() : 0)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f100075a);
        dest.writeInt(this.f100076b ? 1 : 0);
        u0 u0Var = this.f100077c;
        if (u0Var == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(u0Var.name());
        }
        dest.writeString(this.d.name());
        wk5.a aVar = this.e;
        if (aVar == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(aVar.name());
        }
        dest.writeParcelable(this.f, i);
    }
}
