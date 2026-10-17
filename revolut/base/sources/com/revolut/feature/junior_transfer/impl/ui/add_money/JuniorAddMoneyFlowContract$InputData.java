package com.revolut.feature.junior_transfer.impl.ui.add_money;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.transfer.core.models.TransferMoneyPocket;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/junior_transfer/impl/ui/add_money/JuniorAddMoneyFlowContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_junior_transfer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class JuniorAddMoneyFlowContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<JuniorAddMoneyFlowContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f77425a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TransferMoneyPocket f77426b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new JuniorAddMoneyFlowContract$InputData(parcel.readString(), (TransferMoneyPocket) parcel.readParcelable(JuniorAddMoneyFlowContract$InputData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new JuniorAddMoneyFlowContract$InputData[i];
        }
    }

    public JuniorAddMoneyFlowContract$InputData(String pocketId, TransferMoneyPocket transferMoneyPocket) {
        Intrinsics.checkNotNullParameter(pocketId, "pocketId");
        Intrinsics.checkNotNullParameter(transferMoneyPocket, "transferMoneyPocket");
        this.f77425a = pocketId;
        this.f77426b = transferMoneyPocket;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof JuniorAddMoneyFlowContract$InputData)) {
            return false;
        }
        JuniorAddMoneyFlowContract$InputData juniorAddMoneyFlowContract$InputData = (JuniorAddMoneyFlowContract$InputData) obj2;
        return Intrinsics.f(this.f77425a, juniorAddMoneyFlowContract$InputData.f77425a) && Intrinsics.f(this.f77426b, juniorAddMoneyFlowContract$InputData.f77426b);
    }

    public final int hashCode() {
        return this.f77426b.hashCode() + (this.f77425a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f77425a);
        dest.writeParcelable(this.f77426b, i);
    }
}
