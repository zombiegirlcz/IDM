package com.google.android.gms.auth.api.identity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes16.dex */
@SafeParcelable.Class(creator = "SignInPasswordCreator")
@Deprecated
public class SignInPassword extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<SignInPassword> CREATOR = new zbw();

    /* JADX INFO: renamed from: zba, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getId", id = 1)
    private final String f37451zba;

    /* JADX INFO: renamed from: zbb, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getPassword", id = 2)
    private final String f37452zbb;

    @SafeParcelable.Constructor
    public SignInPassword(@NonNull @SafeParcelable.Param(id = 1) String str, @NonNull @SafeParcelable.Param(id = 2) String str2) {
        this.f37451zba = Preconditions.checkNotEmpty(((String) Preconditions.checkNotNull(str, "Account identifier cannot be null")).trim(), "Account identifier cannot be empty");
        this.f37452zbb = Preconditions.checkNotEmpty(str2);
    }

    public boolean equals(Object obj2) {
        if (!(obj2 instanceof SignInPassword)) {
            return false;
        }
        SignInPassword signInPassword = (SignInPassword) obj2;
        return Objects.equal(this.f37451zba, signInPassword.f37451zba) && Objects.equal(this.f37452zbb, signInPassword.f37452zbb);
    }

    @NonNull
    public String getId() {
        return this.f37451zba;
    }

    @NonNull
    public String getPassword() {
        return this.f37452zbb;
    }

    public int hashCode() {
        return Objects.hashCode(this.f37451zba, this.f37452zbb);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, getId(), false);
        SafeParcelWriter.writeString(parcel, 2, getPassword(), false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
