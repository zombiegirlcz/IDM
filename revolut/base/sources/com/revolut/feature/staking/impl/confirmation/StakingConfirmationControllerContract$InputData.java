package com.revolut.feature.staking.impl.confirmation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.staking.api.model.StakingPocket;
import com.revolut.feature.staking.api.model.StakingProduct;
import com.revolut.kompot.common.IOData$Input;
import dj0.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/staking/impl/confirmation/StakingConfirmationControllerContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_staking_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class StakingConfirmationControllerContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<StakingConfirmationControllerContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f88106a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f88107b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final StakingPocket f88108c;
    public final StakingProduct d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new StakingConfirmationControllerContract$InputData((d) parcel.readSerializable(), parcel.readString(), (StakingPocket) parcel.readParcelable(StakingConfirmationControllerContract$InputData.class.getClassLoader()), (StakingProduct) parcel.readParcelable(StakingConfirmationControllerContract$InputData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new StakingConfirmationControllerContract$InputData[i];
        }
    }

    public StakingConfirmationControllerContract$InputData(d amount, String sourcePocketId, StakingPocket stakingPocket, StakingProduct stakingProduct) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(sourcePocketId, "sourcePocketId");
        Intrinsics.checkNotNullParameter(stakingProduct, "stakingProduct");
        this.f88106a = amount;
        this.f88107b = sourcePocketId;
        this.f88108c = stakingPocket;
        this.d = stakingProduct;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof StakingConfirmationControllerContract$InputData)) {
            return false;
        }
        StakingConfirmationControllerContract$InputData stakingConfirmationControllerContract$InputData = (StakingConfirmationControllerContract$InputData) obj2;
        return Intrinsics.f(this.f88106a, stakingConfirmationControllerContract$InputData.f88106a) && Intrinsics.f(this.f88107b, stakingConfirmationControllerContract$InputData.f88107b) && Intrinsics.f(this.f88108c, stakingConfirmationControllerContract$InputData.f88108c) && Intrinsics.f(this.d, stakingConfirmationControllerContract$InputData.d);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f88106a.hashCode() * 31, 31, this.f88107b);
        StakingPocket stakingPocket = this.f88108c;
        return this.d.hashCode() + ((iC + (stakingPocket == null ? 0 : stakingPocket.hashCode())) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f88106a);
        dest.writeString(this.f88107b);
        dest.writeParcelable(this.f88108c, i);
        dest.writeParcelable(this.d, i);
    }
}
