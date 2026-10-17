package com.revolut.sso.impl.domain.models;

import android.os.Parcel;
import android.os.Parcelable;
import gkl.m;
import ip0.v7;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u0000 \u00022\u00020\u0001:\u000b\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u0082\u0001\t\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016¨\u0006\u0017À\u0006\u0003"}, d2 = {"Lcom/revolut/sso/impl/domain/models/Claim;", "Landroid/os/Parcelable;", "Companion", "BioPublicKey", "Email", "Google", "IdentityId", "Phone", "Pin", "Password", "PublicKey", "WebAuthn", "gkl/m", "a", "Lcom/revolut/sso/impl/domain/models/Claim$BioPublicKey;", "Lcom/revolut/sso/impl/domain/models/Claim$Email;", "Lcom/revolut/sso/impl/domain/models/Claim$Google;", "Lcom/revolut/sso/impl/domain/models/Claim$IdentityId;", "Lcom/revolut/sso/impl/domain/models/Claim$Password;", "Lcom/revolut/sso/impl/domain/models/Claim$Phone;", "Lcom/revolut/sso/impl/domain/models/Claim$Pin;", "Lcom/revolut/sso/impl/domain/models/Claim$PublicKey;", "Lcom/revolut/sso/impl/domain/models/Claim$WebAuthn;", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface Claim extends Parcelable {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.f106139a;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0001\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/revolut/sso/impl/domain/models/Claim$BioPublicKey;", "Lcom/revolut/sso/impl/domain/models/Claim;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class BioPublicKey implements Claim {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f106125a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f106126b;

        @NotNull
        public static final Parcelable.Creator<BioPublicKey> CREATOR = new b();

        public static final class b implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new BioPublicKey(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new BioPublicKey[i];
            }
        }

        public BioPublicKey(String key, String algorithm) {
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(algorithm, "algorithm");
            this.f106125a = key;
            this.f106126b = algorithm;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof BioPublicKey)) {
                return false;
            }
            BioPublicKey bioPublicKey = (BioPublicKey) obj2;
            return Intrinsics.f(this.f106125a, bioPublicKey.f106125a) && Intrinsics.f(this.f106126b, bioPublicKey.f106126b);
        }

        public final int hashCode() {
            return this.f106126b.hashCode() + (this.f106125a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f106125a);
            dest.writeString(this.f106126b);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087@\u0018\u00002\u00020\u0001\u0088\u0001\u0002\u0092\u0001\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/sso/impl/domain/models/Claim$Email;", "Lcom/revolut/sso/impl/domain/models/Claim;", "value", "", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Email implements Claim {

        @NotNull
        public static final Parcelable.Creator<Email> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f106127a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new Email(v7.t(parcel, "parcel", "value"));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Email[i];
            }
        }

        public /* synthetic */ Email(String str) {
            this.f106127a = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (obj2 instanceof Email) {
                return Intrinsics.f(this.f106127a, ((Email) obj2).f106127a);
            }
            return false;
        }

        public final int hashCode() {
            return this.f106127a.hashCode();
        }

        public final String toString() {
            return p.a.p("Email(value=", this.f106127a, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f106127a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087@\u0018\u00002\u00020\u0001\u0088\u0001\u0002\u0092\u0001\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/sso/impl/domain/models/Claim$Google;", "Lcom/revolut/sso/impl/domain/models/Claim;", "id", "", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Google implements Claim {

        @NotNull
        public static final Parcelable.Creator<Google> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f106128a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new Google(v7.t(parcel, "parcel", "id"));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Google[i];
            }
        }

        public /* synthetic */ Google(String str) {
            this.f106128a = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (obj2 instanceof Google) {
                return Intrinsics.f(this.f106128a, ((Google) obj2).f106128a);
            }
            return false;
        }

        public final int hashCode() {
            return this.f106128a.hashCode();
        }

        public final String toString() {
            return p.a.p("Google(id=", this.f106128a, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f106128a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087@\u0018\u00002\u00020\u0001\u0088\u0001\u0002\u0092\u0001\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/sso/impl/domain/models/Claim$IdentityId;", "Lcom/revolut/sso/impl/domain/models/Claim;", "value", "", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class IdentityId implements Claim {

        @NotNull
        public static final Parcelable.Creator<IdentityId> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f106129a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new IdentityId(v7.t(parcel, "parcel", "value"));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new IdentityId[i];
            }
        }

        public /* synthetic */ IdentityId(String str) {
            this.f106129a = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (obj2 instanceof IdentityId) {
                return Intrinsics.f(this.f106129a, ((IdentityId) obj2).f106129a);
            }
            return false;
        }

        public final int hashCode() {
            return this.f106129a.hashCode();
        }

        public final String toString() {
            return p.a.p("IdentityId(value=", this.f106129a, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f106129a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087@\u0018\u00002\u00020\u0001\u0088\u0001\u0002\u0092\u0001\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/sso/impl/domain/models/Claim$Password;", "Lcom/revolut/sso/impl/domain/models/Claim;", "value", "", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Password implements Claim {

        @NotNull
        public static final Parcelable.Creator<Password> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f106130a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new Password(v7.t(parcel, "parcel", "value"));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Password[i];
            }
        }

        public /* synthetic */ Password(String str) {
            this.f106130a = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (obj2 instanceof Password) {
                return Intrinsics.f(this.f106130a, ((Password) obj2).f106130a);
            }
            return false;
        }

        public final int hashCode() {
            return this.f106130a.hashCode();
        }

        public final String toString() {
            return p.a.p("Password(value=", this.f106130a, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f106130a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087@\u0018\u00002\u00020\u0001\u0088\u0001\u0002\u0092\u0001\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/sso/impl/domain/models/Claim$Phone;", "Lcom/revolut/sso/impl/domain/models/Claim;", "value", "", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Phone implements Claim {

        @NotNull
        public static final Parcelable.Creator<Phone> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f106131a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new Phone(v7.t(parcel, "parcel", "value"));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Phone[i];
            }
        }

        public /* synthetic */ Phone(String str) {
            this.f106131a = str;
        }

        public static final void a(String str, Parcel dest) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(str);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (obj2 instanceof Phone) {
                return Intrinsics.f(this.f106131a, ((Phone) obj2).f106131a);
            }
            return false;
        }

        public final int hashCode() {
            return this.f106131a.hashCode();
        }

        public final String toString() {
            return p.a.p("Phone(value=", this.f106131a, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            a(this.f106131a, dest);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087@\u0018\u00002\u00020\u0001\u0088\u0001\u0002\u0092\u0001\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/sso/impl/domain/models/Claim$Pin;", "Lcom/revolut/sso/impl/domain/models/Claim;", "value", "", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Pin implements Claim {

        @NotNull
        public static final Parcelable.Creator<Pin> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f106132a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new Pin(v7.t(parcel, "parcel", "value"));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Pin[i];
            }
        }

        public /* synthetic */ Pin(String str) {
            this.f106132a = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (obj2 instanceof Pin) {
                return Intrinsics.f(this.f106132a, ((Pin) obj2).f106132a);
            }
            return false;
        }

        public final int hashCode() {
            return this.f106132a.hashCode();
        }

        public final String toString() {
            return p.a.p("Pin(value=", this.f106132a, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f106132a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0001\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/revolut/sso/impl/domain/models/Claim$PublicKey;", "Lcom/revolut/sso/impl/domain/models/Claim;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PublicKey implements Claim {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f106133a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f106134b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f106135c;
        public final String d;

        @NotNull
        public static final Parcelable.Creator<PublicKey> CREATOR = new b();

        public static final class b implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PublicKey(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PublicKey[i];
            }
        }

        public PublicKey(String key, String algorithm, String challengeId, String signature) {
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(algorithm, "algorithm");
            Intrinsics.checkNotNullParameter(challengeId, "challengeId");
            Intrinsics.checkNotNullParameter(signature, "signature");
            this.f106133a = key;
            this.f106134b = algorithm;
            this.f106135c = challengeId;
            this.d = signature;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof PublicKey)) {
                return false;
            }
            PublicKey publicKey = (PublicKey) obj2;
            return Intrinsics.f(this.f106133a, publicKey.f106133a) && Intrinsics.f(this.f106134b, publicKey.f106134b) && Intrinsics.f(this.f106135c, publicKey.f106135c) && Intrinsics.f(this.d, publicKey.d);
        }

        public final int hashCode() {
            return this.d.hashCode() + p.a.c(p.a.c(this.f106133a.hashCode() * 31, 31, this.f106134b), 31, this.f106135c);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f106133a);
            dest.writeString(this.f106134b);
            dest.writeString(this.f106135c);
            dest.writeString(this.d);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0001\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/revolut/sso/impl/domain/models/Claim$WebAuthn;", "Lcom/revolut/sso/impl/domain/models/Claim;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class WebAuthn implements Claim {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f106136a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f106137b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f106138c;
        public final String d;

        @NotNull
        public static final Parcelable.Creator<WebAuthn> CREATOR = new b();

        public static final class b implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new WebAuthn(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new WebAuthn[i];
            }
        }

        public WebAuthn(String challengeId, String id10, String attestationObject, String clientDataJson) {
            Intrinsics.checkNotNullParameter(challengeId, "challengeId");
            Intrinsics.checkNotNullParameter(id10, "id");
            Intrinsics.checkNotNullParameter(attestationObject, "attestationObject");
            Intrinsics.checkNotNullParameter(clientDataJson, "clientDataJson");
            this.f106136a = challengeId;
            this.f106137b = id10;
            this.f106138c = attestationObject;
            this.d = clientDataJson;
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
            return Intrinsics.f(this.f106136a, webAuthn.f106136a) && Intrinsics.f(this.f106137b, webAuthn.f106137b) && Intrinsics.f(this.f106138c, webAuthn.f106138c) && Intrinsics.f(this.d, webAuthn.d);
        }

        public final int hashCode() {
            return this.d.hashCode() + p.a.c(p.a.c(this.f106136a.hashCode() * 31, 31, this.f106137b), 31, this.f106138c);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f106136a);
            dest.writeString(this.f106137b);
            dest.writeString(this.f106138c);
            dest.writeString(this.d);
        }
    }

    /* JADX INFO: renamed from: com.revolut.sso.impl.domain.models.Claim$a, reason: from kotlin metadata */
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Companion f106139a = new Companion();

        private Companion() {
        }

        public static m a(Claim claim) {
            Intrinsics.checkNotNullParameter(claim, "<this>");
            if (claim instanceof Email) {
                return m.EMAIL;
            }
            if (claim instanceof Google) {
                return m.GOOGLE;
            }
            if (claim instanceof IdentityId) {
                return m.IDENTITY_ID;
            }
            if (claim instanceof Password) {
                return m.PASSWORD;
            }
            if (claim instanceof Phone) {
                return m.PHONE;
            }
            if (claim instanceof Pin) {
                return m.PIN;
            }
            if (claim instanceof BioPublicKey) {
                return m.BIO_PUBLIC_KEY;
            }
            if (claim instanceof PublicKey) {
                return m.PUBLIC_KEY;
            }
            if (claim instanceof WebAuthn) {
                return m.WEBAUTHN;
            }
            throw new NoWhenBranchMatchedException();
        }
    }
}
