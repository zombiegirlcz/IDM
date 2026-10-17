package com.google.android.gms.internal.play_billing;

import com.google.common.base.Ascii;
import com.google.common.primitives.UnsignedBytes;
import java.io.IOException;
import org.bouncycastle.asn1.eac.CertificateBody;

/* JADX INFO: loaded from: classes16.dex */
final class zzek {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    public static final /* synthetic */ int f45962zza = 0;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private static volatile int f45963zzb = 100;

    public static int zza(byte[] bArr, int i, zzej zzejVar) throws zzgc {
        int iZzi = zzi(bArr, i, zzejVar);
        int i2 = zzejVar.f45957zza;
        if (i2 < 0) {
            throw new zzgc("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (i2 > bArr.length - iZzi) {
            throw new zzgc("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        if (i2 == 0) {
            zzejVar.f45959zzc = zzev.f45974zza;
            return iZzi;
        }
        zzejVar.f45959zzc = zzev.zzk(bArr, iZzi, i2);
        return iZzi + i2;
    }

    public static int zzb(byte[] bArr, int i) {
        int i2 = bArr[i] & UnsignedBytes.MAX_VALUE;
        int i3 = bArr[i + 1] & UnsignedBytes.MAX_VALUE;
        int i5 = bArr[i + 2] & UnsignedBytes.MAX_VALUE;
        return ((bArr[i + 3] & UnsignedBytes.MAX_VALUE) << 24) | (i3 << 8) | i2 | (i5 << 16);
    }

    public static int zzc(zzhl zzhlVar, byte[] bArr, int i, int i2, int i3, zzej zzejVar) throws IOException {
        Object objZze = zzhlVar.zze();
        int iZzm = zzm(objZze, zzhlVar, bArr, i, i2, i3, zzejVar);
        zzhlVar.zzf(objZze);
        zzejVar.f45959zzc = objZze;
        return iZzm;
    }

    public static int zzd(zzhl zzhlVar, byte[] bArr, int i, int i2, zzej zzejVar) throws IOException {
        Object objZze = zzhlVar.zze();
        int iZzn = zzn(objZze, zzhlVar, bArr, i, i2, zzejVar);
        zzhlVar.zzf(objZze);
        zzejVar.f45959zzc = objZze;
        return iZzn;
    }

    public static int zze(zzhl zzhlVar, int i, byte[] bArr, int i2, int i3, zzfz zzfzVar, zzej zzejVar) throws IOException {
        int iZzd = zzd(zzhlVar, bArr, i2, i3, zzejVar);
        zzfzVar.add(zzejVar.f45959zzc);
        while (iZzd < i3) {
            int iZzi = zzi(bArr, iZzd, zzejVar);
            if (i != zzejVar.f45957zza) {
                break;
            }
            iZzd = zzd(zzhlVar, bArr, iZzi, i3, zzejVar);
            zzfzVar.add(zzejVar.f45959zzc);
        }
        return iZzd;
    }

    public static int zzf(byte[] bArr, int i, zzfz zzfzVar, zzej zzejVar) throws IOException {
        zzfv zzfvVar = (zzfv) zzfzVar;
        int iZzi = zzi(bArr, i, zzejVar);
        int i2 = zzejVar.f45957zza + iZzi;
        while (iZzi < i2) {
            iZzi = zzi(bArr, iZzi, zzejVar);
            zzfvVar.zzg(zzejVar.f45957zza);
        }
        if (iZzi == i2) {
            return iZzi;
        }
        throw new zzgc("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public static int zzg(byte[] bArr, int i, zzej zzejVar) throws zzgc {
        int i2;
        int iZzi = zzi(bArr, i, zzejVar);
        int i3 = zzejVar.f45957zza;
        if (i3 < 0) {
            throw new zzgc("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (i3 == 0) {
            zzejVar.f45959zzc = "";
            return iZzi;
        }
        int i5 = zzin.f46133zza;
        int length = bArr.length;
        if ((((length - iZzi) - i3) | iZzi | i3) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(length), Integer.valueOf(iZzi), Integer.valueOf(i3)));
        }
        int i6 = iZzi + i3;
        char[] cArr = new char[i3];
        int i21 = 0;
        while (iZzi < i6) {
            byte b4 = bArr[iZzi];
            if (!zzij.zzd(b4)) {
                break;
            }
            iZzi++;
            cArr[i21] = (char) b4;
            i21++;
        }
        int i22 = i21;
        while (iZzi < i6) {
            int i32 = iZzi + 1;
            byte b5 = bArr[iZzi];
            if (zzij.zzd(b5)) {
                cArr[i22] = (char) b5;
                i22++;
                iZzi = i32;
                while (iZzi < i6) {
                    byte b7 = bArr[iZzi];
                    if (zzij.zzd(b7)) {
                        iZzi++;
                        cArr[i22] = (char) b7;
                        i22++;
                    }
                }
            } else {
                if (b5 < -32) {
                    if (i32 >= i6) {
                        throw new zzgc("Protocol message had invalid UTF-8.");
                    }
                    i2 = i22 + 1;
                    iZzi += 2;
                    zzij.zzc(b5, bArr[i32], cArr, i22);
                } else if (b5 < -16) {
                    if (i32 >= i6 - 1) {
                        throw new zzgc("Protocol message had invalid UTF-8.");
                    }
                    i2 = i22 + 1;
                    int i33 = iZzi + 2;
                    iZzi += 3;
                    zzij.zzb(b5, bArr[i32], bArr[i33], cArr, i22);
                } else {
                    if (i32 >= i6 - 2) {
                        throw new zzgc("Protocol message had invalid UTF-8.");
                    }
                    byte b13 = bArr[i32];
                    int i43 = iZzi + 3;
                    byte b15 = bArr[iZzi + 2];
                    iZzi += 4;
                    zzij.zza(b5, b13, b15, bArr[i43], cArr, i22);
                    i22 += 2;
                }
                i22 = i2;
            }
        }
        zzejVar.f45959zzc = new String(cArr, 0, i22);
        return i6;
    }

    public static int zzh(int i, byte[] bArr, int i2, int i3, zzic zzicVar, zzej zzejVar) throws zzgc {
        if ((i >>> 3) == 0) {
            throw new zzgc("Protocol message contained an invalid tag (zero).");
        }
        int i5 = i & 7;
        if (i5 == 0) {
            int iZzl = zzl(bArr, i2, zzejVar);
            zzicVar.zzj(i, Long.valueOf(zzejVar.f45958zzb));
            return iZzl;
        }
        if (i5 == 1) {
            zzicVar.zzj(i, Long.valueOf(zzp(bArr, i2)));
            return i2 + 8;
        }
        if (i5 == 2) {
            int iZzi = zzi(bArr, i2, zzejVar);
            int i6 = zzejVar.f45957zza;
            if (i6 < 0) {
                throw new zzgc("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
            if (i6 > bArr.length - iZzi) {
                throw new zzgc("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            if (i6 == 0) {
                zzicVar.zzj(i, zzev.f45974zza);
            } else {
                zzicVar.zzj(i, zzev.zzk(bArr, iZzi, i6));
            }
            return iZzi + i6;
        }
        if (i5 != 3) {
            if (i5 != 5) {
                throw new zzgc("Protocol message contained an invalid tag (zero).");
            }
            zzicVar.zzj(i, Integer.valueOf(zzb(bArr, i2)));
            return i2 + 4;
        }
        int i21 = (i & (-8)) | 4;
        zzic zzicVarZzf = zzic.zzf();
        int i22 = zzejVar.f45961zze + 1;
        zzejVar.f45961zze = i22;
        zzq(i22);
        int i32 = 0;
        while (true) {
            if (i2 >= i3) {
                break;
            }
            int iZzi2 = zzi(bArr, i2, zzejVar);
            int i33 = zzejVar.f45957zza;
            if (i33 == i21) {
                i32 = i33;
                i2 = iZzi2;
                break;
            }
            i2 = zzh(i33, bArr, iZzi2, i3, zzicVarZzf, zzejVar);
            i32 = i33;
        }
        zzejVar.f45961zze--;
        if (i2 > i3 || i32 != i21) {
            throw new zzgc("Failed to parse the message.");
        }
        zzicVar.zzj(i, zzicVarZzf);
        return i2;
    }

    public static int zzi(byte[] bArr, int i, zzej zzejVar) {
        int i2 = i + 1;
        byte b4 = bArr[i];
        if (b4 < 0) {
            return zzj(b4, bArr, i2, zzejVar);
        }
        zzejVar.f45957zza = b4;
        return i2;
    }

    public static int zzj(int i, byte[] bArr, int i2, zzej zzejVar) {
        byte b4 = bArr[i2];
        int i3 = i2 + 1;
        int i5 = i & CertificateBody.profileType;
        if (b4 >= 0) {
            zzejVar.f45957zza = i5 | (b4 << 7);
            return i3;
        }
        int i6 = i5 | ((b4 & Ascii.DEL) << 7);
        int i21 = i2 + 2;
        byte b5 = bArr[i3];
        if (b5 >= 0) {
            zzejVar.f45957zza = i6 | (b5 << 14);
            return i21;
        }
        int i22 = i6 | ((b5 & Ascii.DEL) << 14);
        int i32 = i2 + 3;
        byte b7 = bArr[i21];
        if (b7 >= 0) {
            zzejVar.f45957zza = i22 | (b7 << Ascii.NAK);
            return i32;
        }
        int i33 = i22 | ((b7 & Ascii.DEL) << 21);
        int i43 = i2 + 4;
        byte b13 = bArr[i32];
        if (b13 >= 0) {
            zzejVar.f45957zza = i33 | (b13 << 28);
            return i43;
        }
        int i59 = i33 | ((b13 & Ascii.DEL) << 28);
        while (true) {
            int i66 = i43 + 1;
            if (bArr[i43] >= 0) {
                zzejVar.f45957zza = i59;
                return i66;
            }
            i43 = i66;
        }
    }

    public static int zzk(int i, byte[] bArr, int i2, int i3, zzfz zzfzVar, zzej zzejVar) {
        zzfv zzfvVar = (zzfv) zzfzVar;
        int iZzi = zzi(bArr, i2, zzejVar);
        zzfvVar.zzg(zzejVar.f45957zza);
        while (iZzi < i3) {
            int iZzi2 = zzi(bArr, iZzi, zzejVar);
            if (i != zzejVar.f45957zza) {
                break;
            }
            iZzi = zzi(bArr, iZzi2, zzejVar);
            zzfvVar.zzg(zzejVar.f45957zza);
        }
        return iZzi;
    }

    public static int zzl(byte[] bArr, int i, zzej zzejVar) {
        long j2 = bArr[i];
        int i2 = i + 1;
        if (j2 >= 0) {
            zzejVar.f45958zzb = j2;
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
        zzejVar.f45958zzb = j3;
        return i3;
    }

    public static int zzm(Object obj2, zzhl zzhlVar, byte[] bArr, int i, int i2, int i3, zzej zzejVar) throws IOException {
        int i5 = zzejVar.f45961zze + 1;
        zzejVar.f45961zze = i5;
        zzq(i5);
        int iZzc = ((zzhe) zzhlVar).zzc(obj2, bArr, i, i2, i3, zzejVar);
        zzejVar.f45961zze--;
        zzejVar.f45959zzc = obj2;
        return iZzc;
    }

    public static int zzn(Object obj2, zzhl zzhlVar, byte[] bArr, int i, int i2, zzej zzejVar) throws IOException {
        int iZzj = i + 1;
        int i3 = bArr[i];
        if (i3 < 0) {
            iZzj = zzj(i3, bArr, iZzj, zzejVar);
            i3 = zzejVar.f45957zza;
        }
        int i5 = iZzj;
        if (i3 < 0 || i3 > i2 - i5) {
            throw new zzgc("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        int i6 = zzejVar.f45961zze + 1;
        zzejVar.f45961zze = i6;
        zzq(i6);
        int i21 = i5 + i3;
        zzhlVar.zzh(obj2, bArr, i5, i21, zzejVar);
        zzejVar.f45961zze--;
        zzejVar.f45959zzc = obj2;
        return i21;
    }

    public static int zzo(int i, byte[] bArr, int i2, int i3, zzej zzejVar) throws zzgc {
        if ((i >>> 3) == 0) {
            throw new zzgc("Protocol message contained an invalid tag (zero).");
        }
        int i5 = i & 7;
        if (i5 == 0) {
            return zzl(bArr, i2, zzejVar);
        }
        if (i5 == 1) {
            return i2 + 8;
        }
        if (i5 == 2) {
            return zzi(bArr, i2, zzejVar) + zzejVar.f45957zza;
        }
        if (i5 != 3) {
            if (i5 == 5) {
                return i2 + 4;
            }
            throw new zzgc("Protocol message contained an invalid tag (zero).");
        }
        int i6 = (i & (-8)) | 4;
        int i21 = 0;
        while (i2 < i3) {
            i2 = zzi(bArr, i2, zzejVar);
            i21 = zzejVar.f45957zza;
            if (i21 == i6) {
                break;
            }
            i2 = zzo(i21, bArr, i2, i3, zzejVar);
        }
        if (i2 > i3 || i21 != i6) {
            throw new zzgc("Failed to parse the message.");
        }
        return i2;
    }

    public static long zzp(byte[] bArr, int i) {
        return (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48) | ((((long) bArr[i + 7]) & 255) << 56);
    }

    private static void zzq(int i) throws zzgc {
        if (i >= f45963zzb) {
            throw new zzgc("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
    }
}
