package com.revolut.retail.feature.crypto_deposits.impl.ui.overview.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zbj.u0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0002\u0006\u0007J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"com/revolut/retail/feature/crypto_deposits/impl/ui/overview/flow/CryptoDepositsOverviewFlowContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "Companion", "Source", "a", "feature_crypto_deposits_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CryptoDepositsOverviewFlowContract$InputData implements IOData$Input {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xi0.b f100096a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u0 f100097b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f100098c;
    public final hbj.b d;
    public final wk5.a e;
    public final Source f;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    @NotNull
    public static final Parcelable.Creator<CryptoDepositsOverviewFlowContract$InputData> CREATOR = new b();

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lcom/revolut/retail/feature/crypto_deposits/impl/ui/overview/flow/CryptoDepositsOverviewFlowContract$InputData$Source;", "Lcom/revolut/kompot/common/IOData$Input;", "CeFi", "DeFi", "Lcom/revolut/retail/feature/crypto_deposits/impl/ui/overview/flow/CryptoDepositsOverviewFlowContract$InputData$Source$CeFi;", "Lcom/revolut/retail/feature/crypto_deposits/impl/ui/overview/flow/CryptoDepositsOverviewFlowContract$InputData$Source$DeFi;", "feature_crypto_deposits_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface Source extends IOData$Input {

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/crypto_deposits/impl/ui/overview/flow/CryptoDepositsOverviewFlowContract$InputData$Source$CeFi;", "Lcom/revolut/retail/feature/crypto_deposits/impl/ui/overview/flow/CryptoDepositsOverviewFlowContract$InputData$Source;", "<init>", "()V", "feature_crypto_deposits_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class CeFi implements Source {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final CeFi f100099a = new CeFi();

            @NotNull
            public static final Parcelable.Creator<CeFi> CREATOR = new a();

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return CeFi.f100099a;
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new CeFi[i];
                }
            }

            private CeFi() {
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/crypto_deposits/impl/ui/overview/flow/CryptoDepositsOverviewFlowContract$InputData$Source$DeFi;", "Lcom/revolut/retail/feature/crypto_deposits/impl/ui/overview/flow/CryptoDepositsOverviewFlowContract$InputData$Source;", "", "toString", "()Ljava/lang/String;", "feature_crypto_deposits_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class DeFi implements Source {

            @NotNull
            public static final Parcelable.Creator<DeFi> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f100100a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final String f100101b;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new DeFi(parcel.readString(), parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new DeFi[i];
                }
            }

            public DeFi(String accountId, String assetExternalId) {
                Intrinsics.checkNotNullParameter(accountId, "accountId");
                Intrinsics.checkNotNullParameter(assetExternalId, "assetExternalId");
                this.f100100a = accountId;
                this.f100101b = assetExternalId;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof DeFi)) {
                    return false;
                }
                DeFi deFi = (DeFi) obj2;
                return Intrinsics.f(this.f100100a, deFi.f100100a) && Intrinsics.f(this.f100101b, deFi.f100101b);
            }

            public final int hashCode() {
                return this.f100101b.hashCode() + (this.f100100a.hashCode() * 31);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f100100a);
                dest.writeString(this.f100101b);
            }
        }
    }

    /* JADX INFO: renamed from: com.revolut.retail.feature.crypto_deposits.impl.ui.overview.flow.CryptoDepositsOverviewFlowContract$InputData$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CryptoDepositsOverviewFlowContract$InputData((Source) parcel.readParcelable(CryptoDepositsOverviewFlowContract$InputData.class.getClassLoader()), hbj.b.valueOf(parcel.readString()), parcel.readInt() != 0 ? wk5.a.valueOf(parcel.readString()) : null, (xi0.b) parcel.readSerializable(), parcel.readInt() == 0 ? null : u0.valueOf(parcel.readString()), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CryptoDepositsOverviewFlowContract$InputData[i];
        }
    }

    public CryptoDepositsOverviewFlowContract$InputData(Source source, hbj.b insidePopupToShow, wk5.a aVar, xi0.b bVar, u0 u0Var, boolean z) {
        Intrinsics.checkNotNullParameter(insidePopupToShow, "insidePopupToShow");
        Intrinsics.checkNotNullParameter(source, "source");
        this.f100096a = bVar;
        this.f100097b = u0Var;
        this.f100098c = z;
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
        if (!(obj2 instanceof CryptoDepositsOverviewFlowContract$InputData)) {
            return false;
        }
        CryptoDepositsOverviewFlowContract$InputData cryptoDepositsOverviewFlowContract$InputData = (CryptoDepositsOverviewFlowContract$InputData) obj2;
        return Intrinsics.f(this.f100096a, cryptoDepositsOverviewFlowContract$InputData.f100096a) && this.f100097b == cryptoDepositsOverviewFlowContract$InputData.f100097b && this.f100098c == cryptoDepositsOverviewFlowContract$InputData.f100098c && this.d == cryptoDepositsOverviewFlowContract$InputData.d && this.e == cryptoDepositsOverviewFlowContract$InputData.e && Intrinsics.f(this.f, cryptoDepositsOverviewFlowContract$InputData.f);
    }

    public final int hashCode() {
        xi0.b bVar = this.f100096a;
        int iHashCode = (bVar == null ? 0 : bVar.hashCode()) * 31;
        u0 u0Var = this.f100097b;
        int iHashCode2 = (this.d.hashCode() + j6.a.c((iHashCode + (u0Var == null ? 0 : u0Var.hashCode())) * 31, 31, this.f100098c)) * 31;
        wk5.a aVar = this.e;
        return this.f.hashCode() + ((iHashCode2 + (aVar != null ? aVar.hashCode() : 0)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f100096a);
        u0 u0Var = this.f100097b;
        if (u0Var == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(u0Var.name());
        }
        dest.writeInt(this.f100098c ? 1 : 0);
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
