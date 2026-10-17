package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import v0.a;

/* JADX INFO: loaded from: classes16.dex */
@SafeParcelable.Class(creator = "PublicKeyCredentialRpEntityCreator")
@SafeParcelable.Reserved({1})
public class PublicKeyCredentialRpEntity extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<PublicKeyCredentialRpEntity> CREATOR = new zzas();

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    @NonNull
    @SafeParcelable.Field(getter = "getId", id = 2)
    private final String f38586zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    @NonNull
    @SafeParcelable.Field(getter = "getName", id = 3)
    private final String f38587zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getIcon", id = 4)
    private final String f38588zzc;

    @SafeParcelable.Constructor
    public PublicKeyCredentialRpEntity(@NonNull @SafeParcelable.Param(id = 2) String str, @NonNull @SafeParcelable.Param(id = 3) String str2, @SafeParcelable.Param(id = 4) String str3) {
        this.f38586zza = (String) Preconditions.checkNotNull(str);
        this.f38587zzb = (String) Preconditions.checkNotNull(str2);
        this.f38588zzc = str3;
    }

    public boolean equals(Object obj2) {
        if (!(obj2 instanceof PublicKeyCredentialRpEntity)) {
            return false;
        }
        PublicKeyCredentialRpEntity publicKeyCredentialRpEntity = (PublicKeyCredentialRpEntity) obj2;
        return Objects.equal(this.f38586zza, publicKeyCredentialRpEntity.f38586zza) && Objects.equal(this.f38587zzb, publicKeyCredentialRpEntity.f38587zzb) && Objects.equal(this.f38588zzc, publicKeyCredentialRpEntity.f38588zzc);
    }

    public String getIcon() {
        return this.f38588zzc;
    }

    @NonNull
    public String getId() {
        return this.f38586zza;
    }

    @NonNull
    public String getName() {
        return this.f38587zzb;
    }

    public int hashCode() {
        return Objects.hashCode(this.f38586zza, this.f38587zzb, this.f38588zzc);
    }

    @NonNull
    public final String toString() {
        StringBuilder sb6 = new StringBuilder("PublicKeyCredentialRpEntity{\n id='");
        sb6.append(this.f38586zza);
        sb6.append("', \n name='");
        sb6.append(this.f38587zzb);
        sb6.append("', \n icon='");
        return a.i(sb6, this.f38588zzc, "'}");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, getId(), false);
        SafeParcelWriter.writeString(parcel, 3, getName(), false);
        SafeParcelWriter.writeString(parcel, 4, getIcon(), false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
