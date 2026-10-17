package com.google.android.gms.internal.measurement;

import a0.d;
import com.google.android.gms.nearby.uwb.RangingPosition;
import java.io.IOException;
import java.util.Locale;

/* JADX INFO: loaded from: classes16.dex */
final class zzlh extends zzlk {

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private final byte[] f40415zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private final int f40416zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    private int f40417zze;

    public zzlh(byte[] bArr, int i, int i2) {
        super(null);
        int length = bArr.length;
        if (((length - i2) | i2) < 0) {
            Locale locale = Locale.US;
            throw new IllegalArgumentException(d.g(length, i2, "Array range is invalid. Buffer.length=", ", offset=0, length="));
        }
        this.f40415zzc = bArr;
        this.f40417zze = 0;
        this.f40416zzd = i2;
    }

    @Override // com.google.android.gms.internal.measurement.zzlk
    public final int zza() {
        return this.f40416zzd - this.f40417zze;
    }

    @Override // com.google.android.gms.internal.measurement.zzlk
    public final void zzb(byte b4) throws IOException {
        int i = this.f40417zze;
        try {
            int i2 = i + 1;
            try {
                this.f40415zzc[i] = b4;
                this.f40417zze = i2;
            } catch (IndexOutOfBoundsException e) {
                e = e;
                i = i2;
                throw new zzli(i, this.f40416zzd, 1, e);
            }
        } catch (IndexOutOfBoundsException e2) {
            e = e2;
        }
    }

    public final void zzc(byte[] bArr, int i, int i2) throws IOException {
        try {
            System.arraycopy(bArr, 0, this.f40415zzc, this.f40417zze, i2);
            this.f40417zze += i2;
        } catch (IndexOutOfBoundsException e) {
            throw new zzli(this.f40417zze, this.f40416zzd, i2, e);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzlk
    public final void zzd(int i, boolean z) throws IOException {
        zzt(i << 3);
        zzb(z ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.android.gms.internal.measurement.zzlk
    public final void zze(int i, zzld zzldVar) throws IOException {
        zzt((i << 3) | 2);
        zzt(zzldVar.zzd());
        zzldVar.zzg(this);
    }

    @Override // com.google.android.gms.internal.measurement.zzlk
    public final void zzf(int i, int i2) throws IOException {
        zzt((i << 3) | 5);
        zzg(i2);
    }

    @Override // com.google.android.gms.internal.measurement.zzlk
    public final void zzg(int i) throws IOException {
        int i2 = this.f40417zze;
        try {
            byte[] bArr = this.f40415zzc;
            bArr[i2] = (byte) i;
            bArr[i2 + 1] = (byte) (i >> 8);
            bArr[i2 + 2] = (byte) (i >> 16);
            bArr[i2 + 3] = (byte) (i >> 24);
            this.f40417zze = i2 + 4;
        } catch (IndexOutOfBoundsException e) {
            throw new zzli(i2, this.f40416zzd, 4, e);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzlk
    public final void zzh(int i, long j2) throws IOException {
        zzt((i << 3) | 1);
        zzi(j2);
    }

    @Override // com.google.android.gms.internal.measurement.zzlk
    public final void zzi(long j2) throws IOException {
        int i = this.f40417zze;
        try {
            byte[] bArr = this.f40415zzc;
            bArr[i] = (byte) j2;
            bArr[i + 1] = (byte) (j2 >> 8);
            bArr[i + 2] = (byte) (j2 >> 16);
            bArr[i + 3] = (byte) (j2 >> 24);
            bArr[i + 4] = (byte) (j2 >> 32);
            bArr[i + 5] = (byte) (j2 >> 40);
            bArr[i + 6] = (byte) (j2 >> 48);
            bArr[i + 7] = (byte) (j2 >> 56);
            this.f40417zze = i + 8;
        } catch (IndexOutOfBoundsException e) {
            throw new zzli(i, this.f40416zzd, 8, e);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzlk
    public final void zzj(int i, int i2) throws IOException {
        zzt(i << 3);
        zzk(i2);
    }

    @Override // com.google.android.gms.internal.measurement.zzlk
    public final void zzk(int i) throws IOException {
        if (i >= 0) {
            zzt(i);
        } else {
            zzv(i);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzlk
    public final void zzl(byte[] bArr, int i, int i2) throws IOException {
        zzc(bArr, 0, i2);
    }

    @Override // com.google.android.gms.internal.measurement.zzlk
    public final void zzm(int i, zznh zznhVar, zzns zznsVar) throws IOException {
        zzt((i << 3) | 2);
        zzt(((zzko) zznhVar).zzca(zznsVar));
        zznsVar.zzi(zznhVar, this.f40421zza);
    }

    @Override // com.google.android.gms.internal.measurement.zzlk
    public final void zzn(int i, zznh zznhVar) throws IOException {
        zzt(11);
        zzs(2, i);
        zzt(26);
        zzt(zznhVar.zzcf());
        zznhVar.zzcB(this);
        zzt(12);
    }

    @Override // com.google.android.gms.internal.measurement.zzlk
    public final void zzo(int i, zzld zzldVar) throws IOException {
        zzt(11);
        zzs(2, i);
        zze(3, zzldVar);
        zzt(12);
    }

    @Override // com.google.android.gms.internal.measurement.zzlk
    public final void zzp(int i, String str) throws IOException {
        zzt((i << 3) | 2);
        zzq(str);
    }

    public final void zzq(String str) throws IOException {
        int i = this.f40417zze;
        try {
            int iZzz = zzlk.zzz(str.length() * 3);
            int iZzz2 = zzlk.zzz(str.length());
            if (iZzz2 != iZzz) {
                zzt(zzoo.zzc(str));
                byte[] bArr = this.f40415zzc;
                int i2 = this.f40417zze;
                this.f40417zze = zzoo.zzb(str, bArr, i2, this.f40416zzd - i2);
                return;
            }
            int i3 = i + iZzz2;
            this.f40417zze = i3;
            int iZzb = zzoo.zzb(str, this.f40415zzc, i3, this.f40416zzd - i3);
            this.f40417zze = i;
            zzt((iZzb - i) - iZzz2);
            this.f40417zze = iZzb;
        } catch (zzon e) {
            this.f40417zze = i;
            zzC(str, e);
        } catch (IndexOutOfBoundsException e2) {
            throw new zzli(e2);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzlk
    public final void zzr(int i, int i2) throws IOException {
        zzt((i << 3) | i2);
    }

    @Override // com.google.android.gms.internal.measurement.zzlk
    public final void zzs(int i, int i2) throws IOException {
        zzt(i << 3);
        zzt(i2);
    }

    @Override // com.google.android.gms.internal.measurement.zzlk
    public final void zzt(int i) throws IOException {
        int i2;
        IndexOutOfBoundsException indexOutOfBoundsException;
        int i3 = this.f40417zze;
        while ((i & RangingPosition.RSSI_UNKNOWN) != 0) {
            try {
                i2 = i3 + 1;
                try {
                    this.f40415zzc[i3] = (byte) (i | 128);
                    i >>>= 7;
                    i3 = i2;
                } catch (IndexOutOfBoundsException e) {
                    indexOutOfBoundsException = e;
                    i3 = i2;
                    throw new zzli(i3, this.f40416zzd, 1, indexOutOfBoundsException);
                }
            } catch (IndexOutOfBoundsException e2) {
                indexOutOfBoundsException = e2;
                throw new zzli(i3, this.f40416zzd, 1, indexOutOfBoundsException);
            }
        }
        i2 = i3 + 1;
        this.f40415zzc[i3] = (byte) i;
        this.f40417zze = i2;
    }

    @Override // com.google.android.gms.internal.measurement.zzlk
    public final void zzu(int i, long j2) throws IOException {
        zzt(i << 3);
        zzv(j2);
    }

    @Override // com.google.android.gms.internal.measurement.zzlk
    public final void zzv(long j2) throws IOException {
        int i;
        IndexOutOfBoundsException indexOutOfBoundsException;
        int i2 = this.f40417zze;
        if (!zzlk.f40420zzd || this.f40416zzd - i2 < 10) {
            int i3 = i2;
            while ((j2 & (-128)) != 0) {
                try {
                    int i5 = i3 + 1;
                    try {
                        this.f40415zzc[i3] = (byte) (((int) j2) | 128);
                        j2 >>>= 7;
                        i3 = i5;
                    } catch (IndexOutOfBoundsException e) {
                        indexOutOfBoundsException = e;
                        i3 = i5;
                        throw new zzli(i3, this.f40416zzd, 1, indexOutOfBoundsException);
                    }
                } catch (IndexOutOfBoundsException e2) {
                    indexOutOfBoundsException = e2;
                }
            }
            i = i3 + 1;
            try {
                this.f40415zzc[i3] = (byte) j2;
            } catch (IndexOutOfBoundsException e4) {
                indexOutOfBoundsException = e4;
                i3 = i;
                throw new zzli(i3, this.f40416zzd, 1, indexOutOfBoundsException);
            }
        } else {
            while ((j2 & (-128)) != 0) {
                zzol.zzn(this.f40415zzc, i2, (byte) (((int) j2) | 128));
                j2 >>>= 7;
                i2++;
            }
            i = i2 + 1;
            zzol.zzn(this.f40415zzc, i2, (byte) j2);
        }
        this.f40417zze = i;
    }
}
