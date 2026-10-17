package com.revolut.feature.apm.bills.billers.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xo1.b;
import xo1.g;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/apm/bills/billers/api/navigation/BillersChooserNavigation$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_apm_bills_billers_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BillersChooserNavigation$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<BillersChooserNavigation$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f61156a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f61157b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new BillersChooserNavigation$InputData(g.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : b.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new BillersChooserNavigation$InputData[i];
        }
    }

    public BillersChooserNavigation$InputData(g paymentMethod, b bVar) {
        Intrinsics.checkNotNullParameter(paymentMethod, "paymentMethod");
        this.f61156a = paymentMethod;
        this.f61157b = bVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof BillersChooserNavigation$InputData)) {
            return false;
        }
        BillersChooserNavigation$InputData billersChooserNavigation$InputData = (BillersChooserNavigation$InputData) obj2;
        return this.f61156a == billersChooserNavigation$InputData.f61156a && this.f61157b == billersChooserNavigation$InputData.f61157b;
    }

    public final int hashCode() {
        int iHashCode = this.f61156a.hashCode() * 31;
        b bVar = this.f61157b;
        return iHashCode + (bVar == null ? 0 : bVar.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f61156a.name());
        b bVar = this.f61157b;
        if (bVar == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(bVar.name());
        }
    }
}
