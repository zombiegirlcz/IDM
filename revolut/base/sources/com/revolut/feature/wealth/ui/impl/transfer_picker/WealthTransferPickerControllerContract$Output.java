package com.revolut.feature.wealth.ui.impl.transfer_picker;

import aii.r;
import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.wealth.api.domain.model.WealthAccount;
import com.revolut.feature.wealth.ui.impl.transfer_picker.WealthTransferPickerControllerContract$TransferAccount;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u00012\u00020\u0002:\u0004\u0003\u0004\u0005\u0006\u0082\u0001\u0004\u0007\b\t\n¨\u0006\u000bÀ\u0006\u0003"}, d2 = {"com/revolut/feature/wealth/ui/impl/transfer_picker/WealthTransferPickerControllerContract$Output", "Laii/r;", "Landroid/os/Parcelable;", "StocksTransfer", "TaxAdvantageTransfer", "RoboTransfer", "MarginTransfer", "Lcom/revolut/feature/wealth/ui/impl/transfer_picker/WealthTransferPickerControllerContract$Output$MarginTransfer;", "Lcom/revolut/feature/wealth/ui/impl/transfer_picker/WealthTransferPickerControllerContract$Output$RoboTransfer;", "Lcom/revolut/feature/wealth/ui/impl/transfer_picker/WealthTransferPickerControllerContract$Output$StocksTransfer;", "Lcom/revolut/feature/wealth/ui/impl/transfer_picker/WealthTransferPickerControllerContract$Output$TaxAdvantageTransfer;", "feature_wealth_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface WealthTransferPickerControllerContract$Output extends r, Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/wealth/ui/impl/transfer_picker/WealthTransferPickerControllerContract$Output$MarginTransfer;", "Lcom/revolut/feature/wealth/ui/impl/transfer_picker/WealthTransferPickerControllerContract$Output;", "", "toString", "()Ljava/lang/String;", "feature_wealth_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class MarginTransfer implements WealthTransferPickerControllerContract$Output {

        @NotNull
        public static final Parcelable.Creator<MarginTransfer> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final WealthTransferPickerControllerContract$TransferAccount.Margin f96061a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new MarginTransfer(WealthTransferPickerControllerContract$TransferAccount.Margin.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new MarginTransfer[i];
            }
        }

        public MarginTransfer(WealthTransferPickerControllerContract$TransferAccount.Margin transferAccount) {
            Intrinsics.checkNotNullParameter(transferAccount, "transferAccount");
            this.f96061a = transferAccount;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof MarginTransfer) && Intrinsics.f(this.f96061a, ((MarginTransfer) obj2).f96061a);
        }

        public final int hashCode() {
            return this.f96061a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f96061a.writeToParcel(dest, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/wealth/ui/impl/transfer_picker/WealthTransferPickerControllerContract$Output$RoboTransfer;", "Lcom/revolut/feature/wealth/ui/impl/transfer_picker/WealthTransferPickerControllerContract$Output;", "", "toString", "()Ljava/lang/String;", "feature_wealth_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class RoboTransfer implements WealthTransferPickerControllerContract$Output {

        @NotNull
        public static final Parcelable.Creator<RoboTransfer> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final WealthTransferPickerControllerContract$TransferAccount.Robo f96062a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new RoboTransfer(WealthTransferPickerControllerContract$TransferAccount.Robo.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new RoboTransfer[i];
            }
        }

        public RoboTransfer(WealthTransferPickerControllerContract$TransferAccount.Robo transferAccount) {
            Intrinsics.checkNotNullParameter(transferAccount, "transferAccount");
            this.f96062a = transferAccount;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof RoboTransfer) && Intrinsics.f(this.f96062a, ((RoboTransfer) obj2).f96062a);
        }

        public final int hashCode() {
            return this.f96062a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f96062a.writeToParcel(dest, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/wealth/ui/impl/transfer_picker/WealthTransferPickerControllerContract$Output$StocksTransfer;", "Lcom/revolut/feature/wealth/ui/impl/transfer_picker/WealthTransferPickerControllerContract$Output;", "", "toString", "()Ljava/lang/String;", "feature_wealth_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class StocksTransfer implements WealthTransferPickerControllerContract$Output {

        @NotNull
        public static final Parcelable.Creator<StocksTransfer> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f96063a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final kel.b f96064b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new StocksTransfer(parcel.readString(), (kel.b) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new StocksTransfer[i];
            }
        }

        public StocksTransfer(String portfolioId, kel.b cashHolding) {
            Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
            Intrinsics.checkNotNullParameter(cashHolding, "cashHolding");
            this.f96063a = portfolioId;
            this.f96064b = cashHolding;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof StocksTransfer)) {
                return false;
            }
            StocksTransfer stocksTransfer = (StocksTransfer) obj2;
            return Intrinsics.f(this.f96063a, stocksTransfer.f96063a) && Intrinsics.f(this.f96064b, stocksTransfer.f96064b);
        }

        public final int hashCode() {
            return this.f96064b.hashCode() + (this.f96063a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f96063a);
            dest.writeSerializable(this.f96064b);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/wealth/ui/impl/transfer_picker/WealthTransferPickerControllerContract$Output$TaxAdvantageTransfer;", "Lcom/revolut/feature/wealth/ui/impl/transfer_picker/WealthTransferPickerControllerContract$Output;", "", "toString", "()Ljava/lang/String;", "feature_wealth_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class TaxAdvantageTransfer implements WealthTransferPickerControllerContract$Output {

        @NotNull
        public static final Parcelable.Creator<TaxAdvantageTransfer> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final WealthAccount.TaxAdvantageWealthAccount f96065a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f96066b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final kel.b f96067c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new TaxAdvantageTransfer((WealthAccount.TaxAdvantageWealthAccount) parcel.readParcelable(TaxAdvantageTransfer.class.getClassLoader()), parcel.readString(), (kel.b) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new TaxAdvantageTransfer[i];
            }
        }

        public TaxAdvantageTransfer(WealthAccount.TaxAdvantageWealthAccount account, String portfolioId, kel.b cashHolding) {
            Intrinsics.checkNotNullParameter(account, "account");
            Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
            Intrinsics.checkNotNullParameter(cashHolding, "cashHolding");
            this.f96065a = account;
            this.f96066b = portfolioId;
            this.f96067c = cashHolding;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof TaxAdvantageTransfer)) {
                return false;
            }
            TaxAdvantageTransfer taxAdvantageTransfer = (TaxAdvantageTransfer) obj2;
            return Intrinsics.f(this.f96065a, taxAdvantageTransfer.f96065a) && Intrinsics.f(this.f96066b, taxAdvantageTransfer.f96066b) && Intrinsics.f(this.f96067c, taxAdvantageTransfer.f96067c);
        }

        public final int hashCode() {
            return this.f96067c.hashCode() + p.a.c(this.f96065a.hashCode() * 31, 31, this.f96066b);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f96065a, i);
            dest.writeString(this.f96066b);
            dest.writeSerializable(this.f96067c);
        }
    }
}
