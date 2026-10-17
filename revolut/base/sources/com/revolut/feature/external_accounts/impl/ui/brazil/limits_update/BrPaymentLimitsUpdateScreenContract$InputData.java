package com.revolut.feature.external_accounts.impl.ui.brazil.limits_update;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.external_accounts.impl.ui.brazil.limits_update.tracking.ConsentLimitInputTrackableContext;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/external_accounts/impl/ui/brazil/limits_update/BrPaymentLimitsUpdateScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BrPaymentLimitsUpdateScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<BrPaymentLimitsUpdateScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LimitConfig f72618a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConsentLimitInputTrackableContext f72619b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f72620c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new BrPaymentLimitsUpdateScreenContract$InputData((LimitConfig) parcel.readParcelable(BrPaymentLimitsUpdateScreenContract$InputData.class.getClassLoader()), (ConsentLimitInputTrackableContext) parcel.readParcelable(BrPaymentLimitsUpdateScreenContract$InputData.class.getClassLoader()), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new BrPaymentLimitsUpdateScreenContract$InputData[i];
        }
    }

    public BrPaymentLimitsUpdateScreenContract$InputData(LimitConfig limitConfig, ConsentLimitInputTrackableContext trackableContext, boolean z) {
        Intrinsics.checkNotNullParameter(limitConfig, "limitConfig");
        Intrinsics.checkNotNullParameter(trackableContext, "trackableContext");
        this.f72618a = limitConfig;
        this.f72619b = trackableContext;
        this.f72620c = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof BrPaymentLimitsUpdateScreenContract$InputData)) {
            return false;
        }
        BrPaymentLimitsUpdateScreenContract$InputData brPaymentLimitsUpdateScreenContract$InputData = (BrPaymentLimitsUpdateScreenContract$InputData) obj2;
        return Intrinsics.f(this.f72618a, brPaymentLimitsUpdateScreenContract$InputData.f72618a) && Intrinsics.f(this.f72619b, brPaymentLimitsUpdateScreenContract$InputData.f72619b) && this.f72620c == brPaymentLimitsUpdateScreenContract$InputData.f72620c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f72620c) + ((this.f72619b.hashCode() + (this.f72618a.hashCode() * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f72618a, i);
        dest.writeParcelable(this.f72619b, i);
        dest.writeInt(this.f72620c ? 1 : 0);
    }
}
