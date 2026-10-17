package com.revolut.oauth.api.consent;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p.a;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0001\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/revolut/oauth/api/consent/OAuthAuthorizeParams;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "revolut_oauth_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class OAuthAuthorizeParams implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f98484a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f98485b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f98486c;
    public final String d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f98487g;

    @NotNull
    public static final Parcelable.Creator<OAuthAuthorizeParams> CREATOR = new b();

    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new OAuthAuthorizeParams(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new OAuthAuthorizeParams[i];
        }
    }

    public OAuthAuthorizeParams(String responseType, String clientId, String redirectUri, String str, String codeChallenge, String codeChallengeMethod, String state) {
        Intrinsics.checkNotNullParameter(responseType, "responseType");
        Intrinsics.checkNotNullParameter(clientId, "clientId");
        Intrinsics.checkNotNullParameter(redirectUri, "redirectUri");
        Intrinsics.checkNotNullParameter(codeChallenge, "codeChallenge");
        Intrinsics.checkNotNullParameter(codeChallengeMethod, "codeChallengeMethod");
        Intrinsics.checkNotNullParameter(state, "state");
        this.f98484a = responseType;
        this.f98485b = clientId;
        this.f98486c = redirectUri;
        this.d = str;
        this.e = codeChallenge;
        this.f = codeChallengeMethod;
        this.f98487g = state;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof OAuthAuthorizeParams)) {
            return false;
        }
        OAuthAuthorizeParams oAuthAuthorizeParams = (OAuthAuthorizeParams) obj2;
        return Intrinsics.f(this.f98484a, oAuthAuthorizeParams.f98484a) && Intrinsics.f(this.f98485b, oAuthAuthorizeParams.f98485b) && Intrinsics.f(this.f98486c, oAuthAuthorizeParams.f98486c) && Intrinsics.f(this.d, oAuthAuthorizeParams.d) && Intrinsics.f(this.e, oAuthAuthorizeParams.e) && Intrinsics.f(this.f, oAuthAuthorizeParams.f) && Intrinsics.f(this.f98487g, oAuthAuthorizeParams.f98487g);
    }

    public final int hashCode() {
        int iC = a.c(a.c(this.f98484a.hashCode() * 31, 31, this.f98485b), 31, this.f98486c);
        String str = this.d;
        return this.f98487g.hashCode() + a.c(a.c((iC + (str == null ? 0 : str.hashCode())) * 31, 31, this.e), 31, this.f);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f98484a);
        dest.writeString(this.f98485b);
        dest.writeString(this.f98486c);
        dest.writeString(this.d);
        dest.writeString(this.e);
        dest.writeString(this.f);
        dest.writeString(this.f98487g);
    }
}
