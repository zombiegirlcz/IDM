package com.revolut.feature_crypto_order_flow.api.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.staking.api.model.StakingProduct;
import io3.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature_crypto_order_flow/api/models/AutoStakingData;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_crypto_order_flow_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class AutoStakingData implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<AutoStakingData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final StakingProduct f96709a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Boolean f96710b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f96711c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            StakingProduct stakingProduct = (StakingProduct) parcel.readParcelable(AutoStakingData.class.getClassLoader());
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new AutoStakingData(stakingProduct, boolValueOf, (d) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AutoStakingData[i];
        }
    }

    public AutoStakingData(StakingProduct stakingProduct, Boolean bool, d dVar) {
        this.f96709a = stakingProduct;
        this.f96710b = bool;
        this.f96711c = dVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof AutoStakingData)) {
            return false;
        }
        AutoStakingData autoStakingData = (AutoStakingData) obj2;
        return Intrinsics.f(this.f96709a, autoStakingData.f96709a) && Intrinsics.f(this.f96710b, autoStakingData.f96710b) && Intrinsics.f(this.f96711c, autoStakingData.f96711c);
    }

    public final int hashCode() {
        StakingProduct stakingProduct = this.f96709a;
        int iHashCode = (stakingProduct == null ? 0 : stakingProduct.hashCode()) * 31;
        Boolean bool = this.f96710b;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        d dVar = this.f96711c;
        return iHashCode2 + (dVar != null ? dVar.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f96709a, i);
        Boolean bool = this.f96710b;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            p.a.A(dest, 1, bool);
        }
        dest.writeSerializable(this.f96711c);
    }
}
