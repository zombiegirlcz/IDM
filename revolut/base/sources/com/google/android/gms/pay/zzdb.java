package com.google.android.gms.pay;

import android.app.PendingIntent;
import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes16.dex */
@ShowFirstParty
@SafeParcelable.Class(creator = "TransitCardDialogCreator")
public final class zzdb extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzdb> CREATOR = new zzdc();

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getTitle", id = 1)
    private String f48386zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getDialogText", id = 2)
    private String f48387zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getActionButtonText", id = 3)
    private String f48388zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getActionButtonIntent", id = 4)
    private PendingIntent f48389zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getLearnMoreButtonText", id = 5)
    private String f48390zze;

    /* JADX INFO: renamed from: zzf, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getLearnMoreButtonIntent", id = 6)
    private PendingIntent f48391zzf;

    /* JADX INFO: renamed from: zzg, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getMainImage", id = 7)
    private Bitmap f48392zzg;

    /* JADX INFO: renamed from: zzh, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getPaymentMethodLogo", id = 8)
    private Bitmap[] f48393zzh;

    /* JADX INFO: renamed from: zzi, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getAnimation", id = 9)
    private zzc f48394zzi;

    private zzdb() {
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (obj2 instanceof zzdb) {
            zzdb zzdbVar = (zzdb) obj2;
            if (Objects.equal(this.f48386zza, zzdbVar.f48386zza) && Objects.equal(this.f48387zzb, zzdbVar.f48387zzb) && Objects.equal(this.f48388zzc, zzdbVar.f48388zzc) && Objects.equal(this.f48389zzd, zzdbVar.f48389zzd) && Objects.equal(this.f48390zze, zzdbVar.f48390zze) && Objects.equal(this.f48391zzf, zzdbVar.f48391zzf) && Objects.equal(this.f48392zzg, zzdbVar.f48392zzg) && Arrays.equals(this.f48393zzh, zzdbVar.f48393zzh) && Objects.equal(this.f48394zzi, zzdbVar.f48394zzi)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.f48386zza, this.f48387zzb, this.f48388zzc, this.f48389zzd, this.f48390zze, this.f48391zzf, this.f48392zzg, Integer.valueOf(Arrays.hashCode(this.f48393zzh)), this.f48394zzi);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.f48386zza, false);
        SafeParcelWriter.writeString(parcel, 2, this.f48387zzb, false);
        SafeParcelWriter.writeString(parcel, 3, this.f48388zzc, false);
        SafeParcelWriter.writeParcelable(parcel, 4, this.f48389zzd, i, false);
        SafeParcelWriter.writeString(parcel, 5, this.f48390zze, false);
        SafeParcelWriter.writeParcelable(parcel, 6, this.f48391zzf, i, false);
        SafeParcelWriter.writeParcelable(parcel, 7, this.f48392zzg, i, false);
        SafeParcelWriter.writeTypedArray(parcel, 8, this.f48393zzh, i, false);
        SafeParcelWriter.writeParcelable(parcel, 9, this.f48394zzi, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @SafeParcelable.Constructor
    public zzdb(@SafeParcelable.Param(id = 1) String str, @SafeParcelable.Param(id = 2) String str2, @SafeParcelable.Param(id = 3) String str3, @SafeParcelable.Param(id = 4) PendingIntent pendingIntent, @SafeParcelable.Param(id = 5) String str4, @SafeParcelable.Param(id = 6) PendingIntent pendingIntent2, @SafeParcelable.Param(id = 7) Bitmap bitmap, @SafeParcelable.Param(id = 8) Bitmap[] bitmapArr, @SafeParcelable.Param(id = 9) zzc zzcVar) {
        this.f48386zza = str;
        this.f48387zzb = str2;
        this.f48388zzc = str3;
        this.f48389zzd = pendingIntent;
        this.f48390zze = str4;
        this.f48391zzf = pendingIntent2;
        this.f48392zzg = bitmap;
        this.f48393zzh = bitmapArr;
        this.f48394zzi = zzcVar;
    }
}
