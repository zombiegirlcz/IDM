package com.revolut.feature.subscriptions.impl.payment_balance_picker;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"com/revolut/feature/subscriptions/impl/payment_balance_picker/PaymentBalancePickerScreenContract$SelectedBalanceInfo", "Landroid/os/Parcelable;", "Undefined", "AllCashAccounts", "Balance", "Lcom/revolut/feature/subscriptions/impl/payment_balance_picker/PaymentBalancePickerScreenContract$SelectedBalanceInfo$AllCashAccounts;", "Lcom/revolut/feature/subscriptions/impl/payment_balance_picker/PaymentBalancePickerScreenContract$SelectedBalanceInfo$Balance;", "Lcom/revolut/feature/subscriptions/impl/payment_balance_picker/PaymentBalancePickerScreenContract$SelectedBalanceInfo$Undefined;", "feature_cards_subscriptions_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface PaymentBalancePickerScreenContract$SelectedBalanceInfo extends Parcelable {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/subscriptions/impl/payment_balance_picker/PaymentBalancePickerScreenContract$SelectedBalanceInfo$AllCashAccounts;", "Lcom/revolut/feature/subscriptions/impl/payment_balance_picker/PaymentBalancePickerScreenContract$SelectedBalanceInfo;", "<init>", "()V", "feature_cards_subscriptions_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class AllCashAccounts implements PaymentBalancePickerScreenContract$SelectedBalanceInfo {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final AllCashAccounts f89223a = new AllCashAccounts();

        @NotNull
        public static final Parcelable.Creator<AllCashAccounts> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return AllCashAccounts.f89223a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AllCashAccounts[i];
            }
        }

        private AllCashAccounts() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/subscriptions/impl/payment_balance_picker/PaymentBalancePickerScreenContract$SelectedBalanceInfo$Balance;", "Lcom/revolut/feature/subscriptions/impl/payment_balance_picker/PaymentBalancePickerScreenContract$SelectedBalanceInfo;", "", "toString", "()Ljava/lang/String;", "feature_cards_subscriptions_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Balance implements PaymentBalancePickerScreenContract$SelectedBalanceInfo {

        @NotNull
        public static final Parcelable.Creator<Balance> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f89224a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f89225b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f89226c;
        public final String d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Balance(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Balance[i];
            }
        }

        public Balance(String id10, String displayedName, String currencyCode, boolean z) {
            Intrinsics.checkNotNullParameter(id10, "id");
            Intrinsics.checkNotNullParameter(displayedName, "displayedName");
            Intrinsics.checkNotNullParameter(currencyCode, "currencyCode");
            this.f89224a = id10;
            this.f89225b = displayedName;
            this.f89226c = z;
            this.d = currencyCode;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Balance)) {
                return false;
            }
            Balance balance = (Balance) obj2;
            return Intrinsics.f(this.f89224a, balance.f89224a) && Intrinsics.f(this.f89225b, balance.f89225b) && this.f89226c == balance.f89226c && Intrinsics.f(this.d, balance.d);
        }

        public final int hashCode() {
            return this.d.hashCode() + j6.a.c(p.a.c(this.f89224a.hashCode() * 31, 31, this.f89225b), 31, this.f89226c);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f89224a);
            dest.writeString(this.f89225b);
            dest.writeInt(this.f89226c ? 1 : 0);
            dest.writeString(this.d);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/subscriptions/impl/payment_balance_picker/PaymentBalancePickerScreenContract$SelectedBalanceInfo$Undefined;", "Lcom/revolut/feature/subscriptions/impl/payment_balance_picker/PaymentBalancePickerScreenContract$SelectedBalanceInfo;", "<init>", "()V", "feature_cards_subscriptions_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Undefined implements PaymentBalancePickerScreenContract$SelectedBalanceInfo {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Undefined f89227a = new Undefined();

        @NotNull
        public static final Parcelable.Creator<Undefined> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Undefined.f89227a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Undefined[i];
            }
        }

        private Undefined() {
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
}
