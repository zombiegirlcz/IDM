package com.revolut.feature.apm.bizum.impl.ui.transfer.review;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.apm.bizum.impl.ui.transfer.transfer.BizumTransferData;
import com.revolut.feature.apm.bizum.impl.ui.transfer.transfer.BizumTransferReviewInfo;
import com.revolut.feature.apm.core.models.recipients.BizumContact;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/apm/bizum/impl/ui/transfer/review/BizumTransferReviewContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_apm_bizum_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BizumTransferReviewContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<BizumTransferReviewContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BizumContact f61626a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BizumTransferData f61627b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final BizumTransferReviewInfo f61628c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new BizumTransferReviewContract$InputData((BizumContact) parcel.readParcelable(BizumTransferReviewContract$InputData.class.getClassLoader()), BizumTransferData.CREATOR.createFromParcel(parcel), (BizumTransferReviewInfo) parcel.readParcelable(BizumTransferReviewContract$InputData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new BizumTransferReviewContract$InputData[i];
        }
    }

    public BizumTransferReviewContract$InputData(BizumContact recipient, BizumTransferData transferData, BizumTransferReviewInfo reviewInfo) {
        Intrinsics.checkNotNullParameter(recipient, "recipient");
        Intrinsics.checkNotNullParameter(transferData, "transferData");
        Intrinsics.checkNotNullParameter(reviewInfo, "reviewInfo");
        this.f61626a = recipient;
        this.f61627b = transferData;
        this.f61628c = reviewInfo;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof BizumTransferReviewContract$InputData)) {
            return false;
        }
        BizumTransferReviewContract$InputData bizumTransferReviewContract$InputData = (BizumTransferReviewContract$InputData) obj2;
        return Intrinsics.f(this.f61626a, bizumTransferReviewContract$InputData.f61626a) && Intrinsics.f(this.f61627b, bizumTransferReviewContract$InputData.f61627b) && Intrinsics.f(this.f61628c, bizumTransferReviewContract$InputData.f61628c);
    }

    public final int hashCode() {
        return this.f61628c.hashCode() + ((this.f61627b.hashCode() + (this.f61626a.hashCode() * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f61626a, i);
        this.f61627b.writeToParcel(dest, i);
        dest.writeParcelable(this.f61628c, i);
    }
}
