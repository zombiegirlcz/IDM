package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.fido.fido2.api.common.Attachment;
import com.google.android.gms.fido.fido2.api.common.ResidentKeyRequirement;
import com.google.android.gms.internal.mlkit_vision_face.a;

/* JADX INFO: loaded from: classes16.dex */
@SafeParcelable.Class(creator = "AuthenticatorSelectionCriteriaCreator")
@SafeParcelable.Reserved({1})
public class AuthenticatorSelectionCriteria extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<AuthenticatorSelectionCriteria> CREATOR = new zzm();

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getAttachmentAsString", id = 2, type = "java.lang.String")
    private final Attachment f38488zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getRequireResidentKey", id = 3)
    private final Boolean f38489zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getRequireUserVerificationAsString", id = 4, type = "java.lang.String")
    private final UserVerificationRequirement f38490zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getResidentKeyRequirementAsString", id = 5, type = "java.lang.String")
    private final ResidentKeyRequirement f38491zzd;

    public static class Builder {

        /* JADX INFO: renamed from: zza, reason: collision with root package name */
        private Attachment f38492zza;

        /* JADX INFO: renamed from: zzb, reason: collision with root package name */
        private Boolean f38493zzb;

        /* JADX INFO: renamed from: zzc, reason: collision with root package name */
        private ResidentKeyRequirement f38494zzc;

        @NonNull
        public AuthenticatorSelectionCriteria build() {
            Attachment attachment = this.f38492zza;
            String string = attachment == null ? null : attachment.toString();
            Boolean bool = this.f38493zzb;
            ResidentKeyRequirement residentKeyRequirement = this.f38494zzc;
            return new AuthenticatorSelectionCriteria(string, bool, null, residentKeyRequirement == null ? null : residentKeyRequirement.toString());
        }

        @NonNull
        public Builder setAttachment(Attachment attachment) {
            this.f38492zza = attachment;
            return this;
        }

        @NonNull
        public Builder setRequireResidentKey(Boolean bool) {
            this.f38493zzb = bool;
            return this;
        }

        @NonNull
        public Builder setResidentKeyRequirement(ResidentKeyRequirement residentKeyRequirement) {
            this.f38494zzc = residentKeyRequirement;
            return this;
        }
    }

    @SafeParcelable.Constructor
    public AuthenticatorSelectionCriteria(@SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 3) Boolean bool, @SafeParcelable.Param(id = 4) String str2, @SafeParcelable.Param(id = 5) String str3) {
        Attachment attachmentFromString;
        ResidentKeyRequirement residentKeyRequirementFromString = null;
        if (str == null) {
            attachmentFromString = null;
        } else {
            try {
                attachmentFromString = Attachment.fromString(str);
            } catch (Attachment.UnsupportedAttachmentException | ResidentKeyRequirement.UnsupportedResidentKeyRequirementException | zzbc e) {
                throw new IllegalArgumentException(e);
            }
        }
        this.f38488zza = attachmentFromString;
        this.f38489zzb = bool;
        this.f38490zzc = str2 == null ? null : UserVerificationRequirement.fromString(str2);
        if (str3 != null) {
            residentKeyRequirementFromString = ResidentKeyRequirement.fromString(str3);
        }
        this.f38491zzd = residentKeyRequirementFromString;
    }

    public boolean equals(Object obj2) {
        if (!(obj2 instanceof AuthenticatorSelectionCriteria)) {
            return false;
        }
        AuthenticatorSelectionCriteria authenticatorSelectionCriteria = (AuthenticatorSelectionCriteria) obj2;
        return Objects.equal(this.f38488zza, authenticatorSelectionCriteria.f38488zza) && Objects.equal(this.f38489zzb, authenticatorSelectionCriteria.f38489zzb) && Objects.equal(this.f38490zzc, authenticatorSelectionCriteria.f38490zzc) && Objects.equal(getResidentKeyRequirement(), authenticatorSelectionCriteria.getResidentKeyRequirement());
    }

    public Attachment getAttachment() {
        return this.f38488zza;
    }

    public String getAttachmentAsString() {
        Attachment attachment = this.f38488zza;
        if (attachment == null) {
            return null;
        }
        return attachment.toString();
    }

    public Boolean getRequireResidentKey() {
        return this.f38489zzb;
    }

    public ResidentKeyRequirement getResidentKeyRequirement() {
        ResidentKeyRequirement residentKeyRequirement = this.f38491zzd;
        if (residentKeyRequirement != null) {
            return residentKeyRequirement;
        }
        Boolean bool = this.f38489zzb;
        if (bool == null || !bool.booleanValue()) {
            return null;
        }
        return ResidentKeyRequirement.RESIDENT_KEY_REQUIRED;
    }

    public String getResidentKeyRequirementAsString() {
        ResidentKeyRequirement residentKeyRequirement = getResidentKeyRequirement();
        if (residentKeyRequirement == null) {
            return null;
        }
        return residentKeyRequirement.toString();
    }

    public int hashCode() {
        return Objects.hashCode(this.f38488zza, this.f38489zzb, this.f38490zzc, getResidentKeyRequirement());
    }

    @NonNull
    public final String toString() {
        ResidentKeyRequirement residentKeyRequirement = this.f38491zzd;
        UserVerificationRequirement userVerificationRequirement = this.f38490zzc;
        String strValueOf = String.valueOf(this.f38488zza);
        String strValueOf2 = String.valueOf(userVerificationRequirement);
        String strValueOf3 = String.valueOf(residentKeyRequirement);
        StringBuilder sbX = a.x("AuthenticatorSelectionCriteria{\n attachment=", strValueOf, ", \n requireResidentKey=");
        sbX.append(this.f38489zzb);
        sbX.append(", \n requireUserVerification=");
        sbX.append(strValueOf2);
        sbX.append(", \n residentKeyRequirement=");
        return v0.a.i(sbX, strValueOf3, "\n }");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, getAttachmentAsString(), false);
        SafeParcelWriter.writeBooleanObject(parcel, 3, getRequireResidentKey(), false);
        UserVerificationRequirement userVerificationRequirement = this.f38490zzc;
        SafeParcelWriter.writeString(parcel, 4, userVerificationRequirement == null ? null : userVerificationRequirement.toString(), false);
        SafeParcelWriter.writeString(parcel, 5, getResidentKeyRequirementAsString(), false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
