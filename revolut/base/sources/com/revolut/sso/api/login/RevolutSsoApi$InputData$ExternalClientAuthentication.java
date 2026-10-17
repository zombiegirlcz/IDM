package com.revolut.sso.api.login;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import com.revolut.sso.api.models.RevolutAccountSession;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/sso/api/login/RevolutSsoApi$InputData$ExternalClientAuthentication", "", "", "toString", "()Ljava/lang/String;", "revolut_sso_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class RevolutSsoApi$InputData$ExternalClientAuthentication implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<RevolutSsoApi$InputData$ExternalClientAuthentication> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RevolutAccountSession f105850a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f105851b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f105852c;
    public final String d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new RevolutSsoApi$InputData$ExternalClientAuthentication(parcel.readInt() == 0 ? null : RevolutAccountSession.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.createStringArrayList(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new RevolutSsoApi$InputData$ExternalClientAuthentication[i];
        }
    }

    public RevolutSsoApi$InputData$ExternalClientAuthentication(RevolutAccountSession revolutAccountSession, String clientId, List securityProfiles, String str) {
        Intrinsics.checkNotNullParameter(clientId, "clientId");
        Intrinsics.checkNotNullParameter(securityProfiles, "securityProfiles");
        this.f105850a = revolutAccountSession;
        this.f105851b = clientId;
        this.f105852c = securityProfiles;
        this.d = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof RevolutSsoApi$InputData$ExternalClientAuthentication)) {
            return false;
        }
        RevolutSsoApi$InputData$ExternalClientAuthentication revolutSsoApi$InputData$ExternalClientAuthentication = (RevolutSsoApi$InputData$ExternalClientAuthentication) obj2;
        return Intrinsics.f(this.f105850a, revolutSsoApi$InputData$ExternalClientAuthentication.f105850a) && Intrinsics.f(this.f105851b, revolutSsoApi$InputData$ExternalClientAuthentication.f105851b) && Intrinsics.f(this.f105852c, revolutSsoApi$InputData$ExternalClientAuthentication.f105852c) && Intrinsics.f(this.d, revolutSsoApi$InputData$ExternalClientAuthentication.d);
    }

    public final int hashCode() {
        RevolutAccountSession revolutAccountSession = this.f105850a;
        int iD = p.a.d(p.a.c((revolutAccountSession == null ? 0 : revolutAccountSession.hashCode()) * 31, 31, this.f105851b), 31, this.f105852c);
        String str = this.d;
        return iD + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        RevolutAccountSession revolutAccountSession = this.f105850a;
        if (revolutAccountSession == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            revolutAccountSession.writeToParcel(dest, i);
        }
        dest.writeString(this.f105851b);
        dest.writeStringList(this.f105852c);
        dest.writeString(this.d);
    }
}
