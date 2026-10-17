package com.revolut.shared.feature.market_data.models.domain.models;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0001\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/revolut/shared/feature/market_data/models/domain/models/Charges;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "feature_shared_market_data_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class Charges implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChargeBreakdown f104731a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ChargeBreakdown f104732b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ChargeBreakdown f104733c;

    @NotNull
    public static final Parcelable.Creator<Charges> CREATOR = new b();

    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            Parcelable.Creator<ChargeBreakdown> creator = ChargeBreakdown.CREATOR;
            return new Charges(creator.createFromParcel(parcel), creator.createFromParcel(parcel), parcel.readInt() == 0 ? null : creator.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new Charges[i];
        }
    }

    public Charges(ChargeBreakdown fees, ChargeBreakdown taxes, ChargeBreakdown chargeBreakdown) {
        Intrinsics.checkNotNullParameter(fees, "fees");
        Intrinsics.checkNotNullParameter(taxes, "taxes");
        this.f104731a = fees;
        this.f104732b = taxes;
        this.f104733c = chargeBreakdown;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof Charges)) {
            return false;
        }
        Charges charges = (Charges) obj2;
        return Intrinsics.f(this.f104731a, charges.f104731a) && Intrinsics.f(this.f104732b, charges.f104732b) && Intrinsics.f(this.f104733c, charges.f104733c);
    }

    public final int hashCode() {
        int iHashCode = (this.f104732b.hashCode() + (this.f104731a.hashCode() * 31)) * 31;
        ChargeBreakdown chargeBreakdown = this.f104733c;
        return iHashCode + (chargeBreakdown == null ? 0 : chargeBreakdown.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        this.f104731a.writeToParcel(dest, i);
        this.f104732b.writeToParcel(dest, i);
        ChargeBreakdown chargeBreakdown = this.f104733c;
        if (chargeBreakdown == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            chargeBreakdown.writeToParcel(dest, i);
        }
    }
}
