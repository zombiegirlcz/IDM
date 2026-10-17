package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
@SafeParcelable.Class(creator = "CircleOptionsCreator")
@SafeParcelable.Reserved({1})
public final class CircleOptions extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<CircleOptions> CREATOR = new zzc();

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getCenter", id = 2)
    private LatLng f46634zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getRadius", id = 3)
    private double f46635zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getStrokeWidth", id = 4)
    private float f46636zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getStrokeColor", id = 5)
    private int f46637zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getFillColor", id = 6)
    private int f46638zze;

    /* JADX INFO: renamed from: zzf, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getZIndex", id = 7)
    private float f46639zzf;

    /* JADX INFO: renamed from: zzg, reason: collision with root package name */
    @SafeParcelable.Field(getter = "isVisible", id = 8)
    private boolean f46640zzg;

    /* JADX INFO: renamed from: zzh, reason: collision with root package name */
    @SafeParcelable.Field(getter = "isClickable", id = 9)
    private boolean f46641zzh;

    /* JADX INFO: renamed from: zzi, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getStrokePattern", id = 10)
    private List f46642zzi;

    public CircleOptions() {
        this.f46634zza = null;
        this.f46635zzb = 0.0d;
        this.f46636zzc = 10.0f;
        this.f46637zzd = -16777216;
        this.f46638zze = 0;
        this.f46639zzf = BitmapDescriptorFactory.HUE_RED;
        this.f46640zzg = true;
        this.f46641zzh = false;
        this.f46642zzi = null;
    }

    @NonNull
    public CircleOptions center(@NonNull LatLng latLng) {
        Preconditions.checkNotNull(latLng, "center must not be null.");
        this.f46634zza = latLng;
        return this;
    }

    @NonNull
    public CircleOptions clickable(boolean z) {
        this.f46641zzh = z;
        return this;
    }

    @NonNull
    public CircleOptions fillColor(int i) {
        this.f46638zze = i;
        return this;
    }

    public LatLng getCenter() {
        return this.f46634zza;
    }

    public int getFillColor() {
        return this.f46638zze;
    }

    public double getRadius() {
        return this.f46635zzb;
    }

    public int getStrokeColor() {
        return this.f46637zzd;
    }

    public List<PatternItem> getStrokePattern() {
        return this.f46642zzi;
    }

    public float getStrokeWidth() {
        return this.f46636zzc;
    }

    public float getZIndex() {
        return this.f46639zzf;
    }

    public boolean isClickable() {
        return this.f46641zzh;
    }

    public boolean isVisible() {
        return this.f46640zzg;
    }

    @NonNull
    public CircleOptions radius(double d) {
        this.f46635zzb = d;
        return this;
    }

    @NonNull
    public CircleOptions strokeColor(int i) {
        this.f46637zzd = i;
        return this;
    }

    @NonNull
    public CircleOptions strokePattern(List<PatternItem> list) {
        this.f46642zzi = list;
        return this;
    }

    @NonNull
    public CircleOptions strokeWidth(float f) {
        this.f46636zzc = f;
        return this;
    }

    @NonNull
    public CircleOptions visible(boolean z) {
        this.f46640zzg = z;
        return this;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 2, getCenter(), i, false);
        SafeParcelWriter.writeDouble(parcel, 3, getRadius());
        SafeParcelWriter.writeFloat(parcel, 4, getStrokeWidth());
        SafeParcelWriter.writeInt(parcel, 5, getStrokeColor());
        SafeParcelWriter.writeInt(parcel, 6, getFillColor());
        SafeParcelWriter.writeFloat(parcel, 7, getZIndex());
        SafeParcelWriter.writeBoolean(parcel, 8, isVisible());
        SafeParcelWriter.writeBoolean(parcel, 9, isClickable());
        SafeParcelWriter.writeTypedList(parcel, 10, getStrokePattern(), false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @NonNull
    public CircleOptions zIndex(float f) {
        this.f46639zzf = f;
        return this;
    }

    @SafeParcelable.Constructor
    public CircleOptions(@SafeParcelable.Param(id = 2) LatLng latLng, @SafeParcelable.Param(id = 3) double d, @SafeParcelable.Param(id = 4) float f, @SafeParcelable.Param(id = 5) int i, @SafeParcelable.Param(id = 6) int i2, @SafeParcelable.Param(id = 7) float f4, @SafeParcelable.Param(id = 8) boolean z, @SafeParcelable.Param(id = 9) boolean z3, @SafeParcelable.Param(id = 10) List list) {
        this.f46634zza = latLng;
        this.f46635zzb = d;
        this.f46636zzc = f;
        this.f46637zzd = i;
        this.f46638zze = i2;
        this.f46639zzf = f4;
        this.f46640zzg = z;
        this.f46641zzh = z3;
        this.f46642zzi = list;
    }
}
