package com.google.android.gms.internal.mlkit_vision_text_common;

import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
@SafeParcelable.Class(creator = "TextElementParcelCreator")
public final class zzvb extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzvb> CREATOR = new zzvc();

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getText", id = 1)
    private final String f45033zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getBoundingBox", id = 2)
    private final Rect f45034zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getCornerPointList", id = 3)
    private final List f45035zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getRecognizedLanguage", id = 4)
    private final String f45036zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getConfidence", id = 5)
    private final float f45037zze;

    /* JADX INFO: renamed from: zzf, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getAngle", id = 6)
    private final float f45038zzf;

    /* JADX INFO: renamed from: zzg, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getTextSymbolList", id = 7)
    private final List f45039zzg;

    @SafeParcelable.Constructor
    public zzvb(@SafeParcelable.Param(id = 1) String str, @SafeParcelable.Param(id = 2) Rect rect, @SafeParcelable.Param(id = 3) List list, @SafeParcelable.Param(id = 4) String str2, @SafeParcelable.Param(id = 5) float f, @SafeParcelable.Param(id = 6) float f4, @SafeParcelable.Param(id = 7) List list2) {
        this.f45033zza = str;
        this.f45034zzb = rect;
        this.f45035zzc = list;
        this.f45036zzd = str2;
        this.f45037zze = f;
        this.f45038zzf = f4;
        this.f45039zzg = list2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.f45033zza;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, str, false);
        SafeParcelWriter.writeParcelable(parcel, 2, this.f45034zzb, i, false);
        SafeParcelWriter.writeTypedList(parcel, 3, this.f45035zzc, false);
        SafeParcelWriter.writeString(parcel, 4, this.f45036zzd, false);
        SafeParcelWriter.writeFloat(parcel, 5, this.f45037zze);
        SafeParcelWriter.writeFloat(parcel, 6, this.f45038zzf);
        SafeParcelWriter.writeTypedList(parcel, 7, this.f45039zzg, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public final float zza() {
        return this.f45038zzf;
    }

    public final float zzb() {
        return this.f45037zze;
    }

    public final Rect zzc() {
        return this.f45034zzb;
    }

    public final String zzd() {
        return this.f45036zzd;
    }

    public final String zze() {
        return this.f45033zza;
    }

    public final List zzf() {
        return this.f45035zzc;
    }

    public final List zzg() {
        return this.f45039zzg;
    }
}
