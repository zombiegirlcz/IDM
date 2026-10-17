package com.google.android.gms.internal.auth;

import com.google.common.base.Ascii;
import com.google.common.primitives.UnsignedBytes;
import java.io.IOException;
import org.bouncycastle.asn1.eac.CertificateBody;

/* JADX INFO: loaded from: classes16.dex */
final class zzdu {
    public static int zza(byte[] bArr, int i, zzdt zzdtVar) throws zzfb {
        int iZzh = zzh(bArr, i, zzdtVar);
        int i2 = zzdtVar.f38997zza;
        if (i2 < 0) {
            throw zzfb.zzc();
        }
        if (i2 > bArr.length - iZzh) {
            throw zzfb.zzf();
        }
        if (i2 == 0) {
            zzdtVar.f38999zzc = zzef.f39010zzb;
            return iZzh;
        }
        zzdtVar.f38999zzc = zzef.zzk(bArr, iZzh, i2);
        return iZzh + i2;
    }

    public static int zzb(byte[] bArr, int i) {
        int i2 = bArr[i] & UnsignedBytes.MAX_VALUE;
        int i3 = bArr[i + 1] & UnsignedBytes.MAX_VALUE;
        int i5 = bArr[i + 2] & UnsignedBytes.MAX_VALUE;
        return ((bArr[i + 3] & UnsignedBytes.MAX_VALUE) << 24) | (i3 << 8) | i2 | (i5 << 16);
    }

    public static int zzc(zzgi zzgiVar, byte[] bArr, int i, int i2, int i3, zzdt zzdtVar) throws IOException {
        Object objZzd = zzgiVar.zzd();
        int iZzl = zzl(objZzd, zzgiVar, bArr, i, i2, i3, zzdtVar);
        zzgiVar.zze(objZzd);
        zzdtVar.f38999zzc = objZzd;
        return iZzl;
    }

    public static int zzd(zzgi zzgiVar, byte[] bArr, int i, int i2, zzdt zzdtVar) throws IOException {
        Object objZzd = zzgiVar.zzd();
        int iZzm = zzm(objZzd, zzgiVar, bArr, i, i2, zzdtVar);
        zzgiVar.zze(objZzd);
        zzdtVar.f38999zzc = objZzd;
        return iZzm;
    }

    public static int zze(zzgi zzgiVar, int i, byte[] bArr, int i2, int i3, zzez zzezVar, zzdt zzdtVar) throws IOException {
        int iZzd = zzd(zzgiVar, bArr, i2, i3, zzdtVar);
        zzezVar.add(zzdtVar.f38999zzc);
        while (iZzd < i3) {
            int iZzh = zzh(bArr, iZzd, zzdtVar);
            if (i != zzdtVar.f38997zza) {
                break;
            }
            iZzd = zzd(zzgiVar, bArr, iZzh, i3, zzdtVar);
            zzezVar.add(zzdtVar.f38999zzc);
        }
        return iZzd;
    }

    public static int zzf(byte[] bArr, int i, zzez zzezVar, zzdt zzdtVar) throws IOException {
        zzew zzewVar = (zzew) zzezVar;
        int iZzh = zzh(bArr, i, zzdtVar);
        int i2 = zzdtVar.f38997zza + iZzh;
        while (iZzh < i2) {
            iZzh = zzh(bArr, iZzh, zzdtVar);
            zzewVar.zze(zzdtVar.f38997zza);
        }
        if (iZzh == i2) {
            return iZzh;
        }
        throw zzfb.zzf();
    }

    public static int zzg(int i, byte[] bArr, int i2, int i3, zzha zzhaVar, zzdt zzdtVar) throws zzfb {
        if ((i >>> 3) == 0) {
            throw zzfb.zza();
        }
        int i5 = i & 7;
        if (i5 == 0) {
            int iZzk = zzk(bArr, i2, zzdtVar);
            zzhaVar.zzh(i, Long.valueOf(zzdtVar.f38998zzb));
            return iZzk;
        }
        if (i5 == 1) {
            zzhaVar.zzh(i, Long.valueOf(zzn(bArr, i2)));
            return i2 + 8;
        }
        if (i5 == 2) {
            int iZzh = zzh(bArr, i2, zzdtVar);
            int i6 = zzdtVar.f38997zza;
            if (i6 < 0) {
                throw zzfb.zzc();
            }
            if (i6 > bArr.length - iZzh) {
                throw zzfb.zzf();
            }
            if (i6 == 0) {
                zzhaVar.zzh(i, zzef.f39010zzb);
            } else {
                zzhaVar.zzh(i, zzef.zzk(bArr, iZzh, i6));
            }
            return iZzh + i6;
        }
        if (i5 != 3) {
            if (i5 != 5) {
                throw zzfb.zza();
            }
            zzhaVar.zzh(i, Integer.valueOf(zzb(bArr, i2)));
            return i2 + 4;
        }
        int i21 = (i & (-8)) | 4;
        zzha zzhaVarZzd = zzha.zzd();
        int i22 = 0;
        while (true) {
            if (i2 >= i3) {
                break;
            }
            int iZzh2 = zzh(bArr, i2, zzdtVar);
            i22 = zzdtVar.f38997zza;
            if (i22 == i21) {
                i2 = iZzh2;
                break;
            }
            i2 = zzg(i22, bArr, iZzh2, i3, zzhaVarZzd, zzdtVar);
        }
        if (i2 > i3 || i22 != i21) {
            throw zzfb.zzd();
        }
        zzhaVar.zzh(i, zzhaVarZzd);
        return i2;
    }

    public static int zzh(byte[] bArr, int i, zzdt zzdtVar) {
        int i2 = i + 1;
        byte b4 = bArr[i];
        if (b4 < 0) {
            return zzi(b4, bArr, i2, zzdtVar);
        }
        zzdtVar.f38997zza = b4;
        return i2;
    }

    public static int zzi(int i, byte[] bArr, int i2, zzdt zzdtVar) {
        byte b4 = bArr[i2];
        int i3 = i2 + 1;
        int i5 = i & CertificateBody.profileType;
        if (b4 >= 0) {
            zzdtVar.f38997zza = i5 | (b4 << 7);
            return i3;
        }
        int i6 = i5 | ((b4 & Ascii.DEL) << 7);
        int i21 = i2 + 2;
        byte b5 = bArr[i3];
        if (b5 >= 0) {
            zzdtVar.f38997zza = i6 | (b5 << 14);
            return i21;
        }
        int i22 = i6 | ((b5 & Ascii.DEL) << 14);
        int i32 = i2 + 3;
        byte b7 = bArr[i21];
        if (b7 >= 0) {
            zzdtVar.f38997zza = i22 | (b7 << Ascii.NAK);
            return i32;
        }
        int i33 = i22 | ((b7 & Ascii.DEL) << 21);
        int i43 = i2 + 4;
        byte b13 = bArr[i32];
        if (b13 >= 0) {
            zzdtVar.f38997zza = i33 | (b13 << 28);
            return i43;
        }
        int i59 = i33 | ((b13 & Ascii.DEL) << 28);
        while (true) {
            int i66 = i43 + 1;
            if (bArr[i43] >= 0) {
                zzdtVar.f38997zza = i59;
                return i66;
            }
            i43 = i66;
        }
    }

    public static int zzj(int i, byte[] bArr, int i2, int i3, zzez zzezVar, zzdt zzdtVar) {
        zzew zzewVar = (zzew) zzezVar;
        int iZzh = zzh(bArr, i2, zzdtVar);
        zzewVar.zze(zzdtVar.f38997zza);
        while (iZzh < i3) {
            int iZzh2 = zzh(bArr, iZzh, zzdtVar);
            if (i != zzdtVar.f38997zza) {
                break;
            }
            iZzh = zzh(bArr, iZzh2, zzdtVar);
            zzewVar.zze(zzdtVar.f38997zza);
        }
        return iZzh;
    }

    public static int zzk(byte[] bArr, int i, zzdt zzdtVar) {
        long j2 = bArr[i];
        int i2 = i + 1;
        if (j2 >= 0) {
            zzdtVar.f38998zzb = j2;
            return i2;
        }
        int i3 = i + 2;
        byte b4 = bArr[i2];
        long j3 = (j2 & 127) | (((long) (b4 & Ascii.DEL)) << 7);
        int i5 = 7;
        while (b4 < 0) {
            int i6 = i3 + 1;
            byte b5 = bArr[i3];
            i5 += 7;
            j3 |= ((long) (b5 & Ascii.DEL)) << i5;
            b4 = b5;
            i3 = i6;
        }
        zzdtVar.f38998zzb = j3;
        return i3;
    }

    public static int zzl(Object obj2, zzgi zzgiVar, byte[] bArr, int i, int i2, int i3, zzdt zzdtVar) throws IOException {
        int iZzb = ((zzga) zzgiVar).zzb(obj2, bArr, i, i2, i3, zzdtVar);
        zzdtVar.f38999zzc = obj2;
        return iZzb;
    }

    public static int zzm(Object obj2, zzgi zzgiVar, byte[] bArr, int i, int i2, zzdt zzdtVar) throws IOException {
        int iZzi = i + 1;
        int i3 = bArr[i];
        if (i3 < 0) {
            iZzi = zzi(i3, bArr, iZzi, zzdtVar);
            i3 = zzdtVar.f38997zza;
        }
        int i5 = iZzi;
        if (i3 < 0 || i3 > i2 - i5) {
            throw zzfb.zzf();
        }
        int i6 = i5 + i3;
        zzgiVar.zzg(obj2, bArr, i5, i6, zzdtVar);
        zzdtVar.f38999zzc = obj2;
        return i6;
    }

    public static long zzn(byte[] bArr, int i) {
        return (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48) | ((((long) bArr[i + 7]) & 255) << 56);
    }
}
