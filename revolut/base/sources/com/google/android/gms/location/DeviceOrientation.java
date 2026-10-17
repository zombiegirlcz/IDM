package com.google.android.gms.location;

import a0.d;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.identity.zzer;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.common.primitives.SignedBytes;
import java.util.Arrays;

/* JADX INFO: loaded from: classes16.dex */
@SafeParcelable.Class(creator = "DeviceOrientationCreator")
@SafeParcelable.Reserved({2, 3})
public class DeviceOrientation extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<DeviceOrientation> CREATOR = new zzm();

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getAttitude", id = 1)
    private final float[] f46435zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getHeadingDegrees", id = 4)
    private final float f46436zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getHeadingErrorDegrees", id = 5)
    private final float f46437zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getElapsedRealtimeNs", id = 6)
    private final long f46438zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getFieldMask", id = 7)
    private final byte f46439zze;

    /* JADX INFO: renamed from: zzf, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getConservativeHeadingErrorVonMisesKappa", id = 8)
    private final float f46440zzf;

    /* JADX INFO: renamed from: zzg, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getConservativeHeadingErrorDegrees", id = 9)
    private final float f46441zzg;

    @SafeParcelable.Constructor
    public DeviceOrientation(@SafeParcelable.Param(id = 1) float[] fArr, @SafeParcelable.Param(id = 4) float f, @SafeParcelable.Param(id = 5) float f4, @SafeParcelable.Param(id = 6) long j2, @SafeParcelable.Param(id = 7) byte b4, @SafeParcelable.Param(id = 8) float f5, @SafeParcelable.Param(id = 9) float f6) {
        zzj(fArr);
        zzer.zza(f >= BitmapDescriptorFactory.HUE_RED && f < 360.0f);
        zzer.zza(f4 >= BitmapDescriptorFactory.HUE_RED && f4 <= 180.0f);
        zzer.zza(f6 >= BitmapDescriptorFactory.HUE_RED && f6 <= 180.0f);
        zzer.zza(j2 >= 0);
        this.f46435zza = fArr;
        this.f46436zzb = f;
        this.f46437zzc = f4;
        this.f46440zzf = f5;
        this.f46441zzg = f6;
        this.f46438zzd = j2;
        this.f46439zze = (byte) (((byte) (((byte) (b4 | 16)) | 4)) | 8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzj(float[] fArr) {
        zzer.zzb(fArr != null && fArr.length == 4, "Input attitude array should be of length 4.");
        zzer.zzb((Float.isNaN(fArr[0]) || Float.isNaN(fArr[1]) || Float.isNaN(fArr[2]) || Float.isNaN(fArr[3])) ? false : true, "Input attitude cannot contain NaNs.");
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof DeviceOrientation)) {
            return false;
        }
        DeviceOrientation deviceOrientation = (DeviceOrientation) obj2;
        return Float.compare(this.f46436zzb, deviceOrientation.f46436zzb) == 0 && Float.compare(this.f46437zzc, deviceOrientation.f46437zzc) == 0 && (zza() == deviceOrientation.zza() && (!zza() || Float.compare(this.f46440zzf, deviceOrientation.f46440zzf) == 0)) && (hasConservativeHeadingErrorDegrees() == deviceOrientation.hasConservativeHeadingErrorDegrees() && (!hasConservativeHeadingErrorDegrees() || Float.compare(getConservativeHeadingErrorDegrees(), deviceOrientation.getConservativeHeadingErrorDegrees()) == 0)) && this.f46438zzd == deviceOrientation.f46438zzd && Arrays.equals(this.f46435zza, deviceOrientation.f46435zza);
    }

    @NonNull
    public float[] getAttitude() {
        return (float[]) this.f46435zza.clone();
    }

    public float getConservativeHeadingErrorDegrees() {
        return this.f46441zzg;
    }

    public long getElapsedRealtimeNs() {
        return this.f46438zzd;
    }

    public float getHeadingDegrees() {
        return this.f46436zzb;
    }

    public float getHeadingErrorDegrees() {
        return this.f46437zzc;
    }

    public boolean hasConservativeHeadingErrorDegrees() {
        return (this.f46439zze & SignedBytes.MAX_POWER_OF_TWO) != 0;
    }

    public int hashCode() {
        return Objects.hashCode(Float.valueOf(this.f46436zzb), Float.valueOf(this.f46437zzc), Float.valueOf(this.f46441zzg), Long.valueOf(this.f46438zzd), this.f46435zza, Byte.valueOf(this.f46439zze));
    }

    @NonNull
    public String toString() {
        StringBuilder sb6 = new StringBuilder("DeviceOrientation[attitude=");
        sb6.append(Arrays.toString(this.f46435zza));
        sb6.append(", headingDegrees=");
        sb6.append(this.f46436zzb);
        sb6.append(", headingErrorDegrees=");
        sb6.append(this.f46437zzc);
        if (hasConservativeHeadingErrorDegrees()) {
            sb6.append(", conservativeHeadingErrorDegrees=");
            sb6.append(this.f46441zzg);
        }
        sb6.append(", elapsedRealtimeNs=");
        return d.t(sb6, this.f46438zzd, ']');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeFloatArray(parcel, 1, getAttitude(), false);
        SafeParcelWriter.writeFloat(parcel, 4, getHeadingDegrees());
        SafeParcelWriter.writeFloat(parcel, 5, getHeadingErrorDegrees());
        SafeParcelWriter.writeLong(parcel, 6, getElapsedRealtimeNs());
        SafeParcelWriter.writeByte(parcel, 7, this.f46439zze);
        SafeParcelWriter.writeFloat(parcel, 8, this.f46440zzf);
        SafeParcelWriter.writeFloat(parcel, 9, getConservativeHeadingErrorDegrees());
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public final boolean zza() {
        return (this.f46439zze & 32) != 0;
    }

    public final /* synthetic */ float[] zzc() {
        return this.f46435zza;
    }

    public final /* synthetic */ float zzd() {
        return this.f46436zzb;
    }

    public final /* synthetic */ float zze() {
        return this.f46437zzc;
    }

    public final /* synthetic */ long zzf() {
        return this.f46438zzd;
    }

    public final /* synthetic */ byte zzg() {
        return this.f46439zze;
    }

    public final /* synthetic */ float zzh() {
        return this.f46440zzf;
    }

    public final /* synthetic */ float zzi() {
        return this.f46441zzg;
    }

    public static final class Builder {

        /* JADX INFO: renamed from: zza, reason: collision with root package name */
        private final float[] f46442zza;

        /* JADX INFO: renamed from: zzb, reason: collision with root package name */
        private float f46443zzb;

        /* JADX INFO: renamed from: zzc, reason: collision with root package name */
        private float f46444zzc;

        /* JADX INFO: renamed from: zzd, reason: collision with root package name */
        private long f46445zzd;

        /* JADX INFO: renamed from: zze, reason: collision with root package name */
        private byte f46446zze;

        /* JADX INFO: renamed from: zzf, reason: collision with root package name */
        private float f46447zzf;

        /* JADX INFO: renamed from: zzg, reason: collision with root package name */
        private float f46448zzg;

        public Builder(@NonNull DeviceOrientation deviceOrientation) {
            this.f46446zze = (byte) 0;
            DeviceOrientation.zzj(deviceOrientation.zzc());
            this.f46442zza = Arrays.copyOf(deviceOrientation.zzc(), deviceOrientation.zzc().length);
            setHeadingDegrees(deviceOrientation.zzd());
            setHeadingErrorDegrees(deviceOrientation.zze());
            setConservativeHeadingErrorDegrees(deviceOrientation.zzi());
            setElapsedRealtimeNs(deviceOrientation.zzf());
            this.f46447zzf = deviceOrientation.zzh();
            this.f46446zze = deviceOrientation.zzg();
        }

        @NonNull
        public DeviceOrientation build() {
            return new DeviceOrientation(this.f46442zza, this.f46443zzb, this.f46444zzc, this.f46445zzd, this.f46446zze, this.f46447zzf, this.f46448zzg);
        }

        @NonNull
        public Builder clearConservativeHeadingErrorDegrees() {
            this.f46448zzg = 180.0f;
            int i = this.f46446zze & (-65);
            this.f46447zzf = BitmapDescriptorFactory.HUE_RED;
            this.f46446zze = (byte) (((byte) i) & (-33));
            return this;
        }

        @NonNull
        public Builder setAttitude(@NonNull float[] fArr) {
            DeviceOrientation.zzj(fArr);
            System.arraycopy(fArr, 0, this.f46442zza, 0, fArr.length);
            return this;
        }

        @NonNull
        public Builder setConservativeHeadingErrorDegrees(float f) {
            float fCos = BitmapDescriptorFactory.HUE_RED;
            boolean z = false;
            if (f >= BitmapDescriptorFactory.HUE_RED && f <= 180.0f) {
                z = true;
            }
            zzer.zzb(z, "conservativeHeadingErrorDegrees should be between 0 and 180.");
            this.f46448zzg = f;
            this.f46446zze = (byte) (this.f46446zze | SignedBytes.MAX_POWER_OF_TWO);
            Parcelable.Creator<DeviceOrientation> creator = DeviceOrientation.CREATOR;
            if (f < 180.0f) {
                fCos = (float) (2.0d / (1.0d - Math.cos(Math.toRadians(f))));
            }
            this.f46447zzf = fCos;
            this.f46446zze = (byte) (this.f46446zze | 32);
            return this;
        }

        @NonNull
        public Builder setElapsedRealtimeNs(long j2) {
            zzer.zzb(j2 >= 0, "elapsedRealtimeNs should be greater than or equal to 0.");
            this.f46445zzd = j2;
            return this;
        }

        @NonNull
        public Builder setHeadingDegrees(float f) {
            boolean z = false;
            if (f >= BitmapDescriptorFactory.HUE_RED && f < 360.0f) {
                z = true;
            }
            zzer.zzb(z, "headingDegrees should be greater than or equal to 0 and less than 360.");
            this.f46443zzb = f;
            return this;
        }

        @NonNull
        public Builder setHeadingErrorDegrees(float f) {
            boolean z = false;
            if (f >= BitmapDescriptorFactory.HUE_RED && f <= 180.0f) {
                z = true;
            }
            zzer.zzb(z, "headingErrorDegrees should be between 0 and 180.");
            this.f46444zzc = f;
            return this;
        }

        public Builder(@NonNull float[] fArr, float f, float f4, long j2) {
            this.f46446zze = (byte) 0;
            DeviceOrientation.zzj(fArr);
            this.f46442zza = Arrays.copyOf(fArr, fArr.length);
            setHeadingDegrees(f);
            setHeadingErrorDegrees(f4);
            setElapsedRealtimeNs(j2);
            this.f46447zzf = BitmapDescriptorFactory.HUE_RED;
            this.f46448zzg = 180.0f;
            this.f46446zze = (byte) 0;
        }
    }
}
