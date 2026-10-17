package com.revolut.feature.transfer.core.impl.ui.reason.summary;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.transfer.core.api.reason.ReasonTransferDetails;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import krf.c;
import krf.f;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/transfer/core/impl/ui/reason/summary/ReasonForTransferSummaryScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_transfer_core_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ReasonForTransferSummaryScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<ReasonForTransferSummaryScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ReasonTransferDetails f92214a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f92215b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f92216c;
    public final boolean d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ReasonForTransferSummaryScreenContract$InputData((ReasonTransferDetails) parcel.readParcelable(ReasonForTransferSummaryScreenContract$InputData.class.getClassLoader()), (f) parcel.readSerializable(), (c) parcel.readSerializable(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ReasonForTransferSummaryScreenContract$InputData[i];
        }
    }

    public ReasonForTransferSummaryScreenContract$InputData(ReasonTransferDetails transferDetails, f reasonConfig, c cVar, boolean z) {
        Intrinsics.checkNotNullParameter(transferDetails, "transferDetails");
        Intrinsics.checkNotNullParameter(reasonConfig, "reasonConfig");
        this.f92214a = transferDetails;
        this.f92215b = reasonConfig;
        this.f92216c = cVar;
        this.d = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ReasonForTransferSummaryScreenContract$InputData)) {
            return false;
        }
        ReasonForTransferSummaryScreenContract$InputData reasonForTransferSummaryScreenContract$InputData = (ReasonForTransferSummaryScreenContract$InputData) obj2;
        return Intrinsics.f(this.f92214a, reasonForTransferSummaryScreenContract$InputData.f92214a) && Intrinsics.f(this.f92215b, reasonForTransferSummaryScreenContract$InputData.f92215b) && Intrinsics.f(this.f92216c, reasonForTransferSummaryScreenContract$InputData.f92216c) && this.d == reasonForTransferSummaryScreenContract$InputData.d;
    }

    public final int hashCode() {
        int iHashCode = (this.f92215b.hashCode() + (this.f92214a.hashCode() * 31)) * 31;
        c cVar = this.f92216c;
        return Boolean.hashCode(this.d) + ((iHashCode + (cVar == null ? 0 : cVar.hashCode())) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f92214a, i);
        dest.writeSerializable(this.f92215b);
        dest.writeSerializable(this.f92216c);
        dest.writeInt(this.d ? 1 : 0);
    }
}
