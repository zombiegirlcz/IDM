package com.revolut.feature.transfer.core.api.reason;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import krf.f;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/transfer/core/api/reason/ReasonForTransferInputData;", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_transfer_core_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ReasonForTransferInputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<ReasonForTransferInputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ReasonTransferDetails f92122a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f92123b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f92124c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ReasonForTransferInputData((ReasonTransferDetails) parcel.readParcelable(ReasonForTransferInputData.class.getClassLoader()), (f) parcel.readSerializable(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ReasonForTransferInputData[i];
        }
    }

    public ReasonForTransferInputData(ReasonTransferDetails transferDetails, f reasonConfig, boolean z) {
        Intrinsics.checkNotNullParameter(transferDetails, "transferDetails");
        Intrinsics.checkNotNullParameter(reasonConfig, "reasonConfig");
        this.f92122a = transferDetails;
        this.f92123b = reasonConfig;
        this.f92124c = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ReasonForTransferInputData)) {
            return false;
        }
        ReasonForTransferInputData reasonForTransferInputData = (ReasonForTransferInputData) obj2;
        return Intrinsics.f(this.f92122a, reasonForTransferInputData.f92122a) && Intrinsics.f(this.f92123b, reasonForTransferInputData.f92123b) && this.f92124c == reasonForTransferInputData.f92124c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f92124c) + ((this.f92123b.hashCode() + (this.f92122a.hashCode() * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f92122a, i);
        dest.writeSerializable(this.f92123b);
        dest.writeInt(this.f92124c ? 1 : 0);
    }
}
