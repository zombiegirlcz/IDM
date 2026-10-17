package com.revolut.feature.payments.who_to_transfer.api.who_to_transfer.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.model.account.AccountId;
import com.revolut.feature.payments.who_to_transfer.api.common.WhoToTransferLaunchType;
import com.revolut.feature.transfer.core.models.TransferMoneyPocket;
import com.revolut.retail.core.flow.FlowExtras;
import com.revolut.retail.core.navigation.feature.FeatureConfig;
import g3a.h;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import yhm.d;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/payments/who_to_transfer/api/who_to_transfer/navigation/WhoToTransferFeatureConfig;", "Lcom/revolut/retail/core/navigation/feature/FeatureConfig;", "<init>", "()V", "Transfer", "g3a/h", "Lcom/revolut/feature/payments/who_to_transfer/api/who_to_transfer/navigation/WhoToTransferFeatureConfig$Transfer;", "feature_payments_who_to_transfer_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@d
public abstract class WhoToTransferFeatureConfig implements FeatureConfig {
    private WhoToTransferFeatureConfig() {
    }

    /* JADX INFO: loaded from: classes5.dex */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/payments/who_to_transfer/api/who_to_transfer/navigation/WhoToTransferFeatureConfig$Transfer;", "Lcom/revolut/feature/payments/who_to_transfer/api/who_to_transfer/navigation/WhoToTransferFeatureConfig;", "", "toString", "()Ljava/lang/String;", "feature_payments_who_to_transfer_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Transfer extends WhoToTransferFeatureConfig {

        @NotNull
        public static final Parcelable.Creator<Transfer> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final WhoToTransferScreenMode f80050a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final WhoToTransferLaunchType f80051b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final h f80052c;
        public final TransferMoneyPocket d;
        public final FlowExtras e;
        public final boolean f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final AccountId f80053g;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Transfer((WhoToTransferScreenMode) parcel.readParcelable(Transfer.class.getClassLoader()), (WhoToTransferLaunchType) parcel.readParcelable(Transfer.class.getClassLoader()), h.valueOf(parcel.readString()), (TransferMoneyPocket) parcel.readParcelable(Transfer.class.getClassLoader()), (FlowExtras) parcel.readParcelable(Transfer.class.getClassLoader()), parcel.readInt() != 0, (AccountId) parcel.readParcelable(Transfer.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Transfer[i];
            }
        }

        public Transfer(WhoToTransferScreenMode screenMode, WhoToTransferLaunchType launchType, h clickAction, TransferMoneyPocket transferMoneyPocket, FlowExtras flowExtras, boolean z, AccountId accountId) {
            Intrinsics.checkNotNullParameter(screenMode, "screenMode");
            Intrinsics.checkNotNullParameter(launchType, "launchType");
            Intrinsics.checkNotNullParameter(clickAction, "clickAction");
            Intrinsics.checkNotNullParameter(accountId, "accountId");
            this.f80050a = screenMode;
            this.f80051b = launchType;
            this.f80052c = clickAction;
            this.d = transferMoneyPocket;
            this.e = flowExtras;
            this.f = z;
            this.f80053g = accountId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Transfer)) {
                return false;
            }
            Transfer transfer = (Transfer) obj2;
            return Intrinsics.f(this.f80050a, transfer.f80050a) && Intrinsics.f(this.f80051b, transfer.f80051b) && this.f80052c == transfer.f80052c && Intrinsics.f(this.d, transfer.d) && Intrinsics.f(this.e, transfer.e) && this.f == transfer.f && Intrinsics.f(this.f80053g, transfer.f80053g);
        }

        public final int hashCode() {
            int iHashCode = (this.f80052c.hashCode() + ((this.f80051b.hashCode() + (this.f80050a.hashCode() * 31)) * 31)) * 31;
            TransferMoneyPocket transferMoneyPocket = this.d;
            int iHashCode2 = (iHashCode + (transferMoneyPocket == null ? 0 : transferMoneyPocket.hashCode())) * 31;
            FlowExtras flowExtras = this.e;
            return this.f80053g.hashCode() + j6.a.c((iHashCode2 + (flowExtras != null ? flowExtras.hashCode() : 0)) * 31, 31, this.f);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f80050a, i);
            dest.writeParcelable(this.f80051b, i);
            dest.writeString(this.f80052c.name());
            dest.writeParcelable(this.d, i);
            dest.writeParcelable(this.e, i);
            dest.writeInt(this.f ? 1 : 0);
            dest.writeParcelable(this.f80053g, i);
        }

        public /* synthetic */ Transfer(WhoToTransferScreenMode whoToTransferScreenMode, h hVar, TransferMoneyPocket transferMoneyPocket, FlowExtras flowExtras, AccountId accountId, int i) {
            WhoToTransferLaunchType fullApp;
            if ((i & 2) != 0) {
                fullApp = new WhoToTransferLaunchType.FullApp(0);
            } else {
                fullApp = WhoToTransferLaunchType.Freelancer.f80006a;
            }
            this(whoToTransferScreenMode, fullApp, (i & 4) != 0 ? h.DEFAULT : hVar, (i & 8) != 0 ? null : transferMoneyPocket, (i & 16) != 0 ? null : flowExtras, false, (i & 64) != 0 ? AccountId.Personal.f51414a : accountId);
        }
    }
}
