package com.revolut.feature.apm.bizum.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.apm.core.models.recipients.BizumContact;
import com.revolut.feature.transfer.core.models.TransferMoneyPocket;
import com.revolut.kompot.common.IOData$Input;
import hrf.f;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/bizum/api/navigation/BizumTransferInputData;", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_apm_bizum_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BizumTransferInputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<BizumTransferInputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BizumContact f61561a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f61562b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TransferMoneyPocket f61563c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new BizumTransferInputData((BizumContact) parcel.readParcelable(BizumTransferInputData.class.getClassLoader()), f.valueOf(parcel.readString()), (TransferMoneyPocket) parcel.readParcelable(BizumTransferInputData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new BizumTransferInputData[i];
        }
    }

    public BizumTransferInputData(BizumContact recipient, f direction, TransferMoneyPocket fundingSource) {
        Intrinsics.checkNotNullParameter(recipient, "recipient");
        Intrinsics.checkNotNullParameter(direction, "direction");
        Intrinsics.checkNotNullParameter(fundingSource, "fundingSource");
        this.f61561a = recipient;
        this.f61562b = direction;
        this.f61563c = fundingSource;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof BizumTransferInputData)) {
            return false;
        }
        BizumTransferInputData bizumTransferInputData = (BizumTransferInputData) obj2;
        return Intrinsics.f(this.f61561a, bizumTransferInputData.f61561a) && this.f61562b == bizumTransferInputData.f61562b && Intrinsics.f(this.f61563c, bizumTransferInputData.f61563c);
    }

    public final int hashCode() {
        return this.f61563c.hashCode() + ((this.f61562b.hashCode() + (this.f61561a.hashCode() * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f61561a, i);
        dest.writeString(this.f61562b.name());
        dest.writeParcelable(this.f61563c, i);
    }
}
