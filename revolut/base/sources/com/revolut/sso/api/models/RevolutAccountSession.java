package com.revolut.sso.api.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.sso.api.accounts.RevolutAccount;
import java.time.Instant;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0001\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/revolut/sso/api/models/RevolutAccountSession;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "revolut_sso_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class RevolutAccountSession implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RevolutAccount f105973a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final UserInfo f105974b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Instant f105975c;

    @NotNull
    public static final Parcelable.Creator<RevolutAccountSession> CREATOR = new b();

    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new RevolutAccountSession((RevolutAccount) parcel.readParcelable(RevolutAccountSession.class.getClassLoader()), UserInfo.CREATOR.createFromParcel(parcel), (Instant) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new RevolutAccountSession[i];
        }
    }

    public RevolutAccountSession(RevolutAccount account, UserInfo userInfo, Instant issuedAt) {
        Intrinsics.checkNotNullParameter(account, "account");
        Intrinsics.checkNotNullParameter(userInfo, "userInfo");
        Intrinsics.checkNotNullParameter(issuedAt, "issuedAt");
        this.f105973a = account;
        this.f105974b = userInfo;
        this.f105975c = issuedAt;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof RevolutAccountSession)) {
            return false;
        }
        RevolutAccountSession revolutAccountSession = (RevolutAccountSession) obj2;
        return Intrinsics.f(this.f105973a, revolutAccountSession.f105973a) && Intrinsics.f(this.f105974b, revolutAccountSession.f105974b) && Intrinsics.f(this.f105975c, revolutAccountSession.f105975c);
    }

    public final int hashCode() {
        return this.f105975c.hashCode() + ((this.f105974b.hashCode() + (this.f105973a.hashCode() * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f105973a, i);
        this.f105974b.writeToParcel(dest, i);
        dest.writeSerializable(this.f105975c);
    }
}
