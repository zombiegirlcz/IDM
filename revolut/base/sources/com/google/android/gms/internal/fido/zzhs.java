package com.google.android.gms.internal.fido;

import a0.d;
import com.google.common.primitives.SignedBytes;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import net.sf.scuba.smartcards.ISO7816;
import net.sf.scuba.smartcards.ISOFileInfo;

/* JADX INFO: loaded from: classes16.dex */
public final class zzhs implements Closeable {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private final InputStream f39539zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private zzhr f39540zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private final byte[] f39541zzc = new byte[8];

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private final zzht f39542zzd = zzht.zza();

    public zzhs(InputStream inputStream) {
        this.f39539zza = inputStream;
    }

    private final long zzh() throws IOException {
        if (this.f39540zzb.zza() < 24) {
            long jZza = this.f39540zzb.zza();
            this.f39540zzb = null;
            return jZza;
        }
        if (this.f39540zzb.zza() == 24) {
            int i = this.f39539zza.read();
            if (i == -1) {
                throw new EOFException();
            }
            this.f39540zzb = null;
            return ((long) i) & 255;
        }
        if (this.f39540zzb.zza() == 25) {
            zzk(this.f39541zzc, 2);
            byte[] bArr = this.f39541zzc;
            return ((((long) bArr[0]) & 255) << 8) | (((long) bArr[1]) & 255);
        }
        if (this.f39540zzb.zza() == 26) {
            zzk(this.f39541zzc, 4);
            byte[] bArr2 = this.f39541zzc;
            long j2 = bArr2[0];
            long j3 = bArr2[1];
            return (((long) bArr2[3]) & 255) | ((j3 & 255) << 16) | ((j2 & 255) << 24) | ((bArr2[2] & 255) << 8);
        }
        if (this.f39540zzb.zza() != 27) {
            throw new IOException(d.g(this.f39540zzb.zza(), this.f39540zzb.zzc(), "invalid additional information ", " for major type "));
        }
        zzk(this.f39541zzc, 8);
        byte[] bArr3 = this.f39541zzc;
        long j5 = bArr3[0];
        long j16 = bArr3[1];
        long j22 = bArr3[2];
        long j42 = bArr3[3];
        return (((long) bArr3[7]) & 255) | ((j22 & 255) << 40) | ((j5 & 255) << 56) | ((j16 & 255) << 48) | ((j42 & 255) << 32) | ((bArr3[4] & 255) << 24) | ((bArr3[5] & 255) << 16) | ((bArr3[6] & 255) << 8);
    }

    private final void zzi() throws IOException {
        zzd();
        if (this.f39540zzb.zza() == 31) {
            throw new IllegalStateException(d.n("expected definite length but found ", this.f39540zzb.zza()));
        }
    }

    private final void zzj(byte b4) throws IOException {
        zzd();
        if (this.f39540zzb.zzb() != b4) {
            throw new IllegalStateException(d.g((b4 >> 5) & 7, this.f39540zzb.zzc(), "expected major type ", " but found "));
        }
    }

    private final void zzk(byte[] bArr, int i) throws IOException {
        int i2 = 0;
        while (i2 != i) {
            int i3 = this.f39539zza.read(bArr, i2, i - i2);
            if (i3 == -1) {
                throw new EOFException();
            }
            i2 += i3;
        }
        this.f39540zzb = null;
    }

    private final byte[] zzl() throws IOException {
        zzi();
        long jZzh = zzh();
        if (jZzh < 0 || jZzh > 2147483647L) {
            throw new UnsupportedOperationException("the maximum supported byte/text string length is 2147483647 bytes");
        }
        if (this.f39539zza.available() < jZzh) {
            throw new EOFException();
        }
        int i = (int) jZzh;
        byte[] bArr = new byte[i];
        zzk(bArr, i);
        return bArr;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f39539zza.close();
        this.f39542zzd.zzb();
    }

    public final long zza() throws IOException {
        zzj((byte) -128);
        zzi();
        long jZzh = zzh();
        if (jZzh < 0) {
            throw new UnsupportedOperationException("the maximum supported array length is 9223372036854775807");
        }
        if (jZzh > 0) {
            this.f39542zzd.zzg(jZzh);
        }
        return jZzh;
    }

    public final long zzb() throws IOException {
        boolean z;
        zzd();
        if (this.f39540zzb.zzb() == 0) {
            z = true;
        } else {
            if (this.f39540zzb.zzb() != 32) {
                throw new IllegalStateException(d.n("expected major type 0 or 1 but found ", this.f39540zzb.zzc()));
            }
            z = false;
        }
        long jZzh = zzh();
        if (jZzh >= 0) {
            return z ? jZzh : ~jZzh;
        }
        throw new UnsupportedOperationException("the maximum supported unsigned/negative integer is 9223372036854775807");
    }

    public final long zzc() throws IOException {
        zzj(ISOFileInfo.A0);
        zzi();
        long jZzh = zzh();
        if (jZzh < 0 || jZzh > 4611686018427387903L) {
            throw new UnsupportedOperationException("the maximum supported map length is 4611686018427387903L");
        }
        if (jZzh > 0) {
            this.f39542zzd.zzg(jZzh + jZzh);
        }
        return jZzh;
    }

    public final zzhr zzd() throws IOException {
        if (this.f39540zzb == null) {
            int i = this.f39539zza.read();
            if (i == -1) {
                this.f39542zzd.zzb();
                return null;
            }
            zzhr zzhrVar = new zzhr(i);
            this.f39540zzb = zzhrVar;
            byte bZzb = zzhrVar.zzb();
            if (bZzb == -128 || bZzb == -96 || bZzb == -64) {
                this.f39542zzd.zzd();
                this.f39542zzd.zzf();
            } else {
                if (bZzb != -32) {
                    if (bZzb != 0 && bZzb != 32) {
                        if (bZzb == 64) {
                            this.f39542zzd.zze(-1L);
                        } else {
                            if (bZzb != 96) {
                                throw new IllegalStateException(d.n("invalid major type: ", this.f39540zzb.zzc()));
                            }
                            this.f39542zzd.zze(-2L);
                        }
                    }
                    this.f39542zzd.zzf();
                } else if (this.f39540zzb.zza() == 31) {
                    this.f39542zzd.zzc();
                }
                this.f39542zzd.zzd();
                this.f39542zzd.zzf();
            }
        }
        return this.f39540zzb;
    }

    public final String zze() throws IOException {
        zzj((byte) 96);
        return new String(zzl(), StandardCharsets.UTF_8);
    }

    public final boolean zzf() throws IOException {
        zzj(ISO7816.INS_CREATE_FILE);
        if (this.f39540zzb.zza() > 24) {
            throw new IllegalStateException("expected simple value");
        }
        int iZzh = (int) zzh();
        if (iZzh == 20) {
            return false;
        }
        if (iZzh == 21) {
            return true;
        }
        throw new IllegalStateException("expected FALSE or TRUE");
    }

    public final byte[] zzg() throws IOException {
        zzj(SignedBytes.MAX_POWER_OF_TWO);
        return zzl();
    }
}
