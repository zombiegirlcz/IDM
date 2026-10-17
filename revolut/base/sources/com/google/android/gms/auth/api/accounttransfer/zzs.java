package com.google.android.gms.auth.api.accounttransfer;

import a0.d;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.collection.ArrayMap;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.server.response.FastJsonResponse;
import com.google.android.gms.internal.auth.zzbz;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes16.dex */
@SafeParcelable.Class(creator = "AccountTransferProgressCreator")
public final class zzs extends zzbz {
    public static final Parcelable.Creator<zzs> CREATOR = new zzt();

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private static final ArrayMap f37336zzb;

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    @SafeParcelable.VersionField(id = 1)
    final int f37337zza;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getRegisteredAccountTypes", id = 2)
    private List f37338zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getInProgressAccountTypes", id = 3)
    private List f37339zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getSuccessAccountTypes", id = 4)
    private List f37340zze;

    /* JADX INFO: renamed from: zzf, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getFailedAccountTypes", id = 5)
    private List f37341zzf;

    /* JADX INFO: renamed from: zzg, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getEscrowedAccountTypes", id = 6)
    private List f37342zzg;

    static {
        ArrayMap arrayMap = new ArrayMap();
        f37336zzb = arrayMap;
        arrayMap.put("registered", FastJsonResponse.Field.forStrings("registered", 2));
        arrayMap.put("in_progress", FastJsonResponse.Field.forStrings("in_progress", 3));
        arrayMap.put("success", FastJsonResponse.Field.forStrings("success", 4));
        arrayMap.put("failed", FastJsonResponse.Field.forStrings("failed", 5));
        arrayMap.put("escrowed", FastJsonResponse.Field.forStrings("escrowed", 6));
    }

    public zzs() {
        this.f37337zza = 1;
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final Map getFieldMappings() {
        return f37336zzb;
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final Object getFieldValue(FastJsonResponse.Field field) {
        switch (field.getSafeParcelableFieldId()) {
            case 1:
                return Integer.valueOf(this.f37337zza);
            case 2:
                return this.f37338zzc;
            case 3:
                return this.f37339zzd;
            case 4:
                return this.f37340zze;
            case 5:
                return this.f37341zzf;
            case 6:
                return this.f37342zzg;
            default:
                throw new IllegalStateException(d.n("Unknown SafeParcelable id=", field.getSafeParcelableFieldId()));
        }
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final boolean isFieldSet(FastJsonResponse.Field field) {
        return true;
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final void setStringsInternal(FastJsonResponse.Field field, String str, ArrayList arrayList) {
        int safeParcelableFieldId = field.getSafeParcelableFieldId();
        if (safeParcelableFieldId == 2) {
            this.f37338zzc = arrayList;
            return;
        }
        if (safeParcelableFieldId == 3) {
            this.f37339zzd = arrayList;
            return;
        }
        if (safeParcelableFieldId == 4) {
            this.f37340zze = arrayList;
        } else if (safeParcelableFieldId == 5) {
            this.f37341zzf = arrayList;
        } else {
            if (safeParcelableFieldId != 6) {
                throw new IllegalArgumentException(String.format("Field with id=%d is not known to be a string list.", Integer.valueOf(safeParcelableFieldId)));
            }
            this.f37342zzg = arrayList;
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.f37337zza);
        SafeParcelWriter.writeStringList(parcel, 2, this.f37338zzc, false);
        SafeParcelWriter.writeStringList(parcel, 3, this.f37339zzd, false);
        SafeParcelWriter.writeStringList(parcel, 4, this.f37340zze, false);
        SafeParcelWriter.writeStringList(parcel, 5, this.f37341zzf, false);
        SafeParcelWriter.writeStringList(parcel, 6, this.f37342zzg, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @SafeParcelable.Constructor
    public zzs(@SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 2) List list, @SafeParcelable.Param(id = 3) List list2, @SafeParcelable.Param(id = 4) List list3, @SafeParcelable.Param(id = 5) List list4, @SafeParcelable.Param(id = 6) List list5) {
        this.f37337zza = i;
        this.f37338zzc = list;
        this.f37339zzd = list2;
        this.f37340zze = list3;
        this.f37341zzf = list4;
        this.f37342zzg = list5;
    }
}
