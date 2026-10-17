package com.revolut.feature.referrals.code.impl.referral_code.screen;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.referrals.code.api.ScreenSource;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/referrals/code/impl/referral_code/screen/ReferralCodeContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_retail_referrals_code_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ReferralCodeContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<ReferralCodeContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ScreenSource f81684a;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ReferralCodeContract$InputData((ScreenSource) parcel.readParcelable(ReferralCodeContract$InputData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ReferralCodeContract$InputData[i];
        }
    }

    public ReferralCodeContract$InputData(ScreenSource source) {
        Intrinsics.checkNotNullParameter(source, "source");
        this.f81684a = source;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof ReferralCodeContract$InputData) && Intrinsics.f(this.f81684a, ((ReferralCodeContract$InputData) obj2).f81684a);
    }

    public final int hashCode() {
        return this.f81684a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f81684a, i);
    }
}
