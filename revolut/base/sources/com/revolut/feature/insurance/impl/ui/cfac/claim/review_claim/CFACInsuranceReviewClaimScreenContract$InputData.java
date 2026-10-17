package com.revolut.feature.insurance.impl.ui.cfac.claim.review_claim;

import a0.d;
import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.insurance.api.models.CFACClaimingFor;
import com.revolut.feature.insurance.api.models.details.CFACExcess;
import com.revolut.feature.insurance.api.models.details.CFACInsuranceDetails;
import com.revolut.kompot.common.IOData$Input;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/insurance/impl/ui/cfac/claim/review_claim/CFACInsuranceReviewClaimScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_insurance_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CFACInsuranceReviewClaimScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<CFACInsuranceReviewClaimScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CFACInsuranceDetails f75102a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f75103b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f75104c;
    public final boolean d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final CFACClaimingFor f75105g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final CFACExcess f75106h;
    public final UUID i;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CFACInsuranceReviewClaimScreenContract$InputData((CFACInsuranceDetails) parcel.readParcelable(CFACInsuranceReviewClaimScreenContract$InputData.class.getClassLoader()), parcel.readString(), parcel.readLong(), parcel.readInt() != 0, parcel.readString(), parcel.readString(), (CFACClaimingFor) parcel.readParcelable(CFACInsuranceReviewClaimScreenContract$InputData.class.getClassLoader()), (CFACExcess) parcel.readParcelable(CFACInsuranceReviewClaimScreenContract$InputData.class.getClassLoader()), (UUID) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CFACInsuranceReviewClaimScreenContract$InputData[i];
        }
    }

    public CFACInsuranceReviewClaimScreenContract$InputData(CFACInsuranceDetails insuranceDetails, String cancellationReasonDescription, long j2, boolean z, String reasonCode, String str, CFACClaimingFor claimingFor, CFACExcess excess, UUID idempotencyKey) {
        Intrinsics.checkNotNullParameter(insuranceDetails, "insuranceDetails");
        Intrinsics.checkNotNullParameter(cancellationReasonDescription, "cancellationReasonDescription");
        Intrinsics.checkNotNullParameter(reasonCode, "reasonCode");
        Intrinsics.checkNotNullParameter(claimingFor, "claimingFor");
        Intrinsics.checkNotNullParameter(excess, "excess");
        Intrinsics.checkNotNullParameter(idempotencyKey, "idempotencyKey");
        this.f75102a = insuranceDetails;
        this.f75103b = cancellationReasonDescription;
        this.f75104c = j2;
        this.d = z;
        this.e = reasonCode;
        this.f = str;
        this.f75105g = claimingFor;
        this.f75106h = excess;
        this.i = idempotencyKey;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CFACInsuranceReviewClaimScreenContract$InputData)) {
            return false;
        }
        CFACInsuranceReviewClaimScreenContract$InputData cFACInsuranceReviewClaimScreenContract$InputData = (CFACInsuranceReviewClaimScreenContract$InputData) obj2;
        return Intrinsics.f(this.f75102a, cFACInsuranceReviewClaimScreenContract$InputData.f75102a) && Intrinsics.f(this.f75103b, cFACInsuranceReviewClaimScreenContract$InputData.f75103b) && this.f75104c == cFACInsuranceReviewClaimScreenContract$InputData.f75104c && this.d == cFACInsuranceReviewClaimScreenContract$InputData.d && Intrinsics.f(this.e, cFACInsuranceReviewClaimScreenContract$InputData.e) && Intrinsics.f(this.f, cFACInsuranceReviewClaimScreenContract$InputData.f) && this.f75105g == cFACInsuranceReviewClaimScreenContract$InputData.f75105g && Intrinsics.f(this.f75106h, cFACInsuranceReviewClaimScreenContract$InputData.f75106h) && Intrinsics.f(this.i, cFACInsuranceReviewClaimScreenContract$InputData.i);
    }

    public final int hashCode() {
        int iC = p.a.c(j6.a.c(d.c(p.a.c(this.f75102a.hashCode() * 31, 31, this.f75103b), 31, this.f75104c), 31, this.d), 31, this.e);
        String str = this.f;
        return this.i.hashCode() + ((this.f75106h.hashCode() + ((this.f75105g.hashCode() + ((iC + (str == null ? 0 : str.hashCode())) * 31)) * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f75102a, i);
        dest.writeString(this.f75103b);
        dest.writeLong(this.f75104c);
        dest.writeInt(this.d ? 1 : 0);
        dest.writeString(this.e);
        dest.writeString(this.f);
        dest.writeParcelable(this.f75105g, i);
        dest.writeParcelable(this.f75106h, i);
        dest.writeSerializable(this.i);
    }
}
