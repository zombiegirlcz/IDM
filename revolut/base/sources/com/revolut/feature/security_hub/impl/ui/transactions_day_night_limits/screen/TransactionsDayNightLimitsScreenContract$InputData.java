package com.revolut.feature.security_hub.impl.ui.transactions_day_night_limits.screen;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import cuc.g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/security_hub/impl/ui/transactions_day_night_limits/screen/TransactionsDayNightLimitsScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_security_hub_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TransactionsDayNightLimitsScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<TransactionsDayNightLimitsScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f85720a;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new TransactionsDayNightLimitsScreenContract$InputData(g.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TransactionsDayNightLimitsScreenContract$InputData[i];
        }
    }

    public TransactionsDayNightLimitsScreenContract$InputData(g timeOfDay) {
        Intrinsics.checkNotNullParameter(timeOfDay, "timeOfDay");
        this.f85720a = timeOfDay;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof TransactionsDayNightLimitsScreenContract$InputData) && this.f85720a == ((TransactionsDayNightLimitsScreenContract$InputData) obj2).f85720a;
    }

    public final int hashCode() {
        return this.f85720a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f85720a.name());
    }
}
