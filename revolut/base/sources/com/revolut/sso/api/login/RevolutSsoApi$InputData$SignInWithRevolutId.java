package com.revolut.sso.api.login;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/sso/api/login/RevolutSsoApi$InputData$SignInWithRevolutId", "", "", "toString", "()Ljava/lang/String;", "revolut_sso_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class RevolutSsoApi$InputData$SignInWithRevolutId implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<RevolutSsoApi$InputData$SignInWithRevolutId> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f105868a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f105869b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f105870c;
    public final String d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new RevolutSsoApi$InputData$SignInWithRevolutId(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new RevolutSsoApi$InputData$SignInWithRevolutId[i];
        }
    }

    public RevolutSsoApi$InputData$SignInWithRevolutId(String clientId, String redirectUri, String scope, String state) {
        Intrinsics.checkNotNullParameter(clientId, "clientId");
        Intrinsics.checkNotNullParameter(redirectUri, "redirectUri");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(state, "state");
        this.f105868a = clientId;
        this.f105869b = redirectUri;
        this.f105870c = scope;
        this.d = state;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof RevolutSsoApi$InputData$SignInWithRevolutId)) {
            return false;
        }
        RevolutSsoApi$InputData$SignInWithRevolutId revolutSsoApi$InputData$SignInWithRevolutId = (RevolutSsoApi$InputData$SignInWithRevolutId) obj2;
        return Intrinsics.f(this.f105868a, revolutSsoApi$InputData$SignInWithRevolutId.f105868a) && Intrinsics.f(this.f105869b, revolutSsoApi$InputData$SignInWithRevolutId.f105869b) && Intrinsics.f(this.f105870c, revolutSsoApi$InputData$SignInWithRevolutId.f105870c) && Intrinsics.f(this.d, revolutSsoApi$InputData$SignInWithRevolutId.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + p.a.c(p.a.c(this.f105868a.hashCode() * 31, 31, this.f105869b), 31, this.f105870c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f105868a);
        dest.writeString(this.f105869b);
        dest.writeString(this.f105870c);
        dest.writeString(this.d);
    }
}
