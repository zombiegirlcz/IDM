package com.revolut.feature.checkout.add_money_methods.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.domain.models.topup.methods.TopupMethod;
import com.revolut.feature_move_money.api.model.AccountWrapper;
import com.revolut.retail.feature.balance.picker.api.models.BalanceWrapper;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/feature/checkout/add_money_methods/api/model/AddMoneyMethod;", "Landroid/os/Parcelable;", "<init>", "()V", "MoveMoney", "TopUp", "Lcom/revolut/feature/checkout/add_money_methods/api/model/AddMoneyMethod$MoveMoney;", "Lcom/revolut/feature/checkout/add_money_methods/api/model/AddMoneyMethod$TopUp;", "feature_checkout_add_money_methods_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class AddMoneyMethod implements Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/checkout/add_money_methods/api/model/AddMoneyMethod$MoveMoney;", "Lcom/revolut/feature/checkout/add_money_methods/api/model/AddMoneyMethod;", "", "toString", "()Ljava/lang/String;", "feature_checkout_add_money_methods_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class MoveMoney extends AddMoneyMethod {

        @NotNull
        public static final Parcelable.Creator<MoveMoney> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final BalanceWrapper f65825a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final AccountWrapper f65826b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new MoveMoney((BalanceWrapper) parcel.readParcelable(MoveMoney.class.getClassLoader()), (AccountWrapper) parcel.readParcelable(MoveMoney.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new MoveMoney[i];
            }
        }

        public MoveMoney(BalanceWrapper balance, AccountWrapper sourceAccount) {
            Intrinsics.checkNotNullParameter(balance, "balance");
            Intrinsics.checkNotNullParameter(sourceAccount, "sourceAccount");
            this.f65825a = balance;
            this.f65826b = sourceAccount;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof MoveMoney)) {
                return false;
            }
            MoveMoney moveMoney = (MoveMoney) obj2;
            return Intrinsics.f(this.f65825a, moveMoney.f65825a) && Intrinsics.f(this.f65826b, moveMoney.f65826b);
        }

        public final int hashCode() {
            return this.f65826b.hashCode() + (this.f65825a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f65825a, i);
            dest.writeParcelable(this.f65826b, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/checkout/add_money_methods/api/model/AddMoneyMethod$TopUp;", "Lcom/revolut/feature/checkout/add_money_methods/api/model/AddMoneyMethod;", "", "toString", "()Ljava/lang/String;", "feature_checkout_add_money_methods_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class TopUp extends AddMoneyMethod {

        @NotNull
        public static final Parcelable.Creator<TopUp> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TopupMethod f65827a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new TopUp((TopupMethod) parcel.readParcelable(TopUp.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new TopUp[i];
            }
        }

        public TopUp(TopupMethod topUpMethod) {
            Intrinsics.checkNotNullParameter(topUpMethod, "topUpMethod");
            this.f65827a = topUpMethod;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof TopUp) && Intrinsics.f(this.f65827a, ((TopUp) obj2).f65827a);
        }

        public final int hashCode() {
            return this.f65827a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f65827a, i);
        }
    }

    private AddMoneyMethod() {
    }
}
