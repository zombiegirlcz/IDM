package com.revolut.feature.apm.multibanco.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.transfer.core.models.TransferMoneyPocket;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/multibanco/api/navigation/MultibancoWithdrawalInputData;", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_apm_multibanco_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class MultibancoWithdrawalInputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<MultibancoWithdrawalInputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TransferMoneyPocket f62554a;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new MultibancoWithdrawalInputData((TransferMoneyPocket) parcel.readParcelable(MultibancoWithdrawalInputData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new MultibancoWithdrawalInputData[i];
        }
    }

    public MultibancoWithdrawalInputData() {
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
        return (obj2 instanceof MultibancoWithdrawalInputData) && Intrinsics.f(this.f62554a, ((MultibancoWithdrawalInputData) obj2).f62554a);
    }

    public final int hashCode() {
        return this.f62554a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f62554a, i);
    }

    public MultibancoWithdrawalInputData(TransferMoneyPocket moneyPocket) {
        Intrinsics.checkNotNullParameter(moneyPocket, "moneyPocket");
        this.f62554a = moneyPocket;
    }

    public /* synthetic */ MultibancoWithdrawalInputData(int i) {
        this(new TransferMoneyPocket(null, null, 3));
    }
}
