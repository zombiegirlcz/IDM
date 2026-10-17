package com.revolut.feature.credit.application.plugins.impl.ui.spousal_consent_initiator.request_consent;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/spousal_consent_initiator/request_consent/RequestConsentConfiguration;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class RequestConsentConfiguration implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<RequestConsentConfiguration> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HowItWorksItemContent f68453a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CantSendRequestDialogContent f68454b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new RequestConsentConfiguration(HowItWorksItemContent.CREATOR.createFromParcel(parcel), CantSendRequestDialogContent.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new RequestConsentConfiguration[i];
        }
    }

    public RequestConsentConfiguration(HowItWorksItemContent howItWorksItemContent, CantSendRequestDialogContent cantSendRequestDialogContent) {
        Intrinsics.checkNotNullParameter(howItWorksItemContent, "howItWorksItemContent");
        Intrinsics.checkNotNullParameter(cantSendRequestDialogContent, "cantSendRequestDialogContent");
        this.f68453a = howItWorksItemContent;
        this.f68454b = cantSendRequestDialogContent;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof RequestConsentConfiguration)) {
            return false;
        }
        RequestConsentConfiguration requestConsentConfiguration = (RequestConsentConfiguration) obj2;
        return Intrinsics.f(this.f68453a, requestConsentConfiguration.f68453a) && Intrinsics.f(this.f68454b, requestConsentConfiguration.f68454b);
    }

    public final int hashCode() {
        return this.f68454b.hashCode() + (this.f68453a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        this.f68453a.writeToParcel(dest, i);
        this.f68454b.writeToParcel(dest, i);
    }
}
