package com.google.android.gms.internal.mlkit_vision_text_common;

import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
@SafeParcelable.Class(creator = "TextBlockParcelCreator")
public final class zzuz extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzuz> CREATOR = new zzva();

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getText", id = 1)
    private final String f45027zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getBoundingBox", id = 2)
    private final Rect f45028zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getCornerPointList", id = 3)
    private final List f45029zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getRecognizedLanguage", id = 4)
    private final String f45030zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getTextLineList", id = 5)
    private final List f45031zze;

    @SafeParcelable.Constructor
    public zzuz(@SafeParcelable.Param(id = 1) String str, @SafeParcelable.Param(id = 2) Rect rect, @SafeParcelable.Param(id = 3) List list, @SafeParcelable.Param(id = 4) String str2, @SafeParcelable.Param(id = 5) List list2) {
        this.f45027zza = str;
        this.f45028zzb = rect;
        this.f45029zzc = list;
        this.f45030zzd = str2;
        this.f45031zze = list2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.f45027zza;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, str, false);
        SafeParcelWriter.writeParcelable(parcel, 2, this.f45028zzb, i, false);
        SafeParcelWriter.writeTypedList(parcel, 3, this.f45029zzc, false);
        SafeParcelWriter.writeString(parcel, 4, this.f45030zzd, false);
        SafeParcelWriter.writeTypedList(parcel, 5, this.f45031zze, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public final Rect zza() {
        return this.f45028zzb;
    }

    public final String zzb() {
        return this.f45030zzd;
    }

    public final String zzc() {
        return this.f45027zza;
    }

    public final List zzd() {
        return this.f45029zzc;
    }

    public final List zze() {
        return this.f45031zze;
    }
}
