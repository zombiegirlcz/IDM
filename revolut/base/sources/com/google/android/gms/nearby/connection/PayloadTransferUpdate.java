package com.google.android.gms.nearby.connection;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes16.dex */
@SafeParcelable.Class(creator = "PayloadTransferUpdateCreator")
@SafeParcelable.Reserved({1000})
public final class PayloadTransferUpdate extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<PayloadTransferUpdate> CREATOR = new zzx();

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getPayloadId", id = 1)
    private long f47844zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getStatus", id = 2)
    private int f47845zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getTotalBytes", id = 3)
    private long f47846zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getBytesTransferred", id = 4)
    private long f47847zzd;

    @SafeParcelable.Reserved({1000})
    public static final class Builder {

        /* JADX INFO: renamed from: zza, reason: collision with root package name */
        private final PayloadTransferUpdate f47848zza;

        public Builder() {
            this.f47848zza = new PayloadTransferUpdate(null);
        }

        @NonNull
        public PayloadTransferUpdate build() {
            return this.f47848zza;
        }

        @NonNull
        public Builder setBytesTransferred(long j2) {
            this.f47848zza.f47847zzd = j2;
            return this;
        }

        @NonNull
        public Builder setPayloadId(long j2) {
            this.f47848zza.f47844zza = j2;
            return this;
        }

        @NonNull
        public Builder setStatus(int i) {
            this.f47848zza.f47845zzb = i;
            return this;
        }

        @NonNull
        public Builder setTotalBytes(long j2) {
            this.f47848zza.f47846zzc = j2;
            return this;
        }

        public Builder(@NonNull PayloadTransferUpdate payloadTransferUpdate) {
            PayloadTransferUpdate payloadTransferUpdate2 = new PayloadTransferUpdate(null);
            this.f47848zza = payloadTransferUpdate2;
            payloadTransferUpdate2.f47844zza = payloadTransferUpdate.f47844zza;
            payloadTransferUpdate2.f47845zzb = payloadTransferUpdate.f47845zzb;
            payloadTransferUpdate2.f47846zzc = payloadTransferUpdate.f47846zzc;
            payloadTransferUpdate2.f47847zzd = payloadTransferUpdate.f47847zzd;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface Status {
        public static final int CANCELED = 4;
        public static final int FAILURE = 2;
        public static final int IN_PROGRESS = 3;
        public static final int SUCCESS = 1;
    }

    private PayloadTransferUpdate() {
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (obj2 instanceof PayloadTransferUpdate) {
            PayloadTransferUpdate payloadTransferUpdate = (PayloadTransferUpdate) obj2;
            if (Objects.equal(Long.valueOf(this.f47844zza), Long.valueOf(payloadTransferUpdate.f47844zza)) && Objects.equal(Integer.valueOf(this.f47845zzb), Integer.valueOf(payloadTransferUpdate.f47845zzb)) && Objects.equal(Long.valueOf(this.f47846zzc), Long.valueOf(payloadTransferUpdate.f47846zzc)) && Objects.equal(Long.valueOf(this.f47847zzd), Long.valueOf(payloadTransferUpdate.f47847zzd))) {
                return true;
            }
        }
        return false;
    }

    public long getBytesTransferred() {
        return this.f47847zzd;
    }

    public long getPayloadId() {
        return this.f47844zza;
    }

    public int getStatus() {
        return this.f47845zzb;
    }

    public long getTotalBytes() {
        return this.f47846zzc;
    }

    public int hashCode() {
        return Objects.hashCode(Long.valueOf(this.f47844zza), Integer.valueOf(this.f47845zzb), Long.valueOf(this.f47846zzc), Long.valueOf(this.f47847zzd));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeLong(parcel, 1, getPayloadId());
        SafeParcelWriter.writeInt(parcel, 2, getStatus());
        SafeParcelWriter.writeLong(parcel, 3, getTotalBytes());
        SafeParcelWriter.writeLong(parcel, 4, getBytesTransferred());
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @SafeParcelable.Constructor
    public PayloadTransferUpdate(@SafeParcelable.Param(id = 1) long j2, @SafeParcelable.Param(id = 2) int i, @SafeParcelable.Param(id = 3) long j3, @SafeParcelable.Param(id = 4) long j5) {
        this.f47844zza = j2;
        this.f47845zzb = i;
        this.f47846zzc = j3;
        this.f47847zzd = j5;
    }

    public /* synthetic */ PayloadTransferUpdate(zzw zzwVar) {
    }
}
