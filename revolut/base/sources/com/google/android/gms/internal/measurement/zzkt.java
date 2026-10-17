package com.google.android.gms.internal.measurement;

import com.google.common.base.Ascii;
import com.google.common.primitives.UnsignedBytes;
import java.io.IOException;
import org.bouncycastle.asn1.eac.CertificateBody;

/* JADX INFO: loaded from: classes16.dex */
final class zzkt {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    public static final /* synthetic */ int f40397zza = 0;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private static volatile int f40398zzb = 100;

    public static int zza(byte[] bArr, int i, zzks zzksVar) throws zzmm {
        int iZzh = zzh(bArr, i, zzksVar);
        int i2 = zzksVar.f40392zza;
        if (i2 < 0) {
            throw new zzmm("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (i2 > bArr.length - iZzh) {
            throw new zzmm("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        if (i2 == 0) {
            zzksVar.f40394zzc = zzld.f40408zzb;
            return iZzh;
        }
        zzksVar.f40394zzc = zzld.zzj(bArr, iZzh, i2);
        return iZzh + i2;
    }

    public static int zzb(byte[] bArr, int i) {
        int i2 = bArr[i] & UnsignedBytes.MAX_VALUE;
        int i3 = bArr[i + 1] & UnsignedBytes.MAX_VALUE;
        int i5 = bArr[i + 2] & UnsignedBytes.MAX_VALUE;
        return ((bArr[i + 3] & UnsignedBytes.MAX_VALUE) << 24) | (i3 << 8) | i2 | (i5 << 16);
    }

    public static int zzc(zzns zznsVar, byte[] bArr, int i, int i2, int i3, zzks zzksVar) throws IOException {
        Object objZze = zznsVar.zze();
        int iZzl = zzl(objZze, zznsVar, bArr, i, i2, i3, zzksVar);
        zznsVar.zzf(objZze);
        zzksVar.f40394zzc = objZze;
        return iZzl;
    }

    public static int zzd(zzns zznsVar, byte[] bArr, int i, int i2, zzks zzksVar) throws IOException {
        Object objZze = zznsVar.zze();
        int iZzm = zzm(objZze, zznsVar, bArr, i, i2, zzksVar);
        zznsVar.zzf(objZze);
        zzksVar.f40394zzc = objZze;
        return iZzm;
    }

    public static int zze(zzns zznsVar, int i, byte[] bArr, int i2, int i3, zzmj zzmjVar, zzks zzksVar) throws IOException {
        int iZzd = zzd(zznsVar, bArr, i2, i3, zzksVar);
        zzmjVar.add(zzksVar.f40394zzc);
        while (iZzd < i3) {
            int iZzh = zzh(bArr, iZzd, zzksVar);
            if (i != zzksVar.f40392zza) {
                break;
            }
            iZzd = zzd(zznsVar, bArr, iZzh, i3, zzksVar);
            zzmjVar.add(zzksVar.f40394zzc);
        }
        return iZzd;
    }

    public static int zzf(byte[] bArr, int i, zzmj zzmjVar, zzks zzksVar) throws IOException {
        zzme zzmeVar = (zzme) zzmjVar;
        int iZzh = zzh(bArr, i, zzksVar);
        int i2 = zzksVar.f40392zza + iZzh;
        while (iZzh < i2) {
            iZzh = zzh(bArr, iZzh, zzksVar);
            zzmeVar.zzh(zzksVar.f40392zza);
        }
        if (iZzh == i2) {
            return iZzh;
        }
        throw new zzmm("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public static int zzg(int i, byte[] bArr, int i2, int i3, zzof zzofVar, zzks zzksVar) throws zzmm {
        if ((i >>> 3) == 0) {
            throw new zzmm("Protocol message contained an invalid tag (zero).");
        }
        int i5 = i & 7;
        if (i5 == 0) {
            int iZzk = zzk(bArr, i2, zzksVar);
            zzofVar.zzj(i, Long.valueOf(zzksVar.f40393zzb));
            return iZzk;
        }
        if (i5 == 1) {
            zzofVar.zzj(i, Long.valueOf(zzn(bArr, i2)));
            return i2 + 8;
        }
        if (i5 == 2) {
            int iZzh = zzh(bArr, i2, zzksVar);
            int i6 = zzksVar.f40392zza;
            if (i6 < 0) {
                throw new zzmm("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
            if (i6 > bArr.length - iZzh) {
                throw new zzmm("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            if (i6 == 0) {
                zzofVar.zzj(i, zzld.f40408zzb);
            } else {
                zzofVar.zzj(i, zzld.zzj(bArr, iZzh, i6));
            }
            return iZzh + i6;
        }
        if (i5 != 3) {
            if (i5 != 5) {
                throw new zzmm("Protocol message contained an invalid tag (zero).");
            }
            zzofVar.zzj(i, Integer.valueOf(zzb(bArr, i2)));
            return i2 + 4;
        }
        int i21 = (i & (-8)) | 4;
        zzof zzofVarZzf = zzof.zzf();
        int i22 = zzksVar.f40396zze + 1;
        zzksVar.f40396zze = i22;
        zzo(i22);
        int i32 = 0;
        while (true) {
            if (i2 >= i3) {
                break;
            }
            int iZzh2 = zzh(bArr, i2, zzksVar);
            int i33 = zzksVar.f40392zza;
            if (i33 == i21) {
                i32 = i33;
                i2 = iZzh2;
                break;
            }
            i2 = zzg(i33, bArr, iZzh2, i3, zzofVarZzf, zzksVar);
            i32 = i33;
        }
        zzksVar.f40396zze--;
        if (i2 > i3 || i32 != i21) {
            throw new zzmm("Failed to parse the message.");
        }
        zzofVar.zzj(i, zzofVarZzf);
        return i2;
    }

    public static int zzh(byte[] bArr, int i, zzks zzksVar) {
        int i2 = i + 1;
        byte b4 = bArr[i];
        if (b4 < 0) {
            return zzi(b4, bArr, i2, zzksVar);
        }
        zzksVar.f40392zza = b4;
        return i2;
    }

    public static int zzi(int i, byte[] bArr, int i2, zzks zzksVar) {
        byte b4 = bArr[i2];
        int i3 = i2 + 1;
        int i5 = i & CertificateBody.profileType;
        if (b4 >= 0) {
            zzksVar.f40392zza = i5 | (b4 << 7);
            return i3;
        }
        int i6 = i5 | ((b4 & Ascii.DEL) << 7);
        int i21 = i2 + 2;
        byte b5 = bArr[i3];
        if (b5 >= 0) {
            zzksVar.f40392zza = i6 | (b5 << 14);
            return i21;
        }
        int i22 = i6 | ((b5 & Ascii.DEL) << 14);
        int i32 = i2 + 3;
        byte b7 = bArr[i21];
        if (b7 >= 0) {
            zzksVar.f40392zza = i22 | (b7 << Ascii.NAK);
            return i32;
        }
        int i33 = i22 | ((b7 & Ascii.DEL) << 21);
        int i43 = i2 + 4;
        byte b13 = bArr[i32];
        if (b13 >= 0) {
            zzksVar.f40392zza = i33 | (b13 << 28);
            return i43;
        }
        int i59 = i33 | ((b13 & Ascii.DEL) << 28);
        while (true) {
            int i66 = i43 + 1;
            if (bArr[i43] >= 0) {
                zzksVar.f40392zza = i59;
                return i66;
            }
            i43 = i66;
        }
    }

    public static int zzj(int i, byte[] bArr, int i2, int i3, zzmj zzmjVar, zzks zzksVar) {
        zzme zzmeVar = (zzme) zzmjVar;
        int iZzh = zzh(bArr, i2, zzksVar);
        zzmeVar.zzh(zzksVar.f40392zza);
        while (iZzh < i3) {
            int iZzh2 = zzh(bArr, iZzh, zzksVar);
            if (i != zzksVar.f40392zza) {
                break;
            }
            iZzh = zzh(bArr, iZzh2, zzksVar);
            zzmeVar.zzh(zzksVar.f40392zza);
        }
        return iZzh;
    }

    public static int zzk(byte[] bArr, int i, zzks zzksVar) {
        long j2 = bArr[i];
        int i2 = i + 1;
        if (j2 >= 0) {
            zzksVar.f40393zzb = j2;
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
        zzksVar.f40393zzb = j3;
        return i3;
    }

    public static int zzl(Object obj2, zzns zznsVar, byte[] bArr, int i, int i2, int i3, zzks zzksVar) throws IOException {
        int i5 = zzksVar.f40396zze + 1;
        zzksVar.f40396zze = i5;
        zzo(i5);
        int iZzc = ((zznk) zznsVar).zzc(obj2, bArr, i, i2, i3, zzksVar);
        zzksVar.f40396zze--;
        zzksVar.f40394zzc = obj2;
        return iZzc;
    }

    public static int zzm(Object obj2, zzns zznsVar, byte[] bArr, int i, int i2, zzks zzksVar) throws IOException {
        int iZzi = i + 1;
        int i3 = bArr[i];
        if (i3 < 0) {
            iZzi = zzi(i3, bArr, iZzi, zzksVar);
            i3 = zzksVar.f40392zza;
        }
        int i5 = iZzi;
        if (i3 < 0 || i3 > i2 - i5) {
            throw new zzmm("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        int i6 = zzksVar.f40396zze + 1;
        zzksVar.f40396zze = i6;
        zzo(i6);
        int i21 = i5 + i3;
        zznsVar.zzh(obj2, bArr, i5, i21, zzksVar);
        zzksVar.f40396zze--;
        zzksVar.f40394zzc = obj2;
        return i21;
    }

    public static long zzn(byte[] bArr, int i) {
        return (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48) | ((((long) bArr[i + 7]) & 255) << 56);
    }

    private static void zzo(int i) throws zzmm {
        if (i >= f40398zzb) {
            throw new zzmm("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
    }
}
