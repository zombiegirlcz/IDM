package com.google.android.gms.maps;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.StreetViewPanoramaCamera;
import com.google.android.gms.maps.model.StreetViewSource;

/* JADX INFO: loaded from: classes16.dex */
@SafeParcelable.Class(creator = "StreetViewPanoramaOptionsCreator")
@SafeParcelable.Reserved({1})
public final class StreetViewPanoramaOptions extends AbstractSafeParcelable implements ReflectedParcelable {

    @NonNull
    public static final Parcelable.Creator<StreetViewPanoramaOptions> CREATOR = new zzaq();

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getStreetViewPanoramaCamera", id = 2)
    private StreetViewPanoramaCamera f46606zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getPanoramaId", id = 3)
    private String f46607zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getPosition", id = 4)
    private LatLng f46608zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getRadius", id = 5)
    private Integer f46609zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getUserNavigationEnabledForParcel", id = 6, type = "byte")
    private Boolean f46610zze;

    /* JADX INFO: renamed from: zzf, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getZoomGesturesEnabledForParcel", id = 7, type = "byte")
    private Boolean f46611zzf;

    /* JADX INFO: renamed from: zzg, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getPanningGesturesEnabledForParcel", id = 8, type = "byte")
    private Boolean f46612zzg;

    /* JADX INFO: renamed from: zzh, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getStreetNamesEnabledForParcel", id = 9, type = "byte")
    private Boolean f46613zzh;

    /* JADX INFO: renamed from: zzi, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getUseViewLifecycleInFragmentForParcel", id = 10, type = "byte")
    private Boolean f46614zzi;

    /* JADX INFO: renamed from: zzj, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getSource", id = 11)
    private StreetViewSource f46615zzj;

    public StreetViewPanoramaOptions() {
        Boolean bool = Boolean.TRUE;
        this.f46610zze = bool;
        this.f46611zzf = bool;
        this.f46612zzg = bool;
        this.f46613zzh = bool;
        this.f46615zzj = StreetViewSource.DEFAULT;
    }

    public Boolean getPanningGesturesEnabled() {
        return this.f46612zzg;
    }

    public String getPanoramaId() {
        return this.f46607zzb;
    }

    public LatLng getPosition() {
        return this.f46608zzc;
    }

    public Integer getRadius() {
        return this.f46609zzd;
    }

    @NonNull
    public StreetViewSource getSource() {
        return this.f46615zzj;
    }

    public Boolean getStreetNamesEnabled() {
        return this.f46613zzh;
    }

    public StreetViewPanoramaCamera getStreetViewPanoramaCamera() {
        return this.f46606zza;
    }

    public Boolean getUseViewLifecycleInFragment() {
        return this.f46614zzi;
    }

    public Boolean getUserNavigationEnabled() {
        return this.f46610zze;
    }

    public Boolean getZoomGesturesEnabled() {
        return this.f46611zzf;
    }

    @NonNull
    public StreetViewPanoramaOptions panningGesturesEnabled(boolean z) {
        this.f46612zzg = Boolean.valueOf(z);
        return this;
    }

    @NonNull
    public StreetViewPanoramaOptions panoramaCamera(StreetViewPanoramaCamera streetViewPanoramaCamera) {
        this.f46606zza = streetViewPanoramaCamera;
        return this;
    }

    @NonNull
    public StreetViewPanoramaOptions panoramaId(String str) {
        this.f46607zzb = str;
        return this;
    }

    @NonNull
    public StreetViewPanoramaOptions position(LatLng latLng) {
        this.f46608zzc = latLng;
        return this;
    }

    @NonNull
    public StreetViewPanoramaOptions streetNamesEnabled(boolean z) {
        this.f46613zzh = Boolean.valueOf(z);
        return this;
    }

    @NonNull
    public String toString() {
        return Objects.toStringHelper(this).add("PanoramaId", this.f46607zzb).add("Position", this.f46608zzc).add("Radius", this.f46609zzd).add("Source", this.f46615zzj).add("StreetViewPanoramaCamera", this.f46606zza).add("UserNavigationEnabled", this.f46610zze).add("ZoomGesturesEnabled", this.f46611zzf).add("PanningGesturesEnabled", this.f46612zzg).add("StreetNamesEnabled", this.f46613zzh).add("UseViewLifecycleInFragment", this.f46614zzi).toString();
    }

    @NonNull
    public StreetViewPanoramaOptions useViewLifecycleInFragment(boolean z) {
        this.f46614zzi = Boolean.valueOf(z);
        return this;
    }

    @NonNull
    public StreetViewPanoramaOptions userNavigationEnabled(boolean z) {
        this.f46610zze = Boolean.valueOf(z);
        return this;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 2, getStreetViewPanoramaCamera(), i, false);
        SafeParcelWriter.writeString(parcel, 3, getPanoramaId(), false);
        SafeParcelWriter.writeParcelable(parcel, 4, getPosition(), i, false);
        SafeParcelWriter.writeIntegerObject(parcel, 5, getRadius(), false);
        SafeParcelWriter.writeByte(parcel, 6, com.google.android.gms.maps.internal.zza.zza(this.f46610zze));
        SafeParcelWriter.writeByte(parcel, 7, com.google.android.gms.maps.internal.zza.zza(this.f46611zzf));
        SafeParcelWriter.writeByte(parcel, 8, com.google.android.gms.maps.internal.zza.zza(this.f46612zzg));
        SafeParcelWriter.writeByte(parcel, 9, com.google.android.gms.maps.internal.zza.zza(this.f46613zzh));
        SafeParcelWriter.writeByte(parcel, 10, com.google.android.gms.maps.internal.zza.zza(this.f46614zzi));
        SafeParcelWriter.writeParcelable(parcel, 11, getSource(), i, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @NonNull
    public StreetViewPanoramaOptions zoomGesturesEnabled(boolean z) {
        this.f46611zzf = Boolean.valueOf(z);
        return this;
    }

    @NonNull
    public StreetViewPanoramaOptions position(LatLng latLng, @NonNull StreetViewSource streetViewSource) {
        this.f46608zzc = latLng;
        this.f46615zzj = streetViewSource;
        return this;
    }

    @NonNull
    public StreetViewPanoramaOptions position(LatLng latLng, Integer num) {
        this.f46608zzc = latLng;
        this.f46609zzd = num;
        return this;
    }

    @SafeParcelable.Constructor
    public StreetViewPanoramaOptions(@SafeParcelable.Param(id = 2) StreetViewPanoramaCamera streetViewPanoramaCamera, @SafeParcelable.Param(id = 3) String str, @SafeParcelable.Param(id = 4) LatLng latLng, @SafeParcelable.Param(id = 5) Integer num, @SafeParcelable.Param(id = 6) byte b4, @SafeParcelable.Param(id = 7) byte b5, @SafeParcelable.Param(id = 8) byte b7, @SafeParcelable.Param(id = 9) byte b13, @SafeParcelable.Param(id = 10) byte b15, @SafeParcelable.Param(id = 11) StreetViewSource streetViewSource) {
        Boolean bool = Boolean.TRUE;
        this.f46610zze = bool;
        this.f46611zzf = bool;
        this.f46612zzg = bool;
        this.f46613zzh = bool;
        this.f46615zzj = StreetViewSource.DEFAULT;
        this.f46606zza = streetViewPanoramaCamera;
        this.f46608zzc = latLng;
        this.f46609zzd = num;
        this.f46607zzb = str;
        this.f46610zze = com.google.android.gms.maps.internal.zza.zzb(b4);
        this.f46611zzf = com.google.android.gms.maps.internal.zza.zzb(b5);
        this.f46612zzg = com.google.android.gms.maps.internal.zza.zzb(b7);
        this.f46613zzh = com.google.android.gms.maps.internal.zza.zzb(b13);
        this.f46614zzi = com.google.android.gms.maps.internal.zza.zzb(b15);
        this.f46615zzj = streetViewSource;
    }

    @NonNull
    public StreetViewPanoramaOptions position(LatLng latLng, Integer num, @NonNull StreetViewSource streetViewSource) {
        this.f46608zzc = latLng;
        this.f46609zzd = num;
        this.f46615zzj = streetViewSource;
        return this;
    }
}
