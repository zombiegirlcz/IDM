package com.revolut.sso.impl.ui.auth;

import android.os.Parcel;
import android.os.Parcelable;
import cjl.s;
import com.revolut.feature.identity.auth.domain.model.RegisteredIdentityId;
import com.revolut.kompot.common.IOData$Input;
import com.revolut.sso.api.login.RevolutSsoApi$DefaultIdentifier;
import com.revolut.sso.api.models.RevolutAccountSession;
import com.revolut.sso.impl.domain.models.Challenge;
import com.revolut.sso.impl.domain.models.Claim;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.b;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\fÀ\u0006\u0003"}, d2 = {"com/revolut/sso/impl/ui/auth/AuthenticationFlowContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "SignInWithRevolutId", "AccessRecovery", "SignIn", "OperationBoundAuthentication", "ExternalClientAuthentication", "Lcom/revolut/sso/impl/ui/auth/AuthenticationFlowContract$InputData$AccessRecovery;", "Lcom/revolut/sso/impl/ui/auth/AuthenticationFlowContract$InputData$ExternalClientAuthentication;", "Lcom/revolut/sso/impl/ui/auth/AuthenticationFlowContract$InputData$OperationBoundAuthentication;", "Lcom/revolut/sso/impl/ui/auth/AuthenticationFlowContract$InputData$SignIn;", "Lcom/revolut/sso/impl/ui/auth/AuthenticationFlowContract$InputData$SignInWithRevolutId;", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface AuthenticationFlowContract$InputData extends IOData$Input {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0002\u0006\u0007J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lcom/revolut/sso/impl/ui/auth/AuthenticationFlowContract$InputData$AccessRecovery;", "Lcom/revolut/sso/impl/ui/auth/AuthenticationFlowContract$InputData;", "", "toString", "()Ljava/lang/String;", "Companion", "Origin", "a", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AccessRecovery implements AuthenticationFlowContract$InputData {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final RevolutSsoApi$DefaultIdentifier f106218a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Origin f106219b;

        @NotNull
        public static final Parcelable.Creator<AccessRecovery> CREATOR = new b();

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lcom/revolut/sso/impl/ui/auth/AuthenticationFlowContract$InputData$AccessRecovery$Origin;", "Landroid/os/Parcelable;", "ForgotPasscode", "UnlockAppWithBiometrics", "Lcom/revolut/sso/impl/ui/auth/AuthenticationFlowContract$InputData$AccessRecovery$Origin$ForgotPasscode;", "Lcom/revolut/sso/impl/ui/auth/AuthenticationFlowContract$InputData$AccessRecovery$Origin$UnlockAppWithBiometrics;", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public interface Origin extends Parcelable {

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/sso/impl/ui/auth/AuthenticationFlowContract$InputData$AccessRecovery$Origin$ForgotPasscode;", "Lcom/revolut/sso/impl/ui/auth/AuthenticationFlowContract$InputData$AccessRecovery$Origin;", "<init>", "()V", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final class ForgotPasscode implements Origin {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final ForgotPasscode f106220a = new ForgotPasscode();

                @NotNull
                public static final Parcelable.Creator<ForgotPasscode> CREATOR = new a();

                public static final class a implements Parcelable.Creator {
                    @Override // android.os.Parcelable.Creator
                    public final Object createFromParcel(Parcel parcel) {
                        Intrinsics.checkNotNullParameter(parcel, "parcel");
                        parcel.readInt();
                        return ForgotPasscode.f106220a;
                    }

                    @Override // android.os.Parcelable.Creator
                    public final Object[] newArray(int i) {
                        return new ForgotPasscode[i];
                    }
                }

                private ForgotPasscode() {
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

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/sso/impl/ui/auth/AuthenticationFlowContract$InputData$AccessRecovery$Origin$UnlockAppWithBiometrics;", "Lcom/revolut/sso/impl/ui/auth/AuthenticationFlowContract$InputData$AccessRecovery$Origin;", "<init>", "()V", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final class UnlockAppWithBiometrics implements Origin {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final UnlockAppWithBiometrics f106221a = new UnlockAppWithBiometrics();

                @NotNull
                public static final Parcelable.Creator<UnlockAppWithBiometrics> CREATOR = new a();

                public static final class a implements Parcelable.Creator {
                    @Override // android.os.Parcelable.Creator
                    public final Object createFromParcel(Parcel parcel) {
                        Intrinsics.checkNotNullParameter(parcel, "parcel");
                        parcel.readInt();
                        return UnlockAppWithBiometrics.f106221a;
                    }

                    @Override // android.os.Parcelable.Creator
                    public final Object[] newArray(int i) {
                        return new UnlockAppWithBiometrics[i];
                    }
                }

                private UnlockAppWithBiometrics() {
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
        }

        public static final class b implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new AccessRecovery((RevolutSsoApi$DefaultIdentifier) parcel.readParcelable(AccessRecovery.class.getClassLoader()), (Origin) parcel.readParcelable(AccessRecovery.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AccessRecovery[i];
            }
        }

        public AccessRecovery(RevolutSsoApi$DefaultIdentifier defaultIdentifier, Origin origin) {
            Intrinsics.checkNotNullParameter(defaultIdentifier, "defaultIdentifier");
            Intrinsics.checkNotNullParameter(origin, "origin");
            this.f106218a = defaultIdentifier;
            this.f106219b = origin;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof AccessRecovery)) {
                return false;
            }
            AccessRecovery accessRecovery = (AccessRecovery) obj2;
            return Intrinsics.f(this.f106218a, accessRecovery.f106218a) && Intrinsics.f(this.f106219b, accessRecovery.f106219b);
        }

        public final int hashCode() {
            return this.f106219b.hashCode() + (this.f106218a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f106218a, i);
            dest.writeParcelable(this.f106219b, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0001\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/revolut/sso/impl/ui/auth/AuthenticationFlowContract$InputData$ExternalClientAuthentication;", "Lcom/revolut/sso/impl/ui/auth/AuthenticationFlowContract$InputData;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ExternalClientAuthentication implements AuthenticationFlowContract$InputData {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final RevolutAccountSession f106222a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f106223b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final List f106224c;
        public final String d;

        @NotNull
        public static final Parcelable.Creator<ExternalClientAuthentication> CREATOR = new b();

        public static final class b implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ExternalClientAuthentication((RevolutAccountSession) parcel.readParcelable(ExternalClientAuthentication.class.getClassLoader()), parcel.readString(), parcel.createStringArrayList(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ExternalClientAuthentication[i];
            }
        }

        public ExternalClientAuthentication(RevolutAccountSession revolutAccountSession, String clientId, List securityProfiles, String str) {
            Intrinsics.checkNotNullParameter(clientId, "clientId");
            Intrinsics.checkNotNullParameter(securityProfiles, "securityProfiles");
            this.f106222a = revolutAccountSession;
            this.f106223b = clientId;
            this.f106224c = securityProfiles;
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
            if (!(obj2 instanceof ExternalClientAuthentication)) {
                return false;
            }
            ExternalClientAuthentication externalClientAuthentication = (ExternalClientAuthentication) obj2;
            return Intrinsics.f(this.f106222a, externalClientAuthentication.f106222a) && Intrinsics.f(this.f106223b, externalClientAuthentication.f106223b) && Intrinsics.f(this.f106224c, externalClientAuthentication.f106224c) && Intrinsics.f(this.d, externalClientAuthentication.d);
        }

        public final int hashCode() {
            RevolutAccountSession revolutAccountSession = this.f106222a;
            int iD = p.a.d(p.a.c((revolutAccountSession == null ? 0 : revolutAccountSession.hashCode()) * 31, 31, this.f106223b), 31, this.f106224c);
            String str = this.d;
            return iD + (str != null ? str.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f106222a, i);
            dest.writeString(this.f106223b);
            dest.writeStringList(this.f106224c);
            dest.writeString(this.d);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0002\u0006\u0007J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lcom/revolut/sso/impl/ui/auth/AuthenticationFlowContract$InputData$OperationBoundAuthentication;", "Lcom/revolut/sso/impl/ui/auth/AuthenticationFlowContract$InputData;", "", "toString", "()Ljava/lang/String;", "Companion", "Origin", "a", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class OperationBoundAuthentication implements AuthenticationFlowContract$InputData {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final s f106225a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List f106226b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f106227c;
        public final String d;
        public final String e;
        public final String f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final Origin f106228g;

        @NotNull
        public static final Parcelable.Creator<OperationBoundAuthentication> CREATOR = new b();

        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lcom/revolut/sso/impl/ui/auth/AuthenticationFlowContract$InputData$OperationBoundAuthentication$Origin;", "Landroid/os/Parcelable;", "Default", "Delegated", "OneTimeFaceSignIn", "Lcom/revolut/sso/impl/ui/auth/AuthenticationFlowContract$InputData$OperationBoundAuthentication$Origin$Default;", "Lcom/revolut/sso/impl/ui/auth/AuthenticationFlowContract$InputData$OperationBoundAuthentication$Origin$Delegated;", "Lcom/revolut/sso/impl/ui/auth/AuthenticationFlowContract$InputData$OperationBoundAuthentication$Origin$OneTimeFaceSignIn;", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public interface Origin extends Parcelable {

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/sso/impl/ui/auth/AuthenticationFlowContract$InputData$OperationBoundAuthentication$Origin$Default;", "Lcom/revolut/sso/impl/ui/auth/AuthenticationFlowContract$InputData$OperationBoundAuthentication$Origin;", "<init>", "()V", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final class Default implements Origin {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final Default f106229a = new Default();

                @NotNull
                public static final Parcelable.Creator<Default> CREATOR = new a();

                public static final class a implements Parcelable.Creator {
                    @Override // android.os.Parcelable.Creator
                    public final Object createFromParcel(Parcel parcel) {
                        Intrinsics.checkNotNullParameter(parcel, "parcel");
                        parcel.readInt();
                        return Default.f106229a;
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

            @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/sso/impl/ui/auth/AuthenticationFlowContract$InputData$OperationBoundAuthentication$Origin$Delegated;", "Lcom/revolut/sso/impl/ui/auth/AuthenticationFlowContract$InputData$OperationBoundAuthentication$Origin;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class Delegated implements Origin {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final Delegated f106230a = new Delegated();

                @NotNull
                public static final Parcelable.Creator<Delegated> CREATOR = new a();

                public static final class a implements Parcelable.Creator {
                    @Override // android.os.Parcelable.Creator
                    public final Object createFromParcel(Parcel parcel) {
                        Intrinsics.checkNotNullParameter(parcel, "parcel");
                        parcel.readInt();
                        return Delegated.f106230a;
                    }

                    @Override // android.os.Parcelable.Creator
                    public final Object[] newArray(int i) {
                        return new Delegated[i];
                    }
                }

                private Delegated() {
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public final boolean equals(Object obj2) {
                    return this == obj2 || (obj2 instanceof Delegated);
                }

                public final int hashCode() {
                    return -822378619;
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel dest, int i) {
                    Intrinsics.checkNotNullParameter(dest, "dest");
                    dest.writeInt(1);
                }
            }

            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/sso/impl/ui/auth/AuthenticationFlowContract$InputData$OperationBoundAuthentication$Origin$OneTimeFaceSignIn;", "Lcom/revolut/sso/impl/ui/auth/AuthenticationFlowContract$InputData$OperationBoundAuthentication$Origin;", "", "toString", "()Ljava/lang/String;", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class OneTimeFaceSignIn implements Origin {

                @NotNull
                public static final Parcelable.Creator<OneTimeFaceSignIn> CREATOR = new a();

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final long f106231a;

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
                    this.f106231a = j2;
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public final boolean equals(Object obj2) {
                    if (this == obj2) {
                        return true;
                    }
                    return (obj2 instanceof OneTimeFaceSignIn) && kotlin.time.b.d(this.f106231a, ((OneTimeFaceSignIn) obj2).f106231a);
                }

                public final int hashCode() {
                    b.Companion companion = kotlin.time.b.INSTANCE;
                    return Long.hashCode(this.f106231a);
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel dest, int i) {
                    Intrinsics.checkNotNullParameter(dest, "dest");
                    dest.writeLong(this.f106231a);
                }
            }
        }

        public static final class b implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                s sVarValueOf = s.valueOf(parcel.readString());
                ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
                String string = parcel.readString();
                RegisteredIdentityId registeredIdentityId = (RegisteredIdentityId) parcel.readParcelable(OperationBoundAuthentication.class.getClassLoader());
                return new OperationBoundAuthentication(sVarValueOf, arrayListCreateStringArrayList, string, registeredIdentityId != null ? registeredIdentityId.f74764a : null, parcel.readString(), parcel.readString(), (Origin) parcel.readParcelable(OperationBoundAuthentication.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new OperationBoundAuthentication[i];
            }
        }

        public OperationBoundAuthentication(s routingContext, List securityProfiles, String str, String str2, String str3, String str4, Origin origin) {
            Intrinsics.checkNotNullParameter(routingContext, "routingContext");
            Intrinsics.checkNotNullParameter(securityProfiles, "securityProfiles");
            Intrinsics.checkNotNullParameter(origin, "origin");
            this.f106225a = routingContext;
            this.f106226b = securityProfiles;
            this.f106227c = str;
            this.d = str2;
            this.e = str3;
            this.f = str4;
            this.f106228g = origin;
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
                boolean r1 = r5 instanceof com.revolut.sso.impl.ui.auth.AuthenticationFlowContract$InputData.OperationBoundAuthentication
                r2 = 0
                if (r1 != 0) goto La
                return r2
            La:
                com.revolut.sso.impl.ui.auth.AuthenticationFlowContract$InputData$OperationBoundAuthentication r5 = (com.revolut.sso.impl.ui.auth.AuthenticationFlowContract$InputData.OperationBoundAuthentication) r5
                cjl.s r1 = r4.f106225a
                cjl.s r3 = r5.f106225a
                if (r1 == r3) goto L13
                return r2
            L13:
                java.util.List r1 = r4.f106226b
                java.util.List r3 = r5.f106226b
                boolean r1 = kotlin.jvm.internal.Intrinsics.f(r1, r3)
                if (r1 != 0) goto L1e
                return r2
            L1e:
                java.lang.String r1 = r4.f106227c
                java.lang.String r3 = r5.f106227c
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
                java.lang.String r1 = r4.f
                java.lang.String r3 = r5.f
                boolean r1 = kotlin.jvm.internal.Intrinsics.f(r1, r3)
                if (r1 != 0) goto L55
                return r2
            L55:
                com.revolut.sso.impl.ui.auth.AuthenticationFlowContract$InputData$OperationBoundAuthentication$Origin r1 = r4.f106228g
                com.revolut.sso.impl.ui.auth.AuthenticationFlowContract$InputData$OperationBoundAuthentication$Origin r5 = r5.f106228g
                boolean r5 = kotlin.jvm.internal.Intrinsics.f(r1, r5)
                if (r5 != 0) goto L60
                return r2
            L60:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.revolut.sso.impl.ui.auth.AuthenticationFlowContract$InputData.OperationBoundAuthentication.equals(java.lang.Object):boolean");
        }

        public final int hashCode() {
            int iD = p.a.d(this.f106225a.hashCode() * 31, 31, this.f106226b);
            String str = this.f106227c;
            int iHashCode = (iD + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.d;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.e;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.f;
            return this.f106228g.hashCode() + ((iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f106225a.name());
            dest.writeStringList(this.f106226b);
            dest.writeString(this.f106227c);
            String str = this.d;
            dest.writeParcelable(str != null ? new RegisteredIdentityId(str) : null, i);
            dest.writeString(this.e);
            dest.writeString(this.f);
            dest.writeParcelable(this.f106228g, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0002\u0006\u0007J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lcom/revolut/sso/impl/ui/auth/AuthenticationFlowContract$InputData$SignIn;", "Lcom/revolut/sso/impl/ui/auth/AuthenticationFlowContract$InputData;", "", "toString", "()Ljava/lang/String;", "Companion", "Origin", "a", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SignIn implements AuthenticationFlowContract$InputData {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final RevolutAccountSession f106232a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final RevolutSsoApi$DefaultIdentifier f106233b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Origin f106234c;

        @NotNull
        public static final Parcelable.Creator<SignIn> CREATOR = new b();

        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\fÀ\u0006\u0003"}, d2 = {"Lcom/revolut/sso/impl/ui/auth/AuthenticationFlowContract$InputData$SignIn$Origin;", "Landroid/os/Parcelable;", "Default", "DuplicateAccount", "LostAccess", "SignUp", "SubAccount", "Lcom/revolut/sso/impl/ui/auth/AuthenticationFlowContract$InputData$SignIn$Origin$Default;", "Lcom/revolut/sso/impl/ui/auth/AuthenticationFlowContract$InputData$SignIn$Origin$DuplicateAccount;", "Lcom/revolut/sso/impl/ui/auth/AuthenticationFlowContract$InputData$SignIn$Origin$LostAccess;", "Lcom/revolut/sso/impl/ui/auth/AuthenticationFlowContract$InputData$SignIn$Origin$SignUp;", "Lcom/revolut/sso/impl/ui/auth/AuthenticationFlowContract$InputData$SignIn$Origin$SubAccount;", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public interface Origin extends Parcelable {

            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/sso/impl/ui/auth/AuthenticationFlowContract$InputData$SignIn$Origin$Default;", "Lcom/revolut/sso/impl/ui/auth/AuthenticationFlowContract$InputData$SignIn$Origin;", "", "toString", "()Ljava/lang/String;", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class Default implements Origin {

                @NotNull
                public static final Parcelable.Creator<Default> CREATOR = new a();

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final boolean f106235a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final boolean f106236b;

                public static final class a implements Parcelable.Creator {
                    @Override // android.os.Parcelable.Creator
                    public final Object createFromParcel(Parcel parcel) {
                        Intrinsics.checkNotNullParameter(parcel, "parcel");
                        return new Default(parcel.readInt() != 0, parcel.readInt() != 0);
                    }

                    @Override // android.os.Parcelable.Creator
                    public final Object[] newArray(int i) {
                        return new Default[i];
                    }
                }

                public Default() {
                    this(false, 3);
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public final boolean equals(Object obj2) {
                    if (this == obj2) {
                        return true;
                    }
                    if (!(obj2 instanceof Default)) {
                        return false;
                    }
                    Default r56 = (Default) obj2;
                    return this.f106235a == r56.f106235a && this.f106236b == r56.f106236b;
                }

                public final int hashCode() {
                    return Boolean.hashCode(this.f106236b) + (Boolean.hashCode(this.f106235a) * 31);
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel dest, int i) {
                    Intrinsics.checkNotNullParameter(dest, "dest");
                    dest.writeInt(this.f106235a ? 1 : 0);
                    dest.writeInt(this.f106236b ? 1 : 0);
                }

                public Default(boolean z, boolean z3) {
                    this.f106235a = z;
                    this.f106236b = z3;
                }

                public /* synthetic */ Default(boolean z, int i) {
                    this((i & 1) != 0 ? false : z, false);
                }
            }

            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0001\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/revolut/sso/impl/ui/auth/AuthenticationFlowContract$InputData$SignIn$Origin$DuplicateAccount;", "Lcom/revolut/sso/impl/ui/auth/AuthenticationFlowContract$InputData$SignIn$Origin;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class DuplicateAccount implements Origin {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final String f106237a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final gkl.m f106238b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final List f106239c;
                public final boolean d;

                @NotNull
                public static final Parcelable.Creator<DuplicateAccount> CREATOR = new b();

                public static final class b implements Parcelable.Creator {
                    @Override // android.os.Parcelable.Creator
                    public final Object createFromParcel(Parcel parcel) {
                        Intrinsics.checkNotNullParameter(parcel, "parcel");
                        return new DuplicateAccount(Claim.IdentityId.CREATOR.createFromParcel(parcel).f106129a, parcel.readInt() == 0 ? null : gkl.m.valueOf(parcel.readString()), parcel.createStringArrayList(), parcel.readInt() != 0);
                    }

                    @Override // android.os.Parcelable.Creator
                    public final Object[] newArray(int i) {
                        return new DuplicateAccount[i];
                    }
                }

                public DuplicateAccount(String identityId, gkl.m mVar, List list, boolean z) {
                    Intrinsics.checkNotNullParameter(identityId, "identityId");
                    this.f106237a = identityId;
                    this.f106238b = mVar;
                    this.f106239c = list;
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
                    return Intrinsics.f(this.f106237a, duplicateAccount.f106237a) && this.f106238b == duplicateAccount.f106238b && Intrinsics.f(this.f106239c, duplicateAccount.f106239c) && this.d == duplicateAccount.d;
                }

                public final int hashCode() {
                    int iHashCode = this.f106237a.hashCode() * 31;
                    gkl.m mVar = this.f106238b;
                    int iHashCode2 = (iHashCode + (mVar == null ? 0 : mVar.hashCode())) * 31;
                    List list = this.f106239c;
                    return Boolean.hashCode(this.d) + ((iHashCode2 + (list != null ? list.hashCode() : 0)) * 31);
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel dest, int i) {
                    Intrinsics.checkNotNullParameter(dest, "dest");
                    Intrinsics.checkNotNullParameter(dest, "dest");
                    dest.writeString(this.f106237a);
                    gkl.m mVar = this.f106238b;
                    if (mVar == null) {
                        dest.writeInt(0);
                    } else {
                        dest.writeInt(1);
                        dest.writeString(mVar.name());
                    }
                    dest.writeStringList(this.f106239c);
                    dest.writeInt(this.d ? 1 : 0);
                }
            }

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/sso/impl/ui/auth/AuthenticationFlowContract$InputData$SignIn$Origin$LostAccess;", "Lcom/revolut/sso/impl/ui/auth/AuthenticationFlowContract$InputData$SignIn$Origin;", "<init>", "()V", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final class LostAccess implements Origin {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final LostAccess f106240a = new LostAccess();

                @NotNull
                public static final Parcelable.Creator<LostAccess> CREATOR = new a();

                public static final class a implements Parcelable.Creator {
                    @Override // android.os.Parcelable.Creator
                    public final Object createFromParcel(Parcel parcel) {
                        Intrinsics.checkNotNullParameter(parcel, "parcel");
                        parcel.readInt();
                        return LostAccess.f106240a;
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

            @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lcom/revolut/sso/impl/ui/auth/AuthenticationFlowContract$InputData$SignIn$Origin$SignUp;", "Lcom/revolut/sso/impl/ui/auth/AuthenticationFlowContract$InputData$SignIn$Origin;", "EvidenceRequired", "ClaimRequired", "Social", "Lcom/revolut/sso/impl/ui/auth/AuthenticationFlowContract$InputData$SignIn$Origin$SignUp$ClaimRequired;", "Lcom/revolut/sso/impl/ui/auth/AuthenticationFlowContract$InputData$SignIn$Origin$SignUp$EvidenceRequired;", "Lcom/revolut/sso/impl/ui/auth/AuthenticationFlowContract$InputData$SignIn$Origin$SignUp$Social;", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public interface SignUp extends Origin {

                @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0001\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/revolut/sso/impl/ui/auth/AuthenticationFlowContract$InputData$SignIn$Origin$SignUp$ClaimRequired;", "Lcom/revolut/sso/impl/ui/auth/AuthenticationFlowContract$InputData$SignIn$Origin$SignUp;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
                public static final /* data */ class ClaimRequired implements SignUp {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final boolean f106241a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final gkl.m f106242b;

                    @NotNull
                    public static final Parcelable.Creator<ClaimRequired> CREATOR = new b();

                    public static final class b implements Parcelable.Creator {
                        @Override // android.os.Parcelable.Creator
                        public final Object createFromParcel(Parcel parcel) {
                            Intrinsics.checkNotNullParameter(parcel, "parcel");
                            return new ClaimRequired(parcel.readInt() != 0, gkl.m.valueOf(parcel.readString()));
                        }

                        @Override // android.os.Parcelable.Creator
                        public final Object[] newArray(int i) {
                            return new ClaimRequired[i];
                        }
                    }

                    public ClaimRequired(boolean z, gkl.m claimName) {
                        Intrinsics.checkNotNullParameter(claimName, "claimName");
                        this.f106241a = z;
                        this.f106242b = claimName;
                    }

                    @Override // android.os.Parcelable
                    public final int describeContents() {
                        return 0;
                    }

                    public final boolean equals(Object obj2) {
                        if (this == obj2) {
                            return true;
                        }
                        if (!(obj2 instanceof ClaimRequired)) {
                            return false;
                        }
                        ClaimRequired claimRequired = (ClaimRequired) obj2;
                        return this.f106241a == claimRequired.f106241a && this.f106242b == claimRequired.f106242b;
                    }

                    public final int hashCode() {
                        return this.f106242b.hashCode() + (Boolean.hashCode(this.f106241a) * 31);
                    }

                    @Override // android.os.Parcelable
                    public final void writeToParcel(Parcel dest, int i) {
                        Intrinsics.checkNotNullParameter(dest, "dest");
                        dest.writeInt(this.f106241a ? 1 : 0);
                        dest.writeString(this.f106242b.name());
                    }
                }

                @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0001\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/revolut/sso/impl/ui/auth/AuthenticationFlowContract$InputData$SignIn$Origin$SignUp$EvidenceRequired;", "Lcom/revolut/sso/impl/ui/auth/AuthenticationFlowContract$InputData$SignIn$Origin$SignUp;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
                public static final /* data */ class EvidenceRequired implements SignUp {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final boolean f106243a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final Challenge f106244b;

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    public final List f106245c;

                    @NotNull
                    public static final Parcelable.Creator<EvidenceRequired> CREATOR = new b();

                    public static final class b implements Parcelable.Creator {
                        @Override // android.os.Parcelable.Creator
                        public final Object createFromParcel(Parcel parcel) {
                            Intrinsics.checkNotNullParameter(parcel, "parcel");
                            boolean z = parcel.readInt() != 0;
                            Challenge challengeCreateFromParcel = Challenge.CREATOR.createFromParcel(parcel);
                            int i = parcel.readInt();
                            ArrayList arrayList = new ArrayList(i);
                            for (int i2 = 0; i2 != i; i2++) {
                                arrayList.add(jkl.i.valueOf(parcel.readString()));
                            }
                            return new EvidenceRequired(z, challengeCreateFromParcel, arrayList);
                        }

                        @Override // android.os.Parcelable.Creator
                        public final Object[] newArray(int i) {
                            return new EvidenceRequired[i];
                        }
                    }

                    public EvidenceRequired(boolean z, Challenge challenge, List availableMethods) {
                        Intrinsics.checkNotNullParameter(challenge, "challenge");
                        Intrinsics.checkNotNullParameter(availableMethods, "availableMethods");
                        this.f106243a = z;
                        this.f106244b = challenge;
                        this.f106245c = availableMethods;
                    }

                    @Override // android.os.Parcelable
                    public final int describeContents() {
                        return 0;
                    }

                    public final boolean equals(Object obj2) {
                        if (this == obj2) {
                            return true;
                        }
                        if (!(obj2 instanceof EvidenceRequired)) {
                            return false;
                        }
                        EvidenceRequired evidenceRequired = (EvidenceRequired) obj2;
                        return this.f106243a == evidenceRequired.f106243a && Intrinsics.f(this.f106244b, evidenceRequired.f106244b) && Intrinsics.f(this.f106245c, evidenceRequired.f106245c);
                    }

                    public final int hashCode() {
                        return this.f106245c.hashCode() + ((this.f106244b.hashCode() + (Boolean.hashCode(this.f106243a) * 31)) * 31);
                    }

                    @Override // android.os.Parcelable
                    public final void writeToParcel(Parcel dest, int i) {
                        Intrinsics.checkNotNullParameter(dest, "dest");
                        dest.writeInt(this.f106243a ? 1 : 0);
                        this.f106244b.writeToParcel(dest, i);
                        Iterator itV = p.a.v(this.f106245c, dest);
                        while (itV.hasNext()) {
                            dest.writeString(((jkl.i) itV.next()).name());
                        }
                    }
                }

                @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0001\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/revolut/sso/impl/ui/auth/AuthenticationFlowContract$InputData$SignIn$Origin$SignUp$Social;", "Lcom/revolut/sso/impl/ui/auth/AuthenticationFlowContract$InputData$SignIn$Origin$SignUp;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
                public static final /* data */ class Social implements SignUp {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final boolean f106246a;

                    @NotNull
                    public static final Parcelable.Creator<Social> CREATOR = new b();

                    public static final class b implements Parcelable.Creator {
                        @Override // android.os.Parcelable.Creator
                        public final Object createFromParcel(Parcel parcel) {
                            Intrinsics.checkNotNullParameter(parcel, "parcel");
                            return new Social(parcel.readInt() != 0);
                        }

                        @Override // android.os.Parcelable.Creator
                        public final Object[] newArray(int i) {
                            return new Social[i];
                        }
                    }

                    public Social(boolean z) {
                        this.f106246a = z;
                    }

                    @Override // android.os.Parcelable
                    public final int describeContents() {
                        return 0;
                    }

                    public final boolean equals(Object obj2) {
                        if (this == obj2) {
                            return true;
                        }
                        return (obj2 instanceof Social) && this.f106246a == ((Social) obj2).f106246a;
                    }

                    public final int hashCode() {
                        return Boolean.hashCode(this.f106246a);
                    }

                    @Override // android.os.Parcelable
                    public final void writeToParcel(Parcel dest, int i) {
                        Intrinsics.checkNotNullParameter(dest, "dest");
                        dest.writeInt(this.f106246a ? 1 : 0);
                    }
                }
            }

            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0001\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/revolut/sso/impl/ui/auth/AuthenticationFlowContract$InputData$SignIn$Origin$SubAccount;", "Lcom/revolut/sso/impl/ui/auth/AuthenticationFlowContract$InputData$SignIn$Origin;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class SubAccount implements Origin {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final String f106247a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final Boolean f106248b;

                @NotNull
                public static final Parcelable.Creator<SubAccount> CREATOR = new b();

                public static final class b implements Parcelable.Creator {
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
                    this.f106247a = accountId;
                    this.f106248b = bool;
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
                    return Intrinsics.f(this.f106247a, subAccount.f106247a) && Intrinsics.f(this.f106248b, subAccount.f106248b);
                }

                public final int hashCode() {
                    int iHashCode = this.f106247a.hashCode() * 31;
                    Boolean bool = this.f106248b;
                    return iHashCode + (bool == null ? 0 : bool.hashCode());
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel dest, int i) {
                    Intrinsics.checkNotNullParameter(dest, "dest");
                    kii.e.x(this.f106247a, dest, i);
                    Boolean bool = this.f106248b;
                    if (bool == null) {
                        dest.writeInt(0);
                    } else {
                        p.a.A(dest, 1, bool);
                    }
                }
            }
        }

        public static final class b implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SignIn((RevolutAccountSession) parcel.readParcelable(SignIn.class.getClassLoader()), (RevolutSsoApi$DefaultIdentifier) parcel.readParcelable(SignIn.class.getClassLoader()), (Origin) parcel.readParcelable(SignIn.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SignIn[i];
            }
        }

        public SignIn(RevolutAccountSession revolutAccountSession, RevolutSsoApi$DefaultIdentifier defaultIdentifier, Origin origin) {
            Intrinsics.checkNotNullParameter(defaultIdentifier, "defaultIdentifier");
            Intrinsics.checkNotNullParameter(origin, "origin");
            this.f106232a = revolutAccountSession;
            this.f106233b = defaultIdentifier;
            this.f106234c = origin;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof SignIn)) {
                return false;
            }
            SignIn signIn = (SignIn) obj2;
            return Intrinsics.f(this.f106232a, signIn.f106232a) && Intrinsics.f(this.f106233b, signIn.f106233b) && Intrinsics.f(this.f106234c, signIn.f106234c);
        }

        public final int hashCode() {
            RevolutAccountSession revolutAccountSession = this.f106232a;
            return this.f106234c.hashCode() + ((this.f106233b.hashCode() + ((revolutAccountSession == null ? 0 : revolutAccountSession.hashCode()) * 31)) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f106232a, i);
            dest.writeParcelable(this.f106233b, i);
            dest.writeParcelable(this.f106234c, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0001\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/revolut/sso/impl/ui/auth/AuthenticationFlowContract$InputData$SignInWithRevolutId;", "Lcom/revolut/sso/impl/ui/auth/AuthenticationFlowContract$InputData;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SignInWithRevolutId implements AuthenticationFlowContract$InputData {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f106249a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f106250b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f106251c;
        public final String d;

        @NotNull
        public static final Parcelable.Creator<SignInWithRevolutId> CREATOR = new b();

        public static final class b implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SignInWithRevolutId(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SignInWithRevolutId[i];
            }
        }

        public SignInWithRevolutId(String clientId, String redirectUri, String scope, String state) {
            Intrinsics.checkNotNullParameter(clientId, "clientId");
            Intrinsics.checkNotNullParameter(redirectUri, "redirectUri");
            Intrinsics.checkNotNullParameter(scope, "scope");
            Intrinsics.checkNotNullParameter(state, "state");
            this.f106249a = clientId;
            this.f106250b = redirectUri;
            this.f106251c = scope;
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
            if (!(obj2 instanceof SignInWithRevolutId)) {
                return false;
            }
            SignInWithRevolutId signInWithRevolutId = (SignInWithRevolutId) obj2;
            return Intrinsics.f(this.f106249a, signInWithRevolutId.f106249a) && Intrinsics.f(this.f106250b, signInWithRevolutId.f106250b) && Intrinsics.f(this.f106251c, signInWithRevolutId.f106251c) && Intrinsics.f(this.d, signInWithRevolutId.d);
        }

        public final int hashCode() {
            return this.d.hashCode() + p.a.c(p.a.c(this.f106249a.hashCode() * 31, 31, this.f106250b), 31, this.f106251c);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f106249a);
            dest.writeString(this.f106250b);
            dest.writeString(this.f106251c);
            dest.writeString(this.d);
        }
    }

    default boolean b4() {
        return (this instanceof SignIn) && (((SignIn) this).f106234c instanceof SignIn.Origin.SignUp);
    }
}
