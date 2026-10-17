package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.dynamic.IObjectWrapper;

/* JADX INFO: loaded from: classes16.dex */
@SafeParcelable.Class(creator = "GroundOverlayOptionsCreator")
@SafeParcelable.Reserved({1})
public final class GroundOverlayOptions extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<GroundOverlayOptions> CREATOR = new zzg();
    public static final float NO_DIMENSION = -1.0f;

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getWrappedImageDescriptorImplBinder", id = 2, type = "android.os.IBinder")
    private BitmapDescriptor f46644zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getLocation", id = 3)
    private LatLng f46645zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getWidth", id = 4)
    private float f46646zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getHeight", id = 5)
    private float f46647zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getBounds", id = 6)
    private LatLngBounds f46648zze;

    /* JADX INFO: renamed from: zzf, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getBearing", id = 7)
    private float f46649zzf;

    /* JADX INFO: renamed from: zzg, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getZIndex", id = 8)
    private float f46650zzg;

    /* JADX INFO: renamed from: zzh, reason: collision with root package name */
    @SafeParcelable.Field(getter = "isVisible", id = 9)
    private boolean f46651zzh;

    /* JADX INFO: renamed from: zzi, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getTransparency", id = 10)
    private float f46652zzi;

    /* JADX INFO: renamed from: zzj, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getAnchorU", id = 11)
    private float f46653zzj;

    /* JADX INFO: renamed from: zzk, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getAnchorV", id = 12)
    private float f46654zzk;

    /* JADX INFO: renamed from: zzl, reason: collision with root package name */
    @SafeParcelable.Field(getter = "isClickable", id = 13)
    private boolean f46655zzl;

    public GroundOverlayOptions() {
        this.f46651zzh = true;
        this.f46652zzi = BitmapDescriptorFactory.HUE_RED;
        this.f46653zzj = 0.5f;
        this.f46654zzk = 0.5f;
        this.f46655zzl = false;
    }

    private final GroundOverlayOptions zza(LatLng latLng, float f, float f4) {
        this.f46645zzb = latLng;
        this.f46646zzc = f;
        this.f46647zzd = f4;
        return this;
    }

    @NonNull
    public GroundOverlayOptions anchor(float f, float f4) {
        this.f46653zzj = f;
        this.f46654zzk = f4;
        return this;
    }

    @NonNull
    public GroundOverlayOptions bearing(float f) {
        this.f46649zzf = ((f % 360.0f) + 360.0f) % 360.0f;
        return this;
    }

    @NonNull
    public GroundOverlayOptions clickable(boolean z) {
        this.f46655zzl = z;
        return this;
    }

    public float getAnchorU() {
        return this.f46653zzj;
    }

    public float getAnchorV() {
        return this.f46654zzk;
    }

    public float getBearing() {
        return this.f46649zzf;
    }

    public LatLngBounds getBounds() {
        return this.f46648zze;
    }

    public float getHeight() {
        return this.f46647zzd;
    }

    @NonNull
    public BitmapDescriptor getImage() {
        return this.f46644zza;
    }

    public LatLng getLocation() {
        return this.f46645zzb;
    }

    public float getTransparency() {
        return this.f46652zzi;
    }

    public float getWidth() {
        return this.f46646zzc;
    }

    public float getZIndex() {
        return this.f46650zzg;
    }

    @NonNull
    public GroundOverlayOptions image(@NonNull BitmapDescriptor bitmapDescriptor) {
        Preconditions.checkNotNull(bitmapDescriptor, "imageDescriptor must not be null");
        this.f46644zza = bitmapDescriptor;
        return this;
    }

    public boolean isClickable() {
        return this.f46655zzl;
    }

    public boolean isVisible() {
        return this.f46651zzh;
    }

    @NonNull
    public GroundOverlayOptions position(@NonNull LatLng latLng, float f) {
        Preconditions.checkState(this.f46648zze == null, "Position has already been set using positionFromBounds");
        Preconditions.checkArgument(latLng != null, "Location must be specified");
        Preconditions.checkArgument(f >= BitmapDescriptorFactory.HUE_RED, "Width must be non-negative");
        zza(latLng, f, -1.0f);
        return this;
    }

    @NonNull
    public GroundOverlayOptions positionFromBounds(@NonNull LatLngBounds latLngBounds) {
        LatLng latLng = this.f46645zzb;
        Preconditions.checkState(latLng == null, "Position has already been set using position: ".concat(String.valueOf(latLng)));
        this.f46648zze = latLngBounds;
        return this;
    }

    @NonNull
    public GroundOverlayOptions transparency(float f) {
        boolean z = false;
        if (f >= BitmapDescriptorFactory.HUE_RED && f <= 1.0f) {
            z = true;
        }
        Preconditions.checkArgument(z, "Transparency must be in the range [0..1]");
        this.f46652zzi = f;
        return this;
    }

    @NonNull
    public GroundOverlayOptions visible(boolean z) {
        this.f46651zzh = z;
        return this;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeIBinder(parcel, 2, this.f46644zza.zza().asBinder(), false);
        SafeParcelWriter.writeParcelable(parcel, 3, getLocation(), i, false);
        SafeParcelWriter.writeFloat(parcel, 4, getWidth());
        SafeParcelWriter.writeFloat(parcel, 5, getHeight());
        SafeParcelWriter.writeParcelable(parcel, 6, getBounds(), i, false);
        SafeParcelWriter.writeFloat(parcel, 7, getBearing());
        SafeParcelWriter.writeFloat(parcel, 8, getZIndex());
        SafeParcelWriter.writeBoolean(parcel, 9, isVisible());
        SafeParcelWriter.writeFloat(parcel, 10, getTransparency());
        SafeParcelWriter.writeFloat(parcel, 11, getAnchorU());
        SafeParcelWriter.writeFloat(parcel, 12, getAnchorV());
        SafeParcelWriter.writeBoolean(parcel, 13, isClickable());
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @NonNull
    public GroundOverlayOptions zIndex(float f) {
        this.f46650zzg = f;
        return this;
    }

    @SafeParcelable.Constructor
    public GroundOverlayOptions(@SafeParcelable.Param(id = 2) IBinder iBinder, @SafeParcelable.Param(id = 3) LatLng latLng, @SafeParcelable.Param(id = 4) float f, @SafeParcelable.Param(id = 5) float f4, @SafeParcelable.Param(id = 6) LatLngBounds latLngBounds, @SafeParcelable.Param(id = 7) float f5, @SafeParcelable.Param(id = 8) float f6, @SafeParcelable.Param(id = 9) boolean z, @SafeParcelable.Param(id = 10) float f32, @SafeParcelable.Param(id = 11) float f35, @SafeParcelable.Param(id = 12) float f36, @SafeParcelable.Param(id = 13) boolean z3) {
        this.f46651zzh = true;
        this.f46652zzi = BitmapDescriptorFactory.HUE_RED;
        this.f46653zzj = 0.5f;
        this.f46654zzk = 0.5f;
        this.f46655zzl = false;
        this.f46644zza = new BitmapDescriptor(IObjectWrapper.Stub.asInterface(iBinder));
        this.f46645zzb = latLng;
        this.f46646zzc = f;
        this.f46647zzd = f4;
        this.f46648zze = latLngBounds;
        this.f46649zzf = f5;
        this.f46650zzg = f6;
        this.f46651zzh = z;
        this.f46652zzi = f32;
        this.f46653zzj = f35;
        this.f46654zzk = f36;
        this.f46655zzl = z3;
    }

    @NonNull
    public GroundOverlayOptions position(@NonNull LatLng latLng, float f, float f4) {
        Preconditions.checkState(this.f46648zze == null, "Position has already been set using positionFromBounds");
        Preconditions.checkArgument(latLng != null, "Location must be specified");
        Preconditions.checkArgument(f >= BitmapDescriptorFactory.HUE_RED, "Width must be non-negative");
        Preconditions.checkArgument(f4 >= BitmapDescriptorFactory.HUE_RED, "Height must be non-negative");
        zza(latLng, f, f4);
        return this;
    }
}
