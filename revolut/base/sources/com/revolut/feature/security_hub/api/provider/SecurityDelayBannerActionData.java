package com.revolut.feature.security_hub.api.provider;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/security_hub/api/provider/SecurityDelayBannerActionData;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_security_hub_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SecurityDelayBannerActionData implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<SecurityDelayBannerActionData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f85465a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f85466b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new SecurityDelayBannerActionData(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new SecurityDelayBannerActionData[i];
        }
    }

    public SecurityDelayBannerActionData(String securityDelayId, String transactionId) {
        Intrinsics.checkNotNullParameter(securityDelayId, "securityDelayId");
        Intrinsics.checkNotNullParameter(transactionId, "transactionId");
        this.f85465a = securityDelayId;
        this.f85466b = transactionId;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof SecurityDelayBannerActionData)) {
            return false;
        }
        SecurityDelayBannerActionData securityDelayBannerActionData = (SecurityDelayBannerActionData) obj2;
        return Intrinsics.f(this.f85465a, securityDelayBannerActionData.f85465a) && Intrinsics.f(this.f85466b, securityDelayBannerActionData.f85466b);
    }

    public final int hashCode() {
        return this.f85466b.hashCode() + (this.f85465a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f85465a);
        dest.writeString(this.f85466b);
    }
}
