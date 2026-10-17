package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
@SafeParcelable.Class(creator = "PolygonOptionsCreator")
@SafeParcelable.Reserved({1})
public final class PolygonOptions extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<PolygonOptions> CREATOR = new zzq();

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getPoints", id = 2)
    private final List f46693zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getHolesForParcel", id = 3, type = "java.util.List")
    private final List f46694zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getStrokeWidth", id = 4)
    private float f46695zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getStrokeColor", id = 5)
    private int f46696zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getFillColor", id = 6)
    private int f46697zze;

    /* JADX INFO: renamed from: zzf, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getZIndex", id = 7)
    private float f46698zzf;

    /* JADX INFO: renamed from: zzg, reason: collision with root package name */
    @SafeParcelable.Field(getter = "isVisible", id = 8)
    private boolean f46699zzg;

    /* JADX INFO: renamed from: zzh, reason: collision with root package name */
    @SafeParcelable.Field(getter = "isGeodesic", id = 9)
    private boolean f46700zzh;

    /* JADX INFO: renamed from: zzi, reason: collision with root package name */
    @SafeParcelable.Field(getter = "isClickable", id = 10)
    private boolean f46701zzi;

    /* JADX INFO: renamed from: zzj, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getStrokeJointType", id = 11)
    private int f46702zzj;

    /* JADX INFO: renamed from: zzk, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getStrokePattern", id = 12)
    private List f46703zzk;

    public PolygonOptions() {
        this.f46695zzc = 10.0f;
        this.f46696zzd = -16777216;
        this.f46697zze = 0;
        this.f46698zzf = BitmapDescriptorFactory.HUE_RED;
        this.f46699zzg = true;
        this.f46700zzh = false;
        this.f46701zzi = false;
        this.f46702zzj = 0;
        this.f46703zzk = null;
        this.f46693zza = new ArrayList();
        this.f46694zzb = new ArrayList();
    }

    @NonNull
    public PolygonOptions add(@NonNull LatLng latLng) {
        Preconditions.checkNotNull(latLng, "point must not be null.");
        this.f46693zza.add(latLng);
        return this;
    }

    @NonNull
    public PolygonOptions addAll(@NonNull Iterable<LatLng> iterable) {
        Preconditions.checkNotNull(iterable, "points must not be null.");
        Iterator<LatLng> it8 = iterable.iterator();
        while (it8.hasNext()) {
            this.f46693zza.add(it8.next());
        }
        return this;
    }

    @NonNull
    public PolygonOptions addHole(@NonNull Iterable<LatLng> iterable) {
        Preconditions.checkNotNull(iterable, "points must not be null.");
        ArrayList arrayList = new ArrayList();
        Iterator<LatLng> it8 = iterable.iterator();
        while (it8.hasNext()) {
            arrayList.add(it8.next());
        }
        this.f46694zzb.add(arrayList);
        return this;
    }

    @NonNull
    public PolygonOptions clickable(boolean z) {
        this.f46701zzi = z;
        return this;
    }

    @NonNull
    public PolygonOptions fillColor(int i) {
        this.f46697zze = i;
        return this;
    }

    @NonNull
    public PolygonOptions geodesic(boolean z) {
        this.f46700zzh = z;
        return this;
    }

    public int getFillColor() {
        return this.f46697zze;
    }

    @NonNull
    public List<List<LatLng>> getHoles() {
        return this.f46694zzb;
    }

    @NonNull
    public List<LatLng> getPoints() {
        return this.f46693zza;
    }

    public int getStrokeColor() {
        return this.f46696zzd;
    }

    public int getStrokeJointType() {
        return this.f46702zzj;
    }

    public List<PatternItem> getStrokePattern() {
        return this.f46703zzk;
    }

    public float getStrokeWidth() {
        return this.f46695zzc;
    }

    public float getZIndex() {
        return this.f46698zzf;
    }

    public boolean isClickable() {
        return this.f46701zzi;
    }

    public boolean isGeodesic() {
        return this.f46700zzh;
    }

    public boolean isVisible() {
        return this.f46699zzg;
    }

    @NonNull
    public PolygonOptions strokeColor(int i) {
        this.f46696zzd = i;
        return this;
    }

    @NonNull
    public PolygonOptions strokeJointType(int i) {
        this.f46702zzj = i;
        return this;
    }

    @NonNull
    public PolygonOptions strokePattern(List<PatternItem> list) {
        this.f46703zzk = list;
        return this;
    }

    @NonNull
    public PolygonOptions strokeWidth(float f) {
        this.f46695zzc = f;
        return this;
    }

    @NonNull
    public PolygonOptions visible(boolean z) {
        this.f46699zzg = z;
        return this;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeTypedList(parcel, 2, getPoints(), false);
        SafeParcelWriter.writeList(parcel, 3, this.f46694zzb, false);
        SafeParcelWriter.writeFloat(parcel, 4, getStrokeWidth());
        SafeParcelWriter.writeInt(parcel, 5, getStrokeColor());
        SafeParcelWriter.writeInt(parcel, 6, getFillColor());
        SafeParcelWriter.writeFloat(parcel, 7, getZIndex());
        SafeParcelWriter.writeBoolean(parcel, 8, isVisible());
        SafeParcelWriter.writeBoolean(parcel, 9, isGeodesic());
        SafeParcelWriter.writeBoolean(parcel, 10, isClickable());
        SafeParcelWriter.writeInt(parcel, 11, getStrokeJointType());
        SafeParcelWriter.writeTypedList(parcel, 12, getStrokePattern(), false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @NonNull
    public PolygonOptions zIndex(float f) {
        this.f46698zzf = f;
        return this;
    }

    @NonNull
    public PolygonOptions add(@NonNull LatLng... latLngArr) {
        Preconditions.checkNotNull(latLngArr, "points must not be null.");
        this.f46693zza.addAll(Arrays.asList(latLngArr));
        return this;
    }

    @SafeParcelable.Constructor
    public PolygonOptions(@SafeParcelable.Param(id = 2) List list, @SafeParcelable.Param(id = 3) List list2, @SafeParcelable.Param(id = 4) float f, @SafeParcelable.Param(id = 5) int i, @SafeParcelable.Param(id = 6) int i2, @SafeParcelable.Param(id = 7) float f4, @SafeParcelable.Param(id = 8) boolean z, @SafeParcelable.Param(id = 9) boolean z3, @SafeParcelable.Param(id = 10) boolean z4, @SafeParcelable.Param(id = 11) int i3, @SafeParcelable.Param(id = 12) List list3) {
        this.f46693zza = list;
        this.f46694zzb = list2;
        this.f46695zzc = f;
        this.f46696zzd = i;
        this.f46697zze = i2;
        this.f46698zzf = f4;
        this.f46699zzg = z;
        this.f46700zzh = z3;
        this.f46701zzi = z4;
        this.f46702zzj = i3;
        this.f46703zzk = list3;
    }
}
