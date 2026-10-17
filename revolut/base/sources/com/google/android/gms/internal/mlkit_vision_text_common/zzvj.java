package com.google.android.gms.internal.mlkit_vision_text_common;

import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
@SafeParcelable.Class(creator = "TextSymbolParcelCreator")
public final class zzvj extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzvj> CREATOR = new zzvk();

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getText", id = 1)
    private final String f45056zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getBoundingBox", id = 2)
    private final Rect f45057zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getCornerPointList", id = 3)
    private final List f45058zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getConfidence", id = 4)
    private final float f45059zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getAngle", id = 5)
    private final float f45060zze;

    @SafeParcelable.Constructor
    public zzvj(@SafeParcelable.Param(id = 1) String str, @SafeParcelable.Param(id = 2) Rect rect, @SafeParcelable.Param(id = 3) List list, @SafeParcelable.Param(id = 4) float f, @SafeParcelable.Param(id = 5) float f4) {
        this.f45056zza = str;
        this.f45057zzb = rect;
        this.f45058zzc = list;
        this.f45059zzd = f;
        this.f45060zze = f4;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.f45056zza;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, str, false);
        SafeParcelWriter.writeParcelable(parcel, 2, this.f45057zzb, i, false);
        SafeParcelWriter.writeTypedList(parcel, 3, this.f45058zzc, false);
        SafeParcelWriter.writeFloat(parcel, 4, this.f45059zzd);
        SafeParcelWriter.writeFloat(parcel, 5, this.f45060zze);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public final float zza() {
        return this.f45060zze;
    }

    public final float zzb() {
        return this.f45059zzd;
    }

    public final Rect zzc() {
        return this.f45057zzb;
    }

    public final String zzd() {
        return this.f45056zza;
    }

    public final List zze() {
        return this.f45058zzc;
    }
}
