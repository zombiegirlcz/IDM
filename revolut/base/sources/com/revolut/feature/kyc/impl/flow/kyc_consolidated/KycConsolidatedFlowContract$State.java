package com.revolut.feature.kyc.impl.flow.kyc_consolidated;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/kyc/impl/flow/kyc_consolidated/KycConsolidatedFlowContract$State", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_kyc_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class KycConsolidatedFlowContract$State implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<KycConsolidatedFlowContract$State> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wi0.b f77730a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wi0.b f77731b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final wi0.b f77732c;
    public final boolean d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new KycConsolidatedFlowContract$State((wi0.b) parcel.readSerializable(), (wi0.b) parcel.readSerializable(), (wi0.b) parcel.readSerializable(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new KycConsolidatedFlowContract$State[i];
        }
    }

    public KycConsolidatedFlowContract$State() {
        this(0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof KycConsolidatedFlowContract$State)) {
            return false;
        }
        KycConsolidatedFlowContract$State kycConsolidatedFlowContract$State = (KycConsolidatedFlowContract$State) obj2;
        return Intrinsics.f(this.f77730a, kycConsolidatedFlowContract$State.f77730a) && Intrinsics.f(this.f77731b, kycConsolidatedFlowContract$State.f77731b) && Intrinsics.f(this.f77732c, kycConsolidatedFlowContract$State.f77732c) && this.d == kycConsolidatedFlowContract$State.d;
    }

    public final int hashCode() {
        wi0.b bVar = this.f77730a;
        int iHashCode = (bVar == null ? 0 : bVar.f297794a.hashCode()) * 31;
        wi0.b bVar2 = this.f77731b;
        int iHashCode2 = (iHashCode + (bVar2 == null ? 0 : bVar2.f297794a.hashCode())) * 31;
        wi0.b bVar3 = this.f77732c;
        return Boolean.hashCode(this.d) + ((iHashCode2 + (bVar3 != null ? bVar3.f297794a.hashCode() : 0)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f77730a);
        dest.writeSerializable(this.f77731b);
        dest.writeSerializable(this.f77732c);
        dest.writeInt(this.d ? 1 : 0);
    }

    public KycConsolidatedFlowContract$State(wi0.b bVar, wi0.b bVar2, wi0.b bVar3, boolean z) {
        this.f77730a = bVar;
        this.f77731b = bVar2;
        this.f77732c = bVar3;
        this.d = z;
    }

    public /* synthetic */ KycConsolidatedFlowContract$State(int i) {
        this(null, null, null, false);
    }
}
