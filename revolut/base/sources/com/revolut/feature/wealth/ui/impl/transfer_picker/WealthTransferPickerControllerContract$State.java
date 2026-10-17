package com.revolut.feature.wealth.ui.impl.transfer_picker;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.wealth.api.domain.model.WealthAccount;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"com/revolut/feature/wealth/ui/impl/transfer_picker/WealthTransferPickerControllerContract$State", "Landroid/os/Parcelable;", "ProductChooser", "CashHoldingChooser", "Lcom/revolut/feature/wealth/ui/impl/transfer_picker/WealthTransferPickerControllerContract$State$CashHoldingChooser;", "Lcom/revolut/feature/wealth/ui/impl/transfer_picker/WealthTransferPickerControllerContract$State$ProductChooser;", "feature_wealth_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface WealthTransferPickerControllerContract$State extends Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/wealth/ui/impl/transfer_picker/WealthTransferPickerControllerContract$State$CashHoldingChooser;", "Lcom/revolut/feature/wealth/ui/impl/transfer_picker/WealthTransferPickerControllerContract$State;", "", "toString", "()Ljava/lang/String;", "feature_wealth_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CashHoldingChooser implements WealthTransferPickerControllerContract$State {

        @NotNull
        public static final Parcelable.Creator<CashHoldingChooser> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List f96068a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f96069b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final WealthAccount f96070c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iE = 0;
                while (iE != i) {
                    iE = j6.a.e(CashHoldingChooser.class, parcel, arrayList, iE, 1);
                }
                return new CashHoldingChooser(arrayList, parcel.readString(), (WealthAccount) parcel.readParcelable(CashHoldingChooser.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CashHoldingChooser[i];
            }
        }

        public CashHoldingChooser(List cashHoldingsAvailability, String portfolioId, WealthAccount account) {
            Intrinsics.checkNotNullParameter(cashHoldingsAvailability, "cashHoldingsAvailability");
            Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
            Intrinsics.checkNotNullParameter(account, "account");
            this.f96068a = cashHoldingsAvailability;
            this.f96069b = portfolioId;
            this.f96070c = account;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof CashHoldingChooser)) {
                return false;
            }
            CashHoldingChooser cashHoldingChooser = (CashHoldingChooser) obj2;
            return Intrinsics.f(this.f96068a, cashHoldingChooser.f96068a) && Intrinsics.f(this.f96069b, cashHoldingChooser.f96069b) && Intrinsics.f(this.f96070c, cashHoldingChooser.f96070c);
        }

        public final int hashCode() {
            return this.f96070c.hashCode() + p.a.c(this.f96068a.hashCode() * 31, 31, this.f96069b);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            Iterator itV = p.a.v(this.f96068a, dest);
            while (itV.hasNext()) {
                dest.writeParcelable((Parcelable) itV.next(), i);
            }
            dest.writeString(this.f96069b);
            dest.writeParcelable(this.f96070c, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/wealth/ui/impl/transfer_picker/WealthTransferPickerControllerContract$State$ProductChooser;", "Lcom/revolut/feature/wealth/ui/impl/transfer_picker/WealthTransferPickerControllerContract$State;", "", "toString", "()Ljava/lang/String;", "feature_wealth_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ProductChooser implements WealthTransferPickerControllerContract$State {

        @NotNull
        public static final Parcelable.Creator<ProductChooser> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List f96071a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iE = 0;
                while (iE != i) {
                    iE = j6.a.e(ProductChooser.class, parcel, arrayList, iE, 1);
                }
                return new ProductChooser(arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ProductChooser[i];
            }
        }

        public ProductChooser(List accountsForTransfer) {
            Intrinsics.checkNotNullParameter(accountsForTransfer, "accountsForTransfer");
            this.f96071a = accountsForTransfer;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof ProductChooser) && Intrinsics.f(this.f96071a, ((ProductChooser) obj2).f96071a);
        }

        public final int hashCode() {
            return this.f96071a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            Iterator itV = p.a.v(this.f96071a, dest);
            while (itV.hasNext()) {
                dest.writeParcelable((Parcelable) itV.next(), i);
            }
        }
    }
}
