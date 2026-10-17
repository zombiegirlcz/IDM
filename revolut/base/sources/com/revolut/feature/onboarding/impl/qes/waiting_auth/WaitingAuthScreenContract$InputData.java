package com.revolut.feature.onboarding.impl.qes.waiting_auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.onboarding.api.esignature.models.ESignatureDetails;
import com.revolut.feature.onboarding.api.esignature.models.ESignatureWorkflowConfiguration;
import com.revolut.feature.onboarding.api.qes_terms.QesTermsAuthenticationMethod;
import com.revolut.kompot.common.IOData$Input;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/onboarding/impl/qes/waiting_auth/WaitingAuthScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_retail_onboarding_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class WaitingAuthScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<WaitingAuthScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ESignatureDetails f78528a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f78529b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ESignatureWorkflowConfiguration f78530c;
    public final QesTermsAuthenticationMethod d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new WaitingAuthScreenContract$InputData((ESignatureDetails) parcel.readParcelable(WaitingAuthScreenContract$InputData.class.getClassLoader()), parcel.createStringArrayList(), (ESignatureWorkflowConfiguration) parcel.readParcelable(WaitingAuthScreenContract$InputData.class.getClassLoader()), (QesTermsAuthenticationMethod) parcel.readParcelable(WaitingAuthScreenContract$InputData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new WaitingAuthScreenContract$InputData[i];
        }
    }

    public WaitingAuthScreenContract$InputData(ESignatureDetails eSignatureDetails, List termsIds, ESignatureWorkflowConfiguration eSignatureWorkflowConfiguration, QesTermsAuthenticationMethod authMehtod) {
        Intrinsics.checkNotNullParameter(termsIds, "termsIds");
        Intrinsics.checkNotNullParameter(authMehtod, "authMehtod");
        this.f78528a = eSignatureDetails;
        this.f78529b = termsIds;
        this.f78530c = eSignatureWorkflowConfiguration;
        this.d = authMehtod;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof WaitingAuthScreenContract$InputData)) {
            return false;
        }
        WaitingAuthScreenContract$InputData waitingAuthScreenContract$InputData = (WaitingAuthScreenContract$InputData) obj2;
        return Intrinsics.f(this.f78528a, waitingAuthScreenContract$InputData.f78528a) && Intrinsics.f(this.f78529b, waitingAuthScreenContract$InputData.f78529b) && Intrinsics.f(this.f78530c, waitingAuthScreenContract$InputData.f78530c) && Intrinsics.f(this.d, waitingAuthScreenContract$InputData.d);
    }

    public final int hashCode() {
        ESignatureDetails eSignatureDetails = this.f78528a;
        int iD = p.a.d((eSignatureDetails == null ? 0 : eSignatureDetails.hashCode()) * 31, 31, this.f78529b);
        ESignatureWorkflowConfiguration eSignatureWorkflowConfiguration = this.f78530c;
        return this.d.hashCode() + ((iD + (eSignatureWorkflowConfiguration != null ? eSignatureWorkflowConfiguration.hashCode() : 0)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f78528a, i);
        dest.writeStringList(this.f78529b);
        dest.writeParcelable(this.f78530c, i);
        dest.writeParcelable(this.d, i);
    }
}
