package com.revolut.sso.api.signin_social;

import android.os.Parcel;
import android.os.Parcelable;
import hjl.c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"com/revolut/sso/api/signin_social/LinkSocialAccountControllerModelExtension$SocialAccount", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "hjl/c", "revolut_sso_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class LinkSocialAccountControllerModelExtension$SocialAccount implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<LinkSocialAccountControllerModelExtension$SocialAccount> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f106023a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f106024b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f106025c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new LinkSocialAccountControllerModelExtension$SocialAccount(c.valueOf(parcel.readString()), parcel.readInt() != 0, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new LinkSocialAccountControllerModelExtension$SocialAccount[i];
        }
    }

    public LinkSocialAccountControllerModelExtension$SocialAccount(c provider, boolean z, String str) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        this.f106023a = provider;
        this.f106024b = z;
        this.f106025c = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof LinkSocialAccountControllerModelExtension$SocialAccount)) {
            return false;
        }
        LinkSocialAccountControllerModelExtension$SocialAccount linkSocialAccountControllerModelExtension$SocialAccount = (LinkSocialAccountControllerModelExtension$SocialAccount) obj2;
        return this.f106023a == linkSocialAccountControllerModelExtension$SocialAccount.f106023a && this.f106024b == linkSocialAccountControllerModelExtension$SocialAccount.f106024b && Intrinsics.f(this.f106025c, linkSocialAccountControllerModelExtension$SocialAccount.f106025c);
    }

    public final int hashCode() {
        int iC = j6.a.c(this.f106023a.hashCode() * 31, 31, this.f106024b);
        String str = this.f106025c;
        return iC + (str == null ? 0 : str.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f106023a.name());
        dest.writeInt(this.f106024b ? 1 : 0);
        dest.writeString(this.f106025c);
    }
}
