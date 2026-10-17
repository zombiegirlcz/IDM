package com.revolut.sso.api.login;

import android.os.Parcel;
import android.os.Parcelable;
import cjl.s;
import com.revolut.feature.identity.auth.domain.model.RegisteredIdentityId;
import com.revolut.kompot.common.IOData$Input;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.b;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"com/revolut/sso/api/login/RevolutSsoApi$InputData$OperationBoundAuthentication", "", "", "toString", "()Ljava/lang/String;", "Origin", "revolut_sso_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class RevolutSsoApi$InputData$OperationBoundAuthentication implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<RevolutSsoApi$InputData$OperationBoundAuthentication> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s f105853a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f105854b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f105855c;
    public final String d;
    public final String e;
    public final Origin f;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lcom/revolut/sso/api/login/RevolutSsoApi$InputData$OperationBoundAuthentication$Origin;", "Landroid/os/Parcelable;", "Default", "OneTimeFaceSignIn", "Lcom/revolut/sso/api/login/RevolutSsoApi$InputData$OperationBoundAuthentication$Origin$Default;", "Lcom/revolut/sso/api/login/RevolutSsoApi$InputData$OperationBoundAuthentication$Origin$OneTimeFaceSignIn;", "revolut_sso_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface Origin extends Parcelable {

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/sso/api/login/RevolutSsoApi$InputData$OperationBoundAuthentication$Origin$Default;", "Lcom/revolut/sso/api/login/RevolutSsoApi$InputData$OperationBoundAuthentication$Origin;", "<init>", "()V", "revolut_sso_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class Default implements Origin {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final Default f105856a = new Default();

            @NotNull
            public static final Parcelable.Creator<Default> CREATOR = new a();

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return Default.f105856a;
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Default[i];
                }
            }

            private Default() {
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

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/sso/api/login/RevolutSsoApi$InputData$OperationBoundAuthentication$Origin$OneTimeFaceSignIn;", "Lcom/revolut/sso/api/login/RevolutSsoApi$InputData$OperationBoundAuthentication$Origin;", "", "toString", "()Ljava/lang/String;", "revolut_sso_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class OneTimeFaceSignIn implements Origin {

            @NotNull
            public static final Parcelable.Creator<OneTimeFaceSignIn> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final long f105857a;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new OneTimeFaceSignIn(parcel.readLong());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new OneTimeFaceSignIn[i];
                }
            }

            public OneTimeFaceSignIn(long j2) {
                this.f105857a = j2;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof OneTimeFaceSignIn) && b.d(this.f105857a, ((OneTimeFaceSignIn) obj2).f105857a);
            }

            public final int hashCode() {
                b.Companion companion = b.INSTANCE;
                return Long.hashCode(this.f105857a);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeLong(this.f105857a);
            }
        }
    }

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            s sVarValueOf = s.valueOf(parcel.readString());
            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
            String string = parcel.readString();
            RegisteredIdentityId registeredIdentityId = (RegisteredIdentityId) parcel.readParcelable(RevolutSsoApi$InputData$OperationBoundAuthentication.class.getClassLoader());
            return new RevolutSsoApi$InputData$OperationBoundAuthentication(sVarValueOf, arrayListCreateStringArrayList, string, registeredIdentityId != null ? registeredIdentityId.f74764a : null, parcel.readString(), (Origin) parcel.readParcelable(RevolutSsoApi$InputData$OperationBoundAuthentication.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new RevolutSsoApi$InputData$OperationBoundAuthentication[i];
        }
    }

    public RevolutSsoApi$InputData$OperationBoundAuthentication(s routingContext, List securityProfiles, String str, String str2, String str3, Origin origin) {
        Intrinsics.checkNotNullParameter(routingContext, "routingContext");
        Intrinsics.checkNotNullParameter(securityProfiles, "securityProfiles");
        Intrinsics.checkNotNullParameter(origin, "origin");
        this.f105853a = routingContext;
        this.f105854b = securityProfiles;
        this.f105855c = str;
        this.d = str2;
        this.e = str3;
        this.f = origin;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0033  */
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
            boolean r1 = r5 instanceof com.revolut.sso.api.login.RevolutSsoApi$InputData$OperationBoundAuthentication
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            com.revolut.sso.api.login.RevolutSsoApi$InputData$OperationBoundAuthentication r5 = (com.revolut.sso.api.login.RevolutSsoApi$InputData$OperationBoundAuthentication) r5
            cjl.s r1 = r4.f105853a
            cjl.s r3 = r5.f105853a
            if (r1 == r3) goto L13
            return r2
        L13:
            java.util.List r1 = r4.f105854b
            java.util.List r3 = r5.f105854b
            boolean r1 = kotlin.jvm.internal.Intrinsics.f(r1, r3)
            if (r1 != 0) goto L1e
            return r2
        L1e:
            java.lang.String r1 = r4.f105855c
            java.lang.String r3 = r5.f105855c
            boolean r1 = kotlin.jvm.internal.Intrinsics.f(r1, r3)
            if (r1 != 0) goto L29
            return r2
        L29:
            java.lang.String r1 = r5.d
            java.lang.String r3 = r4.d
            if (r3 != 0) goto L35
            if (r1 != 0) goto L33
            r1 = r0
            goto L3c
        L33:
            r1 = r2
            goto L3c
        L35:
            if (r1 != 0) goto L38
            goto L33
        L38:
            boolean r1 = kotlin.jvm.internal.Intrinsics.f(r3, r1)
        L3c:
            if (r1 != 0) goto L3f
            return r2
        L3f:
            java.lang.String r1 = r4.e
            java.lang.String r3 = r5.e
            boolean r1 = kotlin.jvm.internal.Intrinsics.f(r1, r3)
            if (r1 != 0) goto L4a
            return r2
        L4a:
            com.revolut.sso.api.login.RevolutSsoApi$InputData$OperationBoundAuthentication$Origin r1 = r4.f
            com.revolut.sso.api.login.RevolutSsoApi$InputData$OperationBoundAuthentication$Origin r5 = r5.f
            boolean r5 = kotlin.jvm.internal.Intrinsics.f(r1, r5)
            if (r5 != 0) goto L55
            return r2
        L55:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.sso.api.login.RevolutSsoApi$InputData$OperationBoundAuthentication.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int iD = p.a.d(this.f105853a.hashCode() * 31, 31, this.f105854b);
        String str = this.f105855c;
        int iHashCode = (iD + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.e;
        return this.f.hashCode() + ((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f105853a.name());
        dest.writeStringList(this.f105854b);
        dest.writeString(this.f105855c);
        String str = this.d;
        dest.writeParcelable(str != null ? new RegisteredIdentityId(str) : null, i);
        dest.writeString(this.e);
        dest.writeParcelable(this.f, i);
    }

    public /* synthetic */ RevolutSsoApi$InputData$OperationBoundAuthentication(s sVar, List list, String str, int i) {
        this(sVar, list, str, null, null, Origin.Default.f105856a);
    }
}
