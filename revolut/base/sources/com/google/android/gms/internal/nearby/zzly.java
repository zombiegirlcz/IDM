package com.google.android.gms.internal.nearby;

import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.io.Closeable;
import java.io.DataInputStream;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes16.dex */
@SafeParcelable.Class(creator = "ParcelByteArrayCreator", creatorIsFinal = false)
@SafeParcelable.Reserved({1000})
public final class zzly extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzly> CREATOR = new zzlv();

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private byte[] f45435zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getDataPfd", id = 1)
    private ParcelFileDescriptor f45436zzb;

    private zzly() {
        this.f45435zza = new byte[0];
    }

    public static byte[] zzd(ParcelFileDescriptor parcelFileDescriptor) {
        DataInputStream dataInputStream = new DataInputStream(new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor));
        try {
            try {
                byte[] bArr = new byte[dataInputStream.readInt()];
                dataInputStream.read(bArr);
                return bArr;
            } catch (IOException e) {
                throw new IllegalStateException("Could not read from parcel file descriptor", e);
            }
        } finally {
            zze(dataInputStream);
        }
    }

    private static void zze(Closeable closeable) {
        try {
            closeable.close();
        } catch (IOException e) {
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (obj2 instanceof zzly) {
            return Arrays.equals(this.f45435zza, ((zzly) obj2).f45435zza);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f45435zza);
    }

    /* JADX WARN: Not initialized variable reg: 7, insn: 0x0064: MOVE (r4 I:??[OBJECT, ARRAY]) = (r7 I:??[OBJECT, ARRAY]), block:B:20:0x0064 */
    /* JADX WARN: Removed duplicated region for block: B:38:0x009a A[PHI: r7
      0x009a: PHI (r7v4 java.io.DataOutputStream) = (r7v3 java.io.DataOutputStream), (r7v5 java.io.DataOutputStream) binds: [B:42:0x00b1, B:37:0x0098] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.os.Parcelable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void writeToParcel(android.os.Parcel r10, int r11) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 207
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.nearby.zzly.writeToParcel(android.os.Parcel, int):void");
    }

    public final byte[] zzc() {
        return this.f45435zza;
    }

    @SafeParcelable.Constructor
    public zzly(@SafeParcelable.Param(id = 1) ParcelFileDescriptor parcelFileDescriptor) {
        this.f45435zza = new byte[0];
        this.f45436zzb = parcelFileDescriptor;
    }

    public /* synthetic */ zzly(zzlx zzlxVar) {
        this.f45435zza = new byte[0];
    }
}
