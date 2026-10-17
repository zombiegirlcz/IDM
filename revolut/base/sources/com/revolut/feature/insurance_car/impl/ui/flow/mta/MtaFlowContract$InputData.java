package com.revolut.feature.insurance_car.impl.ui.flow.mta;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.insurance_car.impl.data.model.MtaAvailabilityContainer;
import com.revolut.feature.insurance_car.impl.data.model.MtaFlowVariant;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/insurance_car/impl/ui/flow/mta/MtaFlowContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_insurance_car_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class MtaFlowContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<MtaFlowContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f75360a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MtaFlowVariant f75361b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final MtaAvailabilityContainer f75362c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new MtaFlowContract$InputData(parcel.readString(), (MtaFlowVariant) parcel.readParcelable(MtaFlowContract$InputData.class.getClassLoader()), MtaAvailabilityContainer.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new MtaFlowContract$InputData[i];
        }
    }

    public MtaFlowContract$InputData(String policyId, MtaFlowVariant variant, MtaAvailabilityContainer mtaAvailability) {
        Intrinsics.checkNotNullParameter(policyId, "policyId");
        Intrinsics.checkNotNullParameter(variant, "variant");
        Intrinsics.checkNotNullParameter(mtaAvailability, "mtaAvailability");
        this.f75360a = policyId;
        this.f75361b = variant;
        this.f75362c = mtaAvailability;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof MtaFlowContract$InputData)) {
            return false;
        }
        MtaFlowContract$InputData mtaFlowContract$InputData = (MtaFlowContract$InputData) obj2;
        return Intrinsics.f(this.f75360a, mtaFlowContract$InputData.f75360a) && Intrinsics.f(this.f75361b, mtaFlowContract$InputData.f75361b) && Intrinsics.f(this.f75362c, mtaFlowContract$InputData.f75362c);
    }

    public final int hashCode() {
        return this.f75362c.hashCode() + ((this.f75361b.hashCode() + (this.f75360a.hashCode() * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f75360a);
        dest.writeParcelable(this.f75361b, i);
        this.f75362c.writeToParcel(dest, i);
    }
}
