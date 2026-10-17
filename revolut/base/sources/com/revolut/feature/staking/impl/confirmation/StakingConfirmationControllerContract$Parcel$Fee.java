package com.revolut.feature.staking.impl.confirmation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.shared.feature.market_data.models.domain.models.ChargeBreakdown;
import com.revolut.shared.feature.market_data.models.domain.models.LegacyOrderQuoteParams;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/staking/impl/confirmation/StakingConfirmationControllerContract$Parcel$Fee", "", "", "toString", "()Ljava/lang/String;", "feature_staking_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class StakingConfirmationControllerContract$Parcel$Fee implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<StakingConfirmationControllerContract$Parcel$Fee> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LegacyOrderQuoteParams f88110a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ChargeBreakdown f88111b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new StakingConfirmationControllerContract$Parcel$Fee((LegacyOrderQuoteParams) parcel.readParcelable(StakingConfirmationControllerContract$Parcel$Fee.class.getClassLoader()), (ChargeBreakdown) parcel.readParcelable(StakingConfirmationControllerContract$Parcel$Fee.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new StakingConfirmationControllerContract$Parcel$Fee[i];
        }
    }

    public StakingConfirmationControllerContract$Parcel$Fee(LegacyOrderQuoteParams quoteParams, ChargeBreakdown feeBreakdown) {
        Intrinsics.checkNotNullParameter(quoteParams, "quoteParams");
        Intrinsics.checkNotNullParameter(feeBreakdown, "feeBreakdown");
        this.f88110a = quoteParams;
        this.f88111b = feeBreakdown;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof StakingConfirmationControllerContract$Parcel$Fee)) {
            return false;
        }
        StakingConfirmationControllerContract$Parcel$Fee stakingConfirmationControllerContract$Parcel$Fee = (StakingConfirmationControllerContract$Parcel$Fee) obj2;
        return Intrinsics.f(this.f88110a, stakingConfirmationControllerContract$Parcel$Fee.f88110a) && Intrinsics.f(this.f88111b, stakingConfirmationControllerContract$Parcel$Fee.f88111b);
    }

    public final int hashCode() {
        return this.f88111b.hashCode() + (this.f88110a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f88110a, i);
        dest.writeParcelable(this.f88111b, i);
    }
}
