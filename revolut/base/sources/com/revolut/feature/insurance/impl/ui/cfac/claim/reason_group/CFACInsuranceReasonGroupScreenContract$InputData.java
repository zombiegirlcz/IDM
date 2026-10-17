package com.revolut.feature.insurance.impl.ui.cfac.claim.reason_group;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.insurance.api.models.details.CFACInsuranceDetails;
import com.revolut.feature.insurance.api.models.details.CFACProductDetails;
import com.revolut.feature.insurance.api.models.details.CFACReimbursementType;
import com.revolut.kompot.common.IOData$Input;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/insurance/impl/ui/cfac/claim/reason_group/CFACInsuranceReasonGroupScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_insurance_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CFACInsuranceReasonGroupScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<CFACInsuranceReasonGroupScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f75094a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CFACReimbursementType f75095b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CFACInsuranceDetails f75096c;
    public final CFACProductDetails d;
    public final boolean e;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iE = 0;
            while (iE != i) {
                iE = j6.a.e(CFACInsuranceReasonGroupScreenContract$InputData.class, parcel, arrayList, iE, 1);
            }
            return new CFACInsuranceReasonGroupScreenContract$InputData(arrayList, (CFACReimbursementType) parcel.readParcelable(CFACInsuranceReasonGroupScreenContract$InputData.class.getClassLoader()), (CFACInsuranceDetails) parcel.readParcelable(CFACInsuranceReasonGroupScreenContract$InputData.class.getClassLoader()), (CFACProductDetails) parcel.readParcelable(CFACInsuranceReasonGroupScreenContract$InputData.class.getClassLoader()), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CFACInsuranceReasonGroupScreenContract$InputData[i];
        }
    }

    public CFACInsuranceReasonGroupScreenContract$InputData(ArrayList reasonGroups, CFACReimbursementType reimbursementType, CFACInsuranceDetails insuranceDetails, CFACProductDetails productDetails, boolean z) {
        Intrinsics.checkNotNullParameter(reasonGroups, "reasonGroups");
        Intrinsics.checkNotNullParameter(reimbursementType, "reimbursementType");
        Intrinsics.checkNotNullParameter(insuranceDetails, "insuranceDetails");
        Intrinsics.checkNotNullParameter(productDetails, "productDetails");
        this.f75094a = reasonGroups;
        this.f75095b = reimbursementType;
        this.f75096c = insuranceDetails;
        this.d = productDetails;
        this.e = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CFACInsuranceReasonGroupScreenContract$InputData)) {
            return false;
        }
        CFACInsuranceReasonGroupScreenContract$InputData cFACInsuranceReasonGroupScreenContract$InputData = (CFACInsuranceReasonGroupScreenContract$InputData) obj2;
        return this.f75094a.equals(cFACInsuranceReasonGroupScreenContract$InputData.f75094a) && this.f75095b == cFACInsuranceReasonGroupScreenContract$InputData.f75095b && Intrinsics.f(this.f75096c, cFACInsuranceReasonGroupScreenContract$InputData.f75096c) && Intrinsics.f(this.d, cFACInsuranceReasonGroupScreenContract$InputData.d) && this.e == cFACInsuranceReasonGroupScreenContract$InputData.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + ((this.d.hashCode() + ((this.f75096c.hashCode() + ((this.f75095b.hashCode() + (this.f75094a.hashCode() * 31)) * 31)) * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Iterator itY = j6.a.y(this.f75094a, dest);
        while (itY.hasNext()) {
            dest.writeParcelable((Parcelable) itY.next(), i);
        }
        dest.writeParcelable(this.f75095b, i);
        dest.writeParcelable(this.f75096c, i);
        dest.writeParcelable(this.d, i);
        dest.writeInt(this.e ? 1 : 0);
    }
}
