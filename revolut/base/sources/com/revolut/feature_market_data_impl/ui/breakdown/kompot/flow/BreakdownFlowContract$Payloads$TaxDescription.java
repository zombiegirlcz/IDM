package com.revolut.feature_market_data_impl.ui.breakdown.kompot.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.shared.feature.market_data.models.domain.models.ChargeEntry;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature_market_data_impl/ui/breakdown/kompot/flow/BreakdownFlowContract$Payloads$TaxDescription", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_market_data_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BreakdownFlowContract$Payloads$TaxDescription implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<BreakdownFlowContract$Payloads$TaxDescription> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChargeEntry f97169a;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new BreakdownFlowContract$Payloads$TaxDescription((ChargeEntry) parcel.readParcelable(BreakdownFlowContract$Payloads$TaxDescription.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new BreakdownFlowContract$Payloads$TaxDescription[i];
        }
    }

    public BreakdownFlowContract$Payloads$TaxDescription(ChargeEntry entry) {
        Intrinsics.checkNotNullParameter(entry, "entry");
        this.f97169a = entry;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof BreakdownFlowContract$Payloads$TaxDescription) && Intrinsics.f(this.f97169a, ((BreakdownFlowContract$Payloads$TaxDescription) obj2).f97169a);
    }

    public final int hashCode() {
        return this.f97169a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f97169a, i);
    }
}
