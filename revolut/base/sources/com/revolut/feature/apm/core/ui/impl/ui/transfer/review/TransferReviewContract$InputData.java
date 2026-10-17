package com.revolut.feature.apm.core.ui.impl.ui.transfer.review;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.feature.apm.core.models.transfers.ApmTransferDestination;
import com.revolut.feature.apm.core.ui.api.navigation.ApmTransferContract$InputData;
import com.revolut.feature.apm.core.ui.api.navigation.ApmTransferDirection;
import com.revolut.feature.apm.core.ui.impl.ui.transfer.helpers.models.TransferData;
import com.revolut.feature.apm.core.ui.impl.ui.transfer.helpers.models.TransferReviewInfo;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/apm/core/ui/impl/ui/transfer/review/TransferReviewContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_apm_core_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TransferReviewContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<TransferReviewContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ApmTransferDestination f62466a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ApmTransferDirection f62467b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TransferData f62468c;
    public final TransferReviewInfo d;
    public final Clause e;
    public final ApmTransferContract$InputData.FooterConfig f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f62469g;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new TransferReviewContract$InputData((ApmTransferDestination) parcel.readParcelable(TransferReviewContract$InputData.class.getClassLoader()), (ApmTransferDirection) parcel.readParcelable(TransferReviewContract$InputData.class.getClassLoader()), TransferData.CREATOR.createFromParcel(parcel), (TransferReviewInfo) parcel.readParcelable(TransferReviewContract$InputData.class.getClassLoader()), (Clause) parcel.readParcelable(TransferReviewContract$InputData.class.getClassLoader()), (ApmTransferContract$InputData.FooterConfig) parcel.readParcelable(TransferReviewContract$InputData.class.getClassLoader()), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TransferReviewContract$InputData[i];
        }
    }

    public TransferReviewContract$InputData(ApmTransferDestination destinationConfig, ApmTransferDirection direction, TransferData transferData, TransferReviewInfo reviewInfo, Clause descriptor, ApmTransferContract$InputData.FooterConfig footerConfig, boolean z) {
        Intrinsics.checkNotNullParameter(destinationConfig, "destinationConfig");
        Intrinsics.checkNotNullParameter(direction, "direction");
        Intrinsics.checkNotNullParameter(transferData, "transferData");
        Intrinsics.checkNotNullParameter(reviewInfo, "reviewInfo");
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        this.f62466a = destinationConfig;
        this.f62467b = direction;
        this.f62468c = transferData;
        this.d = reviewInfo;
        this.e = descriptor;
        this.f = footerConfig;
        this.f62469g = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TransferReviewContract$InputData)) {
            return false;
        }
        TransferReviewContract$InputData transferReviewContract$InputData = (TransferReviewContract$InputData) obj2;
        return Intrinsics.f(this.f62466a, transferReviewContract$InputData.f62466a) && Intrinsics.f(this.f62467b, transferReviewContract$InputData.f62467b) && Intrinsics.f(this.f62468c, transferReviewContract$InputData.f62468c) && Intrinsics.f(this.d, transferReviewContract$InputData.d) && Intrinsics.f(this.e, transferReviewContract$InputData.e) && Intrinsics.f(this.f, transferReviewContract$InputData.f) && this.f62469g == transferReviewContract$InputData.f62469g;
    }

    public final int hashCode() {
        int iA = p.a.a((this.d.hashCode() + ((this.f62468c.hashCode() + ((this.f62467b.hashCode() + (this.f62466a.hashCode() * 31)) * 31)) * 31)) * 31, 31, this.e);
        ApmTransferContract$InputData.FooterConfig footerConfig = this.f;
        return Boolean.hashCode(this.f62469g) + ((iA + (footerConfig == null ? 0 : footerConfig.hashCode())) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f62466a, i);
        dest.writeParcelable(this.f62467b, i);
        this.f62468c.writeToParcel(dest, i);
        dest.writeParcelable(this.d, i);
        dest.writeParcelable(this.e, i);
        dest.writeParcelable(this.f, i);
        dest.writeInt(this.f62469g ? 1 : 0);
    }
}
