package com.revolut.feature.crypto_investments.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import dj0.d;
import io3.g;
import ip0.v7;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/crypto_investments/api/model/CombinedPocketsBalanceGroup;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_crypto_investments_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CombinedPocketsBalanceGroup implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<CombinedPocketsBalanceGroup> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f71376a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f71377b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f71378c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CombinedPocketsBalanceGroup((g) parcel.readSerializable(), (d) parcel.readSerializable(), (d) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CombinedPocketsBalanceGroup[i];
        }
    }

    public CombinedPocketsBalanceGroup(g pocketBalance, d balance, d dVar) {
        Intrinsics.checkNotNullParameter(pocketBalance, "pocketBalance");
        Intrinsics.checkNotNullParameter(balance, "balance");
        this.f71376a = pocketBalance;
        this.f71377b = balance;
        this.f71378c = dVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CombinedPocketsBalanceGroup)) {
            return false;
        }
        CombinedPocketsBalanceGroup combinedPocketsBalanceGroup = (CombinedPocketsBalanceGroup) obj2;
        return Intrinsics.f(this.f71376a, combinedPocketsBalanceGroup.f71376a) && Intrinsics.f(this.f71377b, combinedPocketsBalanceGroup.f71377b) && Intrinsics.f(this.f71378c, combinedPocketsBalanceGroup.f71378c);
    }

    public final int hashCode() {
        int iC = v7.c(this.f71376a.hashCode() * 31, 31, this.f71377b);
        d dVar = this.f71378c;
        return iC + (dVar == null ? 0 : dVar.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f71376a);
        dest.writeSerializable(this.f71377b);
        dest.writeSerializable(this.f71378c);
    }
}
