package com.revolut.feature.kyc.impl.hyperverge.videoconference;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/kyc/impl/hyperverge/videoconference/HypervergeVideoKycFlowContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_kyc_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class HypervergeVideoKycFlowContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<HypervergeVideoKycFlowContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f77772a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f77773b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new HypervergeVideoKycFlowContract$InputData(parcel.readString(), parcel.createStringArrayList());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new HypervergeVideoKycFlowContract$InputData[i];
        }
    }

    public HypervergeVideoKycFlowContract$InputData(String portalUrl, List redirectionUrls) {
        Intrinsics.checkNotNullParameter(portalUrl, "portalUrl");
        Intrinsics.checkNotNullParameter(redirectionUrls, "redirectionUrls");
        this.f77772a = portalUrl;
        this.f77773b = redirectionUrls;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof HypervergeVideoKycFlowContract$InputData)) {
            return false;
        }
        HypervergeVideoKycFlowContract$InputData hypervergeVideoKycFlowContract$InputData = (HypervergeVideoKycFlowContract$InputData) obj2;
        return Intrinsics.f(this.f77772a, hypervergeVideoKycFlowContract$InputData.f77772a) && Intrinsics.f(this.f77773b, hypervergeVideoKycFlowContract$InputData.f77773b);
    }

    public final int hashCode() {
        return this.f77773b.hashCode() + (this.f77772a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f77772a);
        dest.writeStringList(this.f77773b);
    }
}
