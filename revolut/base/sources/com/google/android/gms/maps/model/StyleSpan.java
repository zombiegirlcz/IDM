package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes16.dex */
@SafeParcelable.Class(creator = "StyleSpanCreator")
@SafeParcelable.Reserved({1})
public final class StyleSpan extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<StyleSpan> CREATOR = new zzab();

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getStyle", id = 2)
    private final StrokeStyle f46732zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getSegments", id = 3)
    private final double f46733zzb;

    public StyleSpan(int i) {
        this.f46732zza = StrokeStyle.colorBuilder(i).build();
        this.f46733zzb = 1.0d;
    }

    public double getSegments() {
        return this.f46733zzb;
    }

    @NonNull
    public StrokeStyle getStyle() {
        return this.f46732zza;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 2, getStyle(), i, false);
        SafeParcelWriter.writeDouble(parcel, 3, getSegments());
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public StyleSpan(int i, double d) {
        if (d > 0.0d) {
            this.f46732zza = StrokeStyle.colorBuilder(i).build();
            this.f46733zzb = d;
            return;
        }
        throw new IllegalArgumentException("A style must be applied to some segments on a polyline.");
    }

    public StyleSpan(@NonNull StrokeStyle strokeStyle) {
        this.f46732zza = strokeStyle;
        this.f46733zzb = 1.0d;
    }

    @SafeParcelable.Constructor
    public StyleSpan(@NonNull @SafeParcelable.Param(id = 2) StrokeStyle strokeStyle, @SafeParcelable.Param(id = 3) double d) {
        if (d > 0.0d) {
            this.f46732zza = strokeStyle;
            this.f46733zzb = d;
            return;
        }
        throw new IllegalArgumentException("A style must be applied to some segments on a polyline.");
    }
}
