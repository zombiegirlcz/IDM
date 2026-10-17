package com.revolut.feature.topup_screen.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.model.account.AccountId;
import dj0.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/topup_screen/api/model/CheckoutCustomAmountLimit;", "Landroid/os/Parcelable;", "Wallet", "Custom", "Lcom/revolut/feature/topup_screen/api/model/CheckoutCustomAmountLimit$Custom;", "Lcom/revolut/feature/topup_screen/api/model/CheckoutCustomAmountLimit$Wallet;", "feature_topup_screen_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface CheckoutCustomAmountLimit extends Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/topup_screen/api/model/CheckoutCustomAmountLimit$Custom;", "Lcom/revolut/feature/topup_screen/api/model/CheckoutCustomAmountLimit;", "", "toString", "()Ljava/lang/String;", "feature_topup_screen_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Custom implements CheckoutCustomAmountLimit {

        @NotNull
        public static final Parcelable.Creator<Custom> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final d f90526a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Custom((d) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Custom[i];
            }
        }

        public Custom(d limitAmount) {
            Intrinsics.checkNotNullParameter(limitAmount, "limitAmount");
            this.f90526a = limitAmount;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Custom) && Intrinsics.f(this.f90526a, ((Custom) obj2).f90526a);
        }

        public final int hashCode() {
            return this.f90526a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f90526a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/topup_screen/api/model/CheckoutCustomAmountLimit$Wallet;", "Lcom/revolut/feature/topup_screen/api/model/CheckoutCustomAmountLimit;", "", "toString", "()Ljava/lang/String;", "feature_topup_screen_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Wallet implements CheckoutCustomAmountLimit {

        @NotNull
        public static final Parcelable.Creator<Wallet> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final d f90527a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final AccountId f90528b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Wallet((d) parcel.readSerializable(), (AccountId) parcel.readParcelable(Wallet.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Wallet[i];
            }
        }

        public Wallet(d orderAmount, AccountId accountId) {
            Intrinsics.checkNotNullParameter(orderAmount, "orderAmount");
            Intrinsics.checkNotNullParameter(accountId, "accountId");
            this.f90527a = orderAmount;
            this.f90528b = accountId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Wallet)) {
                return false;
            }
            Wallet wallet = (Wallet) obj2;
            return Intrinsics.f(this.f90527a, wallet.f90527a) && Intrinsics.f(this.f90528b, wallet.f90528b);
        }

        public final int hashCode() {
            return this.f90528b.hashCode() + (this.f90527a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f90527a);
            dest.writeParcelable(this.f90528b, i);
        }
    }
}
