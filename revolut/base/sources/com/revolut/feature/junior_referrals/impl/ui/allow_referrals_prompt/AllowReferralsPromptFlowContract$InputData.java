package com.revolut.feature.junior_referrals.impl.ui.allow_referrals_prompt;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/junior_referrals/impl/ui/allow_referrals_prompt/AllowReferralsPromptFlowContract$InputData", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "retail_feature_junior_referrals_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class AllowReferralsPromptFlowContract$InputData implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<AllowReferralsPromptFlowContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f77160a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f77161b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f77162c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new AllowReferralsPromptFlowContract$InputData(parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AllowReferralsPromptFlowContract$InputData[i];
        }
    }

    public AllowReferralsPromptFlowContract$InputData(String juniorFirstName, String termsUrl, String juniorId) {
        Intrinsics.checkNotNullParameter(juniorFirstName, "juniorFirstName");
        Intrinsics.checkNotNullParameter(termsUrl, "termsUrl");
        Intrinsics.checkNotNullParameter(juniorId, "juniorId");
        this.f77160a = juniorFirstName;
        this.f77161b = termsUrl;
        this.f77162c = juniorId;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof AllowReferralsPromptFlowContract$InputData)) {
            return false;
        }
        AllowReferralsPromptFlowContract$InputData allowReferralsPromptFlowContract$InputData = (AllowReferralsPromptFlowContract$InputData) obj2;
        return Intrinsics.f(this.f77160a, allowReferralsPromptFlowContract$InputData.f77160a) && Intrinsics.f(this.f77161b, allowReferralsPromptFlowContract$InputData.f77161b) && Intrinsics.f(this.f77162c, allowReferralsPromptFlowContract$InputData.f77162c);
    }

    public final int hashCode() {
        return this.f77162c.hashCode() + p.a.c(this.f77160a.hashCode() * 31, 31, this.f77161b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f77160a);
        dest.writeString(this.f77161b);
        dest.writeString(this.f77162c);
    }
}
