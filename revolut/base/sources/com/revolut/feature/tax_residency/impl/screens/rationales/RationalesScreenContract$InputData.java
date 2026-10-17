package com.revolut.feature.tax_residency.impl.screens.rationales;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wi0.b;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/tax_residency/impl/screens/rationales/RationalesScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_tax_residency_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class RationalesScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<RationalesScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f90104a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f90105b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new RationalesScreenContract$InputData((b) parcel.readSerializable(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new RationalesScreenContract$InputData[i];
        }
    }

    public RationalesScreenContract$InputData(b country, String documentAcronym) {
        Intrinsics.checkNotNullParameter(country, "country");
        Intrinsics.checkNotNullParameter(documentAcronym, "documentAcronym");
        this.f90104a = country;
        this.f90105b = documentAcronym;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof RationalesScreenContract$InputData)) {
            return false;
        }
        RationalesScreenContract$InputData rationalesScreenContract$InputData = (RationalesScreenContract$InputData) obj2;
        return Intrinsics.f(this.f90104a, rationalesScreenContract$InputData.f90104a) && Intrinsics.f(this.f90105b, rationalesScreenContract$InputData.f90105b);
    }

    public final int hashCode() {
        return this.f90105b.hashCode() + (this.f90104a.f297794a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f90104a);
        dest.writeString(this.f90105b);
    }
}
