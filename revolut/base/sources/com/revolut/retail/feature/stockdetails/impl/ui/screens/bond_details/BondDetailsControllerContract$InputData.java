package com.revolut.retail.feature.stockdetails.impl.ui.screens.bond_details;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import eel.c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/retail/feature/stockdetails/impl/ui/screens/bond_details/BondDetailsControllerContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_stock_details_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BondDetailsControllerContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<BondDetailsControllerContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f103901a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f103902b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f103903c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new BondDetailsControllerContract$InputData(parcel.readString(), parcel.readInt() != 0, parcel.readInt() == 0 ? null : c.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new BondDetailsControllerContract$InputData[i];
        }
    }

    public BondDetailsControllerContract$InputData(String ref2, boolean z, c cVar) {
        Intrinsics.checkNotNullParameter(ref2, "ref");
        this.f103901a = ref2;
        this.f103902b = z;
        this.f103903c = cVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof BondDetailsControllerContract$InputData)) {
            return false;
        }
        BondDetailsControllerContract$InputData bondDetailsControllerContract$InputData = (BondDetailsControllerContract$InputData) obj2;
        return Intrinsics.f(this.f103901a, bondDetailsControllerContract$InputData.f103901a) && this.f103902b == bondDetailsControllerContract$InputData.f103902b && this.f103903c == bondDetailsControllerContract$InputData.f103903c;
    }

    public final int hashCode() {
        int iC = j6.a.c(this.f103901a.hashCode() * 31, 31, this.f103902b);
        c cVar = this.f103903c;
        return iC + (cVar == null ? 0 : cVar.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f103901a);
        dest.writeInt(this.f103902b ? 1 : 0);
        c cVar = this.f103903c;
        if (cVar == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(cVar.name());
        }
    }
}
