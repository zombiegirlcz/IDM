package com.google.android.gms.internal.mlkit_vision_text_common;

import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
@SafeParcelable.Class(creator = "TextLineParcelCreator")
public final class zzvd extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzvd> CREATOR = new zzve();

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getText", id = 1)
    private final String f45040zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getBoundingBox", id = 2)
    private final Rect f45041zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getCornerPointList", id = 3)
    private final List f45042zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getRecognizedLanguage", id = 4)
    private final String f45043zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getTextElementList", id = 5)
    private final List f45044zze;

    /* JADX INFO: renamed from: zzf, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getConfidence", id = 6)
    private final float f45045zzf;

    /* JADX INFO: renamed from: zzg, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getAngle", id = 7)
    private final float f45046zzg;

    @SafeParcelable.Constructor
    public zzvd(@SafeParcelable.Param(id = 1) String str, @SafeParcelable.Param(id = 2) Rect rect, @SafeParcelable.Param(id = 3) List list, @SafeParcelable.Param(id = 4) String str2, @SafeParcelable.Param(id = 5) List list2, @SafeParcelable.Param(id = 6) float f, @SafeParcelable.Param(id = 7) float f4) {
        this.f45040zza = str;
        this.f45041zzb = rect;
        this.f45042zzc = list;
        this.f45043zzd = str2;
        this.f45044zze = list2;
        this.f45045zzf = f;
        this.f45046zzg = f4;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.f45040zza;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, str, false);
        SafeParcelWriter.writeParcelable(parcel, 2, this.f45041zzb, i, false);
        SafeParcelWriter.writeTypedList(parcel, 3, this.f45042zzc, false);
        SafeParcelWriter.writeString(parcel, 4, this.f45043zzd, false);
        SafeParcelWriter.writeTypedList(parcel, 5, this.f45044zze, false);
        SafeParcelWriter.writeFloat(parcel, 6, this.f45045zzf);
        SafeParcelWriter.writeFloat(parcel, 7, this.f45046zzg);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public final float zza() {
        return this.f45046zzg;
    }

    public final float zzb() {
        return this.f45045zzf;
    }

    public final Rect zzc() {
        return this.f45041zzb;
    }

    public final String zzd() {
        return this.f45043zzd;
    }

    public final String zze() {
        return this.f45040zza;
    }

    public final List zzf() {
        return this.f45042zzc;
    }

    public final List zzg() {
        return this.f45044zze;
    }
}
