package com.revolut.feature.pockets.impl.details_v2.pocket_details.multi_iban;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.feature.pockets.impl.details_v2.pocket_details.multi_iban.models.MultiIbanPayload;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/pockets/impl/details_v2/pocket_details/multi_iban/MultiIbanFlowContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_pockets_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class MultiIbanFlowContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<MultiIbanFlowContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MultiIbanPayload f80866a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AnalyticsProduct f80867b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new MultiIbanFlowContract$InputData(MultiIbanPayload.CREATOR.createFromParcel(parcel), (AnalyticsProduct) parcel.readParcelable(MultiIbanFlowContract$InputData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new MultiIbanFlowContract$InputData[i];
        }
    }

    public MultiIbanFlowContract$InputData(MultiIbanPayload payload, AnalyticsProduct analyticsProduct) {
        Intrinsics.checkNotNullParameter(payload, "payload");
        Intrinsics.checkNotNullParameter(analyticsProduct, "analyticsProduct");
        this.f80866a = payload;
        this.f80867b = analyticsProduct;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof MultiIbanFlowContract$InputData)) {
            return false;
        }
        MultiIbanFlowContract$InputData multiIbanFlowContract$InputData = (MultiIbanFlowContract$InputData) obj2;
        return Intrinsics.f(this.f80866a, multiIbanFlowContract$InputData.f80866a) && Intrinsics.f(this.f80867b, multiIbanFlowContract$InputData.f80867b);
    }

    public final int hashCode() {
        return this.f80867b.hashCode() + (this.f80866a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        this.f80866a.writeToParcel(dest, i);
        dest.writeParcelable(this.f80867b, i);
    }
}
