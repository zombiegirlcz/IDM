package com.revolut.sso.api.models;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/sso/api/models/WebAuthnEvidence;", "Lcom/revolut/sso/api/models/Evidence;", "", "toString", "()Ljava/lang/String;", "revolut_sso_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class WebAuthnEvidence implements Evidence {

    @NotNull
    public static final Parcelable.Creator<WebAuthnEvidence> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f106001a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f106002b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f106003c;
    public final String d;
    public final String e;
    public final String f;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new WebAuthnEvidence(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new WebAuthnEvidence[i];
        }
    }

    public WebAuthnEvidence(String challengeId, String id10, String authenticatorData, String clientDataJson, String signature, String userHandle) {
        Intrinsics.checkNotNullParameter(challengeId, "challengeId");
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(authenticatorData, "authenticatorData");
        Intrinsics.checkNotNullParameter(clientDataJson, "clientDataJson");
        Intrinsics.checkNotNullParameter(signature, "signature");
        Intrinsics.checkNotNullParameter(userHandle, "userHandle");
        this.f106001a = challengeId;
        this.f106002b = id10;
        this.f106003c = authenticatorData;
        this.d = clientDataJson;
        this.e = signature;
        this.f = userHandle;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof WebAuthnEvidence)) {
            return false;
        }
        WebAuthnEvidence webAuthnEvidence = (WebAuthnEvidence) obj2;
        return Intrinsics.f(this.f106001a, webAuthnEvidence.f106001a) && Intrinsics.f(this.f106002b, webAuthnEvidence.f106002b) && Intrinsics.f(this.f106003c, webAuthnEvidence.f106003c) && Intrinsics.f(this.d, webAuthnEvidence.d) && Intrinsics.f(this.e, webAuthnEvidence.e) && Intrinsics.f(this.f, webAuthnEvidence.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + p.a.c(p.a.c(p.a.c(p.a.c(this.f106001a.hashCode() * 31, 31, this.f106002b), 31, this.f106003c), 31, this.d), 31, this.e);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f106001a);
        dest.writeString(this.f106002b);
        dest.writeString(this.f106003c);
        dest.writeString(this.d);
        dest.writeString(this.e);
        dest.writeString(this.f);
    }
}
