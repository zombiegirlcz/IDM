package com.revolut.feature.junior_referrals.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.identity.auth.domain.model.RegisteredIdentityId;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import kii.e;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/junior_referrals/api/navigation/AllowReferralsPromptDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "retail_feature_junior_referrals_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class AllowReferralsPromptDestination implements KompotDestination {

    @NotNull
    public static final Parcelable.Creator<AllowReferralsPromptDestination> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f77157a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f77158b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f77159c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new AllowReferralsPromptDestination(parcel.readString(), parcel.readString(), ((RegisteredIdentityId) parcel.readParcelable(AllowReferralsPromptDestination.class.getClassLoader())).f74764a);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AllowReferralsPromptDestination[i];
        }
    }

    public AllowReferralsPromptDestination(String juniorFirstName, String termsUrl, String juniorRegId) {
        Intrinsics.checkNotNullParameter(juniorFirstName, "juniorFirstName");
        Intrinsics.checkNotNullParameter(termsUrl, "termsUrl");
        Intrinsics.checkNotNullParameter(juniorRegId, "juniorRegId");
        this.f77157a = juniorFirstName;
        this.f77158b = termsUrl;
        this.f77159c = juniorRegId;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof AllowReferralsPromptDestination)) {
            return false;
        }
        AllowReferralsPromptDestination allowReferralsPromptDestination = (AllowReferralsPromptDestination) obj2;
        return Intrinsics.f(this.f77157a, allowReferralsPromptDestination.f77157a) && Intrinsics.f(this.f77158b, allowReferralsPromptDestination.f77158b) && Intrinsics.f(this.f77159c, allowReferralsPromptDestination.f77159c);
    }

    public final int hashCode() {
        return this.f77159c.hashCode() + p.a.c(this.f77157a.hashCode() * 31, 31, this.f77158b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f77157a);
        dest.writeString(this.f77158b);
        e.x(this.f77159c, dest, i);
    }
}
