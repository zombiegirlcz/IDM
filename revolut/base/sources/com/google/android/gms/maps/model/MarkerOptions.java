package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.maps.model.AdvancedMarkerOptions;

/* JADX INFO: loaded from: classes16.dex */
@SafeParcelable.Class(creator = "MarkerOptionsCreator")
@SafeParcelable.Reserved({1})
public class MarkerOptions extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<MarkerOptions> CREATOR = new zzl();

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getPosition", id = 2)
    private LatLng f46667zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getTitle", id = 3)
    private String f46668zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getSnippet", id = 4)
    private String f46669zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getWrappedIconDescriptorImplBinder", id = 5, type = "android.os.IBinder")
    private BitmapDescriptor f46670zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getAnchorU", id = 6)
    private float f46671zze;

    /* JADX INFO: renamed from: zzf, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getAnchorV", id = 7)
    private float f46672zzf;

    /* JADX INFO: renamed from: zzg, reason: collision with root package name */
    @SafeParcelable.Field(getter = "isDraggable", id = 8)
    private boolean f46673zzg;

    /* JADX INFO: renamed from: zzh, reason: collision with root package name */
    @SafeParcelable.Field(getter = "isVisible", id = 9)
    private boolean f46674zzh;

    /* JADX INFO: renamed from: zzi, reason: collision with root package name */
    @SafeParcelable.Field(getter = "isFlat", id = 10)
    private boolean f46675zzi;

    /* JADX INFO: renamed from: zzj, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getRotation", id = 11)
    private float f46676zzj;

    /* JADX INFO: renamed from: zzk, reason: collision with root package name */
    @SafeParcelable.Field(defaultValue = "0.5f", getter = "getInfoWindowAnchorU", id = 12)
    private float f46677zzk;

    /* JADX INFO: renamed from: zzl, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getInfoWindowAnchorV", id = 13)
    private float f46678zzl;

    @SafeParcelable.Field(defaultValue = "1.0f", getter = "getAlpha", id = 14)
    private float zzm;

    @SafeParcelable.Field(getter = "getZIndex", id = 15)
    private float zzn;

    @AdvancedMarkerOptions.CollisionBehavior
    @SafeParcelable.Field(getter = "getCollisionBehaviorInternal", id = 17)
    private int zzo;

    @SafeParcelable.Field(getter = "getIconViewBinder", id = 18, type = "android.os.IBinder")
    private View zzp;

    @SafeParcelable.Field(getter = "getMarkerType", id = 19)
    private int zzq;

    @SafeParcelable.Field(getter = "getContentDescription", id = 20)
    private String zzr;

    @SafeParcelable.Field(getter = "getAltitudeInternal", id = 21)
    private float zzs;

    public MarkerOptions() {
        this.f46671zze = 0.5f;
        this.f46672zzf = 1.0f;
        this.f46674zzh = true;
        this.f46675zzi = false;
        this.f46676zzj = BitmapDescriptorFactory.HUE_RED;
        this.f46677zzk = 0.5f;
        this.f46678zzl = BitmapDescriptorFactory.HUE_RED;
        this.zzm = 1.0f;
        this.zzo = 0;
    }

    @NonNull
    public MarkerOptions alpha(float f) {
        this.zzm = f;
        return this;
    }

    @NonNull
    public MarkerOptions anchor(float f, float f4) {
        this.f46671zze = f;
        this.f46672zzf = f4;
        return this;
    }

    @NonNull
    public MarkerOptions contentDescription(String str) {
        this.zzr = str;
        return this;
    }

    @NonNull
    public MarkerOptions draggable(boolean z) {
        this.f46673zzg = z;
        return this;
    }

    @NonNull
    public MarkerOptions flat(boolean z) {
        this.f46675zzi = z;
        return this;
    }

    public float getAlpha() {
        return this.zzm;
    }

    public float getAnchorU() {
        return this.f46671zze;
    }

    public float getAnchorV() {
        return this.f46672zzf;
    }

    public BitmapDescriptor getIcon() {
        return this.f46670zzd;
    }

    public float getInfoWindowAnchorU() {
        return this.f46677zzk;
    }

    public float getInfoWindowAnchorV() {
        return this.f46678zzl;
    }

    @NonNull
    public LatLng getPosition() {
        return this.f46667zza;
    }

    public float getRotation() {
        return this.f46676zzj;
    }

    public String getSnippet() {
        return this.f46669zzc;
    }

    public String getTitle() {
        return this.f46668zzb;
    }

    public float getZIndex() {
        return this.zzn;
    }

    @NonNull
    public MarkerOptions icon(BitmapDescriptor bitmapDescriptor) {
        this.f46670zzd = bitmapDescriptor;
        return this;
    }

    @NonNull
    public MarkerOptions infoWindowAnchor(float f, float f4) {
        this.f46677zzk = f;
        this.f46678zzl = f4;
        return this;
    }

    public boolean isDraggable() {
        return this.f46673zzg;
    }

    public boolean isFlat() {
        return this.f46675zzi;
    }

    public boolean isVisible() {
        return this.f46674zzh;
    }

    @NonNull
    public MarkerOptions position(@NonNull LatLng latLng) {
        if (latLng == null) {
            throw new IllegalArgumentException("latlng cannot be null - a position is required.");
        }
        this.f46667zza = latLng;
        return this;
    }

    @NonNull
    public MarkerOptions rotation(float f) {
        this.f46676zzj = f;
        return this;
    }

    @NonNull
    public MarkerOptions snippet(String str) {
        this.f46669zzc = str;
        return this;
    }

    @NonNull
    public MarkerOptions title(String str) {
        this.f46668zzb = str;
        return this;
    }

    @NonNull
    public MarkerOptions visible(boolean z) {
        this.f46674zzh = z;
        return this;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 2, getPosition(), i, false);
        SafeParcelWriter.writeString(parcel, 3, getTitle(), false);
        SafeParcelWriter.writeString(parcel, 4, getSnippet(), false);
        BitmapDescriptor bitmapDescriptor = this.f46670zzd;
        SafeParcelWriter.writeIBinder(parcel, 5, bitmapDescriptor == null ? null : bitmapDescriptor.zza().asBinder(), false);
        SafeParcelWriter.writeFloat(parcel, 6, getAnchorU());
        SafeParcelWriter.writeFloat(parcel, 7, getAnchorV());
        SafeParcelWriter.writeBoolean(parcel, 8, isDraggable());
        SafeParcelWriter.writeBoolean(parcel, 9, isVisible());
        SafeParcelWriter.writeBoolean(parcel, 10, isFlat());
        SafeParcelWriter.writeFloat(parcel, 11, getRotation());
        SafeParcelWriter.writeFloat(parcel, 12, getInfoWindowAnchorU());
        SafeParcelWriter.writeFloat(parcel, 13, getInfoWindowAnchorV());
        SafeParcelWriter.writeFloat(parcel, 14, getAlpha());
        SafeParcelWriter.writeFloat(parcel, 15, getZIndex());
        SafeParcelWriter.writeInt(parcel, 17, this.zzo);
        SafeParcelWriter.writeIBinder(parcel, 18, ObjectWrapper.wrap(this.zzp).asBinder(), false);
        SafeParcelWriter.writeInt(parcel, 19, this.zzq);
        SafeParcelWriter.writeString(parcel, 20, this.zzr, false);
        SafeParcelWriter.writeFloat(parcel, 21, this.zzs);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @NonNull
    public MarkerOptions zIndex(float f) {
        this.zzn = f;
        return this;
    }

    public final int zza() {
        return this.zzo;
    }

    public final int zzb() {
        return this.zzq;
    }

    public final View zzc() {
        return this.zzp;
    }

    @NonNull
    public final MarkerOptions zzd(@AdvancedMarkerOptions.CollisionBehavior int i) {
        this.zzo = i;
        return this;
    }

    @NonNull
    public final MarkerOptions zze(View view) {
        this.zzp = view;
        return this;
    }

    @NonNull
    public final MarkerOptions zzf(int i) {
        this.zzq = 1;
        return this;
    }

    @SafeParcelable.Constructor
    public MarkerOptions(@SafeParcelable.Param(id = 2) LatLng latLng, @SafeParcelable.Param(id = 3) String str, @SafeParcelable.Param(id = 4) String str2, @SafeParcelable.Param(id = 5) IBinder iBinder, @SafeParcelable.Param(id = 6) float f, @SafeParcelable.Param(id = 7) float f4, @SafeParcelable.Param(id = 8) boolean z, @SafeParcelable.Param(id = 9) boolean z3, @SafeParcelable.Param(id = 10) boolean z4, @SafeParcelable.Param(id = 11) float f5, @SafeParcelable.Param(id = 12) float f6, @SafeParcelable.Param(id = 13) float f32, @SafeParcelable.Param(id = 14) float f35, @SafeParcelable.Param(id = 15) float f36, @SafeParcelable.Param(id = 17) int i, @SafeParcelable.Param(id = 18) IBinder iBinder2, @SafeParcelable.Param(id = 19) int i2, @SafeParcelable.Param(id = 20) String str3, @SafeParcelable.Param(id = 21) float f37) {
        this.f46671zze = 0.5f;
        this.f46672zzf = 1.0f;
        this.f46674zzh = true;
        this.f46675zzi = false;
        this.f46676zzj = BitmapDescriptorFactory.HUE_RED;
        this.f46677zzk = 0.5f;
        this.f46678zzl = BitmapDescriptorFactory.HUE_RED;
        this.zzm = 1.0f;
        this.zzo = 0;
        this.f46667zza = latLng;
        this.f46668zzb = str;
        this.f46669zzc = str2;
        if (iBinder == null) {
            this.f46670zzd = null;
        } else {
            this.f46670zzd = new BitmapDescriptor(IObjectWrapper.Stub.asInterface(iBinder));
        }
        this.f46671zze = f;
        this.f46672zzf = f4;
        this.f46673zzg = z;
        this.f46674zzh = z3;
        this.f46675zzi = z4;
        this.f46676zzj = f5;
        this.f46677zzk = f6;
        this.f46678zzl = f32;
        this.zzm = f35;
        this.zzn = f36;
        this.zzq = i2;
        this.zzo = i;
        IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(iBinder2);
        this.zzp = iObjectWrapperAsInterface != null ? (View) ObjectWrapper.unwrap(iObjectWrapperAsInterface) : null;
        this.zzr = str3;
        this.zzs = f37;
    }
}
