package com.revolut.feature.external_accounts.impl.ui.flow.link_external;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.external_accounts.api.navigation.ExternalAccountsFeatureConfig;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/external_accounts/impl/ui/flow/link_external/LinkExternalAccountFlowContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class LinkExternalAccountFlowContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<LinkExternalAccountFlowContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ExternalAccountsFeatureConfig.Configuration.TrueLayer f72912a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ExternalAccountsFeatureConfig.Configuration.DirectLink f72913b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f72914c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new LinkExternalAccountFlowContract$InputData((ExternalAccountsFeatureConfig.Configuration.TrueLayer) parcel.readParcelable(LinkExternalAccountFlowContract$InputData.class.getClassLoader()), (ExternalAccountsFeatureConfig.Configuration.DirectLink) parcel.readParcelable(LinkExternalAccountFlowContract$InputData.class.getClassLoader()), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new LinkExternalAccountFlowContract$InputData[i];
        }
    }

    public LinkExternalAccountFlowContract$InputData(ExternalAccountsFeatureConfig.Configuration.TrueLayer trueLayer, ExternalAccountsFeatureConfig.Configuration.DirectLink directLink, boolean z) {
        this.f72912a = trueLayer;
        this.f72913b = directLink;
        this.f72914c = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof LinkExternalAccountFlowContract$InputData)) {
            return false;
        }
        LinkExternalAccountFlowContract$InputData linkExternalAccountFlowContract$InputData = (LinkExternalAccountFlowContract$InputData) obj2;
        return Intrinsics.f(this.f72912a, linkExternalAccountFlowContract$InputData.f72912a) && Intrinsics.f(this.f72913b, linkExternalAccountFlowContract$InputData.f72913b) && this.f72914c == linkExternalAccountFlowContract$InputData.f72914c;
    }

    public final int hashCode() {
        ExternalAccountsFeatureConfig.Configuration.TrueLayer trueLayer = this.f72912a;
        int iHashCode = (trueLayer == null ? 0 : trueLayer.hashCode()) * 31;
        ExternalAccountsFeatureConfig.Configuration.DirectLink directLink = this.f72913b;
        return Boolean.hashCode(this.f72914c) + ((iHashCode + (directLink != null ? directLink.hashCode() : 0)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f72912a, i);
        dest.writeParcelable(this.f72913b, i);
        dest.writeInt(this.f72914c ? 1 : 0);
    }
}
