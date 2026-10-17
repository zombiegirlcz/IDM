package com.revolut.feature.freelancer.impl.ui.subaccount.create.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import h30.l;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xi0.b;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/freelancer/impl/ui/subaccount/create/flow/FreelancerCreateTaxPocketFlowContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class FreelancerCreateTaxPocketFlowContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<FreelancerCreateTaxPocketFlowContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f74219a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f74220b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f74221c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new FreelancerCreateTaxPocketFlowContract$InputData(parcel.readString(), parcel.readString(), (b) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new FreelancerCreateTaxPocketFlowContract$InputData[i];
        }
    }

    public FreelancerCreateTaxPocketFlowContract$InputData(String name, String imageId, b currency) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(imageId, "imageId");
        this.f74219a = name;
        this.f74220b = currency;
        this.f74221c = imageId;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof FreelancerCreateTaxPocketFlowContract$InputData)) {
            return false;
        }
        FreelancerCreateTaxPocketFlowContract$InputData freelancerCreateTaxPocketFlowContract$InputData = (FreelancerCreateTaxPocketFlowContract$InputData) obj2;
        return Intrinsics.f(this.f74219a, freelancerCreateTaxPocketFlowContract$InputData.f74219a) && Intrinsics.f(this.f74220b, freelancerCreateTaxPocketFlowContract$InputData.f74220b) && Intrinsics.f(this.f74221c, freelancerCreateTaxPocketFlowContract$InputData.f74221c);
    }

    public final int hashCode() {
        return this.f74221c.hashCode() + l.j(this.f74220b, this.f74219a.hashCode() * 31, 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f74219a);
        dest.writeSerializable(this.f74220b);
        dest.writeString(this.f74221c);
    }
}
