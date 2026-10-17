package com.revolut.feature.kyc.impl.external.web.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/kyc/impl/external/web/flow/ExternalWebKycProviderFlowContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_kyc_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ExternalWebKycProviderFlowContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<ExternalWebKycProviderFlowContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lv8.a f77660a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f77661b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ExternalWebKycProviderFlowContract$InputData(lv8.a.valueOf(parcel.readString()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ExternalWebKycProviderFlowContract$InputData[i];
        }
    }

    public ExternalWebKycProviderFlowContract$InputData(lv8.a externalKycProviderPortal, String portalUrl) {
        Intrinsics.checkNotNullParameter(externalKycProviderPortal, "externalKycProviderPortal");
        Intrinsics.checkNotNullParameter(portalUrl, "portalUrl");
        this.f77660a = externalKycProviderPortal;
        this.f77661b = portalUrl;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ExternalWebKycProviderFlowContract$InputData)) {
            return false;
        }
        ExternalWebKycProviderFlowContract$InputData externalWebKycProviderFlowContract$InputData = (ExternalWebKycProviderFlowContract$InputData) obj2;
        return this.f77660a == externalWebKycProviderFlowContract$InputData.f77660a && Intrinsics.f(this.f77661b, externalWebKycProviderFlowContract$InputData.f77661b);
    }

    public final int hashCode() {
        return this.f77661b.hashCode() + (this.f77660a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f77660a.name());
        dest.writeString(this.f77661b);
    }
}
