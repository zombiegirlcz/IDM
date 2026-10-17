package com.revolut.feature.insurance_embedded.impl.ui.flow.embedded;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/insurance_embedded/impl/ui/flow/embedded/InsuranceDetailsFlowContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_insurance_embedded_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class InsuranceDetailsFlowContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<InsuranceDetailsFlowContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f76068a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f76069b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InsuranceDetailsFlowContract$Step f76070c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new InsuranceDetailsFlowContract$InputData(parcel.readString(), parcel.readInt() != 0, (InsuranceDetailsFlowContract$Step) parcel.readParcelable(InsuranceDetailsFlowContract$InputData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new InsuranceDetailsFlowContract$InputData[i];
        }
    }

    public InsuranceDetailsFlowContract$InputData(String insuranceProduct, boolean z, InsuranceDetailsFlowContract$Step initialStep) {
        Intrinsics.checkNotNullParameter(insuranceProduct, "insuranceProduct");
        Intrinsics.checkNotNullParameter(initialStep, "initialStep");
        this.f76068a = insuranceProduct;
        this.f76069b = z;
        this.f76070c = initialStep;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof InsuranceDetailsFlowContract$InputData)) {
            return false;
        }
        InsuranceDetailsFlowContract$InputData insuranceDetailsFlowContract$InputData = (InsuranceDetailsFlowContract$InputData) obj2;
        return Intrinsics.f(this.f76068a, insuranceDetailsFlowContract$InputData.f76068a) && this.f76069b == insuranceDetailsFlowContract$InputData.f76069b && Intrinsics.f(this.f76070c, insuranceDetailsFlowContract$InputData.f76070c);
    }

    public final int hashCode() {
        return this.f76070c.hashCode() + j6.a.c(this.f76068a.hashCode() * 31, 31, this.f76069b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f76068a);
        dest.writeInt(this.f76069b ? 1 : 0);
        dest.writeParcelable(this.f76070c, i);
    }

    public /* synthetic */ InsuranceDetailsFlowContract$InputData(String str, InsuranceDetailsFlowContract$Step insuranceDetailsFlowContract$Step) {
        this(str, false, insuranceDetailsFlowContract$Step);
    }
}
