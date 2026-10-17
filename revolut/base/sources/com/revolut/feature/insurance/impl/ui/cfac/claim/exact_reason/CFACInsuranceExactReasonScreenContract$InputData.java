package com.revolut.feature.insurance.impl.ui.cfac.claim.exact_reason;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.insurance.api.models.details.CFACInsuranceDetails;
import com.revolut.feature.insurance.api.models.details.CFACProductDetails;
import com.revolut.feature.insurance.api.models.details.CFACReimbursementType;
import com.revolut.kompot.common.IOData$Input;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/insurance/impl/ui/cfac/claim/exact_reason/CFACInsuranceExactReasonScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_insurance_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CFACInsuranceExactReasonScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<CFACInsuranceExactReasonScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f75071a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f75072b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CFACReimbursementType f75073c;
    public final CFACInsuranceDetails d;
    public final CFACProductDetails e;
    public final boolean f;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iE = 0;
            while (iE != i) {
                iE = j6.a.e(CFACInsuranceExactReasonScreenContract$InputData.class, parcel, arrayList, iE, 1);
            }
            return new CFACInsuranceExactReasonScreenContract$InputData(string, arrayList, (CFACReimbursementType) parcel.readParcelable(CFACInsuranceExactReasonScreenContract$InputData.class.getClassLoader()), (CFACInsuranceDetails) parcel.readParcelable(CFACInsuranceExactReasonScreenContract$InputData.class.getClassLoader()), (CFACProductDetails) parcel.readParcelable(CFACInsuranceExactReasonScreenContract$InputData.class.getClassLoader()), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CFACInsuranceExactReasonScreenContract$InputData[i];
        }
    }

    public CFACInsuranceExactReasonScreenContract$InputData(String reasonGroupDescription, List possibleReasons, CFACReimbursementType reimbursementType, CFACInsuranceDetails insuranceDetails, CFACProductDetails productDetails, boolean z) {
        Intrinsics.checkNotNullParameter(reasonGroupDescription, "reasonGroupDescription");
        Intrinsics.checkNotNullParameter(possibleReasons, "possibleReasons");
        Intrinsics.checkNotNullParameter(reimbursementType, "reimbursementType");
        Intrinsics.checkNotNullParameter(insuranceDetails, "insuranceDetails");
        Intrinsics.checkNotNullParameter(productDetails, "productDetails");
        this.f75071a = reasonGroupDescription;
        this.f75072b = possibleReasons;
        this.f75073c = reimbursementType;
        this.d = insuranceDetails;
        this.e = productDetails;
        this.f = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CFACInsuranceExactReasonScreenContract$InputData)) {
            return false;
        }
        CFACInsuranceExactReasonScreenContract$InputData cFACInsuranceExactReasonScreenContract$InputData = (CFACInsuranceExactReasonScreenContract$InputData) obj2;
        return Intrinsics.f(this.f75071a, cFACInsuranceExactReasonScreenContract$InputData.f75071a) && Intrinsics.f(this.f75072b, cFACInsuranceExactReasonScreenContract$InputData.f75072b) && this.f75073c == cFACInsuranceExactReasonScreenContract$InputData.f75073c && Intrinsics.f(this.d, cFACInsuranceExactReasonScreenContract$InputData.d) && Intrinsics.f(this.e, cFACInsuranceExactReasonScreenContract$InputData.e) && this.f == cFACInsuranceExactReasonScreenContract$InputData.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + ((this.e.hashCode() + ((this.d.hashCode() + ((this.f75073c.hashCode() + p.a.d(this.f75071a.hashCode() * 31, 31, this.f75072b)) * 31)) * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f75071a);
        Iterator itV = p.a.v(this.f75072b, dest);
        while (itV.hasNext()) {
            dest.writeParcelable((Parcelable) itV.next(), i);
        }
        dest.writeParcelable(this.f75073c, i);
        dest.writeParcelable(this.d, i);
        dest.writeParcelable(this.e, i);
        dest.writeInt(this.f ? 1 : 0);
    }
}
