package com.revolut.sso.api.login;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.identity.auth.domain.model.RegisteredIdentityId;
import com.revolut.kompot.common.IOData$Input;
import com.revolut.sso.api.login.RevolutSsoApi$DefaultIdentifier;
import com.revolut.sso.api.models.RevolutAccountSession;
import java.util.ArrayList;
import java.util.List;
import kii.e;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"com/revolut/sso/api/login/RevolutSsoApi$InputData$SignIn", "", "", "toString", "()Ljava/lang/String;", "Origin", "revolut_sso_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class RevolutSsoApi$InputData$SignIn implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<RevolutSsoApi$InputData$SignIn> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RevolutAccountSession f105858a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final RevolutSsoApi$DefaultIdentifier f105859b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Origin f105860c;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"Lcom/revolut/sso/api/login/RevolutSsoApi$InputData$SignIn$Origin;", "Landroid/os/Parcelable;", "Default", "DuplicateAccount", "LostAccess", "SubAccount", "Lcom/revolut/sso/api/login/RevolutSsoApi$InputData$SignIn$Origin$Default;", "Lcom/revolut/sso/api/login/RevolutSsoApi$InputData$SignIn$Origin$DuplicateAccount;", "Lcom/revolut/sso/api/login/RevolutSsoApi$InputData$SignIn$Origin$LostAccess;", "Lcom/revolut/sso/api/login/RevolutSsoApi$InputData$SignIn$Origin$SubAccount;", "revolut_sso_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface Origin extends Parcelable {

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/sso/api/login/RevolutSsoApi$InputData$SignIn$Origin$Default;", "Lcom/revolut/sso/api/login/RevolutSsoApi$InputData$SignIn$Origin;", "", "toString", "()Ljava/lang/String;", "revolut_sso_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Default implements Origin {

            @NotNull
            public static final Parcelable.Creator<Default> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final boolean f105861a;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Default(parcel.readInt() != 0);
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Default[i];
                }
            }

            public Default(boolean z) {
                this.f105861a = z;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof Default) && this.f105861a == ((Default) obj2).f105861a;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.f105861a);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeInt(this.f105861a ? 1 : 0);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/sso/api/login/RevolutSsoApi$InputData$SignIn$Origin$DuplicateAccount;", "Lcom/revolut/sso/api/login/RevolutSsoApi$InputData$SignIn$Origin;", "", "toString", "()Ljava/lang/String;", "revolut_sso_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class DuplicateAccount implements Origin {

            @NotNull
            public static final Parcelable.Creator<DuplicateAccount> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f105862a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final String f105863b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final List f105864c;
            public final boolean d;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new DuplicateAccount(parcel.readString(), parcel.readString(), parcel.createStringArrayList(), parcel.readInt() != 0);
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new DuplicateAccount[i];
                }
            }

            public DuplicateAccount(String identityId, String str, ArrayList arrayList, boolean z) {
                Intrinsics.checkNotNullParameter(identityId, "identityId");
                this.f105862a = identityId;
                this.f105863b = str;
                this.f105864c = arrayList;
                this.d = z;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof DuplicateAccount)) {
                    return false;
                }
                DuplicateAccount duplicateAccount = (DuplicateAccount) obj2;
                return Intrinsics.f(this.f105862a, duplicateAccount.f105862a) && Intrinsics.f(this.f105863b, duplicateAccount.f105863b) && Intrinsics.f(this.f105864c, duplicateAccount.f105864c) && this.d == duplicateAccount.d;
            }

            public final int hashCode() {
                int iHashCode = this.f105862a.hashCode() * 31;
                String str = this.f105863b;
                int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
                List list = this.f105864c;
                return Boolean.hashCode(this.d) + ((iHashCode2 + (list != null ? list.hashCode() : 0)) * 31);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f105862a);
                dest.writeString(this.f105863b);
                dest.writeStringList(this.f105864c);
                dest.writeInt(this.d ? 1 : 0);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/sso/api/login/RevolutSsoApi$InputData$SignIn$Origin$LostAccess;", "Lcom/revolut/sso/api/login/RevolutSsoApi$InputData$SignIn$Origin;", "<init>", "()V", "revolut_sso_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class LostAccess implements Origin {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final LostAccess f105865a = new LostAccess();

            @NotNull
            public static final Parcelable.Creator<LostAccess> CREATOR = new a();

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return LostAccess.f105865a;
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new LostAccess[i];
                }
            }

            private LostAccess() {
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/sso/api/login/RevolutSsoApi$InputData$SignIn$Origin$SubAccount;", "Lcom/revolut/sso/api/login/RevolutSsoApi$InputData$SignIn$Origin;", "", "toString", "()Ljava/lang/String;", "revolut_sso_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class SubAccount implements Origin {

            @NotNull
            public static final Parcelable.Creator<SubAccount> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f105866a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Boolean f105867b;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Boolean boolValueOf;
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    String str = ((RegisteredIdentityId) parcel.readParcelable(SubAccount.class.getClassLoader())).f74764a;
                    if (parcel.readInt() == 0) {
                        boolValueOf = null;
                    } else {
                        boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
                    }
                    return new SubAccount(str, boolValueOf);
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new SubAccount[i];
                }
            }

            public SubAccount(String accountId, Boolean bool) {
                Intrinsics.checkNotNullParameter(accountId, "accountId");
                this.f105866a = accountId;
                this.f105867b = bool;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof SubAccount)) {
                    return false;
                }
                SubAccount subAccount = (SubAccount) obj2;
                return Intrinsics.f(this.f105866a, subAccount.f105866a) && Intrinsics.f(this.f105867b, subAccount.f105867b);
            }

            public final int hashCode() {
                int iHashCode = this.f105866a.hashCode() * 31;
                Boolean bool = this.f105867b;
                return iHashCode + (bool == null ? 0 : bool.hashCode());
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                e.x(this.f105866a, dest, i);
                Boolean bool = this.f105867b;
                if (bool == null) {
                    dest.writeInt(0);
                } else {
                    p.a.A(dest, 1, bool);
                }
            }
        }
    }

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new RevolutSsoApi$InputData$SignIn(parcel.readInt() == 0 ? null : RevolutAccountSession.CREATOR.createFromParcel(parcel), (RevolutSsoApi$DefaultIdentifier) parcel.readParcelable(RevolutSsoApi$InputData$SignIn.class.getClassLoader()), (Origin) parcel.readParcelable(RevolutSsoApi$InputData$SignIn.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new RevolutSsoApi$InputData$SignIn[i];
        }
    }

    public RevolutSsoApi$InputData$SignIn(RevolutAccountSession revolutAccountSession, RevolutSsoApi$DefaultIdentifier defaultIdentifier, Origin origin) {
        Intrinsics.checkNotNullParameter(defaultIdentifier, "defaultIdentifier");
        Intrinsics.checkNotNullParameter(origin, "origin");
        this.f105858a = revolutAccountSession;
        this.f105859b = defaultIdentifier;
        this.f105860c = origin;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof RevolutSsoApi$InputData$SignIn)) {
            return false;
        }
        RevolutSsoApi$InputData$SignIn revolutSsoApi$InputData$SignIn = (RevolutSsoApi$InputData$SignIn) obj2;
        return Intrinsics.f(this.f105858a, revolutSsoApi$InputData$SignIn.f105858a) && Intrinsics.f(this.f105859b, revolutSsoApi$InputData$SignIn.f105859b) && Intrinsics.f(this.f105860c, revolutSsoApi$InputData$SignIn.f105860c);
    }

    public final int hashCode() {
        RevolutAccountSession revolutAccountSession = this.f105858a;
        return this.f105860c.hashCode() + ((this.f105859b.hashCode() + ((revolutAccountSession == null ? 0 : revolutAccountSession.hashCode()) * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        RevolutAccountSession revolutAccountSession = this.f105858a;
        if (revolutAccountSession == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            revolutAccountSession.writeToParcel(dest, i);
        }
        dest.writeParcelable(this.f105859b, i);
        dest.writeParcelable(this.f105860c, i);
    }

    public /* synthetic */ RevolutSsoApi$InputData$SignIn(RevolutAccountSession revolutAccountSession, Origin origin) {
        this(revolutAccountSession, RevolutSsoApi$DefaultIdentifier.Preferred.Phone, origin);
    }
}
