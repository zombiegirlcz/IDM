package com.revolut.sso.impl.domain.models;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.b;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u000b\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\u0082\u0001\u000b\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017¨\u0006\u0018À\u0006\u0003"}, d2 = {"Lcom/revolut/sso/impl/domain/models/ChallengeDetails;", "Landroid/os/Parcelable;", "BiometricVerification", "DAP", "BankId", "InSms", "Okta", "PushOtp", "Rcs", "SilentAuth", "UaePass", "WhatsApp", "WebAuthn", "Lcom/revolut/sso/impl/domain/models/ChallengeDetails$BankId;", "Lcom/revolut/sso/impl/domain/models/ChallengeDetails$BiometricVerification;", "Lcom/revolut/sso/impl/domain/models/ChallengeDetails$DAP;", "Lcom/revolut/sso/impl/domain/models/ChallengeDetails$InSms;", "Lcom/revolut/sso/impl/domain/models/ChallengeDetails$Okta;", "Lcom/revolut/sso/impl/domain/models/ChallengeDetails$PushOtp;", "Lcom/revolut/sso/impl/domain/models/ChallengeDetails$Rcs;", "Lcom/revolut/sso/impl/domain/models/ChallengeDetails$SilentAuth;", "Lcom/revolut/sso/impl/domain/models/ChallengeDetails$UaePass;", "Lcom/revolut/sso/impl/domain/models/ChallengeDetails$WebAuthn;", "Lcom/revolut/sso/impl/domain/models/ChallengeDetails$WhatsApp;", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface ChallengeDetails extends Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0001\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/revolut/sso/impl/domain/models/ChallengeDetails$BankId;", "Lcom/revolut/sso/impl/domain/models/ChallengeDetails;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class BankId implements ChallengeDetails {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f106106a;

        @NotNull
        public static final Parcelable.Creator<BankId> CREATOR = new b();

        public static final class b implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new BankId(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new BankId[i];
            }
        }

        public BankId(String deeplink) {
            Intrinsics.checkNotNullParameter(deeplink, "deeplink");
            this.f106106a = deeplink;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof BankId) && Intrinsics.f(this.f106106a, ((BankId) obj2).f106106a);
        }

        public final int hashCode() {
            return this.f106106a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f106106a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0001\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/revolut/sso/impl/domain/models/ChallengeDetails$BiometricVerification;", "Lcom/revolut/sso/impl/domain/models/ChallengeDetails;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class BiometricVerification implements ChallengeDetails {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f106107a;

        @NotNull
        public static final Parcelable.Creator<BiometricVerification> CREATOR = new b();

        public static final class b implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new BiometricVerification(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new BiometricVerification[i];
            }
        }

        public BiometricVerification(String str) {
            this.f106107a = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof BiometricVerification) && Intrinsics.f(this.f106107a, ((BiometricVerification) obj2).f106107a);
        }

        public final int hashCode() {
            String str = this.f106107a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f106107a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0001\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/revolut/sso/impl/domain/models/ChallengeDetails$DAP;", "Lcom/revolut/sso/impl/domain/models/ChallengeDetails;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class DAP implements ChallengeDetails {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f106108a;

        @NotNull
        public static final Parcelable.Creator<DAP> CREATOR = new b();

        public static final class b implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new DAP(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new DAP[i];
            }
        }

        public DAP(String deeplink) {
            Intrinsics.checkNotNullParameter(deeplink, "deeplink");
            this.f106108a = deeplink;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof DAP) && Intrinsics.f(this.f106108a, ((DAP) obj2).f106108a);
        }

        public final int hashCode() {
            return this.f106108a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f106108a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0001\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/revolut/sso/impl/domain/models/ChallengeDetails$InSms;", "Lcom/revolut/sso/impl/domain/models/ChallengeDetails;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class InSms implements ChallengeDetails {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f106109a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f106110b;

        @NotNull
        public static final Parcelable.Creator<InSms> CREATOR = new b();

        public static final class b implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new InSms(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new InSms[i];
            }
        }

        public InSms(String phone, String text) {
            Intrinsics.checkNotNullParameter(phone, "phone");
            Intrinsics.checkNotNullParameter(text, "text");
            this.f106109a = phone;
            this.f106110b = text;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof InSms)) {
                return false;
            }
            InSms inSms = (InSms) obj2;
            return Intrinsics.f(this.f106109a, inSms.f106109a) && Intrinsics.f(this.f106110b, inSms.f106110b);
        }

        public final int hashCode() {
            return this.f106110b.hashCode() + (this.f106109a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f106109a);
            dest.writeString(this.f106110b);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0001\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/revolut/sso/impl/domain/models/ChallengeDetails$Okta;", "Lcom/revolut/sso/impl/domain/models/ChallengeDetails;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Okta implements ChallengeDetails {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f106111a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f106112b;

        @NotNull
        public static final Parcelable.Creator<Okta> CREATOR = new b();

        public static final class b implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Okta(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Okta[i];
            }
        }

        public Okta(String authorizationUrl, String callbackUrl) {
            Intrinsics.checkNotNullParameter(authorizationUrl, "authorizationUrl");
            Intrinsics.checkNotNullParameter(callbackUrl, "callbackUrl");
            this.f106111a = authorizationUrl;
            this.f106112b = callbackUrl;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Okta)) {
                return false;
            }
            Okta okta = (Okta) obj2;
            return Intrinsics.f(this.f106111a, okta.f106111a) && Intrinsics.f(this.f106112b, okta.f106112b);
        }

        public final int hashCode() {
            return this.f106112b.hashCode() + (this.f106111a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f106111a);
            dest.writeString(this.f106112b);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0001\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/revolut/sso/impl/domain/models/ChallengeDetails$PushOtp;", "Lcom/revolut/sso/impl/domain/models/ChallengeDetails;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PushOtp implements ChallengeDetails {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f106113a;

        @NotNull
        public static final Parcelable.Creator<PushOtp> CREATOR = new b();

        public static final class b implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PushOtp(parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PushOtp[i];
            }
        }

        public PushOtp(boolean z) {
            this.f106113a = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof PushOtp) && this.f106113a == ((PushOtp) obj2).f106113a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f106113a);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.f106113a ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0001\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/revolut/sso/impl/domain/models/ChallengeDetails$Rcs;", "Lcom/revolut/sso/impl/domain/models/ChallengeDetails;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Rcs implements ChallengeDetails {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f106114a;

        @NotNull
        public static final Parcelable.Creator<Rcs> CREATOR = new b();

        public static final class b implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Rcs(parcel.readLong());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Rcs[i];
            }
        }

        public Rcs(long j2) {
            this.f106114a = j2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Rcs) && kotlin.time.b.d(this.f106114a, ((Rcs) obj2).f106114a);
        }

        public final int hashCode() {
            b.Companion companion = kotlin.time.b.INSTANCE;
            return Long.hashCode(this.f106114a);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeLong(this.f106114a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0001\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/revolut/sso/impl/domain/models/ChallengeDetails$SilentAuth;", "Lcom/revolut/sso/impl/domain/models/ChallengeDetails;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SilentAuth implements ChallengeDetails {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f106115a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f106116b;

        @NotNull
        public static final Parcelable.Creator<SilentAuth> CREATOR = new b();

        public static final class b implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SilentAuth(parcel.readString(), parcel.readLong());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SilentAuth[i];
            }
        }

        public SilentAuth(String checkUrl, long j2) {
            Intrinsics.checkNotNullParameter(checkUrl, "checkUrl");
            this.f106115a = checkUrl;
            this.f106116b = j2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof SilentAuth)) {
                return false;
            }
            SilentAuth silentAuth = (SilentAuth) obj2;
            return Intrinsics.f(this.f106115a, silentAuth.f106115a) && kotlin.time.b.d(this.f106116b, silentAuth.f106116b);
        }

        public final int hashCode() {
            int iHashCode = this.f106115a.hashCode() * 31;
            b.Companion companion = kotlin.time.b.INSTANCE;
            return Long.hashCode(this.f106116b) + iHashCode;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f106115a);
            dest.writeLong(this.f106116b);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0001\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/revolut/sso/impl/domain/models/ChallengeDetails$UaePass;", "Lcom/revolut/sso/impl/domain/models/ChallengeDetails;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class UaePass implements ChallengeDetails {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f106117a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f106118b;

        @NotNull
        public static final Parcelable.Creator<UaePass> CREATOR = new b();

        public static final class b implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new UaePass(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new UaePass[i];
            }
        }

        public UaePass(String authorizationUrl, String callbackUrl) {
            Intrinsics.checkNotNullParameter(authorizationUrl, "authorizationUrl");
            Intrinsics.checkNotNullParameter(callbackUrl, "callbackUrl");
            this.f106117a = authorizationUrl;
            this.f106118b = callbackUrl;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof UaePass)) {
                return false;
            }
            UaePass uaePass = (UaePass) obj2;
            return Intrinsics.f(this.f106117a, uaePass.f106117a) && Intrinsics.f(this.f106118b, uaePass.f106118b);
        }

        public final int hashCode() {
            return this.f106118b.hashCode() + (this.f106117a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f106117a);
            dest.writeString(this.f106118b);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0002\u0006\u0007J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lcom/revolut/sso/impl/domain/models/ChallengeDetails$WebAuthn;", "Lcom/revolut/sso/impl/domain/models/ChallengeDetails;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "Algorithm", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class WebAuthn implements ChallengeDetails {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ArrayList f106119a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List f106120b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f106121c;

        @NotNull
        public static final Parcelable.Creator<WebAuthn> CREATOR = new b();

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/sso/impl/domain/models/ChallengeDetails$WebAuthn$Algorithm;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Algorithm implements Parcelable {

            @NotNull
            public static final Parcelable.Creator<Algorithm> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f106122a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final int f106123b;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Algorithm(parcel.readString(), parcel.readInt());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Algorithm[i];
                }
            }

            public Algorithm(String name, int i) {
                Intrinsics.checkNotNullParameter(name, "name");
                this.f106122a = name;
                this.f106123b = i;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof Algorithm)) {
                    return false;
                }
                Algorithm algorithm = (Algorithm) obj2;
                return Intrinsics.f(this.f106122a, algorithm.f106122a) && this.f106123b == algorithm.f106123b;
            }

            public final int hashCode() {
                return Integer.hashCode(this.f106123b) + (this.f106122a.hashCode() * 31);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f106122a);
                dest.writeInt(this.f106123b);
            }
        }

        public static final class b implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iA = 0;
                while (iA != i) {
                    iA = org.bouncycastle.jcajce.provider.digest.a.a(Algorithm.CREATOR, parcel, arrayList, iA, 1);
                }
                return new WebAuthn(parcel.readString(), arrayList, parcel.createStringArrayList());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new WebAuthn[i];
            }
        }

        public WebAuthn(String relyingParty, ArrayList algorithms, List credentials) {
            Intrinsics.checkNotNullParameter(algorithms, "algorithms");
            Intrinsics.checkNotNullParameter(credentials, "credentials");
            Intrinsics.checkNotNullParameter(relyingParty, "relyingParty");
            this.f106119a = algorithms;
            this.f106120b = credentials;
            this.f106121c = relyingParty;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof WebAuthn)) {
                return false;
            }
            WebAuthn webAuthn = (WebAuthn) obj2;
            return this.f106119a.equals(webAuthn.f106119a) && Intrinsics.f(this.f106120b, webAuthn.f106120b) && Intrinsics.f(this.f106121c, webAuthn.f106121c);
        }

        public final int hashCode() {
            return this.f106121c.hashCode() + p.a.d(this.f106119a.hashCode() * 31, 31, this.f106120b);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            Iterator itY = j6.a.y(this.f106119a, dest);
            while (itY.hasNext()) {
                ((Algorithm) itY.next()).writeToParcel(dest, i);
            }
            dest.writeStringList(this.f106120b);
            dest.writeString(this.f106121c);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0001\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/revolut/sso/impl/domain/models/ChallengeDetails$WhatsApp;", "Lcom/revolut/sso/impl/domain/models/ChallengeDetails;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class WhatsApp implements ChallengeDetails {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final kotlin.time.b f106124a;

        @NotNull
        public static final Parcelable.Creator<WhatsApp> CREATOR = new b();

        public static final class b implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new WhatsApp(parcel.readInt() == 0 ? null : new kotlin.time.b(parcel.readLong()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new WhatsApp[i];
            }
        }

        public WhatsApp(kotlin.time.b bVar) {
            this.f106124a = bVar;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof WhatsApp) && Intrinsics.f(this.f106124a, ((WhatsApp) obj2).f106124a);
        }

        public final int hashCode() {
            kotlin.time.b bVar = this.f106124a;
            if (bVar == null) {
                return 0;
            }
            return Long.hashCode(bVar.f187924a);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            kotlin.time.b bVar = this.f106124a;
            if (bVar == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeLong(bVar.f187924a);
            }
        }
    }
}
