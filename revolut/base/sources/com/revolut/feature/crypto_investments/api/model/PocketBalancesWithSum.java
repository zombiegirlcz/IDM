package com.revolut.feature.crypto_investments.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import dj0.d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/crypto_investments/api/model/PocketBalancesWithSum;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_crypto_investments_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PocketBalancesWithSum implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<PocketBalancesWithSum> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f71384a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f71385b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iA = 0;
            while (iA != i) {
                iA = org.bouncycastle.jcajce.provider.digest.a.a(CombinedPocketsBalance.CREATOR, parcel, arrayList, iA, 1);
            }
            return new PocketBalancesWithSum(arrayList, (d) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PocketBalancesWithSum[i];
        }
    }

    public PocketBalancesWithSum(List pocketBalances, d sum) {
        Intrinsics.checkNotNullParameter(pocketBalances, "pocketBalances");
        Intrinsics.checkNotNullParameter(sum, "sum");
        this.f71384a = pocketBalances;
        this.f71385b = sum;
    }

    public static PocketBalancesWithSum a(PocketBalancesWithSum pocketBalancesWithSum, List pocketBalances) {
        d sum = pocketBalancesWithSum.f71385b;
        pocketBalancesWithSum.getClass();
        Intrinsics.checkNotNullParameter(pocketBalances, "pocketBalances");
        Intrinsics.checkNotNullParameter(sum, "sum");
        return new PocketBalancesWithSum(pocketBalances, sum);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof PocketBalancesWithSum)) {
            return false;
        }
        PocketBalancesWithSum pocketBalancesWithSum = (PocketBalancesWithSum) obj2;
        return Intrinsics.f(this.f71384a, pocketBalancesWithSum.f71384a) && Intrinsics.f(this.f71385b, pocketBalancesWithSum.f71385b);
    }

    public final int hashCode() {
        return this.f71385b.hashCode() + (this.f71384a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Iterator itV = p.a.v(this.f71384a, dest);
        while (itV.hasNext()) {
            ((CombinedPocketsBalance) itV.next()).writeToParcel(dest, i);
        }
        dest.writeSerializable(this.f71385b);
    }
}
