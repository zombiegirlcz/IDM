package com.revolut.feature.kyc.impl.hyperverge.govauth;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/kyc/impl/hyperverge/govauth/HypervergeDigilockerFlowContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_kyc_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class HypervergeDigilockerFlowContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<HypervergeDigilockerFlowContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f77768a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f77769b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new HypervergeDigilockerFlowContract$InputData(parcel.readString(), parcel.createStringArrayList());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new HypervergeDigilockerFlowContract$InputData[i];
        }
    }

    public HypervergeDigilockerFlowContract$InputData(String portalUrl, List redirectionUrls) {
        Intrinsics.checkNotNullParameter(portalUrl, "portalUrl");
        Intrinsics.checkNotNullParameter(redirectionUrls, "redirectionUrls");
        this.f77768a = portalUrl;
        this.f77769b = redirectionUrls;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof HypervergeDigilockerFlowContract$InputData)) {
            return false;
        }
        HypervergeDigilockerFlowContract$InputData hypervergeDigilockerFlowContract$InputData = (HypervergeDigilockerFlowContract$InputData) obj2;
        return Intrinsics.f(this.f77768a, hypervergeDigilockerFlowContract$InputData.f77768a) && Intrinsics.f(this.f77769b, hypervergeDigilockerFlowContract$InputData.f77769b);
    }

    public final int hashCode() {
        return this.f77769b.hashCode() + (this.f77768a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f77768a);
        dest.writeStringList(this.f77769b);
    }
}
