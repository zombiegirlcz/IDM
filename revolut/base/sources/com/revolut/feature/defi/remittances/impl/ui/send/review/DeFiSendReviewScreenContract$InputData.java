package com.revolut.feature.defi.remittances.impl.ui.send.review;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.defi.remittances.impl.domain.model.DeFiTransferQuoteRequest;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/defi/remittances/impl/ui/send/review/DeFiSendReviewScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_defi_remittances_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class DeFiSendReviewScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<DeFiSendReviewScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DeFiTransferQuoteRequest f71851a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f71852b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new DeFiSendReviewScreenContract$InputData(DeFiTransferQuoteRequest.CREATOR.createFromParcel(parcel), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new DeFiSendReviewScreenContract$InputData[i];
        }
    }

    public DeFiSendReviewScreenContract$InputData(DeFiTransferQuoteRequest quoteRequest, boolean z) {
        Intrinsics.checkNotNullParameter(quoteRequest, "quoteRequest");
        this.f71851a = quoteRequest;
        this.f71852b = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof DeFiSendReviewScreenContract$InputData)) {
            return false;
        }
        DeFiSendReviewScreenContract$InputData deFiSendReviewScreenContract$InputData = (DeFiSendReviewScreenContract$InputData) obj2;
        return Intrinsics.f(this.f71851a, deFiSendReviewScreenContract$InputData.f71851a) && this.f71852b == deFiSendReviewScreenContract$InputData.f71852b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f71852b) + (this.f71851a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        this.f71851a.writeToParcel(dest, i);
        dest.writeInt(this.f71852b ? 1 : 0);
    }
}
