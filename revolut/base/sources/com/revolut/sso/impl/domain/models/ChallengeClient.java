package com.revolut.sso.impl.domain.models;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0081\b\u0018\u0000 \u00052\u00020\u0001:\u0001\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/revolut/sso/impl/domain/models/ChallengeClient;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ChallengeClient implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f106103a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f106104b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f106105c;
    public final String d;

    @NotNull
    public static final Parcelable.Creator<ChallengeClient> CREATOR = new b();

    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ChallengeClient(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ChallengeClient[i];
        }
    }

    public ChallengeClient(String name, String str, String str2, String str3) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.f106103a = name;
        this.f106104b = str;
        this.f106105c = str2;
        this.d = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ChallengeClient)) {
            return false;
        }
        ChallengeClient challengeClient = (ChallengeClient) obj2;
        return Intrinsics.f(this.f106103a, challengeClient.f106103a) && Intrinsics.f(this.f106104b, challengeClient.f106104b) && Intrinsics.f(this.f106105c, challengeClient.f106105c) && Intrinsics.f(this.d, challengeClient.d);
    }

    public final int hashCode() {
        int iHashCode = this.f106103a.hashCode() * 31;
        String str = this.f106104b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f106105c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f106103a);
        dest.writeString(this.f106104b);
        dest.writeString(this.f106105c);
        dest.writeString(this.d);
    }
}
