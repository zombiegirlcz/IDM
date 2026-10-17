package com.google.android.gms.internal.play_billing;

import a0.d;
import com.google.android.gms.nearby.uwb.RangingPosition;
import java.io.IOException;
import java.util.Locale;

/* JADX INFO: loaded from: classes16.dex */
final class zzez extends zzfc {

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private final byte[] f45981zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private final int f45982zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    private int f45983zze;

    public zzez(byte[] bArr, int i, int i2) {
        super(null);
        int length = bArr.length;
        if (((length - i2) | i2) < 0) {
            Locale locale = Locale.US;
            throw new IllegalArgumentException(d.g(length, i2, "Array range is invalid. Buffer.length=", ", offset=0, length="));
        }
        this.f45981zzc = bArr;
        this.f45983zze = 0;
        this.f45982zzd = i2;
    }

    @Override // com.google.android.gms.internal.play_billing.zzfc
    public final int zza() {
        return this.f45982zzd - this.f45983zze;
    }

    @Override // com.google.android.gms.internal.play_billing.zzfc
    public final void zzb(byte b4) throws IOException {
        int i = this.f45983zze;
        try {
            int i2 = i + 1;
            try {
                this.f45981zzc[i] = b4;
                this.f45983zze = i2;
            } catch (IndexOutOfBoundsException e) {
                e = e;
                i = i2;
                throw new zzfa(i, this.f45982zzd, 1, e);
            }
        } catch (IndexOutOfBoundsException e2) {
            e = e2;
        }
    }

    public final void zzc(byte[] bArr, int i, int i2) throws IOException {
        try {
            System.arraycopy(bArr, i, this.f45981zzc, this.f45983zze, i2);
            this.f45983zze += i2;
        } catch (IndexOutOfBoundsException e) {
            throw new zzfa(this.f45983zze, this.f45982zzd, i2, e);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzfc
    public final void zzd(int i, boolean z) throws IOException {
        zzu(i << 3);
        zzb(z ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.android.gms.internal.play_billing.zzfc
    public final void zze(byte[] bArr, int i, int i2) throws IOException {
        zzu(i2);
        zzc(bArr, 0, i2);
    }

    @Override // com.google.android.gms.internal.play_billing.zzfc
    public final void zzf(int i, zzev zzevVar) throws IOException {
        zzu((i << 3) | 2);
        zzg(zzevVar);
    }

    @Override // com.google.android.gms.internal.play_billing.zzfc
    public final void zzg(zzev zzevVar) throws IOException {
        zzu(zzevVar.zze());
        zzevVar.zzg(this);
    }

    @Override // com.google.android.gms.internal.play_billing.zzfc
    public final void zzh(int i, int i2) throws IOException {
        zzu((i << 3) | 5);
        zzi(i2);
    }

    @Override // com.google.android.gms.internal.play_billing.zzfc
    public final void zzi(int i) throws IOException {
        int i2 = this.f45983zze;
        try {
            byte[] bArr = this.f45981zzc;
            bArr[i2] = (byte) i;
            bArr[i2 + 1] = (byte) (i >> 8);
            bArr[i2 + 2] = (byte) (i >> 16);
            bArr[i2 + 3] = (byte) (i >> 24);
            this.f45983zze = i2 + 4;
        } catch (IndexOutOfBoundsException e) {
            throw new zzfa(i2, this.f45982zzd, 4, e);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzfc
    public final void zzj(int i, long j2) throws IOException {
        zzu((i << 3) | 1);
        zzk(j2);
    }

    @Override // com.google.android.gms.internal.play_billing.zzfc
    public final void zzk(long j2) throws IOException {
        int i = this.f45983zze;
        try {
            byte[] bArr = this.f45981zzc;
            bArr[i] = (byte) j2;
            bArr[i + 1] = (byte) (j2 >> 8);
            bArr[i + 2] = (byte) (j2 >> 16);
            bArr[i + 3] = (byte) (j2 >> 24);
            bArr[i + 4] = (byte) (j2 >> 32);
            bArr[i + 5] = (byte) (j2 >> 40);
            bArr[i + 6] = (byte) (j2 >> 48);
            bArr[i + 7] = (byte) (j2 >> 56);
            this.f45983zze = i + 8;
        } catch (IndexOutOfBoundsException e) {
            throw new zzfa(i, this.f45982zzd, 8, e);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzfc
    public final void zzl(int i, int i2) throws IOException {
        zzu(i << 3);
        zzm(i2);
    }

    @Override // com.google.android.gms.internal.play_billing.zzfc
    public final void zzm(int i) throws IOException {
        if (i >= 0) {
            zzu(i);
        } else {
            zzw(i);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzfc
    public final void zzn(zzhb zzhbVar) throws IOException {
        zzu(zzhbVar.zzn());
        zzhbVar.zzD(this);
    }

    @Override // com.google.android.gms.internal.play_billing.zzfc
    public final void zzo(int i, zzhb zzhbVar) throws IOException {
        zzu(11);
        zzt(2, i);
        zzu(26);
        zzn(zzhbVar);
        zzu(12);
    }

    @Override // com.google.android.gms.internal.play_billing.zzfc
    public final void zzp(int i, zzev zzevVar) throws IOException {
        zzu(11);
        zzt(2, i);
        zzf(3, zzevVar);
        zzu(12);
    }

    @Override // com.google.android.gms.internal.play_billing.zzfc
    public final void zzq(int i, String str) throws IOException {
        zzu((i << 3) | 2);
        zzr(str);
    }

    @Override // com.google.android.gms.internal.play_billing.zzfc
    public final void zzr(String str) throws IOException {
        int i = this.f45983zze;
        try {
            int iZzy = zzfc.zzy(str.length() * 3);
            int iZzy2 = zzfc.zzy(str.length());
            if (iZzy2 != iZzy) {
                zzu(zzin.zzb(str));
                byte[] bArr = this.f45981zzc;
                int i2 = this.f45983zze;
                this.f45983zze = zzin.zza(str, bArr, i2, this.f45982zzd - i2);
                return;
            }
            int i3 = i + iZzy2;
            this.f45983zze = i3;
            int iZza = zzin.zza(str, this.f45981zzc, i3, this.f45982zzd - i3);
            this.f45983zze = i;
            zzu((iZza - i) - iZzy2);
            this.f45983zze = iZza;
        } catch (IndexOutOfBoundsException e) {
            throw new zzfa(e);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzfc
    public final void zzs(int i, int i2) throws IOException {
        zzu((i << 3) | i2);
    }

    @Override // com.google.android.gms.internal.play_billing.zzfc
    public final void zzt(int i, int i2) throws IOException {
        zzu(i << 3);
        zzu(i2);
    }

    @Override // com.google.android.gms.internal.play_billing.zzfc
    public final void zzu(int i) throws IOException {
        int i2;
        IndexOutOfBoundsException indexOutOfBoundsException;
        int i3 = this.f45983zze;
        while ((i & RangingPosition.RSSI_UNKNOWN) != 0) {
            try {
                i2 = i3 + 1;
                try {
                    this.f45981zzc[i3] = (byte) (i | 128);
                    i >>>= 7;
                    i3 = i2;
                } catch (IndexOutOfBoundsException e) {
                    indexOutOfBoundsException = e;
                    i3 = i2;
                    throw new zzfa(i3, this.f45982zzd, 1, indexOutOfBoundsException);
                }
            } catch (IndexOutOfBoundsException e2) {
                indexOutOfBoundsException = e2;
                throw new zzfa(i3, this.f45982zzd, 1, indexOutOfBoundsException);
            }
        }
        i2 = i3 + 1;
        this.f45981zzc[i3] = (byte) i;
        this.f45983zze = i2;
    }

    @Override // com.google.android.gms.internal.play_billing.zzfc
    public final void zzv(int i, long j2) throws IOException {
        zzu(i << 3);
        zzw(j2);
    }

    @Override // com.google.android.gms.internal.play_billing.zzfc
    public final void zzw(long j2) throws IOException {
        int i;
        IndexOutOfBoundsException indexOutOfBoundsException;
        int i2 = this.f45983zze;
        if (!zzfc.f45985zzc || this.f45982zzd - i2 < 10) {
            int i3 = i2;
            while ((j2 & (-128)) != 0) {
                try {
                    int i5 = i3 + 1;
                    try {
                        this.f45981zzc[i3] = (byte) (((int) j2) | 128);
                        j2 >>>= 7;
                        i3 = i5;
                    } catch (IndexOutOfBoundsException e) {
                        indexOutOfBoundsException = e;
                        i3 = i5;
                        throw new zzfa(i3, this.f45982zzd, 1, indexOutOfBoundsException);
                    }
                } catch (IndexOutOfBoundsException e2) {
                    indexOutOfBoundsException = e2;
                }
            }
            i = i3 + 1;
            try {
                this.f45981zzc[i3] = (byte) j2;
            } catch (IndexOutOfBoundsException e4) {
                indexOutOfBoundsException = e4;
                i3 = i;
                throw new zzfa(i3, this.f45982zzd, 1, indexOutOfBoundsException);
            }
        } else {
            while ((j2 & (-128)) != 0) {
                zzii.zzn(this.f45981zzc, i2, (byte) (((int) j2) | 128));
                j2 >>>= 7;
                i2++;
            }
            i = i2 + 1;
            zzii.zzn(this.f45981zzc, i2, (byte) j2);
        }
        this.f45983zze = i;
    }
}
