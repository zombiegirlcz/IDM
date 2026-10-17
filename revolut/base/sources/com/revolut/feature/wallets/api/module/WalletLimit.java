package com.revolut.feature.wallets.api.module;

import android.os.Parcel;
import android.os.Parcelable;
import dj0.d;
import ip0.v7;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/wallets/api/module/WalletLimit;", "Landroid/os/Parcelable;", "CounterLimit", "TransactionLimit", "Lcom/revolut/feature/wallets/api/module/WalletLimit$CounterLimit;", "Lcom/revolut/feature/wallets/api/module/WalletLimit$TransactionLimit;", "feature_wallets_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface WalletLimit extends Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u0005\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/wallets/api/module/WalletLimit$CounterLimit;", "Lcom/revolut/feature/wallets/api/module/WalletLimit;", "", "toString", "()Ljava/lang/String;", "com/revolut/feature/wallets/api/module/a", "com/revolut/feature/wallets/api/module/b", "feature_wallets_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CounterLimit implements WalletLimit {

        @NotNull
        public static final Parcelable.Creator<CounterLimit> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final com.revolut.feature.wallets.api.module.a f94844a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final b f94845b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final d f94846c;
        public final d d;
        public final d e;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CounterLimit(com.revolut.feature.wallets.api.module.a.valueOf(parcel.readString()), b.valueOf(parcel.readString()), (d) parcel.readSerializable(), (d) parcel.readSerializable(), (d) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CounterLimit[i];
            }
        }

        public CounterLimit(com.revolut.feature.wallets.api.module.a name, b counterType, d currentValue, d dVar, d maxValue) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(counterType, "counterType");
            Intrinsics.checkNotNullParameter(currentValue, "currentValue");
            Intrinsics.checkNotNullParameter(maxValue, "maxValue");
            this.f94844a = name;
            this.f94845b = counterType;
            this.f94846c = currentValue;
            this.d = dVar;
            this.e = maxValue;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof CounterLimit)) {
                return false;
            }
            CounterLimit counterLimit = (CounterLimit) obj2;
            return this.f94844a == counterLimit.f94844a && this.f94845b == counterLimit.f94845b && Intrinsics.f(this.f94846c, counterLimit.f94846c) && Intrinsics.f(this.d, counterLimit.d) && Intrinsics.f(this.e, counterLimit.e);
        }

        public final int hashCode() {
            int iC = v7.c((this.f94845b.hashCode() + (this.f94844a.hashCode() * 31)) * 31, 31, this.f94846c);
            d dVar = this.d;
            return this.e.hashCode() + ((iC + (dVar == null ? 0 : dVar.hashCode())) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f94844a.name());
            dest.writeString(this.f94845b.name());
            dest.writeSerializable(this.f94846c);
            dest.writeSerializable(this.d);
            dest.writeSerializable(this.e);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/wallets/api/module/WalletLimit$TransactionLimit;", "Lcom/revolut/feature/wallets/api/module/WalletLimit;", "", "toString", "()Ljava/lang/String;", "com/revolut/feature/wallets/api/module/c", "feature_wallets_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class TransactionLimit implements WalletLimit {

        @NotNull
        public static final Parcelable.Creator<TransactionLimit> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final c f94847a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final d f94848b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new TransactionLimit(c.valueOf(parcel.readString()), (d) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new TransactionLimit[i];
            }
        }

        public TransactionLimit(c name, d maxValue) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(maxValue, "maxValue");
            this.f94847a = name;
            this.f94848b = maxValue;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof TransactionLimit)) {
                return false;
            }
            TransactionLimit transactionLimit = (TransactionLimit) obj2;
            return this.f94847a == transactionLimit.f94847a && Intrinsics.f(this.f94848b, transactionLimit.f94848b);
        }

        public final int hashCode() {
            return this.f94848b.hashCode() + (this.f94847a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f94847a.name());
            dest.writeSerializable(this.f94848b);
        }
    }
}
