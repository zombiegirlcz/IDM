package com.revolut.feature.freelancer.impl.ui.ecommerce.auth.screen;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/freelancer/impl/ui/ecommerce/auth/screen/FreelancerPluginAuthScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class FreelancerPluginAuthScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<FreelancerPluginAuthScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f73786a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f73787b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f73788c;
    public final String d;
    public final List e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f73789g;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new FreelancerPluginAuthScreenContract$InputData(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.createStringArrayList(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new FreelancerPluginAuthScreenContract$InputData[i];
        }
    }

    public FreelancerPluginAuthScreenContract$InputData(String clientId, String pkceCodeChallenge, String pkceCodeChallengeMethod, String redirectUri, String stateToken, List scopes, String integrationType) {
        Intrinsics.checkNotNullParameter(clientId, "clientId");
        Intrinsics.checkNotNullParameter(pkceCodeChallenge, "pkceCodeChallenge");
        Intrinsics.checkNotNullParameter(pkceCodeChallengeMethod, "pkceCodeChallengeMethod");
        Intrinsics.checkNotNullParameter(redirectUri, "redirectUri");
        Intrinsics.checkNotNullParameter(scopes, "scopes");
        Intrinsics.checkNotNullParameter(stateToken, "stateToken");
        Intrinsics.checkNotNullParameter(integrationType, "integrationType");
        this.f73786a = clientId;
        this.f73787b = pkceCodeChallenge;
        this.f73788c = pkceCodeChallengeMethod;
        this.d = redirectUri;
        this.e = scopes;
        this.f = stateToken;
        this.f73789g = integrationType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof FreelancerPluginAuthScreenContract$InputData)) {
            return false;
        }
        FreelancerPluginAuthScreenContract$InputData freelancerPluginAuthScreenContract$InputData = (FreelancerPluginAuthScreenContract$InputData) obj2;
        return Intrinsics.f(this.f73786a, freelancerPluginAuthScreenContract$InputData.f73786a) && Intrinsics.f(this.f73787b, freelancerPluginAuthScreenContract$InputData.f73787b) && Intrinsics.f(this.f73788c, freelancerPluginAuthScreenContract$InputData.f73788c) && Intrinsics.f(this.d, freelancerPluginAuthScreenContract$InputData.d) && Intrinsics.f(this.e, freelancerPluginAuthScreenContract$InputData.e) && Intrinsics.f(this.f, freelancerPluginAuthScreenContract$InputData.f) && Intrinsics.f(this.f73789g, freelancerPluginAuthScreenContract$InputData.f73789g);
    }

    public final int hashCode() {
        return this.f73789g.hashCode() + p.a.c(p.a.d(p.a.c(p.a.c(p.a.c(this.f73786a.hashCode() * 31, 31, this.f73787b), 31, this.f73788c), 31, this.d), 31, this.e), 31, this.f);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f73786a);
        dest.writeString(this.f73787b);
        dest.writeString(this.f73788c);
        dest.writeString(this.d);
        dest.writeStringList(this.e);
        dest.writeString(this.f);
        dest.writeString(this.f73789g);
    }
}
