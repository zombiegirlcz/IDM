package com.revolut.feature.pricing_plans.unlock_benefits.impl.ui.screen.unlock_benefits;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/pricing_plans/unlock_benefits/impl/ui/screen/unlock_benefits/UnlockBenefitsScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_pricing_plans_unlock_benefits_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class UnlockBenefitsScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<UnlockBenefitsScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f80970a;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new UnlockBenefitsScreenContract$InputData(parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new UnlockBenefitsScreenContract$InputData[i];
        }
    }

    public UnlockBenefitsScreenContract$InputData(boolean z) {
        this.f80970a = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof UnlockBenefitsScreenContract$InputData) && this.f80970a == ((UnlockBenefitsScreenContract$InputData) obj2).f80970a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f80970a);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.f80970a ? 1 : 0);
    }
}
