package com.revolut.feature.cash_topup.impl.ui.map;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ub3.k;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/cash_topup/impl/ui/map/CashTopUpLocationsMapScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_cash_topup_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CashTopUpLocationsMapScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<CashTopUpLocationsMapScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final cb3.a f65678a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f65679b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CashTopUpLocationsMapScreenContract$InputData(cb3.a.valueOf(parcel.readString()), k.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CashTopUpLocationsMapScreenContract$InputData[i];
        }
    }

    public CashTopUpLocationsMapScreenContract$InputData(cb3.a flowType, k actionsConfiguration) {
        Intrinsics.checkNotNullParameter(flowType, "flowType");
        Intrinsics.checkNotNullParameter(actionsConfiguration, "actionsConfiguration");
        this.f65678a = flowType;
        this.f65679b = actionsConfiguration;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CashTopUpLocationsMapScreenContract$InputData)) {
            return false;
        }
        CashTopUpLocationsMapScreenContract$InputData cashTopUpLocationsMapScreenContract$InputData = (CashTopUpLocationsMapScreenContract$InputData) obj2;
        return this.f65678a == cashTopUpLocationsMapScreenContract$InputData.f65678a && this.f65679b == cashTopUpLocationsMapScreenContract$InputData.f65679b;
    }

    public final int hashCode() {
        return this.f65679b.hashCode() + (this.f65678a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f65678a.name());
        dest.writeString(this.f65679b.name());
    }
}
