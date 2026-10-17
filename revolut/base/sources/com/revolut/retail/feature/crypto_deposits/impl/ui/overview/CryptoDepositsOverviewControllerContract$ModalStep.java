package com.revolut.retail.feature.crypto_deposits.impl.ui.overview;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import com.revolut.retail.feature.crypto_deposits.api.models.CryptoDepositAddress;
import dj0.d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\fÀ\u0006\u0003"}, d2 = {"com/revolut/retail/feature/crypto_deposits/impl/ui/overview/CryptoDepositsOverviewControllerContract$ModalStep", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "SelectNetwork", "MinimumDeposit", "MindfulOfNetwork", "Tag", "ViewAddress", "Lcom/revolut/retail/feature/crypto_deposits/impl/ui/overview/CryptoDepositsOverviewControllerContract$ModalStep$MindfulOfNetwork;", "Lcom/revolut/retail/feature/crypto_deposits/impl/ui/overview/CryptoDepositsOverviewControllerContract$ModalStep$MinimumDeposit;", "Lcom/revolut/retail/feature/crypto_deposits/impl/ui/overview/CryptoDepositsOverviewControllerContract$ModalStep$SelectNetwork;", "Lcom/revolut/retail/feature/crypto_deposits/impl/ui/overview/CryptoDepositsOverviewControllerContract$ModalStep$Tag;", "Lcom/revolut/retail/feature/crypto_deposits/impl/ui/overview/CryptoDepositsOverviewControllerContract$ModalStep$ViewAddress;", "feature_crypto_deposits_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface CryptoDepositsOverviewControllerContract$ModalStep extends FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/crypto_deposits/impl/ui/overview/CryptoDepositsOverviewControllerContract$ModalStep$MindfulOfNetwork;", "Lcom/revolut/retail/feature/crypto_deposits/impl/ui/overview/CryptoDepositsOverviewControllerContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_crypto_deposits_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class MindfulOfNetwork implements CryptoDepositsOverviewControllerContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<MindfulOfNetwork> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final wk5.a f100078a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new MindfulOfNetwork(wk5.a.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new MindfulOfNetwork[i];
            }
        }

        public MindfulOfNetwork(wk5.a selectedBlockchain) {
            Intrinsics.checkNotNullParameter(selectedBlockchain, "selectedBlockchain");
            this.f100078a = selectedBlockchain;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof MindfulOfNetwork) && this.f100078a == ((MindfulOfNetwork) obj2).f100078a;
        }

        public final int hashCode() {
            return this.f100078a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f100078a.name());
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/crypto_deposits/impl/ui/overview/CryptoDepositsOverviewControllerContract$ModalStep$MinimumDeposit;", "Lcom/revolut/retail/feature/crypto_deposits/impl/ui/overview/CryptoDepositsOverviewControllerContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_crypto_deposits_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class MinimumDeposit implements CryptoDepositsOverviewControllerContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<MinimumDeposit> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final d f100079a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new MinimumDeposit((d) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new MinimumDeposit[i];
            }
        }

        public MinimumDeposit(d minimumDepositValue) {
            Intrinsics.checkNotNullParameter(minimumDepositValue, "minimumDepositValue");
            this.f100079a = minimumDepositValue;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof MinimumDeposit) && Intrinsics.f(this.f100079a, ((MinimumDeposit) obj2).f100079a);
        }

        public final int hashCode() {
            return this.f100079a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f100079a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/crypto_deposits/impl/ui/overview/CryptoDepositsOverviewControllerContract$ModalStep$SelectNetwork;", "Lcom/revolut/retail/feature/crypto_deposits/impl/ui/overview/CryptoDepositsOverviewControllerContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_crypto_deposits_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SelectNetwork implements CryptoDepositsOverviewControllerContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<SelectNetwork> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List f100080a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final wk5.a f100081b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(wk5.a.valueOf(parcel.readString()));
                }
                return new SelectNetwork(arrayList, wk5.a.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SelectNetwork[i];
            }
        }

        public SelectNetwork(List blockchains, wk5.a selectedBlockchain) {
            Intrinsics.checkNotNullParameter(blockchains, "blockchains");
            Intrinsics.checkNotNullParameter(selectedBlockchain, "selectedBlockchain");
            this.f100080a = blockchains;
            this.f100081b = selectedBlockchain;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof SelectNetwork)) {
                return false;
            }
            SelectNetwork selectNetwork = (SelectNetwork) obj2;
            return Intrinsics.f(this.f100080a, selectNetwork.f100080a) && this.f100081b == selectNetwork.f100081b;
        }

        public final int hashCode() {
            return this.f100081b.hashCode() + (this.f100080a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            Iterator itV = p.a.v(this.f100080a, dest);
            while (itV.hasNext()) {
                dest.writeString(((wk5.a) itV.next()).name());
            }
            dest.writeString(this.f100081b.name());
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/crypto_deposits/impl/ui/overview/CryptoDepositsOverviewControllerContract$ModalStep$Tag;", "Lcom/revolut/retail/feature/crypto_deposits/impl/ui/overview/CryptoDepositsOverviewControllerContract$ModalStep;", "<init>", "()V", "feature_crypto_deposits_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Tag implements CryptoDepositsOverviewControllerContract$ModalStep {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Tag f100082a = new Tag();

        @NotNull
        public static final Parcelable.Creator<Tag> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Tag.f100082a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Tag[i];
            }
        }

        private Tag() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/crypto_deposits/impl/ui/overview/CryptoDepositsOverviewControllerContract$ModalStep$ViewAddress;", "Lcom/revolut/retail/feature/crypto_deposits/impl/ui/overview/CryptoDepositsOverviewControllerContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_crypto_deposits_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ViewAddress implements CryptoDepositsOverviewControllerContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<ViewAddress> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CryptoDepositAddress f100083a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ViewAddress((CryptoDepositAddress) parcel.readParcelable(ViewAddress.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ViewAddress[i];
            }
        }

        public ViewAddress(CryptoDepositAddress address) {
            Intrinsics.checkNotNullParameter(address, "address");
            this.f100083a = address;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof ViewAddress) && Intrinsics.f(this.f100083a, ((ViewAddress) obj2).f100083a);
        }

        public final int hashCode() {
            return this.f100083a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f100083a, i);
        }
    }
}
