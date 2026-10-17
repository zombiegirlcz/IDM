package com.revolut.feature.junior_transfer.impl.ui.screen;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import hrf.f;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/junior_transfer/impl/ui/screen/JuniorTransferAmountScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_junior_transfer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class JuniorTransferAmountScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<JuniorTransferAmountScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f77455a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f77456b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f77457c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new JuniorTransferAmountScreenContract$InputData(parcel.readString(), f.valueOf(parcel.readString()), parcel.readLong());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new JuniorTransferAmountScreenContract$InputData[i];
        }
    }

    public JuniorTransferAmountScreenContract$InputData(String walletId, f direction, long j2) {
        Intrinsics.checkNotNullParameter(walletId, "walletId");
        Intrinsics.checkNotNullParameter(direction, "direction");
        this.f77455a = walletId;
        this.f77456b = direction;
        this.f77457c = j2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof JuniorTransferAmountScreenContract$InputData)) {
            return false;
        }
        JuniorTransferAmountScreenContract$InputData juniorTransferAmountScreenContract$InputData = (JuniorTransferAmountScreenContract$InputData) obj2;
        return Intrinsics.f(this.f77455a, juniorTransferAmountScreenContract$InputData.f77455a) && this.f77456b == juniorTransferAmountScreenContract$InputData.f77456b && this.f77457c == juniorTransferAmountScreenContract$InputData.f77457c;
    }

    public final int hashCode() {
        return Long.hashCode(this.f77457c) + ((this.f77456b.hashCode() + (this.f77455a.hashCode() * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f77455a);
        dest.writeString(this.f77456b.name());
        dest.writeLong(this.f77457c);
    }
}
