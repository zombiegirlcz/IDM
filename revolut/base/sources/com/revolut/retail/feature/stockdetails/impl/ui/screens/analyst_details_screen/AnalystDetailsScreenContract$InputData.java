package com.revolut.retail.feature.stockdetails.impl.ui.screens.analyst_details_screen;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import hel.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import nel.n;
import org.jetbrains.annotations.NotNull;
import ruk.h;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/retail/feature/stockdetails/impl/ui/screens/analyst_details_screen/AnalystDetailsScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_stock_details_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class AnalystDetailsScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<AnalystDetailsScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f103880a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f103881b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h f103882c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new AnalystDetailsScreenContract$InputData((n) parcel.readSerializable(), parcel.readInt() == 0 ? null : b.valueOf(parcel.readString()), h.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AnalystDetailsScreenContract$InputData[i];
        }
    }

    public AnalystDetailsScreenContract$InputData(n instrument, b bVar, h selectedTab) {
        Intrinsics.checkNotNullParameter(instrument, "instrument");
        Intrinsics.checkNotNullParameter(selectedTab, "selectedTab");
        this.f103880a = instrument;
        this.f103881b = bVar;
        this.f103882c = selectedTab;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof AnalystDetailsScreenContract$InputData)) {
            return false;
        }
        AnalystDetailsScreenContract$InputData analystDetailsScreenContract$InputData = (AnalystDetailsScreenContract$InputData) obj2;
        return Intrinsics.f(this.f103880a, analystDetailsScreenContract$InputData.f103880a) && this.f103881b == analystDetailsScreenContract$InputData.f103881b && this.f103882c == analystDetailsScreenContract$InputData.f103882c;
    }

    public final int hashCode() {
        int iHashCode = this.f103880a.hashCode() * 31;
        b bVar = this.f103881b;
        return this.f103882c.hashCode() + ((iHashCode + (bVar == null ? 0 : bVar.hashCode())) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f103880a);
        b bVar = this.f103881b;
        if (bVar == null) {
            dest.writeInt(0);
        } else {
            org.bouncycastle.jcajce.provider.digest.a.u(dest, 1, bVar);
        }
        dest.writeString(this.f103882c.name());
    }
}
