package com.google.android.gms.auth.api.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes16.dex */
@SafeParcelable.Class(creator = "SignInConfigurationCreator")
@SafeParcelable.Reserved({1})
public final class SignInConfiguration extends AbstractSafeParcelable implements ReflectedParcelable {

    @NonNull
    public static final Parcelable.Creator<SignInConfiguration> CREATOR = new zbu();

    /* JADX INFO: renamed from: zba, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getConsumerPkgName", id = 2)
    private final String f37509zba;

    /* JADX INFO: renamed from: zbb, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getGoogleConfig", id = 5)
    private final GoogleSignInOptions f37510zbb;

    @SafeParcelable.Constructor
    public SignInConfiguration(@NonNull @SafeParcelable.Param(id = 2) String str, @NonNull @SafeParcelable.Param(id = 5) GoogleSignInOptions googleSignInOptions) {
        this.f37509zba = Preconditions.checkNotEmpty(str);
        this.f37510zbb = googleSignInOptions;
    }

    public final boolean equals(Object obj2) {
        if (!(obj2 instanceof SignInConfiguration)) {
            return false;
        }
        SignInConfiguration signInConfiguration = (SignInConfiguration) obj2;
        if (this.f37509zba.equals(signInConfiguration.f37509zba)) {
            GoogleSignInOptions googleSignInOptions = this.f37510zbb;
            GoogleSignInOptions googleSignInOptions2 = signInConfiguration.f37510zbb;
            if (googleSignInOptions == null) {
                if (googleSignInOptions2 == null) {
                    return true;
                }
            } else if (googleSignInOptions.equals(googleSignInOptions2)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return new HashAccumulator().addObject(this.f37509zba).addObject(this.f37510zbb).hash();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        String str = this.f37509zba;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, str, false);
        SafeParcelWriter.writeParcelable(parcel, 5, this.f37510zbb, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @NonNull
    public final GoogleSignInOptions zba() {
        return this.f37510zbb;
    }
}
