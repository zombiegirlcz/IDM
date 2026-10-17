package com.revolut.sso.impl.domain.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.account.region.domain.model.AccountRegion;
import com.revolut.sso.api.models.UserInfo;
import ehe.n;
import gkl.m;
import gkl.w0;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import jkl.a3;
import jkl.i;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0016\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0082\u0001\u000e\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%¨\u0006&À\u0006\u0003"}, d2 = {"Lcom/revolut/sso/impl/domain/models/AuthResult;", "Landroid/os/Parcelable;", "ErrorResult", "SessionTokenExpired", "SessionTokenInvalid", "SocialAccountUnlinked", "Forbidden", "Unauthorised", "TooManyChallenges", "ConfirmationRequired", "EvidenceNotVerifiedYet", "CaptchaRequired", "CaptchaCanceled", "SuccessDelegated", "LoginRejected", "FeatureNotAvailable", "AuthenticationRejected", "AuthenticationReviewing", "EvidenceRequired", "ExistingAccountFound", "ClaimRequired", "PermissionRequired", "LocationRequested", "Success", "Lcom/revolut/sso/impl/domain/models/AuthResult$AuthenticationReviewing;", "Lcom/revolut/sso/impl/domain/models/AuthResult$CaptchaCanceled;", "Lcom/revolut/sso/impl/domain/models/AuthResult$CaptchaRequired;", "Lcom/revolut/sso/impl/domain/models/AuthResult$ClaimRequired;", "Lcom/revolut/sso/impl/domain/models/AuthResult$ConfirmationRequired;", "Lcom/revolut/sso/impl/domain/models/AuthResult$ErrorResult;", "Lcom/revolut/sso/impl/domain/models/AuthResult$EvidenceNotVerifiedYet;", "Lcom/revolut/sso/impl/domain/models/AuthResult$EvidenceRequired;", "Lcom/revolut/sso/impl/domain/models/AuthResult$ExistingAccountFound;", "Lcom/revolut/sso/impl/domain/models/AuthResult$LocationRequested;", "Lcom/revolut/sso/impl/domain/models/AuthResult$PermissionRequired;", "Lcom/revolut/sso/impl/domain/models/AuthResult$Success;", "Lcom/revolut/sso/impl/domain/models/AuthResult$SuccessDelegated;", "Lcom/revolut/sso/impl/domain/models/AuthResult$TooManyChallenges;", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface AuthResult extends Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/sso/impl/domain/models/AuthResult$AuthenticationRejected;", "Lcom/revolut/sso/impl/domain/models/AuthResult$ErrorResult;", "", "toString", "()Ljava/lang/String;", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AuthenticationRejected implements ErrorResult {

        @NotNull
        public static final Parcelable.Creator<AuthenticationRejected> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ZonedDateTime f106068a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Set f106069b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                ZonedDateTime zonedDateTime = (ZonedDateTime) parcel.readSerializable();
                int i = parcel.readInt();
                LinkedHashSet linkedHashSet = new LinkedHashSet(i);
                for (int i2 = 0; i2 != i; i2++) {
                    linkedHashSet.add(a3.valueOf(parcel.readString()));
                }
                return new AuthenticationRejected(zonedDateTime, linkedHashSet);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AuthenticationRejected[i];
            }
        }

        public AuthenticationRejected(ZonedDateTime zonedDateTime, Set actions) {
            Intrinsics.checkNotNullParameter(actions, "actions");
            this.f106068a = zonedDateTime;
            this.f106069b = actions;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof AuthenticationRejected)) {
                return false;
            }
            AuthenticationRejected authenticationRejected = (AuthenticationRejected) obj2;
            return Intrinsics.f(this.f106068a, authenticationRejected.f106068a) && Intrinsics.f(this.f106069b, authenticationRejected.f106069b);
        }

        public final int hashCode() {
            ZonedDateTime zonedDateTime = this.f106068a;
            return this.f106069b.hashCode() + ((zonedDateTime == null ? 0 : zonedDateTime.hashCode()) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f106068a);
            Iterator itV = n.v(this.f106069b, dest);
            while (itV.hasNext()) {
                dest.writeString(((a3) itV.next()).name());
            }
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/sso/impl/domain/models/AuthResult$AuthenticationReviewing;", "Lcom/revolut/sso/impl/domain/models/AuthResult;", "<init>", "()V", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class AuthenticationReviewing implements AuthResult {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final AuthenticationReviewing f106070a = new AuthenticationReviewing();

        @NotNull
        public static final Parcelable.Creator<AuthenticationReviewing> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return AuthenticationReviewing.f106070a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AuthenticationReviewing[i];
            }
        }

        private AuthenticationReviewing() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/sso/impl/domain/models/AuthResult$CaptchaCanceled;", "Lcom/revolut/sso/impl/domain/models/AuthResult;", "<init>", "()V", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class CaptchaCanceled implements AuthResult {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final CaptchaCanceled f106071a = new CaptchaCanceled();

        @NotNull
        public static final Parcelable.Creator<CaptchaCanceled> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return CaptchaCanceled.f106071a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CaptchaCanceled[i];
            }
        }

        private CaptchaCanceled() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/sso/impl/domain/models/AuthResult$CaptchaRequired;", "Lcom/revolut/sso/impl/domain/models/AuthResult;", "<init>", "()V", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class CaptchaRequired implements AuthResult {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final CaptchaRequired f106072a = new CaptchaRequired();

        @NotNull
        public static final Parcelable.Creator<CaptchaRequired> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return CaptchaRequired.f106072a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CaptchaRequired[i];
            }
        }

        private CaptchaRequired() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0001\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/revolut/sso/impl/domain/models/AuthResult$ClaimRequired;", "Lcom/revolut/sso/impl/domain/models/AuthResult;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ClaimRequired implements AuthResult {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final m f106073a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Claim f106074b;

        @NotNull
        public static final Parcelable.Creator<ClaimRequired> CREATOR = new b();

        public static final class b implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ClaimRequired(m.valueOf(parcel.readString()), (Claim) parcel.readParcelable(ClaimRequired.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ClaimRequired[i];
            }
        }

        public ClaimRequired(m claimName, Claim claim) {
            Intrinsics.checkNotNullParameter(claimName, "claimName");
            this.f106073a = claimName;
            this.f106074b = claim;
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
            return this.f106073a == claimRequired.f106073a && Intrinsics.f(this.f106074b, claimRequired.f106074b);
        }

        public final int hashCode() {
            int iHashCode = this.f106073a.hashCode() * 31;
            Claim claim = this.f106074b;
            return iHashCode + (claim == null ? 0 : claim.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f106073a.name());
            dest.writeParcelable(this.f106074b, i);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/sso/impl/domain/models/AuthResult$ConfirmationRequired;", "Lcom/revolut/sso/impl/domain/models/AuthResult;", "<init>", "()V", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class ConfirmationRequired implements AuthResult {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ConfirmationRequired f106075a = new ConfirmationRequired();

        @NotNull
        public static final Parcelable.Creator<ConfirmationRequired> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return ConfirmationRequired.f106075a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ConfirmationRequired[i];
            }
        }

        private ConfirmationRequired() {
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

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001\u0082\u0001\b\u0002\u0003\u0004\u0005\u0006\u0007\b\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"Lcom/revolut/sso/impl/domain/models/AuthResult$ErrorResult;", "Lcom/revolut/sso/impl/domain/models/AuthResult;", "Lcom/revolut/sso/impl/domain/models/AuthResult$AuthenticationRejected;", "Lcom/revolut/sso/impl/domain/models/AuthResult$FeatureNotAvailable;", "Lcom/revolut/sso/impl/domain/models/AuthResult$Forbidden;", "Lcom/revolut/sso/impl/domain/models/AuthResult$LoginRejected;", "Lcom/revolut/sso/impl/domain/models/AuthResult$SessionTokenExpired;", "Lcom/revolut/sso/impl/domain/models/AuthResult$SessionTokenInvalid;", "Lcom/revolut/sso/impl/domain/models/AuthResult$SocialAccountUnlinked;", "Lcom/revolut/sso/impl/domain/models/AuthResult$Unauthorised;", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface ErrorResult extends AuthResult {
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/sso/impl/domain/models/AuthResult$EvidenceNotVerifiedYet;", "Lcom/revolut/sso/impl/domain/models/AuthResult;", "", "toString", "()Ljava/lang/String;", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class EvidenceNotVerifiedYet implements AuthResult {

        @NotNull
        public static final Parcelable.Creator<EvidenceNotVerifiedYet> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f106076a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new EvidenceNotVerifiedYet(parcel.readInt());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new EvidenceNotVerifiedYet[i];
            }
        }

        public EvidenceNotVerifiedYet(int i) {
            this.f106076a = i;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof EvidenceNotVerifiedYet) && this.f106076a == ((EvidenceNotVerifiedYet) obj2).f106076a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f106076a);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.f106076a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/sso/impl/domain/models/AuthResult$EvidenceRequired;", "Lcom/revolut/sso/impl/domain/models/AuthResult;", "", "toString", "()Ljava/lang/String;", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class EvidenceRequired implements AuthResult {

        @NotNull
        public static final Parcelable.Creator<EvidenceRequired> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Challenge f106077a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ArrayList f106078b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                Challenge challengeCreateFromParcel = Challenge.CREATOR.createFromParcel(parcel);
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(i.valueOf(parcel.readString()));
                }
                return new EvidenceRequired(challengeCreateFromParcel, arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new EvidenceRequired[i];
            }
        }

        public EvidenceRequired(Challenge challenge, ArrayList availableMethods) {
            Intrinsics.checkNotNullParameter(challenge, "challenge");
            Intrinsics.checkNotNullParameter(availableMethods, "availableMethods");
            this.f106077a = challenge;
            this.f106078b = availableMethods;
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
            return Intrinsics.f(this.f106077a, evidenceRequired.f106077a) && this.f106078b.equals(evidenceRequired.f106078b);
        }

        public final int hashCode() {
            return this.f106078b.hashCode() + (this.f106077a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f106077a.writeToParcel(dest, i);
            Iterator itY = j6.a.y(this.f106078b, dest);
            while (itY.hasNext()) {
                dest.writeString(((i) itY.next()).name());
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/sso/impl/domain/models/AuthResult$ExistingAccountFound;", "Lcom/revolut/sso/impl/domain/models/AuthResult;", "", "toString", "()Ljava/lang/String;", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ExistingAccountFound implements AuthResult {

        @NotNull
        public static final Parcelable.Creator<ExistingAccountFound> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final UserInfo f106079a;

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
            this.f106079a = userInfo;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof ExistingAccountFound) && Intrinsics.f(this.f106079a, ((ExistingAccountFound) obj2).f106079a);
        }

        public final int hashCode() {
            return this.f106079a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f106079a, i);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/sso/impl/domain/models/AuthResult$FeatureNotAvailable;", "Lcom/revolut/sso/impl/domain/models/AuthResult$ErrorResult;", "<init>", "()V", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class FeatureNotAvailable implements ErrorResult {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final FeatureNotAvailable f106080a = new FeatureNotAvailable();

        @NotNull
        public static final Parcelable.Creator<FeatureNotAvailable> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return FeatureNotAvailable.f106080a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new FeatureNotAvailable[i];
            }
        }

        private FeatureNotAvailable() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/sso/impl/domain/models/AuthResult$Forbidden;", "Lcom/revolut/sso/impl/domain/models/AuthResult$ErrorResult;", "<init>", "()V", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Forbidden implements ErrorResult {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Forbidden f106081a = new Forbidden();

        @NotNull
        public static final Parcelable.Creator<Forbidden> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Forbidden.f106081a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Forbidden[i];
            }
        }

        private Forbidden() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/sso/impl/domain/models/AuthResult$LocationRequested;", "Lcom/revolut/sso/impl/domain/models/AuthResult;", "<init>", "()V", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class LocationRequested implements AuthResult {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final LocationRequested f106082a = new LocationRequested();

        @NotNull
        public static final Parcelable.Creator<LocationRequested> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return LocationRequested.f106082a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new LocationRequested[i];
            }
        }

        private LocationRequested() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/sso/impl/domain/models/AuthResult$LoginRejected;", "Lcom/revolut/sso/impl/domain/models/AuthResult$ErrorResult;", "<init>", "()V", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class LoginRejected implements ErrorResult {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final LoginRejected f106083a = new LoginRejected();

        @NotNull
        public static final Parcelable.Creator<LoginRejected> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return LoginRejected.f106083a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new LoginRejected[i];
            }
        }

        private LoginRejected() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/sso/impl/domain/models/AuthResult$PermissionRequired;", "Lcom/revolut/sso/impl/domain/models/AuthResult;", "", "toString", "()Ljava/lang/String;", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PermissionRequired implements AuthResult {

        @NotNull
        public static final Parcelable.Creator<PermissionRequired> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ChallengeClient f106084a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ArrayList f106085b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Set f106086c;
        public final String d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                ChallengeClient challengeClientCreateFromParcel = ChallengeClient.CREATOR.createFromParcel(parcel);
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iE = 0;
                while (iE != i) {
                    iE = j6.a.e(PermissionRequired.class, parcel, arrayList, iE, 1);
                }
                int i2 = parcel.readInt();
                LinkedHashSet linkedHashSet = new LinkedHashSet(i2);
                for (int i3 = 0; i3 != i2; i3++) {
                    linkedHashSet.add(w0.valueOf(parcel.readString()));
                }
                return new PermissionRequired(challengeClientCreateFromParcel, arrayList, linkedHashSet, parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PermissionRequired[i];
            }
        }

        public PermissionRequired(ChallengeClient client, ArrayList consents, Set scopes, String sessionToken) {
            Intrinsics.checkNotNullParameter(client, "client");
            Intrinsics.checkNotNullParameter(consents, "consents");
            Intrinsics.checkNotNullParameter(scopes, "scopes");
            Intrinsics.checkNotNullParameter(sessionToken, "sessionToken");
            this.f106084a = client;
            this.f106085b = consents;
            this.f106086c = scopes;
            this.d = sessionToken;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof PermissionRequired)) {
                return false;
            }
            PermissionRequired permissionRequired = (PermissionRequired) obj2;
            return Intrinsics.f(this.f106084a, permissionRequired.f106084a) && this.f106085b.equals(permissionRequired.f106085b) && Intrinsics.f(this.f106086c, permissionRequired.f106086c) && Intrinsics.f(this.d, permissionRequired.d);
        }

        public final int hashCode() {
            return this.d.hashCode() + p.a.f(com.google.android.gms.internal.mlkit_vision_face.a.b(this.f106085b, this.f106084a.hashCode() * 31, 31), 31, this.f106086c);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f106084a.writeToParcel(dest, i);
            Iterator itY = j6.a.y(this.f106085b, dest);
            while (itY.hasNext()) {
                dest.writeParcelable((Parcelable) itY.next(), i);
            }
            Iterator itV = n.v(this.f106086c, dest);
            while (itV.hasNext()) {
                dest.writeString(((w0) itV.next()).name());
            }
            dest.writeString(this.d);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/sso/impl/domain/models/AuthResult$SessionTokenExpired;", "Lcom/revolut/sso/impl/domain/models/AuthResult$ErrorResult;", "<init>", "()V", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class SessionTokenExpired implements ErrorResult {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final SessionTokenExpired f106087a = new SessionTokenExpired();

        @NotNull
        public static final Parcelable.Creator<SessionTokenExpired> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return SessionTokenExpired.f106087a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SessionTokenExpired[i];
            }
        }

        private SessionTokenExpired() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/sso/impl/domain/models/AuthResult$SessionTokenInvalid;", "Lcom/revolut/sso/impl/domain/models/AuthResult$ErrorResult;", "<init>", "()V", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class SessionTokenInvalid implements ErrorResult {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final SessionTokenInvalid f106088a = new SessionTokenInvalid();

        @NotNull
        public static final Parcelable.Creator<SessionTokenInvalid> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return SessionTokenInvalid.f106088a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SessionTokenInvalid[i];
            }
        }

        private SessionTokenInvalid() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/sso/impl/domain/models/AuthResult$SocialAccountUnlinked;", "Lcom/revolut/sso/impl/domain/models/AuthResult$ErrorResult;", "<init>", "()V", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class SocialAccountUnlinked implements ErrorResult {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final SocialAccountUnlinked f106089a = new SocialAccountUnlinked();

        @NotNull
        public static final Parcelable.Creator<SocialAccountUnlinked> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return SocialAccountUnlinked.f106089a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SocialAccountUnlinked[i];
            }
        }

        private SocialAccountUnlinked() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0001\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/revolut/sso/impl/domain/models/AuthResult$Success;", "Lcom/revolut/sso/impl/domain/models/AuthResult;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Success implements AuthResult {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final SessionToken f106090a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f106091b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ArrayList f106092c;
        public final UserInfo d;
        public final String e;
        public final String f;

        @NotNull
        public static final Parcelable.Creator<Success> CREATOR = new b();

        public static final class b implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                SessionToken sessionTokenCreateFromParcel = SessionToken.CREATOR.createFromParcel(parcel);
                String string = parcel.readString();
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(m.valueOf(parcel.readString()));
                }
                return new Success(sessionTokenCreateFromParcel, string, arrayList, (UserInfo) parcel.readParcelable(Success.class.getClassLoader()), parcel.readString(), ((AccountRegion) parcel.readParcelable(Success.class.getClassLoader())).f51201a);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Success[i];
            }
        }

        public Success(SessionToken sessionToken, String code, ArrayList enrollableClaims, UserInfo userInfo, String str, String region) {
            Intrinsics.checkNotNullParameter(sessionToken, "sessionToken");
            Intrinsics.checkNotNullParameter(code, "code");
            Intrinsics.checkNotNullParameter(enrollableClaims, "enrollableClaims");
            Intrinsics.checkNotNullParameter(region, "region");
            this.f106090a = sessionToken;
            this.f106091b = code;
            this.f106092c = enrollableClaims;
            this.d = userInfo;
            this.e = str;
            this.f = region;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Success)) {
                return false;
            }
            Success success = (Success) obj2;
            return Intrinsics.f(this.f106090a, success.f106090a) && Intrinsics.f(this.f106091b, success.f106091b) && this.f106092c.equals(success.f106092c) && Intrinsics.f(this.d, success.d) && Intrinsics.f(this.e, success.e) && Intrinsics.f(this.f, success.f);
        }

        public final int hashCode() {
            int iB = com.google.android.gms.internal.mlkit_vision_face.a.b(this.f106092c, p.a.c(this.f106090a.f106160a.hashCode() * 31, 31, this.f106091b), 31);
            UserInfo userInfo = this.d;
            int iHashCode = (iB + (userInfo == null ? 0 : userInfo.hashCode())) * 31;
            String str = this.e;
            return this.f.hashCode() + ((iHashCode + (str != null ? str.hashCode() : 0)) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f106090a.writeToParcel(dest, i);
            dest.writeString(this.f106091b);
            Iterator itY = j6.a.y(this.f106092c, dest);
            while (itY.hasNext()) {
                dest.writeString(((m) itY.next()).name());
            }
            dest.writeParcelable(this.d, i);
            dest.writeString(this.e);
            dest.writeParcelable(new AccountRegion(this.f), i);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/sso/impl/domain/models/AuthResult$SuccessDelegated;", "Lcom/revolut/sso/impl/domain/models/AuthResult;", "<init>", "()V", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class SuccessDelegated implements AuthResult {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final SuccessDelegated f106093a = new SuccessDelegated();

        @NotNull
        public static final Parcelable.Creator<SuccessDelegated> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return SuccessDelegated.f106093a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SuccessDelegated[i];
            }
        }

        private SuccessDelegated() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/sso/impl/domain/models/AuthResult$TooManyChallenges;", "Lcom/revolut/sso/impl/domain/models/AuthResult;", "", "toString", "()Ljava/lang/String;", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class TooManyChallenges implements AuthResult {

        @NotNull
        public static final Parcelable.Creator<TooManyChallenges> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final i f106094a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ZonedDateTime f106095b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Set f106096c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                i iVarValueOf = parcel.readInt() == 0 ? null : i.valueOf(parcel.readString());
                ZonedDateTime zonedDateTime = (ZonedDateTime) parcel.readSerializable();
                int i = parcel.readInt();
                LinkedHashSet linkedHashSet = new LinkedHashSet(i);
                for (int i2 = 0; i2 != i; i2++) {
                    linkedHashSet.add(a3.valueOf(parcel.readString()));
                }
                return new TooManyChallenges(iVarValueOf, zonedDateTime, linkedHashSet);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new TooManyChallenges[i];
            }
        }

        public TooManyChallenges(i iVar, ZonedDateTime zonedDateTime, Set actions) {
            Intrinsics.checkNotNullParameter(actions, "actions");
            this.f106094a = iVar;
            this.f106095b = zonedDateTime;
            this.f106096c = actions;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof TooManyChallenges)) {
                return false;
            }
            TooManyChallenges tooManyChallenges = (TooManyChallenges) obj2;
            return this.f106094a == tooManyChallenges.f106094a && Intrinsics.f(this.f106095b, tooManyChallenges.f106095b) && Intrinsics.f(this.f106096c, tooManyChallenges.f106096c);
        }

        public final int hashCode() {
            i iVar = this.f106094a;
            int iHashCode = (iVar == null ? 0 : iVar.hashCode()) * 31;
            ZonedDateTime zonedDateTime = this.f106095b;
            return this.f106096c.hashCode() + ((iHashCode + (zonedDateTime != null ? zonedDateTime.hashCode() : 0)) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            i iVar = this.f106094a;
            if (iVar == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(iVar.name());
            }
            dest.writeSerializable(this.f106095b);
            Iterator itV = n.v(this.f106096c, dest);
            while (itV.hasNext()) {
                dest.writeString(((a3) itV.next()).name());
            }
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/sso/impl/domain/models/AuthResult$Unauthorised;", "Lcom/revolut/sso/impl/domain/models/AuthResult$ErrorResult;", "<init>", "()V", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Unauthorised implements ErrorResult {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Unauthorised f106097a = new Unauthorised();

        @NotNull
        public static final Parcelable.Creator<Unauthorised> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Unauthorised.f106097a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Unauthorised[i];
            }
        }

        private Unauthorised() {
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
