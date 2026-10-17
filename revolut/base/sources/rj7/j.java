package rj7;

import com.revolut.data.model.Data;
import com.revolut.feature.insurance.api.models.details.CFACCancellationReason;
import com.revolut.feature.insurance.api.models.details.CFACInsuranceDetails;
import com.revolut.feature.insurance.api.models.details.CFACProductDetails;
import com.revolut.feature.insurance.api.models.details.CFACReimbursementType;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class j implements jki.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f254623a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CFACReimbursementType f254624b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CFACInsuranceDetails f254625c;
    public final CFACProductDetails d;
    public final CFACCancellationReason e;
    public final Data f;

    public j(String str, CFACReimbursementType reimbursementType, CFACInsuranceDetails insuranceDetails, CFACProductDetails productDetails, CFACCancellationReason cancellationReason, Data additionalInfoData) {
        Intrinsics.checkNotNullParameter(reimbursementType, "reimbursementType");
        Intrinsics.checkNotNullParameter(insuranceDetails, "insuranceDetails");
        Intrinsics.checkNotNullParameter(productDetails, "productDetails");
        Intrinsics.checkNotNullParameter(cancellationReason, "cancellationReason");
        Intrinsics.checkNotNullParameter(additionalInfoData, "additionalInfoData");
        this.f254623a = str;
        this.f254624b = reimbursementType;
        this.f254625c = insuranceDetails;
        this.d = productDetails;
        this.e = cancellationReason;
        this.f = additionalInfoData;
    }

    public static j a(j jVar, Data additionalInfoData) {
        String str = jVar.f254623a;
        CFACReimbursementType reimbursementType = jVar.f254624b;
        CFACInsuranceDetails insuranceDetails = jVar.f254625c;
        CFACProductDetails productDetails = jVar.d;
        CFACCancellationReason cancellationReason = jVar.e;
        jVar.getClass();
        Intrinsics.checkNotNullParameter(reimbursementType, "reimbursementType");
        Intrinsics.checkNotNullParameter(insuranceDetails, "insuranceDetails");
        Intrinsics.checkNotNullParameter(productDetails, "productDetails");
        Intrinsics.checkNotNullParameter(cancellationReason, "cancellationReason");
        Intrinsics.checkNotNullParameter(additionalInfoData, "additionalInfoData");
        return new j(str, reimbursementType, insuranceDetails, productDetails, cancellationReason, additionalInfoData);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f254623a, jVar.f254623a) && this.f254624b == jVar.f254624b && Intrinsics.f(this.f254625c, jVar.f254625c) && Intrinsics.f(this.d, jVar.d) && Intrinsics.f(this.e, jVar.e) && Intrinsics.f(this.f, jVar.f);
    }

    public final int hashCode() {
        String str = this.f254623a;
        return this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.f254625c.hashCode() + ((this.f254624b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31)) * 31)) * 31)) * 31);
    }
}
