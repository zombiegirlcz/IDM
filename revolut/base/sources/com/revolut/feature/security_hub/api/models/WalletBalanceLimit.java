package com.revolut.feature.security_hub.api.models;

import android.os.Parcel;
import android.os.Parcelable;
import dj0.d;
import ip0.v7;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/security_hub/api/models/WalletBalanceLimit;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_security_hub_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class WalletBalanceLimit implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<WalletBalanceLimit> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f85434a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f85435b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f85436c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new WalletBalanceLimit((d) parcel.readSerializable(), (d) parcel.readSerializable(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new WalletBalanceLimit[i];
        }
    }

    public WalletBalanceLimit(d currentValue, d maxValue, boolean z) {
        Intrinsics.checkNotNullParameter(currentValue, "currentValue");
        Intrinsics.checkNotNullParameter(maxValue, "maxValue");
        this.f85434a = currentValue;
        this.f85435b = maxValue;
        this.f85436c = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof WalletBalanceLimit)) {
            return false;
        }
        WalletBalanceLimit walletBalanceLimit = (WalletBalanceLimit) obj2;
        return Intrinsics.f(this.f85434a, walletBalanceLimit.f85434a) && Intrinsics.f(this.f85435b, walletBalanceLimit.f85435b) && this.f85436c == walletBalanceLimit.f85436c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f85436c) + v7.c(this.f85434a.hashCode() * 31, 31, this.f85435b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f85434a);
        dest.writeSerializable(this.f85435b);
        dest.writeInt(this.f85436c ? 1 : 0);
    }
}
