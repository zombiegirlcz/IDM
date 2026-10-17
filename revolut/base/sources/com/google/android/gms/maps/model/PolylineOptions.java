package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.maps.model.StrokeStyle;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
@SafeParcelable.Class(creator = "PolylineOptionsCreator")
@SafeParcelable.Reserved({1})
public final class PolylineOptions extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<PolylineOptions> CREATOR = new zzr();

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getPoints", id = 2)
    private final List f46705zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getWidth", id = 3)
    private float f46706zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getColor", id = 4)
    private int f46707zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getZIndex", id = 5)
    private float f46708zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    @SafeParcelable.Field(getter = "isVisible", id = 6)
    private boolean f46709zze;

    /* JADX INFO: renamed from: zzf, reason: collision with root package name */
    @SafeParcelable.Field(getter = "isGeodesic", id = 7)
    private boolean f46710zzf;

    /* JADX INFO: renamed from: zzg, reason: collision with root package name */
    @SafeParcelable.Field(getter = "isClickable", id = 8)
    private boolean f46711zzg;

    /* JADX INFO: renamed from: zzh, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getStartCap", id = 9)
    private Cap f46712zzh;

    /* JADX INFO: renamed from: zzi, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getEndCap", id = 10)
    private Cap f46713zzi;

    /* JADX INFO: renamed from: zzj, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getJointType", id = 11)
    private int f46714zzj;

    /* JADX INFO: renamed from: zzk, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getPattern", id = 12)
    private List f46715zzk;

    /* JADX INFO: renamed from: zzl, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getSpans", id = 13)
    private List f46716zzl;

    public PolylineOptions() {
        this.f46706zzb = 10.0f;
        this.f46707zzc = -16777216;
        this.f46708zzd = BitmapDescriptorFactory.HUE_RED;
        this.f46709zze = true;
        this.f46710zzf = false;
        this.f46711zzg = false;
        this.f46712zzh = new ButtCap();
        this.f46713zzi = new ButtCap();
        this.f46714zzj = 0;
        this.f46715zzk = null;
        this.f46716zzl = new ArrayList();
        this.f46705zza = new ArrayList();
    }

    @NonNull
    public PolylineOptions add(@NonNull LatLng latLng) {
        Preconditions.checkNotNull(this.f46705zza, "point must not be null.");
        this.f46705zza.add(latLng);
        return this;
    }

    @NonNull
    public PolylineOptions addAll(@NonNull Iterable<LatLng> iterable) {
        Preconditions.checkNotNull(iterable, "points must not be null.");
        Iterator<LatLng> it8 = iterable.iterator();
        while (it8.hasNext()) {
            this.f46705zza.add(it8.next());
        }
        return this;
    }

    @NonNull
    public PolylineOptions addAllSpans(@NonNull Iterable<StyleSpan> iterable) {
        Iterator<StyleSpan> it8 = iterable.iterator();
        while (it8.hasNext()) {
            addSpan(it8.next());
        }
        return this;
    }

    @NonNull
    public PolylineOptions addSpan(@NonNull StyleSpan styleSpan) {
        this.f46716zzl.add(styleSpan);
        return this;
    }

    @NonNull
    public PolylineOptions clickable(boolean z) {
        this.f46711zzg = z;
        return this;
    }

    @NonNull
    public PolylineOptions color(int i) {
        this.f46707zzc = i;
        return this;
    }

    @NonNull
    public PolylineOptions endCap(@NonNull Cap cap) {
        this.f46713zzi = (Cap) Preconditions.checkNotNull(cap, "endCap must not be null");
        return this;
    }

    @NonNull
    public PolylineOptions geodesic(boolean z) {
        this.f46710zzf = z;
        return this;
    }

    public int getColor() {
        return this.f46707zzc;
    }

    @NonNull
    public Cap getEndCap() {
        return this.f46713zzi.zza();
    }

    public int getJointType() {
        return this.f46714zzj;
    }

    public List<PatternItem> getPattern() {
        return this.f46715zzk;
    }

    @NonNull
    public List<LatLng> getPoints() {
        return this.f46705zza;
    }

    @NonNull
    public Cap getStartCap() {
        return this.f46712zzh.zza();
    }

    public float getWidth() {
        return this.f46706zzb;
    }

    public float getZIndex() {
        return this.f46708zzd;
    }

    public boolean isClickable() {
        return this.f46711zzg;
    }

    public boolean isGeodesic() {
        return this.f46710zzf;
    }

    public boolean isVisible() {
        return this.f46709zze;
    }

    @NonNull
    public PolylineOptions jointType(int i) {
        this.f46714zzj = i;
        return this;
    }

    @NonNull
    public PolylineOptions pattern(List<PatternItem> list) {
        this.f46715zzk = list;
        return this;
    }

    @NonNull
    public PolylineOptions startCap(@NonNull Cap cap) {
        this.f46712zzh = (Cap) Preconditions.checkNotNull(cap, "startCap must not be null");
        return this;
    }

    @NonNull
    public PolylineOptions visible(boolean z) {
        this.f46709zze = z;
        return this;
    }

    @NonNull
    public PolylineOptions width(float f) {
        this.f46706zzb = f;
        return this;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeTypedList(parcel, 2, getPoints(), false);
        SafeParcelWriter.writeFloat(parcel, 3, getWidth());
        SafeParcelWriter.writeInt(parcel, 4, getColor());
        SafeParcelWriter.writeFloat(parcel, 5, getZIndex());
        SafeParcelWriter.writeBoolean(parcel, 6, isVisible());
        SafeParcelWriter.writeBoolean(parcel, 7, isGeodesic());
        SafeParcelWriter.writeBoolean(parcel, 8, isClickable());
        SafeParcelWriter.writeParcelable(parcel, 9, getStartCap(), i, false);
        SafeParcelWriter.writeParcelable(parcel, 10, getEndCap(), i, false);
        SafeParcelWriter.writeInt(parcel, 11, getJointType());
        SafeParcelWriter.writeTypedList(parcel, 12, getPattern(), false);
        ArrayList arrayList = new ArrayList(this.f46716zzl.size());
        for (StyleSpan styleSpan : this.f46716zzl) {
            StrokeStyle.Builder builder = new StrokeStyle.Builder(styleSpan.getStyle());
            builder.zzd(this.f46706zzb);
            builder.zzc(this.f46709zze);
            arrayList.add(new StyleSpan(builder.build(), styleSpan.getSegments()));
        }
        SafeParcelWriter.writeTypedList(parcel, 13, arrayList, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @NonNull
    public PolylineOptions zIndex(float f) {
        this.f46708zzd = f;
        return this;
    }

    @NonNull
    public PolylineOptions addSpan(@NonNull StyleSpan... styleSpanArr) {
        for (StyleSpan styleSpan : styleSpanArr) {
            addSpan(styleSpan);
        }
        return this;
    }

    @NonNull
    public PolylineOptions add(@NonNull LatLng... latLngArr) {
        Preconditions.checkNotNull(latLngArr, "points must not be null.");
        Collections.addAll(this.f46705zza, latLngArr);
        return this;
    }

    @SafeParcelable.Constructor
    public PolylineOptions(@SafeParcelable.Param(id = 2) List list, @SafeParcelable.Param(id = 3) float f, @SafeParcelable.Param(id = 4) int i, @SafeParcelable.Param(id = 5) float f4, @SafeParcelable.Param(id = 6) boolean z, @SafeParcelable.Param(id = 7) boolean z3, @SafeParcelable.Param(id = 8) boolean z4, @SafeParcelable.Param(id = 9) Cap cap, @SafeParcelable.Param(id = 10) Cap cap2, @SafeParcelable.Param(id = 11) int i2, @SafeParcelable.Param(id = 12) List list2, @SafeParcelable.Param(id = 13) List list3) {
        this.f46706zzb = 10.0f;
        this.f46707zzc = -16777216;
        this.f46708zzd = BitmapDescriptorFactory.HUE_RED;
        this.f46709zze = true;
        this.f46710zzf = false;
        this.f46711zzg = false;
        this.f46712zzh = new ButtCap();
        this.f46713zzi = new ButtCap();
        this.f46714zzj = 0;
        this.f46715zzk = null;
        this.f46716zzl = new ArrayList();
        this.f46705zza = list;
        this.f46706zzb = f;
        this.f46707zzc = i;
        this.f46708zzd = f4;
        this.f46709zze = z;
        this.f46710zzf = z3;
        this.f46711zzg = z4;
        if (cap != null) {
            this.f46712zzh = cap;
        }
        if (cap2 != null) {
            this.f46713zzi = cap2;
        }
        this.f46714zzj = i2;
        this.f46715zzk = list2;
        if (list3 != null) {
            this.f46716zzl = list3;
        }
    }
}
