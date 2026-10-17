package com.revolut.feature.transactions.impl.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.shared.feature.market_data.models.domain.models.ChargeBreakdown;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import tof.a3;
import xi0.b;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/transactions/impl/model/FeeBreakdownNavigation;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "retail_feature_transactions_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class FeeBreakdownNavigation implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<FeeBreakdownNavigation> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a3 f92037a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ChargeBreakdown f92038b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f92039c;
    public final boolean d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new FeeBreakdownNavigation((a3) parcel.readSerializable(), (ChargeBreakdown) parcel.readParcelable(FeeBreakdownNavigation.class.getClassLoader()), (b) parcel.readSerializable(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new FeeBreakdownNavigation[i];
        }
    }

    public FeeBreakdownNavigation(a3 transaction, ChargeBreakdown chargeBreakdown, b bVar, boolean z) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        this.f92037a = transaction;
        this.f92038b = chargeBreakdown;
        this.f92039c = bVar;
        this.d = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof FeeBreakdownNavigation)) {
            return false;
        }
        FeeBreakdownNavigation feeBreakdownNavigation = (FeeBreakdownNavigation) obj2;
        return Intrinsics.f(this.f92037a, feeBreakdownNavigation.f92037a) && Intrinsics.f(this.f92038b, feeBreakdownNavigation.f92038b) && Intrinsics.f(this.f92039c, feeBreakdownNavigation.f92039c) && this.d == feeBreakdownNavigation.d;
    }

    public final int hashCode() {
        int iHashCode = this.f92037a.hashCode() * 31;
        ChargeBreakdown chargeBreakdown = this.f92038b;
        int iHashCode2 = (iHashCode + (chargeBreakdown == null ? 0 : chargeBreakdown.hashCode())) * 31;
        b bVar = this.f92039c;
        return Boolean.hashCode(this.d) + ((iHashCode2 + (bVar != null ? bVar.hashCode() : 0)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f92037a);
        dest.writeParcelable(this.f92038b, i);
        dest.writeSerializable(this.f92039c);
        dest.writeInt(this.d ? 1 : 0);
    }
}
