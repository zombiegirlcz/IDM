package com.google.android.gms.tapandpay.issuer;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes16.dex */
@SafeParcelable.Class(creator = "CreatePushProvisionSessionRequestCreator")
public class CreatePushProvisionSessionRequest extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<CreatePushProvisionSessionRequest> CREATOR = new zza();

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getIntegratorId", id = 1)
    private final String f48599zza;

    public static class Builder {

        /* JADX INFO: renamed from: zza, reason: collision with root package name */
        private String f48600zza;

        @NonNull
        public CreatePushProvisionSessionRequest build() {
            return new CreatePushProvisionSessionRequest(this.f48600zza);
        }

        @NonNull
        public Builder setIntegratorId(@NonNull String str) {
            this.f48600zza = str;
            return this;
        }
    }

    @SafeParcelable.Constructor
    public CreatePushProvisionSessionRequest(@SafeParcelable.Param(id = 1) String str) {
        this.f48599zza = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.f48599zza, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
