package com.revolut.feature.junior_transfer.impl.ui.flow.transfer;

import a0.d;
import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import hrf.f;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/junior_transfer/impl/ui/flow/transfer/JuniorTransferFlowContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_junior_transfer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class JuniorTransferFlowContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<JuniorTransferFlowContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f77442a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f77443b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f77444c;
    public final boolean d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new JuniorTransferFlowContract$InputData(parcel.readString(), f.valueOf(parcel.readString()), parcel.readLong(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new JuniorTransferFlowContract$InputData[i];
        }
    }

    public JuniorTransferFlowContract$InputData(String walletId, f direction, long j2, boolean z) {
        Intrinsics.checkNotNullParameter(walletId, "walletId");
        Intrinsics.checkNotNullParameter(direction, "direction");
        this.f77442a = walletId;
        this.f77443b = direction;
        this.f77444c = j2;
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
        if (!(obj2 instanceof JuniorTransferFlowContract$InputData)) {
            return false;
        }
        JuniorTransferFlowContract$InputData juniorTransferFlowContract$InputData = (JuniorTransferFlowContract$InputData) obj2;
        return Intrinsics.f(this.f77442a, juniorTransferFlowContract$InputData.f77442a) && this.f77443b == juniorTransferFlowContract$InputData.f77443b && this.f77444c == juniorTransferFlowContract$InputData.f77444c && this.d == juniorTransferFlowContract$InputData.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + d.c((this.f77443b.hashCode() + (this.f77442a.hashCode() * 31)) * 31, 31, this.f77444c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f77442a);
        dest.writeString(this.f77443b.name());
        dest.writeLong(this.f77444c);
        dest.writeInt(this.d ? 1 : 0);
    }

    public /* synthetic */ JuniorTransferFlowContract$InputData(f fVar, String str) {
        this(str, fVar, 0L, true);
    }
}
