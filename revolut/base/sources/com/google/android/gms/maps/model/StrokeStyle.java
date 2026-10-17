package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Pair;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes16.dex */
@SafeParcelable.Class(creator = "StrokeStyleCreator")
@SafeParcelable.Reserved({1})
public final class StrokeStyle extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<StrokeStyle> CREATOR = new zzaa();

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getWidth", id = 2)
    private final float f46722zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getColor", id = 3)
    private final int f46723zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getToColor", id = 4)
    private final int f46724zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    @SafeParcelable.Field(getter = "isVisible", id = 5)
    private final boolean f46725zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getStamp", id = 6)
    private final StampStyle f46726zze;

    public static final class Builder {

        /* JADX INFO: renamed from: zza, reason: collision with root package name */
        private float f46727zza;

        /* JADX INFO: renamed from: zzb, reason: collision with root package name */
        private int f46728zzb;

        /* JADX INFO: renamed from: zzc, reason: collision with root package name */
        private int f46729zzc;

        /* JADX INFO: renamed from: zzd, reason: collision with root package name */
        private boolean f46730zzd;

        /* JADX INFO: renamed from: zze, reason: collision with root package name */
        private StampStyle f46731zze;

        private Builder() {
        }

        @NonNull
        public StrokeStyle build() {
            return new StrokeStyle(this.f46727zza, this.f46728zzb, this.f46729zzc, this.f46730zzd, this.f46731zze);
        }

        @NonNull
        public Builder stamp(@NonNull StampStyle stampStyle) {
            this.f46731zze = stampStyle;
            return this;
        }

        @NonNull
        public final Builder zza(int i) {
            this.f46728zzb = i;
            this.f46729zzc = i;
            return this;
        }

        @NonNull
        public final Builder zzb(int i, int i2) {
            this.f46728zzb = i;
            this.f46729zzc = i2;
            return this;
        }

        @NonNull
        public final Builder zzc(boolean z) {
            this.f46730zzd = z;
            return this;
        }

        @NonNull
        public final Builder zzd(float f) {
            this.f46727zza = f;
            return this;
        }

        public /* synthetic */ Builder(zzz zzzVar) {
        }

        public Builder(@NonNull StrokeStyle strokeStyle) {
            this.f46727zza = strokeStyle.zza();
            Pair pairZzb = strokeStyle.zzb();
            this.f46728zzb = ((Integer) pairZzb.first).intValue();
            this.f46729zzc = ((Integer) pairZzb.second).intValue();
            this.f46730zzd = strokeStyle.isVisible();
            this.f46731zze = strokeStyle.getStamp();
        }
    }

    @SafeParcelable.Constructor
    public StrokeStyle(@SafeParcelable.Param(id = 2) float f, @SafeParcelable.Param(id = 3) int i, @SafeParcelable.Param(id = 4) int i2, @SafeParcelable.Param(id = 5) boolean z, @SafeParcelable.Param(id = 6) StampStyle stampStyle) {
        this.f46722zza = f;
        this.f46723zzb = i;
        this.f46724zzc = i2;
        this.f46725zzd = z;
        this.f46726zze = stampStyle;
    }

    @NonNull
    public static Builder colorBuilder(int i) {
        Builder builder = new Builder((zzz) null);
        builder.zza(i);
        return builder;
    }

    @NonNull
    public static Builder gradientBuilder(int i, int i2) {
        Builder builder = new Builder((zzz) null);
        builder.zzb(i, i2);
        return builder;
    }

    @NonNull
    public static Builder transparentColorBuilder() {
        Builder builder = new Builder((zzz) null);
        builder.zza(0);
        return builder;
    }

    public StampStyle getStamp() {
        return this.f46726zze;
    }

    public boolean isVisible() {
        return this.f46725zzd;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeFloat(parcel, 2, this.f46722zza);
        SafeParcelWriter.writeInt(parcel, 3, this.f46723zzb);
        SafeParcelWriter.writeInt(parcel, 4, this.f46724zzc);
        SafeParcelWriter.writeBoolean(parcel, 5, isVisible());
        SafeParcelWriter.writeParcelable(parcel, 6, getStamp(), i, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public final float zza() {
        return this.f46722zza;
    }

    @NonNull
    public final Pair zzb() {
        return new Pair(Integer.valueOf(this.f46723zzb), Integer.valueOf(this.f46724zzc));
    }
}
