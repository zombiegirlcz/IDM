package com.revolut.sso.api.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.identity.auth.domain.model.IndividualIdentityId;
import com.revolut.feature.identity.auth.domain.model.RegisteredIdentityId;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0002\u0006\u0007J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lcom/revolut/sso/api/models/UserInfoFromApp;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "Email", "revolut_sso_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class UserInfoFromApp implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f105996a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f105997b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f105998c;
    public final Email d;

    @NotNull
    public static final Parcelable.Creator<UserInfoFromApp> CREATOR = new b();

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/sso/api/models/UserInfoFromApp$Email;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "revolut_sso_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Email implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<Email> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f105999a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f106000b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Email(parcel.readString(), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Email[i];
            }
        }

        public Email(String email, boolean z) {
            Intrinsics.checkNotNullParameter(email, "email");
            this.f105999a = email;
            this.f106000b = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Email)) {
                return false;
            }
            Email email = (Email) obj2;
            return Intrinsics.f(this.f105999a, email.f105999a) && this.f106000b == email.f106000b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f106000b) + (this.f105999a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f105999a);
            dest.writeInt(this.f106000b ? 1 : 0);
        }
    }

    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            IndividualIdentityId individualIdentityId = (IndividualIdentityId) parcel.readParcelable(UserInfoFromApp.class.getClassLoader());
            String str = individualIdentityId != null ? individualIdentityId.f74763a : null;
            RegisteredIdentityId registeredIdentityId = (RegisteredIdentityId) parcel.readParcelable(UserInfoFromApp.class.getClassLoader());
            return new UserInfoFromApp(str, registeredIdentityId != null ? registeredIdentityId.f74764a : null, parcel.readString(), parcel.readInt() != 0 ? Email.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new UserInfoFromApp[i];
        }
    }

    public UserInfoFromApp(String str, String str2, String str3, Email email) {
        this.f105996a = str;
        this.f105997b = str2;
        this.f105998c = str3;
        this.d = email;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0016  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof com.revolut.sso.api.models.UserInfoFromApp
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            com.revolut.sso.api.models.UserInfoFromApp r5 = (com.revolut.sso.api.models.UserInfoFromApp) r5
            java.lang.String r1 = r5.f105996a
            java.lang.String r3 = r4.f105996a
            if (r3 != 0) goto L18
            if (r1 != 0) goto L16
            r1 = r0
            goto L1f
        L16:
            r1 = r2
            goto L1f
        L18:
            if (r1 != 0) goto L1b
            goto L16
        L1b:
            boolean r1 = kotlin.jvm.internal.Intrinsics.f(r3, r1)
        L1f:
            if (r1 != 0) goto L22
            return r2
        L22:
            java.lang.String r1 = r5.f105997b
            java.lang.String r3 = r4.f105997b
            if (r3 != 0) goto L2e
            if (r1 != 0) goto L2c
            r1 = r0
            goto L35
        L2c:
            r1 = r2
            goto L35
        L2e:
            if (r1 != 0) goto L31
            goto L2c
        L31:
            boolean r1 = kotlin.jvm.internal.Intrinsics.f(r3, r1)
        L35:
            if (r1 != 0) goto L38
            return r2
        L38:
            java.lang.String r1 = r4.f105998c
            java.lang.String r3 = r5.f105998c
            boolean r1 = kotlin.jvm.internal.Intrinsics.f(r1, r3)
            if (r1 != 0) goto L43
            return r2
        L43:
            com.revolut.sso.api.models.UserInfoFromApp$Email r1 = r4.d
            com.revolut.sso.api.models.UserInfoFromApp$Email r5 = r5.d
            boolean r5 = kotlin.jvm.internal.Intrinsics.f(r1, r5)
            if (r5 != 0) goto L4e
            return r2
        L4e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.sso.api.models.UserInfoFromApp.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        String str = this.f105996a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f105997b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f105998c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Email email = this.d;
        return iHashCode3 + (email != null ? email.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        String str = this.f105996a;
        dest.writeParcelable(str != null ? new IndividualIdentityId(str) : null, i);
        String str2 = this.f105997b;
        dest.writeParcelable(str2 != null ? new RegisteredIdentityId(str2) : null, i);
        dest.writeString(this.f105998c);
        Email email = this.d;
        if (email == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            email.writeToParcel(dest, i);
        }
    }
}
