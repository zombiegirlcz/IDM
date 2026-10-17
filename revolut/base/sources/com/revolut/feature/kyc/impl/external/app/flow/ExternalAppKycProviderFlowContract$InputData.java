package com.revolut.feature.kyc.impl.external.app.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.kyc.impl.external.ExternalKycPromptConfiguration;
import com.revolut.feature.kyc.impl.external.ExternalKycRedirectDialogConfiguration;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/kyc/impl/external/app/flow/ExternalAppKycProviderFlowContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_kyc_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ExternalAppKycProviderFlowContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<ExternalAppKycProviderFlowContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f77651a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f77652b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f77653c;
    public final ExternalKycPromptConfiguration d;
    public final ExternalKycRedirectDialogConfiguration e;
    public final boolean f;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ExternalAppKycProviderFlowContract$InputData(parcel.readString(), parcel.readString(), parcel.readString(), ExternalKycPromptConfiguration.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : ExternalKycRedirectDialogConfiguration.CREATOR.createFromParcel(parcel), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ExternalAppKycProviderFlowContract$InputData[i];
        }
    }

    public ExternalAppKycProviderFlowContract$InputData(String packageIdProd, String str, String portalUrl, ExternalKycPromptConfiguration promptConfiguration, ExternalKycRedirectDialogConfiguration externalKycRedirectDialogConfiguration, boolean z) {
        Intrinsics.checkNotNullParameter(packageIdProd, "packageIdProd");
        Intrinsics.checkNotNullParameter(portalUrl, "portalUrl");
        Intrinsics.checkNotNullParameter(promptConfiguration, "promptConfiguration");
        this.f77651a = packageIdProd;
        this.f77652b = str;
        this.f77653c = portalUrl;
        this.d = promptConfiguration;
        this.e = externalKycRedirectDialogConfiguration;
        this.f = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ExternalAppKycProviderFlowContract$InputData)) {
            return false;
        }
        ExternalAppKycProviderFlowContract$InputData externalAppKycProviderFlowContract$InputData = (ExternalAppKycProviderFlowContract$InputData) obj2;
        return Intrinsics.f(this.f77651a, externalAppKycProviderFlowContract$InputData.f77651a) && Intrinsics.f(this.f77652b, externalAppKycProviderFlowContract$InputData.f77652b) && Intrinsics.f(this.f77653c, externalAppKycProviderFlowContract$InputData.f77653c) && Intrinsics.f(this.d, externalAppKycProviderFlowContract$InputData.d) && Intrinsics.f(this.e, externalAppKycProviderFlowContract$InputData.e) && this.f == externalAppKycProviderFlowContract$InputData.f;
    }

    public final int hashCode() {
        int iHashCode = this.f77651a.hashCode() * 31;
        String str = this.f77652b;
        int iHashCode2 = (this.d.hashCode() + p.a.c((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f77653c)) * 31;
        ExternalKycRedirectDialogConfiguration externalKycRedirectDialogConfiguration = this.e;
        return Boolean.hashCode(this.f) + ((iHashCode2 + (externalKycRedirectDialogConfiguration != null ? externalKycRedirectDialogConfiguration.hashCode() : 0)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f77651a);
        dest.writeString(this.f77652b);
        dest.writeString(this.f77653c);
        this.d.writeToParcel(dest, i);
        ExternalKycRedirectDialogConfiguration externalKycRedirectDialogConfiguration = this.e;
        if (externalKycRedirectDialogConfiguration == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            externalKycRedirectDialogConfiguration.writeToParcel(dest, i);
        }
        dest.writeInt(this.f ? 1 : 0);
    }

    public /* synthetic */ ExternalAppKycProviderFlowContract$InputData(String str, String str2, String str3, ExternalKycPromptConfiguration externalKycPromptConfiguration, boolean z) {
        this(str, str2, str3, externalKycPromptConfiguration, null, z);
    }
}
