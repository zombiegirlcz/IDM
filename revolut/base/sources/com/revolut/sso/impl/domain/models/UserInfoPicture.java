package com.revolut.sso.impl.domain.models;

import android.os.Parcel;
import android.os.Parcelable;
import ehe.n;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import prk.o;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0081\b\u0018\u0000 \u00052\u00020\u0001:\u0001\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/revolut/sso/impl/domain/models/UserInfoPicture;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class UserInfoPicture implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f106214a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f106215b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set f106216c;

    @NotNull
    public static final Parcelable.Creator<UserInfoPicture> CREATOR = new b();

    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            int i = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(i);
            int iA = 0;
            int iD = 0;
            while (iD != i) {
                iD = j6.a.d(parcel, linkedHashMap, parcel.readString(), iD, 1);
            }
            int i2 = parcel.readInt();
            LinkedHashSet linkedHashSet = new LinkedHashSet(i2);
            while (iA != i2) {
                iA = o.a(parcel, linkedHashSet, iA, 1);
            }
            return new UserInfoPicture(linkedHashSet, linkedHashMap, string);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new UserInfoPicture[i];
        }
    }

    public UserInfoPicture(Set headersToIgnore, Map headers, String url2) {
        Intrinsics.checkNotNullParameter(url2, "url");
        Intrinsics.checkNotNullParameter(headers, "headers");
        Intrinsics.checkNotNullParameter(headersToIgnore, "headersToIgnore");
        this.f106214a = url2;
        this.f106215b = headers;
        this.f106216c = headersToIgnore;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof UserInfoPicture)) {
            return false;
        }
        UserInfoPicture userInfoPicture = (UserInfoPicture) obj2;
        return Intrinsics.f(this.f106214a, userInfoPicture.f106214a) && this.f106215b.equals(userInfoPicture.f106215b) && Intrinsics.f(this.f106216c, userInfoPicture.f106216c);
    }

    public final int hashCode() {
        return this.f106216c.hashCode() + p.a.b(this.f106214a.hashCode() * 31, 31, this.f106215b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f106214a);
        Iterator itT = o.t(this.f106215b, dest);
        while (itT.hasNext()) {
            Map.Entry entry = (Map.Entry) itT.next();
            dest.writeString((String) entry.getKey());
            dest.writeString((String) entry.getValue());
        }
        Iterator itV = n.v(this.f106216c, dest);
        while (itV.hasNext()) {
            dest.writeString((String) itV.next());
        }
    }
}
