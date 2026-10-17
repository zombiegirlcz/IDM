package com.revolut.feature.atm.impl.ui.redesign.details;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.atm.api.model.Atm;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/atm/impl/ui/redesign/details/AtmDetailsBottomSheetContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_atm_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class AtmDetailsBottomSheetContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<AtmDetailsBottomSheetContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Atm f63155a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f63156b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new AtmDetailsBottomSheetContract$InputData((Atm) parcel.readParcelable(AtmDetailsBottomSheetContract$InputData.class.getClassLoader()), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AtmDetailsBottomSheetContract$InputData[i];
        }
    }

    public AtmDetailsBottomSheetContract$InputData(Atm selectedAtm, boolean z) {
        Intrinsics.checkNotNullParameter(selectedAtm, "selectedAtm");
        this.f63155a = selectedAtm;
        this.f63156b = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof AtmDetailsBottomSheetContract$InputData)) {
            return false;
        }
        AtmDetailsBottomSheetContract$InputData atmDetailsBottomSheetContract$InputData = (AtmDetailsBottomSheetContract$InputData) obj2;
        return Intrinsics.f(this.f63155a, atmDetailsBottomSheetContract$InputData.f63155a) && this.f63156b == atmDetailsBottomSheetContract$InputData.f63156b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f63156b) + (this.f63155a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f63155a, i);
        dest.writeInt(this.f63156b ? 1 : 0);
    }
}
