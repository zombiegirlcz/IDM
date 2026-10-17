package com.revolut.feature.tax_residency.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wi0.b;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/tax_residency/api/TaxResidencyDestination$SingleTinSelection", "", "", "toString", "()Ljava/lang/String;", "feature_tax_residency_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TaxResidencyDestination$SingleTinSelection implements KompotDestination {

    @NotNull
    public static final Parcelable.Creator<TaxResidencyDestination$SingleTinSelection> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f89960a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f89961b;

    /* JADX INFO: loaded from: classes8.dex */
    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new TaxResidencyDestination$SingleTinSelection((b) parcel.readSerializable(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TaxResidencyDestination$SingleTinSelection[i];
        }
    }

    public TaxResidencyDestination$SingleTinSelection(b countryCode, Integer num) {
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        this.f89960a = countryCode;
        this.f89961b = num;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TaxResidencyDestination$SingleTinSelection)) {
            return false;
        }
        TaxResidencyDestination$SingleTinSelection taxResidencyDestination$SingleTinSelection = (TaxResidencyDestination$SingleTinSelection) obj2;
        return Intrinsics.f(this.f89960a, taxResidencyDestination$SingleTinSelection.f89960a) && Intrinsics.f(this.f89961b, taxResidencyDestination$SingleTinSelection.f89961b);
    }

    public final int hashCode() {
        int iHashCode = this.f89960a.f297794a.hashCode() * 31;
        Integer num = this.f89961b;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f89960a);
        Integer num = this.f89961b;
        if (num == null) {
            dest.writeInt(0);
        } else {
            p.a.B(dest, 1, num);
        }
    }
}
