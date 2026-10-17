package com.revolut.shared.feature.market_data.models.domain.models;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/shared/feature/market_data/models/domain/models/ChargeBreakdown;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_shared_market_data_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ChargeBreakdown implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<ChargeBreakdown> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Amount f104722a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f104723b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Amount f104724c;
    public final Amount d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            Amount amountCreateFromParcel = Amount.CREATOR.createFromParcel(parcel);
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iA = 0;
            while (iA != i) {
                iA = org.bouncycastle.jcajce.provider.digest.a.a(ChargeEntry.CREATOR, parcel, arrayList, iA, 1);
            }
            return new ChargeBreakdown(amountCreateFromParcel, arrayList, parcel.readInt() == 0 ? null : Amount.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? Amount.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ChargeBreakdown[i];
        }
    }

    public ChargeBreakdown(Amount total, List breakdown, Amount amount, Amount amount2) {
        Intrinsics.checkNotNullParameter(total, "total");
        Intrinsics.checkNotNullParameter(breakdown, "breakdown");
        this.f104722a = total;
        this.f104723b = breakdown;
        this.f104724c = amount;
        this.d = amount2;
    }

    public static ChargeBreakdown a(ChargeBreakdown chargeBreakdown, Amount total, ArrayList arrayList, Amount amount, int i) {
        if ((i & 1) != 0) {
            total = chargeBreakdown.f104722a;
        }
        List breakdown = arrayList;
        if ((i & 2) != 0) {
            breakdown = chargeBreakdown.f104723b;
        }
        if ((i & 4) != 0) {
            amount = chargeBreakdown.f104724c;
        }
        Amount amount2 = chargeBreakdown.d;
        chargeBreakdown.getClass();
        Intrinsics.checkNotNullParameter(total, "total");
        Intrinsics.checkNotNullParameter(breakdown, "breakdown");
        return new ChargeBreakdown(total, breakdown, amount, amount2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ChargeBreakdown)) {
            return false;
        }
        ChargeBreakdown chargeBreakdown = (ChargeBreakdown) obj2;
        return Intrinsics.f(this.f104722a, chargeBreakdown.f104722a) && Intrinsics.f(this.f104723b, chargeBreakdown.f104723b) && Intrinsics.f(this.f104724c, chargeBreakdown.f104724c) && Intrinsics.f(this.d, chargeBreakdown.d);
    }

    public final int hashCode() {
        int iD = p.a.d(this.f104722a.hashCode() * 31, 31, this.f104723b);
        Amount amount = this.f104724c;
        int iHashCode = (iD + (amount == null ? 0 : amount.hashCode())) * 31;
        Amount amount2 = this.d;
        return iHashCode + (amount2 != null ? amount2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        this.f104722a.writeToParcel(dest, i);
        Iterator itV = p.a.v(this.f104723b, dest);
        while (itV.hasNext()) {
            ((ChargeEntry) itV.next()).writeToParcel(dest, i);
        }
        Amount amount = this.f104724c;
        if (amount == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            amount.writeToParcel(dest, i);
        }
        Amount amount2 = this.d;
        if (amount2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            amount2.writeToParcel(dest, i);
        }
    }

    public /* synthetic */ ChargeBreakdown(Amount amount, List list, Amount amount2, int i) {
        this(amount, list, (i & 4) != 0 ? null : amount2, (Amount) null);
    }
}
