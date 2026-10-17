package com.revolut.sso.impl.ui.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import com.revolut.sso.api.login.RevolutSsoApi$DefaultIdentifier;
import com.revolut.sso.api.models.PasscodeWelcomeMessage;
import com.revolut.sso.api.models.UserInfo;
import com.revolut.sso.impl.domain.models.AuthResult;
import com.revolut.sso.impl.domain.models.ChallengeClient;
import com.revolut.sso.impl.domain.models.Claim;
import com.revolut.sso.impl.domain.models.UserInfoAccount;
import gkl.w0;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import jkl.a3;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000`\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0015\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0082\u0001\u0015\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'()*+¨\u0006,À\u0006\u0003"}, d2 = {"com/revolut/sso/impl/ui/auth/AuthenticationFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "IdentifierInput", "EnterPhoneWhenLostAccess", "EnterEmailWhenLostAccess", "PasswordInput", "ChooseChallenge", "GetIdentifier", "ManualReview", "AuthRejected", "LateIdentificationInfo", "CreateNewPasscode", "MerchantPermissions", "CreateNewPassword", "CreateNewPhone", "CreateNewEmail", "ExistingAccountFound", "EnablePasskeyPrompt", "PostAuthentication", "IdentityConfirmed", "LogOutPrompt", "PushOtpConfirmation", "RequestLocation", "Lcom/revolut/sso/impl/ui/auth/AuthenticationFlowContract$Step$AuthRejected;", "Lcom/revolut/sso/impl/ui/auth/AuthenticationFlowContract$Step$ChooseChallenge;", "Lcom/revolut/sso/impl/ui/auth/AuthenticationFlowContract$Step$CreateNewEmail;", "Lcom/revolut/sso/impl/ui/auth/AuthenticationFlowContract$Step$CreateNewPasscode;", "Lcom/revolut/sso/impl/ui/auth/AuthenticationFlowContract$Step$CreateNewPassword;", "Lcom/revolut/sso/impl/ui/auth/AuthenticationFlowContract$Step$CreateNewPhone;", "Lcom/revolut/sso/impl/ui/auth/AuthenticationFlowContract$Step$EnablePasskeyPrompt;", "Lcom/revolut/sso/impl/ui/auth/AuthenticationFlowContract$Step$EnterEmailWhenLostAccess;", "Lcom/revolut/sso/impl/ui/auth/AuthenticationFlowContract$Step$EnterPhoneWhenLostAccess;", "Lcom/revolut/sso/impl/ui/auth/AuthenticationFlowContract$Step$ExistingAccountFound;", "Lcom/revolut/sso/impl/ui/auth/AuthenticationFlowContract$Step$GetIdentifier;", "Lcom/revolut/sso/impl/ui/auth/AuthenticationFlowContract$Step$IdentifierInput;", "Lcom/revolut/sso/impl/ui/auth/AuthenticationFlowContract$Step$IdentityConfirmed;", "Lcom/revolut/sso/impl/ui/auth/AuthenticationFlowContract$Step$LateIdentificationInfo;", "Lcom/revolut/sso/impl/ui/auth/AuthenticationFlowContract$Step$LogOutPrompt;", "Lcom/revolut/sso/impl/ui/auth/AuthenticationFlowContract$Step$ManualReview;", "Lcom/revolut/sso/impl/ui/auth/AuthenticationFlowContract$Step$MerchantPermissions;", "Lcom/revolut/sso/impl/ui/auth/AuthenticationFlowContract$Step$PasswordInput;", "Lcom/revolut/sso/impl/ui/auth/AuthenticationFlowContract$Step$PostAuthentication;", "Lcom/revolut/sso/impl/ui/auth/AuthenticationFlowContract$Step$PushOtpConfirmation;", "Lcom/revolut/sso/impl/ui/auth/AuthenticationFlowContract$Step$RequestLocation;", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface AuthenticationFlowContract$Step extends FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/sso/impl/ui/auth/AuthenticationFlowContract$Step$AuthRejected;", "Lcom/revolut/sso/impl/ui/auth/AuthenticationFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AuthRejected implements AuthenticationFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<AuthRejected> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final jkl.i f106306a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ZonedDateTime f106307b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Set f106308c;
        public final int d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                jkl.i iVarValueOf = parcel.readInt() == 0 ? null : jkl.i.valueOf(parcel.readString());
                ZonedDateTime zonedDateTime = (ZonedDateTime) parcel.readSerializable();
                int i = parcel.readInt();
                LinkedHashSet linkedHashSet = new LinkedHashSet(i);
                for (int i2 = 0; i2 != i; i2++) {
                    linkedHashSet.add(a3.valueOf(parcel.readString()));
                }
                return new AuthRejected(iVarValueOf, zonedDateTime, linkedHashSet, parcel.readInt());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AuthRejected[i];
            }
        }

        public AuthRejected(jkl.i iVar, ZonedDateTime zonedDateTime, Set actions, int i) {
            Intrinsics.checkNotNullParameter(actions, "actions");
            this.f106306a = iVar;
            this.f106307b = zonedDateTime;
            this.f106308c = actions;
            this.d = i;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof AuthRejected)) {
                return false;
            }
            AuthRejected authRejected = (AuthRejected) obj2;
            return this.f106306a == authRejected.f106306a && Intrinsics.f(this.f106307b, authRejected.f106307b) && Intrinsics.f(this.f106308c, authRejected.f106308c) && this.d == authRejected.d;
        }

        public final int hashCode() {
            jkl.i iVar = this.f106306a;
            int iHashCode = (iVar == null ? 0 : iVar.hashCode()) * 31;
            ZonedDateTime zonedDateTime = this.f106307b;
            return Integer.hashCode(this.d) + p.a.f((iHashCode + (zonedDateTime != null ? zonedDateTime.hashCode() : 0)) * 31, 31, this.f106308c);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            jkl.i iVar = this.f106306a;
            if (iVar == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(iVar.name());
            }
            dest.writeSerializable(this.f106307b);
            Iterator itV = ehe.n.v(this.f106308c, dest);
            while (itV.hasNext()) {
                dest.writeString(((a3) itV.next()).name());
            }
            dest.writeInt(this.d);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/sso/impl/ui/auth/AuthenticationFlowContract$Step$ChooseChallenge;", "Lcom/revolut/sso/impl/ui/auth/AuthenticationFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ChooseChallenge implements AuthenticationFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<ChooseChallenge> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List f106310a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(jkl.i.valueOf(parcel.readString()));
                }
                return new ChooseChallenge(arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ChooseChallenge[i];
            }
        }

        public ChooseChallenge(List challenges) {
            Intrinsics.checkNotNullParameter(challenges, "challenges");
            this.f106310a = challenges;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof ChooseChallenge) && Intrinsics.f(this.f106310a, ((ChooseChallenge) obj2).f106310a);
        }

        public final int hashCode() {
            return this.f106310a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            Iterator itV = p.a.v(this.f106310a, dest);
            while (itV.hasNext()) {
                dest.writeString(((jkl.i) itV.next()).name());
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/sso/impl/ui/auth/AuthenticationFlowContract$Step$CreateNewEmail;", "Lcom/revolut/sso/impl/ui/auth/AuthenticationFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CreateNewEmail implements AuthenticationFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<CreateNewEmail> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f106311a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CreateNewEmail(parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CreateNewEmail[i];
            }
        }

        public CreateNewEmail(boolean z) {
            this.f106311a = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof CreateNewEmail) && this.f106311a == ((CreateNewEmail) obj2).f106311a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f106311a);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.f106311a ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/sso/impl/ui/auth/AuthenticationFlowContract$Step$CreateNewPasscode;", "Lcom/revolut/sso/impl/ui/auth/AuthenticationFlowContract$Step;", "<init>", "()V", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class CreateNewPasscode implements AuthenticationFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final CreateNewPasscode f106312a = new CreateNewPasscode();

        @NotNull
        public static final Parcelable.Creator<CreateNewPasscode> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return CreateNewPasscode.f106312a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CreateNewPasscode[i];
            }
        }

        private CreateNewPasscode() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/sso/impl/ui/auth/AuthenticationFlowContract$Step$CreateNewPassword;", "Lcom/revolut/sso/impl/ui/auth/AuthenticationFlowContract$Step;", "<init>", "()V", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class CreateNewPassword implements AuthenticationFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final CreateNewPassword f106313a = new CreateNewPassword();

        @NotNull
        public static final Parcelable.Creator<CreateNewPassword> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return CreateNewPassword.f106313a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CreateNewPassword[i];
            }
        }

        private CreateNewPassword() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/sso/impl/ui/auth/AuthenticationFlowContract$Step$CreateNewPhone;", "Lcom/revolut/sso/impl/ui/auth/AuthenticationFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CreateNewPhone implements AuthenticationFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<CreateNewPhone> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f106314a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CreateNewPhone(parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CreateNewPhone[i];
            }
        }

        public CreateNewPhone(boolean z) {
            this.f106314a = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof CreateNewPhone) && this.f106314a == ((CreateNewPhone) obj2).f106314a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f106314a);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.f106314a ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/sso/impl/ui/auth/AuthenticationFlowContract$Step$EnablePasskeyPrompt;", "Lcom/revolut/sso/impl/ui/auth/AuthenticationFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class EnablePasskeyPrompt implements AuthenticationFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<EnablePasskeyPrompt> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AuthResult.Success f106315a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new EnablePasskeyPrompt(AuthResult.Success.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new EnablePasskeyPrompt[i];
            }
        }

        public EnablePasskeyPrompt(AuthResult.Success authResult) {
            Intrinsics.checkNotNullParameter(authResult, "authResult");
            this.f106315a = authResult;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof EnablePasskeyPrompt) && Intrinsics.f(this.f106315a, ((EnablePasskeyPrompt) obj2).f106315a);
        }

        public final int hashCode() {
            return this.f106315a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f106315a.writeToParcel(dest, i);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/sso/impl/ui/auth/AuthenticationFlowContract$Step$EnterEmailWhenLostAccess;", "Lcom/revolut/sso/impl/ui/auth/AuthenticationFlowContract$Step;", "<init>", "()V", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class EnterEmailWhenLostAccess implements AuthenticationFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final EnterEmailWhenLostAccess f106316a = new EnterEmailWhenLostAccess();

        @NotNull
        public static final Parcelable.Creator<EnterEmailWhenLostAccess> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return EnterEmailWhenLostAccess.f106316a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new EnterEmailWhenLostAccess[i];
            }
        }

        private EnterEmailWhenLostAccess() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/sso/impl/ui/auth/AuthenticationFlowContract$Step$EnterPhoneWhenLostAccess;", "Lcom/revolut/sso/impl/ui/auth/AuthenticationFlowContract$Step;", "<init>", "()V", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class EnterPhoneWhenLostAccess implements AuthenticationFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final EnterPhoneWhenLostAccess f106317a = new EnterPhoneWhenLostAccess();

        @NotNull
        public static final Parcelable.Creator<EnterPhoneWhenLostAccess> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return EnterPhoneWhenLostAccess.f106317a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new EnterPhoneWhenLostAccess[i];
            }
        }

        private EnterPhoneWhenLostAccess() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/sso/impl/ui/auth/AuthenticationFlowContract$Step$ExistingAccountFound;", "Lcom/revolut/sso/impl/ui/auth/AuthenticationFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ExistingAccountFound implements AuthenticationFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<ExistingAccountFound> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final UserInfo f106339a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ExistingAccountFound((UserInfo) parcel.readParcelable(ExistingAccountFound.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ExistingAccountFound[i];
            }
        }

        public ExistingAccountFound(UserInfo userInfo) {
            Intrinsics.checkNotNullParameter(userInfo, "userInfo");
            this.f106339a = userInfo;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof ExistingAccountFound) && Intrinsics.f(this.f106339a, ((ExistingAccountFound) obj2).f106339a);
        }

        public final int hashCode() {
            return this.f106339a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f106339a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/sso/impl/ui/auth/AuthenticationFlowContract$Step$GetIdentifier;", "Lcom/revolut/sso/impl/ui/auth/AuthenticationFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class GetIdentifier implements AuthenticationFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<GetIdentifier> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final RevolutSsoApi$DefaultIdentifier.Preferred f106340a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new GetIdentifier((RevolutSsoApi$DefaultIdentifier.Preferred) parcel.readParcelable(GetIdentifier.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new GetIdentifier[i];
            }
        }

        public GetIdentifier(RevolutSsoApi$DefaultIdentifier.Preferred preferredIdentifier) {
            Intrinsics.checkNotNullParameter(preferredIdentifier, "preferredIdentifier");
            this.f106340a = preferredIdentifier;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof GetIdentifier) && this.f106340a == ((GetIdentifier) obj2).f106340a;
        }

        public final int hashCode() {
            return this.f106340a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f106340a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/sso/impl/ui/auth/AuthenticationFlowContract$Step$IdentifierInput;", "Lcom/revolut/sso/impl/ui/auth/AuthenticationFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class IdentifierInput implements AuthenticationFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<IdentifierInput> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final RevolutSsoApi$DefaultIdentifier.Preferred f106341a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f106342b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new IdentifierInput((RevolutSsoApi$DefaultIdentifier.Preferred) parcel.readParcelable(IdentifierInput.class.getClassLoader()), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new IdentifierInput[i];
            }
        }

        public IdentifierInput() {
            this((RevolutSsoApi$DefaultIdentifier.Preferred) null, 3);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof IdentifierInput)) {
                return false;
            }
            IdentifierInput identifierInput = (IdentifierInput) obj2;
            return this.f106341a == identifierInput.f106341a && this.f106342b == identifierInput.f106342b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f106342b) + (this.f106341a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f106341a, i);
            dest.writeInt(this.f106342b ? 1 : 0);
        }

        public IdentifierInput(RevolutSsoApi$DefaultIdentifier.Preferred defaultIdentifier, boolean z) {
            Intrinsics.checkNotNullParameter(defaultIdentifier, "defaultIdentifier");
            this.f106341a = defaultIdentifier;
            this.f106342b = z;
        }

        public /* synthetic */ IdentifierInput(RevolutSsoApi$DefaultIdentifier.Preferred preferred, int i) {
            this((i & 1) != 0 ? RevolutSsoApi$DefaultIdentifier.Preferred.Phone : preferred, false);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/sso/impl/ui/auth/AuthenticationFlowContract$Step$IdentityConfirmed;", "Lcom/revolut/sso/impl/ui/auth/AuthenticationFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class IdentityConfirmed implements AuthenticationFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<IdentityConfirmed> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AuthResult.Success f106343a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new IdentityConfirmed(AuthResult.Success.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new IdentityConfirmed[i];
            }
        }

        public IdentityConfirmed(AuthResult.Success result) {
            Intrinsics.checkNotNullParameter(result, "result");
            this.f106343a = result;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof IdentityConfirmed) && Intrinsics.f(this.f106343a, ((IdentityConfirmed) obj2).f106343a);
        }

        public final int hashCode() {
            return this.f106343a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f106343a.writeToParcel(dest, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/sso/impl/ui/auth/AuthenticationFlowContract$Step$LateIdentificationInfo;", "Lcom/revolut/sso/impl/ui/auth/AuthenticationFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class LateIdentificationInfo implements AuthenticationFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<LateIdentificationInfo> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Claim f106344a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new LateIdentificationInfo((Claim) parcel.readParcelable(LateIdentificationInfo.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new LateIdentificationInfo[i];
            }
        }

        public LateIdentificationInfo(Claim claimIdentified) {
            Intrinsics.checkNotNullParameter(claimIdentified, "claimIdentified");
            this.f106344a = claimIdentified;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof LateIdentificationInfo) && Intrinsics.f(this.f106344a, ((LateIdentificationInfo) obj2).f106344a);
        }

        public final int hashCode() {
            return this.f106344a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f106344a, i);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/sso/impl/ui/auth/AuthenticationFlowContract$Step$LogOutPrompt;", "Lcom/revolut/sso/impl/ui/auth/AuthenticationFlowContract$Step;", "<init>", "()V", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class LogOutPrompt implements AuthenticationFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final LogOutPrompt f106345a = new LogOutPrompt();

        @NotNull
        public static final Parcelable.Creator<LogOutPrompt> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return LogOutPrompt.f106345a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new LogOutPrompt[i];
            }
        }

        private LogOutPrompt() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/sso/impl/ui/auth/AuthenticationFlowContract$Step$ManualReview;", "Lcom/revolut/sso/impl/ui/auth/AuthenticationFlowContract$Step;", "<init>", "()V", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class ManualReview implements AuthenticationFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ManualReview f106346a = new ManualReview();

        @NotNull
        public static final Parcelable.Creator<ManualReview> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return ManualReview.f106346a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ManualReview[i];
            }
        }

        private ManualReview() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/sso/impl/ui/auth/AuthenticationFlowContract$Step$MerchantPermissions;", "Lcom/revolut/sso/impl/ui/auth/AuthenticationFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class MerchantPermissions implements AuthenticationFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<MerchantPermissions> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final UserInfoAccount f106347a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ChallengeClient f106348b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ArrayList f106349c;
        public final Set d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                UserInfoAccount userInfoAccountCreateFromParcel = UserInfoAccount.CREATOR.createFromParcel(parcel);
                ChallengeClient challengeClientCreateFromParcel = ChallengeClient.CREATOR.createFromParcel(parcel);
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iE = 0;
                while (iE != i) {
                    iE = j6.a.e(MerchantPermissions.class, parcel, arrayList, iE, 1);
                }
                int i2 = parcel.readInt();
                LinkedHashSet linkedHashSet = new LinkedHashSet(i2);
                for (int i3 = 0; i3 != i2; i3++) {
                    linkedHashSet.add(w0.valueOf(parcel.readString()));
                }
                return new MerchantPermissions(userInfoAccountCreateFromParcel, challengeClientCreateFromParcel, arrayList, linkedHashSet);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new MerchantPermissions[i];
            }
        }

        public MerchantPermissions(UserInfoAccount userInfoAccount, ChallengeClient challengeClient, ArrayList consents, Set scopes) {
            Intrinsics.checkNotNullParameter(userInfoAccount, "userInfoAccount");
            Intrinsics.checkNotNullParameter(challengeClient, "challengeClient");
            Intrinsics.checkNotNullParameter(consents, "consents");
            Intrinsics.checkNotNullParameter(scopes, "scopes");
            this.f106347a = userInfoAccount;
            this.f106348b = challengeClient;
            this.f106349c = consents;
            this.d = scopes;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof MerchantPermissions)) {
                return false;
            }
            MerchantPermissions merchantPermissions = (MerchantPermissions) obj2;
            return Intrinsics.f(this.f106347a, merchantPermissions.f106347a) && Intrinsics.f(this.f106348b, merchantPermissions.f106348b) && this.f106349c.equals(merchantPermissions.f106349c) && Intrinsics.f(this.d, merchantPermissions.d);
        }

        public final int hashCode() {
            return this.d.hashCode() + com.google.android.gms.internal.mlkit_vision_face.a.b(this.f106349c, (this.f106348b.hashCode() + (this.f106347a.hashCode() * 31)) * 31, 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f106347a.writeToParcel(dest, i);
            this.f106348b.writeToParcel(dest, i);
            Iterator itY = j6.a.y(this.f106349c, dest);
            while (itY.hasNext()) {
                dest.writeParcelable((Parcelable) itY.next(), i);
            }
            Iterator itV = ehe.n.v(this.d, dest);
            while (itV.hasNext()) {
                dest.writeString(((w0) itV.next()).name());
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/sso/impl/ui/auth/AuthenticationFlowContract$Step$PasswordInput;", "Lcom/revolut/sso/impl/ui/auth/AuthenticationFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PasswordInput implements AuthenticationFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<PasswordInput> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Integer f106350a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final PasscodeWelcomeMessage f106351b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PasswordInput(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), (PasscodeWelcomeMessage) parcel.readParcelable(PasswordInput.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PasswordInput[i];
            }
        }

        public PasswordInput(Integer num, PasscodeWelcomeMessage passcodeWelcomeMessage) {
            this.f106350a = num;
            this.f106351b = passcodeWelcomeMessage;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof PasswordInput)) {
                return false;
            }
            PasswordInput passwordInput = (PasswordInput) obj2;
            return Intrinsics.f(this.f106350a, passwordInput.f106350a) && Intrinsics.f(this.f106351b, passwordInput.f106351b);
        }

        public final int hashCode() {
            Integer num = this.f106350a;
            int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
            PasscodeWelcomeMessage passcodeWelcomeMessage = this.f106351b;
            return iHashCode + (passcodeWelcomeMessage != null ? passcodeWelcomeMessage.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            Integer num = this.f106350a;
            if (num == null) {
                dest.writeInt(0);
            } else {
                p.a.B(dest, 1, num);
            }
            dest.writeParcelable(this.f106351b, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/sso/impl/ui/auth/AuthenticationFlowContract$Step$PostAuthentication;", "Lcom/revolut/sso/impl/ui/auth/AuthenticationFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PostAuthentication implements AuthenticationFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<PostAuthentication> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AuthResult.Success f106352a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PostAuthentication(AuthResult.Success.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PostAuthentication[i];
            }
        }

        public PostAuthentication(AuthResult.Success result) {
            Intrinsics.checkNotNullParameter(result, "result");
            this.f106352a = result;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof PostAuthentication) && Intrinsics.f(this.f106352a, ((PostAuthentication) obj2).f106352a);
        }

        public final int hashCode() {
            return this.f106352a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f106352a.writeToParcel(dest, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/sso/impl/ui/auth/AuthenticationFlowContract$Step$PushOtpConfirmation;", "Lcom/revolut/sso/impl/ui/auth/AuthenticationFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PushOtpConfirmation implements AuthenticationFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<PushOtpConfirmation> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f106353a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f106354b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PushOtpConfirmation(parcel.readString(), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PushOtpConfirmation[i];
            }
        }

        public PushOtpConfirmation(String otpCode, boolean z) {
            Intrinsics.checkNotNullParameter(otpCode, "otpCode");
            this.f106353a = otpCode;
            this.f106354b = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof PushOtpConfirmation)) {
                return false;
            }
            PushOtpConfirmation pushOtpConfirmation = (PushOtpConfirmation) obj2;
            return Intrinsics.f(this.f106353a, pushOtpConfirmation.f106353a) && this.f106354b == pushOtpConfirmation.f106354b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f106354b) + (this.f106353a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f106353a);
            dest.writeInt(this.f106354b ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/sso/impl/ui/auth/AuthenticationFlowContract$Step$RequestLocation;", "Lcom/revolut/sso/impl/ui/auth/AuthenticationFlowContract$Step;", "<init>", "()V", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class RequestLocation implements AuthenticationFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final RequestLocation f106355a = new RequestLocation();

        @NotNull
        public static final Parcelable.Creator<RequestLocation> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return RequestLocation.f106355a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new RequestLocation[i];
            }
        }

        private RequestLocation() {
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
