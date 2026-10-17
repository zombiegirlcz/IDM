package com.revolut.feature.insurance_embedded.impl.ui.screen.embedded.details;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/insurance_embedded/impl/ui/screen/embedded/details/InsuranceDetailsLayoutScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_insurance_embedded_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class InsuranceDetailsLayoutScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<InsuranceDetailsLayoutScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f76112a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f76113b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new InsuranceDetailsLayoutScreenContract$InputData(parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new InsuranceDetailsLayoutScreenContract$InputData[i];
        }
    }

    public InsuranceDetailsLayoutScreenContract$InputData(String insuranceProduct, boolean z) {
        Intrinsics.checkNotNullParameter(insuranceProduct, "insuranceProduct");
        this.f76112a = insuranceProduct;
        this.f76113b = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof InsuranceDetailsLayoutScreenContract$InputData)) {
            return false;
        }
        InsuranceDetailsLayoutScreenContract$InputData insuranceDetailsLayoutScreenContract$InputData = (InsuranceDetailsLayoutScreenContract$InputData) obj2;
        return Intrinsics.f(this.f76112a, insuranceDetailsLayoutScreenContract$InputData.f76112a) && this.f76113b == insuranceDetailsLayoutScreenContract$InputData.f76113b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f76113b) + (this.f76112a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f76112a);
        dest.writeInt(this.f76113b ? 1 : 0);
    }
}
