package com.revolut.feature.kyc.vendors.shared.api.uae_pass;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/kyc/vendors/shared/api/uae_pass/UaePassFlowConfiguration;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_kyc_vendors_shared_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class UaePassFlowConfiguration implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<UaePassFlowConfiguration> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f77908a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f77909b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f77910c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new UaePassFlowConfiguration(parcel.readString(), parcel.readString(), parcel.createStringArrayList());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new UaePassFlowConfiguration[i];
        }
    }

    public UaePassFlowConfiguration(String authorizationUrl, String applicationCallbackUrl, List terminalCallbackUrls) {
        Intrinsics.checkNotNullParameter(authorizationUrl, "authorizationUrl");
        Intrinsics.checkNotNullParameter(applicationCallbackUrl, "applicationCallbackUrl");
        Intrinsics.checkNotNullParameter(terminalCallbackUrls, "terminalCallbackUrls");
        this.f77908a = authorizationUrl;
        this.f77909b = applicationCallbackUrl;
        this.f77910c = terminalCallbackUrls;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof UaePassFlowConfiguration)) {
            return false;
        }
        UaePassFlowConfiguration uaePassFlowConfiguration = (UaePassFlowConfiguration) obj2;
        return Intrinsics.f(this.f77908a, uaePassFlowConfiguration.f77908a) && Intrinsics.f(this.f77909b, uaePassFlowConfiguration.f77909b) && Intrinsics.f(this.f77910c, uaePassFlowConfiguration.f77910c);
    }

    public final int hashCode() {
        return this.f77910c.hashCode() + p.a.c(this.f77908a.hashCode() * 31, 31, this.f77909b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f77908a);
        dest.writeString(this.f77909b);
        dest.writeStringList(this.f77910c);
    }
}
