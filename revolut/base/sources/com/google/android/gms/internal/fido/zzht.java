package com.google.android.gms.internal.fido;

import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Deque;
import p.a;

/* JADX INFO: loaded from: classes16.dex */
final class zzht {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private final Deque f39543zza = new ArrayDeque(16);

    private zzht(boolean z) {
    }

    public static zzht zza() {
        return new zzht(false);
    }

    private final long zzh() {
        if (this.f39543zza.isEmpty()) {
            return 0L;
        }
        return ((Long) this.f39543zza.peek()).longValue();
    }

    private final void zzi(long j2) {
        this.f39543zza.pop();
        this.f39543zza.push(Long.valueOf(j2));
    }

    public final void zzb() throws IOException {
        if (this.f39543zza.isEmpty()) {
            return;
        }
        throw new IOException("data item not completed, stackSize: " + this.f39543zza.size() + " scope: " + zzh());
    }

    public final void zzc() throws IOException {
        long jZzh = zzh();
        if (jZzh >= 0) {
            throw new IOException(a.m(jZzh, "expected indefinite length scope but found "));
        }
        if (jZzh == -5) {
            throw new IOException("expected a value for dangling key in indefinite-length map");
        }
        this.f39543zza.pop();
    }

    public final void zzd() throws IOException {
        long jZzh = zzh();
        if (jZzh != -1) {
            if (jZzh != -2) {
                return;
            } else {
                jZzh = -2;
            }
        }
        throw new IOException(a.m(jZzh, "expected non-string scope but found "));
    }

    public final void zze(long j2) throws IOException {
        long jZzh = zzh();
        if (jZzh != j2) {
            if (jZzh != -1) {
                if (jZzh != -2) {
                    return;
                } else {
                    jZzh = -2;
                }
            }
            StringBuilder sbV = com.google.android.gms.internal.mlkit_vision_face.a.v(j2, "expected non-string scope or scope ", " but found ");
            sbV.append(jZzh);
            throw new IOException(sbV.toString());
        }
    }

    public final void zzf() {
        long jZzh = zzh();
        if (jZzh == 1) {
            this.f39543zza.pop();
            return;
        }
        if (jZzh > 1) {
            zzi(jZzh - 1);
        } else if (jZzh == -4) {
            zzi(-5L);
        } else if (jZzh == -5) {
            zzi(-4L);
        }
    }

    public final void zzg(long j2) {
        this.f39543zza.push(Long.valueOf(j2));
    }
}
