package com.google.android.gms.auth.api.accounttransfer;

import a0.d;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.collection.ArraySet;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.server.response.FastJsonResponse;
import com.google.android.gms.internal.auth.zzbz;
import j6.a;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes16.dex */
@SafeParcelable.Class(creator = "AuthenticatorTransferInfoCreator")
public final class zzw extends zzbz {
    public static final Parcelable.Creator<zzw> CREATOR = new zzx();

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private static final HashMap f37350zzc;

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    @SafeParcelable.Indicator
    final Set f37351zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    @SafeParcelable.VersionField(id = 1)
    final int f37352zzb;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getAccountType", id = 2)
    private String f37353zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getStatus", id = 3)
    private int f37354zze;

    /* JADX INFO: renamed from: zzf, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getTransferBytes", id = 4)
    private byte[] f37355zzf;

    /* JADX INFO: renamed from: zzg, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getPendingIntent", id = 5)
    private PendingIntent f37356zzg;

    /* JADX INFO: renamed from: zzh, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getDeviceMetaData", id = 6)
    private DeviceMetaData f37357zzh;

    static {
        HashMap map = new HashMap();
        f37350zzc = map;
        map.put("accountType", FastJsonResponse.Field.forString("accountType", 2));
        map.put("status", FastJsonResponse.Field.forInteger("status", 3));
        map.put("transferBytes", FastJsonResponse.Field.forBase64("transferBytes", 4));
    }

    public zzw() {
        this.f37351zza = new ArraySet(3);
        this.f37352zzb = 1;
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final /* synthetic */ Map getFieldMappings() {
        return f37350zzc;
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final Object getFieldValue(FastJsonResponse.Field field) {
        int safeParcelableFieldId = field.getSafeParcelableFieldId();
        if (safeParcelableFieldId == 1) {
            return Integer.valueOf(this.f37352zzb);
        }
        if (safeParcelableFieldId == 2) {
            return this.f37353zzd;
        }
        if (safeParcelableFieldId == 3) {
            return Integer.valueOf(this.f37354zze);
        }
        if (safeParcelableFieldId == 4) {
            return this.f37355zzf;
        }
        throw new IllegalStateException(d.n("Unknown SafeParcelable id=", field.getSafeParcelableFieldId()));
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final boolean isFieldSet(FastJsonResponse.Field field) {
        return this.f37351zza.contains(Integer.valueOf(field.getSafeParcelableFieldId()));
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final void setDecodedBytesInternal(FastJsonResponse.Field field, String str, byte[] bArr) {
        int safeParcelableFieldId = field.getSafeParcelableFieldId();
        if (safeParcelableFieldId != 4) {
            throw new IllegalArgumentException(a.l(safeParcelableFieldId, "Field with id=", " is not known to be a byte array."));
        }
        this.f37355zzf = bArr;
        this.f37351zza.add(Integer.valueOf(safeParcelableFieldId));
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final void setIntegerInternal(FastJsonResponse.Field field, String str, int i) {
        int safeParcelableFieldId = field.getSafeParcelableFieldId();
        if (safeParcelableFieldId != 3) {
            throw new IllegalArgumentException(a.l(safeParcelableFieldId, "Field with id=", " is not known to be an int."));
        }
        this.f37354zze = i;
        this.f37351zza.add(Integer.valueOf(safeParcelableFieldId));
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final void setStringInternal(FastJsonResponse.Field field, String str, String str2) {
        int safeParcelableFieldId = field.getSafeParcelableFieldId();
        if (safeParcelableFieldId != 2) {
            throw new IllegalArgumentException(String.format("Field with id=%d is not known to be a string.", Integer.valueOf(safeParcelableFieldId)));
        }
        this.f37353zzd = str2;
        this.f37351zza.add(Integer.valueOf(safeParcelableFieldId));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        Set set = this.f37351zza;
        if (set.contains(1)) {
            SafeParcelWriter.writeInt(parcel, 1, this.f37352zzb);
        }
        if (set.contains(2)) {
            SafeParcelWriter.writeString(parcel, 2, this.f37353zzd, true);
        }
        if (set.contains(3)) {
            SafeParcelWriter.writeInt(parcel, 3, this.f37354zze);
        }
        if (set.contains(4)) {
            SafeParcelWriter.writeByteArray(parcel, 4, this.f37355zzf, true);
        }
        if (set.contains(5)) {
            SafeParcelWriter.writeParcelable(parcel, 5, this.f37356zzg, i, true);
        }
        if (set.contains(6)) {
            SafeParcelWriter.writeParcelable(parcel, 6, this.f37357zzh, i, true);
        }
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @SafeParcelable.Constructor
    public zzw(@SafeParcelable.Indicator Set set, @SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 3) int i2, @SafeParcelable.Param(id = 4) byte[] bArr, @SafeParcelable.Param(id = 5) PendingIntent pendingIntent, @SafeParcelable.Param(id = 6) DeviceMetaData deviceMetaData) {
        this.f37351zza = set;
        this.f37352zzb = i;
        this.f37353zzd = str;
        this.f37354zze = i2;
        this.f37355zzf = bArr;
        this.f37356zzg = pendingIntent;
        this.f37357zzh = deviceMetaData;
    }
}
