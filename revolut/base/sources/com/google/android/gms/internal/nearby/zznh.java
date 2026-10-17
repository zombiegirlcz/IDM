package com.google.android.gms.internal.nearby;

import a0.d;
import android.os.ParcelUuid;
import android.util.SparseArray;
import ch.qos.logback.core.CoreConstants;
import com.google.android.gms.common.util.Hex;
import com.google.common.primitives.UnsignedBytes;
import j6.a;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: loaded from: classes16.dex */
public final class zznh {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private static final ParcelUuid f45503zza = ParcelUuid.fromString("00000000-0000-1000-8000-00805F9B34FB");

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private final int f45504zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private final List f45505zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private final SparseArray f45506zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    private final Map f45507zze;

    /* JADX INFO: renamed from: zzf, reason: collision with root package name */
    private final int f45508zzf;

    /* JADX INFO: renamed from: zzg, reason: collision with root package name */
    private final String f45509zzg;

    /* JADX INFO: renamed from: zzh, reason: collision with root package name */
    private final byte[] f45510zzh;

    private zznh(List list, SparseArray sparseArray, Map map, int i, int i2, String str, byte[] bArr) {
        this.f45505zzc = list;
        this.f45506zzd = sparseArray;
        this.f45507zze = map;
        this.f45509zzg = str;
        this.f45504zzb = i;
        this.f45508zzf = i2;
        this.f45510zzh = bArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0097  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.gms.internal.nearby.zznh zza(byte[] r15) {
        /*
            Method dump skipped, instruction units count: 202
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.nearby.zznh.zza(byte[]):com.google.android.gms.internal.nearby.zznh");
    }

    private static int zzb(byte[] bArr, int i, int i2, int i3, List list) {
        while (i2 > 0) {
            list.add(zzc(zzd(bArr, i, i3)));
            i2 -= i3;
            i += i3;
        }
        return i;
    }

    private static ParcelUuid zzc(byte[] bArr) {
        long j2;
        int length = bArr.length;
        if (length != 2 && length != 4 && length != 16) {
            throw new IllegalArgumentException(d.n("uuidBytes length invalid - ", length));
        }
        if (length == 16) {
            ByteBuffer byteBufferOrder = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
            return new ParcelUuid(new UUID(byteBufferOrder.getLong(8), byteBufferOrder.getLong(0)));
        }
        if (length == 2) {
            j2 = ((long) (bArr[0] & UnsignedBytes.MAX_VALUE)) + ((long) ((bArr[1] & UnsignedBytes.MAX_VALUE) << 8));
        } else {
            j2 = ((long) ((bArr[3] & UnsignedBytes.MAX_VALUE) << 24)) + ((long) (bArr[0] & UnsignedBytes.MAX_VALUE)) + ((long) ((bArr[1] & UnsignedBytes.MAX_VALUE) << 8)) + ((long) ((bArr[2] & UnsignedBytes.MAX_VALUE) << 16));
        }
        ParcelUuid parcelUuid = f45503zza;
        return new ParcelUuid(new UUID(parcelUuid.getUuid().getMostSignificantBits() + (j2 << 32), parcelUuid.getUuid().getLeastSignificantBits()));
    }

    private static byte[] zzd(byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return bArr2;
    }

    public final boolean equals(Object obj2) {
        if (obj2 == this) {
            return true;
        }
        if (obj2 instanceof zznh) {
            return Arrays.equals(this.f45510zzh, ((zznh) obj2).f45510zzh);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f45510zzh);
    }

    public final String toString() {
        String string;
        String strValueOf = String.valueOf(this.f45505zzc);
        StringBuilder sb6 = new StringBuilder();
        SparseArray sparseArray = this.f45506zzd;
        int i = 0;
        String string2 = "{}";
        if (sparseArray.size() <= 0) {
            string = "{}";
        } else {
            sb6.append(CoreConstants.CURLY_LEFT);
            for (int i2 = 0; i2 < sparseArray.size(); i2++) {
                if (i2 > 0) {
                    sb6.append(", ");
                }
                int iKeyAt = sparseArray.keyAt(i2);
                byte[] bArr = (byte[]) sparseArray.valueAt(i2);
                sb6.append(iKeyAt);
                sb6.append('=');
                sb6.append(bArr == null ? null : Hex.bytesToStringUppercase(bArr));
            }
            sb6.append(CoreConstants.CURLY_RIGHT);
            string = sb6.toString();
        }
        Map map = this.f45507zze;
        StringBuilder sb9 = new StringBuilder();
        if (!map.keySet().isEmpty()) {
            sb9.append(CoreConstants.CURLY_LEFT);
            for (Map.Entry entry : map.entrySet()) {
                if (i > 0) {
                    sb9.append(", ");
                }
                sb9.append(entry.getKey());
                sb9.append('=');
                byte[] bArr2 = (byte[]) entry.getValue();
                sb9.append(bArr2 == null ? null : Hex.bytesToStringUppercase(bArr2));
                i++;
            }
            sb9.append(CoreConstants.CURLY_RIGHT);
            string2 = sb9.toString();
        }
        int i3 = this.f45504zzb;
        int i5 = this.f45508zzf;
        String str = this.f45509zzg;
        StringBuilder sb10 = new StringBuilder("BleRecord [mAdvertiseFlags=");
        sb10.append(i3);
        sb10.append(", mServiceUuids=");
        sb10.append(strValueOf);
        sb10.append(", mManufacturerSpecificData=");
        a.D(sb10, string, ", mServiceData=", string2, ", mTxPowerLevel=");
        sb10.append(i5);
        sb10.append(", mDeviceName=");
        sb10.append(str);
        sb10.append("]");
        return sb10.toString();
    }
}
