package com.revolut.feature.transfer_reasons.impl.ui.search;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.transfer_reasons.models.interactor.TransferReasonsRequest;
import com.revolut.feature.transfer_reasons.models.reason.TransferReasonCategory;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ttf.b;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/transfer_reasons/impl/ui/search/TransferReasonsSearchScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_transfer_reasons_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TransferReasonsSearchScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<TransferReasonsSearchScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f92395a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TransferReasonCategory f92396b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TransferReasonsRequest f92397c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new TransferReasonsSearchScreenContract$InputData(b.valueOf(parcel.readString()), (TransferReasonCategory) parcel.readParcelable(TransferReasonsSearchScreenContract$InputData.class.getClassLoader()), (TransferReasonsRequest) parcel.readParcelable(TransferReasonsSearchScreenContract$InputData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TransferReasonsSearchScreenContract$InputData[i];
        }
    }

    public TransferReasonsSearchScreenContract$InputData(b catalogue, TransferReasonCategory category, TransferReasonsRequest reasonsRequest) {
        Intrinsics.checkNotNullParameter(catalogue, "catalogue");
        Intrinsics.checkNotNullParameter(category, "category");
        Intrinsics.checkNotNullParameter(reasonsRequest, "reasonsRequest");
        this.f92395a = catalogue;
        this.f92396b = category;
        this.f92397c = reasonsRequest;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TransferReasonsSearchScreenContract$InputData)) {
            return false;
        }
        TransferReasonsSearchScreenContract$InputData transferReasonsSearchScreenContract$InputData = (TransferReasonsSearchScreenContract$InputData) obj2;
        return this.f92395a == transferReasonsSearchScreenContract$InputData.f92395a && Intrinsics.f(this.f92396b, transferReasonsSearchScreenContract$InputData.f92396b) && Intrinsics.f(this.f92397c, transferReasonsSearchScreenContract$InputData.f92397c);
    }

    public final int hashCode() {
        return this.f92397c.hashCode() + ((this.f92396b.hashCode() + (this.f92395a.hashCode() * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f92395a.name());
        dest.writeParcelable(this.f92396b, i);
        dest.writeParcelable(this.f92397c, i);
    }
}
