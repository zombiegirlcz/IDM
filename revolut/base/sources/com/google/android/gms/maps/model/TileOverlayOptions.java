package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.maps.zzao;
import com.google.android.gms.internal.maps.zzap;

/* JADX INFO: loaded from: classes16.dex */
@SafeParcelable.Class(creator = "TileOverlayOptionsCreator")
@SafeParcelable.Reserved({1})
public final class TileOverlayOptions extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<TileOverlayOptions> CREATOR = new zzah();

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getTileProviderDelegate", id = 2, type = "android.os.IBinder")
    private zzap f46735zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private TileProvider f46736zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    @SafeParcelable.Field(getter = "isVisible", id = 3)
    private boolean f46737zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getZIndex", id = 4)
    private float f46738zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    @SafeParcelable.Field(defaultValue = "true", getter = "getFadeIn", id = 5)
    private boolean f46739zze;

    /* JADX INFO: renamed from: zzf, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getTransparency", id = 6)
    private float f46740zzf;

    public TileOverlayOptions() {
        this.f46737zzc = true;
        this.f46739zze = true;
        this.f46740zzf = BitmapDescriptorFactory.HUE_RED;
    }

    @NonNull
    public TileOverlayOptions fadeIn(boolean z) {
        this.f46739zze = z;
        return this;
    }

    public boolean getFadeIn() {
        return this.f46739zze;
    }

    public TileProvider getTileProvider() {
        return this.f46736zzb;
    }

    public float getTransparency() {
        return this.f46740zzf;
    }

    public float getZIndex() {
        return this.f46738zzd;
    }

    public boolean isVisible() {
        return this.f46737zzc;
    }

    @NonNull
    public TileOverlayOptions tileProvider(@NonNull TileProvider tileProvider) {
        this.f46736zzb = (TileProvider) Preconditions.checkNotNull(tileProvider, "tileProvider must not be null.");
        this.f46735zza = new zzag(this, tileProvider);
        return this;
    }

    @NonNull
    public TileOverlayOptions transparency(float f) {
        boolean z = false;
        if (f >= BitmapDescriptorFactory.HUE_RED && f <= 1.0f) {
            z = true;
        }
        Preconditions.checkArgument(z, "Transparency must be in the range [0..1]");
        this.f46740zzf = f;
        return this;
    }

    @NonNull
    public TileOverlayOptions visible(boolean z) {
        this.f46737zzc = z;
        return this;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        zzap zzapVar = this.f46735zza;
        SafeParcelWriter.writeIBinder(parcel, 2, zzapVar == null ? null : zzapVar.asBinder(), false);
        SafeParcelWriter.writeBoolean(parcel, 3, isVisible());
        SafeParcelWriter.writeFloat(parcel, 4, getZIndex());
        SafeParcelWriter.writeBoolean(parcel, 5, getFadeIn());
        SafeParcelWriter.writeFloat(parcel, 6, getTransparency());
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @NonNull
    public TileOverlayOptions zIndex(float f) {
        this.f46738zzd = f;
        return this;
    }

    @SafeParcelable.Constructor
    public TileOverlayOptions(@SafeParcelable.Param(id = 2) IBinder iBinder, @SafeParcelable.Param(id = 3) boolean z, @SafeParcelable.Param(id = 4) float f, @SafeParcelable.Param(id = 5) boolean z3, @SafeParcelable.Param(id = 6) float f4) {
        this.f46737zzc = true;
        this.f46739zze = true;
        this.f46740zzf = BitmapDescriptorFactory.HUE_RED;
        zzap zzapVarZzc = zzao.zzc(iBinder);
        this.f46735zza = zzapVarZzc;
        this.f46736zzb = zzapVarZzc == null ? null : new zzaf(this);
        this.f46737zzc = z;
        this.f46738zzd = f;
        this.f46739zze = z3;
        this.f46740zzf = f4;
    }
}
