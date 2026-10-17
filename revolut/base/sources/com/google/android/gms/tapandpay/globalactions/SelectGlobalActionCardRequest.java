package com.google.android.gms.tapandpay.globalactions;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes16.dex */
@ShowFirstParty
@SafeParcelable.Class(creator = "SelectGlobalActionCardRequestCreator")
public final class SelectGlobalActionCardRequest extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<SelectGlobalActionCardRequest> CREATOR = new zzh();

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getCardType", id = 2)
    private int f48595zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getCardId", id = 3)
    private String f48596zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getSelectionTimeoutMs", id = 4)
    private int f48597zzc;

    @ShowFirstParty
    public static final class Builder {

        /* JADX INFO: renamed from: zza, reason: collision with root package name */
        private final SelectGlobalActionCardRequest f48598zza;

        public Builder() {
            this.f48598zza = new SelectGlobalActionCardRequest(null);
        }

        @NonNull
        public SelectGlobalActionCardRequest build() {
            return this.f48598zza;
        }

        @NonNull
        public Builder setCardId(@NonNull String str) {
            this.f48598zza.f48596zzb = str;
            return this;
        }

        @NonNull
        public Builder setCardType(int i) {
            this.f48598zza.f48595zza = i;
            return this;
        }

        @NonNull
        public Builder setSelectionTimeoutMs(int i) {
            this.f48598zza.f48597zzc = i;
            return this;
        }

        public Builder(@NonNull SelectGlobalActionCardRequest selectGlobalActionCardRequest) {
            SelectGlobalActionCardRequest selectGlobalActionCardRequest2 = new SelectGlobalActionCardRequest(null);
            this.f48598zza = selectGlobalActionCardRequest2;
            selectGlobalActionCardRequest2.f48595zza = selectGlobalActionCardRequest.f48595zza;
            selectGlobalActionCardRequest2.f48596zzb = selectGlobalActionCardRequest.f48596zzb;
            selectGlobalActionCardRequest2.f48597zzc = selectGlobalActionCardRequest.f48597zzc;
        }
    }

    private SelectGlobalActionCardRequest() {
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (obj2 instanceof SelectGlobalActionCardRequest) {
            SelectGlobalActionCardRequest selectGlobalActionCardRequest = (SelectGlobalActionCardRequest) obj2;
            if (Objects.equal(Integer.valueOf(this.f48595zza), Integer.valueOf(selectGlobalActionCardRequest.f48595zza)) && Objects.equal(this.f48596zzb, selectGlobalActionCardRequest.f48596zzb) && Objects.equal(Integer.valueOf(this.f48597zzc), Integer.valueOf(selectGlobalActionCardRequest.f48597zzc))) {
                return true;
            }
        }
        return false;
    }

    @NonNull
    public String getCardId() {
        return this.f48596zzb;
    }

    public int getCardType() {
        return this.f48595zza;
    }

    public int getSelectionTimeoutMs() {
        return this.f48597zzc;
    }

    public int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.f48595zza), this.f48596zzb, Integer.valueOf(this.f48597zzc));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 2, getCardType());
        SafeParcelWriter.writeString(parcel, 3, getCardId(), false);
        SafeParcelWriter.writeInt(parcel, 4, getSelectionTimeoutMs());
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @SafeParcelable.Constructor
    public SelectGlobalActionCardRequest(@SafeParcelable.Param(id = 2) int i, @SafeParcelable.Param(id = 3) String str, @SafeParcelable.Param(id = 4) int i2) {
        this.f48595zza = i;
        this.f48596zzb = str;
        this.f48597zzc = i2;
    }

    public /* synthetic */ SelectGlobalActionCardRequest(zzg zzgVar) {
    }
}
