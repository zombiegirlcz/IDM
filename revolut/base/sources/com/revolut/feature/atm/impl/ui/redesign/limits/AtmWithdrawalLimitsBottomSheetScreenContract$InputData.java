package com.revolut.feature.atm.impl.ui.redesign.limits;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import dj0.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import tj2.c;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/atm/impl/ui/redesign/limits/AtmWithdrawalLimitsBottomSheetScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_atm_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class AtmWithdrawalLimitsBottomSheetScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<AtmWithdrawalLimitsBottomSheetScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f63175a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f63176b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new AtmWithdrawalLimitsBottomSheetScreenContract$InputData(c.valueOf(parcel.readString()), (d) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AtmWithdrawalLimitsBottomSheetScreenContract$InputData[i];
        }
    }

    public AtmWithdrawalLimitsBottomSheetScreenContract$InputData(c limitType, d limitAmount) {
        Intrinsics.checkNotNullParameter(limitType, "limitType");
        Intrinsics.checkNotNullParameter(limitAmount, "limitAmount");
        this.f63175a = limitType;
        this.f63176b = limitAmount;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof AtmWithdrawalLimitsBottomSheetScreenContract$InputData)) {
            return false;
        }
        AtmWithdrawalLimitsBottomSheetScreenContract$InputData atmWithdrawalLimitsBottomSheetScreenContract$InputData = (AtmWithdrawalLimitsBottomSheetScreenContract$InputData) obj2;
        return this.f63175a == atmWithdrawalLimitsBottomSheetScreenContract$InputData.f63175a && Intrinsics.f(this.f63176b, atmWithdrawalLimitsBottomSheetScreenContract$InputData.f63176b);
    }

    public final int hashCode() {
        return this.f63176b.hashCode() + (this.f63175a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f63175a.name());
        dest.writeSerializable(this.f63176b);
    }
}
