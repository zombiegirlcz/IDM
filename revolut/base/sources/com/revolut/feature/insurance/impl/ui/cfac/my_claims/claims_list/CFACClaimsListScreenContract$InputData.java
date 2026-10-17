package com.revolut.feature.insurance.impl.ui.cfac.my_claims.claims_list;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.insurance.api.models.details.CFACInsuranceDetails;
import com.revolut.kompot.common.IOData$Input;
import dl7.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/insurance/impl/ui/cfac/my_claims/claims_list/CFACClaimsListScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_insurance_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CFACClaimsListScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<CFACClaimsListScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CFACInsuranceDetails f75137a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f75138b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CFACClaimsListScreenContract$InputData((CFACInsuranceDetails) parcel.readParcelable(CFACClaimsListScreenContract$InputData.class.getClassLoader()), (b) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CFACClaimsListScreenContract$InputData[i];
        }
    }

    public CFACClaimsListScreenContract$InputData(CFACInsuranceDetails insuranceDetails, b insuranceSubtypeInfo) {
        Intrinsics.checkNotNullParameter(insuranceDetails, "insuranceDetails");
        Intrinsics.checkNotNullParameter(insuranceSubtypeInfo, "insuranceSubtypeInfo");
        this.f75137a = insuranceDetails;
        this.f75138b = insuranceSubtypeInfo;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CFACClaimsListScreenContract$InputData)) {
            return false;
        }
        CFACClaimsListScreenContract$InputData cFACClaimsListScreenContract$InputData = (CFACClaimsListScreenContract$InputData) obj2;
        return Intrinsics.f(this.f75137a, cFACClaimsListScreenContract$InputData.f75137a) && Intrinsics.f(this.f75138b, cFACClaimsListScreenContract$InputData.f75138b);
    }

    public final int hashCode() {
        return this.f75138b.hashCode() + (this.f75137a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f75137a, i);
        dest.writeSerializable(this.f75138b);
    }
}
