package com.revolut.feature.payments.who_to_transfer.api.transfer;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.data.database.models.openbanking.d;
import com.revolut.feature.payments.who_to_transfer.api.common.WhoToTransferFilter;
import com.revolut.feature.payments.who_to_transfer.api.transfer.TabTransferShotDialogAction;
import com.revolut.feature.payments.who_to_transfer.api.transfer.TransferDestination;
import com.revolut.feature.transfer.core.models.TransferFlowType;
import com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig;
import com.revolut.kompot.common.ParcelableDestination;
import com.revolut.retail.core.navigation.ActivityAnimation;
import ehe.n;
import g3a.e;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/revolut/feature/payments/who_to_transfer/api/transfer/TransferBridgeFeatureConfig;", "Lcom/revolut/kompot/bridge/navigation/KompotBridgeFeatureConfig;", "NewTransfer", "NewTransferFriend", "ChatTransfer", "PaymentsSearch", "FindFriends", "Lcom/revolut/feature/payments/who_to_transfer/api/transfer/TransferBridgeFeatureConfig$ChatTransfer;", "Lcom/revolut/feature/payments/who_to_transfer/api/transfer/TransferBridgeFeatureConfig$FindFriends;", "Lcom/revolut/feature/payments/who_to_transfer/api/transfer/TransferBridgeFeatureConfig$NewTransfer;", "Lcom/revolut/feature/payments/who_to_transfer/api/transfer/TransferBridgeFeatureConfig$NewTransferFriend;", "Lcom/revolut/feature/payments/who_to_transfer/api/transfer/TransferBridgeFeatureConfig$PaymentsSearch;", "feature_payments_who_to_transfer_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class TransferBridgeFeatureConfig extends KompotBridgeFeatureConfig {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/payments/who_to_transfer/api/transfer/TransferBridgeFeatureConfig$ChatTransfer;", "Lcom/revolut/feature/payments/who_to_transfer/api/transfer/TransferBridgeFeatureConfig;", "", "toString", "()Ljava/lang/String;", "feature_payments_who_to_transfer_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ChatTransfer extends TransferBridgeFeatureConfig {

        @NotNull
        public static final Parcelable.Creator<ChatTransfer> CREATOR = new a();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final boolean f80025g;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ChatTransfer(parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ChatTransfer[i];
            }
        }

        public ChatTransfer() {
            this(true);
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof ChatTransfer) && this.f80025g == ((ChatTransfer) obj2).f80025g;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final int hashCode() {
            return Boolean.hashCode(this.f80025g);
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig, android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.f80025g ? 1 : 0);
        }

        public ChatTransfer(boolean z) {
            super(new TransferDestination.ChatTransfer(z, (TabTransferShotDialogAction.Success) null, 6));
            this.f80025g = z;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/payments/who_to_transfer/api/transfer/TransferBridgeFeatureConfig$FindFriends;", "Lcom/revolut/feature/payments/who_to_transfer/api/transfer/TransferBridgeFeatureConfig;", "<init>", "()V", "feature_payments_who_to_transfer_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class FindFriends extends TransferBridgeFeatureConfig {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final FindFriends f80026g = new FindFriends();

        @NotNull
        public static final Parcelable.Creator<FindFriends> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return FindFriends.f80026g;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new FindFriends[i];
            }
        }

        private FindFriends() {
            super(TransferDestination.FindFriends.f80036a);
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig, android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/payments/who_to_transfer/api/transfer/TransferBridgeFeatureConfig$NewTransfer;", "Lcom/revolut/feature/payments/who_to_transfer/api/transfer/TransferBridgeFeatureConfig;", "", "toString", "()Ljava/lang/String;", "feature_payments_who_to_transfer_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class NewTransfer extends TransferBridgeFeatureConfig {

        @NotNull
        public static final Parcelable.Creator<NewTransfer> CREATOR = new a();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final Set f80027g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final TransferDestinationParcel f80028h;
        public final e i;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                int i = parcel.readInt();
                LinkedHashSet linkedHashSet = new LinkedHashSet(i);
                int iE = 0;
                while (iE != i) {
                    iE = d.e(NewTransfer.class, parcel, linkedHashSet, iE, 1);
                }
                return new NewTransfer(linkedHashSet, parcel.readInt() == 0 ? null : TransferDestinationParcel.CREATOR.createFromParcel(parcel), e.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new NewTransfer[i];
            }
        }

        public NewTransfer() {
            this(0);
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof NewTransfer)) {
                return false;
            }
            NewTransfer newTransfer = (NewTransfer) obj2;
            return Intrinsics.f(this.f80027g, newTransfer.f80027g) && Intrinsics.f(this.f80028h, newTransfer.f80028h) && this.i == newTransfer.i;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final int hashCode() {
            int iHashCode = this.f80027g.hashCode() * 31;
            TransferDestinationParcel transferDestinationParcel = this.f80028h;
            return this.i.hashCode() + ((iHashCode + (transferDestinationParcel == null ? 0 : transferDestinationParcel.hashCode())) * 31);
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig, android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            Iterator itV = n.v(this.f80027g, dest);
            while (itV.hasNext()) {
                dest.writeParcelable((Parcelable) itV.next(), i);
            }
            TransferDestinationParcel transferDestinationParcel = this.f80028h;
            if (transferDestinationParcel == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                transferDestinationParcel.writeToParcel(dest, i);
            }
            dest.writeString(this.i.name());
        }

        public NewTransfer(int i) {
            this(com.revolut.feature.payments.who_to_transfer.api.common.a.f80009a, null, e.PAYMENTS);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NewTransfer(Set availableFilters, TransferDestinationParcel transferDestinationParcel, e entryPoint) {
            super(new TransferDestination.NewTransfer(availableFilters, transferDestinationParcel, entryPoint));
            Intrinsics.checkNotNullParameter(availableFilters, "availableFilters");
            Intrinsics.checkNotNullParameter(entryPoint, "entryPoint");
            this.f80027g = availableFilters;
            this.f80028h = transferDestinationParcel;
            this.i = entryPoint;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/payments/who_to_transfer/api/transfer/TransferBridgeFeatureConfig$NewTransferFriend;", "Lcom/revolut/feature/payments/who_to_transfer/api/transfer/TransferBridgeFeatureConfig;", "<init>", "()V", "feature_payments_who_to_transfer_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class NewTransferFriend extends TransferBridgeFeatureConfig {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final NewTransferFriend f80029g = new NewTransferFriend();

        @NotNull
        public static final Parcelable.Creator<NewTransferFriend> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return NewTransferFriend.f80029g;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new NewTransferFriend[i];
            }
        }

        private NewTransferFriend() {
            super(TransferDestination.NewTransferFriend.f80040a);
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig, android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/payments/who_to_transfer/api/transfer/TransferBridgeFeatureConfig$PaymentsSearch;", "Lcom/revolut/feature/payments/who_to_transfer/api/transfer/TransferBridgeFeatureConfig;", "", "toString", "()Ljava/lang/String;", "feature_payments_who_to_transfer_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PaymentsSearch extends TransferBridgeFeatureConfig {

        @NotNull
        public static final Parcelable.Creator<PaymentsSearch> CREATOR = new a();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final Set f80030g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final WhoToTransferFilter f80031h;
        public final TransferFlowType i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final TransferDestinationParcel f80032j;
        public final boolean k;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                int i = parcel.readInt();
                LinkedHashSet linkedHashSet = new LinkedHashSet(i);
                int iE = 0;
                while (iE != i) {
                    iE = d.e(PaymentsSearch.class, parcel, linkedHashSet, iE, 1);
                }
                return new PaymentsSearch((WhoToTransferFilter) parcel.readParcelable(PaymentsSearch.class.getClassLoader()), parcel.readInt() == 0 ? null : TransferDestinationParcel.CREATOR.createFromParcel(parcel), (TransferFlowType) parcel.readParcelable(PaymentsSearch.class.getClassLoader()), linkedHashSet, parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PaymentsSearch[i];
            }
        }

        public PaymentsSearch() {
            this(null, null, null, 31);
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof PaymentsSearch)) {
                return false;
            }
            PaymentsSearch paymentsSearch = (PaymentsSearch) obj2;
            return Intrinsics.f(this.f80030g, paymentsSearch.f80030g) && Intrinsics.f(this.f80031h, paymentsSearch.f80031h) && Intrinsics.f(this.i, paymentsSearch.i) && Intrinsics.f(this.f80032j, paymentsSearch.f80032j) && this.k == paymentsSearch.k;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final int hashCode() {
            int iHashCode = this.f80030g.hashCode() * 31;
            WhoToTransferFilter whoToTransferFilter = this.f80031h;
            int iC = d.c(this.i, (iHashCode + (whoToTransferFilter == null ? 0 : whoToTransferFilter.hashCode())) * 31, 31);
            TransferDestinationParcel transferDestinationParcel = this.f80032j;
            return Boolean.hashCode(this.k) + ((iC + (transferDestinationParcel != null ? transferDestinationParcel.hashCode() : 0)) * 31);
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig, android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            Iterator itV = n.v(this.f80030g, dest);
            while (itV.hasNext()) {
                dest.writeParcelable((Parcelable) itV.next(), i);
            }
            dest.writeParcelable(this.f80031h, i);
            dest.writeParcelable(this.i, i);
            TransferDestinationParcel transferDestinationParcel = this.f80032j;
            if (transferDestinationParcel == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                transferDestinationParcel.writeToParcel(dest, i);
            }
            dest.writeInt(this.k ? 1 : 0);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public PaymentsSearch(Set set, TransferFlowType transferFlowType, TransferDestinationParcel transferDestinationParcel, int i) {
            Set set2 = (i & 1) != 0 ? com.revolut.feature.payments.who_to_transfer.api.common.a.f80009a : set;
            this(null, (i & 8) != 0 ? null : transferDestinationParcel, (i & 4) != 0 ? TransferFlowType.Default.f92257b : transferFlowType, set2, (i & 16) != 0);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PaymentsSearch(WhoToTransferFilter whoToTransferFilter, TransferDestinationParcel transferDestinationParcel, TransferFlowType transferFlowType, Set availableFilters, boolean z) {
            super(new TransferDestination.PaymentsSearch(whoToTransferFilter, transferDestinationParcel, transferFlowType, availableFilters, z));
            Intrinsics.checkNotNullParameter(availableFilters, "availableFilters");
            Intrinsics.checkNotNullParameter(transferFlowType, "transferFlowType");
            this.f80030g = availableFilters;
            this.f80031h = whoToTransferFilter;
            this.i = transferFlowType;
            this.f80032j = transferDestinationParcel;
            this.k = z;
        }
    }

    public TransferBridgeFeatureConfig(TransferDestination transferDestination) {
        super((ActivityAnimation) null, (ParcelableDestination) transferDestination, false, (Integer) null, 0, 61);
    }
}
