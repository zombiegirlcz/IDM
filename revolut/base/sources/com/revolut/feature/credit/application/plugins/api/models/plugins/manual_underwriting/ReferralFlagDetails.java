package com.revolut.feature.credit.application.plugins.api.models.plugins.manual_underwriting;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/api/models/plugins/manual_underwriting/ReferralFlagDetails;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ReferralFlagDetails implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<ReferralFlagDetails> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f66485a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f66486b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ReferralFlagDetails(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ReferralFlagDetails[i];
        }
    }

    public ReferralFlagDetails(String title, String subtitle) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        this.f66485a = title;
        this.f66486b = subtitle;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ReferralFlagDetails)) {
            return false;
        }
        ReferralFlagDetails referralFlagDetails = (ReferralFlagDetails) obj2;
        return Intrinsics.f(this.f66485a, referralFlagDetails.f66485a) && Intrinsics.f(this.f66486b, referralFlagDetails.f66486b);
    }

    public final int hashCode() {
        return this.f66486b.hashCode() + (this.f66485a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f66485a);
        dest.writeString(this.f66486b);
    }
}
