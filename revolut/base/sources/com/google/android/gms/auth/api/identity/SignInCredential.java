package com.google.android.gms.auth.api.identity;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredential;

/* JADX INFO: loaded from: classes16.dex */
@SafeParcelable.Class(creator = "SignInCredentialCreator")
@Deprecated
public final class SignInCredential extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<SignInCredential> CREATOR = new zbu();

    /* JADX INFO: renamed from: zba, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getId", id = 1)
    private final String f37443zba;

    /* JADX INFO: renamed from: zbb, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getDisplayName", id = 2)
    private final String f37444zbb;

    @SafeParcelable.Field(getter = "getGivenName", id = 3)
    private final String zbc;

    /* JADX INFO: renamed from: zbd, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getFamilyName", id = 4)
    private final String f37445zbd;

    /* JADX INFO: renamed from: zbe, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getProfilePictureUri", id = 5)
    private final Uri f37446zbe;

    /* JADX INFO: renamed from: zbf, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getPassword", id = 6)
    private final String f37447zbf;

    /* JADX INFO: renamed from: zbg, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getGoogleIdToken", id = 7)
    private final String f37448zbg;

    /* JADX INFO: renamed from: zbh, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getPhoneNumber", id = 8)
    private final String f37449zbh;

    /* JADX INFO: renamed from: zbi, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getPublicKeyCredential", id = 9)
    private final PublicKeyCredential f37450zbi;

    @SafeParcelable.Constructor
    public SignInCredential(@SafeParcelable.Param(id = 1) String str, @SafeParcelable.Param(id = 2) String str2, @SafeParcelable.Param(id = 3) String str3, @SafeParcelable.Param(id = 4) String str4, @SafeParcelable.Param(id = 5) Uri uri2, @SafeParcelable.Param(id = 6) String str5, @SafeParcelable.Param(id = 7) String str6, @SafeParcelable.Param(id = 8) String str7, @SafeParcelable.Param(id = 9) PublicKeyCredential publicKeyCredential) {
        this.f37443zba = (String) Preconditions.checkNotNull(str);
        this.f37444zbb = str2;
        this.zbc = str3;
        this.f37445zbd = str4;
        this.f37446zbe = uri2;
        this.f37447zbf = str5;
        this.f37448zbg = str6;
        this.f37449zbh = str7;
        this.f37450zbi = publicKeyCredential;
    }

    public boolean equals(Object obj2) {
        if (!(obj2 instanceof SignInCredential)) {
            return false;
        }
        SignInCredential signInCredential = (SignInCredential) obj2;
        return Objects.equal(this.f37443zba, signInCredential.f37443zba) && Objects.equal(this.f37444zbb, signInCredential.f37444zbb) && Objects.equal(this.zbc, signInCredential.zbc) && Objects.equal(this.f37445zbd, signInCredential.f37445zbd) && Objects.equal(this.f37446zbe, signInCredential.f37446zbe) && Objects.equal(this.f37447zbf, signInCredential.f37447zbf) && Objects.equal(this.f37448zbg, signInCredential.f37448zbg) && Objects.equal(this.f37449zbh, signInCredential.f37449zbh) && Objects.equal(this.f37450zbi, signInCredential.f37450zbi);
    }

    public String getDisplayName() {
        return this.f37444zbb;
    }

    public String getFamilyName() {
        return this.f37445zbd;
    }

    public String getGivenName() {
        return this.zbc;
    }

    public String getGoogleIdToken() {
        return this.f37448zbg;
    }

    @NonNull
    public String getId() {
        return this.f37443zba;
    }

    public String getPassword() {
        return this.f37447zbf;
    }

    @Deprecated
    public String getPhoneNumber() {
        return this.f37449zbh;
    }

    public Uri getProfilePictureUri() {
        return this.f37446zbe;
    }

    public PublicKeyCredential getPublicKeyCredential() {
        return this.f37450zbi;
    }

    public int hashCode() {
        return Objects.hashCode(this.f37443zba, this.f37444zbb, this.zbc, this.f37445zbd, this.f37446zbe, this.f37447zbf, this.f37448zbg, this.f37449zbh, this.f37450zbi);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, getId(), false);
        SafeParcelWriter.writeString(parcel, 2, getDisplayName(), false);
        SafeParcelWriter.writeString(parcel, 3, getGivenName(), false);
        SafeParcelWriter.writeString(parcel, 4, getFamilyName(), false);
        SafeParcelWriter.writeParcelable(parcel, 5, getProfilePictureUri(), i, false);
        SafeParcelWriter.writeString(parcel, 6, getPassword(), false);
        SafeParcelWriter.writeString(parcel, 7, getGoogleIdToken(), false);
        SafeParcelWriter.writeString(parcel, 8, getPhoneNumber(), false);
        SafeParcelWriter.writeParcelable(parcel, 9, getPublicKeyCredential(), i, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
