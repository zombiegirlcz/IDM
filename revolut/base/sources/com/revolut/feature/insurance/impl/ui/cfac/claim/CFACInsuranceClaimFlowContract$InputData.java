package com.revolut.feature.insurance.impl.ui.cfac.claim;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.insurance.api.models.details.CFACInsuranceDetails;
import com.revolut.kompot.common.IOData$Input;
import dl7.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004"}, d2 = {"com/revolut/feature/insurance/impl/ui/cfac/claim/CFACInsuranceClaimFlowContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "MakeClaim", "Lcom/revolut/feature/insurance/impl/ui/cfac/claim/CFACInsuranceClaimFlowContract$InputData$MakeClaim;", "feature_insurance_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class CFACInsuranceClaimFlowContract$InputData implements IOData$Input {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/insurance/impl/ui/cfac/claim/CFACInsuranceClaimFlowContract$InputData$MakeClaim;", "Lcom/revolut/feature/insurance/impl/ui/cfac/claim/CFACInsuranceClaimFlowContract$InputData;", "", "toString", "()Ljava/lang/String;", "feature_insurance_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class MakeClaim extends CFACInsuranceClaimFlowContract$InputData {

        @NotNull
        public static final Parcelable.Creator<MakeClaim> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CFACInsuranceDetails f75043a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final b f75044b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f75045c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new MakeClaim((CFACInsuranceDetails) parcel.readParcelable(MakeClaim.class.getClassLoader()), (b) parcel.readSerializable(), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new MakeClaim[i];
            }
        }

        public MakeClaim(CFACInsuranceDetails insuranceDetails, b subtypeInfo, boolean z) {
            Intrinsics.checkNotNullParameter(insuranceDetails, "insuranceDetails");
            Intrinsics.checkNotNullParameter(subtypeInfo, "subtypeInfo");
            this.f75043a = insuranceDetails;
            this.f75044b = subtypeInfo;
            this.f75045c = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof MakeClaim)) {
                return false;
            }
            MakeClaim makeClaim = (MakeClaim) obj2;
            return Intrinsics.f(this.f75043a, makeClaim.f75043a) && Intrinsics.f(this.f75044b, makeClaim.f75044b) && this.f75045c == makeClaim.f75045c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f75045c) + ((this.f75044b.hashCode() + (this.f75043a.hashCode() * 31)) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f75043a, i);
            dest.writeSerializable(this.f75044b);
            dest.writeInt(this.f75045c ? 1 : 0);
        }
    }
}
