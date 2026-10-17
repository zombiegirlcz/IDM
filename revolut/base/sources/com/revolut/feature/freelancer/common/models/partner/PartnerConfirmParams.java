package com.revolut.feature.freelancer.common.models.partner;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/freelancer/common/models/partner/PartnerConfirmParams;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_freelancer_common_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PartnerConfirmParams implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<PartnerConfirmParams> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f73455a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f73456b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f73457c;
    public final String d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f73458g;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PartnerConfirmParams(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PartnerConfirmParams[i];
        }
    }

    public PartnerConfirmParams(String scope, String stateToken, String codeChallengeMethod, String redirectUri, String clientId, String codeChallenge, String integrationType) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(stateToken, "stateToken");
        Intrinsics.checkNotNullParameter(codeChallengeMethod, "codeChallengeMethod");
        Intrinsics.checkNotNullParameter(redirectUri, "redirectUri");
        Intrinsics.checkNotNullParameter(clientId, "clientId");
        Intrinsics.checkNotNullParameter(codeChallenge, "codeChallenge");
        Intrinsics.checkNotNullParameter(integrationType, "integrationType");
        this.f73455a = scope;
        this.f73456b = stateToken;
        this.f73457c = codeChallengeMethod;
        this.d = redirectUri;
        this.e = clientId;
        this.f = codeChallenge;
        this.f73458g = integrationType;
    }

    /* JADX INFO: renamed from: D8, reason: from getter */
    public final String getF() {
        return this.f;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getE() {
        return this.e;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getF73457c() {
        return this.f73457c;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getF73458g() {
        return this.f73458g;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getD() {
        return this.d;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getF73455a() {
        return this.f73455a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof PartnerConfirmParams)) {
            return false;
        }
        PartnerConfirmParams partnerConfirmParams = (PartnerConfirmParams) obj2;
        return Intrinsics.f(this.f73455a, partnerConfirmParams.f73455a) && Intrinsics.f(this.f73456b, partnerConfirmParams.f73456b) && Intrinsics.f(this.f73457c, partnerConfirmParams.f73457c) && Intrinsics.f(this.d, partnerConfirmParams.d) && Intrinsics.f(this.e, partnerConfirmParams.e) && Intrinsics.f(this.f, partnerConfirmParams.f) && Intrinsics.f(this.f73458g, partnerConfirmParams.f73458g);
    }

    public final int hashCode() {
        return this.f73458g.hashCode() + p.a.c(p.a.c(p.a.c(p.a.c(p.a.c(this.f73455a.hashCode() * 31, 31, this.f73456b), 31, this.f73457c), 31, this.d), 31, this.e), 31, this.f);
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final String getF73456b() {
        return this.f73456b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f73455a);
        dest.writeString(this.f73456b);
        dest.writeString(this.f73457c);
        dest.writeString(this.d);
        dest.writeString(this.e);
        dest.writeString(this.f);
        dest.writeString(this.f73458g);
    }
}
