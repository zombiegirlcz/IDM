package com.revolut.feature.insurance.impl.ui.cfac.claim;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.insurance.api.models.details.CFACCancellationReason;
import com.revolut.feature.insurance.api.models.details.CFACInsuranceDetails;
import com.revolut.feature.insurance.api.models.details.CFACProductDetails;
import com.revolut.feature.insurance.api.models.details.CFACReimbursementType;
import com.revolut.kompot.navigable.flow.FlowState;
import dl7.b;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/insurance/impl/ui/cfac/claim/CFACInsuranceClaimFlowContract$State", "Lcom/revolut/kompot/navigable/flow/FlowState;", "", "toString", "()Ljava/lang/String;", "feature_insurance_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CFACInsuranceClaimFlowContract$State implements FlowState {

    @NotNull
    public static final Parcelable.Creator<CFACInsuranceClaimFlowContract$State> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CFACInsuranceDetails f75046a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f75047b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f75048c;
    public final CFACCancellationReason d;
    public final CFACReimbursementType e;
    public final UUID f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f75049g;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CFACInsuranceClaimFlowContract$State((CFACInsuranceDetails) parcel.readParcelable(CFACInsuranceClaimFlowContract$State.class.getClassLoader()), (b) parcel.readSerializable(), parcel.readString(), (CFACCancellationReason) parcel.readParcelable(CFACInsuranceClaimFlowContract$State.class.getClassLoader()), (CFACReimbursementType) parcel.readParcelable(CFACInsuranceClaimFlowContract$State.class.getClassLoader()), (UUID) parcel.readSerializable(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CFACInsuranceClaimFlowContract$State[i];
        }
    }

    public CFACInsuranceClaimFlowContract$State(CFACInsuranceDetails insuranceDetails, b subtypeInfo, String str, CFACCancellationReason cFACCancellationReason, CFACReimbursementType reimbursementType, UUID idempotencyKey, boolean z) {
        Intrinsics.checkNotNullParameter(insuranceDetails, "insuranceDetails");
        Intrinsics.checkNotNullParameter(subtypeInfo, "subtypeInfo");
        Intrinsics.checkNotNullParameter(reimbursementType, "reimbursementType");
        Intrinsics.checkNotNullParameter(idempotencyKey, "idempotencyKey");
        this.f75046a = insuranceDetails;
        this.f75047b = subtypeInfo;
        this.f75048c = str;
        this.d = cFACCancellationReason;
        this.e = reimbursementType;
        this.f = idempotencyKey;
        this.f75049g = z;
    }

    public static CFACInsuranceClaimFlowContract$State a(CFACInsuranceClaimFlowContract$State cFACInsuranceClaimFlowContract$State, String str, CFACCancellationReason cFACCancellationReason, CFACReimbursementType cFACReimbursementType, int i) {
        CFACInsuranceDetails insuranceDetails = cFACInsuranceClaimFlowContract$State.f75046a;
        b subtypeInfo = cFACInsuranceClaimFlowContract$State.f75047b;
        if ((i & 4) != 0) {
            str = cFACInsuranceClaimFlowContract$State.f75048c;
        }
        String str2 = str;
        if ((i & 8) != 0) {
            cFACCancellationReason = cFACInsuranceClaimFlowContract$State.d;
        }
        CFACCancellationReason cFACCancellationReason2 = cFACCancellationReason;
        if ((i & 16) != 0) {
            cFACReimbursementType = cFACInsuranceClaimFlowContract$State.e;
        }
        CFACReimbursementType reimbursementType = cFACReimbursementType;
        UUID idempotencyKey = cFACInsuranceClaimFlowContract$State.f;
        boolean z = cFACInsuranceClaimFlowContract$State.f75049g;
        cFACInsuranceClaimFlowContract$State.getClass();
        Intrinsics.checkNotNullParameter(insuranceDetails, "insuranceDetails");
        Intrinsics.checkNotNullParameter(subtypeInfo, "subtypeInfo");
        Intrinsics.checkNotNullParameter(reimbursementType, "reimbursementType");
        Intrinsics.checkNotNullParameter(idempotencyKey, "idempotencyKey");
        return new CFACInsuranceClaimFlowContract$State(insuranceDetails, subtypeInfo, str2, cFACCancellationReason2, reimbursementType, idempotencyKey, z);
    }

    public final CFACProductDetails b() {
        return this.f75046a.a(this.f75047b);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CFACInsuranceClaimFlowContract$State)) {
            return false;
        }
        CFACInsuranceClaimFlowContract$State cFACInsuranceClaimFlowContract$State = (CFACInsuranceClaimFlowContract$State) obj2;
        return Intrinsics.f(this.f75046a, cFACInsuranceClaimFlowContract$State.f75046a) && Intrinsics.f(this.f75047b, cFACInsuranceClaimFlowContract$State.f75047b) && Intrinsics.f(this.f75048c, cFACInsuranceClaimFlowContract$State.f75048c) && Intrinsics.f(this.d, cFACInsuranceClaimFlowContract$State.d) && this.e == cFACInsuranceClaimFlowContract$State.e && Intrinsics.f(this.f, cFACInsuranceClaimFlowContract$State.f) && this.f75049g == cFACInsuranceClaimFlowContract$State.f75049g;
    }

    public final int hashCode() {
        int iHashCode = (this.f75047b.hashCode() + (this.f75046a.hashCode() * 31)) * 31;
        String str = this.f75048c;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        CFACCancellationReason cFACCancellationReason = this.d;
        return Boolean.hashCode(this.f75049g) + t61.a.f(this.f, (this.e.hashCode() + ((iHashCode2 + (cFACCancellationReason != null ? cFACCancellationReason.hashCode() : 0)) * 31)) * 31, 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f75046a, i);
        dest.writeSerializable(this.f75047b);
        dest.writeString(this.f75048c);
        dest.writeParcelable(this.d, i);
        dest.writeParcelable(this.e, i);
        dest.writeSerializable(this.f);
        dest.writeInt(this.f75049g ? 1 : 0);
    }
}
