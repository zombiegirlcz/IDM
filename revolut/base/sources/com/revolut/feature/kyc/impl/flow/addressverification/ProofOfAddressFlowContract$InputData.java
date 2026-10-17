package com.revolut.feature.kyc.impl.flow.addressverification;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/kyc/impl/flow/addressverification/ProofOfAddressFlowContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_kyc_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ProofOfAddressFlowContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<ProofOfAddressFlowContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ProofOfAddressFlowContract$Step f77680a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ProofOfAddressFlowContract$ActionOnResult f77681b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f77682c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ProofOfAddressFlowContract$InputData((ProofOfAddressFlowContract$Step) parcel.readParcelable(ProofOfAddressFlowContract$InputData.class.getClassLoader()), (ProofOfAddressFlowContract$ActionOnResult) parcel.readParcelable(ProofOfAddressFlowContract$InputData.class.getClassLoader()), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ProofOfAddressFlowContract$InputData[i];
        }
    }

    public ProofOfAddressFlowContract$InputData(ProofOfAddressFlowContract$Step step, ProofOfAddressFlowContract$ActionOnResult actionOnResult, boolean z) {
        Intrinsics.checkNotNullParameter(step, "step");
        Intrinsics.checkNotNullParameter(actionOnResult, "actionOnResult");
        this.f77680a = step;
        this.f77681b = actionOnResult;
        this.f77682c = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ProofOfAddressFlowContract$InputData)) {
            return false;
        }
        ProofOfAddressFlowContract$InputData proofOfAddressFlowContract$InputData = (ProofOfAddressFlowContract$InputData) obj2;
        return Intrinsics.f(this.f77680a, proofOfAddressFlowContract$InputData.f77680a) && Intrinsics.f(this.f77681b, proofOfAddressFlowContract$InputData.f77681b) && this.f77682c == proofOfAddressFlowContract$InputData.f77682c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f77682c) + ((this.f77681b.hashCode() + (this.f77680a.hashCode() * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f77680a, i);
        dest.writeParcelable(this.f77681b, i);
        dest.writeInt(this.f77682c ? 1 : 0);
    }

    public /* synthetic */ ProofOfAddressFlowContract$InputData(ProofOfAddressFlowContract$Step proofOfAddressFlowContract$Step, ProofOfAddressFlowContract$ActionOnResult proofOfAddressFlowContract$ActionOnResult) {
        this(proofOfAddressFlowContract$Step, proofOfAddressFlowContract$ActionOnResult, true);
    }
}
