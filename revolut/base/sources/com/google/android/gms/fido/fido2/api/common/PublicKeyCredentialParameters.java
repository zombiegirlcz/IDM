package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.fido.fido2.api.common.COSEAlgorithmIdentifier;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialType;
import j6.a;

/* JADX INFO: loaded from: classes16.dex */
@SafeParcelable.Class(creator = "PublicKeyCredentialParametersCreator")
@SafeParcelable.Reserved({1})
public class PublicKeyCredentialParameters extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<PublicKeyCredentialParameters> CREATOR = new zzaq();

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    @NonNull
    @SafeParcelable.Field(getter = "getTypeAsString", id = 2, type = "java.lang.String")
    private final PublicKeyCredentialType f38564zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    @NonNull
    @SafeParcelable.Field(getter = "getAlgorithmIdAsInteger", id = 3, type = "java.lang.Integer")
    private final COSEAlgorithmIdentifier f38565zzb;

    @SafeParcelable.Constructor
    public PublicKeyCredentialParameters(@NonNull @SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 3) int i) {
        Preconditions.checkNotNull(str);
        try {
            this.f38564zza = PublicKeyCredentialType.fromString(str);
            Preconditions.checkNotNull(Integer.valueOf(i));
            try {
                this.f38565zzb = COSEAlgorithmIdentifier.fromCoseValue(i);
            } catch (COSEAlgorithmIdentifier.UnsupportedAlgorithmIdentifierException e) {
                throw new IllegalArgumentException(e);
            }
        } catch (PublicKeyCredentialType.UnsupportedPublicKeyCredTypeException e2) {
            throw new IllegalArgumentException(e2);
        }
    }

    public boolean equals(Object obj2) {
        if (!(obj2 instanceof PublicKeyCredentialParameters)) {
            return false;
        }
        PublicKeyCredentialParameters publicKeyCredentialParameters = (PublicKeyCredentialParameters) obj2;
        return this.f38564zza.equals(publicKeyCredentialParameters.f38564zza) && this.f38565zzb.equals(publicKeyCredentialParameters.f38565zzb);
    }

    @NonNull
    public COSEAlgorithmIdentifier getAlgorithm() {
        return this.f38565zzb;
    }

    public int getAlgorithmIdAsInteger() {
        return this.f38565zzb.toCoseValue();
    }

    @NonNull
    public PublicKeyCredentialType getType() {
        return this.f38564zza;
    }

    @NonNull
    public String getTypeAsString() {
        return this.f38564zza.toString();
    }

    public int hashCode() {
        return Objects.hashCode(this.f38564zza, this.f38565zzb);
    }

    @NonNull
    public final String toString() {
        return a.s("PublicKeyCredentialParameters{\n type=", String.valueOf(this.f38564zza), ", \n algorithm=", String.valueOf(this.f38565zzb), "\n }");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, getTypeAsString(), false);
        SafeParcelWriter.writeIntegerObject(parcel, 3, Integer.valueOf(getAlgorithmIdAsInteger()), false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
